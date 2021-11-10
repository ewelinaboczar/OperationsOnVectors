package vectors;

public class Vector3DDecorator implements IVector{
    private IVector srcVector;
    private double z;

    public Vector3DDecorator(IVector vector,double newZ){
        this.srcVector=vector;
        this.z=newZ;
    }

    @Override
    public double abs() {
        double a=getComponents()[0];
        double b=getComponents()[1];
        double c=getComponents()[2];
        return Math.sqrt(a*a+b*b+c*c);
    }

    @Override
    public double cdot(IVector vector) {
        double a=getComponents()[0];
        double b=getComponents()[1];
        double c=getComponents()[2];
        double resoult=a*a+b*b+c*c;
        return resoult;
    }

    @Override
    public double[] getComponents() {
        double[] tab={srcVector.getComponents()[0],srcVector.getComponents()[1],this.z};
        return tab;
    }

    public Vector3DDecorator cross(IVector vector){
        double[] tab = getComponents();
        double x1= vector.getComponents()[1]*tab[2]-vector.getComponents()[2]*tab[1];
        double x2= vector.getComponents()[0]*tab[2]-vector.getComponents()[2]*tab[0];
        double x3= vector.getComponents()[0]*tab[1]-vector.getComponents()[1]*tab[0];
        return new Vector3DDecorator(new Vector2D(x1,x2),x3);
    }

    public IVector getSrcV(){
        return srcVector;
    }
}
