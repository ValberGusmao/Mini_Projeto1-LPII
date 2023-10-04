package model;

public abstract class Exemplar {
    protected String titulo;
    protected String autores;
    protected String resumo;
    protected String editora;
    protected int ano;
    protected int quantPaginas;
    //TODO adicionar genêro
    protected int quantExemplares;

    public String getTitulo() {
        return titulo;
    }

    public String getAutores() {
        return autores;
    }

    public String getResumo() {
        return resumo;
    }

    public String getEditora() {
        return editora;
    }

    public int getAno() {
        return ano;
    }

    public int getQuantPaginas() {
        return quantPaginas;
    }

    public int getQuantExemplares() {
        return quantExemplares;
    }
}
