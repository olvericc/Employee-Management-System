package application;

public class No
{
    private int conteudo;
    private No esq;
    private No dir;

    public No(int valor)
    {
        this.conteudo = valor;
        this.esq = null;
        this.dir = null;
    }

    public int getConteudo()
    {
        return conteudo;
    }

    public void setConteudo(int conteudo)
    {
        this.conteudo = conteudo;
    }

    public No getEsq()
    {
        return esq;
    }

    public void setEsq(No esq)
    {
        this.esq = esq;
    }

    public No getDir()
    {
        return dir;
    }

    public void setDir(No dir)
    {
        this.dir = dir;
    }
}