package Delfinen;

public class UserInterface {


    void welcome(){
        System.out.println("Welcome to Svømmeklubben Delfinen\n" +
                "\nPlease register age, desiredFormOfActivity, juniorOrSeniorSwimmer, exerciserOrCompetitiveSwimmer");
    }

    public void registerAge(){
        System.out.println("The age is set to: ");
    }

    void getHelp(){
        System.out.println("""
                Press a for bla bla bla
                Press b for bla bla bla
                Press c for bla bla bla
                Press d for bla bla bla
                """); }



    void getExitMessage(){
        System.out.println("System shut down.");
    }


}
