package Class;
import java.util.ArrayList;

public class Proprietario {

    // atributos
    private ArrayList<Imovel> listaImoveis = new ArrayList<Imovel>();
    private int quantidadeImoveis;

    // construtor
    Proprietario() {
        this.quantidadeImoveis = 0;
    }

    // metodos
    public void adicionarImovel(Imovel imovel){
        this.listaImoveis.add(this.quantidadeImoveis,imovel);
    }

    public double precoTotalAlugueis(){
        double total = 0;

        for (Imovel imovel : listaImoveis) {
            total += imovel.getValorAluguel();
        }

        return total;
    }
}
