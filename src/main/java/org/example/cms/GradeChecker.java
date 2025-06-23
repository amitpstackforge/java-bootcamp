package org.example.cms;

public class GradeChecker {
    public static void main(String[] args) {
        int marks = 49;

        if (marks >= 80) {
            System.out.println("তোমার গ্রেড: A+");
        } else if (marks >= 70) {
            System.out.println("তোমার গ্রেড: A");
        } else if (marks >= 60) {
            System.out.println("তোমার গ্রেড: B");
        } else if (marks >= 50) {
            System.out.println("তোমার গ্রেড: C");
        } else {
            System.out.println("তুমি ফেল করেছো।");
        }
    }
}
