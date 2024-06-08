//Nombre:Nestor Paredes Casas
//Planteamiento:Elabora un codigo en java en donde agregues una clase adicional a la clase principal llamada clase figuras.Deberas crear en la clase 3 objetos que lleven por nombre circulo, cuadrado y rectangulo, lo cual a los objetos rectangulo y cuadrado deberam llevar parametros y que devuelva el area y nombre de las fuguras por lo que el circulo se no llevara parametros pero debe devolver el area del y el nombre de circulo utilizando polimorfismo, los datos del circulo se debrean ingresar en la clase figuras mientras que el rectangulo y el cuadrado debera pedir datos en la clase principal.
//los objetos y la clase figuras deberan ser llamados a la clase principal 
// El codigo se corre en replit 
class Main {
  public static void main(String[] args) {
    int Num;
    int Num1, Num2;
    Figuras Obj = new Figuras();
    System.out.println(Obj.Fig());
    Num=Integer.parseInt(System.console().readLine("Ingrese un numero: "));
    System.out.println(Obj.Fig(Num));
    Num1=Integer.parseInt(System.console().readLine("Ingrese un numero: "));
    Num2=Integer.parseInt(System.console().readLine("Ingrese un numero: "));
    System.out.println(Obj.Fig(Num1, Num2));
  }
}