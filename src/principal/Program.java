package principal;

import java.util.Date;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Contract;
import services.ContractService;

public class Program {

    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre os dados do contrato: ");
        System.out.println("Número: ");
        Integer number = sc.nextInt();
        System.out.println("Data (dd/MM/yyyy): ");
        Date date =  sdf.parse(sc.nextLine());
        System.out.println("Valor do contrato: ");
        Double totalValue = sc.nextDouble();
        Contract contract = new Contract(number, date, totalValue);

        System.out.println("Entre com o numero de parcelas: ");
        Integer n = sc.nextInt();
        
        ContractService contractService = new ContractService(null);

        contractService.processContract(contract, n);

    }

    // D4T10R
}
