package project_1o;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
//edo vazo import
//
import java.sql.Time;
import static java.text.DateFormat.getTimeInstance;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import static java.time.Clock.system;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import static java.util.Collections.list;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Project_1o {

    public static void main(String[] args) {

        int dok = 0;
        int sum = 0;
        int sum_tr = 0;
        int sum_ass = 0;
        int sum_course = 0;
        int time;
        int start_elenxos;
        int month;
        double tution;
        int date;
        int age;
        int boll;
        int megethos_list;
        int bathmos;
        List<String> mathites_list_new = new ArrayList();
        List<String> mathites_list = new ArrayList();
        List<String> course_list = new ArrayList();
        List<String> assignment_list = new ArrayList();
        List<String> trainer_list = new ArrayList();
        List<String> mathites_omorfo_list = new ArrayList();

        List<Studen> studenList = new ArrayList<>();
        List<Assignment> assignmentList = new ArrayList<>();
        List<Trainer> trainerList = new ArrayList<>();
        List<Course> courseList = new ArrayList<>();

        ArrayList<String> studen_P_course1 = new ArrayList<>(); //apothikevi imerominies paradosis ton assinment
        ArrayList<String> studen_P_course2 = new ArrayList<>();//apothikevi onomata mathiton

        String a;
        String a1;
        String a2;
        String a3;

        StudenPerCourse spc = new StudenPerCourse();
        TrainerPerCourse tpc = new TrainerPerCourse();
        AssignmentsPerCourse apc = new AssignmentsPerCourse();

        Scanner input = new Scanner(System.in);
        //arxi
        do {
            System.out.println("An thes na perasis dikasou stixia pata 1 diaforetika 0");
            while (!input.hasNextInt()) {
                System.out.print("That's not a valid type. Please enter number:");
                input.next();
            }
            start_elenxos = input.nextInt();
        } while (start_elenxos != 1 && start_elenxos != 0);
        //telos
        if (1 == start_elenxos) {

            int bl = 1;//elenxos sto proto while gia to an tha bi i oxi
            do {
                sum++;
                Studen studen = new Studen();
                System.out.println("Dose to onoma tou: " + sum + "ou mathiti.");
                while (input.hasNextInt() || input.hasNextDouble()) {
                    System.out.println("Dose to onoma tou: " + sum + "ou mathiti.Oxi arithmo.");
                    input.next();
                }
                a = input.next();

                studen.setFname(a);
                //System.out.println(studen.getFname());
                //studen.setFname(input.next());
                //input.next();
                System.out.println("Dose to eponimo tou: " + sum + "ou mathiti.");
                while (input.hasNextInt() || input.hasNextDouble()) {
                    System.out.println("Dose to eponimo tou: " + sum + "ou mathiti.Oxi arithmo.");
                    input.next();
                }
                a = input.next();
                studen.setLname(a);

                System.out.println("Dose imerominia genisis mathiti " + studen.getFname() + " " + studen.getLname() + " sti morfi(dd/mm/yyy)");
                studen.setImera(input.next());
                mathites_list.add(studen.getFname() + " " + studen.getLname() + " " + studen.getImera());

                System.out.println(mathites_list);

                do {
                    System.out.println("Poso didaktron ipoliponte gia mathiti " + studen.getFname() + " " + studen.getLname());
                    while (!input.hasNextDouble()) {
                        System.out.print("That's not a valid . Please enter number : ");
                        input.next();
                    }
                    tution = input.nextDouble();
                } while (tution < 0);
                studen.setTuition(tution);//studen.setTuition(input.nextDouble());
                mathites_omorfo_list.add(studen.getFname() + " " + studen.getLname() + " me imerominia genisis " + studen.getImera() + " didaktra pou ipoliponte " + studen.getTuition());
                do {
                    sum_tr++;
                    time = 0;
                    Trainer trainer = new Trainer();
                    System.out.println("Gia ton " + studen.getFname() + " " + studen.getLname() + " Dose onoma ekpedefti :");
                    while (input.hasNextInt() || input.hasNextDouble()) {
                        System.out.println("Dose sosto to onoma ekpedefti.Oxi arithmous. ");
                        input.next();
                    }
                    a = input.next();
                    trainer.setFname(a);
                    System.out.println("Dose eponimo ekpedefti : ");
                    while (input.hasNextInt() || input.hasNextDouble()) {
                        System.out.println("Dose sosto to eponimo ekpedefti kai oxi arithmo : ");
                        input.next();
                    }
                    a = input.next();
                    trainer.setLname(a);
                    megethos_list = trainer_list.size();
                    if (sum_tr == 1) {
                        trainer_list.add(trainer.getFname());
                        trainer_list.add(trainer.getLname());
                    } else {
                        for (int i = 0; i < megethos_list - 1; i++) {

                            if (trainer_list.get(i).equals(trainer.getFname()) && trainer_list.get(i + 1).equals(trainer.getLname())) {
                                time = 1;
                            }
                        }
                        if (time != 1) {
                            trainer_list.add(trainer.getFname());
                            trainer_list.add(trainer.getLname());
                        }
                    }
                    //System.out.println(trainer_list);
                    System.out.println(studen.getFname() + " " + studen.getLname() + ": thema mathimatos : ( java-full / java-part / c#-full / c#-part ) ");
                    while (input.hasNextInt() || input.hasNextDouble()) {
                        System.out.println("Dose thema mathimatos ekpedefti. java-full /c#-full / java-part /c#-part ");
                        input.next();
                    }
                    a = input.next();
                    trainer.setSubject(a);

                    tpc.setTpc(trainer, a); //edo

                    do {
                        System.out.println("Gia nea enxrafi pata 1 alios 0. ");
                        while (!input.hasNextInt()) {
                            System.out.print("That's not a valid type. Please enter number : ");
                            input.next();
                        }
                        boll = input.nextInt();
                    } while (boll != 1 && boll != 0);
                    //telos
                } while (boll == 1);

                do {
                    sum_ass++;
                    time = 0;
                    Assignment assignment = new Assignment();
                    System.out.println("Titlos Ergasias gia " + studen.getFname() + " " + studen.getLname() + " Pithani titli : (full_java_ergasia1 , full_java_ergasia2 , part_java_ergasia1 , part_java_ergasia2 , full_c#_ergasia1 , full_c#_ergasia2 , part_c#_ergasia1 , part_c#_ergasia2) ");
                    while (input.hasNextInt() || input.hasNextDouble()) {
                        System.out.println("Dose titlo ergasias.(full_java_ergasia1 , full_java_ergasia2 , part_java_ergasia1 , part_java_ergasia2 , full_c#_ergasia1 , full_c#_ergasia2 , part_c#_ergasia1 , part_c#_ergasia2) ");
                        input.next();
                    }
                    a3 = input.next();
                    assignment.setTitle(a3);

                    megethos_list = assignment_list.size();
                    if (sum_ass == 1) {
                        assignment_list.add(assignment.getTitle());

                    } else {
                        for (int i = 0; i < megethos_list; i++) {

                            if (assignment_list.get(i).equals(assignment.getTitle())) {

                                time = 1;
                            }
                        }
                        if (time != 1) {
                            assignment_list.add(assignment.getTitle());

                        }
                    }
                    //System.out.println(assignment_list);

                    System.out.println(studen.getFname() + " " + studen.getLname() + "dose desription : ");
                    while (input.hasNextInt() || input.hasNextDouble()) {
                        System.out.println("Dose sosto deskription. ");
                        input.next();
                    }
                    a = input.next();
                    assignment.setDescription(a);
                    //
                    System.out.println("O " + studen.getFname() + " " + studen.getLname() + " prepi na paradosis ergasias stis: dd/mm/yyyy ");
                    while (input.hasNextInt() || input.hasNextDouble()) {
                        System.out.println("Dose imerominia stin morfi(dd/mm/yyyy) ");
                        input.next();
                    }
                    a = input.next();
                    assignment.setImera(a);
                    studen_P_course1.add(a);        //listt opou apothikevi imerominies san string
                    studen_P_course2.add(studen.getFname() + " " + studen.getLname());//list pou apothikevi onomata

                    //
                    do {
                        System.out.print(studen.getFname() + " " + studen.getLname() + "dose Oral Mark");
                        while (!input.hasNextInt()) {
                            System.out.print("That's not a valid. Please enter Oral Mark : ");
                            input.next();
                        }
                        bathmos = input.nextInt();
                    } while (bathmos <= 0 || bathmos > 100);
                    assignment.setOral_mark(bathmos);

                    do {
                        System.out.print(studen.getFname() + " " + studen.getLname() + "dose Total Mark");
                        while (!input.hasNextInt()) {
                            System.out.print("That's not a valid . Please enter Total Mark : ");
                            input.next();
                        }
                        bathmos = input.nextInt();
                    } while (bathmos <= 0 || bathmos > 100);
                    assignment.setTotal_mark(bathmos);

                    apc.setApc(assignment, a3);
                    //a1=studen.getFname();
                    //a2=studen.getLname();
                    apc.setStp5(assignment, studen.getFname() + " " + studen.getLname());
                    //System.out.println("gia nea enxrafi pata 1 alios 0");
                    //boll = input.nextInt();
                    //arxi elenxou
                    do {
                        System.out.println("Gia nea enxrafi pata 1 alios 0. ");
                        while (!input.hasNextInt()) {
                            System.out.print("That's not a valid type. Please enter number : ");
                            input.next();
                        }
                        boll = input.nextInt();
                    } while (boll != 1 && boll != 0);
                    //telos
                } while (boll == 1);

                do {
                    sum_course++;
                    time = 0;
                    Course course = new Course();
                    System.out.println("Titlos course gia ton mathiti : " + studen.getFname() + " " + studen.getLname());
                    while (input.hasNextInt() || input.hasNextDouble()) {
                        System.out.println("Dose sosto titlo course. ");
                        input.next();
                    }
                    a = input.next();
                    course.setTitle(a);//edo alaksa
                    System.out.println("Gia ton " + studen.getFname() + " " + studen.getLname() + "dose Striam course :(java/c#). ");
                    while (input.hasNextInt() || input.hasNextDouble()) {
                        System.out.println("Dose sosto stream course.java/c# ");
                        input.next();
                    }
                    a = input.next();
                    a1 = a;
                    course.setStream(a);
                    System.out.println("Gia ton " + studen.getFname() + " " + studen.getLname() + " type course :(full/part). ");
                    while (input.hasNextInt() || input.hasNextDouble()) {
                        System.out.println("Dose type of course :(full/part) ");
                        input.next();
                    }
                    a = input.next();
                    a2 = a;
                    course.setType(a);

                    //StudenPerCourse spc = new StudenPerCourse();
                    spc.setStp(studen, a1, a2);
                    //System.out.println(spc.getStp1());
                    //tpc.setTpc(trainer,a1,a2);

                    //megethos_list = trainer_list.size();
                    if (sum_course == 1) {
                        course_list.add(course.getStream());
                        course_list.add(course.getType());

                    } else {
                        for (int i = 0; i < course_list.size() - 1; i = i + 2) { //edo i++ alaksa
                            //a=trainer_list.get(i);
                            if (course_list.get(i).equals(course.getStream()) && course_list.get(i + 1).equals(course.getType())) {
                                time = 1;

                            }
                        }
                        if (time != 1) {
                            course_list.add(course.getStream());
                            course_list.add(course.getType());

                        }
                    }

                    //System.out.println(course_list);
                    do {
                        System.out.println("Dose tin mera arxis tou course (apo 0-31). ");
                        while (!input.hasNextInt()) {
                            System.out.print("That's not a valid date. Please enter date:(apo 0-31). ");
                            input.next();
                        }
                        date = input.nextInt();
                    } while (date < 0 || date > 31);
                    course.setStr_dd(date);

                    do {
                        System.out.print("Dose ton mina arxis tou course " + studen.getFname() + " " + studen.getLname() + " (apo 1-12). ");
                        while (!input.hasNextInt()) {
                            System.out.print("That's not a valid month. Please enter month : ");
                            input.next();
                        }
                        month = input.nextInt();
                    } while (month < 0 || month > 12);
                    course.setStr_mm(month);

                    do {
                        System.out.print("Arxi course xronologia (imeerominies apo 2016 kai pano) " + studen.getFname() + " " + studen.getLname()+" ");
                        while (!input.hasNextInt()) {
                            System.out.print("That's not a valid year. Please enter year : ");
                            input.next();
                        }
                        age = input.nextInt();
                    } while (age < 2016);
                    course.setStr_yy(age);

                    do {
                        System.out.println("Imera liksis tou course. ");
                        while (!input.hasNextInt()) {
                            System.out.print("That's not a valid date. Please enter date : ");
                            input.next();
                        }
                        date = input.nextInt();
                    } while (date < 0 || date > 31);
                    course.setStr_dd(date);

                    do {
                        System.out.print("Telefteos minas tou course gia " + studen.getFname() + " " + studen.getLname()+" : ");
                        while (!input.hasNextInt()) {
                            System.out.print("That's not a valid month. Please enter month : ");
                            input.next();
                        }
                        month = input.nextInt();
                    } while (month < 0 || month > 12);
                    course.setStr_mm(month);

                    do {
                        System.out.print("Telos course , xronologia (Imerominia apo 2016 kai Meta) " + studen.getFname() + " " + studen.getLname() + "(px 2017). ");
                        while (!input.hasNextInt()) {
                            System.out.print("That's not a valid year. Please enter year : ");
                            input.next();
                        }
                        age = input.nextInt();
                    } while (age < 2019);
                    course.setStr_yy(age);

                    //System.out.println("gia nea enxrafi pata 1 alios 0");
                    // boll = input.nextInt();
                    //arxi elenxou
                    do {
                        System.out.println("Gia nea enxrafi pata 1 alios 0. ");
                        while (!input.hasNextInt()) {
                            System.out.print("That's not a valid type. Please enter number : ");
                            input.next();
                        }
                        boll = input.nextInt();
                    } while (boll != 1 && boll != 0);
                    //telos
                } while (boll == 1);

                for (int i = 0; i < (course_list.size() / 2); i++) {
                    //a1=course_list[2*i];

                    mathites_list_new.add(course_list.get(2 * i) + " " + course_list.get(2 * i + 1));
                }
                System.out.println(mathites_list_new);

                //arxi elenxou
                do {
                    System.out.println("Pata 1 gia na valis " + sum + "o studen diafoerika 0!");
                    while (!input.hasNextInt()) {
                        System.out.print("That's not a number 0 or 1. Please enter 0 or 1 : ");
                        input.next();
                    }
                    bl = input.nextInt();
                } while (bl != 1 && bl != 0);
                //telos
            } while ((bl == 1));

            //StudenPerCourse str=new StudenPerCourse();
            // tria prota sout emanizoun to idio pragma me diafoertiko apotelesma.
            System.out.println("Oli i mathites einai : " + mathites_list);
            System.out.println("Oli i mathites einai : " + mathites_list_new);
            System.out.println("Oli i Studens : " + mathites_omorfo_list);
            
            System.out.println("oli i trainers einai : " + trainer_list);
            
            System.out.println("ola ta course einai : " + course_list);
            
            System.out.println("ola ta assignment einai : " + assignment_list);
            
            System.out.println("Stin full-java parakolouthoun i : " + spc.getStp1());
            System.out.println("Stin part-java parakolouthoun i : " + spc.getStp2());
            System.out.println("Stin full-c# parakolouthoun i : " + spc.getStp3());
            System.out.println("Stin part-c# parakolouthoun i : " + spc.getStp4());
            
            System.out.println("Full java didaskoun " + tpc.getTpc1());
            System.out.println("Part java didaskoun " + tpc.getTpc2());
            System.out.println("Full c# didaskoun " + tpc.getTpc3());
            System.out.println("Part c# didaskoun " + tpc.getTpc4());
            
            System.out.println("Assignment gia full-java : " + apc.getTpc1());
            System.out.println("Assignment gia part-java : " + apc.getTpc2());
            System.out.println("Assignment gia full-c# : " + apc.getTpc3());
            System.out.println("Assignment gia part-c# : " + apc.getTpc4());

            for (int i = 0; i < sum; i++) {
                System.out.println(apc.getStp6().get(i) + " ta assignments sou einai : " + apc.getStp5().get(i));
            }

            spc.setStp5(spc.getStp1(), spc.getStp2(), spc.getStp3(), spc.getStp4());
            System.out.println(spc.getStp6());
        } else {
            System.out.println("etima sinthetic dada");
            Studen s11 = new Studen("Chirs1", "Doulamis1", "02/04/1992", 1001);
            Studen s22 = new Studen("Chirs2", "Doulamis2", "03/04/1992", 1002);
            Studen s33 = new Studen("Chirs3", "Doulamis3", "04/04/1992", 1003);
            Studen s44 = new Studen("Chirs4", "Doulamis4", "05/04/1992", 1004);
            Studen s55 = new Studen("Chirs5", "Doulamis5", "06/04/1992", 1005);

            Course c11 = new Course("C_B_7", "java", "full", "4/4/2019");
            Course c22 = new Course("C_B_7", "java", "part", "4/5/2019");
            Course c33 = new Course("C_B_7", "c#", "full", "4/4/2019");
            Course c44 = new Course("C_B_7", "c#", "part", "4/5/2019");

            Trainer t11 = new Trainer("Anastasios1", "Lelakis1", "Java");
            Trainer t22 = new Trainer("Anastasios2", "Lelakis2", "C# kai Java");
            Trainer t33 = new Trainer("Anastasios3", "Lelakis3", "C#");

            Assignment a11 = new Assignment("full_java_ergasia1", "O.O.P", "11/6/2019", 20, 80);
            Assignment a22 = new Assignment("part_java_ergasia1", "O.O.P", "18/6/2019", 20, 80);
            Assignment a33 = new Assignment("full_c#_ergasia1", "O.O.P", "11/6/2019", 20, 80);
            Assignment a44 = new Assignment("part_java_ergasia1", "O.O.P", "18/6/2019", 20, 80);

            studenList.add(s11);
            studenList.add(s22);
            studenList.add(s33);
            studenList.add(s44);
            studenList.add(s55);

            courseList.add(c11);
            courseList.add(c22);
            courseList.add(c33);
            courseList.add(c44);

            trainerList.add(t11);
            trainerList.add(t22);
            trainerList.add(t33);

            assignmentList.add(a11);
            assignmentList.add(a22);
            assignmentList.add(a33);
            assignmentList.add(a44);

            System.out.println(studenList);
            System.out.println(courseList);
            System.out.println(trainerList);
            System.out.println(assignmentList);

            System.out.println("gia full-java einai: " + s11 + " " + s22);
            System.out.println("gia part-java einai: " + s33 + " " + s44);
            System.out.println("gia full-c# einai: " + s55 + " " + s11);
            System.out.println("gia part-c# einai: 0 atoma");

            System.out.println("gia full-java mathima kani : " + t11);
            System.out.println("gia part-java mathima kani : " + t22);
            System.out.println("gia full-c# mathima kani : " + t33);
            System.out.println("gia part-c# mathima kani : " + t33);

            System.out.println("gia full java to assignment einai : " + a11);
            System.out.println("gia part java to assignment einai : " + a22);
            System.out.println("gia full c# to assignment einai : " + a33);
            System.out.println("gia part c# to assignment einai : " + a44);

            System.out.println("gia ton mathiti : " + s11 + " ta assignment einai " + a11 + " kai " + a33);
            System.out.println("gia ton mathiti : " + s22 + " ta assignment einai " + a11);
            System.out.println("gia ton mathiti : " + s33 + " ta assignment einai " + a22);
            System.out.println("gia ton mathiti : " + s44 + " ta assignment einai " + a22);
            System.out.println("gia ton mathiti : " + s55 + " ta assignment einai " + a33);

            System.out.println("o mathitis " + s11 + " exi pano apo dio course");
        }
        //edo pirazo mono
        //
        ArrayList<Date> date1 = new ArrayList<>();
        int summ = 0;
        int ss = 0;
        Date d = null;
        //Scanner input = new Scanner(System.in);
        ArrayList<String> dokimi = new ArrayList<>();
//        dokimi.add("3/3/2019");
//        dokimi.add("4/3/2018");
        //a.add("4/5/2000");
        dokimi = studen_P_course1; //pinkas pou exi mesa imerominies paradosis se sindiazmo me studen_P_course2 pou apothikevi ta onomata
        System.out.println("Date in this format : " + "dd/MM/yyyy");
        String dateInString = input.next();
        String dateInString_new=dateInString;
        for (String imerominies : dokimi) {
            summ = 0;
            do {
                if (summ == 1) {
                    dateInString = imerominies;
                }else{
                    dateInString=dateInString_new;
                }
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

                try {
                    d = sdf.parse(dateInString);
                } catch (ParseException ex) {
                    Logger.getLogger(Project_1o.class.getName()).log(Level.SEVERE, null, ex);
                }

                //System.out.println("Date is : " + d);
                String result = sdf.format(d);
                //System.out.println(result);
                Calendar c = Calendar.getInstance();
                c.setTime(d);
                //System.out.println(c.getTime());
                c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

                //System.out.println();
                SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");;
                Date start = c.getTime();

                //System.out.println("I arxi tis evdomadas einai : "+start);
                
                for (int i = 0; i < 4; i++) {
                    c.add(Calendar.DATE, 1);
                }

                Date end = c.getTime();
                //System.out.println("Kai i ergsimes meres tis telionoun : "+end);

                date1.add(start);
                date1.add(end);
                summ += 1;
            } while (summ != 2);

            if (date1.get(4 * ss).equals(date1.get(4 * ss + 2)) && date1.get(4 * ss + 1).equals(date1.get(4 * ss + 3))) {
                System.out.println(studen_P_course2.get(ss) + " exis na paradosis stis " + studen_P_course1.get(ss)+"!!! Kali sou epitixia.");
            } else {
                //System.out.println("false");
            }
            ss += 1;
        }
        //edo telioni
    }

}
