import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner leitura = new Scanner(System.in);
        int n1, n2;
        System.out.println("Digite o primeiro número: ");
        n1 = leitura.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = leitura.nextInt();
        if (n1 == n2)
        {
            System.out.println("Os números digitados são iguais.");
        }
        else
        {
            System.out.println("Os números digitados são diferentes.");
            if(n1 > n2)
            {
                System.out.println("O primeiro número é maior que o segundo.");
            }
            else
            {
                System.out.println("O segundo número é maior que o primeiro.");
            }
        }
    }
}