package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniela Gomez-Dugan
 */
public class PasswordValidation
{
    public static void main( String[] args )
    {
        // Program to validate user login credentials with a given password
        Scanner input = new Scanner(System.in);
        final String password = "abc$123";

        System.out.print("What is the password? ");
        String user_password = input.nextLine();

        if (user_password.equals(password))
            System.out.print("Welcome!");
        else
            System.out.print("I don't know you.");
    }
}
