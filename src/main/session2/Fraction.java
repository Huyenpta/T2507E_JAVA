package main.session2;

public class Fraction {
    Integer tuSo;
    Integer mauSo;

    public Fraction() {
        this.tuSo = 0;
        this.mauSo = 1;
    }

    public Fraction(Integer tuSo, Integer mauSo) {
        this.tuSo = tuSo;
        this.mauSo = (mauSo == 0) ? 1 : mauSo;
    }

    // --- Getter và Setter ---
    public int getTuSo() { return tuSo; }
    public void setTuSo(Integer tuSo) { this.tuSo = tuSo; }
    public int getMauSo() { return mauSo; }
    public void setMauSo(Integer mauSo) {
        if (mauSo != 0) this.mauSo = mauSo;
    }

    // --- Các phương thức bổ sung để code không lỗi ---

    // 1. Rút gọn phân số (Cần thiết vì bạn gọi trong add, sub, mul, div)
    public void rutGon() {
        Integer a = Math.abs(tuSo);
        Integer b = Math.abs(mauSo);
        // Thuật toán Euclid tìm UCLN
        while (b != 0) {
            Integer temp = a % b;
            a = b;
            b = temp;
        }
        Integer ucln = a;
        this.tuSo /= ucln;
        this.mauSo /= ucln;
    }

    // 2. In phân số ra màn hình
    public void inPhanSo() {
        if (mauSo == 1) System.out.println(tuSo);
        else System.out.println(tuSo + "/" + mauSo);
    }

    // 3. Nghịch đảo phân số
    public Fraction nghichDao() {
        return new Fraction(this.mauSo, this.tuSo);
    }

    // --- Các phép tính của bạn (Giữ nguyên logic) ---

    public Fraction add(Fraction f2) {
        Integer ts = this.tuSo * f2.getMauSo() + f2.getTuSo() * this.mauSo;
        Integer ms = this.mauSo * f2.getMauSo();
        Fraction result = new Fraction(ts, ms);
        result.rutGon();
        return result;
    }

    public Fraction sub(Fraction f2) {
        Integer ts = this.tuSo * f2.getMauSo() - f2.getTuSo() * this.mauSo;
        Integer ms = this.mauSo * f2.getMauSo();
        Fraction result = new Fraction(ts, ms);
        result.rutGon();
        return result;
    }

    public Fraction mul(Fraction f2) {
        Integer ts = this.tuSo * f2.getTuSo();
        Integer ms = this.mauSo * f2.getMauSo();
        Fraction result = new Fraction(ts, ms);
        result.rutGon();
        return result;
    }

    public Fraction div(Fraction f2) {
        if (f2.getTuSo() == 0) {
            System.out.println("Lỗi: Không thể chia cho 0.");
            return null;
        }
        Integer ts = this.tuSo * f2.getMauSo();
        Integer ms = this.mauSo * f2.getTuSo();
        Fraction result = new Fraction(ts, ms);
        result.rutGon();
        return result;
    }
}