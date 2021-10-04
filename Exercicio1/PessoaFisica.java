package Exercicio1;

/**
 *
 * @author Giovanni Pratto
 */
public class PessoaFisica extends Contato {
    
    private String cpf;
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    @Override
    public String toString(){
        String result = super.toString();
        result += "CPF:" + cpf + "\n";
        return result;
    }
}
