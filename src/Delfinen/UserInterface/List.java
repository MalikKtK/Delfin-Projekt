package Delfinen.UserInterface;

import Delfinen.Members.Member;

import java.util.ArrayList;

public class List {

    static ArrayList<Member> memberList = new ArrayList<>();

    public static void addMemberToList(Member member) {
        memberList.add(member);
    }

    public static ArrayList<Member> getMemberList() {
        return memberList;
    }

    public static void removeMemberFromList(int i) {
        memberList.remove(i);
    }

}