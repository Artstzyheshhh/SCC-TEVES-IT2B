
package teves;

import java.util.Scanner;



public class TEVES {  
public static void main (String []args){   
Scanner sc = new Scanner (System.in);
 System.out.print("1. Account"+"\n2. Salary"+"\n3. Agecalculator "+"\n4. receipt"+"\n5. grade");
          System.out.println("\n------------------------------------");
          System.out.print("Enter choice : ");
          int choice = sc.nextInt();
    while(choice> 5){ 
        System.out.println("try again : ");
        choice = sc.nextInt();
    }  
    switch (choice){   
        case 1:
        account ac = new account();
        ac.getaccnt();
        break;
        case 2:
        salary slr = new salary();
        slr.getsals();
        break; 
        case 3:
        ageCalcu ag = new ageCalcu();
        ag.getAge();
        break; 
        case 4:
        receipt rp = new receipt();
        rp.getreceipt();
        break; 
        case 5:
        grade grd = new grade();
        grd.getgrade();
        break;
      }   
}

    }
    
 
