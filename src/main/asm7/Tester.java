package main.asm7;

public class Tester extends Employee{
    private Integer bugsFound;

    public Tester(String id, String name, Double baseSalary, Integer bugsFound) {
        super(id, name, baseSalary);
        this.bugsFound = bugsFound;
    }

    public Integer getBugsFound() {
        return bugsFound;
    }

    public void setBugsFound(Integer bugsFound) {
        this.bugsFound = bugsFound;
    }

    @Override
    public Double calculateSalary() {
        return getBaseSalary() + bugsFound * 30_000;
    }

    @Override
    public String getPosition() {
        return "Tester";
    }
}
