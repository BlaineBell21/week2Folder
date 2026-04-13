package com.pluralsight;
import java.util.Scanner;

public class FullNameGenerator {
    public static void main(String[] args){
        String firstName;
        String lastName;
        String middleName;
        String suffix;

        System.out.println("Welcome to the Full Name Generator.");
        firstName = enterInFirstName();
       middleName = enterInMiddleName();
        lastName = enterInLastName();
        suffix = enterInNameSuffix();
        System.out.println(nameCombiner(firstName, middleName, lastName, suffix));


    }

    public static String nameCombiner(String firstName, String middleName, String lastName, String suffix){
        String trimmedFirstName = firstName.trim();
        String trimmedLastName = lastName.trim();
        String trimmedMiddleName = middleName.trim();
        String trimmedSuffix = suffix.trim();
        String fullName = "";

        if(trimmedSuffix.equals("skip") || trimmedSuffix.equals("")){
            fullName = fullName + "";
        }else{
            fullName = fullName + trimmedSuffix + " ";
        }

        fullName = fullName + trimmedFirstName + " ";

        if(trimmedMiddleName.equals("skip") || trimmedMiddleName.equals("")){
            fullName = fullName + "";
        } else{
            fullName = fullName + trimmedMiddleName + " ";
        }

        fullName = fullName + trimmedLastName;
        return fullName;
    }

    public static String userInput(){
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        return userInput;
    }

    public static String enterInFirstName(){
        System.out.println("Enter in your first name: ");
        String firstName = userInput();
        return firstName;
    }

    public static String enterInMiddleName(){
        System.out.println("Enter in your middle name: ");
        System.out.println("Note: if you have no middle name, just enter \"skip\".");
        String middleName = userInput();
        return middleName;
    }

    public static String enterInLastName(){
        System.out.println("Enter in your last name: ");
        String lastName = userInput();
        return lastName;
    }

    public static String enterInNameSuffix(){
        System.out.println("Enter in your suffix: ");
        System.out.println("Note: if you have no suffix, just enter \"skip\".");
        String suffix = userInput();
        return suffix;
    }

}
