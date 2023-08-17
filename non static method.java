// non static method
public class test2 {
    int sum(int a,int b){
        int c = a+b;
        return c;
    }

    public static void main(String[] args) {
        int x = 5,y = 5;
        test2 s = new test2();
        int z = s.sum(x,y);
        System.out.println("the sum is "+z);
    }
}
