package Delfinen;

import java.io.*;
import java.util.Scanner;

public class  fileManagement extends List{
    final File allMembers = new File("members.txt");

    public void fileOutput(Member member) {
        try {
            PrintStream output = new PrintStream(new FileOutputStream(allMembers, true));
            output.append(member.toString());
            output.close();
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
    }}