package application;

public class Arvore
{
    No raiz;

    public Arvore()
    {
        this.raiz = null;
    }

    public No busca(No T, int valor)
    {
        if(T == null)
        {
            return null;
        }

        if(T.getConteudo()== valor)
        {
            return T;
        }

        No aux = busca(T.getEsq(), valor);

        if (aux == null)
        {
            aux = busca(T.getDir(), valor);
        }
        return aux;
    }

    public No busca(int valor)
    {
        if(vazia())
        {
            return null;
        }
        return busca(raiz, valor);
    }

    public boolean vazia()
    {
        return (raiz == null);
    }

    public void insereNo(int valor, String lado, Integer valorPai)
    {
        No novoNo = new No(valor);
        No pai = busca(valorPai);

        if (pai == null)
        {
            throw new IllegalArgumentException("Valor do pai não encontrado.");
        }

        if ("lado esquerdo".equalsIgnoreCase(lado))
        {
            pai.setEsq(novoNo);
        } else if ("lado direito".equalsIgnoreCase(lado))
        {
            pai.setDir(novoNo);
        }
        else
        {
            throw new IllegalArgumentException("Esse lado está inválido, por favor, use 'lado esquerdo' ou 'lado direito'.");
        }
    }

    void caminhamentoCentralAEsquerda(No T)
    {
        if (T == null || T.getDir()!= null) {
            return;
        }

        System.out.println(T.getConteudo());
        caminhamentoCentralAEsquerda(T.getEsq());
    }

    void caminhamentoPreFixadoADireita(No T)
    {
        if (T == null || T.getEsq()!= null)
        {
            return;
        }

        caminhamentoPreFixadoADireita(T.getDir());
        System.out.println(T.getConteudo());
    }

    void caminhamentoPostFixadoAEsquerda(No T)
    {
        if (T == null || T.getDir()!= null)
        {
            return;
        }

        caminhamentoPostFixadoAEsquerda(T.getEsq());
        System.out.println(T.getConteudo());
    }

    void consultarNosFolhas(No T) {
        if (T == null)
        {
            return;
        }
        if (T.getEsq() == null && T.getDir() == null)
        {
            System.out.println(T.getConteudo());
        }
        else
        {
            consultarNosFolhas(T.getEsq());
            consultarNosFolhas(T.getDir());
        }
    }

    void listarPaiFilhos(No T)
    {
        if (T == null)
        {
            return;
        }

        System.out.println("Raiz: " + T.getConteudo());

        if (T.getEsq()!= null)
        {
            System.out.println("O seu filho esquerdo é: " + T.getEsq().getConteudo());
        }
        if (T.getDir()!= null)
        {
            System.out.println("O seu filho direito é: " + T.getDir().getConteudo());
        }

        listarPaiFilhos(T.getEsq());
        listarPaiFilhos(T.getDir());
    }

}
