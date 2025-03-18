package SalonPackage;

public class Saloon {
    private int salonID;
    private String salonName;
    private double SalonRating;

    public Saloon(int salonID, String salonName, double salonRating) {
        this.salonID = salonID;
        this.salonName = salonName;
        SalonRating = salonRating;
    }

    public int getSalonID() {
        return salonID;
    }

    public void setSalonID(int salonID) {
        this.salonID = salonID;
    }

    public String getSalonName() {
        return salonName;
    }

    public void setSalonName(String salonName) {
        this.salonName = salonName;
    }

    public double getSalonRating() {
        return SalonRating;
    }

    public void setSalonRating(double salonRating) {
        SalonRating = salonRating;
    }

    @Override
    public String toString() {
        return "Saloon{" +
                "salonID=" + salonID +
                ", salonName='" + salonName + '\'' +
                ", SalonRating=" + SalonRating +
                '}';
    }
}
