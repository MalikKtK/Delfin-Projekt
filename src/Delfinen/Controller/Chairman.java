package Delfinen.Controller;

import Delfinen.UserInterface.ConsoleColers;
import Delfinen.UserInterface.List;
import Delfinen.UserInterface.fileManagement;
import Delfinen.Members.CompetitiveMember;
import Delfinen.Members.ExerciseMember;
import Delfinen.Members.Member;
import Delfinen.Members.PassiveMember;

import java.util.Locale;
import java.util.Scanner;

public class Chairman {

    Scanner in = new Scanner(System.in);
    private final fileManagement file = new fileManagement();
    ConsoleColers color = new ConsoleColers();

    public void addMember() {
        System.out.print(color.BLUE_BOLD_BRIGHT + "Enter name: ");
        String name = in.next().toLowerCase(Locale.ROOT);
        Member member;
        System.out.print("Enter age: ");
        int age = in.nextInt();
        System.out.print("Active or passive member? [a]ctive or [p]assive " + color.RESET);
        String pOrA = in.next().toLowerCase(Locale.ROOT);
        if (pOrA.equals("p")) {
            List.addMemberToList(member = new PassiveMember(name, age));
            file.fileOutput(member);
        } else {
            System.out.print(color.BLUE_BOLD_BRIGHT + "Competitive or exercise swimmer? [c]ompetitive or [e]xercise swimmer: " + color.RESET);
            String cOrE = in.next().toLowerCase(Locale.ROOT);

            boolean trueForCompetitiveFalseForExercise = cOrE.equals("c");

            if (trueForCompetitiveFalseForExercise) {
                member = addCompetitiveMember(name, age);
                file.fileOutput(member);
                Coach.addMemberToTeam((CompetitiveMember) member);
            } else {
                member = addExerciseMember(name, age);
                file.fileOutput(member);
            }
            List.addMemberToList(member);
        }

    }

    public void deleteMember() {
        System.out.print(color.BLUE_BOLD_BRIGHT + "Type name of member you want to delete from list " + color.RESET);
        String deleteMember = in.next().toLowerCase(Locale.ROOT);
        int arraySize = List.getMemberList().size();
        for (int i = 0; i < List.getMemberList().size(); i++) {
            if (List.getMemberList().get(i).getName().equals(deleteMember)) {
                System.out.printf(color.BLUE_BOLD_BRIGHT + "%s has been removed from memberlist\n " + color.RESET, List.getMemberList().get(i).getName());
                List.removeMemberFromList(i);
                i = List.getMemberList().size();
            }
        }
        if (List.getMemberList().size() == arraySize) {
            System.out.println(color.BLUE_BOLD_BRIGHT + "That person is not a member " + color.RESET );
        }
    }

    public void showMembersFromArray() {
        for (int i = 0; i < List.getMemberList().size(); i++) {
            System.out.println(color.BLUE_BOLD_BRIGHT + List.getMemberList().get(i));
        }
    }

    public CompetitiveMember addCompetitiveMember(String name, int age) {
        System.out.print(color.RED + """
                Enter swimming discipline
                Butterfly
                Crawl
                Backstrokes
                Breaststroke
                """ + color.RESET);


        String activityChoice = in.next().toLowerCase(Locale.ROOT);
        return new CompetitiveMember(name, age, activityChoice);
    }

    public ExerciseMember addExerciseMember(String name, int age) {
        return new ExerciseMember(name, age);
    }
}
