
package project_1o;

import java.util.ArrayList;
import java.util.List;

public class AssignmentsPerCourse {
    List <Assignment> stp1=new ArrayList();
    List <Assignment> stp2=new ArrayList();
    List <Assignment> stp3=new ArrayList();
    List <Assignment> stp4=new ArrayList();
    List <Assignment> stp5=new ArrayList();
    List <String> stp6=new ArrayList();
//    List <Assignment> stp5=new ArrayList();
//    List <Assignment> stp6=new ArrayList();
//    List <Assignment> stp7=new ArrayList();
//    List <Assignment> stp8=new ArrayList();
    
    public void setApc(Assignment assignment, String titlos){
        if("full_java_ergasia1".equals(titlos)){
            //this.stp1=(List<Studen>) studen;
            this.stp1.add(assignment);
        }else if("full_java_ergasia2".equals(titlos)){
            //this.stp2=(List<Studen>) studen;
            this.stp1.add(assignment);
        }else if("part_java_ergasia1".equals(titlos)){
            //this.stp3=(List<Studen>) studen;
            this.stp2.add(assignment);
            //this.stp3=studen;
        }else if("part_java_ergasia2".equals(titlos)){
            //this.stp4=(List<Studen>) studen;
            this.stp2.add(assignment);
        }else if("full_c#_ergasia1".equals(titlos)){
            this.stp3.add(assignment);
        }else if("full_c#_ergasia2".equals(titlos)){
            this.stp3.add(assignment);
        }else if("part_c#_ergasia1".equals(titlos)){
            this.stp4.add(assignment);
        }else{
            this.stp4.add(assignment);
        }
    }
    
    public void setStp5(Assignment assignment , String a1 ){
        this.stp5.add(assignment);
        this.stp6.add(a1);
    }
    
    public List<Assignment> getTpc1() {
        return stp1;
    }

    public List<Assignment> getTpc2() {
        return stp2;
    }

    public List<Assignment> getTpc3() {
        return stp3;
    }

    public List<Assignment> getTpc4() {
        return stp4;
    }
    
    public List<Assignment> getStp5(){
        return stp5;
    }
    
    public List<String> getStp6(){
        return stp6;
    }

//    @Override
//    public String toString() {
//        return "AssignmentsPerCourse{" + "stp1=" + stp1 + ", stp2=" + stp2 + ", stp3=" + stp3 + ", stp4=" + stp4 + '}';
//    }
    
    
}
