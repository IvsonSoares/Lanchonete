class Prato{
    private String nome;
    private String dataValidade;
    private double preco;
    private double peso;
  
    public Prato(String nome, String dataValidade, double preco, double peso){
      this.nome = nome;
      this.dataValidade = dataValidade;
      this.preco = preco;
      this.peso = peso;
      
    }
  
    public void setNome(String nome){
      this.nome = nome;
    }
  
    public void setDataValidade(String dataValidade){
      this.dataValidade = dataValidade;
    }
  
    public void setPreco(double preco){
      this.preco = preco;
    }
  
    public void setPeso(double peso){
      this.peso = peso;
    }
  
    public String getNome(){
      return this.nome;
    }
  
    public String getDataValidade(){
      return this.dataValidade;
    }
  
    public double getPreco(){
      return this.preco;
    }
  
    public double getPeso(){
      return this.peso;
    }
    
  }