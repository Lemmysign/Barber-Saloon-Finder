package BarbersPackage;

public class barberService {
    private barberData barberDataService;


    public barberService(barberData barberDataService) {
        this.barberDataService = barberDataService;
    }

    //Method to view all barbers

    public boolean viewBarber() {

        for (Barbers barbers : barberDataService.getBarbersList()) {
            if (barbers.getBarberRating() > 3.00) {
                System.out.println(barbers);
            }
        }
        return true;
    }

    //Method to book a barber

    public double bookBarber(int barberID) {
        Barbers barberChose = barberDataService.getBarberByID(barberID);
        if (barberChose == null){
            System.out.println("Barber with ID " +  barberID + " does not exist");
            return 0;
        }
        if (barberChose.isAvailable()){
            barberChose.setAvailable(false);
            System.out.println("You have successfully booked " + barberChose.getBarberName() + " with " + barberChose.getBarberRating() + " Ratings");
            return 0;
        }else{
            System.out.println("Sorry, the barber is already booked.");
            return 0;
        }

    }

}
