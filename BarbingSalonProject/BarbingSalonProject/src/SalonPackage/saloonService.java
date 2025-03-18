package SalonPackage;

public class saloonService {
    private saloonData saloonDataService;

    public saloonService(saloonData saloonDataService){
        this.saloonDataService = saloonDataService;
    }

    //Method to view all saloons

    public boolean viewSaloons(){
        for (Saloon saloons : saloonDataService.getSaloonList()){
            if (saloons.getSalonRating() > 3.00){
                System.out.println(saloons);
            }
        }
        return false;
    }

    //Method to book saloon
public double bookSaloon(int saloonID){
   Saloon saloonSelected = saloonDataService.getSaloonByID(saloonID);
   if (saloonSelected == null){
       System.out.println("Saloon" + saloonID + "does not exist");
       return 0;
   }
   if (saloonSelected.getSalonRating() > 3.00){
       saloonSelected.getSalonRating();
       System.out.println("you have selected " + saloonSelected.getSalonName() + "\n" + saloonSelected.getSalonRating() + " Ratings");
       return 0;
   }else {
       System.out.println("Saloon does not exist");
       return 0;
   }


}

}

