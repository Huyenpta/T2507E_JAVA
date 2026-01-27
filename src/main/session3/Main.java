package main.session3;

import main.session2.Tamgiac;

public class Main {
    public static void main(String[] args){
        Tamgiac tg3 = new Tamgiac(4,5,6);
        tg3.name = "Tg deu";
        PhanSo p1 = new PhanSo(2,3);
        PhanSo p2 = new PhanSo(3, 7);
        SinhVien sv1 = new SinhVien("SV01","Nguyễn Thị Hoa",19, 9.5);
        System.out.println("Sinh viên 1:"); sv1.inThongTin();
        TaiKhoan tk = new TaiKhoan("TK202523545", "Nguyễn Thị Hoa", 3.5);

        tk.napTien(-500);
        tk.napTien(500);

        tk.rutTien(2000);
        tk.rutTien(300);

        tk.hienThiSoDu();

        HocSinh hs = new HocSinh("Nguyễn Thị Mai", 8.0, 6.0, 9.0);

        System.out.println("Điểm TB: " + hs.diemTB());
        System.out.println("Xếp loại: " + hs.xepLoai());

        hs.setDiemToan(11.0); 
        hs.setDiemVan(-2.0); 
    }

}
