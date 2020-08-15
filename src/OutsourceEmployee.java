public class OutsourceEmployee extends Employee{
    protected Double additionalCharge;

    public OutsourceEmployee(String name, Integer hours, Double valueperhour, Double additionalcharge){
        super(name,hours,valueperhour);
        this.additionalCharge = additionalcharge;
    }

    public OutsourceEmployee() {

    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public void payment(double value){
        value = getHours() * getValuePerHour() + (additionalCharge*1.1);
        System.out.println(value);
        }
}
