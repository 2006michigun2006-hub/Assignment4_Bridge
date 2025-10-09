public class Heart implements Organ {
    private final String color;
    private final String name;
    private final int blood;
    private final int probeg;
    private final OrganImplementation implementation;
    public Heart(String color, String name, int blood, int probeg, OrganImplementation implementation) {
        this.color = color;
        this.name = name;
        this.blood = blood;
        this.probeg = probeg;
        this.implementation = implementation;
    }
    public void operate() {
        System.out.println("If you didn't know, \"" + name + "\" is the bridge.");
        implementation.performFunction();
    }
    public void votHeart() {
        System.out.println("This heart despite of everything is: " + name + ", coloured with " + color + ", has " + blood + " liters of blood and " + probeg + " hours of work overall.");
    }
}