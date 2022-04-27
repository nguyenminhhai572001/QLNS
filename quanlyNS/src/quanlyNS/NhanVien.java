package quanlyNS;

public class NhanVien {
	protected String maNV;
	protected String hoTen;
	protected String sDT;
	protected int sopNgayLam;
	protected int luongMotNgay;
	
	public NhanVien(String maNV, String hoTen, String sDT, int sopNgayLam, int luongMotNgay2) {
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.sDT = sDT;
		this.sopNgayLam = sopNgayLam;
		this.luongMotNgay = luongMotNgay2;
	}

	public NhanVien() {
		
	}
	
	 public void xuatAllNhanVien() {
		 
		 System.out.println("NhanVien [maNV=" + maNV + ", hoTen=" + hoTen + ", sDT=" + sDT + ", sopNgayLam=" + sopNgayLam
				+ ", luongMotNgay=" + luongMotNgay + "]");
	 }
	 
	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getsDT() {
		return sDT;
	}

	public void setsDT(String sDT) {
		this.sDT = sDT;
	}

	public int getSopNgayLam() {
		return sopNgayLam;
	}

	public void setSopNgayLam(int sopNgayLam) {
		this.sopNgayLam = sopNgayLam;
	}

	public int getLuongMotNgay() {
		return luongMotNgay;
	}

	public void setLuongMotNgay(int luongMotNgay) {
		this.luongMotNgay = luongMotNgay;
	}
	
	
	
}
