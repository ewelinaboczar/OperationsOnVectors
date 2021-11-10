package vectors;

public class Main {
    public static void main(String[] args){
        Vector2D v1 = new Vector2D(2,4);
        Vector2D v2 = new Vector2D(6,3);
        Vector2D v3 = new Vector2D(2,8);

        Vector3DInheritance v13d = new Vector3DInheritance(v1.getComponents()[0],v1.getComponents()[1],0);
        Vector3DInheritance v23d = new Vector3DInheritance(v2.getComponents()[0],v2.getComponents()[1],0);
        Vector3DInheritance v33d = new Vector3DInheritance(v3.getComponents()[0],v3.getComponents()[1],0);

        Polar2DAdapter a1 = new Polar2DAdapter(v1);
        Polar2DAdapter a2 =new Polar2DAdapter(v2);
        Polar2DAdapter a3 =new Polar2DAdapter(v3);

        System.out.println("Przy użyciu adaptera 2D:");
        System.out.println("Współrzędne biegunowe (r,fi):");
        System.out.println("\nv1 ( "+a1.abs()+" , "+a1.getAngle()+" )");
        System.out.println("v2 ( "+a2.abs()+" , "+a2.getAngle()+" )");
        System.out.println("v3 ( "+a3.abs()+" , "+a3.getAngle()+" )");

        System.out.println("\nWspółrzędne kartezjańskie 2D:");
        System.out.println("\nv1 ( "+a1.getComponents()[0]+","+a1.getComponents()[1]+" )");
        System.out.println("v2 ( "+a2.getComponents()[0]+","+a2.getComponents()[1]+" )");
        System.out.println("v3 ( "+a3.getComponents()[0]+","+a3.getComponents()[1]+" )");

        System.out.println("\nIloczyn skalarny:");
        System.out.println("\nv1 * v2= "+a1.cdot(v2));
        System.out.println("v2 * v3= "+a2.cdot(v3));
        System.out.println("v3 * v1= "+a3.cdot(v1));

        System.out.println("\nWspółrzędne kartezjańskie 3D:");
        System.out.println("\nv1 ( "+v13d.getComponents()[0]+","+v13d.getComponents()[1]+","+v13d.getComponents()[2] +" )");
        System.out.println("v2 ( "+v23d.getComponents()[0]+","+v23d.getComponents()[1]+","+v23d.getComponents()[2] +" )");
        System.out.println("v3 ( "+v33d.getComponents()[0]+","+v33d.getComponents()[1]+","+v33d.getComponents()[2] +" )");

        System.out.println("\nIloczyn wektorowy:");
        System.out.println("\nv1 x v2= [ " + v13d.cross(v23d).getComponents()[0]+" , "+v13d.cross(v23d).getComponents()[1]+" , "+v13d.cross(v23d).getComponents()[2]+" ]");
        System.out.println("v2 x v1= [ "+v23d.cross(v13d).getComponents()[0]+" , "+v23d.cross(v13d).getComponents()[1]+" , "+v23d.cross(v13d).getComponents()[2]+" ]");
        System.out.println("v2 x v3= [ "+v23d.cross(v33d).getComponents()[0]+" , "+v23d.cross(v33d).getComponents()[1]+" , "+v23d.cross(v33d).getComponents()[2]+" ]");
        System.out.println("v3 x v2= [ "+v33d.cross(v23d).getComponents()[0]+" , "+v33d.cross(v23d).getComponents()[1]+" , "+v33d.cross(v23d).getComponents()[2]+" ]");
        System.out.println("v1 x v3= [ "+v13d.cross(v33d).getComponents()[0]+" , "+v13d.cross(v33d).getComponents()[1]+" , "+v13d.cross(v33d).getComponents()[2]+" ]");
        System.out.println("v3 x v1= [ "+v33d.cross(v13d).getComponents()[0]+" , "+v33d.cross(v13d).getComponents()[1]+" , "+v33d.cross(v13d).getComponents()[2]+" ]");
    }
}
