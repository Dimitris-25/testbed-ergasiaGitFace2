package gr.aueb.cf.ch13;

import gr.aueb.cf.ch13.model.PointXYZ;

import java.math.*;

public class Main {
    public static void main(String[] args) {
        // Δημιουργία ενός σημείου PointXYZ με τον υπερφορτωμένο Constructor
        PointXYZ point = new PointXYZ(10.0, 8.0, 7.0);

        // Εκτύπωση του σημείου χρησιμοποιώντας τη μέθοδο convertToString
        System.out.println("Point: " + point.convertToString());

        // Κλήση και εκτύπωση των business μεθόδων
        System.out.println("XY Distance: " + point.getXYDistance());
        System.out.println("YZ Distance: " + point.getYZDistance());
        System.out.println("XZ Distance: " + point.getXZDistance());
        System.out.println("XYZ Distance: " + point.getXYZDistance());
    }
}
