class Circle {
  private double radius;
  private String color;

  Circle() {
    radius = 1.0;
    color = "red";
  }

  Circle(double radius) {
    this.radius = radius;
    color = "red";
  }

  Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  public double getRadius() {
    return radius;
  }

  public double getArea() {
    return Math.PI * radius * radius;
  }

  public String getColor() {
    return color;
  }
}

class Cylinder extends Circle {
  private double height;
  

  Cylinder(double radius, String color, double height) {
    super(radius,color);
    this.height = height;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getVolume() {
    return getArea() * height;
  }
}

class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Circle 1: ");
        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Color: " + c1.getColor());
        System.out.println("Area: " + c1.getArea());
        System.out.println();
        Cylinder cylinder = new Cylinder(2.0, "blue", 5.0);
        System.out.println("Cylinder 1: ");
        System.out.println("Radius: " + cylinder.getRadius());
        System.out.println("Color: " + cylinder.getColor());
        System.out.println("Height: " + cylinder.getHeight());
        System.out.println("Area: " + cylinder.getArea());
        System.out.println("Volume: " + cylinder.getVolume());
}
}
