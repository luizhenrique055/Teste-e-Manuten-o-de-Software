import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConversorDatas {

    /**
     * Recebe uma string no formato (dd/MM/yyy) e a converte para uma data no padrão
     * Java LocalDate
     *
     * @param dataString String
     * @return LocalDate yyyy-MM-dd
     */
    public static LocalDate stringParaDataPadraoJava(String dataString) {

        String dd ="";
        String mm = "";
        String yy = "";

        dd = dataString.substring(0, 2);
        mm = dataString.substring(3, 5);
        yy = dataString.substring(6, 10);

        // conversão da String padrão dd/mm/yy para yy/mm/yyyy
        String anoFormatadoAmericano = yy + mm + dd;

        // conversão da String padrão dd/mm/yy para yy/mm/yyyy
        // conversão paraLocalDate
        return LocalDate.parse(anoFormatadoAmericano, DateTimeFormatter.BASIC_ISO_DATE);


    }

    /**
     * Converte um objeto do tipo LocalDate(yy/mm/yyyy) para string formatada ao
     * padrão brasileiro
     *
     * @param data LocalDate
     * @return String data formatada padrão dd/mm/yy
     */
    public static String localDateParaStringPadraoBrasil(LocalDate data) {

        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return data.format(formatacao);
    }


}
