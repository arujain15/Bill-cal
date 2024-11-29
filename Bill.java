package initial;

import java.util.Scanner;

public class Bill {
	int r, u, billamount;
	void set()
	{
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the value of unit: ");
		u = ip.nextInt();
	}
	void cal() {
		if (u >= 0 && u < 100) {
			r = 5;
		}
		else if (u >= 100 && u < 300) {
			r = 7;
		}
		else if (u >= 300 && u < 500) {
			r = 9;
		}
		else {
			r = 12;
		}
		
		billamount = r * u;
		System.out.println("Bill amount = " + billamount);
	}
	public static void main(String[] args) {
		Bill ob = new Bill();
		ob.set();
		ob.cal();
	}

}
