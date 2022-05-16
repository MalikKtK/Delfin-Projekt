package Delfinen;


/*
Kassereren vil gerne kunne danne sig et overblik over hvor meget klubben kan forvente at få indbetalt i kontingent i alt.
Kassereren har desuden ønsket, at systemet kan vise en oversigt over medlemmer, der er i restance.
 */

//Active under 18 = 1000 kr. yearly.
//Active senior 18 & above = 1600 kr. yearly.
//Active over 60 = 25% discond == 1200 kr. yearly.
//Passive = 500 kr. yearly.


import java.util.Scanner;

public class MembershipFee{
    private final String[] group = {"Junior","Senior", "Elderly", "Passive"};
    private final int[] fee = {500, 1000, 1200 ,1600};
    private final Scanner scan = new Scanner(System.in);
    private final boolean paid = true;
    private Member mb;

    public String fees(){
        int fees = 0;
        if (mb.getAge() < 18) {
            fees = 1000;
            return group[0];
        }
        else if (mb.getAge() >= 18) {
            fees = 1600;
            return group[1];
        }
        if (mb.getAge() > 60) {
            fees = 1200;
            return group[2];
        }

        return null;
    }
}


