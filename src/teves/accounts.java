package teves;

public class accounts {
   String last, first, email, user, pass; 
   int nid;
  public void addaccounts(int Id,String slast,String sfirst,String semail,String suser,String spass){
      this.nid = Id;
      this.last = slast;
      this.first= sfirst;
      this.email= semail;
      this.user = suser;
      this.pass = spass;
  }
  public void viewaccounts(){
      
      
      System.out.printf("\n %-10d | %-10s | %-10s | %-10s | %-10s | %-10s ",
      this.nid , this.last , this.first, this.email , this.user , this.pass) ;
  
  }
  
}

