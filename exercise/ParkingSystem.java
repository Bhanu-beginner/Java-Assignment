
package com.exercise;

import java.util.Scanner;

class ParkingCalculator {
    public boolean isValidTime(int inHour, int inMinute, int outHour, int outMinute) {
        return (inHour < outHour) || (inHour == outHour && inMinute < outMinute);
    }

    public int calculateMinutes(int inHour, int inMinute, int outHour, int outMinute) {
        return (outHour * 60 + outMinute) - (inHour * 60 + inMinute);
    }

    public int calculateParkingFee(int totalMinutes) {
        int hours = totalMinutes / 60;
        int extraMinutes = totalMinutes % 60;
        return (extraMinutes > 0) ? (hours + 1) * 10 : hours * 10;
    }
}

public class ParkingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParkingCalculator calculator = new ParkingCalculator();

        System.out.print("Enter In-Time (hours minutes): ");
        int inHour = scanner.nextInt();
        int inMinute = scanner.nextInt();

        System.out.print("Enter Out-Time (hours minutes): ");
        int outHour = scanner.nextInt();
        int outMinute = scanner.nextInt();

        scanner.close();

        if (!calculator.isValidTime(inHour, inMinute, outHour, outMinute)) {
            System.out.println("Invalid time input.");
            return;
        }

        int totalMinutes = calculator.calculateMinutes(inHour, inMinute, outHour, outMinute);
        int parkingFee = calculator.calculateParkingFee(totalMinutes);

        System.out.println("Total Parking Fee: " + parkingFee + " Rupees");
    }
}

