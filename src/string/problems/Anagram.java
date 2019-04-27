package string.problems;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        Anagram anangram = new Anagram();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String firstWord = scanner.nextLine();
        System.out.println("Enter second word: ");
        String secondWord = scanner.nextLine();
        anangram.anangram(firstWord, secondWord);
    }

    public void anangram(String a, String b){
        char[] arrayOfCharFromStringA = a.toCharArray();
        char[] arrayOfCharFromStringB = b.toCharArray();
        Arrays.sort(arrayOfCharFromStringA);
        Arrays.sort(arrayOfCharFromStringB);
        if (Arrays.equals(arrayOfCharFromStringA, arrayOfCharFromStringB)){
            System.out.println("These words are anagrams.");
        }else
            System.out.println("These words are not anagrams.");
    }
}
