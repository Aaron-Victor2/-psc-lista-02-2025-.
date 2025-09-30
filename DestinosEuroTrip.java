
import java.util.Scanner;

public class EuroTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        double precoAlemanha, precoPortugal, precoItalia;
        int pessoasAlemanha, pessoasPortugal, pessoasItalia;

        
        System.out.println("Digite o preço da viagem para a Alemanha:");
        precoAlemanha = scanner.nextDouble();
        System.out.println("Digite a quantidade de pessoas que irão para a Alemanha:");
        pessoasAlemanha = scanner.nextInt();

        System.out.println("Digite o preço da viagem para Portugal:");
        precoPortugal = scanner.nextDouble();
        System.out.println("Digite a quantidade de pessoas que irão para Portugal:");
        pessoasPortugal = scanner.nextInt();

        System.out.println("Digite o preço da viagem para Itália:");
        precoItalia = scanner.nextDouble();
        System.out.println("Digite a quantidade de pessoas que irão para Itália:");
        pessoasItalia = scanner.nextInt();

       
        double totalViagem = (precoAlemanha * pessoasAlemanha) +
                             (precoPortugal * pessoasPortugal) +
                             (precoItalia * pessoasItalia);

        
        int totalPessoas = pessoasAlemanha + pessoasPortugal + pessoasItalia;

       
        System.out.println("\nValor total da viagem: R$ " + totalViagem);
        System.out.println("Total de pessoas que irão viajar: " + totalPessoas);

        scanner.close();
    }
}
