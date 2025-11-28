package com.effectivesistemas.csv.model;

public class Venda {

    private String numeroDaVenda;
    private String nomeDoCliente;
    private String dataDaVenda;
    private String valorDaVenda;

    public Venda() {
    }

    public Venda(
            String numeroDaVenda,
            String nomeDoCliente,
            String dataDaVenda,
            String valorDaVenda) {

        this.numeroDaVenda = numeroDaVenda;
        this.nomeDoCliente = nomeDoCliente;
        this.dataDaVenda = dataDaVenda;
        this.valorDaVenda = valorDaVenda;
    }

    public String getNumeroDaVenda() {
        return numeroDaVenda;
    }

    public void setNumeroDaVenda(String numeroDaVenda) {
        this.numeroDaVenda = numeroDaVenda;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public String getDataDaVenda() {
        return dataDaVenda;
    }

    public void setDataDaVenda(String dataDaVenda) {
        this.dataDaVenda = dataDaVenda;
    }

    public String getValorDaVenda() {
        return valorDaVenda;
    }

    public void setValorDaVenda(String valorDaVenda) {
        this.valorDaVenda = valorDaVenda;
    }
}
