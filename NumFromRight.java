import java.util.Scanner;

public class NumFromRight{
	public static int numRight(int a, int k){
		int num=0;
		num=a%(10*k);// got last k digits
		num=num/(10*(k-1));// removes last (k-1) digits
		return num;// gives kth last
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int k=sc.nextInt();
		
		System.out.print(numRight(a,k));
		//sc.close();
	}
}

/*
a=1234567890;
int num=a%(10*k);
num=num/(10*(k-1));
*/