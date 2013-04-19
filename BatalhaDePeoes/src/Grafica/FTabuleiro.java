/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafica;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author TatianaCM
 */
public class FTabuleiro {
    
    public static int clique = 0;
    public static JPanel anterior=null;
    public static JPanel proximo=null;
    
    
    public static JFrame tabuleiro;
    
    public static int X_ant=-1, Y_ant=-1;
    
    public static Color cor1 = Color.gray;
    public static Color cor2 = Color.white;
    public static Color cor_ant = cor1;
    
    public static String nomeJanela = "BATALHA DE PEÕES";
    
    public static JPanel t11,t12,t13,t14,t15,t16,t17,t18;
    public static JPanel t21,t22,t23,t24,t25,t26,t27,t28;
    public static JPanel t31,t32,t33,t34,t35,t36,t37,t38;
    public static JPanel t41,t42,t43,t44,t45,t46,t47,t48;
    public static JPanel t51,t52,t53,t54,t55,t56,t57,t58;
    public static JPanel t61,t62,t63,t64,t65,t66,t67,t68;
    public static JPanel t71,t72,t73,t74,t75,t76,t77,t78;
    public static JPanel t81,t82,t83,t84,t85,t86,t87,t88;
    
    public static JLabel pp1, pp2, pp3, pp4, pp5, pp6, pp7, pp8;
    public static JLabel pb1, pb2, pb3, pb4, pb5, pb6, pb7, pb8;
   
    
    public static String nomePeaoBranco = "peaob1.gif";
    public static String nomePeaoPreto = "peao2.gif";
    
    public static void criaPeao(){
        
        //Peões pretos
        ImageIcon ipp1 = new ImageIcon(nomePeaoPreto);
        pp1 = new JLabel(ipp1);
        pp1.setName("pp1");
        
        
        ImageIcon ipp2 = new ImageIcon(nomePeaoPreto);
        pp2 = new JLabel(ipp2);
        pp2.setName("pp2");
        
        ImageIcon ipp3 = new ImageIcon(nomePeaoPreto);
        pp3 = new JLabel(ipp3);
        pp3.setName("pp3");
        
        ImageIcon ipp4 = new ImageIcon(nomePeaoPreto);
        pp4 = new JLabel(ipp4);
        pp4.setName("pp4");
        
        ImageIcon ipp5 = new ImageIcon(nomePeaoPreto);
        pp5 = new JLabel(ipp5);
        pp5.setName("pp5");
        
        ImageIcon ipp6 = new ImageIcon(nomePeaoPreto);
        pp6 = new JLabel(ipp6);
        pp6.setName("pp6");
        
        ImageIcon ipp7 = new ImageIcon(nomePeaoPreto);
        pp7 = new JLabel(ipp7);
        pp7.setName("pp7");
        
        ImageIcon ipp8 = new ImageIcon(nomePeaoPreto);
        pp8 = new JLabel(ipp8); 
        pp8.setName("pp8");
        
        //Peões brancos
        ImageIcon ipb1 = new ImageIcon(nomePeaoBranco);
        pb1 = new JLabel(ipb1);
        
        
        ImageIcon ipb2 = new ImageIcon(nomePeaoBranco);
        pb2 = new JLabel(ipb2);
        
        ImageIcon ipb3 = new ImageIcon(nomePeaoBranco);
        pb3 = new JLabel(ipb3);
        
        ImageIcon ipb4 = new ImageIcon(nomePeaoBranco);
        pb4 = new JLabel(ipb4);
        
        ImageIcon ipb5 = new ImageIcon(nomePeaoBranco);
        pb5 = new JLabel(ipb5);
        
        ImageIcon ipb6 = new ImageIcon(nomePeaoBranco);
        pb6 = new JLabel(ipb6);
        
        ImageIcon ipb7 = new ImageIcon(nomePeaoBranco);
        pb7 = new JLabel(ipb7);
        
        ImageIcon ipb8 = new ImageIcon(nomePeaoBranco);
        pb8 = new JLabel(ipb8); 
        
    }
    
    public static JFrame constroiTabuleiro(){
        
      //DEFINIÇÃO DOS PANELS
      
      
      
      t11 = new JPanel();
      t11.setBackground(cor1);
      t11.setName("t11");
      
      ImageIcon ipp1 = new ImageIcon(nomePeaoPreto); //SE TIRAR ESSA LINHA OS PEOES DESAPARECEM O.O
      //pp1 = new JLabel(ipp1);
      //t11.add(pp1);
      t12 = new JPanel();
      t12.setBackground(cor2);
      t12.setName("t12");
      
      t13 = new JPanel();
      t13.setBackground(cor1);
      
      t14 = new JPanel();
      t14.setBackground(cor2);
      
      t15 = new JPanel();
      t15.setBackground(cor1);
      
      t16 = new JPanel();
      t16.setBackground(cor2);
              
      t17 = new JPanel();
      t17.setBackground(cor1);
     
      t18 = new JPanel();
      t18.setBackground(cor2);
      
      t21 = new JPanel();
      t21.setBackground(cor2);
      t21.setName("t21");
      
      t22 = new JPanel();
      t22.setBackground(cor1);
      
      t23 = new JPanel();
      t23.setBackground(cor2);
      
      t24 = new JPanel();
      t24.setBackground(cor1);
      
      t25 = new JPanel();
      t25.setBackground(cor2);
      
      t26 = new JPanel();
      t26.setBackground(cor1);
      
      t27 = new JPanel();
      t27.setBackground(cor2);
      
      t28 = new JPanel();
      t28.setBackground(cor1);
      
      t31 = new JPanel();
      t31.setBackground(cor1);
            
      t32 = new JPanel();
      t32.setBackground(cor2);
      
      
      t33 = new JPanel();
      t33.setBackground(cor1);
      
      t34 = new JPanel();
      t34.setBackground(cor2);
      
      t35 = new JPanel();
      t35.setBackground(cor1);
      
      t36 = new JPanel();
      t36.setBackground(cor2);
      
      t37 = new JPanel();
      t37.setBackground(cor1);
      
      t38 = new JPanel();
      t38.setBackground(cor2);
      
      t41 = new JPanel();
      t41.setBackground(cor2);
      
      t42 = new JPanel();
      t42.setBackground(cor1);
      
      t43 = new JPanel();
      t43.setBackground(cor2);
      
      t44 = new JPanel();
      t44.setBackground(cor1);
      
      t45 = new JPanel();
      t45.setBackground(cor2);
      
      t46 = new JPanel();
      t46.setBackground(cor1);
      
      t47 = new JPanel();
      t47.setBackground(cor2);
      
      t48 = new JPanel();
      t48.setBackground(cor1);
      
      t51 = new JPanel();
      t51.setBackground(cor1);
      
      t52 = new JPanel();
      t52.setBackground(cor2);
      
      t53 = new JPanel();
      t53.setBackground(cor1);
      
      t54 = new JPanel();
      t54.setBackground(cor2);
      
      t55 = new JPanel();
      t55.setBackground(cor1);
      
      t56 = new JPanel();
      t56.setBackground(cor2);
      
      t57 = new JPanel();
      t57.setBackground(cor1);
      
      t58 = new JPanel();
      t58.setBackground(cor2);
      
      t61 = new JPanel();
      t61.setBackground(cor2);
      
      t62 = new JPanel();
      t62.setBackground(cor1);
      
      t63 = new JPanel();
      t63.setBackground(cor2);
      
      t64 = new JPanel();
      t64.setBackground(cor1);
      
      t65 = new JPanel();
      t65.setBackground(cor2);
      
      t66 = new JPanel();
      t66.setBackground(cor1);
      
      t67 = new JPanel();
      t67.setBackground(cor2);
      
      t68 = new JPanel();
      t68.setBackground(cor1);
      
      t71 = new JPanel();
      t71.setBackground(cor1);
      
      t72 = new JPanel();
      t72.setBackground(cor2);
      
      t73 = new JPanel();
      t73.setBackground(cor1);
      
      t74 = new JPanel();
      t74.setBackground(cor2);
      
      t75 = new JPanel();
      t75.setBackground(cor1);
      
      t76 = new JPanel();
      t76.setBackground(cor2);
      
      t77 = new JPanel();
      t77.setBackground(cor1);
      
      t78 = new JPanel();
      t78.setBackground(cor2);
      
      t81 = new JPanel();
      t81.setBackground(cor2);
      
      t82 = new JPanel();
      t82.setBackground(cor1);
      
      t83 = new JPanel();
      t83.setBackground(cor2);
      
      t84 = new JPanel();
      t84.setBackground(cor1);
      
      t85 = new JPanel();
      t85.setBackground(cor2);
      
      t86 = new JPanel();
      t86.setBackground(cor1);
      
      t87 = new JPanel();
      t87.setBackground(cor2);
      
      t88 = new JPanel();
      t88.setBackground(cor1);
      
      
      
      JFrame f = new JFrame();
      f.getContentPane(); 
      //the layout makes the panels stand side by side from left to right
      f.setLayout(new GridLayout(8,8));
     
      //adding panels
      f.add(t11);
      f.add(t12);
      f.add(t13);
      f.add(t14);
      f.add(t15);
      f.add(t16);
      f.add(t17);
      f.add(t18);
      
      f.add(t21);
      f.add(t22);
      f.add(t23);
      f.add(t24);
      f.add(t25);
      f.add(t26);
      f.add(t27);
      f.add(t28);
      
      f.add(t31);
      f.add(t32);
      f.add(t33);
      f.add(t34);
      f.add(t35);
      f.add(t36);
      f.add(t37);
      f.add(t38);
      
      f.add(t41);
      f.add(t42);
      f.add(t43);
      f.add(t44);
      f.add(t45);
      f.add(t46);
      f.add(t47);
      f.add(t48);
      
      f.add(t51);
      f.add(t52);
      f.add(t53);
      f.add(t54);
      f.add(t55);
      f.add(t56);
      f.add(t57);
      f.add(t58);
      
      f.add(t61);
      f.add(t62);
      f.add(t63);
      f.add(t64);
      f.add(t65);
      f.add(t66);
      f.add(t67);
      f.add(t68);
      
      f.add(t71);
      f.add(t72);
      f.add(t73);
      f.add(t74);
      f.add(t75);
      f.add(t76);
      f.add(t77);
      f.add(t78);
      
      f.add(t81);
      f.add(t82);
      f.add(t83);
      f.add(t84);
      f.add(t85);
      f.add(t86);
      f.add(t87);
      f.add(t88);
      
      
      
      
      //f.repaint();
      //setBounds combines setLocation and setSize
      
      f.setBounds(0,0,800,800);
      
      
      f.setTitle(nomeJanela);
      f.setResizable(false);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
      f.setVisible(true);
      
      return f;
      
    }
    
    public static void movimentaPeca(JPanel casaAntiga, JPanel casaNova){
        JLabel pecaAnt = (JLabel) casaAntiga.getComponent(0);
        
        if(pecaAnt.getName().contains("pp")){
            casaAntiga.removeAll();
            
            casaNova.setBackground(Color.green);
            casaNova.repaint();
            tabuleiro.repaint();
            casaNova.add(pecaAnt);
            
            
            casaAntiga.repaint();
            casaNova.repaint();
            tabuleiro.repaint();
        }
        
    }
    public static void colocaPeoesTabuleiro(){
        t21.add(pp1);
        t22.add(pp2);
        t23.add(pp3);
        t24.add(pp4);
        t25.add(pp5);
        t26.add(pp6);
        t27.add(pp7);
        t28.add(pp8);
        
        t71.add(pb1);
        t72.add(pb2);
        t73.add(pb3);
        t74.add(pb4);
        t75.add(pb5);
        t76.add(pb6);
        t77.add(pb7);
        t78.add(pb8);
        
           
    }
    
    public static void inicializaTabuleiro(){
        
        tabuleiro = constroiTabuleiro();
        
        criaPeao();
        colocaPeoesTabuleiro();
        tabuleiro.setBackground(Color.red);
        ClicaTabuleiro ct = new ClicaTabuleiro();
        tabuleiro.addMouseListener(ct);
        
        
    }
    
    
    
    public static void main(String[] args) {
        
        inicializaTabuleiro();
        
        
        
    }
}
