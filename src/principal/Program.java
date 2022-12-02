package principal;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Contract;
import entities.Installments;
import services.ContractService;
import services.PaypalService;

public class Program {

    public static void main(String[] args) throws ParseException {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre os dados do contrato: ");
        System.out.println("Número: ");
        Integer number = sc.nextInt();
        sc.nextLine();
        System.out.println("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
        System.out.println("Valor do contrato: ");
        Double totalValue = sc.nextDouble();
        Contract contract = new Contract(number, date, totalValue);

        System.out.println("Entre com o numero de parcelas: ");
        int n = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, n);

        System.out.println("Parcelas: ");
        for (Installments installments : contract.getInstallments()) {
            System.out.println(installments);
        }
    }

    // D4T10R
}
