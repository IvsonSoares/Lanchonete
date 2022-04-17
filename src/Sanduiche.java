class Sanduiche extends Prato{
    private String pao;
    private String recheio;
    private String molho;
  
    public Sanduiche(String pao, String recheio, String molho, String nome, String dataValidade, double preco, double peso){
      super(nome, dataValidade, preco, peso);
      this.pao = pao;
      this.recheio = recheio;
      this.molho = molho;
    }
  
    public void setPao(String pao){
      this.pao = pao;
    }
    public void setRecheio(String recheio){
      this.recheio = recheio;
    }
    public void setMolho(String molho){
      this.molho = molho;
    }
  
    public String getPao(){
      return this.pao;
    }
    public String getRecheio(){
      return this.recheio;
    }
    public String getMolho(){
      return this.molho;
    }
  }