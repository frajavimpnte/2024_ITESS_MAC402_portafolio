/*
 * ITES-TICS
 * Matematicas alicadas a comunicaciones
 * TI402 - 2024
 * Modelo de drone 1d TEST
 * FJMP & you
 * frajavimopu@gmail.com
 * 04/marzo/2024
 */

package unidad1.ed1o;

public class DroneMotion {
    private double m;
    private double poy;
    private double voy;
    private double fem;
    private double y;
    private double dy;
    private final double G = 9.81;

    public DroneMotion(double m, double poy, double voy) {
        this.m = m;
        this.poy = poy;
        this.voy = voy;
    }
    public void setFem(double fem) {
        this.fem = fem;
    }
    public void compute(double t) {
        // y = (Fem - mg) t^2 /(2m)+ voy*t + poy
        // y’ = (Fem - mg) t /m + voy
        y = (fem - m * G) * t * t / (2 * m) + voy * t + poy;
        dy = (fem - m * G) * t / m + voy;
    }

    public double getY() {
        return y;
    }

    public double getDy() {
        return dy;
    }
    
}
