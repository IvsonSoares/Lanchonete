import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println("1: Fazer pedido");
    System.out.println("0: Sair");
    Scanner scanEntrada = new Scanner(System.in);
    int entrada = scanEntrada.nextInt();
    if(entrada == 1){
      System.out.println("Digite o nome do cliente: "); 
      Scanner scanNomeCliente = new Scanner(System.in);
      String cliente = scanNomeCliente.nextLine();
      Pedido.setNomeCliente(cliente);
      itensDisponiveis();

      
    }else if(entrada == 0){
      System.out.println("Nao quis nem tentar?");
      System.exit(0);
    }else{
      System.out.println("Entrada Invalida");
    }
  }

  public static void itensDisponiveis() {

    // Pedido pedido = new Pedido();
    double taxa = 0.1; //10%
    ArrayList<Prato> pedido = new ArrayList<>();

    Pedido.setTaxaServico(taxa);
    Pedido.setItensConsumidos(pedido);

    //int option = -1;

    while (true) {

      ArrayList<Prato> pratosDisponiveis = new ArrayList<Prato>();

      Pizza pizzaPortuguesa = new Pizza("normal", "queijo, presunto e ovo", "normal", "Pizza Portuguesa", "forever",
          50.0,
          2.50);
      Pizza pizzaCalabresa = new Pizza("normal", "queijo e calabresa", "normal", "Pizza Calabresa", "forever", 45.0,
          2.50);
      Pizza pizzaQuatroQueijos = new Pizza("normal", "queijo, queijo, queijo, queijo", "normal", "Pizza Quatro Queijos",
          "forever", 50.0, 2.50);

      pratosDisponiveis.add(pizzaPortuguesa);
      pratosDisponiveis.add(pizzaCalabresa);
      pratosDisponiveis.add(pizzaQuatroQueijos);

      Sanduiche xTudo = new Sanduiche("bolado", "tudo", "branco", "X-Tudo", "forever", 25.0, 1.0);
      Sanduiche xSalada = new Sanduiche("bolado", "salada e carne", "branco", "X-Salada", "forever", 20.0, 1.0);
      Sanduiche xBurguer = new Sanduiche("bolado", "carne e queijo", "branco", "X-Tudo", "forever", 15.0, 1.0);

      pratosDisponiveis.add(xTudo);
      pratosDisponiveis.add(xSalada);
      pratosDisponiveis.add(xBurguer);

      Salgadinho coxinha = new Salgadinho("batata", "frango", "Coxinha", "vencida", 5.0, 0.5);
      Salgadinho risole = new Salgadinho("batata", "carne", "Risole", "vencido", 5.0, 0.5);
      Salgadinho pastel = new Salgadinho("pastel", "carne", "Pastel", "vencida", 5.0, 0.5);

      pratosDisponiveis.add(coxinha);
      pratosDisponiveis.add(risole);
      pratosDisponiveis.add(pastel);

      System.out.println("----------------CARDAPIO---------------\n \n \n");
      for (int i = 0; i < pratosDisponiveis.size(); i++) {
        System.out.println(i + 1 + ": " + pratosDisponiveis.get(i).getNome() + "-------" + "R$"
            + pratosDisponiveis.get(i).getPreco());
      }

      System.out.println("\n0: Para finalizar o pedido\n\n");

      Scanner scanItem = new Scanner(System.in);

      int entrada = scanItem.nextInt();
      if (entrada == 0){
        Pedido.imprimeNota();
        //boolean pagamentoOk = true;
        while(true){
          Scanner scanPagamento = new Scanner(System.in);
          System.out.println("Entre o valor pago: ");
          double valorPago = scanPagamento.nextDouble();

          if(valorPago >= Pedido.getPedidoTotal()) {
            System.out.println("Troco: " + "R$ " + Pedido.calculaTroco(valorPago));
            System.out.println("\n\n\n-------------VOLTE SEMPRE-------");
            break;
          } else {
            System.out.println("O valor pago nao pode ser menor que o total");
          }

        }
        


        break;
      }

      int itemIndex = entrada - 1;
      Pedido.addItem(pratosDisponiveis.get(itemIndex));

    } // fim while true
  } // fim itensDisponiveis()
  
}