package Quadratic;
import java.lang.Math;

public class QuadraticEquation
{

  /*
      Costruttore: riceve i coefficienti a, b, c dell'equazione quadratica
      e inizializza i campi di esemplare secondo i valori ricevuti
  */
  public QuadraticEquation(int acoeff, int bcoeff, int ccoeff)
  {
	  a = acoeff;
    b = bcoeff;
    c = ccoeff;
    delta = b*b - 4*a*c;
  }



  /*
      Restituisce la prima delle due soluzioni dell'equazione quadratica,
      usando la ben nota formula...
  */
  public double getSolution1()
  {
    return (Math.sqrt(delta)-b)/2*a;
  }


  /*
      Restituisce la seconda delle due soluzioni dell'equazione quadratica,
      usando la ben nota formula...
  */
  public double getSolution2()
  {
    return (0-Math.sqrt(delta)-b)/2*a;
  }



  /*
      Restituisce il valore false se l'equazione non ha soluzioni
      (ovvero se il discriminante e` negativo)
  */
  public boolean hasSolutions()
  {
    if (delta >= 0) {
      return true;
    }
    else {
      return false;
    }
  }



  private int a, b, c;
  
  private int delta;

}

