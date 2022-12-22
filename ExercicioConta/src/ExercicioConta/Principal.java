package ExercicioConta;

import javax.swing.JOptionPane;

public class Principal {

    public static void main (String [] args){

        ContaCorrent contaC = new ContaCorrent();       
        ContaPoupanca contaP = new ContaPoupanca();
        

        Object[] conta = {"Conta Corrente","Conta Poupança","Sair do programa"};
        Object[] opcoes = {"Consultar saldo","Depositar valor","Sacar valor","Sair do programa"};
		Object escolheConta; 
        Object opera;
        String deposito;
        String num_conta;
        String agencia;

            agencia = JOptionPane.showInputDialog("Informe o numero da sua agencia: ");
            num_conta = JOptionPane.showInputDialog("Informe o numero da sua conta: ");
            
            contaC.setNum_agencia(Integer.parseInt(agencia));
            contaC.setNum_conta(Integer.parseInt(num_conta));

            escolheConta = JOptionPane.showInputDialog(null, "Qual conta deseja operar?", "Conta", JOptionPane.INFORMATION_MESSAGE, null, conta, conta[0]);                
           
                    if (escolheConta == "Conta Corrente"){
                        opera = JOptionPane.showInputDialog(null, "Qual operação deseja realizar?", "Conta", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
                            if (opera == "Consultar saldo"){
                                JOptionPane.showMessageDialog(null, "O seu saldo é" + contaC.ConsultaSaldo(null));
                            }

                            else if (opera == "Depositar valor"){
                                deposito = JOptionPane.showInputDialog("Qual valor deseja depositar? ");
                                contaC.DepositaSaldo(0, null, null)


                            }

                        
                    }
        
        
                    
                    else if (escolheConta == "Conta Poupança"){
                        
                    }
        
        
        
        
    


       
		
		System.exit(0);


    }  
}
