package Class;

public class Apartamento extends Imovel {

    private double valorCondominio;

    Apartamento(double valorAluguel, double valorCondominio) {
        super(valorAluguel);

        this.valorCondominio = valorCondominio;

    }

    @Override
    protected double valorTotal() {
        return getValorAluguel() + this.valorCondominio;
    }

}
