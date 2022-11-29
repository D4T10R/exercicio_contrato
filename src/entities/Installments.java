package entities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Installments {
    
    // ATRIBUTOS
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date dueDate;
    private Double amount;
    // ATRIBUTOS

    // CONSTRUTORES
    public Installments(LocalDate localDate, Double amount) {
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
    

    // METODOS
    public String toString() {
        return sdf.format(dueDate) + " - " + amount;
    }
    // METODOS

}
