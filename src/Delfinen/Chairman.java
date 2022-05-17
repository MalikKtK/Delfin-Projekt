package Delfinen;

import java.util.Locale;
import java.util.Scanner;

public class Chairman {

    Scanner in = new Scanner(System.in);


    public void displayMembers(){
        List.membersInList();
    }


    public void addMember() {
        System.out.print("Enter name: ");
        String name = in.next().toLowerCase(Locale.ROOT);

        System.out.print("Enter age: ");
        int age = in.nextInt();
        System.out.print("Active or passive member? [a]ctive or [p]assive");
        String pOrA = in.next().toLowerCase(Locale.ROOT);
        if (pOrA.equals("p")){
            List.addMemberToList(new PassiveMember(name,age,true));
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
            List.addMemberToList(member);
        }
    }


    public void deleteMember(){
        System.out.print("Type name of member you want to delete from list ");
        String deleteMember = in.next().toLowerCase(Locale.ROOT);
        int arraySize = List.getMemberList().size();
        for (int i = 0; i < List.getMemberList().size(); i++) {
            if (List.getMemberList().get(i).getName().equals(deleteMember)){
                System.out.printf("%s has been removed from memberlist\n",List.getMemberList().get(i).getName());
                List.removeMemberFromList(i);
                i = List.getMemberList().size();
            }
        }
        if (List.getMemberList().size() == arraySize){
            System.out.println("That person is not a member");
        }
    }
    public void showMembersFromArray() {
        for (int i = 0; i < List.getMemberList().size(); i++){
            System.out.println(List.memberList.get(i));
        }
    }

    public void showMembersFromFile(){

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
}
