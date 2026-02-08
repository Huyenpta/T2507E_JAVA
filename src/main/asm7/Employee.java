package main.asm7;

public abstract class Employee {
    private String id;
    private String name;
    private Double baseSalary;

    public Employee(String id, String name, Double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract Double calculateSalary();

    public abstract String getPosition();

    public void showInfo(){
        System.out.println("Id: " +getId() + ", Name: " +getName() + ", Position: " +getPosition() + ", Salary: " +calculateSalary());
    }


}
