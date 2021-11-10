package vectors;

public class _2DPolarInheritance extends Vector2D{
    public _2DPolarInheritance(double newX, double newY) {
        super(newX, newY);
    }

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
