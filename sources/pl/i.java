package pl;

import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import rl.c;
import rl.g;

/* compiled from: SimpleDateTimeTextProvider */
public final class i extends f {

    /* renamed from: c  reason: collision with root package name */
    public static final a f22720c = new a();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f22721b = new ConcurrentHashMap(16, 0.75f, 2);

    /* compiled from: SimpleDateTimeTextProvider */
    public class a implements Comparator<Map.Entry<String, Long>> {
        public final int compare(Object obj, Object obj2) {
            return ((String) ((Map.Entry) obj2).getKey()).length() - ((String) ((Map.Entry) obj).getKey()).length();
        }
    }

    /* compiled from: SimpleDateTimeTextProvider */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Map<j, Map<Long, String>> f22722a;

        public b(Map<j, Map<Long, String>> map) {
            this.f22722a = map;
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (j next : map.keySet()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry : map.get(next).entrySet()) {
                    Object value = entry.getValue();
                    Object value2 = entry.getValue();
                    Object key = entry.getKey();
                    a aVar = i.f22720c;
                    hashMap2.put(value, new AbstractMap.SimpleImmutableEntry(value2, key));
                }
                ArrayList arrayList2 = new ArrayList(hashMap2.values());
                Collections.sort(arrayList2, i.f22720c);
                hashMap.put(next, arrayList2);
                arrayList.addAll(arrayList2);
                hashMap.put((Object) null, arrayList);
            }
            Collections.sort(arrayList, i.f22720c);
        }
    }

    public static b b(HashMap hashMap) {
        hashMap.put(j.FULL_STANDALONE, hashMap.get(j.FULL));
        hashMap.put(j.SHORT_STANDALONE, hashMap.get(j.SHORT));
        j jVar = j.NARROW;
        if (hashMap.containsKey(jVar)) {
            j jVar2 = j.NARROW_STANDALONE;
            if (!hashMap.containsKey(jVar2)) {
                hashMap.put(jVar2, hashMap.get(jVar));
            }
        }
        return new b(hashMap);
    }

    public static String c(int i10, String str, Locale locale) {
        if (locale.getLanguage().equals("zh") && locale.getCountry().equals("CN")) {
            switch (i10) {
                case 1:
                    return "一";
                case 2:
                    return "二";
                case 3:
                    return "三";
                case 4:
                    return "四";
                case 5:
                    return "五";
                case 6:
                    return "六";
                case 7:
                    return "日";
            }
        }
        if (locale.getLanguage().equals("ar")) {
            switch (i10) {
                case 1:
                    return "ن";
                case 2:
                    return "ث";
                case 3:
                    return "ر";
                case 4:
                    return "خ";
                case 5:
                    return "ج";
                case 6:
                    return "س";
                case 7:
                    return "ح";
            }
        }
        return str.substring(0, 1);
    }

    public static String d(int i10, String str, Locale locale) {
        if (locale.getLanguage().equals("zh") && locale.getCountry().equals("CN")) {
            switch (i10) {
                case 1:
                    return "一";
                case 2:
                    return "二";
                case 3:
                    return "三";
                case 4:
                    return "四";
                case 5:
                    return "五";
                case 6:
                    return "六";
                case 7:
                    return "七";
                case 8:
                    return "八";
                case 9:
                    return "九";
                case 10:
                    return "十";
                case 11:
                    return "十一";
                case 12:
                    return "十二";
            }
        }
        if (locale.getLanguage().equals("ar")) {
            switch (i10) {
                case 1:
                    return "ي";
                case 2:
                    return "ف";
                case 3:
                    return "م";
                case 4:
                    return "أ";
                case 5:
                    return "و";
                case 6:
                    return "ن";
                case 7:
                    return "ل";
                case 8:
                    return "غ";
                case 9:
                    return "س";
                case 10:
                    return "ك";
                case 11:
                    return "ب";
                case 12:
                    return "د";
            }
        }
        if (!locale.getLanguage().equals("ja") || !locale.getCountry().equals("JP")) {
            return str.substring(0, 1);
        }
        return Integer.toString(i10);
    }

    public final String a(g gVar, long j10, j jVar, Locale locale) {
        Map map;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry;
        Object obj;
        g gVar2 = gVar;
        Locale locale2 = locale;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry(gVar2, locale2);
        Object obj2 = this.f22721b.get(simpleImmutableEntry2);
        if (obj2 == null) {
            j jVar2 = j.NARROW;
            j jVar3 = j.SHORT;
            j jVar4 = j.FULL;
            if (gVar2 == rl.a.MONTH_OF_YEAR) {
                DateFormatSymbols instance = DateFormatSymbols.getInstance(locale);
                HashMap hashMap = new HashMap();
                simpleImmutableEntry = simpleImmutableEntry2;
                j jVar5 = jVar3;
                String[] months = instance.getMonths();
                DateFormatSymbols dateFormatSymbols = instance;
                HashMap hashMap2 = new HashMap();
                hashMap2.put(1L, months[0]);
                hashMap2.put(2L, months[1]);
                hashMap2.put(3L, months[2]);
                hashMap2.put(4L, months[3]);
                hashMap2.put(5L, months[4]);
                hashMap2.put(6L, months[5]);
                hashMap2.put(7L, months[6]);
                hashMap2.put(8L, months[7]);
                hashMap2.put(9L, months[8]);
                hashMap2.put(10L, months[9]);
                hashMap2.put(11L, months[10]);
                hashMap2.put(12L, months[11]);
                hashMap.put(jVar4, hashMap2);
                HashMap hashMap3 = new HashMap();
                Locale locale3 = locale;
                hashMap3.put(1, d(1, months[0], locale3));
                hashMap3.put(2L, d(2, months[1], locale3));
                hashMap3.put(3L, d(3, months[2], locale3));
                hashMap3.put(4L, d(4, months[3], locale3));
                hashMap3.put(5L, d(5, months[4], locale3));
                hashMap3.put(6L, d(6, months[5], locale3));
                hashMap3.put(7L, d(7, months[6], locale3));
                hashMap3.put(8L, d(8, months[7], locale3));
                hashMap3.put(9L, d(9, months[8], locale3));
                hashMap3.put(10L, d(10, months[9], locale3));
                hashMap3.put(11L, d(11, months[10], locale3));
                hashMap3.put(12L, d(12, months[11], locale3));
                HashMap hashMap4 = hashMap;
                hashMap4.put(jVar2, hashMap3);
                String[] shortMonths = dateFormatSymbols.getShortMonths();
                HashMap hashMap5 = new HashMap();
                hashMap5.put(1, shortMonths[0]);
                hashMap5.put(2L, shortMonths[1]);
                hashMap5.put(3L, shortMonths[2]);
                hashMap5.put(4L, shortMonths[3]);
                hashMap5.put(5L, shortMonths[4]);
                hashMap5.put(6L, shortMonths[5]);
                hashMap5.put(7L, shortMonths[6]);
                hashMap5.put(8L, shortMonths[7]);
                hashMap5.put(9L, shortMonths[8]);
                hashMap5.put(10L, shortMonths[9]);
                hashMap5.put(11, shortMonths[10]);
                hashMap5.put(12L, shortMonths[11]);
                hashMap4.put(jVar5, hashMap5);
                obj = b(hashMap4);
            } else {
                simpleImmutableEntry = simpleImmutableEntry2;
                j jVar6 = jVar3;
                j jVar7 = jVar2;
                if (gVar2 == rl.a.DAY_OF_WEEK) {
                    DateFormatSymbols instance2 = DateFormatSymbols.getInstance(locale);
                    HashMap hashMap6 = new HashMap();
                    String[] weekdays = instance2.getWeekdays();
                    HashMap hashMap7 = new HashMap();
                    j jVar8 = jVar6;
                    hashMap7.put(1, weekdays[2]);
                    hashMap7.put(2L, weekdays[3]);
                    hashMap7.put(3L, weekdays[4]);
                    hashMap7.put(4L, weekdays[5]);
                    hashMap7.put(5L, weekdays[6]);
                    hashMap7.put(6L, weekdays[7]);
                    hashMap7.put(7L, weekdays[1]);
                    hashMap6.put(jVar4, hashMap7);
                    HashMap hashMap8 = new HashMap();
                    hashMap8.put(1, c(1, weekdays[2], locale2));
                    hashMap8.put(2L, c(2, weekdays[3], locale2));
                    hashMap8.put(3L, c(3, weekdays[4], locale2));
                    hashMap8.put(4L, c(4, weekdays[5], locale2));
                    hashMap8.put(5L, c(5, weekdays[6], locale2));
                    hashMap8.put(6L, c(6, weekdays[7], locale2));
                    hashMap8.put(7L, c(7, weekdays[1], locale2));
                    hashMap6.put(jVar7, hashMap8);
                    String[] shortWeekdays = instance2.getShortWeekdays();
                    HashMap hashMap9 = new HashMap();
                    hashMap9.put(1, shortWeekdays[2]);
                    hashMap9.put(2L, shortWeekdays[3]);
                    hashMap9.put(3L, shortWeekdays[4]);
                    hashMap9.put(4L, shortWeekdays[5]);
                    hashMap9.put(5L, shortWeekdays[6]);
                    hashMap9.put(6L, shortWeekdays[7]);
                    hashMap9.put(7L, shortWeekdays[1]);
                    hashMap6.put(jVar8, hashMap9);
                    obj = b(hashMap6);
                } else if (gVar2 == rl.a.AMPM_OF_DAY) {
                    DateFormatSymbols instance3 = DateFormatSymbols.getInstance(locale);
                    HashMap hashMap10 = new HashMap();
                    String[] amPmStrings = instance3.getAmPmStrings();
                    HashMap hashMap11 = new HashMap();
                    hashMap11.put(0L, amPmStrings[0]);
                    hashMap11.put(1, amPmStrings[1]);
                    hashMap10.put(jVar4, hashMap11);
                    hashMap10.put(jVar6, hashMap11);
                    obj = b(hashMap10);
                } else if (gVar2 == rl.a.ERA) {
                    DateFormatSymbols instance4 = DateFormatSymbols.getInstance(locale);
                    HashMap hashMap12 = new HashMap();
                    String[] eras = instance4.getEras();
                    HashMap hashMap13 = new HashMap();
                    hashMap13.put(0L, eras[0]);
                    hashMap13.put(1, eras[1]);
                    hashMap12.put(jVar6, hashMap13);
                    if (locale.getLanguage().equals(Locale.ENGLISH.getLanguage())) {
                        HashMap hashMap14 = new HashMap();
                        hashMap14.put(0L, "Before Christ");
                        hashMap14.put(1, "Anno Domini");
                        hashMap12.put(jVar4, hashMap14);
                    } else {
                        hashMap12.put(jVar4, hashMap13);
                    }
                    HashMap hashMap15 = new HashMap();
                    hashMap15.put(0L, eras[0].substring(0, 1));
                    hashMap15.put(1, eras[1].substring(0, 1));
                    hashMap12.put(jVar7, hashMap15);
                    obj = b(hashMap12);
                } else {
                    int i10 = c.f22831a;
                    if (gVar2 == c.a.f22832a) {
                        HashMap hashMap16 = new HashMap();
                        HashMap hashMap17 = new HashMap();
                        hashMap17.put(1, "Q1");
                        hashMap17.put(2L, "Q2");
                        hashMap17.put(3L, "Q3");
                        hashMap17.put(4L, "Q4");
                        hashMap16.put(jVar6, hashMap17);
                        HashMap hashMap18 = new HashMap();
                        hashMap18.put(1, "1st quarter");
                        hashMap18.put(2L, "2nd quarter");
                        hashMap18.put(3L, "3rd quarter");
                        hashMap18.put(4L, "4th quarter");
                        hashMap16.put(jVar4, hashMap18);
                        obj = b(hashMap16);
                    } else {
                        obj = "";
                    }
                }
            }
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry3 = simpleImmutableEntry;
            this.f22721b.putIfAbsent(simpleImmutableEntry3, obj);
            obj2 = this.f22721b.get(simpleImmutableEntry3);
        }
        if (!(obj2 instanceof b) || (map = ((b) obj2).f22722a.get(jVar)) == null) {
            return null;
        }
        return (String) map.get(Long.valueOf(j10));
    }
}
