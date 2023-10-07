/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;

/**
 *
 * @author lekha
 */
public class Main {
    public static void main(String[] args) {
          Manager mng = new Manager();
        while (true) {
            int choice = mng.menu();
            switch (choice) {
                case 1:
                    mng.createNewAccount();
                    break;
                case 2:
                    mng.loginSystem();
                    break;
                case 3:
                    return;
            }
        }
    }
    
    
}
