package calculoFormas;

public class Retangulo extends FiguraGeometrica{

    @Override
    public double calcularArea(double comprimento, double largura) {
        return super.calcularArea(comprimento, largura);
    }

    @Override
    public String toString() {
        return "A área do " + getTipoDeFigura()+
                " é " + getArea();
    }





}
