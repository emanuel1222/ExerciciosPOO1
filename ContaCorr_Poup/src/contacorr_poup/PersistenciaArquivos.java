/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contacorr_poup;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Emanuel
 */
public class PersistenciaArquivos {
    
    public void salvarConta(Contacorrente conta){
        
        FileWriter arq;
        try{
            arq = new FileWriter("D:\\IFES\\5° periodo\\POO1", true);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.append( conta.getNomeCliente() + "," +conta.getNumero() + "," +conta.getAgencia()+ "," +conta.getLimite() +"," +conta.getSaldo()+ "\n\n");
            arq.close();
        } catch (IOException ex) {
            Logger.getLogger(PersistenciaArquivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}