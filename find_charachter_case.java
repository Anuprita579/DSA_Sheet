import java.util.Scanner;
public class find_charachter_case{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        System.out.println(x);
        if(x>='A' && x<='Z'){
            System.out.println("Uppercase.");
        }
        else if (x>='a' && x<='z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("None");
        }
    }
}