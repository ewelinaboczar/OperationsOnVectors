package vectors;

public class Polar2DAdapter implements IPolar2D,IVector{
    private Vector2D srcVector;

    public Polar2DAdapter(Vector2D vector){
        this.srcVector=vector;
    }

    @Override
    public double abs(){
        return this.srcVector.abs();
    }
    @Override
    public double cdot(IVector vector){
        return this.srcVector.cdot(vector);
    }
    @Override
    public double[] getComponents(){
        return this.srcVector.getComponents();
    }
    @Override
    public double getAngle(){
        double[] tab = this.getComponents();

        double x = tab[0];
        double y = tab[1];
        double v = Math.toDegrees(Math.atan(y / x));
        double angle = 0.0;

        if(x > 0 && y >= 0 ){
            angle = v;
        }else if(x > 0 && y < 0){
            angle = v + 360;
        }else if(x == 0 && y>0){
            angle = 90;
        }else if(x<0){
            angle = v + 180;
        }else{
            angle = 270;
        }
        return angle;
    }
}
