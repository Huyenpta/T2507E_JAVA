package main.session3;

public class HocSinh {
    private String hoTen;
    private Double diemToan;
    private Double diemVan;
    private Double diemAnh;

    public HocSinh(){

    }

    public HocSinh(String hoTen, Double diemToan, Double diemVan, Double diemAnh){
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemAnh = diemAnh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(Double diemToan) {
        if (diemToan < 0 || diemToan >10){
            System.out.println("Điểm toán phải lớn hơn 0 nhỏ hơn 10");
            return;
        }
        this.diemToan = diemToan;
    }

    public Double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(Double diemVan) {
        if (diemVan < 0 || diemVan >10){
            System.out.println("Điểm văn phải lớn hơn 0 nhỏ hơn 10");
            return;
        }
        this.diemVan = diemVan;
    }

    public Double getDiemAnh() {
        return diemAnh;
    }

    public void setDiemAnh(Double diemAnh) {
        if (diemAnh < 0 || diemAnh >10){
            System.out.println("Điểm anh phải lớn hơn 0 nhỏ hơn 10");
            return;
        }
        this.diemAnh = diemAnh;
    }

    public Double diemTB(){
        return (diemToan+diemVan+diemAnh) /3;
    }

    public String xepLoai(){
        Double dTB = diemTB();
        if (dTB >= 8){
            return "Giỏi";
        } else {
            if (dTB >= 6.5){
                return "Khá";
            } else {
                if (dTB >= 5){
                    return "Trung bình";
                } else {
                    return "Yếu";
                }
            }
        }

    }
}
