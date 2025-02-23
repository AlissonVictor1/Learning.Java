package academy.devddojo.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        // Obtém a data atual sem informações de horário
        LocalDate date = LocalDate.now();

        // Formata a data atual no padrão ISO_DATE (yyyy-MM-dd), ex: 2025-02-22
        String s1 = date.format(DateTimeFormatter.ISO_DATE);

        // Formata a data atual no padrão BASIC_ISO_DATE (yyyyMMdd), ex: 20250222
        String s2 = date.format(DateTimeFormatter.BASIC_ISO_DATE);

// Formata a data atual no padrão ISO_LOCAL_DATE (igual ao ISO_DATE), ex: 2025-02-22
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

// Imprime as datas formatadas
        System.out.println(s1); // Ex: 2025-02-22
        System.out.println(s2); // Ex: 20250222
        System.out.println(s3); // Ex: 2025-02-22

// Converte (parse) uma String para um LocalDate usando BASIC_ISO_DATE
        LocalDate parse1 = LocalDate.parse("20250222", DateTimeFormatter.BASIC_ISO_DATE);

// Converte uma String para um LocalDate usando ISO_DATE (yyyy-MM-dd)
        LocalDate parse2 = LocalDate.parse("2025-02-22", DateTimeFormatter.ISO_DATE);

// Converte uma String para um LocalDate usando ISO_LOCAL_DATE (igual ao ISO_DATE)
        LocalDate parse3 = LocalDate.parse("2025-02-22", DateTimeFormatter.ISO_LOCAL_DATE);

// Imprime os LocalDate resultantes do parse
        System.out.println(parse1); // Ex: 2025-02-22
        System.out.println(parse2); // Ex: 2025-02-22
        System.out.println(parse3); // Ex: 2025-02-22

        // Obtém a data e hora atuais
                LocalDateTime now = LocalDateTime.now();

        // Formata a data e hora no padrão ISO_DATE_TIME, ex: 2025-02-22T18:17:09.7247546
                String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
                System.out.println(s4);

        // Converte (parse) uma String para LocalDateTime no formato ISO_DATE_TIME
                LocalDateTime parse4 = LocalDateTime.parse("2025-02-22T18:17:09.7247546");
                System.out.println(parse4); // Ex: 2025-02-22T18:17:09.7247546

        // Cria um formatador para o padrão brasileiro (dd/MM/yyyy)
                DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Formata a data atual no padrão brasileiro, ex: 22/02/2025
        String formatbr = LocalDate.now().format(formatterBR);
        System.out.println(formatbr);

// Converte (parse) uma String no padrão brasileiro para LocalDate
        LocalDate parseBR = LocalDate.parse("19/02/2021", formatterBR);
        System.out.println(parseBR); // Ex: 2021-02-19

// Cria um formatador para o padrão alemão (dd.MMMM.yyyy) com o Locale GERMAN
        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);

// Formata a data atual no padrão alemão, ex: 22.Februar.2025
        String formatGr = LocalDate.now().format(formatterGR);
        System.out.println(formatGr);

// Converte (parse) uma String no padrão alemão para LocalDate
        LocalDate parseGR = LocalDate.parse("4.Februar.2021", formatterGR);
        System.out.println(parseGR);

    }
}
