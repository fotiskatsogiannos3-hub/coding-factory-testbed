package gr.aueb.cf.cf9.ch12;

/**
 * Demonstrates the usage of {@link PointXYZ} by creating a point in 3D space
 * and printing its distances along the XY, YZ, XZ, and XYZ.
 */
public class Main {
    public static void main(String[] args) {
        PointXYZ point= new PointXYZ(3, 4, 12);
        double distanceXY;
        double distanceYZ;
        double distanceXZ;
        double distanceXYZ;

        distanceXY = point.getXYDistance();
        distanceYZ = point.getYZDistance();
        distanceXZ = point.getXZDistance();
        distanceXYZ = point.getXYZDistance();

        System.out.println("XY Distance: " + distanceXY);
        System.out.println("YZ Distance: " + distanceYZ);
        System.out.println("XZ Distance: " + distanceXZ);
        System.out.println("XYZ Distance: " + distanceXYZ);
    }
}
