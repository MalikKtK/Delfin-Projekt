package Delfinen.Controller;

import Delfinen.UserInterface.ConsoleColers;
import Delfinen.UserInterface.List;

import java.util.ArrayList;

public class Cashier {
ConsoleColers color = new ConsoleColers();
    public void totalSubscriptionFees() {
        int totalIncome = 0;
        for (int i = 0; i < List.getMemberList().size(); i++) {
            totalIncome += List.getMemberList().get(i).getFee();
        }
        System.out.printf(color.BLUE_BOLD_BRIGHT + "Total expected annual subscription fees: DDK %d\n" + color.RESET, totalIncome);
    }

    public void getMembersInRestance() {
        String name = null;
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < List.getMemberList().size(); i++) {
            if (List.getMemberList().get(i).getRestance()) {
                name = List.getMemberList().get(i).getName();
                names.add(name);
            }
        }
        if (name == null) {
            System.out.println(color.BLUE_BOLD_BRIGHT + "All members has paid for their subscription!" + color.RESET);
        } else {
            System.out.println(color.BLUE_BOLD_BRIGHT + "List of members in restance: " + color.RESET);
            for (String s : names) {
                System.out.println(color.BLUE_BOLD_BRIGHT + s);
            }
        }
    }
}