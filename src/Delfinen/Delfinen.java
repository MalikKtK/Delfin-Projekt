package Delfinen;

public class Delfinen {

    private UserInterface ui = new UserInterface();
    private boolean keepGoing = true;
    private List list = new List();


    void go() {
        ui.welcomeMessage();
        ui.listOfCommands();
        while (keepGoing) {
            String choice = ui.choice();
            switch (choice) {
                case "a" -> list.addMemberToList(ui.addMember());
                case "b" -> list.deleteMember();
                case "c" -> list.membersInList();
                case "e" -> {
                    ui.exitMessage();
                    keepGoing = false;
                }
            }
            System.out.println(list);
            ui.exitMessage();
        }
    }}