package Lab2c;
/*  Comp3111-Lab2/Lab2c/Chargeable.java
    Add interface to the class
 */
interface Chargeable {
    public void charge();
}
public class Charger {
    public void charge(Chargeable c) {
        c.charge();
    }
}