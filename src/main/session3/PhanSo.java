package main.session3;

public class PhanSo {
    private Integer tuSo;
    private Integer mauSo;

    public PhanSo(){

    }
    public PhanSo(Integer tuSo, Integer mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public Integer getTuSo() {
        return this.tuSo; //getter
    }

    public void setTuSo(Integer tuSo) {
        this.tuSo = tuSo; //Setter
    }

    public Integer getMauSo() {
        return this.mauSo; //getter
    }

    public void setMauSo(Integer mauSo) {
        this.mauSo = mauSo!=0?mauSo:1; //setter
    }

    public void rutGon(){
        //tim UCLN cua tu so va mau so
        int ucln = 1;
        for (int i=2; i< Math.abs(getTuSo());i++){
            if (getTuSo()%i==0 && getMauSo()%i==0){
                ucln = i;
            }
        }
        setTuSo(getTuSo()/ucln);
        setMauSo(getMauSo()/ucln);
    }

    public void add(PhanSo a){
        //Phân số còn lại là this
        setMauSo(this.mauSo * a.getMauSo());
        setTuSo(this.tuSo*a.getMauSo()+ this.mauSo*a.getTuSo());
        rutGon();
    }
    public void sub(PhanSo a){
        //Phân số còn lại là this
        setMauSo(this.mauSo * a.getMauSo());
        setTuSo(this.tuSo*a.getMauSo() - this.mauSo*a.getTuSo());
        rutGon();
    }

    public void mul(PhanSo a){
        //Phân số còn lại là this
        setMauSo(this.mauSo * a.getMauSo());
        setTuSo(this.tuSo * a.getTuSo());
        rutGon();
    }

    public void div(PhanSo a){
        //Phân số còn lại là this
        setMauSo(this.tuSo * a.getMauSo());
        setTuSo(this.mauSo * a.getTuSo());
        rutGon();
    }


}
