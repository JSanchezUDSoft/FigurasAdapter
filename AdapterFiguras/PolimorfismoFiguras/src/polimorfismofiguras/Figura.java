
package polimorfismofiguras;

public abstract class Figura {
    
    private double valor1, valor2;
    
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }
    
}
