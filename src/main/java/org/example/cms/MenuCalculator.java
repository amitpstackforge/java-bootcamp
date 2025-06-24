package org.example.cms;


import java.util.Scanner;

public class MenuCalculator {

    static double jog(double a, double b) {
        return a + b;
    }

    static double biyog(double a, double b) {
        return a - b;
    }

    static double gun(double a, double b) {
        return a * b;
    }

    static double vag(double a, double b) {
        if (b == 0) {
            System.out.println("ভাগ শূন্যে করা যাবে না।");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // ব্যবহারকারীর ইনপুট নেওয়া
        System.out.print("➤ প্রথম সংখ্যা লিখুন: ");
        double num1 = input.nextDouble();

        System.out.print("➤ দ্বিতীয় সংখ্যা লিখুন: ");
        double num2 = input.nextDouble();

        System.out.println("\n🔢 অপারেশন মেনু:");
        System.out.println("1. যোগ");
        System.out.println("2. বিয়োগ");
        System.out.println("3. গুণ");
        System.out.println("4. ভাগ");

        System.out.print("➤ আপনার অপশন নির্বাচন করুন (1-4): ");
        int choice = input.nextInt();


        double result ;

        // মেনু অনুসারে ফাংশন কল
        if (choice == 1) {
            result = jog(num1, num2);
            System.out.println("✅ যোগফল: " + result);
        } else if (choice == 2) {
            result = biyog(num1, num2);
            System.out.println("✅ বিয়োগফল: " + result);
        }else if (choice == 3) {
            result = gun(num1, num2);
            System.out.println("✅ গুণফল: " + result);
        }else if (choice == 4) {
            result = vag(num1, num2);
            if (num2 != 0) {
                System.out.println("✅ ভাগফল: " + result);
            }
        }else {
            System.out.println("❌ ভুল অপশন নির্বাচন করেছেন!");
        }
        input.close();

    }
}
