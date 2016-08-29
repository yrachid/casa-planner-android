package br.com.yrachid.casaplanner;


public class Imovel {

    private int id;
    private String endereco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return endereco == null ? "Sem Endereço" : endereco;
    }
}
