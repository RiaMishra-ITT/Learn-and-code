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
public class CarbonCalculator {  
    public static Response getTotalCarbonFootprint(Request request) {
        double standardMailCarbon = 4;
        double spamMailCarbon = 0.3;
        Response response = new Response();
        response.emailId = request.emailId;
        response.source = request.source;
        response.inbox = getCarbonFootprintOfMail(standardMailCarbon,request.totalInboxMail);
        response.spam = getCarbonFootprintOfMail(spamMailCarbon,request.totalSpamMail);
        response.sent = getCarbonFootprintOfMail(standardMailCarbon,request.totalSentMail);
        return response;
    }

    public static String getCarbonFootprintOfMail(double totalMail, double perMailCarbonEmitted)
    {
        return String.valueOf((perMailCarbonEmitted * totalMail)/1000) + "KG";
    }
}
