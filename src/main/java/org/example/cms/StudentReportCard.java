package org.example.cms;

public class StudentReportCard
{

    public static void main(String[] args) {
        String sentence = "english is a global language";

        String[] words = sentence.split(" ");

        System.out.println("বাক্যের প্রতিটি শব্দ:");

        for (int i = 0; i < words.length; i++) {
            System.out.println("শব্দ " + (i + 1) + ": " + words[i]);
        }
    }
}
