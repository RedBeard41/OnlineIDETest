package org.lickingheights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner keyboard = new Scanner(System.in);

        int x, y;

        System.out.println("Give me a number");
        x = keyboard.nextInt();

        System.out.println("Give me another number");
        y = keyboard.nextInt();

        System.out.println(x +" + "+ y+" = "+ (x+y));
    }
}
