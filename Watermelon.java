package com.mycompany.problem_solving2;

import java.util.Scanner;

public class Watermelon{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        watermelon(scn.nextInt());
    }

    public static void watermelon(int w) {

        if (w > 2) {
            if (w % 2 == 0) {
                System.out.println("yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}
