package HuaQuangCuong_21081111;

import java.util.Scanner;

public class Test {
	public static void inKQ() {
		for(int i = 0;i<45;i++) {
			System.out.printf("-");
		}
		System.out.println();
		System.out.printf("|%10s|%10s|%10s|%10s|", "Chieu dai", "Chieu rong", "Chu vi", "Dien tich");
		System.out.println();
		for(int i = 0;i<45;i++) {
			System.out.printf("-");
		}
		System.out.println(); 
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.printf("Chieu dai:");
			double d = sc.nextDouble();
			System.out.printf("Chieu rong:");
			double r = sc.nextDouble();
			HinhChuNhat h1 = new HinhChuNhat(d,r);
			inKQ();
			System.out.println(h1.toString());
		}
	}
	
}
