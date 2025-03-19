package com.exercise;

import java.util.Scanner;

class ColourCodeValidator {

 public static int validateHexCode(String hexCode) {
     if (hexCode.matches("^#[A-Fa-f0-9]{6}$")) {
         return 1;
     }
     return -1;
 }

 public static int validateDecimalCode(String decimalCode) {
     if (decimalCode.matches("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$")) {
         String[] values = decimalCode.substring(4, decimalCode.length() - 1).split(",");
         for (String val : values) {
             int num = Integer.parseInt(val.trim());
             if (num < 0 || num > 255) {
                 return -1;
             }
         }
         return 1; 
     }
     return -1;
   }
}
public class ColorCodeTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter choice (1 for Hex, 2 for RGB): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        if (choice == 1) {
            System.out.print("Enter Hex Code: ");
            String hexCode = scanner.nextLine();
            System.out.println(ColourCodeValidator.validateHexCode(hexCode) == 1 ? "Valid Code" : "Invalid Code");
        } else if (choice == 2) {
            System.out.print("Enter Decimal Code: ");
            String decimalCode = scanner.nextLine();
            System.out.println(ColourCodeValidator.validateDecimalCode(decimalCode) == 1 ? "Valid Code" : "Invalid Code");
        } else {
            System.out.println("Invalid choice");
        }

        scanner.close();

	}

}
