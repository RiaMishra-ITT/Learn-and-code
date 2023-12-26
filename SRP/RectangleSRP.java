/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SRP;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ria.mishra
 */
public class RectangleSRP {
    private double length;
    private double width;


    public RectangleSRP(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
       double area = length * width;
        return area;
    }
    
    public void SaveAreaInFile()
    {
        double area = calculateArea();
        try (FileWriter writer = new FileWriter("area.txt")) {
            writer.write("Area: " + area);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        double area = rectangle.calculateArea();
        System.out.println("Calculated Area: " + area);
    }
}
