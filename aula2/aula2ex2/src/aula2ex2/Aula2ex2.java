/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula2ex2;

import javax.swing.JOptionPane;

public class Aula2ex2 {

   public static void main (String[] args) {
        int opc = 0;
        
        String Nome,RA;
        float AC1,AC2,AG,AF;
        
        Aluno Aluno = null;
        
        while(opc !=3){
            opc = Integer.parseInt(JOptionPane.showInputDialog(
            "1 - Criar Pessoa\n2 - Mostrar Pessoa\n3 -  Sair"));
            
            switch (opc) {
                case 1:
                    Nome = JOptionPane.showInputDialog("Digite o nome");
                    RA = JOptionPane.showInputDialog("Digite o RA");
                    AC1 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua nota da AC1"));
                    AC2 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua nota da AC2"));
                    AG = Integer.parseInt(JOptionPane.showInputDialog("Digite sua nota da AG"));
                    AF = Integer.parseInt(JOptionPane.showInputDialog("Digite sua nota da AF"));
                    

                Aluno = new Aluno();
                Aluno.setRA(RA);
                Aluno.setNome(Nome);
                Aluno.setAC1(AC1);
                Aluno.setAC2(AC2);
                Aluno.setAG(AG);
                Aluno.setAF(AF);
                
                      break;
                case 2:
                    if(Aluno!= null)
                        JOptionPane.showMessageDialog(null, Aluno.imprimir());
                    else
                        JOptionPane.showMessageDialog(null,
                                "Nenhuma pessoa cadastrada","Erro",JOptionPane.ERROR_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Até Mais !!!" );
                    
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção Inválida","Atenção",
                    JOptionPane.WARNING_MESSAGE);
                    
                    break ;
                    
            }
                    
        }
    }
    }