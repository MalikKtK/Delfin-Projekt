package Delfinen;

import java.util.Locale;
import java.util.Scanner;

public class UserInterface {


    private Scanner in = new Scanner(System.in);




    void welcomeMessage(){
        System.out.println("Welcome to Svømmeklubben Delfinen");
    }

    void showTraingingResult(){
        System.out.println();
    }
void menu(){
    System.out.println("Chose one of the functions: ");
    System.out.println("1. Create a new Member ");
    System.out.println("2. Delete a Member");
    System.out.println("3. Show all Mmebers from ArrayList: ");
    System.out.println("4. Show all Members from list");
    System.out.println("5. Show total annual subscription fees");
    System.out.println("6. Show Members in restance");
    System.out.println("7. Assign training result to junior competition swimmer");
    System.out.println("8. Assign training result to senior competition swimmer");
    System.out.println("9. Exit Program ");
}


    void exitMessage(){
        System.out.println("System shut down.");
    }}


