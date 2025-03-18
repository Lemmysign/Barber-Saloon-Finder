package BookingPackage;
import BarbersPackage.barberData;
import BarbersPackage.barberService;
import SalonPackage.Saloon;
import SalonPackage.saloonData;
import SalonPackage.saloonService;
import TimeandDatePackage.timeanddate;
import SaveReceiptPackage.saveReceipt;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


import java.util.Scanner;

public class bookingMain {
    public static void main(String[] args) {
        saloonData saloonDataObject = new saloonData();
        saloonService saloonServiceObject = new saloonService(saloonDataObject);

        barberData barberDataObject = new barberData();
        barberService barberServiceObject = new barberService(barberDataObject);

        timeanddate timeanddateObject = new timeanddate();
        saveReceipt saveReceiptObject = new saveReceipt();

        Scanner saloonInput = new Scanner(System.in);
        Scanner barberInput = new Scanner(System.in);
        Scanner userInput = new Scanner(System.in);
        Scanner receiptScanner = new Scanner(System.in);

boolean begin = true;

while (begin) {

    //step1
    System.out.println("Welcome to Uber for Barbing Saloons");
    System.out.println("Do you want to register (Yes/No)");
    String register = userInput.nextLine();

    if (register.equalsIgnoreCase("Yes")) {
        System.out.println("What's your name?");
        String yourName = userInput.nextLine();
        System.out.println("Your email Address?");
        String yourEmail = userInput.nextLine();
        System.out.println("Input your phone number");
        double phoneNo = userInput.nextDouble();
        System.out.println("Your have successfully Registered");

    } else if (register.equalsIgnoreCase("No")) {
        System.out.println("Thanks, have a nice day!");

    }
    System.out.println("Displaying all Barbing Saloons");
//initializing the fourth saloon using arraylist in the main method
    saloonDataObject.getSaloonList().add(new Saloon(4, "dodo slone", 4.11));
    saloonServiceObject.viewSaloons();

    System.out.println("Enter Saloon ID  to Select Saloon");
    int selectSaloonInput = saloonInput.nextInt();

    switch (selectSaloonInput){
        case 1:
       saloonServiceObject.bookSaloon(1);
            System.out.println("Displaying all Barbers" + "\n" +
                    "BarberID - 1, Gabriel Ojo, Rating 4.56" + "\n" +
                    "BarberID - 2, Paul Simi, Rating 4.86");
            System.out.println("Select ID No to Book a Barber");
            int barberSelection = barberInput.nextInt();
            switch (barberSelection){
                case 1:
                    barberServiceObject.bookBarber(1);
                    break;
                case 2:
                    barberServiceObject.bookBarber(2);
                    break;
            }

                    break;

        case 2:
            saloonServiceObject.bookSaloon(2);
            System.out.println("Displaying all Barbers" + "\n" +
                    "BarberID - 3, Bolu Watife, Rating 4.51" + "\n" +
                    "BarberID - 4, Kene Ifediorah, Rating 4.6");
            System.out.println("Select ID No to Book a Barber");
            int barberSelection2 = barberInput.nextInt();
            switch (barberSelection2) {
                case 3:
                    barberServiceObject.bookBarber(3);
                    break;
                case 4:
                    barberServiceObject.bookBarber(4);
                    break;
            }
            break;

        case 3:
            saloonServiceObject.bookSaloon(3);
            System.out.println("Displaying all Barbers" + "\n" +
                    "BarberID - 5, Jude Arkama, Rating 4.66" + "\n" +
                    "BarberID - 6, Simeon Revered, Rating 4.76");
            System.out.println("Select ID No to Book a Barber");
            int barberSelection3 = barberInput.nextInt();
           if (barberSelection3 == 5){
               barberServiceObject.bookBarber(5);
               break;
           } else if (barberSelection3 == 6) {
               barberServiceObject.bookBarber(6);
               break;

           }
            break;

        case 4:
            saloonServiceObject.bookSaloon(4);
            System.out.println("Displaying all Barbers" + "\n" +
                    "BarberID - 7, 999 Arkama, Rating 4.66" + "\n" +
                    "BarberID - 8, 633 Revered, Rating 4.76");
            System.out.println("Select ID No to Book a Barber");
            int barberSelection4 = barberInput.nextInt();
            if (barberSelection4 == 7){
                barberServiceObject.bookBarber(7);
                break;
            } else if (barberSelection4 == 8) {
                barberServiceObject.bookBarber(8);
                break;

            }
            break;

            }
    timeanddateObject.setDateTimeInput();


    }
}

    }
