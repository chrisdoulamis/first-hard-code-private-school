
package project_1o;

public class Course {
    
    private String title;
    private String stream;
    private String type;
    private String imera;
    private int str_dd , str_mm , str_yy , end_dd , end_mm , end_yy;
    private static int sum;
    
   
   public Course(){
       sum++;
   }
   
    public Course(String title , String stream , String type ,String imera ){
        this.title=title;
        this.stream=stream;
        this.type=type;
        this.imera=imera;
    }
    
    public String getImera(){
        return imera;
    }
   
    public void setTitle(String title){
       this.title=title;
   }
   
   public String getTitle(){
       return title;
   }
   
   public void setStream(String stream){
       this.stream=stream;
   }
   
    public String getStream(){
       return stream;
   }
    
    public void setType(String type){
       this.type=type;
   }
   
   public String getType(){
       return type;
   }
   
   public void setStr_dd(int str_dd){
       this.str_dd=str_dd;
   }
   
    public int getStr_dd(){
       return str_dd;
   }
    
    public void setStr_mm(int str_mm){
       this.str_mm=str_mm;
   }
   
    public int getStr_mm(){
       return str_mm;
   }
    
    public void setStr_yy(int str_yy){
       this.str_yy=str_yy;
   }
   
    public int getStr_yy(){
       return str_yy;
   }
    
    public void setEnd_dd(int end_dd){
       this.end_dd=end_dd;
   }
   
    public int getEnd_dd(){
       return end_dd;
   }
    
    public void setEnd_mm(int end_mm){
       this.end_mm=end_mm;
   }
   
    public int getEnd_mm(){
       return end_mm;
   }
    
    public void setEnd_yy(int end_yy){
       this.end_yy=end_yy;
   }
   
    public int getEnd_yy(){
       return end_yy;
   }

    @Override
    public String toString() {
        return "Course{" + "title=" + title + ", stream=" + stream + ", type=" + type + ", imera=" + imera + '}';
    }
    
}
