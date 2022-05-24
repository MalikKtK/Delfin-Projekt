package Delfinen;

public class TesterClass {

    public int testing(int x, int y){
        if (y==0){
            throw new IllegalArgumentException("Y cannon be zero");
        }
        return x/y;
    }

}
