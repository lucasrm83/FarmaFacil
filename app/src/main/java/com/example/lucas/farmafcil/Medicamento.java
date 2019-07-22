package com.example.lucas.farmafcil;


public class Medicamento {
    private String nome;
    private String codigo;
    private String quantidade;


    public Medicamento(){
        this("","","");

    }
    public Medicamento(String nome, String codigo, String quantidade){
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;

    }



    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }



    public String toString(){
        return this.nome+", "+this.codigo+", "+this.quantidade;
    }

}
