/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemmenu2;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class MainSystem {
    static SList<CustomerData> Sl = new SList<>();
    static Scanner sc = new Scanner(System.in);
    
    // ------------------------------------------------------------
    static String milk1 = "wintermelon", milk2 = "okinawa", milk3 = " hokaido";
    static double       pmilk1 = 100,     pmilk2 = 250            ,pmilk3 = 100;
    static String milk;
    static double pmilk;
    //------------------------------------------------------------------------
    static String fries1 = "Sour Cream", fries2 = "Cheese", fries3 = " Barbeque";
    static double        pfries1 = 50,       pfries2 = 50,         pfries3 = 60;
    static String fries;
    static double pfries;
    //------------------------------------------------------------------------
    static String burger1 = "Whah Burger", burger2 = "Cheese burger", burger3 = "Ala Arte Burger";
    static double       pburger1 = 200,         pburger2 = 300,                 pburger3 = 250;
    static String burger;
    static double pburger;
    //------------------------------------------------------------------------
    
    static int j, a;
    static String Cname;
    
    public static void main(String [] args){
        SystemMenu();       //START SYSTEM
    }
    
     public static void SystemMenu(){           //CHOOSE AS OPTION BELOW
       System.out.print("Inventory App\n\n");
       System.out.print("Please Select():\n");
       System.out.print("(1) Start\n");
       System.out.print("(2) History\n");
       System.out.print("(3) Exit\n");
       
       System.out.print("\n\n\n\n");
       System.out.print("Select : ");
       
        int choice = sc.nextInt();
         
        
        switch(choice){
            case 1:
                SystemStart();      //GOING TO SYSTEMSTART
                break;
            case 2:
                history();      //GOING TO HISTORY
                break;
            case 3:
                Exit();         //EXIT THE PROGRAM
                break;
            default:
                Exit();     //EXIT THE PROGRAM IF REGARDLESS THE WRONG INPUT
                break;
        }
         
   
        }
     public static void SystemStart(){      //INPUT CUSTOMER AS FIRST DATA VARIABLE
        System.out.print("Enter Customer Name\n");
        System.out.print(": ");
        Cname = sc.nextLine();
        System.out.print("\n\n\n");
    
        
             
                 MilkteaMenu();     //GOING TO PROCESS TO CHOOSE
     }
  
     public static void MilkteaMenu(){      //CONFIMATION TO CHOOSE IF YOU WANT TO ORDER OR NOT
        System.out.print("Order MilkTea?\n");
        System.out.print("[1] YES \t  [2] NO\n");
        System.out.print(": ");
        int choice = sc.nextInt();
        System.out.print("\n\n\n");
        
        if(choice == 1){        //IF YES , CHOOSE MORE MILKTEA OPTIONS AS AVAIL AND 2nd DATA 
             System.out.print("MilkTea Menu :\n\n");
        
            
            System.out.print("<#>\t     <Food Name>\t    <Food Price>\n");
            System.out.print( 
                "[1]\t\t" + milk1 +"\t\t\t"+ pmilk1 + "\n" +
                "[2]\t\t" + milk2 +"\t\t\t"+ pmilk2 + "\n" +     
                "[3]\t\t" + milk3 +"\t\t\t"+ pmilk3 + "\n");
           System.out.print("Enter your choice:\n");
           System.out.print(": ");
           int choice1 = sc.nextInt();
           System.out.print("\n\n\n");
           
            if(choice1 == 1){
                milk = milk1;
                pmilk = pmilk1;
                
            }else if(choice1 == 2){
                milk = milk2;
                pmilk = pmilk2;
            }else if(choice1 == 3){
                milk = milk3;
                pmilk = pmilk3;
            }
            
            FriesMenu();
        }else{      //IF NOT GOING AS BLANK OR NOT AND SKIP TO FRIES
            milk = "NONE";
            pmilk = 0;
          FriesMenu();   
        }
     }
      public static void FriesMenu(){           //CONFIRMATION IF YOU WANT TO ORDER FRIES OR NOT 
        System.out.print("Order Fries?\n");
        System.out.print("[1] YES \t  [2] NO\n");
        System.out.print(": ");
        int choice = sc.nextInt();
        System.out.print("\n\n\n\n\n\n");
        
        if(choice == 1){
            System.out.print("Fries Menu :\n\n");               //IF YES PROCEED AS CHOOSE WHAT YOU WANT TO ORDER AS 3rd DATA
        
            
            System.out.print("<#>\t     <Food Name>\t    <Food Price>\n");
            System.out.print( 
                "[1]\t\t" + fries1 +"\t\t\t"+ pfries1 + "\n" +
                "[2]\t\t" + fries2 +"\t\t\t"+ pfries2 + "\n" +     
                "[3]\t\t" + fries3 +"\t\t\t"+ pfries3 + "\n");
            
           System.out.print("Enter your choice:\n");
           System.out.print(": ");
           int choice1 = sc.nextInt();
           System.out.print("\n\n\n\n\n\n");
           
            if(choice1 == 1){
                fries = fries1;
                pfries = pfries1;
                
            }else if(choice1 == 2){
                fries = fries2;
                pfries = pfries2;
            }else if(choice1 == 3){
                fries = fries3;
                pfries = pfries3;
            }
            BurgerMenu();  
        }else{
            fries = "NONE";             //IF NOT SKIP, TO BURGER AND 3rd DATA AS NULL OR EMPTY
            pfries = 0;
             BurgerMenu(); 
        }
      }
      
      
     public static void BurgerMenu(){       //CONFIRMATION TO ORDER OR NOT?
        System.out.print("Order Burger?\n");
        System.out.print("[1] YES \t  [2] NO\n");
        System.out.print(": ");
        int choice = sc.nextInt();
        System.out.print("\n\n\n\n\n\n");
        
        if(choice == 1){                                    //IF YES PROCEED AS ORDER AND AS 4THD DATA
            System.out.print("Burger Menu :\n\n");
        
            
            System.out.print("<#>\t     <Food Name>\t    <Food Price>\n");
            System.out.print( 
                "[1]\t\t" + burger1 +"\t\t\t"+ pburger1 + "\n" +
                "[2]\t\t" + burger2 +"\t\t\t"+ pburger2 + "\n" +     
                "[3]\t\t" + burger3 +"\t\t\t"+ pburger3 + "\n");
           System.out.print("Enter your choice:\n");
           System.out.print(": ");
           int choice1 = sc.nextInt();
           System.out.print("\n\n\n");
           
            if(choice1 == 1){
                burger = burger1;
                pburger = pburger1;
                
            }else if(choice1 == 2){
                burger = burger2;
                pburger = pburger2;
            }else if(choice1 == 3){
                burger = burger3;
                pburger = pburger3;
            }
            DataIn();
        }else{
            burger = "NONE";            //IF NOT, SKIP TO DATA IN PROCESS
            pburger = 0;
            DataIn();
        }
     }
     
    public static void DataIn(){
        
        //                                   Data1,Data2,data3,data4,data5,data6,data7
        CustomerData data = new CustomerData(Cname,milk,fries,burger,pmilk,pfries,pburger); // MAO NING MU SULOD SA DATA STRUCTURE
        
        Sl.addFirst(data); //First data atay baho kaayu lamao
     DataOut();
    }
    
    public static void DataOut(){
        Sl.displayList(Sl);
        
        System.out.print("Press Any Key To Go Back......");
        sc.nextLine();
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n");
        SystemMenu();
    }
    
    public static void history(){                   //DISPLAY THE DATA LIST AND CAN DELETE ONLY 
        if(Sl.isEmpty()){
        System.out.print("Data is Empty\n");
        System.out.print("GOING BACK....");
        SystemStart();
    }
        System.out.print("HISTORY OF CUSTOMER ORDERED\n\n");
        Sl.displayList(Sl);
        System.out.print("\n\n\n\n");
       
        
        System.out.print("Options\t\t [1] Data History Delete\t\t [2] Go back \n\n\n");
        System.out.print("Please Select():\n");
        System.out.print("(1) Delete\n");
        System.out.print("(2) Go Back\n");

        System.out.print("\n\n\n");
        System.out.print("Select : ");
       
        int c = sc.nextInt();
        
        if(c == 1 ){
             System.out.print("NOTE: YOU CAN DELETE FIRST DATA HISTORY"); 
       System.out.print("Please Select():\n");
       System.out.print("(1) Delete\n");
       System.out.print("(2) Exit\n");
       
       System.out.print("\n\n\n\n");
       System.out.print("Select : ");
       
        int choice = sc.nextInt();
        
          if(choice == 1){
                                System.out.print("CONFIRMATION\n");
                                System.out.print(">"+ Sl.first().getCustomer());
                                System.out.print("DO YOU WANT TO DELETE THIS DATA");
                                System.out.print(": ");

                                 System.out.print("\n\n\n\n");
                                 System.out.print("Select : ");
                                 int choice1 = sc.nextInt();

                                 if(choice1 == 1){
                                     Sl.removeFirst();
                                     System.out.print("DATA IS DELETED\n");
                                     history();
                                 }else{
                                     System.out.print("GOING BACK..");
                                     System.out.print("\n\n\n\n");
                                     sc.nextLine();

                                 }



                            }else if(choice == 2){
                                SystemStart();
                            }else{
                                System.out.print("INVALID INPUT");
                                history();
                            }
                    }else{
            System.out.print("GOING BACK..");
            System.out.print("\n\n\n\n");
            sc.nextLine();
            SystemStart();
        }
        
      
    }
    
    public static void delete(){
        
    }
    
    public static void Exit(){
        System.exit(0);
    }
} 
        

