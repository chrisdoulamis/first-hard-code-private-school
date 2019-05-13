package project_1o;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

public class Assignment {
     String title;
     String description;
     String imera;
     int oral_mark;
     int total_mark;
     List<String> tt=new ArrayList();
     private static int sum;
   
   public Assignment(){
       sum++;
   }
   
   public Assignment(String title , String description , String imera ,int oral_mark , int total_mark){
       this.title=title;
       this.description=description;
       this.imera=imera;
       this.oral_mark=oral_mark;
       this.total_mark=total_mark;
       this.tt.add(imera);
   }
   
   public void setImera(String imera){
   
       this.imera=imera;
   }
   
   public List<String> getListaImeres(){
       return tt;
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
   
   public void setDescription(String description){
       this.description=description;
   }
   
    public String getDescription(){
       return description;
   }
    
    public void setOral_mark(int oral_mark){
       this.oral_mark=oral_mark;
   }
   
    public int getOral_mark(){
       return oral_mark;
   }
    
    public void setTotal_mark(int total_mark){
       this.total_mark=total_mark;
   }
   
    public int getTotal_mark(){
       return total_mark;
   }

    @Override
    public String toString() {
        return "Assignment{" + "title=" + title + ", description=" + description + ", oral_mark=" + oral_mark + ", total_mark=" + total_mark + '}';
    }
    
}
