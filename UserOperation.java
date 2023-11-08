/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.assignmentone;
import com.mycompany.assignmentone.Request;
import java.util.*; 

/**
 *
 * @author ria.mishra
 */
public class UserOperation {  
    public static Request getUserInputs()
    {
        Scanner sc = new Scanner(System.in);
        Request request = new Request();
        System.out.print("Enter mail"); 
        request.emailId = sc.nextLine();
        System.out.print("Enter source"); 
        request.source = sc.nextLine();
        System.out.print("Enter total inbox mail"); 
        request.totalInboxMail = sc.nextDouble();  
        System.out.print("Enter total sent mail");
        request.totalSentMail = sc.nextDouble(); 
        System.out.print("Enter total spam mail");
        request.totalSpamMail = sc.nextDouble();

        return request;
    }
}
