package agenda;

public class Contato {
    private String nome;
    private Endereco endereco;
    public Contato(String nome, Endereco endereco){
        this.nome = nome;
        this.endereco = endereco;
    }
    public Contato(){

    }
    public String getNome (){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public Endereco getEndereco (){
        return endereco;
    }public void setEndereco (Endereco endereco){
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "nome = "+nome+ ", Endereço: [ "+endereco.toString()+" ]";
    }
}
