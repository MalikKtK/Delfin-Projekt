package Delfinen.Members;

public class ExerciseMember extends Member {

    public ExerciseMember(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return super.toString() + color.BLUE_BOLD_BRIGHT + "\nMembership Status: " + color.RED + "Active " +
                color.BLUE_BOLD_BRIGHT + "\nComp/Exer: " + color.RED + "Exercise\n ";
    }
}