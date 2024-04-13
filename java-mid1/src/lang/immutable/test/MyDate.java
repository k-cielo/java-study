package lang.immutable.test;

public class MyDate {

    private int year;
    private int month;
    private int day;

    public MyDate(int year, int menth, int day) {
        this.year = year;
        this.month = menth;
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMenth(int menth) {
        this.month = menth;
    }

    public void setDay(int day) {
        this.day = day;
    }


    @Override
    public String toString() {
        return year +"-"+month+"-"+day;
    }
}
