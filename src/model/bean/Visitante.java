
package model.bean;

public class Visitante {
    
    private int id;
    private String nome;
    private String cpf;
    private int valorpagar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getValorpagar() {
        return valorpagar;
    }

    public void setValorpagar(int valorpagar) {
        this.valorpagar = valorpagar;
    }

    public Visitante(int id, String nome, String cpf, int valorpagar) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.valorpagar = valorpagar;
    }
    
    public Visitante ()
    {
        
    }

    @Override
    public String toString() {
        return "Visitante{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", valorpagar=" + valorpagar + '}';
        
    }
    
    
}
