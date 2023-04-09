
package Registros;

import Dados.*;
import java.util.ArrayList;

public class RegistrodeProfessor {
    
    private ArrayList<Professor>rP;

    public RegistrodeProfessor() {
       rP = new ArrayList<Professor>();
                
    }
    
    public void addProf(Professor prof){
        rP.add(prof);
    }

    public Professor getAddProf(int indice){
        return rP.get(indice);
    }

    
    
    
}
