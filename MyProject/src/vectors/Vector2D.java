package vectors;

import static java.lang.Math.*;

public class Vector2D implements IVector{
    private double x;
    private double y;

    public Vector2D(double newX, double newY){
        this.x=newX;
        this.y=newY;
    }
    @Override
    public double[] getComponents(){
        return new double[]{this.x, this.y};
    }
    @Override
    public double abs(){
        double mod=sqrt(pow(x,2)+pow(y,2));
        return mod;
    }
    @Override
    public double cdot(IVector vector){
        double [] tab = vector.getComponents();
        return this.x*tab[0]+this.y*tab[1];
    }
}
