/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.assignmentone;
import com.mycompany.assignmentone.Entity;
import com.mycompany.assignmentone.Response;
import java.util.*; 

/**
 *
 * @author ria.mishra
 */
public class AssignmentOne {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> entityTypes = Arrays.asList("email", "server", "something");
        Entity entity = new Entity();
        System.out.print("Enter mail"); 
        entity.emailId = sc.nextLine();
        System.out.print("Enter source"); 
        entity.source = sc.nextLine();
        System.out.print("Enter total inbox mail"); 
        entity.totalInboxMail = sc.nextDouble();  
        System.out.print("Enter total sent mail");
        entity.totalSentMail = sc.nextDouble(); 
        System.out.print("Enter total spam mail");
        entity.totalSpamMail = sc.nextDouble();
        Response response = getCarbonFootprint(entityTypes,entity);
        System.out.println("Email " + response.emailId);
        System.out.println("Source " +response.source);
        System.out.println("Inbox " + response.inbox);
        System.out.println("Sent "+ response.sent);
        System.out.println("Spam " + response.spam);
    }
    
    public static Response getCarbonFootprint(List<String> entitytype, Entity entity) {
        double totalCarbonFootprint = 0;
        double standardMailCarbon = 4;
        double spamMailCarbon = 0.3;
        Response response = new Response();
        response.emailId = entity.emailId;
        response.source = entity.source;
        response.inbox = String.valueOf((standardMailCarbon * entity.totalInboxMail)/1000) + "KG";
        response.spam = String.valueOf((spamMailCarbon * entity.totalSpamMail)/1000)+ "KG";
        response.sent = String.valueOf((standardMailCarbon * entity.totalSentMail) / 1000)+ "KG";
        return response;
    }
}
