package cofrinho;

public class Real extends Moeda{
    public Real(double valor) {
        super(valor);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        return "Real{" +
                "valor=" + valor +
                '}';
    }

    @Override
    public void info(){
        System.out.println("R$" + valor);
    }
    @Override
    public double converter() {
        return valor;
    }
}
