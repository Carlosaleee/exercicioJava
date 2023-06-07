
package atividade02;

import java.text.DecimalFormat;
    import java.util.Scanner;

public class Atividade02 {

    public static void main(String[] args) {
        
        String   nomeCliente;
        String   nomeHospedagem;
        String   tipoTransporte;
        String   destino;
        String   formaPagamento;
        String   telefoneCliente;
        String   locomocao;
        
        Double   valorTransporte;
        Double   valorDiaria;
        Double   cotacao;
        
        char  sexo;
       
        int   porcentagem = 0;
        int   qtdDias = 0;
        
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");
        
        System.out.println("- Seja Muito Bem Vindo a nossa Agencia de Viagens ...  ");
        System.out.println(" ");
        
        System.out.println("Informe os Dados do Pacote de Viagem: ");
        System.out.println(" ");
        
        System.out.print("- Informe o Nome do Cliente: ");
        nomeCliente = sc.nextLine();
        
        System.out.print("- Informe o Telefone do Cliente: ");
        telefoneCliente = sc.nextLine();
        
        System.out.print("- Informe o Destino: ");
        destino = sc.nextLine();
        
        System.out.print("- Informe o Tipo de Hospedagem ( Hotel, Resort, Hostel ): ");
        nomeHospedagem = sc.nextLine();

        System.out.print("- Informe o Valor da Diaria: R$ ");
        valorDiaria = sc.nextDouble();
        
        System.out.print("- Informe a Quantidade de Dias: ");
        qtdDias = sc.nextInt();
        
        System.out.print("- Informe o Opcao de Transporte ( Aereo, Maritimo, Terrestre ) : ");
        tipoTransporte = sc.nextLine();
        sc.nextLine();
        
        System.out.print("- Informe o Tipo de Transporte ( Onibus, Aviao, Navio (Cruzeiro) : ");
        locomocao = sc.nextLine();
      
        System.out.print("- Informe o Valor do Transporte: R$ ");
        valorTransporte = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("- Informe a Forma de Pagamento, \n Cartao Cred[C] | Dinheiro[D] | Boleto Bancario[B] : ");
        formaPagamento = sc.nextLine();
        
        System.out.print("- Informe a Cotacao do Dolar na Data Atual: $ ");
        cotacao = sc.nextDouble();
        
        System.out.print ("- Informe a Margem de Lucro ( % ): ");
        porcentagem = sc.nextInt();
        System.out.print ("\n");
        
        
        Transporte transporte01 = new Transporte(tipoTransporte, valorTransporte);
        hospedagem hospedagem = new hospedagem(nomeHospedagem, valorDiaria);
        pacoteViagem pacote = new pacoteViagem(transporte01, hospedagem, destino, qtdDias, porcentagem);
        venda venda = new venda(pacote, nomeCliente, formaPagamento);
        
        System.out.println("- Pacote de viagem:");
        
          System.out.print ("\n");
          System.out.println("- Destino : "+pacote.GetDestino());
          System.out.println("- Hospedagem : "+pacote.GetHospedagem().GetnomeHospedagem());
          System.out.println("- Total dias : "+pacote.GetQtdDias());
          System.out.println("- Transporte: " + locomocao);
        
          System.out.print("\n");
          System.out.println("- Informacoes da Venda.");
       
          System.out.print ("\n");
          System.out.println("- Nome do Cliente : "+venda.GetCliente());
          System.out.println("- Telefone : " + telefoneCliente);
          System.out.println("- Forma Pagamento : "+venda.GetFormaPagamento());
          System.out.print("\n");
          
          System.out.println("- Valor do Transporte : R$ "+df.format(pacote.GetTransporte().Getvalor()));
          System.out.println("- Total Diarias : R$ "+df.format(pacote.CalcularTotalDiarias()));
          System.out.println("- Comissoes : R$ "+df.format(pacote.CalcularComissao()));
       
          System.out.print("\n");
          System.out.println("- Valor Total Pacote : R$ "+df.format(venda.ValorTotalPacote()));
        
          System.out.print("\n");
         
          System.out.print("- Cotacao Dolar no Dia Atual : $ " + cotacao);
          System.out.println("\n");
          System.out.println("- Valor do Pacote em Reais : R$ " + df.format(venda.ValorTotalPacote()));
          System.out.println("- Valor do Pacote em Dolar : $ " +df.format(venda.GetcotacaoDolar(cotacao)));

          System.out.println("\n");
          System.out.println("- A Equipe do SenacEad lhe Deseja uma Exelente Viagem.");
          System.out.println("                            *****                     ");
          System.out.println("\n");
    
          sc.close();
    
    }

     
}
    

