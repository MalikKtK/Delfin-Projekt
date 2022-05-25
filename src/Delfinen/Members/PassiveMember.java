package Delfinen.Members;

public class PassiveMember extends Member {

    public PassiveMember(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return String.format("-----------------------\n" + color.BLUE_BOLD_BRIGHT + "\nName: " + color.RED + "%s " + color.BLUE_BOLD_BRIGHT + "\nAge: " + color.RED + "%d " + color.BLUE_BOLD_BRIGHT + "\nMembership status: " + color.RED + "Passive \n-----------------------\n" + color.RESET, getName(), getAge());
    }
}
