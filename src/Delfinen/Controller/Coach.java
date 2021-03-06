package Delfinen.Controller;

import Delfinen.Members.CompetitiveMember;
import Delfinen.Members.Team;
import Delfinen.UserInterface.ConsoleColers;

import java.awt.*;
import java.util.Collections;
import java.util.Scanner;

public class Coach {

    Scanner in = new Scanner(System.in);
    static Team butterfly = new Team();
    static Team crawl = new Team();
    static Team backstrokes = new Team();
    static Team breaststrokes = new Team();
    ConsoleColers color = new ConsoleColers();

    public void displayTopFive() {
        System.out.println(color.RED + """
                What team?\s
                (1) Butterfly
                (2) Crawl
                (3) Backstrokes
                (4) Breaststrokes""" + color.RESET);
        int team = in.nextInt();
        switch (team) {
            case 1 -> sortTheTeam(butterfly);
            case 2 -> sortTheTeam(crawl);
            case 3 -> sortTheTeam(backstrokes);
            case 4 -> sortTheTeam(breaststrokes);
        }
    }

    public void sortTheTeam(Team team) {
        Collections.sort(team.getSeniorSwimmer());
        Collections.sort(team.getJuniorSwimmer());

        for (int i = 0, j = 1; i < team.getJuniorSwimmer().size(); i++, j++) {
            System.out.printf(color.BLUE_BOLD_BRIGHT + "%d# " + color.RESET, j);
            System.out.println(color.BLUE_BOLD_BRIGHT + team.getJuniorSwimmer().get(i).getName() + color.RESET);
            System.out.println(color.BLUE_BOLD_BRIGHT + team.getJuniorSwimmer().get(i).getTrainingTime() + " seconds" + color.RESET);
            if (i == 4)
                break;
        }
        for (int i = 0, j = 1; i < team.getSeniorSwimmer().size(); i++, j++) {
            System.out.printf(color.BLUE_BOLD_BRIGHT + "%d# " + color.RESET, j);
            System.out.println(color.BLUE_BOLD_BRIGHT + team.getSeniorSwimmer().get(i).getName() + color.RESET);
            System.out.println(color.BLUE_BOLD_BRIGHT + team.getSeniorSwimmer().get(i).getTrainingTime() + " seconds" + color.RESET);
            if (i == 4)
                break;
        }
    }

    public static void addMemberToTeam(CompetitiveMember member) {
        switch (member.getSwimmingDiscipline()) {
            case "crawl" -> crawl.addMemberToTeam(member);
            case "butterfly" -> butterfly.addMemberToTeam(member);
            case "backstrokes" -> backstrokes.addMemberToTeam(member);
            case "breaststrokes" -> breaststrokes.addMemberToTeam(member);
        }
    }
}
