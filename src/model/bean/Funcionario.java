
package model.bean;


public class Funcionario {
    private int id;
    private String nome;
    private float salario;
    private String funcao;
    private String endereco;
    private String telefone;

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

    public float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Funcionario(int id, String nome, float salario, String funcao, String endereco, String telefone) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.funcao = funcao;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    public Funcionario (){
        
    }

    @Override
    public String toString() {
        return "Funcion\u00e1rio{" + "id=" + id + ", nome=" + nome + ", salario=" + salario + ", funcao=" + funcao + ", endereco=" + endereco + ", telefone=" + telefone + '}';
    }
    
}
