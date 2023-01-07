package week02;

import java.util.Scanner;

public class GradeStatistics {
    public static void main(String[] args) {
        int numStudents;
        int[] grades;
        double average;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        numStudents = in.nextInt();
        grades = inputArr(numStudents, in);
        average = findAverage(grades);
        int min = findMin(grades);
        int max = findMax(grades);
        System.out.println("The average is: " + average);
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);


    }

    public static int[] inputArr(int numStu, Scanner in) {
        int[] grades;
        grades = new int[numStu];
        for (int i = 1; i <= numStu; i++) {
            System.out.printf("Enter the grade for student %d: ", i);
            grades[i - 1] = in.nextInt();
        }
        return grades;


    }

    public static int findMin(int[] arr) {
        int min;
        min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
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
