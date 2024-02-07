package com.company;
import java.util.Scanner;
class Dep{
    Scanner input=new Scanner(System.in);
    public void Dep_Display(){
        int a,i;
        Department DEP;
        do{
        System.out.println("Departments in our Hospital are:1.Cardiology\n2.Neurology\n3.Eye\n4.Dental\n5.ICU/CCU\n6.Lab");
        System.out.println("See Details Of:");
        a=input.nextInt();
        switch (a){
            case 1:
                DEP=new Cardialogy_Dep();
                DEP.dep_info();
                DEP.Services_available();
            break;
            case 2:
                DEP=new Neurology_Dep();
                DEP.dep_info();
                DEP.Services_available();
            break;
            case 3:
                DEP=new Eye_Dep();
                DEP.dep_info();
                DEP.Services_available();
            break;
            case 4:
                DEP=new Dentistry_Dep();
                DEP.dep_info();
                DEP.Services_available();
            break;
            case 5:
                DEP=new ICU_Dep();
                DEP.dep_info();
                DEP.Services_available();
            break;
            case 6:
                DEP=new Lab();
                DEP.dep_info();
                DEP.Services_available();
            break;
            default:
                System.out.println("Enter Valid Option From(1,2,3,4,5,6)");
            break;
        }
        System.out.println("To See Department info Again press 1");
        i= input.nextInt();
        }while (i==1);
    }
}
public abstract class Department {
    public abstract void dep_info();
    public abstract void Services_available();
}
class Cardialogy_Dep extends Department{
    public void dep_info() {
        System.out.println("It deals with the treatment of Disorders of heart and blood vessesls");
        System.out.println("This field includes medical diagonosis,treatment of congetial heart defects,heart faliure,valvular heart disease");
    }
    public void Services_available() {
        System.out.println("Services available are:\n1.Angiography\n2.Heart Surgery\n3.CT of heart\n4.ECG test\n5.BP checkup");
    }
}
class Neurology_Dep extends Department{
    public void dep_info() {
        System.out.println("Deals with the study and Treatment of disorders of the nervous system");
        System.out.println("Diagnosis and treatment of all categories of disease involving central and peripheral nervous system");
    }
    public void Services_available() {
        System.out.println("Facilities available are:\n1.Computed Axial Tomography scans\n2.Magnetic source imaging(MRI)\n3.Ultrasound of major blood vessels of head and neck");
    }
}
class Dentistry_Dep extends Department{
    public void dep_info() {
        System.out.println("Deals with the diagnosis,disorders,prevention and treatment of diseases of oral cavity");
    }
    public void Services_available() {
        System.out.println("Treatments available are:\n1.Braces\n2.Tooth implant\n3.Bridge of teeth\n4.Tooth extraction\n5.Filling\n6.Scaling and root planting");
    }
}
class Eye_Dep extends Department{
    public void dep_info() {
        System.out.println("Ophthamology deals with diagnosis and treatment of eye disorders");
    }
    public void Services_available() {
        System.out.println("Tests For eye available:\n1.Eye examination\n2.OCT scans\n3.Eyesight check\n4.Ultrasonography of eye\n5.Eye surgery");
    }
}
class ICU_Dep extends Department{
    public void dep_info() {
        System.out.println("Special department in hospital that provide intensive care medicines");
        System.out.println("Patients with life threatening illness or injuries who require constant care and supervision and life support equipment");
    }
    public void Services_available() {
        System.out.println("ICU or CCU include vey critical operations i-e:\nVentilator(lung Support)\nhemodylasis(Renal support)\nIntra-Aortic(cardiac support)");
    }
}
class OR extends Department{
    public void dep_info() {
        System.out.println("Here Surgical Operations are carried out");
    }
    public void Services_available() {
        System.out.println("1.Eye surgery\t2.Heart Surgery etc");
    }
}
class Lab extends Department{
    public void dep_info() {
        System.out.println("Tests are carried out to obtain info about the patient's health to aid in diagnosis,treatment or prevention of disease");
    }
    public void Services_available() {
        System.out.println("Facilities Of lab:\n1.Blood Testing(Complete Blood Picture)\n2.Cholestrol level testing\n3.Liver fat testing\n4.Examination of blood sugar etc");
    }
}