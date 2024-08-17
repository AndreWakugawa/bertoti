package bertoti.padroes.util;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class RandomDateGenerator {

    public static LocalDate between(LocalDate start, LocalDate end) {
        long startEpochDay = start.toEpochDay();
        long endEpochDay = end.toEpochDay();
        long randomDay = ThreadLocalRandom.current().nextLong(startEpochDay,endEpochDay);

        return LocalDate.ofEpochDay(randomDay);
    }
}
