package main.session3;

public class TaiKhoan {
    private String soTaiKhoan;
    private String tenChuTK;
    private Double soDu;

    public TaiKhoan(){

    }

    public TaiKhoan(String soTaiKhoan, String tenChuTK, Double soDu){
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTK = tenChuTK;
        this.soDu = Math.max(soDu,0);

    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getTenChuTK() {
        return tenChuTK;
    }

    public void setTenChuTK(String tenChuTK) {
        this.tenChuTK = tenChuTK;
    }

    public Double getSoDu() {
        return soDu;
    }

    public void napTien(double soTien){
        if (soTien<=0){
            System.out.println("Số tiền phải nạp lớn hơn 0");
            return;
        }
        soDu += soTien;
        System.out.println("Nap tiền thành công: "+soTien);
    }

    public void rutTien(double soTien){
        if (soTien<0){
            System.out.println("Số tiền rút phải lớn hơn 0");
            return;
        }
        if (soTien>soDu){
            System.out.println("Không đủ số dư để rút");
            return;
        }
        soDu -=soTien;
        System.out.println("Rút tiền thành công: "+soTien);
    }
    public void hienThiSoDu(){
        System.out.println("Hiển thị số dư: "+soDu);
    }
}
