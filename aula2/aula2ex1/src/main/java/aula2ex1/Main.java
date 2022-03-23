
package aula2ex1;

import javax.swing.JOptionPane;

public class Main {
    public static void main (String[] args) {
        int opc = 0;
        Object [] arraySexo = {"Feminino", "Masculino"};
        String nome,cpf;
        int idade;
        char sexo;
        Pessoa2 pessoa2 = null;
        
        while(opc !=3){
            opc = Integer.parseInt(JOptionPane.showInputDialog(
            "1 - Criar Pessoa\n2 - Mostrar Pessoa\n3 -  Sair"));
            
            switch (opc) {
                case 1:
                    nome = JOptionPane.showInputDialog("Digite o nome");
                    cpf = JOptionPane.showInputDialog("Digite o CPF");
                    idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
                    
                    sexo = JOptionPane.showInputDialog(null,"Selecione o sexo","Selecione",
                    JOptionPane.INFORMATION_MESSAGE,null,
                    arraySexo,arraySexo[0]).toString().charAt(0);
                pessoa2 = new Pessoa2();
                pessoa2.setCpf(cpf);
                pessoa2.setIdade(idade);
                pessoa2.setNome(nome);
                pessoa2.setSexo(sexo);
                      break;
                case 2:
                    if(pessoa2 != null)
                        JOptionPane.showMessageDialog(null, pessoa2.imprimir());
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
    

