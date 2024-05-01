public class BlueRayDisk {
    String title;
    String director;
    int yearOfRelease;
    double cost;

    public BlueRayDisk(String t, String d, int y, double c){
        title = t;
        director =d;
        yearOfRelease = y;
        cost = c;
    }

    @Override
    public String toString() {
        return "$" +cost+" "+yearOfRelease+" "+title+", "+director;
    }
}
