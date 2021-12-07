
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 
/**
 *
 * @author marina
 */
public class Principal {
    
    public static void main(String [] args){
        
       /* Double valor = null; // clsse Wrapper, permite ser nullable
        Integer valor2 = null;
        
        System.out.println(" " + valor);
        System.out.println(" " + valor2);
        */
       Aluno aluno = new Aluno(); 
       JOptionPane.showMessageDialog(null, aluno.situacaAluno());
       
       String nota1Str = JOptionPane.showInputDialog("Digite a nota 1 ");
       aluno.setNota1(Double.parseDouble(nota1Str));
       
       String nota2Str = JOptionPane.showInputDialog("Digite a nota 2 ");
       aluno.setNota2(Double.parseDouble(nota2Str));
       
       String nota3Str = JOptionPane.showInputDialog("Digite a nota 3 ");
       aluno.setNota3(Double.parseDouble(nota3Str));
       
       JOptionPane.showMessageDialog(null, "Média calculada " + aluno.calcMedia());
       JOptionPane.showMessageDialog(null, aluno.situacaAluno());
    }
 
    
}
