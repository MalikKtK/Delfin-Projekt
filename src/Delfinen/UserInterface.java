package Delfinen;

public class UserInterface {

    private Scanner in = new Scanner(System.in);

    public String choice(){
        return in.next();
    }

    public Member addMember() {
        System.out.print("Enter name: ");
        String name = in.next().toLowerCase(Locale.ROOT);

        System.out.print("Enter age: ");
        int age = in.nextInt();

        System.out.print("Passive or active member? (p/a)");
        String pOrA = in.next().toLowerCase(Locale.ROOT);
        if (pOrA.equals("p")){
            return new PassiveMember(name,age,true);
        } else {
            System.out.print("Competitive or exercise swimmer? (c or e): ");
                    String cOrE = in.next().toLowerCase(Locale.ROOT);
                    boolean trueForCompetitiveFalseForExercise = false;
                    switch (cOrE) {
                        case "c" -> trueForCompetitiveFalseForExercise = true;
                        case "e" -> trueForCompetitiveFalseForExercise = false;
                    }
                    Member member;
                    if (trueForCompetitiveFalseForExercise){
                        member = addCompetitiveMember(name,age);
                    } else {
                        member = addExerciseMember(name,age);
                    }
                    return member;
        }
    }


    void welcomeMessage(){
        System.out.println("Welcome to Svømmeklubben Delfinen\n" +
                "\n ");
        listOfCommands();
    }

    // Register age, desiredFormOfActivity, juniorOrSeniorSwimmer, exerciserOrCompetitiveSwimmer

    void listOfCommands(){
        System.out.println("""
                Press a to view list of active members
                Press b to view list of passive members
                Press c overview of members who are in arrears 
                Press d for list of 
                """); }



    void exitMessage(){
        System.out.println("System shut down.");
    }}


