package gr.aueb.cf.ch13.model;

public class PointXYZ {
    private double x;
    private double y;
    private double z;

    public PointXYZ() {

    }

    // Constructor
    public PointXYZ(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    // Method to get distance in XY plane
    public double getXYDistance() {
        return Math.sqrt(x * x + y * y);
    }

    // Method to get distance in YZ plane
    public double getYZDistance() {
        return Math.sqrt(y * y + z * z);
    }

    // Method to get distance in XZ plane
    public double getXZDistance() {
        return Math.sqrt(x * x + z * z);
    }

    // Method to get distance in XYZ space
    public double getXYZDistance() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    // Method to convert point to string

    public String convertToString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }



}
