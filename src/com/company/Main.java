package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int triangle = 1;
        final int square = 2;

        int shape = inputInt("1. Triangle \n2. Square \nWhat shape do you want drawn");

        while (shape != triangle && shape != square)
        {
            shape = inputInt("Choose from the two options");
        }
        goToShape(shape);
    }


    public static void goToShape(int n)
    {
        String dash = "*";
        int size;
        if (n == 1)
        {
            size = inputInt("What is the height of the triangle?");

            getTriangle(size, dash);
        }
        else if (n == 2)
        {
            size = inputInt("What is the length of the square");

            dash = getDashes(size, dash);

            getSquare(size, dash);
        }
    }
    public static void getTriangle(int height, String dash)
    {
        for (int i = 0; i < height; i++) {
            print(dash);
            dash = dash + "*";
        }
    }

    public static void getSquare(int length, String dash)
    {

        for (int i = 0; i < length; i++) {
            print(dash);
        }
    }
    public static String getDashes(int length, String dash)
    {
        int i = 1;

        while (i < length)
        {
            dash = dash + "*";
            i++;
        }
        return dash;
    }
    public static void print(String m)
    {
        System.out.println(m);
    }

    public static int inputInt(String m)
    {
        int answer;
        Scanner scanner = new Scanner(System.in);

        print(m);
        answer = scanner.nextInt();
        return answer;
    }

}
