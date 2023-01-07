package week02;

import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {
        int numStudents;
        int[] grades;
        double average;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        numStudents = in.nextInt();
        grades = readGrades(numStudents, in);
        System.out.print("The grades are: ");
        print(grades);
        System.out.println();
        System.out.println("The average is: " + findAverage(grades));
        System.out.println("The minimum is: " + min(grades));
        System.out.println("The maximum is: " + max(grades));
    }

    public static int[] readGrades(int numStu, Scanner in) {
        int[] grades;
        grades = new int[numStu];
        for (int i = 1; i <= numStu; i++) {
            System.out.printf("Enter the grade for student %d: ", i);
            grades[i - 1] = in.nextInt();
        }
        return grades;


    }

    public static void print(int[] array) {
        System.out.print("[" + array[0]);
        for (int i = 1; i < array.length; i++) {
            System.out.print(", " + array[i]);
        }
        System.out.print(']');
    }

    public static int min(int[] arr) {
        int min;
        min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int max(int[] arr) {
        int max;
        max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static double findAverage(int[] arr) {
        int sum = 0;
        double aver;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        aver = (double) sum / arr.length;
        return aver;
    }


}

