package application;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Fila
{
    final Deque<Integer> filaDeNumeros = new ArrayDeque<>();
    private final Scanner sc = new Scanner(System.in);

    public void inserir(int numero)
    {
        filaDeNumeros.addLast(numero);
        System.out.println("Número " + numero + " adicionado à fila.");
    }
}
