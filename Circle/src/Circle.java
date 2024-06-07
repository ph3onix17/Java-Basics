public class Circle {
    private String color = "Red";
    private double radius = 1.0;

    public Circle() {
        this.color = "Red";
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "Red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        System.out.println("check 1");
    }
}

// b
class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double radius) {
        super(radius);
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    double getHeight() {
        return height;
    }

    void setHeight(double height) {
        this.height = height;
    }

    double getVolume() {
        return getArea() * height;
    }

    public void display() {
        System.out.println("Height: " + getHeight());
        System.out.println("Color: " + getColor());
        System.out.println("Volume: " + getVolume());
        System.out.println("Radius: " + getRadius());
    }
}
//c
class Cone extends Circle {
    private double height = 1.0;

    public Cone() {
        super();
        this.height = 1.0;
    }

    public Cone(double radius) {
        super(radius);
        this.height = 1.0;
    }

    public Cone(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cone(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return (1.0 / 3.0) * getArea() * height;
    }

    public void display() {
        System.out.println("Radius: " + getRadius());
        System.out.println("Height: " + getHeight());
        System.out.println("Color: " + getColor());
        System.out.println("Volume: " + getVolume());
    }
}

//d
class myCircle{
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder(2.0, 10.0, "Blue");

        Cone cone1 = new Cone();
        Cone cone2 = new Cone(7.0, 15.0, "Red");

        System.out.println("Default Cylinder:");
        cylinder1.display();

        System.out.println("\nCustom Cylinder:");
        cylinder2.display();

        System.out.println("\nDefault Cone:");
        cone1.display();

        System.out.println("\nCustom Cone:");
        cone2.display();

        cone2.setColor("Green");
        cone2.setRadius(20.0);

        System.out.println("\nCustom Cone after changes:");
        cone2.display();
    }
}
