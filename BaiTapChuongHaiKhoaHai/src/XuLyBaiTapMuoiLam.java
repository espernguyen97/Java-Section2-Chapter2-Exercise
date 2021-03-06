import java.util.Scanner;

public class XuLyBaiTapMuoiLam {

	public XuLyBaiTapMuoiLam() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int soDong = nhapSoDong(scan);
		int soCot = nhapSoCot(scan);
		int a[][] = nhapMang2chieu(soDong, soCot, scan);
		xuatMang2chieu(a, soDong, soCot);
		isMaTranThua(a, soDong, soCot);
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



	public static int[][] nhapMang2chieu(int soDong, int soCot, Scanner scan) {
		int a[][] = new int[soDong][soCot];

		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print("a[" + i + "]" + "[" + j + "] = ");
				a[i][j] = Integer.parseInt(scan.nextLine());
			}
		}

		return a;

	}


	public static void xuatMang2chieu(int a[][], int soDong, int soCot) {
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print(a[i][j] + "\t");
			}

			System.out.println("\t");
		}
	}

	public static void xuatMang1chieu(int a[]) {
		for (int item : a) {
			System.out.print(item + " ");
		}
		System.out.println("\n");
	}
	
	public static int[] bienThanh1chieu(int a[][], int soDong, int soCot) {
		int b[] = new int[soDong * soCot];
		int k = 0;
		for (int i = 0; i < soDong; i++) {
			b[k] = a[0][0];
			for (int j = 0; j < soCot; j++)
				b[k++] = a[i][j];
		}
		return b;
	}
	
	public static void isMaTranThua(int a[][], int soDong, int soCot) {
		int count0 = 0;
		int countKhac0 = 0;
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				if (a[i][j] == 0) {
					count0++;
				} else {
					countKhac0++;
				}
			}
		}

		if (count0 > countKhac0) {
			System.out.println("Đây là ma trân thưa");
		} else {
			System.out.println("Không");
		}

	}

}
