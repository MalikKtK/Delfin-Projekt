package Delfinen;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Delfinen {

    private final UserInterface ui = new UserInterface();
    private final Chairman chairman = new Chairman();
    private final Coach coach = new Coach();
    private final Team teams = new Team();
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
                case 5 -> cashier.totalSubscriptionFees();
                case 6 -> cashier.getMembersInRestance();
                case 7 -> coach.resultJunior(coach.crawl);
                case 8 -> coach.resultSenior(coach.crawl);
                case 9 -> System.out.println(teams);
                case 10 -> coach.showTraingingResult();
                case 11 -> {
                    ui.exitMessage();
                    keepGoing = false;}
                }
            }
        }
    }