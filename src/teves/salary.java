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
        
        System.out.println("Enter details of employee "+(i+1)+": ");
        System.out.print("Enter ID:");
        String eid = sc.next();
        System.out.print("Enter name:");
        String name = sc.next();
        System.out.print("Enter rate:");
        int rate = sc.nextInt();
        System.out.print("Enter hours worked:");
        int hour = sc.nextInt();
        System.out.print("Enter deduction:");
        int deduct = sc.nextInt();
        
        
       sr[i].addsala(eid , name, rate , hour, deduct);
    }
      for(int i=0; i<emp; i++){
    sr[i].viewsala();
    }
    
    
}

}

