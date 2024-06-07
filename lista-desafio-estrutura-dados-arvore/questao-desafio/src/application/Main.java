package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numeros = new ArrayList<>();
        Fila fila = new Fila();
        Pilha pilha = new Pilha();
        Arvore arvore = new Arvore();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 20; i++)
        {
            System.out.print("Digite o número " + (i+1) + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero);

            if (isPrimo(numero))
            {
                arvore.inserir(numero);
            }
            else if (numero % 2 == 0)
            {
                fila.inserir(numero);
            }
            else
            {
                pilha.inserirNaPilha(numero);
            }
        }

        System.out.println("Números na árvore:");
        arvore.listarPaiFilhos();
        System.out.println("Números na fila: " + fila.filaDeNumeros);
        System.out.println("Números na pilha: " + Arrays.toString(pilha.pilhaNumeros.toArray()));

        scanner.close();
    }

    public static boolean isPrimo(int num)
    {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++)
        {
            if (num % i == 0) return false;
        }
        return true;
    }
}
