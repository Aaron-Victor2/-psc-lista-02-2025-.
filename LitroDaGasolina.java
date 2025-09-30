
import java.util.Scanner;

public class Gasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o preço do litro da gasolina: R$ ");
        double precoLitro = scanner.nextDouble();

        
        System.out.print("Digite a quantidade de litros vendidos: ");
        double litros = scanner.nextDouble();

        
        double total = precoLitro * litros;

        
        System.out.printf("O cliente deverá pagar: R$ %.2f%n", total);

        scanner.close();
    }
}
