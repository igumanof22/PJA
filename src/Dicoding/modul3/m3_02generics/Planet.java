package dicoding.modul3.m3_02generics;

/**
 *
 * @author GUMANOF
 */
public class Planet {
    private String name;
    private double mass;
    
    public Planet(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }
    public void print() {
        System.out.println("Planet " + name + ", mass: " + mass);
    }
}
