package application;

import java.util.Vector;

public class Pilha
{
    final Vector<Integer> pilhaNumeros = new Vector<>();

    public void inserirNaPilha(int numero)
    {
        pilhaNumeros.add(numero);
        System.out.println("Número " + numero + " adicionado à pilha.");
    }
}
