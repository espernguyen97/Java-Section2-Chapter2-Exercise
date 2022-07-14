import java.util.Scanner;

public class XuLyBaiTapMuoiBa {

	public XuLyBaiTapMuoiBa() {
		// TODO Auto-generated constructor stub
	}

	final static int MIN = -50;
	final static int MAX = 50;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int soDong = nhapSoDong(scan);
		int soCot = nhapSoCot(scan);
		int a[][] = taoMang(soDong, soCot, scan);
		xuatMang(a, soDong, soCot);
		tinhTongSoNguyenTo(a, soDong, soCot);
	}

	public static int nhapSoDong(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập vào số dòng >1");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	public static int nhapSoCot(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập vào số cột >1");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	public static int[][] taoMang(int soDong, int soCot, Scanner scan) {
		int a[][] = new int[soDong][soCot];

		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				a[i][j] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
			}
		}

		return a;

	}

	public static void xuatMang(int a[][], int soDong, int soCot) {
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print(a[i][j] + "\t");
			}

			System.out.println("\t");
		}
	}
	
	public static boolean isPrime(int x) {
		boolean checkPrime = true;
		x = Math.abs(x);
		if (x < 2) {
			checkPrime = false;
		}
		for (int i = 2; i <= Math.sqrt(x); i++) {
			if (x % i == 0) {
				checkPrime = false;
			}
		}
		return checkPrime;
	}

	public static void tinhTongSoNguyenTo(int a[][], int soDong, int soCot) {
		int count = 0;
		float sum = 0;
		System.out.println("Các số là: ");
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				if (isPrime(a[i][j])) {
					System.out.print(a[i][j] + "\t");
					sum += a[i][j];
					count++;
				}
			}

		}
		System.out.println("\n");
		if (count == 0) {
			System.out.println("Không cố");
		} else {
			System.out.println("Tổng các số nguyên tố là " + sum);
		}

	}


}
