package quanlyNS;

import java.util.Scanner;

public class TruongPhong extends NhanVien {
	private int soLuongNhanVienDuoiQuyen=0;

	public TruongPhong(String maNV, String hoTen, String sDT, int sopNgayLam, int luongMotNgay,
			int soLuongNhanVienDuoiQuyen) {
		super(maNV, hoTen, sDT, sopNgayLam, luongMotNgay);
		this.soLuongNhanVienDuoiQuyen = soLuongNhanVienDuoiQuyen;
	}

	public TruongPhong(String maNV, String hoTen, String sDT, int sopNgayLam, int luongMotNgay) {
		super(maNV, hoTen, sDT, sopNgayLam, luongMotNgay);
	}
	
	public TruongPhong() {
		
	}

	public void NhapTruongPhong() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ma truong phong: ");
		maNV = sc.next();
		System.out.println("nhap ho ten truong phong: ");
		sc.nextLine();
		hoTen = sc.nextLine();
		System.out.println("nhap so dien thoai truong phong: ");
		sDT = sc.next();
		System.out.println("nhap so ngay lam cua truong phong: ");
		sopNgayLam = sc.nextInt();
		System.out.println("nhap luong mot ngay cua truong phong: ");
		luongMotNgay = sc.nextInt();
		
	}
	@Override
	public void xuatAllNhanVien() {
		System.out.println("TruongPhong [maNV=" + maNV + ", hoTen=" + hoTen + ", sDT=" + sDT + ", sopNgayLam=" + sopNgayLam
				+ ", luongMotNgay=" + luongMotNgay + "]");
	}
	
	public double cachTinhLuongTruongPhong() {
		return luongMotNgay*sopNgayLam+100*soLuongNhanVienDuoiQuyen;
	}
	
	public int getSoLuongNhanVienDuoiQuyen() {
		return soLuongNhanVienDuoiQuyen;
	}

	public void setSoLuongNhanVienDuoiQuyen(int soLuongNhanVienDuoiQuyen) {
		this.soLuongNhanVienDuoiQuyen = soLuongNhanVienDuoiQuyen;
	}

	
	
	
}
