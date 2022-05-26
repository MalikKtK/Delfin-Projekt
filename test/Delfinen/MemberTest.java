package Delfinen;

import Delfinen.Members.Member;
import org.junit.jupiter.api.Test;


class MemberTest {

    @Test
    public void getName(){
        Member m = new Member("mark",42);
        Assertions.assertEquals("mark", m.getName());
    }
    @Test
    public void getAge(){
        Member m = new Member("mark",42);
        Assertions.assertEquals(42,m.getAge());
    }

    //Test of fees, based on membership
    @Test
    public void calculateFee() {
        Member m = new Member("Mark", 45);
        Assertions.assertEquals(1600, m.calculateFee());
    }
    @Test
    public void calculateFee1() {
        Member m = new Member("Mark", 75);
        Assertions.assertEquals(1200, m.calculateFee());

    }
    @Test
    public void calculateFee2() {
        Member m = new Member("Mark", 12);
        Assertions.assertEquals(1000, m.calculateFee());

    }

    //Test of Junior, senior og Elderly membership
    @Test
    public void getMembership(){
        Member m = new Member("mark",42);
        Assertions.assertTrue(m.isSeniorSwimmer());
    }
    @Test
    public void getMembership1(){
        Member m = new Member("mark",14);
        Assertions.assertTrue(m.isJuniorSwimmer());
    }
    @Test
    public void getMembership2(){
        Member m = new Member("mark",74);
        Assertions.assertTrue(m.isElderlySwimmer());
    }

    //@Test //Failed test: Junior fee = 1000kr and not 1600kr
    //public void calculateFee2(){
        //Member m = new Member("Ebus", 12);
        //Assertions.assertEquals(1600, m.calculateFee());

}