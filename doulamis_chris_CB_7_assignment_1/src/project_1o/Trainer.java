
package project_1o;

public class Trainer {
   private String fname;
   private String lname;
   private String subject;
   private static int sum;
   
   public Trainer(){
       sum++;
   }
   
   public Trainer(String fname , String lname , String subject){
       this.fname=fname;
       this.lname=lname;
       this.subject=subject;
   }
   
    public void setFname(String fname){
       this.fname=fname;
   }
   
   public String getFname(){
       return fname;
   }
   
   public void setLname(String lname){
       this.lname=lname;
   }
   
    public String getLname(){
       return lname;
   }
   
   public void setSubject(String subject){
       this.subject=subject;
   }
   
    public String getSubject(){
       return subject;
   }

    @Override
    public String toString() {
        return "Trainer{" + "fname=" + fname + ", lname=" + lname + ", subject=" + subject + '}';
    }
    
}
