import java.util.Scanner;

public class XuLyBaiTapMuoiHai {
	
	final static int MIN = -50;
	final static int MAX = 50;

	public XuLyBaiTapMuoiHai() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int soDong = nhapSoDong(scan);
		int soCot = nhapSoCot(scan);
		int a[][] = taoMang(soDong, soCot, scan);
		xuatMang(a, soDong, soCot);
		inPhanTuChanCuoiCung(a, soDong, soCot);
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
	
	public static void inPhanTuChanCuoiCung (int a[][], int soDong, int soCot) {
		boolean isEven = false;
		for (int i = soDong-1; i >= 0; i--) {
			
			for (int j = soCot-1; j >= 0; j--) {
				if (a[i][j]%2 == 0) {
					System.out.println("Phần tử cuối cùng " + a[i][j]);
					isEven = true;
					break;
				}
			}
			if (isEven) {
				break;
			} 
		}
		if(!isEven) {
			System.out.println("Không có");
		}
		
	}

}
