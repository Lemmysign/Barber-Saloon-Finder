package TimeandDatePackage;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class timeanddate {

    public void setDateTimeInput(){
            // Create a scanner object to read input
            Scanner timeandDatescanner = new Scanner(System.in);


            System.out.println("Please enter the date and time you want to book (format: yyyy-MM-dd HH:mm): ");
            String dateTimeInput = timeandDatescanner.nextLine();


            // Define the date and time format
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

            try {
                // Parse the input to a LocalDateTime object
                LocalDateTime bookingDateTime = LocalDateTime.parse(dateTimeInput, formatter);

                // Display the booked date and time
                System.out.println("You have successfully booked: " + bookingDateTime.format(formatter));
            } catch (Exception e) {
                System.out.println("Invalid date and time format. Please use 'yyyy-MM-dd HH:mm'.");
            }

            // Close the scanner

        }
    }



