package teves;

public class accounts {
   String last, first, email, user, pass; 
   int id;
  public void addaccounts(int sid,String slast,String sfirst,String semail,String suser,String spass){
      this.id = sid;
      this.last = slast;
      this.first= sfirst;
      this.email= semail;
      this.user = suser;
      this.pass = spass;
  }
  public void viewaccounts(){
      
      
      System.out.printf("\n %-10d | %-10s | %-10s | %-10s | %-10s | %-10s ",
      this.id , this.last , this.first, this.email , this.user , this.pass) ;
  
  }
  
}

