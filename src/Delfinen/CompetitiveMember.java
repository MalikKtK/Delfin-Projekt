package Delfinen;

import java.util.Scanner;

public class CompetitiveMember extends Member {

    private double træningsResultat;
    private String swimmingDiscipline;

    //Constructor matching Super
    CompetitiveMember(String name, int age, String swimmingDiscipline) {
        super(name, age);
        this.swimmingDiscipline = swimmingDiscipline;
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
    public void setSvømmeDiscipliner(Discipline swimmingDiscipline) {
        this.swimmingDiscipline = String.valueOf(swimmingDiscipline);
    }
    public void setTræningsResultat (double træningsResultat) {
        this.træningsResultat = træningsResultat;
    }
    }