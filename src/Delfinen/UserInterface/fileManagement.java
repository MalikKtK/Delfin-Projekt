package Delfinen.UserInterface;

import Delfinen.Members.Member;

import java.io.*;
import java.util.Scanner;

public class fileManagement {
    final File allMembers = new File("members.txt");
    ConsoleColers color = new ConsoleColers();

    public void fileOutput(Member member) {

        try {
            PrintStream output = new PrintStream(new FileOutputStream(allMembers, true));
            output.append(member.toString());
            System.out.println(color.GREEN + "Members are now saved in a save-file." + color.RESET);

        } catch (IOException e) {
            System.out.println(color.RED + "Error" + color.RESET);
            e.printStackTrace();

        }

    }

    public void showMembersFromFile() throws FileNotFoundException {
        Scanner fileReader = new Scanner(allMembers);
        while (fileReader.hasNext())
            break;
        System.out.println(fileReader.hasNextLine());
    }
}