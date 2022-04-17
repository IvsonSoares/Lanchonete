import java.util.ArrayList;

class Pedido {

  private static String nomeCliente;
  private static double taxaServico;
  private static ArrayList<Prato> itensConsumidos;
  private static double total;


  public static void addItem(Prato prato){
    Pedido.getItensConsumidos().add(prato);
  }

  public static double calculaTaxa(){
    double totalTaxa = 0;
    for(int i = 0; i < itensConsumidos.size(); i++){
      totalTaxa += itensConsumidos.get(i).getPreco() * Pedido.getTaxaServico();
    }
    return totalTaxa;
  }

  public static void imprimeNota(){
    double total = 0;  
    System.out.println("\n\n\n ----------CUPOM FISCAL----------- \n\n\n");
    System.out.println("Cliente: " + Pedido.getNomeCliente() + "\n");
    System.out.println("Lista de Produtos");
    for(int i = 0; i < Pedido.getItensConsumidos().size(); i++){
        System.out.println(i+1 + ":  " + Pedido.getItensConsumidos().get(i).getNome() + "---------------------\t\t" + "R$ " + Pedido.getItensConsumidos().get(i).getPreco());
        total += itensConsumidos.get(i).getPreco();
    }
    Pedido.setPedidoTotal(Pedido.calculaTaxa() + total);
    System.out.println("Taxa de servico: -------------" + "R$ " +  Pedido.calculaTaxa());
    System.out.println("Total:           -------------" + "R$ " +  Pedido.getPedidoTotal());
    }

  public static double calculaTroco(double valorPago){
    double total = 0;
    for(int i = 0; i < itensConsumidos.size(); i++){
      total += itensConsumidos.get(i).getPreco();
    }
    return valorPago - (total + Pedido.calculaTaxa());
  }
  

  //getters and setters

  public static void setPedidoTotal(double total){
    Pedido.total = total;
  }

  public static double getPedidoTotal(){
      return Pedido.total;
  }

  public static void setNomeCliente(String nomeCliente){
    Pedido.nomeCliente = nomeCliente;
  }

  public static void setTaxaServico(double taxaServico){
    Pedido.taxaServico = taxaServico;
  }

  public static void setItensConsumidos(ArrayList<Prato> itensConsumidos){
    Pedido.itensConsumidos = itensConsumidos;
  }

  public static String getNomeCliente(){
    return Pedido.nomeCliente;
  }

  public static double getTaxaServico(){
    return taxaServico;
  }

  public static ArrayList<Prato> getItensConsumidos(){
    return Pedido.itensConsumidos;
  }
}