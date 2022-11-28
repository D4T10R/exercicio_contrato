package entities;

import java.util.Date;

public class Installments {
    
    // ATRIBUTOS
    private Date dueDate;
    private Double amount;
    // ATRIBUTOS

    // CONSTRUTORES
    public Installments(Date dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }
    // CONSTRUTORES


    // ENCAPSULAMENTO
    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
    // ENCAPSULAMENTO
    

}
