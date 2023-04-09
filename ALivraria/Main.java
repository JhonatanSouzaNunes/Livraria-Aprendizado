
package ALivraria;


import Dados.Aluno;
import Dados.Funcionario;
import Dados.Livros;
import Registros.RegistroDeFuncionarios;
import Registros.*;
import java.util.Scanner;


public class Main extends Livraria {

       
              
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
              
                rL = new RegistroDeLivros ();
		rA = new RegistroDeAlunos ();
                rF = new RegistroDeFuncionarios();
                rP = new RegistroDePeriodicos();
                
                int a=1;
		System.out.println("");
                System.out.println("");
                
                
                //Funcionario f1 = new Funcionario(" Funcionario Chefe" ," Qualquer um "," biblioteca ","chefe", "123", 00001);
                Funcionario f2 = new Funcionario(" Funcionario 2" ," Qualquer um "," biblioteca ","2", "124", 00001);
                Livros l2 = new Livros("Velho", "Desconhecido", "Desconhecido", "Desconhecido",1000);
                Aluno a2 = new Aluno("Jhonatan","desconhecido","Não sei", 4444);
                //rF.addFuncionario(f1);
                rF.addFuncionario(f2);
                rL.addLivro(l2);
                rA.addAluno(a2);

                
                    // Funcionario faz o login para ter acesso ao menu da biblioteca.
              
                     System.out.println("Apenas funcionarios podem ter acesso ao menu. \n");
                                          
                do { 
                  
                        String login, senha;

                        System.out.println("Digite seu login: ");
                        login = s.next();
                        System.out.println("Digite sua senha: ");
                        senha = s.next();
                        
                        for (int i = 0; i < rF.size(); i++) {
                            
                            Funcionario f = rF.getFuncionario(i);
                            
                            if (login.equals(f.getLogin()) && senha.equals(f.getSenha())) {
                                char op;

                                System.out.println();
                                System.out.println("Bem Vindo, " + f.getNome() + "!");

                                    do {

                                        System.out.println("\n==> Menu:\n");
                                        System.out.println("   0 - Sair");
                                        System.out.println("   1 - Adiciona livro");
                                        System.out.println("   2 - Adiciona Aluno");
                                        System.out.println("   3 - Adiciona Funcionario");
                                        System.out.println("   4 - Emprestar livro");
                                        System.out.println("   5 - Devolver livro");
                                        System.out.println("   6 - Listar livros por ordem alfabetica");
                                        System.out.println("   7 - Listar periódicos por ordem alfabetica");
                                        
                                        System.out.print("\n   Opcao: ");
                                        op = s.next().charAt(0);
                                        s.nextLine();

                                        switch (op) {
                                        case '0':
                                            System.out.println("Saindo...");
                                            break;

                                        case '1':
                                            adicionaLivro();
                                            break;
                                            
                                        case '2':
                                            adicionarAluno();
                                            break;
                                            
                                        case '3':
                                            adicionarFuncionario();
                                            break;
                                            
                                        case '4':
                                            listarLivrosLivres();
                                            emprestarLivro();
                                            break;
                                            
                                        case '5':
                                            mostarLivrosEmprestados();
                                            devolverLivro();
                                            break;

                                        case '6':
                                            listarLivros();
                                            listarTodosLivros();
                                            break;

                                        case '7':
                                            listarPeriodicos();
                                            listarTodosPeriodicos();
                                            break;

                                        default:
                                            System.out.println("\n Opcao invalida!\n");
                                            break;
                                    }
                                } while (op != '0');
                                
                           } else {
                                    System.out.println("Funcionario não existe! ");
                           }
                       }
                            System.out.println("\n Apenas funcionarios podem ter acesso a biblioteca! \n");
                  } while (true);
         }
    
 }