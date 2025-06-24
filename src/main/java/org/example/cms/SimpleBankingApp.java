package org.example.cms;


import java.util.Scanner;

public class SimpleBankingApp {

    static double balance = 0; //
    static String[] transactions = new String[100];
    static int transactionsCount = 0;


    static void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("✅ " + amount + " টাকা জমা হয়েছে।");
            transactions[transactionsCount++] = "জমা: " + amount + " টাকা";
        } else {
            System.out.println("❌ ভুল পরিমাণ!");

        }
    }

    static void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance=balance - amount;
            System.out.println("✅ " + amount + " টাকা উত্তোলন হয়েছে।");
            transactions[transactionsCount++] = "উত্তোলন: " + amount + " টাকা";
        } else {
            System.out.println("❌ যথেষ্ট ব্যালেন্স নেই বা ভুল পরিমাণ!");
        }
    }

    static void checkBalance() {
        System.out.println("🔎 বর্তমান ব্যালেন্স: " + balance + " টাকা");
    }

    static void showTransactions() {
        System.out.println("📜 লেনদেন ইতিহাস:");
        if (transactionsCount == 0) {
            System.out.println("👉 কোনো লেনদেন নেই!");
        } else {
            for (int i = 0; i < transactionsCount; i++) {
                System.out.println((i + 1) + ". " + transactions[i]);

            }
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("👋 স্বাগতম আমাদের সিম্পল ব্যাংকে!");
        do {
            System.out.println("\n🔘 মেনু:");
            System.out.println("1. ব্যালেন্স দেখুন");
            System.out.println("2. টাকা জমা দিন");
            System.out.println("3. টাকা উত্তোলন করুন");
            System.out.println("4. লেনদেন ইতিহাস দেখুন");
            System.out.println("5. প্রস্থান করুন");

            System.out.print("👉 আপনার পছন্দ (1-5): ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("➕ কত টাকা জমা দিতে চান? ");
                    double depAmount = input.nextDouble();
                    deposit(depAmount);
                    break;
                case 3:
                    System.out.print("➖ কত টাকা উত্তোলন করতে চান? ");
                    double withAmount = input.nextDouble();
                    withdraw(withAmount);
                    break;
                case 4:
                    showTransactions();
                    break;
                case 5:
                    System.out.println("👋 ধন্যবাদ! আবার দেখা হবে।");
                    break;
                default:
                    System.out.println("❌ অনুগ্রহ করে ১-৫ এর মধ্যে একটি সঠিক অপশন দিন।");
            }
        } while (choice != 5);

        input.close();
    }


}