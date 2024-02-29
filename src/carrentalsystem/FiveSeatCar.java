/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalsystem;

/**
 *
 * COURSE     : BCS2143 OBJECT ORIENTED PROGRAMMING
 * SECTION    : 02
 * GROUP      : 10
 * ASSESSMENT : PROJECT PHASE 2
 * 
 * Group Member:
 * 1) CHAN HUE WAH (CA19059) (LEADER)
 * 2) BENEDICT HWONG NAI YI (CA19109)
 * 3) TANG XIN ZHE (CA19101)
 * 4) SOH KAI JIE (CA19091)
 * 5) YEW JIA YIE (CA19068)
 * 
 */
public class FiveSeatCar implements CarRental{

    @Override
    public double getStudPrice(String model, String type, String userType,int hour){
        double priceStudent = 0;
        double discount;

        discount= 0.20;
             
        if (type.equalsIgnoreCase("iriz")){
            priceStudent = ((6*hour)-(6*hour)*discount);
        }else  if (type.equalsIgnoreCase("axia")){
            priceStudent = ((7*hour)-(7*hour)*discount);
        }else  if (type.equalsIgnoreCase("myvi")){
            priceStudent = ((8*hour)-(8*hour)*discount);
        }else{
            System.out.println("Invalid Input!!"); 
        }
     
        return priceStudent;
    }

    @Override
    public double getNonStudPrice(String model, String type, String userType,int hour){
        double priceNonStudent = 0;
 
        if (type.equalsIgnoreCase("iriz")){
            priceNonStudent = 6*hour;
        }else  if (type.equalsIgnoreCase("axia")){
            priceNonStudent = 7*hour;
        }else  if (type.equalsIgnoreCase("myvi")){
            priceNonStudent = 8*hour;
        }else {
            System.out.println("Invalid Input!!");  
        }
   
        return priceNonStudent;
    }

}
