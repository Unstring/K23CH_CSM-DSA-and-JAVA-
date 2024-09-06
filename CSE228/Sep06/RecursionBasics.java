package CSE228.Sep06;

public class RecursionBasics {
    static void recursiveFunction(int countInFunction){
        countInFunction--;
        if(countInFunction < 0) return;
        System.out.println("count is : " + countInFunction);
        recursiveFunction(countInFunction);
        System.out.println("count is : " + countInFunction);
        recursiveFunction(countInFunction);
        System.out.println("count is: " + countInFunction);
        return;
    }
    public static void main(String[] args) {
        int count = 3;
        recursiveFunction(count);
    }
}
