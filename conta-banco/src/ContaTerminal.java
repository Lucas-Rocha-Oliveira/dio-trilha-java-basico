import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //criar o objeto do tipo scaner
        Scanner scanner = new Scanner(System.in);
        
        //Receber os dados com o aparecimento de uma mesagem
        System.out.println("Por favor, digite o número da conta");
        int num_conta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite o número da Agência !");
        String num_Agencia = scanner.nextLine();
        System.out.println("Por favor, digite o seu nome!");
        String nome = scanner.nextLine();
        System.out.println("Por favor, digite o saldo!");
        float saldo = scanner.nextFloat();

        //Imprimir a mesagem final
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nome, num_Agencia, num_conta, saldo);
        
        scanner.close();
    }
}
