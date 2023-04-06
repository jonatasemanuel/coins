package cofrinho;

public class Dolar extends Moeda{
    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public void info(){
        System.out.println("$" + valor);
    }
    @Override
    public String toString() {
        return "Dolar{" +
                "valor=" + valor +
                '}';
    }
    @Override
    double converter() {
        double real = 5;
        return this.valor*real;
    }
}
