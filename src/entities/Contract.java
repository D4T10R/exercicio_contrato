package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

   
    // ATRIBUTOS
    private Integer number;
    private Date date;
    private Double totalValue;
    private List<Installments> Installments = new ArrayList<>();
    // ATRIBUTOS

    // CONSTRUTORES
    public Contract() {
    }

    public Contract(Integer number, Date date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installments> getInstallments() {
        return this.Installments;
    }
    // ENCAPSULAMENTO   



}