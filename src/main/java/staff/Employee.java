package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        if(newName != null) {
            this.name = newName;
        } else { return; }
    }
    public String getNiNumber(){
        return this.niNumber;
    }
    public double getSalary(){
        return this.salary;
    }
    public void raiseSalary(double raiseBy){
        if(raiseBy <= 0){ return; } else { this.salary = this.salary + raiseBy; }
    }
    public double payBonus(){
        return this.salary /= 100;
    }

}
