package Registros;

import Dados.Funcionario;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class RegistroDeFuncionarios {

    private ArrayList<Funcionario> rF;

    public RegistroDeFuncionarios() {
        rF = new ArrayList<Funcionario>();
    }

    public void addFuncionario(Funcionario funci) {
        rF.add(funci);
    }

    public Funcionario getFuncionario(int indice) {
        return rF.get(indice);
    }

    public void removerFuncionario(Funcionario funci) {
        rF.remove(funci);
    }

    public Funcionario removerFuncionario(int indice) {
        return rF.remove(indice);
    }
    
     public void dataEntrada(Funcionario funcio) {
                LocalDateTime now = LocalDateTime.now();
                funcio.setDataEntrada(now);
               
     }

    public int size() {
        return rF.size();
    }

}
