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
public class RentalInfo {
    private String carModel;
    private String carType;
    private String timeStart;
    private int rentHour;
    private CarInfo car; //composition
    private Insurance insurance; //aggregation
    
    public RentalInfo(String model, String type, int hour, String timeStart) {
        this.carModel = model;
        this.carType = type;
        this.timeStart = timeStart;
        this.rentHour = hour;
        car = new CarInfo(carModel,carType); //create obj for composition
    } 
    
    //overloaded method
    public RentalInfo(Insurance insurance){
        this.insurance = insurance;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarType() {
        return carType;
    }

    public int getRentHour() {
        return rentHour;
    }
    
    public String getColor_(){
        return car.getColor();
    }

    public String getTransmission_(){
        return car.getTransmission();
    }

    public String getPowertrain_(){
        return car.getPowertrain();
    }
    
    public String getPlateNum_(){
        return car.getPlateNum();
    }
    public String getAgencyComp_() {
        return insurance.getAgencyComp();
    }

    public String getAgent_() {
        return insurance.getAgent();
    }

    public String getPhoneNum_() {
        return insurance.getPhoneNum();
    }

    public String getEmailAdd_() {
        return insurance.getEmailAdd();
    }

    public String getTimeStart() {
        return timeStart;
    }
}
