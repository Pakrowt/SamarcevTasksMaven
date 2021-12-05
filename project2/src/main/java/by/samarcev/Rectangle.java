package by.samarcev;

import java.util.Scanner;

public class Rectangle implements FigureAreaInterface{
    @Override
    public int area(int... a) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write first side of the rectangle");
        int sade1 = scanner.nextInt();
        System.out.println("Write second side of the rectangle");
        int sade2 = scanner.nextInt();
        int summ = sade1 * sade2;
        System.out.printf("Area of the rectangle is : %d", summ);
        return summ;
    }
}
