import java.time.LocalDate;
import java.util.Scanner;

public class App {


    public static void main(String[] args) {

        Sistema sistema = new Sistema();

        int opcao = -1;

        do {
            opcao = menuPrincipal();
            LocalDate dataBruta = null;
            int numeroLembrete = 0;

            switch (opcao) {
                case 1 -> { // listar lembretes
                    limparTela();
                    sistema.listarLembretes();
                    espera();
                }
                case 2 -> { // criar lembrete
                    Lembrete lembrete = menuCriacao();
                    sistema.adicionarLembrete(lembrete);
                }
                case 3 -> { // deletar
                    if (sistema.tamanhoArmazenamento() < 1) {
                        limparTela();
                        System.out.println("Nenhum dado no sistema para remoção!");
                        espera();
                        break;
                    }
                    menuRemocao();
                    dataBruta = insercaoDeDataValida();
                    System.out.println(dataBruta);
                    System.out.println("Digite numero do lembrete a ser deletado: ");
                    numeroLembrete = Integer.parseInt(teclado.nextLine());
                    sistema.remocaoLembrete(dataBruta, numeroLembrete);
                }
                default -> {
                    if (opcao == 0) {
                        System.out.println("Até a proxima");
                        break;
                    }
                    System.out.println("Comando invalido!");
                    espera();
                }
            }

        } while (opcao != 0);
    }

    // scanner de input
    static Scanner teclado = new Scanner(System.in);

    // #region Menus do sistema

    /**
     * Menu principal do aplicativo
     *
     * @return int Opção valida escolhida pelo usuário
     */
    public static int menuPrincipal() {

        System.out.println("===================================================");
        System.out.println("                 App Lembretes");
        System.out.println("===================================================");
        System.out.println("1 - Lista de lembretes");
        System.out.println("2 - Criar lembrete");
        System.out.println("3 - Remover lembrete");
        System.out.println("0 - Sair");

        System.out.print("\nDigite o numero da opção: ");
        return Integer.parseInt(teclado.nextLine());
    }

    public static Lembrete menuCriacao() {

        boolean eValido = false;
        String nomeLembrete = null;
        String descLembrete = null;
        LocalDate dataFormatada = null;

        limparTela();
        System.out.println("===================================================");
        System.out.println("                     Criação");
        System.out.println("===================================================");

        // validação do nome
        while (!eValido) {
            System.out.println("Insira o nome do lembrete: ");
            nomeLembrete = teclado.nextLine();

            if (nomeLembrete.isEmpty() || nomeLembrete.isBlank())
                System.out.println("O nome não pode ser vazio");
            else
                eValido = true;
        }

        System.out.println("Insira a descrição do lembrete: ");
        System.out.println("Caso não queira uma descrição aperte enter");
        descLembrete = teclado.nextLine();

        // insere uma data validada
        dataFormatada = insercaoDeDataValida();

        System.out.println("Lembrete criado com sucesso!");
        espera();

        return new Lembrete(nomeLembrete, descLembrete, dataFormatada);
    }

    public static void menuRemocao() {

        limparTela();
        System.out.println("===================================================");
        System.out.println("                   Remoção");
        System.out.println("===================================================");
        System.out.println("Para remoção e necessário a data do lembrete e qual seu numero.");
        System.out.println("Você pode verificar essas informações em lista de lembretes (opção 1).");

    }

    public static LocalDate insercaoDeDataValida() {

        LocalDate dataSistema = LocalDate.now();
        LocalDate dataFormatada = null;
        boolean eValido = false;

        while (!eValido) {

            System.out.println("Insira uma data");
            String dataLembrete = teclado.nextLine();

            if (dataLembrete.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})")) { // verificação regex de string valida

                dataFormatada = ConversorDatas.stringParaDataPadraoJava(dataLembrete); // string para data

                if (!dataFormatada.isBefore(dataSistema)) {
                    eValido = true;
                } else {
                    limparTela();
                    System.out.println("\nData invalida! Insira uma data valida.\nErro: O dia inserido ja passou!\n");
                }

            } else {
                limparTela();
                System.out.println(
                        "\nData invalida! Insira uma data valida no sistema.\nErro: O formato da data é: dd/mm/yyyy\n");
            }

        }

        return dataFormatada;
    }

    /**
     * Espera o usuario
     */
    public static void espera() {
        System.out.println("Pressione enter para continuar");
        teclado.nextLine();
    }

    /**
     * "Limpa" a tela (códigos de terminal VT-100)
     *
     * @author João Caram Santos - Professor PUC Minas
     */
    public static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // #endregion


}
