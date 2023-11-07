public class pattern5 {
    public static void seeding(int n) {
        for(int row = 0; row < n; row++)
        {
            for(int col = 0; col < n; col++)
            {
                if(col < (n-row))
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}

/*
public class Solution {
    public static void seeding(int n) {
        for (int i=0; i<n; i++){
            for (int j=n; j>i; j--){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
 */