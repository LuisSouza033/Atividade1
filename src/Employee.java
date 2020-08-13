public class Employee {
    private String Name;
    private Integer Hours;
    private double valuePerHour;
    public Employee(){}
    public Employee(String name, Integer hours, double valuePerHour) {
        Name = name;
        Hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getHours() {
        return Hours;
    }

    public void setHours(Integer hours) {
        Hours = hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public void payment(double value){
        value = this.valuePerHour*this.Hours;
        System.out.println(value);
    }
}
