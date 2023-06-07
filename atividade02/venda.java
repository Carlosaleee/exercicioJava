package atividade02;

   public class venda {
    pacoteViagem pacoteViagem;
    String nomeCliente, formaPagamento ;
    
    public  venda (pacoteViagem pacoteViagem ,String nomeCliente , String formaPagamento){
        this.pacoteViagem = pacoteViagem;
        this.nomeCliente = nomeCliente;
        this.formaPagamento = formaPagamento;
    }
    
    public double ValorTotalPacote (){
        double comissao = pacoteViagem.CalcularComissao();
        double transporteValor = pacoteViagem.transporte.valor;
        double totalDiarias = pacoteViagem.CalcularTotalDiarias();
        double total = comissao + transporteValor + totalDiarias;
 
        return total;
        
    }
    public double GetcotacaoDolar (double  cotacao){
        double dolar = ValorTotalPacote();
        double real = dolar * cotacao;
        
        return real;
    }
    public String GetCliente (){
        return nomeCliente;
    }
    public pacoteViagem GetPacote (){
        return pacoteViagem;
    }
 
    public String GetFormaPagamento (){
        return formaPagamento;
    }
}

