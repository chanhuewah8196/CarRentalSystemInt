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
public class CarInfo {

    private final String carModel;
    private final String carType;
    private String powertrain;
    private String transmission;
    private String color;
    private String plateNum;
    
    
    public CarInfo(String carModel,String carType){
        this.carModel = carModel;
        this.carType = carType;
    }
    
    public String getColor(){
        if (carModel.equalsIgnoreCase("five") ) {
            if (carType.equalsIgnoreCase("iriz")){
                color = "Grey";
            }else if (carType.equalsIgnoreCase("axia")){
                color = "White";
            }else if (carType.equalsIgnoreCase("myvi")){
                color = "Black";
            }
        }else if(carModel.equalsIgnoreCase("seven")){
            if (carType.equalsIgnoreCase("avanza")){
                color = "Red";
            }else if (carType.equalsIgnoreCase("exora")){
                color = "Blue";
            }
        }
        return color;
    }

    public String getTransmission(){
        if (carModel.equalsIgnoreCase("five")){
            if (carType.equalsIgnoreCase("iriz")){
                transmission = "Automatic";
            }else if (carType.equalsIgnoreCase("axia")){
                transmission = "Automatic";
            }else if (carType.equalsIgnoreCase("myvi")){
                transmission = "Automatic";
            }
        }else if(carModel.equalsIgnoreCase("seven")){
            if (carType.equalsIgnoreCase("avanza")){
                transmission = "Manual";
            }else if (carType.equalsIgnoreCase("exora")){
                transmission = "Automatic";
            }
        }
        return transmission;
    }

    public String getPowertrain(){
        if (carModel.equalsIgnoreCase("five")){
            if (carType.equalsIgnoreCase("iriz")){
                powertrain = "Electrical";
            }else if (carType.equalsIgnoreCase("axia")){
                powertrain = "Gas";
            }else if (carType.equalsIgnoreCase("myvi")){
                powertrain = "Electrical";
            }
        }else if(carModel.equalsIgnoreCase("seven")){
            if (carType.equalsIgnoreCase("avanza")) {
                powertrain = "Gas";
            }else if (carType.equalsIgnoreCase("exora")) {
                powertrain = "Electrical";
            }
        }
        return powertrain;
    }

    public String getPlateNum() {
        if (carModel.equalsIgnoreCase("five")){
            if (carType.equalsIgnoreCase("iriz")){
                plateNum = "AHK8616";
            }else if (carType.equalsIgnoreCase("axia")){
                plateNum = "JDG9966";
            }else if (carType.equalsIgnoreCase("myvi")){
                plateNum = "WCJ4863";
            }
        }else if(carModel.equalsIgnoreCase("seven")){
            if (carType.equalsIgnoreCase("avanza")){
                   plateNum = "WUV6374";
            }else if (carType.equalsIgnoreCase("exora")){
                   plateNum = "BEN7274";
            }
        }
        return plateNum;
    }

}
