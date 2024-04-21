/**Name : Alakananda Chakrabartty
 * Student ID : 220206
 * This program demonstrates the Open/Closed Principle (OCP) by creating a system
 * where new shapes can be added without modifying existing code.
 */

 import java.util.ArrayList;
 import java.util.List;
 
 // Shape interface representing different shapes
 interface Shape {
     /**
      * Calculates the area of the shape.
      * @return The area of the shape.
      */
     double calculateArea();
 }
 
 // Circle class implementing the Shape interface
 class Circle implements Shape {
     private double radius;
 
     /**
      * Constructor to initialize Circle with radius.
      * @param radius The radius of the circle.
      */
     public Circle(double radius) {
         this.radius = radius;
     }
 
     /**
      * Calculates the area of the circle.
      * @return The area of the circle.
      */
     @Override
     public double calculateArea() {
         return Math.PI * radius * radius;
     }
 }
 
 // Rectangle class implementing the Shape interface
 class Rectangle implements Shape {
     private double length;
     private double width;
 
     /**
      * Constructor to initialize Rectangle with length and width.
      * @param length The length of the rectangle.
      * @param width The width of the rectangle.
      */
     public Rectangle(double length, double width) {
         this.length = length;
         this.width = width;
     }
 
     /**
      * Calculates the area of the rectangle.
      * @return The area of the rectangle.
      */
     @Override
     public double calculateArea() {
         return length * width;
     }
 }
 
 // AreaCalculator class responsible for calculating total area of shapes
 class AreaCalculator {
     private List<Shape> shapes;
 
     /**
      * Constructor to initialize AreaCalculator with an empty list of shapes.
      */
     public AreaCalculator() {
         shapes = new ArrayList<>();
     }
 
     /**
      * Adds a shape to the list of shapes.
      * @param shape The shape to be added.
      */
     public void addShape(Shape shape) {
         shapes.add(shape);
     }
 
     /**
      * Calculates the total area of all shapes.
      * @return The total area of all shapes.
      */
     public double calculateTotalArea() {
         double totalArea = 0;
         for (Shape shape : shapes) {
             totalArea += shape.calculateArea();
         }
         return totalArea;
     }
 }
 
 // Main class
 public class OCPDemo {
     public static void main(String[] args) {
         // Create AreaCalculator instance
         AreaCalculator areaCalculator = new AreaCalculator();
 
         // Add some shapes
         areaCalculator.addShape(new Circle(5));
         areaCalculator.addShape(new Rectangle(4, 6));
 
         // Calculate total area
         double totalArea = areaCalculator.calculateTotalArea();
         System.out.println("Total Area: " + totalArea);
     }
 }

 
