package Class;
public class Apartamento extends Imovel{

    private double valorCondominio;

    public Apartamento(double valorAluguel, double valorCondominio){
        super(valorAluguel);

        if (valorCondominio > 0)
            this.valorCondominio = valorCondominio;
        else 
            this.valorCondominio = 0;

    }

    @Override
    public double valorTotal() {
        return getValorAluguel() + this.valorCondominio;
    }
    
}
