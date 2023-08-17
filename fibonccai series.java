public class Main {
    public static void main(String[] args) {
        int num = 10;
        int a = 0;
        int b = 1;

        for(int i = 1;i<=num;++i){
            System.out.println(a+",");
            int nextTerm = a+b;
            a = b;
            b = nextTerm;
        }



    }
}