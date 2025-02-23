package academy.devddojo.maratonajava.javacore.Sformatacao.test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioTest01 {
    public static void main(String[] args) {
        // Cria um Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Declara a variável datehour para armazenar a data e hora do compromisso
        LocalDateTime datehour = null;

        // Define o formato para data e hora
        DateTimeFormatter brformatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Define o formato apenas para data
        DateTimeFormatter brformatterjustdate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Laço para repetir enquanto datehour for nulo
        while (datehour == null) // repetidor do bloco para a exceção
        {
            // Solicita a data e hora do compromisso
            System.out.println("Digite a data do compromisso (dd/MM/yyyy HH:mm)");
            String input = scanner.nextLine();
            try {
                // Tenta converter a entrada para LocalDateTime usando o formato definido
                datehour = LocalDateTime.parse(input, brformatter);

                // Verifica se a data e hora são anteriores à data e hora atuais
                if (datehour.isBefore(LocalDateTime.now())) {
                    datehour = null; // Reseta datehour para repetir o loop
                    // Lança uma exceção se a data for anterior à atual
                    throw new IllegalArgumentException("A data e hora não pode ser anterior a data atual");
                }

                // Exibe a data e hora válidas
                System.out.println("Data e Hora válidas: " + datehour.format(brformatter));
                // Exibe a data e hora atual
                System.out.println("Data e Hora Atual: " + LocalDateTime.now().format(brformatter));
            }
            // Captura exceções de formatação ou estado inválido
            catch (DateTimeParseException | IllegalStateException e) {
                System.out.println("Data e Hora inválidas. Tente novamente");
            }
            // Captura a exceção lançada se a data for anterior à atual
            catch (IllegalArgumentException e) {
                // Exibe a mensagem da exceção
                System.out.println(e.getMessage());
                System.out.println("Tente novamente");
            }
        }
        // Fecha o Scanner
        scanner.close();

        // Obtém o nome do dia da semana em português
        String displayName = (datehour).getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));

        // Verifica se é um dia útil
        if (isDayofWeek(datehour)) {
            System.out.println("O compromisso na data: " + datehour.toLocalDate().format(brformatterjustdate) + " será em um dia útil - " + datehour.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("pt", "BR")));
        }
        // Se não for dia útil, ajusta para o próximo dia útil
        else {
            System.out.println("O compromisso caiu em um " + displayName + " e sera alterado para: " + proximodiautil(datehour).getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("pt", "BR")) + " " + proximodiautil(datehour).format(brformatter));
            datehour = proximodiautil(datehour); // Atualiza datehour para o próximo dia útil
        }

        // Obtém a data atual
        LocalDate now = LocalDate.now();
        LocalDateTime now1 = LocalDateTime.now();

        // Calcula a quantidade de dias entre a data atual e o compromisso
        long betweentime = ChronoUnit.DAYS.between(now1, datehour);

        // Calcula a diferença exata entre a data atual e o compromisso
        Duration d1 = Duration.between(now1, datehour);

        // Exibe o tempo restante para o compromisso
        System.out.println("Faltam exatos " + betweentime + " dias," + d1.toHoursPart() + " horas," + d1.toMinutesPart() + " minutos e " + d1.toSecondsPart() + " segundos para o compromisso");

        // Converte LocalDateTime para LocalDate
        LocalDate castdate = datehour.toLocalDate();

        // Calcula o período entre as datas
        Period period = Period.between(now, castdate);

        // Exibe o período detalhado (anos, meses, dias)
        System.out.println("Faltam exatos " + period.getYears() + " Anos, " + period.getMonths() + " Meses, " + "" + period.getDays() + " Dias");
    }

    // Método que ajusta a data para o próximo dia útil
    public static LocalDateTime proximodiautil(LocalDateTime localDateTime) {
        // Se for dia útil, adiciona um dia
        if (isDayofWeek(localDateTime)) {
            localDateTime = localDateTime.plusDays(1);
        }
        // Se não for dia útil, ajusta para a próxima segunda-feira
        else {
            localDateTime = localDateTime.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        }
        return localDateTime;
    }

    // Método que verifica se a data é um dia útil
    public static Boolean isDayofWeek(LocalDateTime localDateTime) {
        // Se for sábado ou domingo, não é dia útil
        if (localDateTime.getDayOfWeek() == DayOfWeek.SATURDAY || localDateTime.getDayOfWeek() == DayOfWeek.SUNDAY) {
            return false;
        }
        // Caso contrário, é dia útil
        return true;
    }
}

