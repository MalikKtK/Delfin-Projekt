package Delfinen;

import java.util.Scanner;

public class CompetitiveMember extends Member {

    //Constructor matching Super
    CompetitiveMember(String name, int age, String desiredFormOfActivity, boolean feePaid) {
        super(name, age, feePaid);
        boolean competitive = true;
    }
}