package Delfinen;

import java.util.ArrayList;

public class Teams {
    private ArrayList<CompetitiveMember> juniorSwimmer = new ArrayList<>();
    private ArrayList<CompetitiveMember> seniorSwimmer = new ArrayList<>();
    private ArrayList<CompetitiveMember> competition = new ArrayList<>();

    public void setJuniorSwimmer(CompetitiveMember competitiveMember) {
        juniorSwimmer.add(competitiveMember);
    }

    public void setSeniorSwimmer(CompetitiveMember competitiveMember){
        seniorSwimmer.add(competitiveMember);
    }

    public ArrayList<CompetitiveMember> getJuniorSwimmer(){
        return juniorSwimmer;
    }

    public ArrayList<CompetitiveMember> getSeniorSwimmer(){
        return seniorSwimmer;
    }
}