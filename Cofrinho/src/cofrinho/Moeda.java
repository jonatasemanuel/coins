package cofrinho;

public abstract class Moeda {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Moeda moeda = (Moeda) o;

        return Double.compare(moeda.valor, valor) == 0;
    }
    public double valor;
    public Moeda(double valor) {
        this.valor = valor;
    }
    public void info() {}
    abstract double converter();
}
