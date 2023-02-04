package by.teachmeskills.siniak.homework9;

import by.teachmeskills.siniak.homework9.util.StringUtils.StringUtils;

import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите символы: ");
        char[] string = scanner.nextLine().toCharArray();
        System.out.println(string.length);
        System.out.println("Введите номер задачи: ");
        int taskNumber = scanner.nextInt();
        switch (taskNumber) {
            case 2 -> {
                boolean isBank = StringUtils.isBank(string);
                System.out.println(isBank);

            }
        }


    }
}