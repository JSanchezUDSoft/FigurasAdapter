package polimorfismofiguras;

public class Poligono extends Figura{
    @Override
    public double calcularArea() {
        return (this.getValor1()*this.getValor2());
    }

    @Override
    public double calcularPerimetro() {
        return (2*(this.getValor1()+this.getValor2()));
    }
}

