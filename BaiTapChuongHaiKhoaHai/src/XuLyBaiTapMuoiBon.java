import java.util.Scanner;

public class XuLyBaiTapMuoiBon {

	public XuLyBaiTapMuoiBon() {
		// TODO Auto-generated constructor stub
	}

	final static int MIN = -50;
	final static int MAX = 50;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int soDong = nhapSoDong(scan);
		int soCot = nhapSoCot(scan);
		int a[][] = taoMang(soDong, soCot, scan);
		xuatMang2chieu(a, soDong, soCot);
		int[] mang1Chieu = bienThanh1chieu(a, soDong, soCot);

		int b[] = demPhanTuGiongNhau(a, soDong, soCot);

		giaTriXuatHienNhieuNhat(b, mang1Chieu);
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

	public static int[] demPhanTuGiongNhau(int a[][], int soDong, int soCot) {
		int mangTam[] = bienThanh1chieu(a, soDong, soCot);
		int mangKQ[] = new int[mangTam.length];
		for (int i = 0; i < mangTam.length; i++) {
			mangKQ[i] = 0;
			for (int j = 0; j < mangTam.length; j++) {
				if (mangTam[i] == mangTam[j]) {
					if (j < i) {
						break;
					} else {
						mangKQ[i]++;
					}
				}
			}
		}
		return mangKQ;
	}

	public static void giaTriXuatHienNhieuNhat(int b[], int mang1Chieu[]) {
		int indexMax = 0;
		int indexMang1Chieu = 0;

		for (int i = 0; i < b.length; i++) {
			if (b[i] > b[indexMax]) {
				indexMax = i;
				indexMang1Chieu++;
			}

		}
		System.out.println("Gia tri xuat hien nhieu nhat: ");
		System.out.print(mang1Chieu[indexMang1Chieu] + "[" + b[indexMang1Chieu] + " lan]" + "\t");

	}



}
