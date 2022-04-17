class Salgadinho extends Prato{
    private String massa;
    private String recheio;
  
    public Salgadinho(String massa, String recheioString, String nome, String dataValidade, double preco, double peso){
      super(nome, dataValidade, preco, peso);
      this.massa =  massa;
      this.recheio = recheio;
    }
  
    public void setMassa(String massa){
      this.massa = massa;
    }
  
    public void setRecheio(String recheio){
      this.recheio = recheio;
    }
  
    public String getMassa(){
      return this.massa;
    }
  
    public String getRecio(){
      return this.recheio;
    }
  }