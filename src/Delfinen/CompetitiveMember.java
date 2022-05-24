package Delfinen;

import java.util.Random;
import java.util.Scanner;

public class CompetitiveMember extends Member implements Comparable<CompetitiveMember> {

    private String swimmingDiscipline;
    private int trainingTime;
    Random random = new Random();

    //Constructor matching Super
    CompetitiveMember(String name, int age, String swimmingDiscipline) {
        super(name, age);
        this.swimmingDiscipline = swimmingDiscipline;
        this.trainingTime = random.nextInt(100)+50;

    }
    public void swimmingDiscipline(CompetitiveMember competitiveMember){
        System.out.print("Svømmerens disciplin: ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if (choice.equals("butterfly")){
            competitiveMember.setSvømmeDiscipliner(Discipline.BUTTERFLY);
        } else if(choice.equals("crawl")){
            competitiveMember.setSvømmeDiscipliner(Discipline.CRAWL);
        } else if(choice.equals("rygcrawl")){
            competitiveMember.setSvømmeDiscipliner(Discipline.BACKSTROKES);
        } else if(choice.equals("brystsvømning")){
            competitiveMember.setSvømmeDiscipliner(Discipline.BREASTSTROKES);
        }
    }

    public int getTrainingTime() {
        return trainingTime;
    }

    public String getSwimmingDiscipline(){
        return this.swimmingDiscipline;
    }
    public void setSvømmeDiscipliner(Discipline swimmingDiscipline) {
        this.swimmingDiscipline = String.valueOf(swimmingDiscipline);
    }

    @Override
    public String toString() {
        return super.toString() + "\nMembership status: Active" +
                "\nComp/Exer: Competitive\n" +
                "\nDiscipline: " + swimmingDiscipline;
    }

    @Override
    public int compareTo(CompetitiveMember other) {
        if (this.trainingTime == other.getTrainingTime()){
            return 0;
        } else if (this.trainingTime > other.getTrainingTime()){
            return 1;
        } else {
            return -1;
        }
    }
}