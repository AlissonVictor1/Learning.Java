package academy.devddojo.maratonajava.javacore.Rdates.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        // Obtém um mapa contendo abreviações de fusos horários e seus identificadores completos
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds); // Exibe o mapa de abreviações de fusos horários

        // Obtém o fuso horário padrão do sistema operacional
        System.out.println(ZoneId.systemDefault());

    // Cria um ZoneId para o fuso horário de Tóquio
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone); // Exibe o fuso horário de Tóquio

    // Obtém a data e hora atual do sistema (sem fuso horário)
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now); // Exibe a data e hora atual

    // Associa o LocalDateTime atual ao fuso horário de Tóquio, criando um ZonedDateTime
        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
        System.out.println(zonedDateTime); // Exibe a data e hora atual em Tóquio

    // Obtém o instante atual no fuso horário UTC (Coordinated Universal Time)
        Instant nowInstant = Instant.now();
        System.out.println(nowInstant); // Exibe o instante atual em UTC

    // Converte o Instant atual para o fuso horário de Tóquio
        ZonedDateTime zonedDateTime1 = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime1); // Exibe a data e hora atual em Tóquio no formato ZonedDateTime

    // Exibe o menor e o maior deslocamento de horário permitido (-18:00 e +18:00)
        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

    // Cria um ZoneOffset para o horário de Manaus (-04:00)
        ZoneOffset ofsetManaus = ZoneOffset.of("-04:00");

    // Associa o LocalDateTime atual ao fuso horário de Manaus, criando um OffsetDateTime
        OffsetDateTime offsetDateTime = now.atOffset(ofsetManaus);
        System.out.println(offsetDateTime); // Exibe a data e hora atual em Manaus

    // Alternativa para criar um OffsetDateTime com o LocalDateTime e o ZoneOffset especificado
        OffsetDateTime offsetDateTime1 = OffsetDateTime.of(now, ofsetManaus);
        System.out.println(offsetDateTime1); // Exibe o mesmo valor que a linha anterior

        OffsetDateTime offsetDateTime2 = nowInstant.atOffset(ofsetManaus);
        JapaneseDate from = JapaneseDate.from(LocalDate.now());
        System.out.println(from);
        LocalDate date = LocalDate.of(1900,1,1);
        JapaneseDate from1 = JapaneseDate.from(date);
        System.out.println(from1);

    }
}
