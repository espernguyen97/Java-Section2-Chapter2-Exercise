import java.util.Scanner;

public class XuLyBaiTapMuoi {
	
	final static int MIN = -50;
	final static int MAX = 50;

	public XuLyBaiTapMuoi() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int soDong = nhapSoDong(scan);
		int soCot = nhapSoCot(scan);
		int a[][] = taoMang(soDong, soCot, scan);
		xuatMang(a, soDong, soCot);
		lietKeDongAm(a, soDong, soCot);
	}

	public static int nhapSoDong(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập vào số dòng > 1");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	public static int nhapSoCot(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập vào số cột > 1");
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
	
	public static void lietKeDongAm(int a[][], int soDong, int soCot) {
		boolean giaTriAm;
		for (int i = 0; i < soDong; i++) {
			giaTriAm = false;
			for (int j = 0; j < soCot; j++) {
				if (a[i][j] < 0) {
					giaTriAm = true;
					break;
				}
			}
			if (giaTriAm) {
				System.out.println("Dòng " + i + " có giá trị âm.");
			}
		}
	}


}
