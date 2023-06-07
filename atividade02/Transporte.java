package atividade02;

public class Transporte {
    
    String tipo ;
    Double valor ; 
    
    public Transporte (String tipo, Double valor){
        this.tipo = tipo;
        this.valor = valor;   
    }
    
    public String GettipoTransporte (){
        return tipo;
    }
    public Double Getvalor (){
        return valor;
    }
}