package Delfinen;

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

    void go() throws FileNotFoundException {
        ui.welcomeMessage();

        while (keepGoing) {
            ui.menu();
            int choice = in.nextInt();
            switch (choice) {
                case 1 -> chairman.addMember();
                case 2 -> chairman.deleteMember();
                case 3 -> chairman.showMembersFromArray();
                case 4 -> file.showMembersFromFile();
                case 5 -> file.showMembersFromFile2();
                case 6 -> cashier.totalSubscriptionFees();
                case 7 -> cashier.getMembersInRestance();
                case 8 -> coach.displayTopFive();
                case 9 -> coach.showTrainingResult();
                case 10 -> coach.addMemberToTeam();
                case 11 -> {
                    ui.exitMessage();
                    keepGoing = false;}
                }
            }
        }
    }