package j$.time.format;

import j$.time.temporal.a;
import j$.time.temporal.o;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

class C {

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap f18112a = new ConcurrentHashMap(16, 0.75f, 2);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final Comparator f18113b = new C0349c();

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f18114c = 0;

    C() {
    }

    private static Object b(o oVar, Locale locale) {
        Object obj;
        o oVar2 = oVar;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(oVar2, locale);
        Object obj2 = f18112a.get(simpleImmutableEntry);
        if (obj2 != null) {
            return obj2;
        }
        HashMap hashMap = new HashMap();
        int i10 = 0;
        if (oVar2 == a.ERA) {
            DateFormatSymbols instance = DateFormatSymbols.getInstance(locale);
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            String[] eras = instance.getEras();
            while (i10 < eras.length) {
                if (!eras[i10].isEmpty()) {
                    long j10 = (long) i10;
                    hashMap2.put(Long.valueOf(j10), eras[i10]);
                    hashMap3.put(Long.valueOf(j10), c(eras[i10]));
                }
                i10++;
            }
            if (!hashMap2.isEmpty()) {
                hashMap.put(TextStyle.FULL, hashMap2);
                hashMap.put(TextStyle.SHORT, hashMap2);
                hashMap.put(TextStyle.NARROW, hashMap3);
            }
            obj = new B(hashMap);
        } else if (oVar2 == a.MONTH_OF_YEAR) {
            DateFormatSymbols instance2 = DateFormatSymbols.getInstance(locale);
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            String[] months = instance2.getMonths();
            for (int i11 = 0; i11 < months.length; i11++) {
                if (!months[i11].isEmpty()) {
                    long j11 = ((long) i11) + 1;
                    hashMap4.put(Long.valueOf(j11), months[i11]);
                    hashMap5.put(Long.valueOf(j11), c(months[i11]));
                }
            }
            if (!hashMap4.isEmpty()) {
                hashMap.put(TextStyle.FULL, hashMap4);
                hashMap.put(TextStyle.NARROW, hashMap5);
            }
            HashMap hashMap6 = new HashMap();
            String[] shortMonths = instance2.getShortMonths();
            while (i10 < shortMonths.length) {
                if (!shortMonths[i10].isEmpty()) {
                    hashMap6.put(Long.valueOf(((long) i10) + 1), shortMonths[i10]);
                }
                i10++;
            }
            if (!hashMap6.isEmpty()) {
                hashMap.put(TextStyle.SHORT, hashMap6);
            }
            obj = new B(hashMap);
        } else if (oVar2 == a.DAY_OF_WEEK) {
            DateFormatSymbols instance3 = DateFormatSymbols.getInstance(locale);
            HashMap hashMap7 = new HashMap();
            String[] weekdays = instance3.getWeekdays();
            hashMap7.put(1L, weekdays[2]);
            hashMap7.put(2L, weekdays[3]);
            hashMap7.put(3L, weekdays[4]);
            hashMap7.put(4L, weekdays[5]);
            hashMap7.put(5L, weekdays[6]);
            hashMap7.put(6L, weekdays[7]);
            hashMap7.put(7L, weekdays[1]);
            hashMap.put(TextStyle.FULL, hashMap7);
            HashMap hashMap8 = new HashMap();
            hashMap8.put(1L, c(weekdays[2]));
            hashMap8.put(2L, c(weekdays[3]));
            hashMap8.put(3L, c(weekdays[4]));
            hashMap8.put(4L, c(weekdays[5]));
            hashMap8.put(5L, c(weekdays[6]));
            hashMap8.put(6L, c(weekdays[7]));
            hashMap8.put(7L, c(weekdays[1]));
            hashMap.put(TextStyle.NARROW, hashMap8);
            HashMap hashMap9 = new HashMap();
            String[] shortWeekdays = instance3.getShortWeekdays();
            hashMap9.put(1L, shortWeekdays[2]);
            hashMap9.put(2L, shortWeekdays[3]);
            hashMap9.put(3L, shortWeekdays[4]);
            hashMap9.put(4L, shortWeekdays[5]);
            hashMap9.put(5L, shortWeekdays[6]);
            hashMap9.put(6L, shortWeekdays[7]);
            hashMap9.put(7L, shortWeekdays[1]);
            hashMap.put(TextStyle.SHORT, hashMap9);
            obj = new B(hashMap);
        } else if (oVar2 == a.AMPM_OF_DAY) {
            DateFormatSymbols instance4 = DateFormatSymbols.getInstance(locale);
            HashMap hashMap10 = new HashMap();
            HashMap hashMap11 = new HashMap();
            String[] amPmStrings = instance4.getAmPmStrings();
            while (i10 < amPmStrings.length) {
                if (!amPmStrings[i10].isEmpty()) {
                    long j12 = (long) i10;
                    hashMap10.put(Long.valueOf(j12), amPmStrings[i10]);
                    hashMap11.put(Long.valueOf(j12), c(amPmStrings[i10]));
                }
                i10++;
            }
            if (!hashMap10.isEmpty()) {
                hashMap.put(TextStyle.FULL, hashMap10);
                hashMap.put(TextStyle.SHORT, hashMap10);
                hashMap.put(TextStyle.NARROW, hashMap11);
            }
            obj = new B(hashMap);
        } else {
            obj = "";
        }
        ConcurrentHashMap concurrentHashMap = f18112a;
        concurrentHashMap.putIfAbsent(simpleImmutableEntry, obj);
        return concurrentHashMap.get(simpleImmutableEntry);
    }

    private static String c(String str) {
        return str.substring(0, Character.charCount(str.codePointAt(0)));
    }

    public String d(o oVar, long j10, TextStyle textStyle, Locale locale) {
        Object b10 = b(oVar, locale);
        if (b10 instanceof B) {
            return ((B) b10).a(j10, textStyle);
        }
        return null;
    }

    public Iterator e(o oVar, TextStyle textStyle, Locale locale) {
        Object b10 = b(oVar, locale);
        if (b10 instanceof B) {
            return ((B) b10).b(textStyle);
        }
        return null;
    }
}
