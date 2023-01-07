package week06_homework.exercise1_2;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime time1 = new MyTime();
        System.out.println(time1);

        MyTime time2 = new MyTime(22, 59, 59);
        System.out.println(time2); // 22:59:59

        System.out.println(time2.nextSecond()); // 23:00:00
        System.out.println(time2.nextMinute()); // 23:10:00
        System.out.println(time2.nextHour()); // 00:01:00

        System.out.println(time1.previousSecond()); // 23:59:59
        System.out.println(time1.previousMinute()); // 23:58:59
        System.out.println(time1.previousHour()); // 22:58:59
    }
}
