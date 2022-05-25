package Delfinen.UserInterface;

import Delfinen.Members.Member;

import java.io.*;
import java.util.Scanner;

public class fileManagement {
    final File allMembers = new File("members.txt");

    public void fileOutput(Member member) {

        try {
            PrintStream output = new PrintStream(new FileOutputStream(allMembers, true));
            output.append(member.toString());
            System.out.println("Members are now saved in a save-file.");

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
}