/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalsystem;
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
public class CarRentalSystem {

    static Scanner input = new Scanner (System.in);
    static JLabel[] label = new JLabel[100];
    static JLabel[][] label2 = new JLabel[100][100];
    
    public static void main(String[] args) {
         
        //First Frame in GUI
        JFrame first = new JFrame("ONLINE CAR RENTAL SYSYEM");
         label[0] = new JLabel("UMP CAR RENTAL SYSTEM");
         label[1] = new JLabel("Yes - Student");
         label[2] = new JLabel("No - Non Student");
         
         label[0].setBounds(20,100,200,30); first.add(label[0]);
         label[1].setBounds(20,150,80,30); first.add(label[1]);
         label[2].setBounds(20,200,200,30); first.add(label[2]);
         first.setSize(500,500);
         first.setLayout(null);
         first.setVisible(true);
         String userType = JOptionPane.showInputDialog(null, "Are you Student? (Yes/No)");
         
         if (userType.equalsIgnoreCase("yes")){
             userType = "Student";
         }else if(userType.equalsIgnoreCase("no")){
             userType = "NonStudent";
         }else{
             userType = "INVALID";
         }
         
         String name = JOptionPane.showInputDialog(first,"Enter Your Name");
         String ICnumber = JOptionPane.showInputDialog(first,"Enter Your IC");
         
         String stdID = null;
         if (userType.equalsIgnoreCase("student")){
            stdID = JOptionPane.showInputDialog(first, "Enter Your Student ID");
         }
         String phone = JOptionPane.showInputDialog(first,"Enter Your Phone Number");
         
         first.setVisible(false); //End of First Frame
         
         Insurance insurance = new Insurance();//create obj for aggregation
         RentalInfo rent = new RentalInfo(insurance);
         
         //Third Frame in GUI
         JFrame third = new JFrame("List of Car");
         label[6] = new JLabel("LIST OF CAR AVAILABLE");
         label[7] = new JLabel("Five Seater Car :::");
         label[8] = new JLabel("A - Proton Iriz [Grey, Automatic, AHK8616, RM6 per hour]");
         label[9] = new JLabel("B - Proton Axia [White, Automatic, JDG9966, RM7 per hour]");
         label[10] = new JLabel("C - Myvi [Black, Automatic, WCJ4863, RM8 per hour]");
         label[11] = new JLabel("Seven Seater Car :::");
         label[12] = new JLabel("A - Proton Avanza [Red, Manual, WUV6374, RM9 per hour]");
         label[13] = new JLabel("B - Proton Exora [Blue, Automatic, BEN7274, RM10 per hour]");
         
         label[6].setBounds(150,50,500,30); third.add(label[6]);
         label[7].setBounds(20,100,600,30); third.add(label[7]);
         label[8].setBounds(20,150,600,30); third.add(label[8]);
         label[9].setBounds(20,200,600,30); third.add(label[9]);
         label[10].setBounds(20,250,600,30); third.add(label[10]);
         label[11].setBounds(20,300,600,30); third.add(label[11]);
         label[12].setBounds(20,350,600,30); third.add(label[12]);
         label[13].setBounds(20,400,600,30); third.add(label[13]);
         
         third.setSize(500,500);
         third.setLayout(null);
         third.setVisible(true);
         int number = Integer.parseInt(JOptionPane.showInputDialog(third,"How many car do you want to rent?")); //End of Second Frame in GUI
         
         
         //Output that Show in terminal
         System.out.println("---------------------------------------------------------------");
         System.out.println("\tLIST OF CAR AVAILABLE");
         System.out.println("---------------------------------------------------------------");
         System.out.println("Five Seater Car :::");
         System.out.println("A - Proton Iriz [Grey, Automatic, AHK8616, RM6 per hour]"); 
         System.out.println("B - Proton Axia [White, Automatic, JDG9966, RM7 per hour]");
         System.out.println("C - Myvi [Black, Automatic, WCJ4863, RM8 per hour]\n");
         System.out.println("Seven Seater Car :::");
         System.out.println("A - Proton Avanza [Red, Manual, WUV6374, RM9 per hour]");
         System.out.println("B - Proton Exora [Blue, Automatic, BEN7274, RM10 per hour]");
         System.out.println("---------------------------------------------------------------");
  
        //array declaration for car
        RentalInfo[] info = new RentalInfo[number];
        RentalOption[] option = new RentalOption[number];// declare rental option obj 
        //get the concrete obj from the factory method()
        CarRental[] rental = new CarRental[number];
            
         //input car rental (array)
         int i = 0;
         while(i<number){
             
             JFrame four = new JFrame("Car");
             label2[i][0] = new JLabel("Enter Information of the CAR to Rent");
             label2[i][1] = new JLabel("Car " + (i+1));
             
             label2[i][0].setBounds(150,100,600,30); four.add(label2[i][0]);
             label2[i][1].setBounds(200,150,200,30); four.add(label2[i][1]);
             four.setSize(500,500);
             four.setLayout(null);
             four.setVisible(true);
             
             String model = JOptionPane.showInputDialog(four,"Enter Car " + (i+1) + "Type (Five/Seven) Seater");
             
             four.setVisible(false); //End of Third Frame

             if(model.equalsIgnoreCase("five")) {
                 System.out.println("\nFive Seaters Car List");
                 System.out.println("*** Iriz *** \n*** Axia *** \n*** Myvi ***\n");
             }else if(model.equalsIgnoreCase("seven")){
                 System.out.println("\nSeven Seaters Car List");
                 System.out.println("*** Avanza *** \n*** Exora ***\n");
             }else {
                 model = "INVALID";
             }
             
             String type = JOptionPane.showInputDialog(four,"Enter Type of Car " + (i+1));
             String time = JOptionPane.showInputDialog(four,"Enter Departure Time");
             int hour = Integer.parseInt(JOptionPane.showInputDialog(four,"Enter Rental Hour (per hour)"));
             
             info[i] = new RentalInfo(model, type, hour, time);//store rental info as array
             option[i] = new RentalOption();// array rental option obj  
             rental[i] = option[i].getCar(model);//get array concrete obj from the rental option method()
             System.out.println("---------------------------------------------------------------\n");
             i++;

             four.setVisible(false);
         }//end input car rental
         third.setVisible(false);
         
         
         
        //polymophism - User class as abstract
        User customer1 = new Stud();
        User customer2 = new NonStud();
        
        //output for customer details
        if (userType.equalsIgnoreCase("student")){
            customer1.getUserDetail(userType, name, ICnumber,stdID, phone);
        }else if(userType.equalsIgnoreCase("nonstudent")){
            customer2.getUserDetail(userType, name, ICnumber,stdID, phone);
        }else{
            System.out.println("Invalid Input!!");
        }//end customer details
        
        
        //Fifth Frame in GUI (OUPUT GUI)
        JFrame five = new JFrame("Car Rental Details");

         label[29] = new JLabel("--------------------------------------------------------------------");
         label[30] = new JLabel("\tINSURANCE DETAILS");
         label[31] = new JLabel("--------------------------------------------------------------------");
         label[32] = new JLabel("Insurance Agency        : " + rent.getAgencyComp_().toUpperCase()); 
         label[33] = new JLabel("Agent Name                   : " + rent.getAgent_().toUpperCase()); 
         label[34] = new JLabel("Phone number              : " + rent.getPhoneNum_()); 
         label[35] = new JLabel("Email                                : " + rent.getEmailAdd_()); 
         label[36] = new JLabel("--------------------------------------------------------------------\n");
         
         label[37] = new JLabel("THE DETAIL OF CAR RENTAL");
         label[38] = new JLabel("--------------------------------------------------------------------");
         
         double TotalStudPrice = 0;
         double TotalNonStudPrice = 0;
         
         for(int j=0; j<number; j++){
             label2[j][2] = new JLabel("Number of car rent     : " + (j+1));
             label2[j][3] = new JLabel("Car Seater                    : " + info[j].getCarModel().toUpperCase() + " SEATERS");
             label2[j][4] = new JLabel("Type of Car                   : " + info[j].getCarType().toUpperCase() + "(" + info[j].getColor_().toUpperCase() + ")");
             label2[j][5] = new JLabel("Car Plate Number       : " + info[j].getPlateNum_());
             label2[j][6] = new JLabel("Transmission              : " + info[j].getTransmission_());
             label2[j][7] = new JLabel("Powertrain                   : " + info[j].getPowertrain_());
             label2[j][8] = new JLabel("Departure Time           : " + info[j].getTimeStart());
             label2[j][9] = new JLabel("Hour of Rent                 : " + info[j].getRentHour() + " hours");
             label2[j][10] = new JLabel("--------------------------------------------------------------------");
             
            double studentPrice = 0;
            double nonStudentPrice = 0;
            
         if (userType.equalsIgnoreCase("student")){
             
             studentPrice = rental[j].getStudPrice(info[j].getCarModel(), info[j].getCarType(), userType, info[j].getRentHour());
             label2[j][11] = new JLabel("Total Price for Car " + (j+1) + "  : RM " + studentPrice);
             label2[j][12] = new JLabel("--------------------------------------------------------------------");
             TotalStudPrice+=studentPrice;
             label2[j][13] = new JLabel("+++++++++++++++++++++++++++++++++++++++");
             label2[j][14] = new JLabel("Overall Total Price for " + (j+1) + " Cars : RM " + TotalStudPrice);
             label2[j][15] = new JLabel("+++++++++++++++++++++++++++++++++++++++");
             
         }else if(userType.equalsIgnoreCase("nonstudent")){

              nonStudentPrice = rental[j].getNonStudPrice(info[j].getCarModel(), info[j].getCarType(), userType, info[j].getRentHour());
              label2[j][16] = new JLabel("Total Price of Car " + (j+1) + "  : RM " + nonStudentPrice);
              label2[j][17] = new JLabel("--------------------------------------------------------------------");
              TotalNonStudPrice+=nonStudentPrice;
              label2[j][18] = new JLabel("+++++++++++++++++++++++++++++++++++++++");
              label2[j][19] = new JLabel("Overall Total Price for " + (j+1) + " Cars : RM " + TotalNonStudPrice);
              label2[j][20] = new JLabel("+++++++++++++++++++++++++++++++++++++++");
              
         }
         else{
             System.out.println("Invalid Input!!");    
         }
         }//end car details
         
         if (userType.equalsIgnoreCase("student")){
            label[21].setBounds(20,2,600,30); five.add(label[21]);
            label[22].setBounds(20,20,600,30); five.add(label[22]);
            label[23].setBounds(20,40,600,30); five.add(label[23]);
            label[24].setBounds(20,60,600,30); five.add(label[24]);
            label[25].setBounds(20,80,600,30); five.add(label[25]);
            label[26].setBounds(20,100,600,30); five.add(label[26]);
            label[27].setBounds(20,120,600,30); five.add(label[27]);
            label[28].setBounds(20,140,600,30); five.add(label[38]);
         }else if(userType.equalsIgnoreCase("nonstudent")){
            label[14].setBounds(20,2,600,30); five.add(label[14]);
            label[15].setBounds(20,20,600,30); five.add(label[15]);
            label[16].setBounds(20,40,600,30); five.add(label[16]);
            label[17].setBounds(20,60,600,30); five.add(label[17]);
            label[18].setBounds(20,80,600,30); five.add(label[18]);
            label[19].setBounds(20,100,600,30); five.add(label[19]);
            label[20].setBounds(20,120,600,30); five.add(label[20]);
         }else{
            System.out.println("Invalid Input!!");
         }

         label[29].setBounds(20,160,600,30); five.add(label[29]);
         label[30].setBounds(20,180,600,30); five.add(label[30]);
         label[31].setBounds(20,200,600,30); five.add(label[31]);
         label[32].setBounds(20,220,600,30); five.add(label[32]);
         label[33].setBounds(20,240,600,30); five.add(label[33]);
         label[34].setBounds(20,260,600,30); five.add(label[34]);
         label[35].setBounds(20,280,600,30); five.add(label[35]);
         label[36].setBounds(20,300,600,30); five.add(label[36]);
         label[37].setBounds(20,320,600,30); five.add(label[37]);
         label[38].setBounds(20,340,600,30); five.add(label[38]);

         int k = 0;
         for(int j=0; j<number; j++) {
             label2[j][2].setBounds(20,360+k,600,30); five.add(label2[j][2]);
             label2[j][3].setBounds(20,380+k,600,30); five.add(label2[j][3]);
             label2[j][4].setBounds(20,400+k,600,30); five.add(label2[j][4]);
             label2[j][5].setBounds(20,420+k,600,30); five.add(label2[j][5]);
             label2[j][6].setBounds(20,440+k,600,30); five.add(label2[j][6]);
             label2[j][7].setBounds(20,460+k,600,30); five.add(label2[j][7]);
             label2[j][8].setBounds(20,480+k,600,30); five.add(label2[j][8]);
             label2[j][9].setBounds(20,500+k,600,30); five.add(label2[j][9]);
             label2[j][10].setBounds(20,520+k,600,30); five.add(label2[j][10]);
             
             if (userType.equalsIgnoreCase("student")){
             
                 label2[j][11].setBounds(20,540+k,600,30); five.add(label2[j][11]);
                 label2[j][12].setBounds(20,560+k,600,30); five.add(label2[j][12]);
                 label2[j][13].setBounds(20,580+k,600,30); five.add(label2[j][13]);
                 label2[j][14].setBounds(20,600+k,600,30); five.add(label2[j][14]);
                 label2[j][15].setBounds(20,620+k,600,30); five.add(label2[j][15]);
             
             }else if(userType.equalsIgnoreCase("nonstudent")){

                 label2[j][16].setBounds(20,540+k,600,30); five.add(label2[j][16]);
                 label2[j][17].setBounds(20,560+k,600,30); five.add(label2[j][17]);
                 label2[j][18].setBounds(20,580+k,600,30); five.add(label2[j][18]);
                 label2[j][19].setBounds(20,600+k,600,30); five.add(label2[j][19]);
                 label2[j][20].setBounds(20,620+k,600,30); five.add(label2[j][20]);
                 
             } else{
             System.out.println("Invalid Input!!");    
             }
             k = 280;
         }

         five.setSize(10000,5000);
         five.setLayout(null);
         five.setVisible(true); //End of Fifth GUI
    }
}
