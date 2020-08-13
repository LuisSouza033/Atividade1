public class OutsourceEmpleyee extends Employee{
    private Double additionalCharge;
    public OutsourceEmpleyee(){}
    public OutsourceEmpleyee(String name, Integer hours, Double valueperhour, Double additionalcharge){
        super(name,hours,valueperhour);
        this.additionalCharge = additionalcharge;
    }
    @Override
    public void payment(double value){
        value = getHours() * getValuePerHour() + (additionalCharge*1.1);
        System.out.println(value);
    }
}
