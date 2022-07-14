import java.util.Scanner;

public class XuLyBaiTapHai {

	final static int MIN = -50;
	final static int MAX = 50;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int soDong = nhapSoDong(scan);
		int soCot = nhapSoCot(scan);
		int a[][] = taoMang(soDong, soCot, scan);
		xuatMang(a, soDong, soCot);
		long tongSoChan = tinhTong(a, soDong, soCot);
		System.out.println("\n");
		System.out.println("Tong cac so chan trong ma tran: " + tongSoChan);

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
			System.out.println("Nhập vào số cột  >1");
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

	public static long tinhTong(int a[][], int soDong, int soCot) {
		boolean flag = true;
		long tong = 0;
		System.out.println("Các số chẵn: ");
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				if (a[i][j] % 2 == 0) {
					System.out.print(a[i][j] + "\t");
					tong += a[i][j];
					flag = true;
				}
			}
		}

		if (!flag) {
			System.out.println("Không có");
		}
		return tong;

	}

}
