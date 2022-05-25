package Delfinen.UserInterface;

public class UserInterface {
    ConsoleColers color = new ConsoleColers();
    public void welcomeMessage() {
        System.out.println("Welcome to Svømmeklubben Delfinen");
    }

    public void menu() {
        System.out.println("Chose one of the functions:");
        System.out.println(color.RED + "1. " +  color.GREEN + "Create a new Member" + color.RESET);
        System.out.println(color.RED + "2. " +  color.GREEN + "Delete a Member" + color.RESET);
        System.out.println(color.RED + "3. " + color.GREEN + "Show all Members from ArrayList:" + color.RESET);
        System.out.println(color.RED + "4. " +  color.GREEN + "Show all Members from list" + color.RESET);
        System.out.println(color.RED + "5. " +  color.GREEN + "Show total annual subscription fees" + color.RESET);
        System.out.println(color.RED + "6. " +  color.GREEN + "Show Members in restance" + color.RESET);
        System.out.println(color.RED + "7. " +  color.GREEN + "Show TopFive" + color.RESET);
        System.out.println(color.RED + "8. " +  color.GREEN + "Exit Program " + color.RESET);
    }


    public void exitMessage() {
        System.out.println(color.RED + "System shut down." + color.RESET);
    }
}


