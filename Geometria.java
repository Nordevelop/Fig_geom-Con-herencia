package misClases;

public class Geometria {
  protected int lado;
  protected double lado2;
  protected double radio;
  protected double altura;
  protected double cateto1;
  protected double cateto2;
  protected int largo;
  protected int ancho;
  protected int alto;
  
  
  public Geometria(int lado, double lado2, double radio, double altura, double cateto1, double cateto2, int largo, int ancho, int alto){//metodo Constructor
    this.lado=lado;
    this.lado2.lado;
    this.radio=radio;
    this.altura=altura;
    this.cateto1=cateto1;
    this.cateto2=cateto2;
    this.largo=largo;
    this.ancho=ancho;
    this.alto=alto;
  }//fin metodo constructor
  /*Metodos Getters & Setters
   *
   */
  public int getLado() {
        return this.lado;
  }
  public void setLado(int lado) {
        this.lado=lado;
  }
   public double getLado2() {
        return this.lado2;
  }
  public void setLado2(double lado2) {
        this.lado2=lado2;
  }
  public double getRadio() {
        return this.radio;
  }
  public void setRadio(double radio) {
        this.radio=radio;
  }
  public double getAltura(){
        return this.altura;
  }
  public void setAltura(double Altura){
        this.altura=altura;
  }
  public double getCateto1(){
    return this.cateto1;
  }
  public void setCateto1(double cateto1){
    this.cateto1=cateto1;
  }
    public double getCateto2(){
    return this.cateto2;
  }
  public void setCateto2(double cateto2){
    this.cateto2=cateto2;
  }
   public int getLargo() {
        return this.largo;
  }
  public void setLargo(int largo) {
        this.largo=largo;
  }
   public int getAncho() {
        return this.ancho;
  }
  public void setAncho(int ancho) {
        this.ancho=ancho;
  }
   public int getAlto() {
        return this.alto;
  }
  public void setAlto(int alto) {
        this.alto=alto;
  }
   @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Geometria{lado=").append(lado);
        sb.append(", lado2=").append(lado2);
        sb.append(", radio=").append(radio);
        sb.append(", altura").append(altura);
        sb.append(", edad=").append(edad);
        sb.append(", cateto1=").append(cateto1);
        sb.append(", cateto2=").append(cateto2);
        sb.append(", largo= ").append(largo);
        sb.append(", ancho= ").append(ancho);
        sb.append(", alto= ").append(alto);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }//fin metodo toString
  
}//fin clase Geometria
