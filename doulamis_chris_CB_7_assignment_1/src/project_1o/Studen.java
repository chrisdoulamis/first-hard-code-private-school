
package project_1o;

public class Studen {
    
   private String fname;
   private String lname;
   private String imera;
   private int yy;
   private int mm;
   private int dd;
   private double tuition;
   private static int sum;
   
   public Studen(){  
      sum++;
   }
  
   
   public Studen(String fname , String lname , String imera , double tuition){
       this.fname=fname;
       this.lname=lname;
       this.imera=imera;
       this.tuition=tuition;
   }
   
   public void setImera(String imera){
       this.imera=imera;
   }
   
   public String getImera(){
       return imera;
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
       return lname ;
   }
   
   public void setYy(int yy){
       this.yy=yy;
   }
   
    public int getYy(){
       return yy;
   }
   
   public void setMm(int mm){
       this.mm=mm;
   }
   
    public int getMm(){
       return mm;
   }
   
   public void setDd(int dd){
       this.dd=dd;
   }
   
    public int getDd(){
       return dd;
   }
   
   public void setTuition(double tuition){
       this.tuition=tuition;
   }
   
    public double getTuition(){
       return tuition;
   }

//    @Override
//    public String toString() {
//        return "Studen{" +  fname + " " + lname + " " + dd + "/" + mm + "/" + yy + ", tuition=" + tuition + '}';
//    }
   
    @Override
    public String toString() {
        return "Studen{" +  fname + " " + lname + " " +imera+ ", tuition=" + tuition + '}';
    }
    
}
