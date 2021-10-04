package Exercicio1;

/**
 *
 * @author Giovanni Pratto
 */
public class Contato {
    
    private String nome;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    @Override
    public String toString(){
        String result = "Contato\n";
        result += "Nome: " + nome + "\n";
        return result;
    }    
}
