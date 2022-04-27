package quanlyNS;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyNhanSu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double tongLuongNV = 0, tongLuongTP = 0, tongLuongGD = 0;
		double loiNhuan = 0;
		double tongLuongCT = 0;
		ArrayList<CongtTy> congty = new ArrayList<>();
		ArrayList<TruongPhong> truongphong = new ArrayList<>();
		ArrayList<NhanVien> nhanvien = new ArrayList<>();
		ArrayList<NhanVienThuong> nhanVienThuong = new ArrayList<>();
		ArrayList<GiamDoc> giamDoc = new ArrayList<>();
		System.out.println("nhap so luong truong phong");
		int soLuongTP = sc.nextInt();
		System.out.println("nhap so luong nhan vien");
		int soLuongNV = sc.nextInt();
		System.out.println("nhap so luong giam doc");
		int soLuongGD = sc.nextInt();
		while(true) {
			
			System.out.println("1. Nhập thông tin công ty");
			System.out.println("2. Phân bổ Nhân viên vào Trưởng phòng");
			System.out.println("3. Thêm, xóa thông tin một nhân sự");
			System.out.println("4. Xuất ra thông tin toàn bộ người trong công ty");
			System.out.println("5. Tính và xuất tổng lương cho toàn công ty");
			System.out.println("6. Tìm Nhân viên thường có lương cao nhất");
			System.out.println("7. Tìm Trưởng Phòng có số lượng nhân viên dưới quyền nhiều nhất");
			System.out.println("8. Sắp xếp nhân viên toàn công ty theo thứ tự abc");
			System.out.println("9. Sắp xếp nhân viên toàn công ty theo thứ tự lương giảm dần");
			System.out.println("10. Tìm Giám Đốc có số lượng cổ phần nhiều nhất");
			System.out.println("11. Tính và Xuất tổng THU NHẬP của từng Giám Đốc");
			System.out.println("lua chon");
			int luachon = sc.nextInt();
			if(luachon == 1) {
				CongtTy ct = new CongtTy();
				ct.NhapThongTinCongTy();
				congty.add(ct);
				congty.get(0).XuatThongTinCongTy();
			}
			else if(luachon == 2) {
				
				for(int i = 0; i<soLuongTP; i++) {
					TruongPhong tp = new TruongPhong();
					tp.NhapTruongPhong();
					nhanvien.add(tp);
					truongphong.add(tp);
					tongLuongTP = truongphong.get(i).cachTinhLuongTruongPhong();
				}
				for(int i = 0; i<soLuongNV; i++) {
					NhanVienThuong nvt = new NhanVienThuong();
					nvt.nhapNhanVien(truongphong);
					nhanvien.add(nvt);
					nhanVienThuong.add(nvt);
					tongLuongNV = nhanVienThuong.get(i).cachTinhLuongNhanVien();
				}
				for(int i = 0; i<soLuongGD; i++) {
					GiamDoc gd = new GiamDoc();
					gd.nhapGiamDoc();
					nhanvien.add(gd);
					giamDoc.add(gd);
					tongLuongGD = giamDoc.get(i).cachTinhLuongGiamDoc();
				}		
			}
			else if(luachon == 3) {
				
				System.out.println("ban muon them hay xoa nhan vien");
				
				System.out.println("1. them nhan vien");
				System.out.println("2.xoa nhan vien");
				int themXoa = sc.nextInt();	
				if(themXoa == 1) {
					System.out.println("bo phan can them la: ");
					System.out.println("1. giam doc ");
					System.out.println("2. truong phong");
					System.out.println("3. nhan vien thuong");
					int them = sc.nextInt();
					if(them == 1) {
						GiamDoc gd1 = new GiamDoc();
						gd1.nhapGiamDoc();
						giamDoc.add(gd1);
					}
					else if(them == 2) {
						TruongPhong tp1 = new TruongPhong();
						tp1.NhapTruongPhong();
						truongphong.add(tp1);
					}
					else if(them == 3) {
						NhanVienThuong nvt1 = new NhanVienThuong();
						nvt1.nhapNhanVien(truongphong);
						nhanVienThuong.add(nvt1);
					}
				}
				else if(themXoa == 2) {
					System.out.println("bo phan can xoa la: ");
					System.out.println("1. giam doc ");
					System.out.println("2. truong phong");
					System.out.println("3. nhan vien thuong");
					int xoa = sc.nextInt();
					if(xoa == 1) {
						int index = -1;
						String maSoGD = sc.nextLine();
						for(int i = 0; i < soLuongGD; i++) {
							if(maSoGD.equals(giamDoc.get(i).maNV)) {
								index = i;
								break;
							}	
						}
						if(index == -1) {
							System.out.println("khong co giam doc");
						}
						else {
							giamDoc.remove(index);
						}
					}
					else if(xoa == 2) {
						int index = -1;
						String maSoTP = sc.nextLine();				
						for(int i = 0; i< soLuongTP; i++) {
							if(maSoTP.equals(truongphong.get(i).maNV)){
								index = i;
								break;
							}
						}
						if(index == -1) {
							System.out.println("khong co truong phong");
						}
						else {
							truongphong.remove(index);
						}
						
						for(int i = 0; i<soLuongNV; i++) {
							if(nhanVienThuong.get(i).getTenTP() != null){
								if(maSoTP.equals(nhanVienThuong.get(i).getTenTP().maNV)) {
									nhanVienThuong.get(i).setTenTP(null);
								}
							}
						}
					}
					else if(xoa == 3) {
						int index = -1;
						String maSoNV = sc.nextLine();
						for(int i = 0; i < soLuongNV; i++) {
							if(maSoNV.equals(nhanVienThuong.get(i).maNV)) {
								index = i;
								break;
							}
						}
						if(index == -1) {
							System.out.println("khong co nhan vien");
						}
						else {
							String manvt = nhanVienThuong.get(index).getTenTP().maNV;
							for(int i = 0; i<soLuongTP; i++) {
								if(manvt.equals(truongphong.get(i).maNV)) {
									truongphong.get(i).setSoLuongNhanVienDuoiQuyen(truongphong.get(i).getSoLuongNhanVienDuoiQuyen()-1);
								}
							}			
							nhanVienThuong.remove(index);		
						}
					}
				}
			}
			else if(luachon == 4) {
				for(int i = 0; i < nhanvien.size(); i++) {
					nhanvien.get(i).xuatAllNhanVien();
				}
			}
			else if(luachon == 5) {
				tongLuongCT = tongLuongGD + tongLuongNV + tongLuongTP;
				System.out.println("tong luong cua toan cong ty la: " + tongLuongCT);
			}
			else if(luachon == 6) {
				double max = nhanVienThuong.get(0).cachTinhLuongNhanVien();
				int indexmax=0;
				for(int i = 0; i<soLuongNV; i++) {
					if(max < nhanVienThuong.get(i).cachTinhLuongNhanVien()) {
						max = nhanVienThuong.get(i).cachTinhLuongNhanVien();
						indexmax = i;
					}
				}
				System.out.println("nhan vien thuong co luong cao nhat la: " + nhanVienThuong.get(indexmax).hoTen + " voi so tien luong la: " + max);
			}
			else if(luachon == 7) {
				int maxNV = truongphong.get(0).getSoLuongNhanVienDuoiQuyen();
				int indexTP = 0;
				for(int i = 0; i<soLuongTP; i++) {
					if(maxNV < truongphong.get(i).getSoLuongNhanVienDuoiQuyen()) {
						maxNV = truongphong.get(i).getSoLuongNhanVienDuoiQuyen();
						indexTP = i;
					}
					if(maxNV == 0) System.out.println("khong co nhan vien duoi quyen");
				}
				System.out.println("truong phong co so luong nhan vien duoi quyen nhieu nhat la: " + truongphong.get(indexTP).hoTen + " :" + maxNV + " nguoi duoi quyen");
			}
			else if(luachon == 8) {
				Collections.sort(nhanvien, new Comparator<NhanVien>() {
			        @Override
			        public int compare( NhanVien nhanvien1 , NhanVien nhanvien2) {
			        return nhanvien1.getHoTen().compareTo(nhanvien2.getHoTen());
			        }
			    } );
				
				for(int i = 0; i<nhanvien.size(); i++) {
					nhanvien.get(i).xuatAllNhanVien();
				}
			}
			else if(luachon == 9) {
				Collections.sort(nhanvien, new Comparator<NhanVien>() {
			        @Override
			        public int compare(NhanVien nhanvien1, NhanVien nhanvien2) {
			            return  nhanvien2.getLuongMotNgay() - nhanvien1.getLuongMotNgay();
			        }
			    });
				for(int i = 0; i<nhanvien.size(); i++) {
					nhanvien.get(i).xuatAllNhanVien();
				}
			}
			else if(luachon == 10) {
				double maxCP = giamDoc.get(0).getCoPhan();
				int indexMaxCP=0;
				for(int i = 0; i<soLuongGD; i++) {
					BigDecimal b1 = new BigDecimal(giamDoc.get(i).getCoPhan()+ "");
					BigDecimal b2 = new BigDecimal(maxCP + "");
					if(b1.compareTo(b2) == 1) {
						maxCP = giamDoc.get(i).getCoPhan();
						indexMaxCP = i;
					}
				}
				System.out.println("giam doc co co phan cao nhat la: " + giamDoc.get(indexMaxCP).hoTen + " co " + maxCP + " co phan");
			}
			else if(luachon == 11) {
				loiNhuan = congty.get(0).getDoanhThu() - tongLuongCT;
				for(int i = 0; i<soLuongGD; i++) {
					giamDoc.get(i).xuatAllNhanVien();
					System.out.println("thu nhap: " + giamDoc.get(i).thuNhap(loiNhuan));
				}
			}
		}
	}
}

