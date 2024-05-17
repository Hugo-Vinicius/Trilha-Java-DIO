import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // Classe Scanner

        Scanner Scan = new Scanner(System.in);

        // Mensagens e captação de dados

System.out.println("Digite seu nome\n");
String NomeCliente = Scan.nextLine();

System.out.println("Qual a sua agência\n");
String Agencia = Scan.nextLine();

System.out.println("Digite o número da Conta\n");
int Numero = Scan.nextInt();

System.out.println("Digite seu saldo\n");
double Saldo = Scan.nextDouble();

// Mensagem final

System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo é " + Saldo + " já está disponível para saque.");
    
Scan.close();

   }
}
