package Delfinen;

public class Delfinen {

    private UserInterface ui = new UserInterface();


    void go() {
        ui.welcomeMessage();
        while (keepGoing){
            String choice = ui.choice();
            switch (choice){
                case "add" -> list.addMemberToList(ui.addMember());
            }
        }
        ui.exitMessage();
    }




}


