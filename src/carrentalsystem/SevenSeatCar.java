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
public class SevenSeatCar implements CarRental{

    @Override
    public double getStudPrice(String model, String type, String userType,int hour){
        double priceStudent = 0;
        double discount;

        discount= 0.20;
             
        if (type.equalsIgnoreCase("avanza")){
            priceStudent = ((9*hour)-(9*hour)*discount);
        }else  if (type.equalsIgnoreCase("exora")){
            priceStudent = ((10*hour)-(10*hour)*discount);
        }else{
            System.out.println("Invalid Input!!");
        }
     
        return priceStudent;
    }

    @Override
    public double getNonStudPrice(String model, String type, String userType,int hour){
        double priceNonStudent = 0;

        if (type.equalsIgnoreCase("avanza")){
            priceNonStudent = 9*hour;
        }else if (type.equalsIgnoreCase("exora")){
            priceNonStudent = 10*hour;
        }else{
            System.out.println("Invalid Input!!");
        }

        return priceNonStudent;
    }
}
