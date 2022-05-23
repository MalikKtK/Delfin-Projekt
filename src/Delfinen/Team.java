package Delfinen;

import java.util.ArrayList;


public class Team {
    private final ArrayList<CompetitiveMember> juniorSwimmer = new ArrayList<>();
    private final ArrayList<CompetitiveMember> seniorSwimmer = new ArrayList<>();


    public ArrayList<CompetitiveMember> getJuniorSwimmer() {
        return juniorSwimmer;
    }

    public ArrayList<CompetitiveMember> getSeniorSwimmer() {
        return seniorSwimmer;
    }


    @Override
    public String toString() {
        return this.seniorSwimmer + ":) " + this.seniorSwimmer;

    }
}