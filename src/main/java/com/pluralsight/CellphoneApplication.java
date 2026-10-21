package com.pluralsight;

import java.util.Scanner;

public class CellphoneApplication {
    public static void main(String[] args) {
        Cellphone cellphone1 = new Cellphone();
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the serial number? ");
        cellphone1.setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        cellphone1.setModel(scanner.nextLine());

        System.out.print("Who is the carrier? ");
        cellphone1.setCarrier(scanner.nextLine());

        System.out.print("What is the phone number? ");
        cellphone1.setPhoneNumber(scanner.nextLine());

        System.out.print("Who is the owner of the phone? ");
        cellphone1.setOwner(scanner.nextLine());

        Cellphone cellphone2 = new Cellphone();
        cellphone2.setSerialNumber(123456);
        cellphone2.setModel("Samsung Phone");
        cellphone2.setCarrier("Samsung Carrier");
        cellphone2.setPhoneNumber("123-456-7890");
        cellphone2.setOwner("TZ");

        display(cellphone1);
        display(cellphone2);

        cellphone1.dial(cellphone2.getPhoneNumber());
        cellphone2.dial(cellphone1.getPhoneNumber());
    }

    public static void display(Cellphone cellphone) {
        System.out.println("\nSerial number: " + cellphone.getSerialNumber());
        System.out.println("Model: " + cellphone.getModel());
        System.out.println("Carrier: " + cellphone.getCarrier());
        System.out.println("Phone number: " + cellphone.getPhoneNumber());
        System.out.println("Owner: " + cellphone.getOwner());
    }
}
