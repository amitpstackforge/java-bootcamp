package org.example.cms;

public class StudentResults {
    public static void main(String[] args) {
        String students[] = {"rahul", "sumayea", "nihad", "jahid",};
        int[] marks = {45, 29, 68, 32};
        System.out.println("🎓 শিক্ষার্থীদের রেজাল্ট:\n");

        for (int i = 0; i < students.length; i++) {
            System.out.println("শিক্ষার্থী: " + students[i] + ", মার্কস: " + marks[i]);

            if (marks[i] == 30) {
                System.out.println(" → ✅ পাশ");
            } else {
                System.out.println("→ ❌ ফেল");
            }
        }
    }


}
