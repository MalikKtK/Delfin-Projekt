package Delfinen;

public class Cashier {

    public void getTotalSubscriptionFees(){
        int totalIncome = 0;
        for (int i = 0; i < List.memberList.size(); i++) {
            totalIncome += List.getMemberList().get(i).getFee();
        }
        System.out.printf("Total annual subscription fees: DDK %d\n",totalIncome);
    }
}