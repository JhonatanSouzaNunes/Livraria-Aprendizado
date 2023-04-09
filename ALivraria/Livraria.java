package ALivraria;


import java.util.Scanner;

import Registros.*;
import Dados.*;


public class Livraria {

    
            static Scanner s = new Scanner(System.in);

            public static RegistroDeAlunos rA;
            public static RegistroDeLivros rL;
            public static RegistroDeFuncionarios rF;
            public static RegistroDePeriodicos rP;
            public static RegistrodeProfessor rT; 

                //Adicionar novo Aluno
            
            public static void adicionarAluno() {
                 String nome, curso, endereco;
                 int matricula;
                 Aluno a;
                 System.out.println(" ==> Adicionar aluno <==== \n ");
                 System.out.print(" Nome: ");
                 nome = s.next();
                 System.out.print(" Curso: ");
                 endereco = s.next();
                 System.out.print(" Curso: ");
                 curso = s.next();
                 System.out.print(" Matricula: ");
                 matricula = s.nextInt();
                
                 a = new  Aluno(nome,endereco,curso,matricula);
                 rA.dataEntra(a);
                 rA.addAluno(a);
                 
                 System.out.println("Aluno Adicionado!");
                 System.out.println("Data de Entrada!"+a.getDataEntr());
                 
                 
            }

             
             //Adicionar novo funcionario 
             
            public static void adicionarFuncionario(){
                 String nome, endereço, setor, login,senha;
                 int matricula;
                 Funcionario fcn;
                 System.out.println(" ===> Adicionar Funcionario: <==== \n ");
                 System.out.print(" Nome: ");
                 nome = s.next();
                 System.out.print(" endereço: ");
                 endereço = s.next();
                 System.out.print(" setor: ");
                 setor = s.next();
                 System.out.print(" Crie um login: ");
                 login = s.next();
                 System.out.print(" Crie uma senha: ");
                 senha = s.next();
                 System.out.print(" Matricula: ");
                 matricula = s.nextInt();
                

                 fcn = new Funcionario(nome, endereço, setor, login, senha, matricula);
                 rF.dataEntrada(fcn);
                 System.out.println("Funcionario Adicionado!");
                 System.out.println("Data de entrada: "+ fcn.getDataEntrada());
                 
                 rF.addFuncionario(fcn);
                 
             }
             
             
              //Adicionar novo livro
             
            public  static  void  adicionaLivro () {
                 String titulo, autor, editora, issn;
                 char tipo =0;
                 Livros liv;
                 System.out.print(" Tipo livro(L) ou Periódico(P): ");
                 tipo = s.next().toUpperCase().charAt(0);
                 s.nextLine();
                  if(tipo=='P'){
                      
                      //sendo ‘C’ para conferências, ‘R’ para revistas e ‘P’ para periódicos
                           
                          int fatorImpac;
                            System.out.println(" ===> Adicionar Periódico: <==== \n ");
                            System.out.print(" Titulo: ");
                            titulo = s.nextLine();
                            System.out.print(" Autor: ");
                            autor = s.nextLine();
                            System.out.print(" Issn: ");
                            issn = s.nextLine();
                            System.out.print(" Tipo; (C) p/ conferências,(R) p/ revistas ou (P) p/ Periódico: ");
                            tipo = s.next().toUpperCase().charAt(0);
                            System.out.print(" Fator de impacto: ");
                            fatorImpac = s.nextInt();
                            liv = new Livros(titulo, autor , issn , tipo , fatorImpac);
                            rP.addPeriodico(liv);
                            System.out.println("Periódico adicionado!");
                 }
                    if(tipo=='L')
                      
                        {
                        int anoDePub;
                        System.out.println(" ===> Adicionar Livros: <==== \n ");
                        System.out.print(" Titulo: ");
                        titulo = s.nextLine();
                        System.out.print(" Autor: ");
                        autor = s.nextLine();
                        System.out.print(" Editora: ");
                        editora = s.nextLine();
                        System.out.print(" Issn: ");
                        issn = s.nextLine();
                        System.out.print(" Ano de publicação: ");
                        anoDePub = s.nextInt();
                     liv = new Livros(titulo, autor, editora, issn, anoDePub);
                     rL.addLivro(liv);
                     System.out.println("Livro adicionado!");
                     }else{
                        System.out.println("Tipo invalido!");
                    }
             }

            
            
            
            public static void listarLivrosLivres() {
                     System.out.println(" ===> Lista de livros disponiveis <=== \n");
                     System.out.println(" Nr Registro: \t Titulo: \t Autor: \t Editora: \t Issn: \t Ano: ");
                     for (int i = 0; i < rL.size(); i++) {
                         Livros l = rL.getLivro(i);
                         if (l.getDataEmprestimo() == null) {
                             System.out.println("");
                             System.out.printf("  %s10s "," %s "," %s \t %s \t %s \t %s \t %s \t \n ",
                                 l.getCodigoDoLivro(), l.getTitulo(), l.getAutor(), l.getEditora(),
                                 l.getIssn(),l.getAnoDePub());
                         }
                     }
              }

             
             
            static public void  listarTodosAlunos () {
                     System.out.println (" ===> Lista de Alunos <=== \n");
                     System.out.println ("Cod\t Nome \t \t \t Matricula " );
                      for( int i =  0 ; i < rA.size(); i ++ ) {
                             Aluno c = rA.getAluno (i);
                             System.out. printf ("%s \t %s \t \t  %s \n ",
                                 c.getCodigoDoAluno(), c.getNome (), c.getMatricula());
                             }

              }

             public static void mostarLivrosEmprestados() {
                     System.out.println(" ===> Lista de livros emprestados <=== \n");
                     System.out.println(" Nr Registro: \t Titulo: \t Autor: \t\t Editora: \t\t Issn: \t\t Ano: \t \t\t Aluno: ");
                     for (int i = 0; i < rL.size(); i++) {
                         Livros l = rL.getLivro(i);
                         if (l.getDataEmprestimo() != null) {
                             System.out.println("");
                             System.out.printf(" %s \t \t %s \t\t %s \t\t %s \t\t %s \t\t %s \t %s \n ",
                                 l.getCodigoDoLivro(), l.getTitulo(), l.getAutor(), l.getEditora(),
                                 l.getIssn(),l.getAnoDePub(),l.getAlunoComLivro());
                             System.out.println();
                            }
                     }
              }
            
             
            public static void listarFuncionarios(){
                    System.out.println("===> lista de Fyncionarios <===");
                    System.out.println("Cod \t Nome \t \tEndereço\t \t Setor \t \t Matricula");
                       for (int i =0; i<rF.size();i++){
                           Funcionario f = rF.getFuncionario(i);
                           System.out.printf("%s \t %s \t %s \t %s \t %s \t",f.getcodfunci(),f.getNome(),
                                               f.getEndereço(),f.getSetor(),f.getMatricula());
                       }
             }
             
             
             
            static  public void  listarTodosLivros () {
                     System .out. println ( " === Lista de livros disponiveis === \n" );
                     System .out.println (" Cod \t Titulo \t \t Autor \t \t Editora \t \t Issn \t \t Ano \t \t Stats do livro \n " );
                      for( int i =  0 ; i < rL.size (); i ++ ) {
                             Livros l = rL . getLivro(i);
                             if (l.getDataEmprestimo () == null) {
                              System .out. printf("  %s       %s \t \t %s \t \t %s \t \t %s \t \t %s \t \t  Livro disponível \n",
                                             l.getCodigoDoLivro(), l.getTitulo (),l.getAutor(), l.getEditora(),
                                             l.getIssn(),l.getAnoDePub());
                             }
                             else {
                                 System.out.printf ( "  %s \t %s \t \t   %s \t \t %s \n " ,
                             l.getCodigoDoLivro(), l.getTitulo (), l.getAutor (), l.getEditora(),
                                             l.getIssn(),l.getAnoDePub());
                             }
                     }
             }
             
             
             
            static  public void  listarTodosPeriodicos () {
                     System .out. println ( " === Lista de livros disponiveis === \n" );
                     System .out.println (" Cod \t Titulo \t \t Autor \t \t Issn \t \t Fator de impacto \t \t Aluno \n " );
                      for( int i =  0 ; i < rP.size (); i ++ ) {
                             Livros p = rP.getPeriodico(i);
                             if (p . getDataEmprestimo () == null ) {
                              System .out. printf("  %s       %s \t \t %s \t \t %s \t \t %s \t \t  Livro disponível \n",
                                             p.getCodigoDoLivro(), p.getTitulo (),p.getAutor(),
                                             p.getIssn(),p.getFatorImpac());
                             }
                             else {
                                 System.out.printf ( "  %s  %s \t \t   %s \t \t %s \n " ,
                             p.getCodigoDoLivro(), p.getTitulo (), p.getAutor (),
                                             p.getIssn(),p.getFatorImpac());
                             }
                     }
             }
             
             

            public static void emprestarLivro() {
                     boolean flag=false;
                     boolean flagAluno=false;
                     int cod;
                     int codAluno;
                     System.out.println();
                     System.out.print("Digite o codigo do livro a ser emprestado:");
                     cod = s.nextInt();
                     s.nextLine();
                     Livraria.listarTodosAlunos();
                     System.out.println();
                     System.out.print("Digite o codigo do Aluno a emprestar o livro:");
                     codAluno = s.nextInt();
                     s.nextLine();
                     for (int i = 0; i < rA.size(); i++) {
                             Aluno aluno = rA.getAluno(i);
                             if(aluno.getCodigoDoAluno()==codAluno){
                             flagAluno=true;
                             for (int i1 = 0; i1 < rL.size(); i1++) {
                                     Livros l = rL.getLivro(i1);
                                     if(l.getCodigoDoLivro()==cod && l.getDataEmprestimo()==null){
                                         int zone;
                                     rL.emprestarLivro(l, aluno);
                                     System.out.println("livro codigo "+l.getCodigoDoLivro()+
                                                        " emprestado com sucesso para o aluno: " + aluno.getNome() + ".");
                                     System.out.println("Data de emprestimo: "+l.getDataEmprestimo());
                                     flag=true;
                                     }
                              }
                             if(flag==false){
                                     System.out.println("Livro não encontrado ou já emprestado.");
                             }
                         }
                     }
                     if(flagAluno==false){
                             System.out.println("Aluno não encontrado.");
                     }
              }

             
             
            public static void devolverLivro() {
                     boolean flag=false;
                     int cod;
                     System.out.print("Digite o codigo do livro a ser devolvido:");
                     cod = s.nextInt();
                     s.nextLine();
                        for (int i = 0; i < rL.size(); i++) {
                             Livros l = rL.getLivro(i);
                             if(l.getCodigoDoLivro()==cod){
                             l.setDataEmprestimo(null);
                             flag=true;
                             System.out.println("livro codigo "+l.getCodigoDoLivro()+" devolvido com sucesso.");
                             }
                     }
                     if(flag==false){
                             System.out.println("Livro não encontrado.");
                     }
             }
             
             
             
            public static void listarLivros() {
                 rL.ordenaLivros();
              }
             
            public static void listarPeriodicos() {
                 rP.ordPeriod();
             }
        
        
}