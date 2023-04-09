/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;
import  java.time.LocalDateTime;

public class Livros implements Comparable<Livros> {
    
    
	private String titulo, autor, editora, issn;
        private char tipo;
        private int anoDePub,fatorImpac; 
	private LocalDateTime dataEmprestimo;
        private   int codLv = 1 ;
	private  int codigoDoLivro;
	Aluno alunoComLivro;
        Professor profComLivro;
	
        
        
          //Construtor para livros.
	public Livros  ( String  titulo, String  autor, String editora, String issn, int  anoDePub ) {
                    super ();
                    this.titulo = titulo;
                    this.autor = autor;
                    this.editora=editora;
                    this.anoDePub = anoDePub;
                    this.issn = issn;
                    dataEmprestimo =  null ;
                    alunoComLivro =  null ;
                    profComLivro = null;
                    this . codigoDoLivro = codLv;
                    codLv ++ ;
	}

        
            //Construtor para periódicos.
        public Livros(String titulo, String autor, String issn,char tipo, int fatorImpac ) {
                    this.titulo = titulo;
                    this.autor = autor;
                    this.issn = issn;
                    this.tipo = tipo;
                    this.fatorImpac = fatorImpac;
                    dataEmprestimo =  null ;
                    this.codigoDoLivro = codLv;
                    codLv++;
                    dataEmprestimo =  null ;
        }
        
        
	public  String  getTitulo () {
		return titulo;
	}

	
	public  String  getAutor () {
		return autor;
	}

        public String getEditora() {
            return editora;
        }

        public String getIssn() {
            return issn;
        }

        public char getTipo() {
        return tipo;
        }

        public int getAnoDePub() {
            return anoDePub;
        }

        public int getFatorImpac() {
            return fatorImpac;
        }

        

        
        public  int  getCodigoDoLivro () {
                    return codigoDoLivro;
         }

	public LocalDateTime getDataEmprestimo() {
		return dataEmprestimo;
        
         }

	public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	 }

	public String getAlunoComLivro() {
		return alunoComLivro.getNome();
	 }

	public void setAlunoComLivro(Aluno alunoComLivro) {
		this.alunoComLivro = alunoComLivro;
	 }
	
        @Override
	public  int  compareTo(Livros l) {
            return this.titulo.compareToIgnoreCase(l.getTitulo ());
	 }

}
