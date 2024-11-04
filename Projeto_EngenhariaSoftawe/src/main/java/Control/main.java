package Control;

import javax.swing.JFrame;
import View.TelaInicial;

    public class main{

        public static void main(String[] args){
            
            TelaInicial tela = new TelaInicial();

            tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            tela.setSize(700,450);
            tela.setVisible(true);
            tela.setLocationRelativeTo(null);
        }
    }
        