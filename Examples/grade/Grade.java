package grade;
import java.util.*;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        
        int sum = n1+n2+n3;
        int avg = sum/3;
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        
        int num = avg / 10;
        
        switch (num) {
            case 10:
            	System.out.println("Grade: A");
                break;
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            default: 
                System.out.println("Grade: D");
        }
        sc.close();
	}

}
