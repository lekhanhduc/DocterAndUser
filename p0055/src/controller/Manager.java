/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Doctor;

/**
 *
 * @author lekha
 */
public class Manager {

    Validation vl = new Validation();

     public int menu() {
        System.out.println("1.Add Dotor");
        System.out.println("2.Update Dotor");
        System.out.println("3.Delete Doctor");
        System.out.println("4.Search Doctor");
        System.out.println("5.Exit");
        System.out.println("Enter Choice: ");
        int choice = vl.checkInputIntLimit(1, 5);
        return choice;
    }
    public void createDoctor(ArrayList<Doctor> dt) {
        System.out.println("Enter code: ");
        String code = vl.checkInputString();
        if (!vl.checkCodeExist(dt, code)) {
            System.err.println("Code Exits");
            return;
        }
        System.out.println("Enter name: ");
        String name = vl.checkInputString();
        System.out.println("Enter Specialization: ");
        String specialization = vl.checkInputString();
        System.out.println("Enter Availability: ");
        int Availability = vl.checkInputInt();
        if (!vl.checkDuplicate(dt, code, name, specialization, Availability)) {
            System.err.println("Duplicate");
        }
        dt.add(new Doctor(code, name, specialization, Availability));

    }

    
    public void updateDoctor(ArrayList<Doctor> dt) {
        System.out.println("Enter code");
        String code = vl.checkInputString();
        if (vl.checkCodeExist(dt, code)) {
            System.err.println("Not found Doctor");
            return;
        }
        System.out.print("Enter code: ");
        String codeUpdate = vl.checkInputString();
        Doctor doctor = getDoctorByCode(dt, code);
        System.out.println("Enter name: ");
        String name = vl.checkInputString();
        System.out.println("Enter Specialization: ");
        String Specialization = vl.checkInputString();
        System.out.println("Enter Availability:");
        int Availability = vl.checkInputInt();
        if (!vl.checkChangeInfo(doctor, code, name, Specialization, Availability)) {
            System.err.println("No change");
            return;
        }
        doctor.setCode(codeUpdate);
        doctor.setName(name);
        doctor.setSprecialization(Specialization);
        doctor.setAvailability(Availability);
        System.err.println("Update successful");
    }

    public  Doctor getDoctorByCode(ArrayList<Doctor> ld, String code) {
        for (Doctor doctor : ld) {
            if (doctor.getCode().equalsIgnoreCase(code)) {
                return doctor;
            }
        }
        return null;
    }

    
    public void deleteDoctor(ArrayList<Doctor> dt) {
        System.out.println("Enter code:");
        String code = vl.checkInputString();
        Doctor doctor = getDoctorByCode(dt, code);
        if (doctor == null) {
            System.err.println("Not found doctor.");
            return;
        } else {
            dt.remove(doctor);
        }
        System.err.println("Delete successful.");
    }

    
    public void searchDoctor(ArrayList<Doctor> dt) {
        System.out.print("Enter name: ");
        String nameSearch = vl.checkInputString();
        ArrayList<Doctor> listFoundByName = listFoundByName(dt, nameSearch);
        if (listFoundByName.isEmpty()) {
            System.err.println("List empty.");
        } else {
            System.out.printf("%-10s%-15s%-25s%-20s\n", "Code", "Name",
                    "Specialization", "Availability");
            for (Doctor doctor : listFoundByName) {
                System.out.printf("%-10s%-15s%-25s%-20d\n", doctor.getCode(),
                        doctor.getName(), doctor.getSprecialization(),
                        doctor.getAvailability());
            }
        }
    }

    public  ArrayList<Doctor> listFoundByName(ArrayList<Doctor> ld, String name) {
        ArrayList<Doctor> listFoundByName = new ArrayList<>();
        for (Doctor doctor : ld) {
            if (doctor.getName().contains(name)) {
                listFoundByName.add(doctor);
            }
        }
        return listFoundByName;
    }

    
   
}
