package maxnumber;
import java.util.*;

public class Maxnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();

         int Max_number = (a>b)?a:b;
         System.out.println(Max_number + " is max");

	}

}
