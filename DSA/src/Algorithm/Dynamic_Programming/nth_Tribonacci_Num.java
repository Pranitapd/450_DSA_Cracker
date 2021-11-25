package Algorithm.Dynamic_Programming;

public class nth_Tribonacci_Num {
    public int tribonacci(int n) {
        if(n<2)
            return n;
        int zeoth =0, first=1,second=1;
        int Tn=second;  //take this as second
        for(int i=3; i<=n; i++)
        {
            Tn = zeoth+first+second;
            zeoth=first;
            first=second;
            second=Tn;
        }
        return Tn;

    }

    public static void main(String args[]){
        nth_Tribonacci_Num n = new nth_Tribonacci_Num();
        System.out.println(n.tribonacci(5));
    }
}
