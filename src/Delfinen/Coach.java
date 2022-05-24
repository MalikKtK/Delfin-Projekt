package Delfinen;

import java.util.Scanner;

public class Coach {
    private final fileManagement file = new fileManagement();
    
    Scanner in = new Scanner(System.in);
    Team butterfly = new Team();
    Team crawl = new Team();
    Team backstrokes = new Team();
    Team breaststrokes = new Team();


    public void resultJunior(Team teams){
        Scanner in = new Scanner(System.in);
        System.out.println("Name of swimmer: ");
        String name = in.nextLine();
        System.out.println("Time ");
        double time = in.nextDouble();
        for (int i = 0; i < teams.getJuniorSwimmer().size(); i++) {
            if (name.equals(teams.getJuniorSwimmer().get(i).getName())){
                teams.getJuniorSwimmer().get(i).setTræningsResultat(time);
                break;
            }
        }
    }
    */
    public void addMemberToTeam(){
        System.out.println("Which member would you like to add to the team?");
        String name = in.next().toLowerCase(Locale.ROOT);
        CompetitiveMember member = null;
        for (int i = 0; i < List.memberList.size(); i++) {
            if (List.memberList.get(i).getName().equals(name)){
                file.fileOutput(member);
                member = (CompetitiveMember) List.memberList.get(i);
                break;
            }
        }
        if (member != null) {
            switch (member.getSwimmingDiscipline()){
                case "crawl" -> crawl.addMemberToTeam(member);
                case "butterfly" -> butterfly.addMemberToTeam(member);
                case "backstrokes" -> backstrokes.addMemberToTeam(member);
                case "breaststrokes" -> breaststrokes.addMemberToTeam(member);
                default -> System.out.println("That discipline doesnt exits bruh");
            }
        }
    }
    void showTrainingResult(){
        System.out.println("Test");
    }
public void resultSenior(Team teams){
        Scanner in = new Scanner(System.in);
    System.out.println("Name of swimmer: ");
    String name = in.nextLine();
    System.out.println("Time: ");
    double time = in.nextDouble();
    for (int i = 0; i < teams.getSeniorSwimmer().size(); i++) {
        if (name.equals(teams.getSeniorSwimmer().get(i).getName())){
            teams.getSeniorSwimmer().get(i).setTræningsResultat(time);
            break;
        }
    }
}
}