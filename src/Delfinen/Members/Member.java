package Delfinen.Members;

import java.util.Random;

public class Member {

    Random random = new Random();

    private final String name;
    private final int age;
    private final int fee;
    private boolean juniorSwimmer;
    private boolean seniorSwimmer;
    private boolean elderlySwimmer;
    private final boolean inRestance;


    public Member(String name, int age) {
        this.name = name;
        this.age = age;
        juniorOrSeniorSwimmer();
        fee = calculateFee();
        inRestance = inRestance();
    }

    public boolean inRestance() {
        int randomNum = random.nextInt(4) + 1;
        return randomNum < 2;
    }


    public boolean getRestance() {
        return inRestance;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void juniorOrSeniorSwimmer() {
        if (this.age < 18) {
            this.juniorSwimmer = true;
            this.seniorSwimmer = false;
            this.elderlySwimmer = false;
        } else if (this.age >= 60) {
            this.juniorSwimmer = false;
            this.seniorSwimmer = false;
            this.elderlySwimmer = true;
        } else {
            this.juniorSwimmer = false;
            this.seniorSwimmer = true;
            this.elderlySwimmer = false;
        }
    }

    public boolean isJuniorSwimmer() {
        return juniorSwimmer;
    }

    public boolean isSeniorSwimmer() {
        return seniorSwimmer;
    }

    public boolean isElderlySwimmer() {
        return elderlySwimmer;
    }

    public int calculateFee() {
        if (juniorSwimmer) {
            return 1000;
        } else if (seniorSwimmer) {
            return 1600;
        } else if (elderlySwimmer) {
            return 1200;
        } else {
            return 500;
        }
    }

    public int getFee() {
        return fee;
    }

    @Override
    public String toString() {
        String MemberType = "";
        if (getAge() < 18) {
            MemberType = "Junior Member";
        }
        if (getAge() >= 18) {
            MemberType = "Senior Member";
        }
        return "-----------------------\n" +
                "\nName: " + getName() +
                "\nAge: " + getAge() +
                "\nMember type: " + MemberType +
                "\n-----------------------\n";
    }
}