package pack_for_reference;

class CallByValue {

    int[] meth(int i, int j) {
        i *= 2;
        j /= 2;
        return new int[] {i,j};
    }

}

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CallByValue v = new CallByValue();
        int[] result = v.meth(9, 10);
        int i = result[0];
        int j = result[1];
        System.out.println("The value of i=" + i + " and j = " + j);
    }

}
