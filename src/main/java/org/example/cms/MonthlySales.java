package org.example.cms;

public class MonthlySales {
    public static void main(String[] args) {
        String[] months = {"জানুয়ারি", "ফেব্রুয়ারি", "মার্চ", "এপ্রিল"};
        int[] sales = {12000, 15000, 13000, 14000};

        System.out.println("📊 মাসভিত্তিক বিক্রয় রিপোর্ট:\n");

        int totalSales = 0;

        for (int i = 0; i < sales.length; i++) {
            System.out.println( months[i]+" মাসে বিক্রয়: "+sales[i]+" টাকা");

            totalSales = totalSales+ sales[i];
            System.out.println("-------------------------");
            System.out.println("Current  োট বিক্রয়: " + totalSales + " টাকা");
        }

        System.out.println("\nমোট বিক্রয়: " + totalSales + " টাকা");

    }
}
