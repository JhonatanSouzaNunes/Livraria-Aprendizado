package Registros;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

import Dados.*;

public class RegistroDeLivros {

    private ArrayList<Livros> rL    ;

    public RegistroDeLivros() {
        rL = new ArrayList<Livros>();
    }

    public void addLivro(Livros livro) {
        rL.add(livro);
    }

    public Livros getLivro(int indice) {
        return rL.get(indice);
    }

    public void removeLivro(Livros livro) {
        rL.remove(livro);
    }

    public void removeLivro(int indice) {
        rL.remove(indice);
    }

    public int size() {
        return rL.size();
    }

    public void emprestarLivro(Livros livro, Aluno aluno) {
        LocalDateTime now = LocalDateTime.now();
        livro.setDataEmprestimo(now);
        livro.setAlunoComLivro(aluno);
    }

         public void ordenaLivros() {
           Collections.sort(rL);
    }
}
