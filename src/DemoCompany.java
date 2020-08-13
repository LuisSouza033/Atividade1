import java.util.Scanner;
public class DemoCompany {
    public static void main(String[] args) {
        Scanner emp = new Scanner(System.in);
        int a;
        System.out.println("Bem vindo ao cálculo do seu salário!");
        System.out.println("Escolha uma opção válida:\n 1. Funcionário comum. \n 2. Funcionário Terceirizado.");
        switch(a){
            case 1:
                Employee func = new Employee();
                System.out.println("Digite o seu nome: ");
                func.setName(emp.nextLine());
                System.out.println("Digite suas horas trabalhadas: ");
                func.setHours(emp.nexInteger());
                System.out.println("Digite quanto você ganha por hora: ");
                func.setValuePerHour(emp.nextDouble());
            case 2:
                Employee func2 = new OutsourceEmpleyee();
                System.out.println("Digite o seu nome: ");
                func2.setName(emp.nextLine());
                System.out.println("Digite suas horas trabalhadas: ");
                func2.setHours(emp.nexInteger());
                System.out.println("Digite quanto você ganha por hora: ");
                func2.setValuePerHour(emp.nextDouble());
            default:
                System.out.println("Digite uma opção válida!");
        }
    }
}
