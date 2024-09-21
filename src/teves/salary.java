package teves;

import java.util.Scanner;
public class salary {

public void getsals(){  
    Scanner sc = new Scanner(System.in);
    salaries[] sr = new salaries[100];
    
  
    
    System.out.print("Enter no of employee: ");
    int emp = sc.nextInt();
     
    for(int i=0; i<emp; i++){
        
        sr[i] = new salaries();
        System.out.printf("--------------------------------------------------------------------------------------------\n");
        System.out.println("Enter details of employee "+(i+1)+": ");
        System.out.print("Enter ID: ");
        String eid = sc.next();
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter rate: ");
        double rate = sc.nextInt();
        System.out.print("Enter hours worked: ");
        int hour = sc.nextInt();
        System.out.print("Enter deduction: ");
        double deduct = sc.nextInt();
        
     
        
       sr[i].addsala(eid , name, rate , hour, deduct);
    }  
        System.out.printf("\n--------------------------------------------------------------------------------------------\n");
        System.out.printf("| %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |",
      "ID", "NAME" , "RATE" , "HOURS" , "GROSS" ,"DEDUCT","NETPAY") ;   
        System.out.printf("\n--------------------------------------------------------------------------------------------");
      for(int i=0; i<emp; i++){
    sr[i].viewsala(); 
    }
     System.out.printf("\n--------------------------------------------------------------------------------------------");
     double totsal = 0;
     double tnetp = 0 ;
     double toded = 0; 
      for(int i=0; i<emp; i++){
    totsal = totsal + (sr[i].rate * sr[i].hour) ;
    toded = toded + sr[i].deduct;
    tnetp = tnetp +((sr[i].rate * sr[i].hour)-sr[i].deduct);
    
    }
  
     
     System.out.println("\nTotal salary request : "+totsal);
     System.out.println("Total employee's deduction : "+toded);
     System.out.println("Total net pay : "+tnetp);
     System.out.println("No. of employees : "+emp);
     
    
}

}

