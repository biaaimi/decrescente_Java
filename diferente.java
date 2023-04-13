package exercicios;
import java.util.Scanner;

public class diferente {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x,y;
		
		
		System.out.print("Digite um número: ");
		x= input.nextInt();
		
		System.out.print("Digite outro número: ");
		y= input.nextInt();
		
		if(x>y) {
			System.out.println(+x+"..." +y);
			
		}else {
			if(x<y) {
				System.out.println(+y+"..."+x);
			}
		}

	}

}
