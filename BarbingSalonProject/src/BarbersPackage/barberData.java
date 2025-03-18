package BarbersPackage;
import java.util.ArrayList;
import java.util.List;


public class barberData {
    private List<Barbers> barbersList;

    public barberData() {
        this.barbersList = new ArrayList<>();
        initializingBarberList();
    }

    public void initializingBarberList() {
        barbersList.add(new Barbers(1, "Gabriel Ojo", 4.56, true));
        barbersList.add(new Barbers(2, "Paul Simi", 4.86, true));
        barbersList.add(new Barbers(3, "Bolu Watife", 4.51, true));
        barbersList.add(new Barbers(4, "Kene Ifediorah", 4.96, true));
        barbersList.add(new Barbers(5, "Jude Arkama", 4.66, true));
        barbersList.add(new Barbers(6, "Simeon Revered", 4.76, true));
    }

    public List<Barbers> getBarbersList() {
        return barbersList;
    }

    public Barbers getBarberByID(int ID) {
        for (Barbers barberID : barbersList) {
            if (barberID.getBarberID() == ID) {
                return barberID;
            }
        }
        return null;
    }
}
