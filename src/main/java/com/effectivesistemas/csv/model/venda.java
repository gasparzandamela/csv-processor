package com.effectivesistemas.csv.model;

/**
 * Representa uma venda que será registrada ou validada a partir de um arquivo CSV.
 *
 * Cada instância desta classe corresponde a uma linha válida no arquivo,
 * contendo as informações essenciais da transação.
 */
public class Venda {

    private String numeroDaVenda;
    private String nomeDoCliente;
    private String dataDaVenda;
    private String valorDaVenda;

    public Venda() {
    }

    /**
     * Construtor principal que facilita a criação da venda com todos os dados necessários.
     *
     * @param numeroDaVenda  Número identificador da venda
     * @param nomeDoCliente  Nome do cliente responsável pela compra
     * @param dataDaVenda    Data da realização da venda
     * @param valorDaVenda   Valor total da venda
     */
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
