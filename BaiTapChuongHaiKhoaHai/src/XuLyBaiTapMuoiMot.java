import java.util.Scanner;

public class XuLyBaiTapMuoiMot {

	public XuLyBaiTapMuoiMot() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int soDong = nhapSoDong(scan);
		int soCot = nhapSoCot(scan);
		int a[][] = nhapMang(soDong, soCot, scan);
		xuatMang(a, soDong, soCot);
		lietKeCotTangDan(a, soDong, soCot);
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


	public static int[][] nhapMang(int soDong, int soCot, Scanner scan) {
		int a[][] = new int[soDong][soCot];

		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print("a[" + i + "]" + "[" + j + "] = ");
				a[i][j] = Integer.parseInt(scan.nextLine());
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
	

	public static void lietKeCotTangDan(int a[][], int soDong, int soCot) {
		boolean flag;
		for (int j = 0; j < soCot; j++) {
			flag = true;
			for (int i = 0; i < soDong - 1; i++) {
				if (a[i][j] >= a[i + 1][j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("Cột " + j + " đang tăng dần");
			} else {
				System.out.println("Không có.");
			}
		}
	}


}
