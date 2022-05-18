package Delfinen;

import java.util.Locale;
import java.util.Scanner;

public class UserInterface {


    private Scanner in = new Scanner(System.in);




    void welcomeMessage(){
        System.out.println("Welcome to Svømmeklubben Delfinen");
    }
void menu(){
    System.out.println("Chose one of the functions: ");
    System.out.println("1. Create a new Member ");
    System.out.println("2. Delete a Member");
    System.out.println("3. Show all Mmebers from ArrayList: ");
    System.out.println("4. Show all Members from list");
    System.out.println("5. to view total subscription fees");
    System.out.println("6. Exit Program ");
}


    void exitMessage(){
        System.out.println("System shut down.");
    }}


