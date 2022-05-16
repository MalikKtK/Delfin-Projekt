package Delfinen;

import java.util.ArrayList;



/*
Kassereren vil gerne kunne danne sig et overblik over hvor meget klubben kan forvente at få indbetalt i kontingent i alt.
Kassereren har desuden ønsket, at systemet kan vise en oversigt over medlemmer, der er i restance.
 */

//Active under 18 = 1000 kr. yearly.
//Active senior 18 & above = 1600 kr. yearly.
//Active over 60 = 25% discond == 1200 kr. yearly.
//Passive = 500 kr. yearly.

import java.util.Scanner;

public class List {
    private Scanner sc = new Scanner(System.in);
    private static ArrayList<Member> memberList = new ArrayList();

    public void addMemberToList(Member member) {
        memberList.add(member);
    }

    public ArrayList<Member> getMemberList() {
        return memberList;
    }
    public void deleteMember() {
        System.out.print("Type name of member you want to delete from list ");
        String DeleteMember = sc.nextLine();
      for (int i = 0; i < memberList.size(); i++) {
          memberList.remove(i);
        }
        System.out.println("Deleted " + DeleteMember);
    }

    public void membersInList() {
        for (int i = 0; i < memberList.size(); i++) {
            System.out.println(memberList.get(i));
        }}


}







