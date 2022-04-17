class Pizza extends Prato{

    private String massa;
    private String recheio;
    private String borda;
    
    public Pizza(String massa, String recheio, String borda, String nome, String dataValidade, double preco, double peso){
      super(nome, dataValidade, preco, peso);
      this.massa = massa;
      this.recheio = recheio;
      this.borda = borda;
      
    }
  
    public void setMassa(String massa){
      this.massa = massa;
    }
  
    public void setRecheio(String recheio){
      this.recheio = recheio;
    }
  
    public void setBorda(String borda){
      this.borda = borda;
    }
    
  }