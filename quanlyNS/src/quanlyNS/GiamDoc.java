package quanlyNS;

import java.util.Scanner;

public class GiamDoc extends NhanVien {
	private double coPhan;

	public GiamDoc(String maNV, String hoTen, String sDT, int sopNgayLam, int luongMotNgay, double coPhan) {
		super(maNV, hoTen, sDT, sopNgayLam, luongMotNgay);
		this.coPhan = coPhan;
		luongMotNgay = 300;
	}

	public GiamDoc(String maNV, String hoTen, String sDT, int sopNgayLam, int luongMotNgay) {
		super(maNV, hoTen, sDT, sopNgayLam, luongMotNgay);
	}
	
	
	
	public GiamDoc() {
	
	}

	public void nhapGiamDoc() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ma giam doc: ");
		maNV = sc.next();
		System.out.println("nhap ho ten  giam doc: ");
		sc.nextLine();
		hoTen = sc.nextLine();
		System.out.println("nhap so dien thoai giam doc: ");
		sDT = sc.next();
		System.out.println("nhap so ngay lam cua giam doc: ");
		sopNgayLam = sc.nextInt();
		System.out.println("nhap luong mot ngay cua giam doc: ");
		luongMotNgay = sc.nextInt();
		System.out.println("nhap co phan giam doc: ");
		coPhan = sc.nextDouble();

	}
	@Override
	public void xuatAllNhanVien() {
		
		System.out.println("GiamDoc [coPhan=" + coPhan + ", maNV=" + maNV + ", hoTen=" + hoTen + ", sDT=" + sDT + ", sopNgayLam="
				+ sopNgayLam + ", luongMotNgay=" + luongMotNgay +  "]");
	}
	
	public double  thuNhap(double loiNhuan) {
		return cachTinhLuongGiamDoc() + coPhan*loiNhuan;
	}
	public double cachTinhLuongGiamDoc() {
		return luongMotNgay*sopNgayLam;
	}
	
	public double getCoPhan() {
		return coPhan;
	}

	public void setCoPhan(double coPhan) {
		this.coPhan = coPhan;
	}
	
	
	
	
}
