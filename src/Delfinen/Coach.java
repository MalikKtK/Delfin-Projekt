package Delfinen;

import java.util.Scanner;

public class Coach {

    //Name from Arraylist of members?

    Teams teams = new Teams();

    public void resultJunior(Teams teams){
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
    void showTraingingResult(){
        System.out.println("Test");
    }
public void resultSenior(Teams teams){
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


