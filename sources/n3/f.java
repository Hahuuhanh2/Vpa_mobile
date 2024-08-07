package n3;

import ek.g;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sk.j;
import sk.k;
import v.v;
import yk.h;

/* compiled from: Version.kt */
public final class f implements Comparable<f> {

    /* renamed from: f  reason: collision with root package name */
    public static final f f13491f = new f(0, 1, 0, "");

    /* renamed from: a  reason: collision with root package name */
    public final int f13492a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13493b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13494c;

    /* renamed from: d  reason: collision with root package name */
    public final String f13495d;

    /* renamed from: e  reason: collision with root package name */
    public final g f13496e = j7.a.b0(new b(this));

    /* compiled from: Version.kt */
    public static final class a {
        public static f a(String str) {
            Integer num;
            Integer num2;
            Integer num3;
            String str2;
            if (str == null || h.H0(str)) {
                return null;
            }
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
            if (!matcher.matches()) {
                return null;
            }
            String group = matcher.group(1);
            if (group == null) {
                num = null;
            } else {
                num = Integer.valueOf(Integer.parseInt(group));
            }
            if (num == null) {
                return null;
            }
            int intValue = num.intValue();
            String group2 = matcher.group(2);
            if (group2 == null) {
                num2 = null;
            } else {
                num2 = Integer.valueOf(Integer.parseInt(group2));
            }
            if (num2 == null) {
                return null;
            }
            int intValue2 = num2.intValue();
            String group3 = matcher.group(3);
            if (group3 == null) {
                num3 = null;
            } else {
                num3 = Integer.valueOf(Integer.parseInt(group3));
            }
            if (num3 == null) {
                return null;
            }
            int intValue3 = num3.intValue();
            if (matcher.group(4) != null) {
                str2 = matcher.group(4);
            } else {
                str2 = "";
            }
            j.e(str2, "description");
            return new f(intValue, intValue2, intValue3, str2);
        }
    }

    /* compiled from: Version.kt */
    public static final class b extends k implements rk.a<BigInteger> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f13497a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(f fVar) {
            super(0);
            this.f13497a = fVar;
        }

        public final Object invoke() {
            return BigInteger.valueOf((long) this.f13497a.f13492a).shiftLeft(32).or(BigInteger.valueOf((long) this.f13497a.f13493b)).shiftLeft(32).or(BigInteger.valueOf((long) this.f13497a.f13494c));
        }
    }

    static {
        new f(0, 0, 0, "");
        new f(1, 0, 0, "");
    }

    public f(int i10, int i11, int i12, String str) {
        this.f13492a = i10;
        this.f13493b = i11;
        this.f13494c = i12;
        this.f13495d = str;
    }

    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        j.f(fVar, "other");
        Object value = this.f13496e.getValue();
        j.e(value, "<get-bigInteger>(...)");
        Object value2 = fVar.f13496e.getValue();
        j.e(value2, "<get-bigInteger>(...)");
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f13492a == fVar.f13492a && this.f13493b == fVar.f13493b && this.f13494c == fVar.f13494c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((527 + this.f13492a) * 31) + this.f13493b) * 31) + this.f13494c;
    }

    public final String toString() {
        String str;
        if (!h.H0(this.f13495d)) {
            str = j.k(this.f13495d, "-");
        } else {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13492a);
        sb2.append('.');
        sb2.append(this.f13493b);
        sb2.append('.');
        return v.e(sb2, this.f13494c, str);
    }
}
