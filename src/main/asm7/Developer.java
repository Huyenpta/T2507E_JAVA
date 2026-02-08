package main.asm7;

public class Developer extends Employee{

    private int overtimeHours;

    public Developer(String id, String name, Double baseSalary, int overtimeHours) {
        super(id, name, baseSalary);
        this.overtimeHours = overtimeHours;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public Double calculateSalary() {
        return getBaseSalary() + overtimeHours * 50_000;
    }

    @Override
    public String getPosition() {
        return "Developer";
    }

    BonusEligible be = new BonusEligible() {
        @Override
        public double calculateBonus() {
            return getBaseSalary()*0.2;
        }
    };
}
