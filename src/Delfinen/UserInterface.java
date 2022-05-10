package Delfinen;

public class UserInterface {

    private int age;
    private int desiredFormOfActivity;      //active or passive membership
    private boolean juniorOrSeniorSwimmer;
    private boolean exerciserOrCompetitiveSwimmer;


   public int getAge(){
       return age;
   }

   public void setAge(int age){
       this.age = age;
   }

    public int getDesiredFormOfActivity() {
        return desiredFormOfActivity;
    }

    public void setDesiredFormOfActivity(int desiredFormOfActivity) {
        this.desiredFormOfActivity = desiredFormOfActivity;
    }

    public boolean getJuniorOrSeniorSwimmer(){
       return juniorOrSeniorSwimmer;
    }

    public void setJuniorOrSeniorSwimmer(boolean juniorOrSeniorSwimmer) {
        this.juniorOrSeniorSwimmer = juniorOrSeniorSwimmer;
    }

    public boolean getExerciserOrCompetitiveSwimmer(boolean exerciserOrCompetitiveSwimmer){
       return exerciserOrCompetitiveSwimmer;
    }

    public void setExerciserOrCompetitiveSwimmer(boolean exerciserOrCompetitiveSwimmer) {
        this.exerciserOrCompetitiveSwimmer = exerciserOrCompetitiveSwimmer;
    }

    void welcome(){
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
                Press d for
                """); }



    void ExitMessage(){
        System.out.println("System shut down.");
    }}


