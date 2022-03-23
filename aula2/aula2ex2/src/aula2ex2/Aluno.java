/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2ex2;

/**
 *
 * @author Manut
 */
public class Aluno {
    private String RA;
    private String Nome;
    private float AC1;
    private float AC2;
    private float AG;
    private float AF;

    public String getRA() {
        return RA;
    }


    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public float getAC1() {
        return AC1;
    }


    public void setAC1(float AC1) {
        this.AC1 = AC1;
    }


    public float getAC2() {
        return AC2;
    }


    public void setAC2(float AC2) {
        this.AC2 = AC2;
    }


    public float getAG() {
        return AG;
    }

    public void setAG(float AG) {
        this.AG = AG;
    }


    public float getAF() {
        return AF;
    }


    public void setAF(float AF) {
        this.AF = AF;
    }
   
    public float calcularMedia(){
                return (float) (AC1 * 0.15 + AC2 *0.30 + AG * 0.10 + AF * 0.45);
    }
    public String  verificarAprovacao(){
        if (calcularMedia () >=5)
            return ("Aprovado");
        else
            return ("Reprovado");
    }         
     public String imprimir(){
       
         return "RA:" + RA + "\nNome: " + Nome + "\nAC1: " + AC1 + "\nAC2: " + AC2 + "\nAG: " + AG 
                 + "\nAF: " + AF + "\nMédia: " + calcularMedia() + "\nSituação: " + verificarAprovacao();       
       
    }
    
    }
    
    


