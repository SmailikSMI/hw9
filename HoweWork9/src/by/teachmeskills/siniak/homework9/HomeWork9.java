package by.teachmeskills.siniak.homework9;

import by.teachmeskills.siniak.homework9.util.StringUtils.StringUtils;

import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter symbols: ");
        char[] string = scanner.nextLine().toCharArray();
        StringUtils.println(string);
        System.out.println("Enter number task: ");
        int taskNumber = scanner.nextInt();
        switch (taskNumber) {
            case 2 -> {
                boolean isBank = StringUtils.isBank(string);
                System.out.println("This string is bank?");
                System.out.println("It's " + isBank);

            }
            case 3 -> {
                boolean isRussian = StringUtils.isRussian(string);
                System.out.println("This string is Russian?");
                System.out.println("It's " + isRussian);
            }
            case 4 -> {
                Scanner sca = new Scanner(System.in);
                System.out.println("Введите символы: ");
                char[] subString = sca.nextLine().toCharArray();
                boolean contains = StringUtils.contains(string, subString);
                System.out.println("This string contenting second string?");
                System.out.println("It's " + contains);
            }
            case 5 -> {
                int digit = StringUtils.parseInt(string);
                System.out.println("Your number is " + digit);
            }
        }
    }
}