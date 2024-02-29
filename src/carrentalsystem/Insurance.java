/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalsystem;

import static carrentalsystem.CarRentalSystem.label;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
public class Insurance{
    String agencyComp,agent,phoneNum,emailAdd;
    Scanner input = new Scanner (System.in);
    //static JLabel[] label = new JLabel[30];
    public Insurance(){
        
         JFrame second = new JFrame("INSURANCE INFORMATION");
         
         label[3] = new JLabel("--------------------------------------------------------------------");
         label[4] = new JLabel("Enter Insurance Information");
         label[5] = new JLabel("--------------------------------------------------------------------");
         
         label[3].setBounds(20,100,200,30); second.add(label[3]);
         label[4].setBounds(20,150,600,30); second.add(label[4]);
         label[5].setBounds(20,200,200,30); second.add(label[5]);
         
         second.setSize(500,500);
         second.setLayout(null);
         second.setVisible(true);
         
         agencyComp = JOptionPane.showInputDialog(null, "Enter Insurance Agency Company");
         agent = JOptionPane.showInputDialog(null, "Enter Agent Full Name");
         phoneNum = JOptionPane.showInputDialog(null, "Enter Agent Phone Number");
         emailAdd = JOptionPane.showInputDialog(null, "Enter Agent Email");
         
         second.setVisible(false);
    }

    public String getAgencyComp() {
        return agencyComp;
    }

    public String getAgent() {
        return agent;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getEmailAdd() {
        return emailAdd;
    }

}
