package Delfinen;

import java.util.ArrayList;

public class Cashier {

    public void totalSubscriptionFees(){
        int totalIncome = 0;
        for (int i = 0; i < List.memberList.size(); i++) {
            totalIncome += List.getMemberList().get(i).getFee();
        }
        System.out.printf("Total annual subscription fees: DDK %d\n",totalIncome);
    }

    public void getMembersInRestance(){
        String name = null;
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < List.memberList.size(); i++) {
            if (List.memberList.get(i).getRestance()){
                name = List.memberList.get(i).getName();
                names.add(name);
            }
        }
        if (name == null){
            System.out.println("All members has paid for their subscription!");
        } else {
            System.out.println("List of members in restance: ");
            for (String s : names) {
                System.out.println(s);
            }
        }
    }
}