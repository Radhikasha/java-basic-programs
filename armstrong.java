public class Main {
    public static void main(String[] args) {
        int num = 455,orginalnumber, rem,result = 0;
        orginalnumber = num;
        while(orginalnumber!= 0){
            rem = orginalnumber%10;
            result += Math.pow(rem,3);
            orginalnumber /= 10;
        }
        if(result == num)
            System.out.println("number is armstrong");
        else
            System.out.println("number is not armstrong");

    }
}