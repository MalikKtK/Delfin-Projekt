package Delfinen;

public class ExerciseMember extends Member {

    ExerciseMember(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return super.toString() + "\nMembership Status: Active" +
                                    "\nComp/Exer: Exercise\n";
    }
}