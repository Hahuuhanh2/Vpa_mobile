package nl;

import android.support.v4.media.a;
import f0.b0;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.zone.ZoneRulesException;
import p3.l0;
import sl.f;
import sl.h;

/* compiled from: ZoneId */
public abstract class j implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f21773a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("ACT", "Australia/Darwin");
        hashMap.put("AET", "Australia/Sydney");
        hashMap.put("AGT", "America/Argentina/Buenos_Aires");
        hashMap.put("ART", "Africa/Cairo");
        hashMap.put("AST", "America/Anchorage");
        hashMap.put("BET", "America/Sao_Paulo");
        hashMap.put("BST", "Asia/Dhaka");
        hashMap.put("CAT", "Africa/Harare");
        hashMap.put("CNT", "America/St_Johns");
        hashMap.put("CST", "America/Chicago");
        hashMap.put("CTT", "Asia/Shanghai");
        hashMap.put("EAT", "Africa/Addis_Ababa");
        hashMap.put("ECT", "Europe/Paris");
        hashMap.put("IET", "America/Indiana/Indianapolis");
        hashMap.put("IST", "Asia/Kolkata");
        hashMap.put("JST", "Asia/Tokyo");
        hashMap.put("MIT", "Pacific/Apia");
        hashMap.put("NET", "Asia/Yerevan");
        hashMap.put("NST", "Pacific/Auckland");
        hashMap.put("PLT", "Asia/Karachi");
        hashMap.put("PNT", "America/Phoenix");
        hashMap.put("PRT", "America/Puerto_Rico");
        hashMap.put("PST", "America/Los_Angeles");
        hashMap.put("SST", "Pacific/Guadalcanal");
        hashMap.put("VST", "Asia/Ho_Chi_Minh");
        hashMap.put("EST", "-05:00");
        hashMap.put("MST", "-07:00");
        hashMap.put("HST", "-10:00");
        f21773a = Collections.unmodifiableMap(hashMap);
    }

    public j() {
        if (getClass() != k.class && getClass() != l.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static j t() {
        l lVar;
        l lVar2;
        f fVar;
        String id2 = TimeZone.getDefault().getID();
        Map<String, String> map = f21773a;
        l0.y0(id2, "zoneId");
        l0.y0(map, "aliasMap");
        String str = map.get(id2);
        if (str != null) {
            id2 = str;
        }
        if (id2.equals("Z")) {
            return k.f21776f;
        }
        if (id2.length() == 1) {
            throw new DateTimeException(b0.r("Invalid zone: ", id2));
        } else if (id2.startsWith("+") || id2.startsWith("-")) {
            return k.u(id2);
        } else {
            if (id2.equals("UTC") || id2.equals("GMT") || id2.equals("UT")) {
                k kVar = k.f21776f;
                kVar.getClass();
                return new l(id2, new f.a(kVar));
            } else if (id2.startsWith("UTC+") || id2.startsWith("GMT+") || id2.startsWith("UTC-") || id2.startsWith("GMT-")) {
                k u10 = k.u(id2.substring(3));
                if (u10.f21779b == 0) {
                    lVar = new l(id2.substring(0, 3), new f.a(u10));
                } else {
                    lVar = new l(id2.substring(0, 3) + u10.f21780c, new f.a(u10));
                }
                return lVar;
            } else {
                if (id2.startsWith("UT+") || id2.startsWith("UT-")) {
                    k u11 = k.u(id2.substring(2));
                    if (u11.f21779b == 0) {
                        lVar2 = new l("UT", new f.a(u11));
                    } else {
                        StringBuilder q10 = a.q("UT");
                        q10.append(u11.f21780c);
                        lVar2 = new l(q10.toString(), new f.a(u11));
                    }
                } else {
                    Pattern pattern = l.f21781d;
                    if (id2.length() < 2 || !l.f21781d.matcher(id2).matches()) {
                        throw new DateTimeException(b0.r("Invalid ID for region-based ZoneId, invalid format: ", id2));
                    }
                    try {
                        fVar = h.a(id2, true);
                    } catch (ZoneRulesException e10) {
                        if (id2.equals("GMT0")) {
                            k kVar2 = k.f21776f;
                            kVar2.getClass();
                            fVar = new f.a(kVar2);
                        } else {
                            throw e10;
                        }
                    }
                    lVar2 = new l(id2, fVar);
                }
                return lVar2;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return getId().equals(((j) obj).getId());
        }
        return false;
    }

    public abstract String getId();

    public int hashCode() {
        return getId().hashCode();
    }

    public abstract f s();

    public String toString() {
        return getId();
    }
}
