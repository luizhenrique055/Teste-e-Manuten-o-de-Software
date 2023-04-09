package Class;
public abstract class Imovel {

    // atributos
    private double valorAluguel;

    // construtor
    Imovel(double valorAluguel) {
        // if (valorAluguel > 0)
            this.valorAluguel = valorAluguel;
        // else
        //     this.valorAluguel = 0;
    }

    // metodos
    protected abstract double valorTotal();

    public double getValorAluguel() {
        return valorAluguel;
    }

}
