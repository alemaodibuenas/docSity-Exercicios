package Exercicio1;

/**
 *
 * @author Giovanni Pratto
 */
public class Runner {
    
    public static void main(String[] args) {        
            
        Contato contato = new Contato();
        contato.setNome("João");
        
        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Giovanni Pratto");
        pf.setCpf("015.462.221-46");
        
        //imprimirContato(contato);
        imprimirContato(pf);
        
    }
    
    private static void imprimirContato(Contato contato){
            System.out.println(contato);
    }
    
}
