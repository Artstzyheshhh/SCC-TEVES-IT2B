package teves;

public class accounts {
   String id, last, first, email, user, pass; 
   
  public void addaccounts(String sid,String slast,String sfirst,String semail,String suser,String spass){
      this.id = sid;
      this.last = slast;
      this.first= sfirst;
      this.email = semail;
      this.user = suser;
      this.pass = spass;
  }
  public void viewaccounts(){
      System.out.printf("| %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |",
      "ID", "firstname" , "lastname" , "email" , "username" ,"password") ;
      
      System.out.printf("\n| %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |",
      this.id , this.last , this.first , this.email , this.user , this.pass) ;
  
  }
  

  
}

