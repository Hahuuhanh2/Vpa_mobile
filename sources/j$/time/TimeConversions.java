package j$.time;

import java.time.Duration;

public class TimeConversions {
    public static Duration convert(Duration duration) {
        if (duration == null) {
            return null;
        }
        return Duration.R(duration.getSeconds(), (long) duration.getNano());
    }

    public static Duration convert(Duration duration) {
        if (duration == null) {
            return null;
        }
        return Duration.ofSeconds(duration.o(), (long) duration.n());
    }
}
