package teves;
public class salaries {
  String eid , name; 
  int hour; 
  double deduct,rate;
   
  public void addsala(String seid,String sname, double srate, int shour, double sded){
      this.eid = seid;
      this.name = sname;
      this.rate = srate;
      this.hour = shour;
      this.deduct = sded;
      
  }
  public void viewsala(){
      
      double gross = rate*hour;
      double netp = gross - deduct;
      
      System.out.printf("| %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |",
      "ID", "NAME" , "RATE" , "HOURS" , "GROSS" ,"DEDUCT","NETPAY") ;    
      System.out.printf("\n| %-10s | %-10s | %-10.2f | %-10d | %-10.2f | %-10.2f | %-10.2f |",
      this.eid , this.name , this.rate , this.hour , gross , this.deduct ,netp) ;
  
  }
  
  
}
