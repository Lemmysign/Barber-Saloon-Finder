package SalonPackage;
import java.util.ArrayList;
import java.util.List;

public class saloonData {
private List<Saloon> saloonList;


public saloonData(){
    this.saloonList = new ArrayList<>();
    initializingSaloonList();
}

public void initializingSaloonList(){
    saloonList.add(new Saloon(1, "Big Chiz Barbing Saloon",4.53));
    saloonList.add(new Saloon(2, "HotSpot Barbing Saloon",4.67));
    saloonList.add(new Saloon(3, "Royal Barbing Saloon",4.78));
}

    public List<Saloon> getSaloonList() {
        return saloonList;
    }

    public Saloon getSaloonByID(int ID){
    for (Saloon salonID : saloonList){
        if (salonID.getSalonID() == ID){
            return salonID;
        }
    }
return null;
    }
}
