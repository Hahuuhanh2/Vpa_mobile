package a6;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: DateHelper */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public TimeZone f104a;

    public a() {
        this.f104a = TimeZone.getDefault();
        this.f104a = TimeZone.getDefault();
    }

    public static Date c(Date date) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance.getTime();
    }

    public final Calendar a(Date date) {
        Calendar instance = Calendar.getInstance(b());
        instance.setTime(date);
        instance.set(14, 0);
        instance.set(13, 0);
        return instance;
    }

    public final TimeZone b() {
        TimeZone timeZone = this.f104a;
        if (timeZone == null) {
            return TimeZone.getDefault();
        }
        return timeZone;
    }

    public final Date d() {
        return Calendar.getInstance(b()).getTime();
    }
}
