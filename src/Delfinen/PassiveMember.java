package Delfinen;

public class PassiveMember extends Member{

    PassiveMember(String name, int age){
        super(name,age);
    }

    @Override
    public String toString() {
        return String.format("-----------------------\n\nName: %s\nAge: %d\nMembership status: Passive\n-----------------------\n",getName(),getAge());
    }
}
