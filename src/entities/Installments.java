package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installments {
    
    // ATRIBUTOS
    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate dueDate;
    private Double amount;
    // ATRIBUTOS

    // CONSTRUTORES
    public Installments(LocalDate dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }
    // CONSTRUTORES


    // ENCAPSULAMENTO
    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
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
    @Override
    public String toString() {
        return dueDate.format(fmt) + " - " + String.format("%.2f", amount);
    }
    // METODOS

}
