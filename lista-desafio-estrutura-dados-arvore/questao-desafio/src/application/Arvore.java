package application;

public class Arvore
{
    private No raiz;

    public Arvore()
    {
        raiz = null;
    }

    public void inserir(int valor)
    {
        raiz = inserirRec(raiz, valor);
    }

    private No inserirRec(No atual, int valor)
    {
        if (atual == null) {
            atual = new No(valor);
            return atual;
        }

        if (valor < atual.getChave())
        {
            atual.setEsq(new No(valor));
        }
        else if (valor > atual.getChave())
        {
            atual.setDir(new No(valor));
        }

        return atual;
    }

    public void listarPaiFilhos()
    {
        listarPaiFilhosRec(raiz, null);
    }

    private void listarPaiFilhosRec(No atual, No pai)
    {
        if (atual!= null)
        {
            System.out.println(" Nó: " + atual.getChave() + ", Pai: " + (pai == null? "Nenhum" : pai.getChave()));
            listarPaiFilhosRec(atual.getEsq(), atual);
            listarPaiFilhosRec(atual.getDir(), atual);
        }
    }
}
