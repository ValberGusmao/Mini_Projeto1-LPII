package controller;

import model.*;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Exemplar> acervo;

    public boolean cadastrarExemplar(Exemplar e){
        return acervo.add(e);
    }

    public Exemplar consultaPorTitulo(String titulo){
        return null;
    }
    public Exemplar consultaPorAutor(String autor){
        return null;
    }
    public Exemplar consultaPorResumo(String resumo){
        return null;

    }
}
