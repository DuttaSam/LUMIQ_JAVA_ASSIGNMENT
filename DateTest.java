class Date {
  private int month;
  private int day;
  private int year;

  public Date(int month, int day, int year) {
    this.month = month;
    this.day = day;
    this.year = year;
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void displayDate() {
    System.out.println(month + "/" + day + "/" + year);
  }
}

public class DateTest {
  public static void main(String[] args) {
    Date date = new Date(2, 13, 2023);

    System.out.println("Month: " + date.getMonth());
    System.out.println("Day: " + date.getDay());
    System.out.println("Year: " + date.getYear());
    System.out.println("Date: ");
    date.displayDate();
  }
}
