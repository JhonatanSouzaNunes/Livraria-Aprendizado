
package Dados;

import java.time.LocalDateTime;


public class Funcionario {
        
        private String nome, endereço, setor, login,senha;
        private int matricula; 
	private LocalDateTime dataEntrada;
        private int codiF;
        private static int codF=1;

        public Funcionario(String nome, String endereço, String setor, String login, String senha, int matricula) {
        this.nome = nome;
        this.endereço = endereço;
        this.setor = setor;
        this.login = login;
        this.senha = senha;
        this.matricula = matricula;
        this.codiF = codF;
        codF++;
        }

    public String getNome() {
        return nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public String getSetor() {
        return setor;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public int getMatricula() {
        return matricula;
    }
    public int getcodfunci(){
        return this.codiF; 
    }
    
    public LocalDateTime getDataEntrada(){
        return dataEntrada;
    }
        
    public void setDataEntrada(LocalDateTime dataEntrada) {
		this.dataEntrada = dataEntrada;
    } 

 
}
