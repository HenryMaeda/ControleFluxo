import java.util.Scanner ; 


public class Contador {
    
    static class ParametrosInvalidosException  extends Exception {
        public ParametrosInvalidosException (String mensagem) {
            super(mensagem) ;  
        }
    }
    
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in) ; 
        System.out.println("Digite o primeiro parâmetro : ");
        int primeiroParametro = scanner.nextInt() ; 
        System.out.println("Digite o segundo parâmetro : ");
        int segundoParametro = scanner.nextInt() ; 
        
        try {
            contar(primeiroParametro, segundoParametro);
        }
        catch (ParametrosInvalidosException  expection) {
            System.out.println("Segundo parâmetro deve ser maior que o primeiro");
        }

        scanner.close() ; 

    }

    static void contar(int primeiroParametro , int segundoParametro ) throws ParametrosInvalidosException  {

        if (primeiroParametro >= segundoParametro ) {
            throw new ParametrosInvalidosException ("O primeiro parâmetro é maior ou igual ao segundo, isso é inválido") ; 
        }
        else {
            int contagem = segundoParametro - primeiroParametro ; 
            for (int x=1 ; x <= contagem ; x++ ) {
                System.out.println("Imprimindo o número " + x ); 
            } 
        }
    }
}
