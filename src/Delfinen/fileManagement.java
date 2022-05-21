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
    }
/*

    public void saveListOfMembers() throws FileNotFoundException{
        PrintStream newFile = new PrintStream("members.txt");
         for(String name: mem )
               newFile.println(name);
    }

 */
}




    /*
    private ArrayList<String> memberNames;

    public fileManagement() {
        memberNames = new ArrayList<>();
    }

   public void userInterfaceTwo(){
       System.out.println("names test");

   }

}



     */




    /*
    private ArrayList<Member> members;

    public void memberShip(){
        members = new ArrayList<>();
    }
    /*
    public void start(){
        UserInterface ui = new UserInterface();
        ui.start();


    public <Member> getAllMembers(){

    }

    public void saveListOfMembers() {
        PrintStream newFile = new PrintStream("Members.csv");
        for(something something : something){
        newFile.printf("%s;%s;%s;%n",

          //Chairman.getMemberName(),
         //members.getMemberAge(),
                // members.getMemberDiscipline());

         }
        newFile.close();
    }

    public void loadListOfMembers() {
        //Print
    }
}

 */