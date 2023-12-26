/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Devices;
import com.mycompany.clientswitch.Interfaces.Device;
/**
 *
 * @author ria.mishra
 */
public class SmartPhone implements Device {
    @Override
    public void displayDetails() {
        System.out.println("Smartphone: Model X, RAM: 8GB, Storage: 128GB");
    }
}
