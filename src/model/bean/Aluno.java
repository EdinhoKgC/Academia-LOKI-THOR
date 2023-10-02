
package model.bean;


public class Aluno {
    
    private int id;
    private String nome;
    private String cpf;
    private int idade;
    private String mensalidade;
    private float multa;
    private String endereco;
    private String telefone;
    private String plano;
    
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public String getMensalidade(){
        return mensalidade;
    }
    
    public void setMensalidade(String mensalidade){
        this.mensalidade = mensalidade;
    }
    
    public float getMulta(){
        return multa;
    }
    
    public void setMulta(float multa){
        this.multa = multa;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco (String endereco){
        this.endereco = endereco;
    }
    
    public String setPlano(){
        return plano;
    }
    
    public void getPlano(String plano){
        this.plano = plano;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    @Override
    public String toString() {
        return "Aluno{" + "id=" + id + "nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", mensalidade=" + mensalidade + ", multa=" + multa + ", endereco=" + endereco + ", telefone=" + telefone + ", plano=" + plano + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Aluno(){
        
    }

    public Aluno(int id, String nome, String cpf, int idade, String mensalidade, float multa, String endereco, String telefone, String plano) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.mensalidade = mensalidade;
        this.multa = multa;
        this.endereco = endereco;
        this.telefone = telefone;
        this.plano = plano;
    }
    
}
