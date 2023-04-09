    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import java.time.LocalDateTime;

public class Aluno {

    private String nome,endereco,curso;
    private int matricula;
    private float multa;
    private static int codAl = 1;
    private int codigoDoAluno;
    private LocalDateTime entradAluno;

    public  Aluno (String nome, String endereco, String curso,int matricula) {
        super();
        this.nome = nome;
        this.endereco = endereco;
        this.curso=curso;
        this.matricula = matricula;
        entradAluno= null;
        this.codigoDoAluno = codAl;
        codAl++;
            
    }   
     public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }
    
    public int getMatricula(){
        return matricula;
    }

    public int getCodigoDoAluno(){
        return codigoDoAluno;
    }

    public float getMulta() {
        return multa;
    }

    public void setMulta(float multa) {
        this.multa = multa;
    }
    
    public LocalDateTime getDataEntr(){
        return entradAluno;
    } 
     
    public void setDataEntr(LocalDateTime entrada){
        this.entradAluno = entrada;
    } 
            
}