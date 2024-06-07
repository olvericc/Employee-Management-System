package application;

public class No
{
    private final int chave;
    private No esquerda, direita;

    public No(int valor)
    {
        this.chave = valor;
        this.esquerda = null;
        this.direita = null;
    }

    public int getChave()
    {
        return chave;
    }

    public No getEsq()
    {
        return esquerda;
    }

    public No getDir()
    {
        return direita;
    }

    public void setEsq(No esquerda)
    {
        this.esquerda = esquerda;
    }

    public void setDir(No direita)
    {
        this.direita = direita;
    }
}
