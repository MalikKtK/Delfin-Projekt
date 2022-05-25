package Delfinen.UserInterface;

public class UserInterface {

    public void welcomeMessage() {
        System.out.println("Welcome to Svømmeklubben Delfinen");
    }

    public void menu() {
        System.out.println("Chose one of the functions:");
        System.out.println("1. Create a new Member");
        System.out.println("2. Delete a Member");
        System.out.println("3. Show all Members from ArrayList:");
        System.out.println("4. Show all Members from list");
        System.out.println("5. Show total annual subscription fees");
        System.out.println("6. Show Members in restance");
        System.out.println("7. Show TopFive");
        System.out.println("8. Show team results");
        System.out.println("9. Exit Program ");
    }


    public void exitMessage() {
        System.out.println("System shut down.");
    }
}


