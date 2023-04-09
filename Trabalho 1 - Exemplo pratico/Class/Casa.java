package Class;
public class Casa extends Imovel{

    private double valorSeguroIncendio;

    public Casa(double valorAluguel, double valorSeguroIncendio) {
        super(valorAluguel);

        if (valorSeguroIncendio > 0)
            this.valorSeguroIncendio = valorSeguroIncendio;
        else
            this.valorSeguroIncendio = 0;
    }

    @Override
    public double valorTotal() {
        return getValorAluguel() + this.valorSeguroIncendio;
    }

}