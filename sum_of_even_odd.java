import java.util.Scanner;
public class sum_of_even_odd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int even=0;
		int odd = 0;
		while (n!=0){
			int digit = n%10;
			if(digit%2==0){
				even = even + digit;
			}
			else{
				odd = odd + digit;
			}
			n=n/10;
		} 
		System.out.println(even+" "+odd);
	}
}
