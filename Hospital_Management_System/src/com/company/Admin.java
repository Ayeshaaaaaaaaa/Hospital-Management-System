package com.company;
import java.util.Scanner;
public class Admin {
    private int c;
    private char i;
    public void choose(){
        Scanner input=new Scanner(System.in);
        do {
        System.out.println("--------------------------");
        System.out.println("1.Add New Patient\n2.View Patient List\n3.Add New Doctors\n4.View Doctors List");
        System.out.println("--------------------------");
        System.out.println("Enter From 1,2,3or,4");
        c=input.nextInt();
        Patient p=new Patient();
        ADD_Doctor d=new ADD_Doctor();
        view_Doctor v=new view_Doctor();
        view_Patients x=new view_Patients();
            switch (c) {
                case 1:
                    p.ADD_Patient();
                break;
                case 2:
                    x.ViewPatient();
                break;
                case 3:
                    d.Bio_Data();
                break;
                case 4:
                    v.display();
                break;
                default:
                    System.out.println("Enter From 1,2,3 or 4");
                    break;
            }
            System.out.println("Do you want to run it again?(Y/N)");
            i=input.next().charAt(0);
        }while(i=='Y'||i=='y');
    }
}
