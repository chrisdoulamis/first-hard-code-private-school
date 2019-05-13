
package project_1o;

import java.util.ArrayList;
import java.util.List;

public class TrainerPerCourse {
    List <Trainer> stp1=new ArrayList();
    List <Trainer> stp2=new ArrayList();
    List <Trainer> stp3=new ArrayList();
    List <Trainer> stp4=new ArrayList();
    
    public void setTpc(Trainer trainer , String subject){
        if("java-full".equals(subject)){
            //this.stp1=(List<Studen>) studen;
            this.stp1.add(trainer);
        }else if("java-part".equals(subject)){
            //this.stp2=(List<Studen>) studen;
            this.stp2.add(trainer);
        }else if("c#-full".equals(subject)){
            //this.stp3=(List<Studen>) studen;
            this.stp3.add(trainer);
            //this.stp3=studen;
        }else{
            //this.stp4=(List<Studen>) studen;
            this.stp4.add(trainer);
        }
    }
    
    public List<Trainer> getTpc1() {
        return stp1;
    }

    public List<Trainer> getTpc2() {
        return stp2;
    }

    public List<Trainer> getTpc3() {
        return stp3;
    }

    public List<Trainer> getTpc4() {
        return stp4;
    }

    @Override
    public String toString() {
        return "StudenPerCourse{" + "Full Java=" + stp1 + ", Part Java=" + stp2 + ", Full C#=" + stp3 + ", Part C#=" + stp4 + '}';
    }
}
