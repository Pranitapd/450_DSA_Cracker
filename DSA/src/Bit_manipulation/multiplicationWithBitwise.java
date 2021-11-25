package Bit_manipulation;

public class multiplicationWithBitwise {
    int sqaure1(int n){
        int k=2 , sum=0, o=n;
        sum+=n;

        System.out.println("sum: " +sum);
        if((n&1) == 1){
            sum +=1;
        }
        n >>= 1;    //to pass unit position
        System.out.println("n: " +n + "sum : " + sum);
        while(n>0){
            if((n&1) == 1) {
                sum += (o*k);
            }
            System.out.println("sum: " + sum + "n: " + n + "k: "+ k);
            n >>= 1;
            k *=2;
        }

        return sum;
    }

    public static void main(String args[]){
        multiplicationWithBitwise m = new multiplicationWithBitwise();
        System.out.println(m.sqaure1(3));
    }
}
