package com.company.TaskNo2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PointList pointList = new PointList();
        Circle circle = new Circle();
        System.out.println("Enter point coordinates ");
        while (true) {
            System.out.print("x:");
            int pointX = scanner.nextInt();
            System.out.print("y:");
            int pointY = scanner.nextInt();
            Point newPoint = new Point(pointX, pointY);
            pointList.add(newPoint);
            System.out.println("Would you like to add more? (1-yes 2- no)");
            System.out.print("Your choice: ");
            int addOneMore = scanner.nextInt();
            if (addOneMore == 2) {
                break;
            }
        }
        System.out.println("Enter the coordinates of the center of the circle:");
        System.out.print("x:");
        int centerX = scanner.nextInt();
        System.out.print("y:");
        int centerY = scanner.nextInt();
        Point center = new Point(centerX, centerY);
        circle.setCenter(center);
        System.out.println("Enter the radius of the circle:");
        System.out.print("r:");
        int radius = scanner.nextInt();
        circle.setRadius(radius);
        for (int i = 0; i < pointList.size(); i++) {
            if (circle.isPointInCircle(pointList.get(i))) {
                System.out.println("Points lying in a circle: ");
                System.out.println(pointList.get(i));
            }
        }
    }
}
