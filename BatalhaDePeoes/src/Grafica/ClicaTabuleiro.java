/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafica;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 *
 * @author TatianaCM
 */
public class ClicaTabuleiro implements MouseListener {
    public void mousePressed(MouseEvent e) {
       
    }

    public void mouseReleased(MouseEvent e) {
       
    }

    public void mouseEntered(MouseEvent e) {
      
    }

    public void mouseExited(MouseEvent e) {
       
    }

    public void mouseClicked(MouseEvent e) {
        //Salvar contexto para proximo clique
       FTabuleiro.X_ant=e.getX();
       FTabuleiro.Y_ant=e.getY();
       FTabuleiro.cor_ant=FTabuleiro.tabuleiro.getContentPane().getComponentAt(e.getX(), e.getY()).getBackground();
       
        //primeiro clique selecionando peça
        if(FTabuleiro.clique == 1){
           FTabuleiro.proximo = (JPanel) FTabuleiro.tabuleiro.getContentPane().getComponentAt(e.getX(), e.getY());
           FTabuleiro.movimentaPeca(FTabuleiro.anterior, FTabuleiro.proximo);
           FTabuleiro.tabuleiro.getContentPane().getComponentAt(FTabuleiro.X_ant, FTabuleiro.Y_ant).setBackground(FTabuleiro.cor_ant);
           FTabuleiro.clique=0;
           System.out.println(FTabuleiro.anterior.getName()+" "+FTabuleiro.proximo.getName());
       }
        else if(FTabuleiro.clique == 0){
           FTabuleiro.anterior = (JPanel) FTabuleiro.tabuleiro.getContentPane().getComponentAt(e.getX(), e.getY());
           FTabuleiro.clique=1;   
           FTabuleiro.tabuleiro.getContentPane().getComponentAt(e.getX(), e.getY()).setBackground(Color.red);
           
       }
       
       
        
       if(FTabuleiro.X_ant!=-1) {
           FTabuleiro.tabuleiro.getContentPane().getComponentAt(FTabuleiro.X_ant, FTabuleiro.Y_ant).setBackground(FTabuleiro.cor_ant);
       }
       
       
       //
       
       
    }
}
