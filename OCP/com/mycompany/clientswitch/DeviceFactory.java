/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clientswitch;
import com.mycompany.clientswitch.Interfaces.Device;
import Devices.Laptop;
import Devices.SmartPhone;
import Enums.DeviceType;
/**
 *
 * @author ria.mishra
 */
public class DeviceFactory {
    public static Device createDevice(DeviceType type) {
        switch (type) {
            case SMARTPHONE:
                return new SmartPhone();
            case LAPTOP:
                return new Laptop();
            default:
                throw new IllegalArgumentException("Invalid device type: " + type);
        }
    }
}
