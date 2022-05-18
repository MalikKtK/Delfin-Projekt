package Delfinen;

public class fileManagement {
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
