package com.listsetassignment;

import java.util.*;

public class Program20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new LinkedHashSet<>();

        System.out.println("Enter Elements:");
        for (int i = 0; i < 3; i++) {
            set.add(sc.next().toLowerCase());
        }

        String maxVowelString = "";
        int maxVowelCount = 0;
        String vowels = "aeiou";

        // Find string with maximum number of vowels
        for (String s : set) {
            int count = 0;
            for (char c : s.toCharArray()) {
                if (vowels.indexOf(c) != -1) {
                    count++;
                }
            }

            if (count > maxVowelCount) {
                maxVowelCount = count;
                maxVowelString = s;
            }
        }

        System.out.println("String with maximum vowels: " + maxVowelString);
        System.out.println("Total vowels in it: " + maxVowelCount);
    }
}
