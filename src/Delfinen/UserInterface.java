package Delfinen;

import java.util.Locale;
import java.util.Scanner;

public class UserInterface {


    private Scanner in = new Scanner(System.in);

    public String choice(){
        return in.next();
    }

    public Member addMember() {
        System.out.print("Enter name: ");
        String name = in.next().toLowerCase(Locale.ROOT);

        System.out.print("Enter age: ");
        int age = in.nextInt();
        System.out.print("Active or passive member? [a]ctive or [p]assive");
        String pOrA = in.next().toLowerCase(Locale.ROOT);
        if (pOrA.equals("p")){
            return new PassiveMember(name,age,true);
        } else {
            System.out.print("Competitive or exercise swimmer? [c]ompetitive or [e]xercise swimmer: ");
                    String cOrE = in.next().toLowerCase(Locale.ROOT);
                    boolean trueForCompetitiveFalseForExercise = false;
                    switch (cOrE) {
                        case "c" -> trueForCompetitiveFalseForExercise = true;
                        case "e" -> trueForCompetitiveFalseForExercise = false;
                    }
                    Member member;
                    if (trueForCompetitiveFalseForExercise){
                        member = addCompetitiveMember(name,age);
                    } else {
                        member = addExerciseMember(name,age);
                    }
                    return member;
        }
    }


    public CompetitiveMember addCompetitiveMember(String name, int age){
        System.out.print("""
                   Enter swimming activity
                   Butterfly
                   Crawl
                   Backstrokes+
                   Breaststroke""");

        String activityChoice = in.next().toLowerCase(Locale.ROOT);
        return new CompetitiveMember(name,age,activityChoice,true);
    }
    public ExerciseMember addExerciseMember(String name, int age){
        return new ExerciseMember(name,age,true);
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


