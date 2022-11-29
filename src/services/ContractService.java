package services;

import java.time.LocalDate;
import java.sql.Date;

import entities.Contract;
import entities.Installments;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;
    
    

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }



    
    public void processContract(Contract contract, Integer months) {
        contract.getInstallments().add(new Installments(LocalDate.of(2018, 7, 25), 206.04));
    }

}