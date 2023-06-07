package atividade02;

public class hospedagem {
    
    String nomeHospedagem;
    double valorDiaria;
    
    public hospedagem (String nomeHospedagem, Double valorDiaria){
        this.nomeHospedagem = nomeHospedagem;
        this.valorDiaria = valorDiaria;   
    }
    
    public String GetnomeHospedagem (){
        return nomeHospedagem;
    }
    public Double GetvalorDiaria (){
        return valorDiaria;
    }
}
