package agenda;

public class AgendaEnderecos {
    private int maxContatos;
    private int contContatos = 0;
    private Contato[] contatos = new Contato[maxContatos];

    public AgendaEnderecos(int maxContatos) {
        this.maxContatos = maxContatos;
    }

    public AgendaEnderecos() {

    }

    public boolean apagaContato(String nomeContato) {
        for (int i = 0; i < maxContatos; i++) {
            if (contatos[i].getNome().equals(nomeContato)) {
                contatos[i] = null;
                return true;
            }
        }
        return false;
    }
    public boolean cadastraContato (Contato c){
        if (contContatos< maxContatos){
            contatos[contContatos] = c;
            return true;
        }
        return false;
    }
    public Endereco pesquisaEndereco (String nomeContato){
        for (int i = 0; i<maxContatos; i++){
            if (contatos[i].getNome().equals(nomeContato)) {
                return contatos[i].getEndereco();
            }
        }
        return null;
    }
    public int pesquisarQuantContBairro (String bairro){
        int cont = 0;
        for (int i = 0; i< maxContatos; i++){
            if (contatos[i].getEndereco().getBairro().equals(bairro)){
                cont ++;
            }
        }
        return cont;
    }
}

