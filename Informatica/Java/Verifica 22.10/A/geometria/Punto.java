package geometria;

public class Punto {
  private double x;
  private double y;

  public Punto(double x, double y){
    this.x = x;
    this.y = y;
  }

  public double getX(){
    return this.x;
  }

  public double getY(){
    return this.y;
  }

  public double distanza(Punto punto){
    return (Math.sqrt(Math.pow(this.x - punto.getX() ,2) + Math.pow(this.y - punto.getY(), 2)));
  }

  public boolean equals(Punto punto){
    return (this.x == punto.getX() && this.y == punto.getY());
  }
}
