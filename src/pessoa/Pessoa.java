package pessoa;

/**
 * Pessoa
 */
public class Pessoa {

    private String nome;
    private String cpf;
    private String rg;
    private String contas[];

    public Pessoa(String nome, String rg, String cpf) {
        this.cpf = cpf;
        this.nome = nome;
        this.rg = rg;

    }

    public String[] getContas() {
        return contas;
    }

    public void setContas(String contas[]) {
        this.contas = contas;
    }
    
    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        
        return "Nome: "+ this.nome + "RG: " + rg + "CPF" + cpf;
    }
}