package Delfinen;

import Delfinen.Members.Member;
import org.junit.jupiter.api.Test;


class MemberTest {

    @Test
    public int calculateFee() {
        Member mTest = new Member("Mark", 24);
       if (mTest.isJuniorSwimmer()){
           return 1000;
       }
       if (mTest.isSeniorSwimmer()){
           return 1600;
       }
       if (mTest.isElderlySwimmer()){
           return 1200;
       }
       else return 500;
    }
}
