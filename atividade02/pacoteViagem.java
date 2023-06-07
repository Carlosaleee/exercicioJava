package atividade02;

public class pacoteViagem {

    public pacoteViagem(String onibus, String jao_pessoa, String jaao, float par) {
    }
    
    Transporte transporte;
    hospedagem hospedagem; 
    String destino ;
    int qtdDias ;
    double porcentagem ;
   
    
    public pacoteViagem (Transporte transporte, hospedagem hospedagem ,String destino ,int qtdDias , double porcentagem){
        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.qtdDias = qtdDias;
        this.porcentagem = porcentagem ;
    }
   
    public double CalcularTotalDiarias (){
        double totalDiarias = qtdDias * hospedagem.valorDiaria;
        
        return  totalDiarias;   
    } 
    public double CalcularComissao( ){
        double tt =  qtdDias * hospedagem.valorDiaria;
        double comissao = (porcentagem /100) * (tt + transporte.valor) ;
        
        return  comissao; 
    }
    public String GetDestino (){
        return destino;
    }
    public int GetQtdDias (){
        return qtdDias;
    }
    public double GetPorcentagem (){
        return porcentagem;
    }
    public Transporte GetTransporte (){
        return transporte;   
    }
    public hospedagem GetHospedagem (){
        return hospedagem;
    }

}

