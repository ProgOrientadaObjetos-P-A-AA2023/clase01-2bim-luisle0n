
package paquete1;

public class Vehiculo {
    private String tipo;
    private String matricula;
    private double valor;

    public Vehiculo(String t, String mat, double val) {
        tipo = t;
        matricula = mat;
        valor = val;
    }
    public void establecerTipo(String n){
        tipo=n;
    }
    public void estblecerMatricula(String n){
        matricula=n;
    }
    public void estblecerValor(double n){
        valor=n;
    }
    public String obtenerTipo(){
        return tipo;
    }
     public String obtenerMatricula(){
        return matricula;
    }
      public double obtenerValor(){
        return valor;
    }   
}
