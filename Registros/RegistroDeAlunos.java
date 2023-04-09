package Registros;

import java.util.ArrayList;
import Dados.Aluno;
import java.time.LocalDateTime;

public class RegistroDeAlunos {

    private ArrayList< Aluno> rC;

    public RegistroDeAlunos() {
        rC = new ArrayList<Aluno>();
    }

    public void addAluno(Aluno aluno) {
        rC.add(aluno);
    }

    public Aluno getAluno(int indice) {
        return rC.get(indice);
    }

    public void removeContato(Aluno aluno) {
        rC.remove(aluno);
    }

    public Aluno removeContato(int indice) {
        return rC.remove(indice);
    }
    
    public void dataEntra(Aluno aluno){
        LocalDateTime now = LocalDateTime.now();
        aluno.setDataEntr(now);
    }

    public int size() {
        return rC.size();
    }
}
