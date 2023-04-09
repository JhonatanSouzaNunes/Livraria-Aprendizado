/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registros;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import Dados.*;


public class RegistroDePeriodicos {

        private ArrayList<Livros> rP;

        public RegistroDePeriodicos() {
                 rP = new ArrayList<Livros>();
         }

        public void addPeriodico(Livros period) {
                 rP.add(period);
         }

        public Livros getPeriodico(int indice) {
                 return rP.get(indice);
         }

        public void removerPeriodicos(Livros periodc) {
                 rP.remove(periodc);
         }

        public Livros removerPeriodicos(int indice) {
                 return rP.remove(indice);
         }

            public int size() {
                 return rP.size();
         }

        public void emprestarPeriodico(Livros period,Aluno alun){
                 LocalDateTime now = LocalDateTime.now(); 
                 period.setDataEmprestimo(now);
                 period.setAlunoComLivro(alun);
        }
            
        public void ordPeriod(){
                 Collections.sort(rP);
        }   
                
}
