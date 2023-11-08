/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.assignmentone;
import com.mycompany.assignmentone.Request;
import com.mycompany.assignmentone.Response;
import java.util.*; 

/**
 *
 * @author ria.mishra
 */
public class EmailFootPrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Request request = UserOperation.getUserInputs();
        Response response = CarbonCalculator.getTotalCarbonFootprint(request);
        displayResponse(response);
    }

    public static void displayResponse(Response response)
    {
        System.out.println("Email " + response.emailId);
        System.out.println("Source " +response.source);
        System.out.println("Inbox " + response.inbox);
        System.out.println("Sent "+ response.sent);
        System.out.println("Spam " + response.spam);
    }
}
