// static method
class test{
    static int sum(int a, int b){
        int c = a+b;
        return c;
    }

    public static void main(String[] args) {
        int x = 5,y = 6;
        int z = test.sum(x,y);
        System.out.println("sum is "+z);
    }
}