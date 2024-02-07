package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
public class Patient {
    public ArrayList<String> patients=new ArrayList<String>();
    private String name,relative,Disease;
    private int age,dep;
    private char gender;
    double CNIC;
    public void ADD_Patient(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Name:");
        name=input.next();
        System.out.println("Enter CNIC:");
        CNIC=input.nextDouble();
        System.out.println("Enter Patient's Relative Name:");
        relative=input.next();
        System.out.println("Enter Age:");
        age=input.nextInt();
        System.out.println("Gender (F/M):");
        gender=input.next().charAt(0);
        System.out.println("Problem/Disease");
        Disease=input.next();
        System.out.println("Refer To Department\n1.Cardialogy\n2.Neurology\n3.Eye\n4.Dental\n5.Lab");
        dep=input.nextInt();
        patients.add("Name "+name);
        patients.add("Relative's Name "+relative);
        patients.add("\nGender: "+gender);
        patients.add("\nDisease: "+Disease);
        switch (dep){
            case 1:
                patients.add("Department: Cardialogy");
                try {
                    FileWriter g = new FileWriter("Heart_Patients.txt",true);
                    g.write(String.valueOf(patients));
                    System.out.println("Written");
                    g.close();
                } catch (IOException e) {
                    System.out.println("Error ");
                    e.printStackTrace();
                }
                break;
            case 2:
                patients.add("Department: Neurology");
                try {
                    FileWriter g = new FileWriter("Brain_Patients.txt",true);
                    g.write(String.valueOf(patients));
                    System.out.println("Written");
                    g.close();
                } catch (IOException e) {
                    System.out.println("Error ");
                    e.printStackTrace();
                }
                break;
            case 3:
                patients.add("Department: Eye");
                try {
                    FileWriter g = new FileWriter("Eye_Patients.txt",true);
                    g.write(String.valueOf(patients));
                    System.out.println("Written");
                    g.close();
                } catch (IOException e) {
                    System.out.println("Error ");
                    e.printStackTrace();
                }
                break;
            case 4:
                patients.add("Department: Dental");
                try {
                    FileWriter g = new FileWriter("Dental_Patients.txt",true);
                    g.write(String.valueOf(patients));
                    System.out.println("Written");
                    g.close();
                } catch (IOException e) {
                    System.out.println("Error ");
                    e.printStackTrace();
                }
                break;
            case 5:
                patients.add("Department: Lab");
                try {
                    FileWriter g = new FileWriter("Lab_Patients.txt",true);
                    g.write(String.valueOf(patients));
                    System.out.println("Written");
                    g.close();
                } catch (IOException e) {
                    System.out.println("Error ");
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("Enter From 1,2,3,4 or 5");
                break;
        }
    }

}
class view_Patients{
    Scanner input=new Scanner(System.in);
    public void ViewPatient(){
        int s;
        System.out.println("View Patient list of:\t1.1.Cardialogy\n2.Neurology\n3.Eye\n4.Dental\n5.Lab");
        s=input.nextInt();
        switch (s){
            case 1:{
                try {
                    File myObj=new File("Heart_Patients.txt");
                    Scanner myReader=new Scanner(myObj);
                    while(myReader.hasNextLine()){
                        String data= myReader.nextLine();
                        System.out.println(data);
                    }
                    myReader.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                break;}
            case 2:{
                try {
                    File myObj=new File("Brain_Patients.txt");
                    Scanner myReader=new Scanner(myObj);
                    while(myReader.hasNextLine()){
                        String data= myReader.nextLine();
                        System.out.println(data);
                    }
                    myReader.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                break;}
            case 3:{
                try {
                    File myObj=new File("Eye_Patients.txt");
                    Scanner myReader=new Scanner(myObj);
                    while(myReader.hasNextLine()){
                        String data= myReader.nextLine();
                        System.out.println(data);
                    }
                    myReader.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                break;}
            case 4:{
                try {
                    File myObj=new File("Dental_Patients.txt");
                    Scanner myReader=new Scanner(myObj);
                    while(myReader.hasNextLine()){
                        String data= myReader.nextLine();
                        System.out.println(data);
                    }
                    myReader.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                break;}
            case 5:{
                try {
                    File myObj=new File("Lab_Patients.txt");
                    Scanner myReader=new Scanner(myObj);
                    while(myReader.hasNextLine()){
                        String data= myReader.nextLine();
                        System.out.println(data);
                    }
                    myReader.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                break;}
            default:
                System.out.println("Enter From 1,2,3,4 or 5");
                break;
        }
    }
}