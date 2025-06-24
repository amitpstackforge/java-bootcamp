package org.example.cms;

public class EmployeeSalaryReport {
    public static void main(String[] args) {
        // কর্মচারীদের নাম
        String[] names = {"জন", "সারা", "মাইকেল", "এমা", "ডেভিড"};
        // কর্মচারীদের বেতন
        double[] salaries = {50000, 60000, 55000, 70000, 65000};

        // কর্মচারীদের বেতন রিপোর্ট
        for (int i = 0; i < names.length ; i++) {

            System.out.println("কর্মচারী: " + names[i] + ", বেতন: " + salaries[i] + " টাকা");
        }

    }
}
