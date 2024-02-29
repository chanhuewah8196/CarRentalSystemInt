/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalsystem;

import static carrentalsystem.CarRentalSystem.label;
import javax.swing.JLabel;

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
public class NonStud extends User{

    @Override
    public void getUserDetail(String userType,String name,String ICNumber,String stdID,String phoneNum) {
         
         label[14] = new JLabel("--------------------------------------------------------------------");
         label[15] = new JLabel("THE INFORMATION OF CUSTOMER" + " - (Non-Student)");
         label[16] = new JLabel("--------------------------------------------------------------------");
         label[17] = new JLabel("Name                        : " + name.toUpperCase());
         label[18] = new JLabel("IC Number                : " + ICNumber);
         label[19] = new JLabel("Phone Number        : " + phoneNum);
         label[20] = new JLabel("--------------------------------------------------------------------");
    }
    
}
