package quanlyNS;

import java.util.Scanner;

public class CongtTy {
	protected String tenCT;
	protected String maSoThue;
	protected double doanhThu;
	public CongtTy(String tenCT, String maSoThue, double doanhThu) {
		this.tenCT = tenCT;
		this.maSoThue = maSoThue;
		this.doanhThu = doanhThu;
	}
	public CongtTy() {
	}
	
	public void NhapThongTinCongTy() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ten cong ty");
		tenCT = sc.nextLine();
		System.out.println("nhap ma so thue cong ty");
		maSoThue = sc.nextLine();
		System.out.println("nhap doanh thu cong ty");
		doanhThu = sc.nextDouble();
	}
	
	public void XuatThongTinCongTy() {
		System.out.println("CongtTy [tenCT=" + tenCT + ", maSoThue=" + maSoThue + ", doanhThu=" + doanhThu + "]");
	}
	public String getTenCT() {
		return tenCT;
	}
	public void setTenCT(String tenCT) {
		this.tenCT = tenCT;
	}
	public String getMaSoThue() {
		return maSoThue;
	}
	public void setMaSoThue(String maSoThue) {
		this.maSoThue = maSoThue;
	}
	public double getDoanhThu() {
		return doanhThu;
	}
	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}
	
	
}
