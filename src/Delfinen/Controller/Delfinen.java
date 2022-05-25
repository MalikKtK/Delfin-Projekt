package Delfinen.Controller;

import Delfinen.UserInterface.UserInterface;
import Delfinen.UserInterface.fileManagement;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Delfinen {

    private final UserInterface ui = new UserInterface();
    private final Chairman chairman = new Chairman();
    private final Coach coach = new Coach();
    private boolean keepGoing = true;
    private final Scanner in = new Scanner(System.in);
    private final Cashier cashier = new Cashier();
    private final fileManagement file = new fileManagement();

    public void go() throws FileNotFoundException {
        ui.welcomeMessage();

        while (keepGoing) {
            ui.menu();
            int choice = in.nextInt();
            switch (choice) {
                case 1 -> chairman.addMember();
                case 2 -> chairman.deleteMember();
                case 3 -> chairman.showMembersFromArray();
                case 4 -> file.showMembersFromFile();
                case 5 -> cashier.totalSubscriptionFees();
                case 6 -> cashier.getMembersInRestance();
                case 7 -> coach.displayTopFive();
                case 8 -> {
                    ui.exitMessage();
                    keepGoing = false;
                }
            }
        }
    }
}