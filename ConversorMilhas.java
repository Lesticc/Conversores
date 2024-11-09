import java.util.Scanner;

public class ConversorMilhas {
    /*Km = Mi*1.609344
     *Mi = Km/1.609344 
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        double numeroConversor = 1.609344;
        double resultado = 0;

        System.out.println("=================================");
        System.out.println("Conversor de milhas e quilômetros");
        System.out.println("1- Quilômetros para milhas");
        System.out.println("2- Milhas para quilômetros");
        System.out.println("=================================");
        String escolha = scanner.nextLine();
        switch(escolha){
            case "1":
                System.out.println("=================================");
                System.out.println("Insira a velocidade que deseja converter:");
                numero = scanner.nextInt();
                System.out.println("=================================");
                System.out.println("Fórmula:");
                System.out.println("Mi = " + numero + "/" + numeroConversor);
                System.out.println("=================================");
                resultado = numero/numeroConversor;
                System.out.println("Mi = " + (int) resultado);
                System.out.println("Km = " + numero);
                System.out.println("=================================");
                break;

            case "2":
                System.out.println("=================================");
                System.out.println("Insira a velocidade que deseja converter:");
                numero = scanner.nextInt();
                System.out.println("=================================");
                System.out.println("Fórmula:");
                System.out.println("Km = " + numero + "*" + numeroConversor);
                System.out.println("=================================");
                resultado = numero*numeroConversor;
                System.out.println("Mi = " + numero);
                System.out.println("Km = " + (int) resultado);
                System.out.println("=================================");
                break;
        }
        scanner.close();
    }
}
