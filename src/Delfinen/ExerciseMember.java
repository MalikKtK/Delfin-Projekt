package Delfinen;

public class ExerciseMember extends Member {

    private boolean exerciseSwimmer;

    //Constructor matching Super class
    ExerciseMember(String name, int age, boolean feePaid) {
        super(name, age, feePaid);
        this.exerciseSwimmer = true;
    }

}
