import java.util.Scanner;
    public class DemoCompany {
    public static void main(String[] args) {
        Scanner emp = new Scanner(System.in);
        int a;
        System.out.println("Bem vindo ao cálculo do seu salário!");

            Employee func = new OutsourceEmployee();
            System.out.println("Digite o seu nome: ");
            func.Name=emp.nextLine();
            System.out.println("Digite suas horas trabalhadas: ");
            func.setHours(emp.nextInt());
            System.out.println("Digite quanto você ganha por hora: ");
            func.setValuePerHour(emp.nextDouble());
            System.out.println("Você é um funcionário terceirizado? \n1- Sim \n2-Não");
            a = emp.nextInt();
            if(a==1){
                System.out.println("Digite sua despesa adicional: ");
                ((OutsourceEmployee) func).setAdditionalCharge(emp.nextDouble());
            }
            if(a==2){
                ((OutsourceEmployee) func).setAdditionalCharge(0.0);
            }
        func.payment(0.0);

    }
}
