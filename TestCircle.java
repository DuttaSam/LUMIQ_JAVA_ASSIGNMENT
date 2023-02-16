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

class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Circle 1: ");
        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Color: " + c1.getColor());
        System.out.println("Area: " + c1.getArea());
        System.out.println();
    
        Circle c2 = new Circle(2.0);
        System.out.println("Circle 2: ");
        System.out.println("Radius: " + c2.getRadius());
        System.out.println("Color: " + c2.getColor());
        System.out.println("Area: " + c2.getArea());
        System.out.println();
    
        Circle c3 = new Circle(3.0, "blue");
        System.out.println("Circle 3: ");
        System.out.println("Radius: " + c3.getRadius());
        System.out.println("Color: " + c3.getColor());
        System.out.println("Area: " + c3.getArea());
    }
}
