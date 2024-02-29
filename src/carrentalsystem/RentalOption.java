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
public class RentalOption {
    
    public CarRental getCar(String carModel){
        CarRental obj = null; //interface object
        
        if (carModel.toLowerCase().equals("seven")){//input parameter
            obj = new SevenSeatCar(); //polymorphism
        }
        else if (carModel.toLowerCase().equals("five")){
            obj = new FiveSeatCar();
        }
        else {
            System.out.println("Invalid Input!!");            
        }        
        return obj; //return selected concrete object   
    }
}
