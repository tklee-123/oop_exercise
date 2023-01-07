package week06_homework.exercise1_3;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(2012, 2, 28);
        System.out.println(date1); // Tuesday 28 Feb 2012
        System.out.println(date1.nextDay()); // Wednesday 29 Feb 2012
        System.out.println(date1.nextDay()); // Thursday 1 Mar 2012
        System.out.println(date1.nextMonth()); // Sunday 1 Apr 2012
        System.out.println(date1.nextYear()); // Monday 1 Apr 2013

        MyDate date2 = new MyDate(2012, 1, 2);
        System.out.println(date2); // Monday 2 Jan 2012
        System.out.println(date2.previousDay()); // Sunday 1 Jan 2012
        System.out.println(date2.previousDay()); // Saturday 31 Dec 2011
        System.out.println(date2.previousMonth()); // Wednesday 30 Nov 2011
        System.out.println(date2.previousYear()); // Tuesday 30 Nov 2010

        MyDate date3 = new MyDate(2012, 2, 29);
        System.out.println(date3.previousYear()); // Monday 28 Feb 2011
    }

}
