
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marina
 */
public class Aluno {
    
    private Double nota1;
    private Double nota2;
    private Double nota3;
    private Double media;

    public Double getNota1() {
       
        return nota1;
    }

    public void setNota1(Double nota1) {
         if(nota1 != null && nota1 >= 0.0 && nota1 <= 10.0){
        this.nota1 = nota1;
         }else{
             JOptionPane.showMessageDialog(null, "Valor invalido" + nota1);
         }
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        if(nota2 != null && nota2 >= 0.0 && nota2 <= 10.0){
        this.nota2 = nota2;
        }else{
            JOptionPane.showMessageDialog(null, "Valor invalido" + nota2);
        }
    }

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
         if(nota3 != null && nota3 >= 0.0 && nota3 <= 10.0){
        this.nota3 = nota3;
         }else{
             JOptionPane.showMessageDialog(null, "Valor invalido" + nota3);
         }
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }
    
    public Double calcMedia(){
        
        if(getNota1() !=null && getNota2() != null && getNota3() != null){
            
                //calculando a media
        double media = (getNota1() + getNota2() +getNota3())/3;
        //setando o atributo media
        setMedia(media);
        //retornando o valor do metodo
        return media;
        }else{
            return null;
        }
    }
    
    public String situacaAluno(){
        if (media == null){
            return "A media ainda não foi calculada";
        }
         if (media < 5){
            return "Reprovado";
        } else if(media>= 5.0 && media < 7.0){
            return "Recuperação";
        }else if(media>= 7.0 && media <= 10.0){
            return "Aprovado";}else{
            return "Erro";
        }
    }
    
    }
