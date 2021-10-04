package Exercicio1;

/**
 *
 * @author Giovanni Pratto
 */
public class PessoaJuridica extends Contato {
    
    private String cnpj;
    
    public String getCnpj(){
        return cnpj;
    }
    
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
    @Override
    public String toString(){
        String result = super.toString();
        result += "CNPJ: " + cnpj + "\n";
        return result;
    }    
}
