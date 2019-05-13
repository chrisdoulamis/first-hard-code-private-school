
package project_1o;

import java.util.ArrayList;
import java.util.List;
//import static javax.swing.UIManager.get;

public class StudenPerCourse {
    List <Studen> stp1=new ArrayList<>(); //evala <>
    List <Studen> stp2=new ArrayList<>();
    List <Studen> stp3=new ArrayList<>();
    List <Studen> stp4=new ArrayList<>();
    List <Studen> stp5=new ArrayList<>();
    List <Studen> stp6=new ArrayList<>();
    int a;
//    public StudenPerCourse(){
//        this.stp5=this.stp1.add(stp2);
//        
//    }
    
    public void setStp(Studen studen , String stream , String type){
        if("java".equals(stream)&&"full".equals(type)){
            //this.stp1=(List<Studen>) studen;
            this.stp1.add(studen);
        }else if("java".equals(stream)&&"part".equals(type)){
            //this.stp2=(List<Studen>) studen;
            this.stp2.add(studen);
        }else if("c#".equals(stream)&&"full".equals(type)){
            //this.stp3=(List<Studen>) studen;
            this.stp3.add(studen);
            //this.stp3=studen;
        }else {
            //this.stp4=(List<Studen>) studen;
            this.stp4.add(studen);
        }
    }
    
    
    
    public void setStp5(List<Studen>stp1 , List<Studen>stp2, List<Studen>stp3,List<Studen>stp4){
        stp1.forEach((i) -> {
            this.stp5.add(i);
        });
        stp2.forEach((i) -> {
            this.stp5.add(i);
        });
        stp3.forEach((i) -> {
            this.stp5.add(i);
        });
        stp4.forEach((i) -> {
            this.stp5.add(i);
        });
        for(int j=1;j<stp5.size();j++){
            //a=0;
            for(Studen i : stp5){
                if(stp5.get(j)==i && stp5.get(j)!=null){
                    stp6.add(i);
                    stp5.set(j, null);
                }
            }
        }
        
    }
    
    public List<Studen> getStp1() {
        return stp1;
    }

    public List<Studen> getStp2() {
        return stp2;
    }

    public List<Studen> getStp3() {
        return stp3;
    }

    public List<Studen> getStp4() {
        return stp4;
    }
    
    public List<Studen> getStp5(){
        return stp5;
    }
    
    public List<Studen> getStp6(){
        return stp6;
    }

//    @Override
//    public String toString() {
//        return "StudenPerCourse{" + "Full Java=" + stp1 + ", Part Java=" + stp2 + ", Full C#=" + stp3 + ", Part C#=" + stp4 + '}';
//    }
    
    
}
