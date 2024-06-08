public class Figuras{
  double pi=3.1416;
  double Radio;
  int Numero;
  int Numero1, Numero2;
  double Respuesta;
  int Res;
  double R;
  public double Fig(){
     System.out.println("********************************");
    System.out.println("Circulo");
     System.out.println("El area del circulo es: Radio al cuadrado por el valor de pi(3.1416)");
    this.Radio=Integer.parseInt(System.console().readLine("Ingrese el radio de la circunferencia: "));
    this.R=this.Radio *this.Radio;
    this.Respuesta=(this.pi*this.R);
    return this.Respuesta;
  }
  public int Fig(int N){
     System.out.println("******************************");
    System.out.println("Cuadrado");
     System.out.println("Area del cuadrado es: Lado * Lado");
    this.Numero=N;
    this.Res=this.Numero*this.Numero;
    return this.Res;
  }
  public int Fig(int N1, int N2){
     System.out.println("*******************************");
    System.out.println("Rectangulo");
     System.out.println("Area del rectangulo: Base * Altura");
    this.Numero1=N1;
    this.Numero2=N2;
    this.Res=this.Numero1*this.Numero2;
    return this.Res;
  }
}