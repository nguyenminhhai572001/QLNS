package quanlyNS;

import java.util.ArrayList;
import java.util.Scanner;

public class NhanVienThuong extends NhanVien {
	private TruongPhong tenTruongPhongQuanLy=null;
	
	
	
	public NhanVienThuong(String maNV, String hoTen, String sDT, int sopNgayLam, int luongMotNgay,
			TruongPhong tenTP, TruongPhong tenTruongPhongQuanLy) {
		super(maNV, hoTen, sDT, sopNgayLam, luongMotNgay);
		this.tenTruongPhongQuanLy = tenTruongPhongQuanLy;
	}

	public NhanVienThuong() {
	}
	
	public void nhapNhanVien(ArrayList<TruongPhong> truongphong) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ma nhan vien: ");
		maNV = sc.next();
		System.out.println("nhap ho ten  nhan vien: ");
		sc.nextLine();
		hoTen = sc.nextLine();
		System.out.println("nhap so dien thoai nhan vien: ");
		sDT = sc.next();
		System.out.println("nhap so ngay lam cua nhan vien: ");
		sopNgayLam = sc.nextInt();
		System.out.println("nhap luong mot ngay cua nhan vien: ");
		luongMotNgay = sc.nextInt();
		System.out.println("nhap ma truong phong quan ly:");
		sc.nextLine();
		String maTruongPhongQL = sc.nextLine();
		for(TruongPhong tp : truongphong) {
			if(tp.maNV.equals(maTruongPhongQL)) {
				tenTruongPhongQuanLy = tp;
				tp.setSoLuongNhanVienDuoiQuyen(tp.getSoLuongNhanVienDuoiQuyen()+1);
			}
		}
	
	}
	@Override
	public void xuatAllNhanVien() {
		
		if(tenTruongPhongQuanLy != null) {
		System.out.println("NhanVienThuong [tenTruongPhongQuanLy=" + tenTruongPhongQuanLy.hoTen + ", maNV=" + maNV + ", hoTen=" + hoTen + ", sDT=" + sDT
				+ ", sopNgayLam=" + sopNgayLam + ", luongMotNgay=" + luongMotNgay + "]");
		}
		else{
			System.out.println("NhanVienThuong [tenTruongPhongQuanLy=" + "null" + ", maNV=" + maNV + ", hoTen=" + hoTen + ", sDT=" + sDT
					+ ", sopNgayLam=" + sopNgayLam + ", luongMotNgay=" + luongMotNgay + "]");
			
		}
	}
	
	
	
	public double cachTinhLuongNhanVien() {
		return luongMotNgay*sopNgayLam; 
	}
	
	public TruongPhong getTenTP() {
		return tenTruongPhongQuanLy;
	}

	public void setTenTP(TruongPhong tenTP) {
		this.tenTruongPhongQuanLy = tenTP;
	}


	
	
}
