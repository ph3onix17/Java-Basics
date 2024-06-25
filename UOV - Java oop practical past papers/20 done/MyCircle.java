public class MyCircle {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder(2.0, "Blue", 10.0);
        
        Cone cone1 = new Cone();
        Cone cone2 = new Cone(7.0, "Red", 15.0);
        
        c1.display();
        c2.display();
		
		System.out.println("\n");
		
		cone1.display();
		cone2.display();
		System.out.println("\n");
		
		cone2.setColor("Green");
		cone2.setRadius(20.0);
		
		cone2.display();
        
       
    }
}

class Circle {
    private String color;
    private double radius;

    public Circle() {
        this.color = "Red";
        this.radius = 1.0;
    }

    // Constructor 
    public Circle(double radius) {
        this.radius = radius;
        this.color = "Red"; 
    }

    // Constructor 
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    //Getter
    public double getRadius() {
        return radius;
    }

    //setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Getter
    public String getColor() {
        return color;
    }

    //Setter
    public void setColor(String color) {
        this.color = color;
    }

    //area
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    public static void main(String[] args){}
}


class Cylinder extends Circle {
    private double height;

    // non args
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

    public Cylinder(double radius, String color, double height) {
        super(radius, color);  
        this.height = height;
    }

    // Getter 
    public double getHeight() {
        return height;
    }

    // Setter 
    public void setHeight(double height) {
        this.height = height;
    }

    //  volume cylinder
    public double getVolume() {
        return Math.PI * Math.pow(getRadius(), 2) * height;
    }

    // cylinder
    public void display() {
        System.out.println("Cylinder Details:");
        System.out.println("Radius: " + getRadius());
        System.out.println("Height: " + height);
        System.out.println("Color: " + getColor());
        System.out.println("Volume: " + getVolume());
    }
}


class Cone extends Circle {
    private double height;

    // non args constructor
    public Cone() {
        super();  
        this.height = 1.0;
    }

    // Constructor 
    public Cone(double radius) {
        super(radius); 
        this.height = 1.0;
    }

    // Constructor 
    public Cone(double radius, double height) {
        super(radius);  
        this.height = height;
    }

    // Constructor 
    public Cone(double radius, String color, double height) {
        super(radius, color);  
    }

    // Getter 
    public double getHeight() {
        return height;
    }

    // Setter 
    public void setHeight(double height) {
        this.height = height;
    }

    // cone volume
    public double getVolume() {
        return (Math.PI * Math.pow(getRadius(), 2) * height) / 3;
    }

    // Cone details
    public void display() {
        System.out.println("Cone Details:");
        System.out.println("Radius: " + getRadius());
        System.out.println("Height: " + height);
        System.out.println("Color: " + getColor());
        System.out.println("Volume: " + getVolume());
    }
}


