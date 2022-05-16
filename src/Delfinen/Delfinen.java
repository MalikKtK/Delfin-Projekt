package Delfinen;

import java.util.ArrayList;

public class Delfinen {

    private UserInterface ui = new UserInterface();


    void go() {
        ui.welcomeMessage();
        ui.listOfCommands();
        while (keepGoing){
            String choice = ui.choice();
            switch (choice){
                case "a" -> list.addMemberToList(ui.addMember());
                //case "b" -> System.out.println(List.memberList();

            }
        }
        ui.exitMessage();
    }




}


