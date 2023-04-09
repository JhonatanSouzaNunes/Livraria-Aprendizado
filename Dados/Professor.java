
package Dados;

import java.time.LocalDateTime;


public class Professor {
    
        private String nome, endereco, setor;
        private int matricula;
        private static  int codLv = 1 ;
	private  int codigoDoProfe;
        private LocalDateTime dataEntrada;

    public Professor(String nome, String endereco, String setor, int matricula) {
        this.nome = nome;
        this.endereco = endereco;
        this.setor = setor;
        this.matricula = matricula;
        this.dataEntrada=null;
        this.codigoDoProfe = codLv;
        codLv++;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getSetor() {
        return setor;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getCodigoDoProfe() {
        return codigoDoProfe;
    }
        
    public LocalDateTime setDataEntrada(){
        return dataEntrada;
    }

    public void setDataEntrada(LocalDateTime dataEntrada) {
	this.dataEntrada = dataEntrada;
    
    }
        
}
