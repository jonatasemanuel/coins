package cofrinho;

public class Euro extends Moeda{
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    public Euro(double valor) {
        super(valor);
    }
    @Override
    public String toString() {
        return "Euro{" +
                "valor=" + valor +
                '}';
    }
    @Override
    public void info(){
        System.out.println("€" + valor);
    }
    @Override
    double converter() {
        double real = 6;
        return valor*real;
    }
}
