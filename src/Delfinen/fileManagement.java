package Delfinen;

import java.io.*;
import java.util.Scanner;

public class fileManagement {
    final File allMembers = new File("members.txt");
    final File topFiveMembers = new File("topFive.txt");

    public void fileOutput(Member member) {
        try {
            PrintStream output = new PrintStream(new FileOutputStream(allMembers, true));
            output.append(member.toString());
            System.out.println("Members are now saved in a savefile.");
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
    public void showMembersFromFile() throws FileNotFoundException {
        Scanner fileReader = new Scanner(allMembers);
        while (fileReader.hasNext())
            break;
        System.out.println(fileReader.hasNextLine());
    }


    public void fileOutPut2(Coach coach) {
        try {
            PrintStream output2 = new PrintStream(new FileOutputStream(topFiveMembers, false));
            output2.append(coach.toString());
            System.out.println("Top five competitors are now saved in a save-file.");
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

    public void showMembersFromFile2() throws FileNotFoundException {
        Scanner fileReader2 = new Scanner(topFiveMembers);
        while (fileReader2.hasNext())
            break;
        System.out.println(fileReader2.hasNextLine());
    }
}