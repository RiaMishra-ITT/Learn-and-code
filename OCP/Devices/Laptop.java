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
public class Laptop implements Device {
    @Override
    public void displayDetails() {
        System.out.println("Laptop: Model Y, RAM: 16GB, Storage: 512GB");
    }
}
