import java.util.Scanner;
public class nth_fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []fibo;
        fibo = new int[10010];
        fibo[0]=1;
        fibo[1]=1;
        int a=1;
        int b =1;
        for (int i=0;i<10000;i++){
            fibo[i+2]=fibo[i]+fibo[i+1];
            a=fibo[i+1];
            b=fibo[i+2];
        }
        int x = sc.nextInt();
        for (int i=0;i<10000;i++){
            if(i==x-1){
                System.out.println(fibo[i]);
            }
        }
    }
}
