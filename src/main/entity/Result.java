package main.entity;

public class Result {
    private Integer id;
    private Integer id_sv;
    private Integer mark;

    public Result(Integer id, Integer id_sv, Integer mark) {
        this.id = id;
        this.id_sv = id_sv;
        this.mark = mark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_sv() {
        return id_sv;
    }

    public void setId_sv(Integer id_sv) {
        this.id_sv = id_sv;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }
}
