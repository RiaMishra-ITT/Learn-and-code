/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clientswitch;
import com.mycompany.clientswitch.Interfaces.Device;
import Enums.DeviceType;
/**
 *
 * @author ria.mishra
 */
public class ClientSwitch {

    public static void main(String[] args) {
        Device smartphone = DeviceFactory.createDevice(DeviceType.SMARTPHONE);
        Device laptop = DeviceFactory.createDevice(DeviceType.LAPTOP);

        smartphone.displayDetails();
        laptop.displayDetails();
    }
}
