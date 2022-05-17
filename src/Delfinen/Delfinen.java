package Delfinen;

public class Delfinen {

    private final UserInterface ui = new UserInterface();
    private final Chairman chairman = new Chairman();
    private final List list = new List();
    private boolean keepGoing = true;
    private final Scanner in = new Scanner(System.in);
    private Cashier cashier = new Cashier();

    void go() {
        ui.welcomeMessage();
        ui.listOfCommands();
        while (keepGoing) {
            String choice = ui.choice();
            switch (choice) {
                case 1 -> chairman.addMember();
                case 2 -> chairman.deleteMember();
                case 3 -> chairman.showMembersFromArray();
                case 4 -> cashier.getTotalSubscriptionFees();
                case 5 -> {
                    ui.exitMessage();
                    keepGoing = false;}
                }
            }
        }
    }