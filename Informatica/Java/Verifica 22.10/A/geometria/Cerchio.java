package geometria;

public class Cerchio {
  private Punto centro = centro;
  private double raggio = raggio;

  public Cerchio(Punto centro, double raggio){
    this.centro = centro;
    this.raggio = raggio;
  }

  public Punto getCentro(){
    return this.centro;
  }

  public double getRaggio(){
    return this.raggio;
  }

  public double circonferenza(){
    return(2 * Math.PI * this.raggio);
  }

  public double area(){
    return(Math.PI * Math.pow(this.raggio, 2));
  }

  public boolean contenuto(Cerchio c2){
    return (this.centro.distanza(c2.getCentro()) < c2.getRaggio());
  }

  public boolean concentrici(Cerchio c){
    return (this.centro.equals(c.getCentro()));
  }
}
