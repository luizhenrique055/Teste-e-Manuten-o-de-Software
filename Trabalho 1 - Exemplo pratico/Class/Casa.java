package Class;
class Casa extends Imovel{

    private double valorSeguroIncendio;

    public Casa(double valorAluguel, double valorSeguroIncendio) {
        super(valorAluguel);

        if (valorSeguroIncendio > 0)
            this.valorSeguroIncendio = valorSeguroIncendio;
        else
            this.valorSeguroIncendio = 0;
    }

    @Override
    protected double valorTotal() {
        return getValorAluguel() + this.valorSeguroIncendio;
    }

}