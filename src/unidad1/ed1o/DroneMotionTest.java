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


public class DroneMotionTest {
    public static void main(String ... args) {
        DroneMotion dm = new DroneMotion(1.0, 100, 0);
        
        dm.compute(0);
        System.out.println("y(0): " + dm.getY());
        System.out.println("dy(0): " + dm.getDy());
        
        dm.compute(1);
        System.out.println("y(1): " + dm.getY());
        System.out.println("dy(1): " + dm.getDy());
        
        dm.compute(2);
        System.out.println("y(2): " + dm.getY());
        System.out.println("dy(2): " + dm.getDy());
        
        dm.compute(4.5);
        System.out.println("y(?): " + dm.getY());
        System.out.println("dy(?): " + dm.getDy());
    }
}
 