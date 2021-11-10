package vectors;

public class Vector3DInheritance extends Vector2D {
    private double z;

    public Vector3DInheritance(double newX, double newY, double newZ) {
        super(newX, newY);
        this.z=newZ;
    }

    public double abs(){
        return Math.sqrt(getComponents()[0]*getComponents()[0]+getComponents()[1]*getComponents()[1]+this.z*getComponents()[2]);
    }
    public double cdot(IVector vector){
        return super.cdot(vector)+this.z*getComponents()[2];
    }
    public double[] getComponents(){
        double[] tab = super.getComponents();
        return new double[] {tab[0],tab[1],this.z};
    }
    public Vector3DInheritance cross (IVector vector){
        double[] tab = getComponents();
        double x1= vector.getComponents()[2]*tab[1]-vector.getComponents()[1]*tab[2];
        double x2= vector.getComponents()[2]*tab[0]-vector.getComponents()[0]*tab[2];
        double x3= vector.getComponents()[1]*tab[0]-vector.getComponents()[0]*tab[1];

        return new Vector3DInheritance(x1,x2,x3);
    }
    public IVector getSrcV(){
        IVector newVector = new Vector2D(getComponents()[0],getComponents()[1]);
        return newVector;
    }
}
