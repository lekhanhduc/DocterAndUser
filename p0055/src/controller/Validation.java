/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.Doctor;

/**
 *
 * @author lekha
 */
public class Validation {

    private static final Scanner sc = new Scanner(System.in);

    public int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = sc.nextInt();
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                sc.nextLine();
                return result;

            } catch (NumberFormatException e) {
                System.err.println("Input number from " + min + "to" + max);
                System.out.println("Enter again:");
            }
        }
    }

    public String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty() || result == null) {
                System.err.println("Not empty");
                System.out.println("Enter again: ");
            } else {
                return result;

            }
        }
    }

    public int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                return result;

            } catch (NumberFormatException e) {
                System.err.println("Must be input integer");
                System.out.println("Enter again: ");
            }
        }
    }
     public boolean checkCodeExist(ArrayList<Doctor> dt, String code) {
        //check from first to last list doctor
        for (Doctor doctor : dt) {
            if (code.equalsIgnoreCase(doctor.getCode())) {
                return false;
            }
        }
        return true;
}
      public boolean checkDuplicate(ArrayList<Doctor> ld, String code,
            String name, String specialization, int availability) {
        //check from first to last list doctor
        for (Doctor doctor : ld) {
            if (code.equalsIgnoreCase(doctor.getCode())
                    && name.equalsIgnoreCase(doctor.getName())
                    && specialization.equalsIgnoreCase(doctor.getSprecialization())
                    && availability == doctor.getAvailability()) {
                return false;
            }
        }
        return true;
    }
      public boolean checkChangeInfo(Doctor doctor, String code,
            String name, String specialization, int availability) {
        if (doctor.getCode().equalsIgnoreCase(code)
                && doctor.getName().equalsIgnoreCase(name)
                && doctor.getSprecialization().equalsIgnoreCase(specialization)
                && doctor.getAvailability() == availability) {
            return false;
        }
        return true;
    }
}


