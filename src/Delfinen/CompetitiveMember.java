package Delfinen;

public class CompetitiveMember extends Member {

    private boolean competitive;
    private String desiredFormOfActivity;
    //Constructor matching Super
    CompetitiveMember(String name, int age, String desiredFormOfActivity, boolean feePaid) {
        super(name, age, feePaid);
        this.competitive = true;
        this.desiredFormOfActivity = desiredFormOfActivity;
    }
}