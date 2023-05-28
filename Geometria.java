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
}
