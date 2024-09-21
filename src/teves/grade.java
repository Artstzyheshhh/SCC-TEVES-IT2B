package teves;

import java.util.Scanner;
public class grade{

public void getgrade(){  
    Scanner sc = new Scanner(System.in);
    grades[] grds = new grades [100];
   
    
    System.out.print("Enter no of students: ");
    int g = sc.nextInt();
    
    for(int i=0; i<g; i++){
        
        grds[i] = new grades();
        System.out.printf("---------------------------------------------------------------------------------------------------------\n");
        System.out.println("Enter details of students "+(i+1)+": ");
        System.out.print("Enter ID:");
        int id = sc.nextInt();
        System.out.print("Enter student name:");
        String name = sc.next();
        System.out.print("Enter prelim:");
        double p = sc.nextDouble();
        System.out.print("Enter midterm:");
        double m = sc.nextDouble();
        System.out.print("Enter prefi:");
        double pf = sc.nextDouble();
        System.out.print("Enter finals:");
        double f = sc.nextDouble();
        
        grds[i].addgrades(name, id, p ,m ,pf, f);
    }
     System.out.printf("\n---------------------------------------------------------------------------------------------------------\n");
     System.out.printf("| %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |",
      "NAME", "ID" , "PRELIM" , "MIDTERM" , "PREFI" ,"FINALS","AVERAGE","REMARKS") ;   
     System.out.printf("\n---------------------------------------------------------------------------------------------------------");
      for(int i=0; i<g; i++){
      grds[i].viewgrades();
      
      }
    System.out.printf("\n---------------------------------------------------------------------------------------------------------\n");
    }
    
    
}

