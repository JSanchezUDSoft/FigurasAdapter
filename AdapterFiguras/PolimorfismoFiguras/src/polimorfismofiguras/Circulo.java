
package polimorfismofiguras;

public class Circulo extends Figura{

    @Override
    public double calcularArea() {
        
        return Math.PI*Math.pow(this.getValor1(),2);
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*this.getValor1();
    }
}

