package j$.time;

import j$.time.temporal.j;
import j$.time.temporal.n;
import j$.time.zone.e;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

public abstract class ZoneId implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final Map f18032a;
    private static final long serialVersionUID = 8352817235686L;

    static {
        HashMap hashMap = new HashMap(64);
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
        f18032a = Collections.unmodifiableMap(hashMap);
    }

    ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != w.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static ZoneId R(j jVar) {
        ZoneId zoneId = (ZoneId) jVar.K(n.k());
        if (zoneId != null) {
            return zoneId;
        }
        throw new e("Unable to obtain ZoneId from TemporalAccessor: " + jVar + " of type " + jVar.getClass().getName());
    }

    static ZoneId V(String str, boolean z10) {
        int i10;
        if (str == null) {
            throw new NullPointerException("zoneId");
        } else if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.c0(str);
        } else {
            if (str.startsWith("UTC") || str.startsWith("GMT")) {
                i10 = 3;
            } else if (!str.startsWith("UT")) {
                return w.Z(str, z10);
            } else {
                i10 = 2;
            }
            return X(str, i10, z10);
        }
    }

    public static ZoneId W(String str, ZoneOffset zoneOffset) {
        if (str == null) {
            throw new NullPointerException("prefix");
        } else if (zoneOffset == null) {
            throw new NullPointerException("offset");
        } else if (str.length() == 0) {
            return zoneOffset;
        } else {
            if (str.equals("GMT") || str.equals("UTC") || str.equals("UT")) {
                if (zoneOffset.b0() != 0) {
                    str = str.concat(zoneOffset.l());
                }
                return new w(str, e.j(zoneOffset));
            }
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: " + str);
        }
    }

    private static ZoneId X(String str, int i10, boolean z10) {
        String substring = str.substring(0, i10);
        if (str.length() == i10) {
            return W(substring, ZoneOffset.UTC);
        }
        if (str.charAt(i10) != '+' && str.charAt(i10) != '-') {
            return w.Z(str, z10);
        }
        try {
            ZoneOffset c02 = ZoneOffset.c0(str.substring(i10));
            return c02 == ZoneOffset.UTC ? W(substring, c02) : W(substring, c02);
        } catch (e e10) {
            throw new e("Invalid ID for offset-based ZoneId: " + str, e10);
        }
    }

    public static ZoneId of(String str) {
        return V(str, true);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static ZoneId systemDefault() {
        String id2 = TimeZone.getDefault().getID();
        Map map = f18032a;
        if (id2 == null) {
            throw new NullPointerException("zoneId");
        } else if (map != null) {
            String str = (String) map.get(id2);
            if (str != null) {
                id2 = str;
            }
            return of(id2);
        } else {
            throw new NullPointerException("aliasMap");
        }
    }

    private Object writeReplace() {
        return new s((byte) 7, this);
    }

    public abstract e U();

    /* access modifiers changed from: package-private */
    public abstract void Y(DataOutput dataOutput);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return l().equals(((ZoneId) obj).l());
        }
        return false;
    }

    public int hashCode() {
        return l().hashCode();
    }

    public abstract String l();

    public String toString() {
        return l();
    }
}
