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

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    private Scanner sc = new Scanner(System.in);
    private static ArrayList<Member> memberList = new ArrayList();

    public void addMemberToList(Member member) {
        memberList.add(member);
    }

}






