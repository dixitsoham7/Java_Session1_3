import java.util.Scanner;
public class TruthTable {

	public static void main(String[] args) {
		int p,q;
		boolean r,s;
		System.out.print("Enter values.eg (0 0 , 0 1 , 1 0 , 1 1) -> ");
		Scanner obj = new Scanner(System.in);
		p=obj.nextInt();
		q=obj.nextInt();
		r=(p!=0);
		s=(q!=0);
		System.out.println("Bitwise AND : "+(p & q));
		System.out.println("Logical AND : "+(r && s));
		
	}


}
