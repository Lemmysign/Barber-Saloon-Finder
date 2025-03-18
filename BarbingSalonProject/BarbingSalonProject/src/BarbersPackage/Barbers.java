package BarbersPackage;

public class Barbers {
    private int barberID;
    private String barberName;
    private double barberRating;
    private boolean Available;

    public Barbers(int barberID, String barberName, double barberRating, boolean Available) {
        this.barberID = barberID;
        this.barberName = barberName;
        this.barberRating = barberRating;
        this.Available = Available;
    }

    public int getBarberID() {
        return barberID;
    }

    public void setBarberID(int barberID) {
        this.barberID = barberID;
    }

    public String getBarberName() {
        return barberName;
    }

    public void setBarberName(String barberName) {
        this.barberName = barberName;
    }

    public double getBarberRating() {
        return barberRating;
    }

    public void setBarberRating(double barberRating) {
        this.barberRating = barberRating;
    }

    public boolean isAvailable() {
        return Available;
    }

    public void setAvailable(boolean available) {
        Available = available;
    }

    @Override
    public String toString() {
        return "Barbers{" +
                "barberID=" + barberID +
                ", barberName='" + barberName + '\'' +
                ", barberRating=" + barberRating +
                '}';
    }
}
