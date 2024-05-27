package application;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Arvore arvore = new Arvore();

        arvore.insereNo(5, "", null);
        arvore.insereNo(3, "lado esquerdo", 5);
        arvore.insereNo(4, "lado direito", 3);
        arvore.insereNo(9, "", null);
        arvore.insereNo(7, "lado esquerdo", 9);
        arvore.insereNo(11, "lado direito", 9);

        while (true)
        {
            System.out.println("\nEsse é o seu menu de seleção:");
            System.out.println("1 - Opção para apresentar o caminhamento central a esquerda.");
            System.out.println("2 - Opção para apresentar o caminhamento pré-fixado a direita.");
            System.out.println("3 - Opção para apresentar o caminhamento pós-fixado a esquerda.");
            System.out.println("4 - Opção para apresentar todos os nós folhas.");
            System.out.println("5 - Opção para listar o pai (Raiz) e seus Filhos.");
            System.out.println("6 - Sair do meu programinha.");

            System.out.print("Agora para continuar, insira um número: ");

            try(Scanner sc = new Scanner(System.in))
            {
                if (!sc.hasNextInt())
                {
                    System.out.println("Você me informou um número incorreto, por favor, tente novamente!");
                    continue;
                }

                int numero = sc.nextInt();

                switch (numero)
                {
                    case 1:
                        arvore.caminhamentoCentralAEsquerda(arvore.raiz);
                        break;
                    case 2:
                        arvore.caminhamentoPreFixadoADireita(arvore.raiz);
                        break;
                    case 3:
                        arvore.caminhamentoPostFixadoAEsquerda(arvore.raiz);
                        break;
                    case 4:
                        arvore.consultarNosFolhas(arvore.raiz);
                        break;
                    case 5:
                        arvore.listarPaiFilhos(arvore.raiz);
                        break;
                    case 6:
                        System.exit(0);
                    default:
                        System.out.println("Isso é uma opção inválida, melhor tentar novamente!");
                }
            }
        }
    }
}
