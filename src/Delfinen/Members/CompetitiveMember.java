package Delfinen.Members;

import java.util.Random;

public class CompetitiveMember extends Member implements Comparable<CompetitiveMember> {

    private final String swimmingDiscipline;
    private final int trainingTime;
    Random random = new Random();

    //Constructor matching Super
    public CompetitiveMember(String name, int age, String swimmingDiscipline) {
        super(name, age);
        this.swimmingDiscipline = swimmingDiscipline;
        this.trainingTime = random.nextInt(100) + 50;

    }

    public int getTrainingTime() {
        return trainingTime;
    }

    public String getSwimmingDiscipline() {
        return this.swimmingDiscipline;
    }

    @Override
    public String toString() {
        return super.toString() + color.BLUE_BOLD_BRIGHT + "\nMembership status: " + color.RED +  "Active" +
                color.BLUE_BOLD_BRIGHT + "\nComp/Exer: " + color.RED + "Competitive\n " +
                color.BLUE_BOLD_BRIGHT + "\nDiscipline: " + color.RED + swimmingDiscipline + color.RESET;
    }

    @Override
    public int compareTo(CompetitiveMember other) {
        if (this.trainingTime == other.getTrainingTime()) {
            return 0;
        } else if (this.trainingTime > other.getTrainingTime()) {
            return 1;
        } else {
            return -1;
        }
    }
}