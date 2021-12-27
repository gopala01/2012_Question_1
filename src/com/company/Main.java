package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int shape = inputInt("1. Triangle \n2. Square \nWhat shape do you want");
        while (shape != 1 && shape != 2)
        {
            shape = inputInt("Choose from the two options");
        }
        if (shape == 1)
        {
            triangle();
        }
        if (shape == 2)
        {
            square();
        }
    }

    public static void triangle()
    {
        String dash = "*";
        int height = inputInt("What is the height of the triangle?");
        for (int i = 0; i < height; i++) {
            print(dash);
            dash = dash + "*";
        }
    }
    public static void square()
    {
        String dash = "*";
        int length = inputInt("What is the length of the square?");
        for (int i = 0; i < length-1; i++) {
            dash = dash + "*";
        }
        for (int i = 0; i < length; i++) {
            print(dash);
        }
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
