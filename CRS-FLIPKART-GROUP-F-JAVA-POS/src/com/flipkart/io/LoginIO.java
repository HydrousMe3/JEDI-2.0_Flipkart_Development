package com.flipkart.io;

import java.util.Scanner;

public class LoginIO {
    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter uname:");
        String uname = sc.nextLine();

        System.out.println("Enter pswd:");
        String pswd = sc.nextLine();

        System.out.println("Enter role:");
        String roll = sc.nextLine();

        Menu menu = null;

        switch (roll) {
            case "Student":
                menu = new StudentMenu();
                break;

            case "Professor":
                menu = new ProfessorMenu();
                break;

            case "Admin":
                menu = new AdminMenu();
                break;
        
            default:
                break;
        }

        if (menu != null) {
            menu.set(uname, pswd);
            if (menu.valid(uname, pswd)) {
                menu.run();
            } else {
                System.out.println("Invalid credentials");
            }
        }
        
        sc.close();
    }
}
