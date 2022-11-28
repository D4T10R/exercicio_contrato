package services;

public interface OnlinePaymentService {
    
    Double paymentFee(Double amount);
    Double inerest(Double amount, Integer months); 

}
