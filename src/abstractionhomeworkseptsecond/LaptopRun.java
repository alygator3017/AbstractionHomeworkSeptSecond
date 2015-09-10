/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractionhomeworkseptsecond;

import java.util.Scanner;

/**
 *
 * @author Alyson
 */
public class LaptopRun {

    public static void main(String[] args) {

        Laptop laptop = new Laptop();

        System.out.println("Would you like to open your laptop?");
        Scanner keyboard = new Scanner(System.in);
        String openLaptop = keyboard.next();
        openLaptop = openLaptop.toLowerCase();

        while (!openLaptop.equals("yes") && !openLaptop.equals("no")) {
            System.out.println("invalid entry, please use yes or no");
            System.out.println("Would you like to open your laptop?");
            openLaptop = keyboard.next().toLowerCase();
        }
        if (openLaptop.equals("yes")) {
            laptop.setOpen(true);
            laptop.setClose(false);
            System.out.println("laptop is open");
        } else {
            laptop.setClose(true);
            laptop.setOpen(false);
            System.exit(0);
        }

        if (laptop.isOpen() == true) {
            System.out.println("Would you like to turn your laptop on?");
            String power = keyboard.next().toLowerCase();

            while (!power.equals("yes") && !power.equals("no")) {
                System.out.println("invalid entry, please use yes or no");
                System.out.println("Would you like to turn your laptop on?");
                power = keyboard.next().toLowerCase();
            }
            if (power.equals("yes")) {
                laptop.turnOn();
            } else {
                System.out.println("I'm not sure what you are doing, why did you open the latop?");
                System.out.println("would you like to close the laptop?");
                openLaptop = keyboard.next().toLowerCase();
                while (!openLaptop.equals("yes") && !openLaptop.equals("no")) {
                    System.out.println("invalid entry, please use yes or no");
                    System.out.println("Would you like to close your laptop?");
                    openLaptop = keyboard.next().toLowerCase();
                }
                if (openLaptop.equals("yes")) {
                    laptop.setOpen(false);
                    laptop.setClose(true);
                    System.out.println("laptop is closed, goodbye");
                    System.exit(0);
                } else {
                    laptop.setClose(false);
                    laptop.setOpen(true);
                    //will fix later.... still deciding what to do.
                    System.exit(0);
                }

            }

        }

    }

}
