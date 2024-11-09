import java.util.Scanner;

public class ConversorCelsius{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        double resultado = 0;

        System.out.println("=================================");
        System.out.println("Conversor de Celsius e Fahrenheit");
        System.out.println("1- Celsius para Fahrenheit");
        System.out.println("2- Fahrenheit para Celsius");
        System.out.println("=================================");
        String escolha = scanner.nextLine();
        switch(escolha){
            case "1":
                System.out.println("=================================");
                System.out.println("Insira os graus que deseja converter:");
                numero = scanner.nextInt();
                System.out.println("=================================");
                System.out.println("Fórmula:");
                System.out.println("F = " + numero + "*(9/5)1+32");
                System.out.println("=================================");
                resultado = (numero*(9.0/5))+32;
                System.out.println("C° = " + numero);
                System.out.println("F° = " + (int) resultado);
                System.out.println("=================================");
                break;

            case "2":
                System.out.println("=================================");
                System.out.println("Insira os graus que deseja converter:");
                numero = scanner.nextInt();
                System.out.println("=================================");
                System.out.println("Fórmula:");
                System.out.println("C = (" + numero + "-32)*(5/9)");
                System.out.println("=================================");
                resultado = (numero-32)*(5.0/9);
                System.out.println("C° = " + (int) resultado);
                System.out.println("F° = " + numero);
                System.out.println("=================================");
                break;
        }
        scanner.close();
    }
}