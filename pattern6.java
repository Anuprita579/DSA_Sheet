public class pattern6 {
    public static void nNumberTriangle(int n) {
        for (int i=1; i<=n; i++){
            for (int j=n; j>=i; j--){
                System.out.print(n-j+1+" ");
            }
            System.out.println();
        }
    }
}
