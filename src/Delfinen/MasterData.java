package Delfinen;

public class MasterData {

    //Upon registration in the club
    private int age;
    private int desiredFormOfActivity;      //active or passive membership
    private boolean juniorOrSeniorSwimmer;
    private boolean exerciserOrCompetitiveSwimmer;

    MasterData(int age){
        this.age = age;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

}
