package main.session3;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private Integer tuoi;
    private Double diemTB;

    public SinhVien(){

    }
    public SinhVien(String maSV, String hoTen, Integer tuoi, Double diemTB){
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public Double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(Double diemTB) {
        this.diemTB = diemTB;
    }

    public void inThongTin(){
        System.out.println(maSV);
        System.out.println(hoTen);
        System.out.println(tuoi);
        System.out.println(diemTB);

    }
}
