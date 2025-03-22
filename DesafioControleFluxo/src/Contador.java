import java.util.Scanner;

public class Contador {
    //https://github.com/digitalinnovationone/trilha-java-basico/blob/main/desafios/controle-fluxo/README.md

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o primeiro parâmetro: ");
        int numero2 = scanner.nextInt();

        try {
            contar(numero1, numero2);
        } 
        catch ( ParametrosInvalidosException e){
            System.out.println(e.getMessage()); 
        }

       
        scanner.close();
       
    }

    static void contar(int numero1, int numero2) throws ParametrosInvalidosException{
            if(numero1>numero2){
                int repetir = numero1 - numero2;

                for(int i = 1; i <= repetir; i++ ){
                    System.out.println("imprimindo o numero: " + i);
                    
                }

            } else{
                throw new ParametrosInvalidosException("primeiro parâmetro não pode ser maior que o segundo parâmetro.");
            }
    }
}
