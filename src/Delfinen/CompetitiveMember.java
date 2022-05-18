package Delfinen;

import java.util.Scanner;

public class CompetitiveMember extends Member {

    //Constructor matching Super
    CompetitiveMember(String name, int age, String desiredFormOfActivity) {
        super(name, age);
        boolean competitive = true;
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
//        System.out.println("Chosen swimming discipline: " + competitiveMember.getSwimmingDisciplime());
        // MarkMus laver denne
    }
    public void setSvømmeDiscipliner(Discipline swimmingDiscipline) {
//        this.swimmingDiscipline = swimmingDiscipline;
    }
    }