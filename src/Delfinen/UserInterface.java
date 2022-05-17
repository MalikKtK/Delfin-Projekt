package Delfinen;

import java.util.Locale;
import java.util.Scanner;

public class UserInterface {


    private Scanner in = new Scanner(System.in);

    public String choice(){
        return in.next();
    }




    void welcomeMessage(){
        System.out.println("Welcome to Svømmeklubben Delfinen");
    }

    void listOfCommands(){
        System.out.println("""
                Press [a] to add a new member
                press [b] to delete a member
                press [c] to view list of active members
                Press [d] to view list of passive members
                Press [e] overview of members who are in arrears
                Press [f] view of subscription payments
                Press [e] to exit program
                
                """); }


    void exitMessage(){
        System.out.println("System shut down.");
    }}


