import java.time.LocalDate;
import java.util.ArrayList;
import java.util.TreeMap;

public class Sistema {

    // armazenamento de informações
    private final TreeMap<LocalDate, ArrayList<Lembrete>> mapLembretes = new TreeMap<LocalDate, ArrayList<Lembrete>>();

    // construtor
    public Sistema() {
    }

    // métodos do sistema

    /**
     * Recebe um lembrete e o armazena.
     * <p>
     * Caso ja exista um dia para a data ela ser adicionada nesse dia. Caso não
     * exista uma data um novo dia sera criado.
     */
    public void adicionarLembrete(Lembrete lembrete) {

        LocalDate dataChave = lembrete.getData();

        if (!mapLembretes.containsKey(dataChave)) {
            ArrayList<Lembrete> dia = new ArrayList<Lembrete>(); // cria novo dia
            mapLembretes.put(dataChave, dia); // adiciona novo dia
            mapLembretes.get(dataChave).add(lembrete); // adiciona lembrete ao dia criado
        } else {
            mapLembretes.get(dataChave).add(lembrete);
        }

        System.out.println("Lembrete adicionado a lista!");
    }

    /**
     * Recebe uma data existente no sistema e o numero do lembrete especificado no
     * dia que ele foi criado e remove da lista.
     *
     * @param data           LocalDate
     * @param numeroLembrete int
     */
    public void remocaoLembrete(LocalDate data, int numeroLembrete) {

        ArrayList<Lembrete> listaDiaAtual = null;

        if (mapLembretes.isEmpty()) {
            System.out.println("Erro: Não possui nenhum lembrete armazenado para remoção!");
        } else if (!mapLembretes.containsKey(data)) {
            System.out.println("Erro: A data não condiz com nenhum lembrete no sistema!");
        } else {

            listaDiaAtual = mapLembretes.get(data);

            if ((numeroLembrete - 1) > listaDiaAtual.size()) {
                System.out.println("O numero de lembrete não existe!");
            } else if (listaDiaAtual.size() == 1) {// correção para evitar OutOfBounds
                mapLembretes.remove(mapLembretes.firstKey());
                System.out.println("Lembrete removido com sucesso.");
            } else {
                listaDiaAtual.remove(numeroLembrete - 1); // numeroLembrete -1 porque o usuário ve começando com 1
                System.out.println("Lembrete removido com sucesso.");
            }

        }

    }

    /**
     * Lista todos dias presentes em todas listas de dia.
     */
    public void listarLembretes() {

        if (mapLembretes.isEmpty())
            System.out.println("Ainda não possui lembretes!");

        for (LocalDate diaAtual : mapLembretes.keySet()) {

            // variaveis
            ArrayList<Lembrete> listaDiaAtual = null;
            LocalDate dataDiaAtual = null;
            int index = 0;
            int numeroDoLembrete = 1;
            String dataFormatada = null;

            // abstração de informações

            // pega o valor da chave do mapa (lista de lembretes de um dia)
            listaDiaAtual = mapLembretes.get(diaAtual);
            // pega a LocalDate bruta no formato (yyy/MM/yy) dos lembretes do array
            dataDiaAtual = listaDiaAtual.get(index).getData();
            // transforma a LocalDate bruta em String no formato (dd/MM/yy)
            dataFormatada = ConversorDatas.localDateParaStringPadraoBrasil(dataDiaAtual);

            index++; // muda o index da lista acessada na proxima iteração

            System.out.println("--------------LEMBRETES DO DIA " + dataFormatada + "-----------");

            // mostra o método toString por padrão Java de todos objetos Lembrete iterados
            for (Lembrete listaDoDia : listaDiaAtual) {
                System.out.println("\nLembrete numero: " + numeroDoLembrete++);
                System.out.println(listaDoDia + "\n");
            }

            System.out.println("----------------------FIM DO DIA--------------------");
        }
    }

    /**
     * Retorna q quantidade de dias únicos no sistema.
     *
     * @return int
     */
    public int tamanhoArmazenamento() {
        return mapLembretes.size();
    }

}
