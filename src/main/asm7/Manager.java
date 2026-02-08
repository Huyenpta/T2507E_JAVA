package main.asm7;

public class Manager extends Employee{
    private Integer teamSize;

    public Manager(String id, String name, Double baseSalary, Integer teamSize) {
        super(id, name, baseSalary);
        this.teamSize = teamSize;
    }

    public Integer getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(Integer teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public Double calculateSalary() {
        return getBaseSalary() + teamSize * 1_000_000;
    }

    BonusEligible be = new BonusEligible() {
        @Override
        public double calculateBonus() {
            return getBaseSalary()*0.3;
        }
    };

    @Override
    public String getPosition() {
        return "Manager";
    }
}
