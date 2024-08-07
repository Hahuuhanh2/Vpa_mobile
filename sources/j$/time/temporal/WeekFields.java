package j$.time.temporal;

import j$.time.DayOfWeek;
import j$.time.b;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Locale;

public final class WeekFields implements Serializable {

    /* renamed from: g  reason: collision with root package name */
    private static final ConcurrentHashMap f18245g = new ConcurrentHashMap(4, 0.75f, 2);

    /* renamed from: h  reason: collision with root package name */
    public static final q f18246h = i.f18264d;
    private static final long serialVersionUID = -1177360819670808121L;

    /* renamed from: a  reason: collision with root package name */
    private final DayOfWeek f18247a;

    /* renamed from: b  reason: collision with root package name */
    private final int f18248b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final transient o f18249c = t.g(this);

    /* renamed from: d  reason: collision with root package name */
    private final transient o f18250d = t.j(this);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final transient o f18251e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final transient o f18252f;

    static {
        new WeekFields(DayOfWeek.MONDAY, 4);
        f(DayOfWeek.SUNDAY, 1);
    }

    private WeekFields(DayOfWeek dayOfWeek, int i10) {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
        this.f18251e = t.k(this);
        this.f18252f = t.i(this);
        if (dayOfWeek == null) {
            throw new NullPointerException("firstDayOfWeek");
        } else if (i10 < 1 || i10 > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        } else {
            this.f18247a = dayOfWeek;
            this.f18248b = i10;
        }
    }

    public static WeekFields f(DayOfWeek dayOfWeek, int i10) {
        String str = dayOfWeek.toString() + i10;
        ConcurrentHashMap concurrentHashMap = f18245g;
        WeekFields weekFields = (WeekFields) concurrentHashMap.get(str);
        if (weekFields != null) {
            return weekFields;
        }
        concurrentHashMap.putIfAbsent(str, new WeekFields(dayOfWeek, i10));
        return (WeekFields) concurrentHashMap.get(str);
    }

    public static WeekFields of(Locale locale) {
        if (locale != null) {
            Calendar instance = Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry()));
            return f(DayOfWeek.SUNDAY.U((long) (instance.getFirstDayOfWeek() - 1)), instance.getMinimalDaysInFirstWeek());
        }
        throw new NullPointerException("locale");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (this.f18247a != null) {
            int i10 = this.f18248b;
            if (i10 < 1 || i10 > 7) {
                throw new InvalidObjectException("Minimal number of days is invalid");
            }
            return;
        }
        throw new InvalidObjectException("firstDayOfWeek is null");
    }

    private Object readResolve() {
        try {
            return f(this.f18247a, this.f18248b);
        } catch (IllegalArgumentException e10) {
            StringBuilder b10 = b.b("Invalid serialized WeekFields: ");
            b10.append(e10.getMessage());
            throw new InvalidObjectException(b10.toString());
        }
    }

    public final o d() {
        return this.f18249c;
    }

    public final int e() {
        return this.f18248b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WeekFields) {
            return hashCode() == obj.hashCode();
        }
        return false;
    }

    public final o g() {
        return this.f18252f;
    }

    public DayOfWeek getFirstDayOfWeek() {
        return this.f18247a;
    }

    public final o h() {
        return this.f18250d;
    }

    public final int hashCode() {
        return (this.f18247a.ordinal() * 7) + this.f18248b;
    }

    public final o i() {
        return this.f18251e;
    }

    public final String toString() {
        StringBuilder b10 = b.b("WeekFields[");
        b10.append(this.f18247a);
        b10.append(',');
        b10.append(this.f18248b);
        b10.append(']');
        return b10.toString();
    }
}
