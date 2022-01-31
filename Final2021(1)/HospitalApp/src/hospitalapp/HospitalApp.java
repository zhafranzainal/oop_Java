package hospitalapp;

import java.util.Scanner;

public class HospitalApp{

    public static void main(String[] args){
        
        String name="";
        int age=0;
        String gender="";
        Assignment hospital = new Assignment();
        
        while(true){
        
            System.out.println("WELCOME TO KUANTAN HOSPITAL DOCTOR-PATIENT SYSTEM"
                + "\n\n MENU:"
                + "\n 1. Add Patient "
                + "\n 2. Add Doctor "
                + "\n 3. Assign Doctor to Patients"
                + "\n 4. Show Doctor and Their Patients ");
            
            System.out.print("\nEnter your choice: ");
            int choice = getScanner().nextInt();
        
            switch (choice){
            
                case 1: System.out.println("\nYour choice is " +choice);
                        System.out.println("Please add patient info\n");
                        Scanner s1=getScanner();
        
                        System.out.print("Name    : ");
                        name=s1.next();
        
                        System.out.print("Age     : ");
                        age=s1.nextInt();
        
                        System.out.print("Gender  : ");
                        gender=s1.next();
        
                        Patient patient = new Patient(name, age, gender);
        
                        System.out.print("\nDisease: 1) Cancer, 2) Diabetes, 3) Heart Attack \n");
                        String disease="";
                        
                        System.out.print("Enter disease choice: ");
                        int point1=s1.nextInt();
        
                        if(point1==1){
                            disease=Disease.CANCER;}
        
                        else if(point1==2){
                            disease=Disease.DIABETES;}
        
                        else if(point1==3){
                            disease=Disease.HEART;}
        
                        patient.setDisease(disease);
                        patient.print();
                        hospital.addPatient(patient);
                        
                        System.out.println("\nPress Enter to continue...");
                        try{
                            System.in.read();}  
                        catch(Exception e){}
                        
                        break;
        
                case 2: System.out.println("\nYour choice is " +choice);
                        System.out.println("Please add doctor info\n");
                        Scanner s2=getScanner();
        
                        System.out.print("Name    : ");
                        name=s2.next();
        
                        System.out.print("Age     : ");
                        age=s2.nextInt();
        
                        System.out.print("Gender  : ");
                        gender=s2.next();
        
                        Doctor doctor = new Doctor(name, age, gender);
        
                        System.out.print("\nExpertise: 1) Cancer, 2) Diabetes, 3) Heart Attack \n");
                        String speciality="";
                        
                        System.out.print("Enter disease choice: ");
                        int point2=s2.nextInt();
        
                        if(point2==1){
                            speciality=Disease.CANCER;}
                        else if(point2==2){
                            speciality=Disease.DIABETES;}
                        else if(point2==3){
                            speciality=Disease.HEART;}
        
                        doctor.setExpertise(speciality);
                        doctor.print();
                        hospital.addDoctor(doctor);
                        
                        System.out.println("\nPress Enter to continue...");
                        try{
                            System.in.read();}  
                        catch(Exception e){}
                        
                        break;
        
                case 3: hospital.assignPatientToDoctor();
                        System.out.println("\nAssigned!\n");
                        break;
        
                case 4: hospital.showDoctorsAndPatients();
                        System.exit(0);
                        break;
            }
        }
        
    }
    
    private static Scanner getScanner(){
        Scanner cin = new Scanner(System.in);
        return cin;}
    
}