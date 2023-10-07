/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.Manager;
import controller.Validation;
import java.util.ArrayList;
import model.Doctor;

/**
 *
 * @author lekha
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Doctor> dt = new ArrayList<>();
        Manager mng = new Manager();
        while (true) {
            int choice = mng.menu();
            switch (choice) {
                case 1 -> mng.createDoctor(dt);
                case 2 -> mng.updateDoctor(dt);
                case 3 -> mng.deleteDoctor(dt);
                case 4 -> mng.searchDoctor(dt);
                case 5 -> {
                    return;
                }

            }

        }
    }
}
