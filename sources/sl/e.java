package sl;

import java.io.DataInputStream;
import java.io.Serializable;
import n0.l;
import nl.b;
import nl.g;
import nl.h;
import nl.k;
import p3.l0;
import rl.a;
import v.v;

/* compiled from: ZoneOffsetTransitionRule */
public final class e implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final h f22951a;

    /* renamed from: b  reason: collision with root package name */
    public final byte f22952b;

    /* renamed from: c  reason: collision with root package name */
    public final b f22953c;

    /* renamed from: d  reason: collision with root package name */
    public final g f22954d;

    /* renamed from: e  reason: collision with root package name */
    public final int f22955e;

    /* renamed from: f  reason: collision with root package name */
    public final int f22956f;

    /* renamed from: n  reason: collision with root package name */
    public final k f22957n;

    /* renamed from: o  reason: collision with root package name */
    public final k f22958o;

    /* renamed from: p  reason: collision with root package name */
    public final k f22959p;

    public e(h hVar, int i10, b bVar, g gVar, int i11, int i12, k kVar, k kVar2, k kVar3) {
        this.f22951a = hVar;
        this.f22952b = (byte) i10;
        this.f22953c = bVar;
        this.f22954d = gVar;
        this.f22955e = i11;
        this.f22956f = i12;
        this.f22957n = kVar;
        this.f22958o = kVar2;
        this.f22959p = kVar3;
    }

    public static e a(DataInputStream dataInputStream) {
        b bVar;
        int i10;
        int i11;
        k kVar;
        k kVar2;
        int i12;
        int readInt = dataInputStream.readInt();
        h v2 = h.v(readInt >>> 28);
        int i13 = ((264241152 & readInt) >>> 22) - 32;
        int i14 = (3670016 & readInt) >>> 19;
        if (i14 == 0) {
            bVar = null;
        } else {
            bVar = b.t(i14);
        }
        b bVar2 = bVar;
        int i15 = (507904 & readInt) >>> 14;
        int i16 = v.k(3)[(readInt & 12288) >>> 12];
        int i17 = (readInt & 4080) >>> 4;
        int i18 = (readInt & 12) >>> 2;
        int i19 = readInt & 3;
        if (i15 == 31) {
            i10 = dataInputStream.readInt();
        } else {
            i10 = i15 * 3600;
        }
        if (i17 == 255) {
            i11 = dataInputStream.readInt();
        } else {
            i11 = (i17 - 128) * 900;
        }
        k w9 = k.w(i11);
        if (i18 == 3) {
            kVar = k.w(dataInputStream.readInt());
        } else {
            kVar = k.w((i18 * 1800) + w9.f21779b);
        }
        k kVar3 = kVar;
        if (i19 == 3) {
            kVar2 = k.w(dataInputStream.readInt());
        } else {
            kVar2 = k.w((i19 * 1800) + w9.f21779b);
        }
        if (i13 < -28 || i13 > 31 || i13 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        long j10 = (long) (((i10 % 86400) + 86400) % 86400);
        g gVar = g.f21761e;
        a.SECOND_OF_DAY.m(j10);
        int i20 = (int) (j10 / 3600);
        long j11 = j10 - ((long) (i20 * 3600));
        int i21 = (int) (j11 / 60);
        g t10 = g.t(i20, i21, (int) (j11 - ((long) (i21 * 60))), 0);
        if (i10 >= 0) {
            i12 = i10 / 86400;
        } else {
            i12 = ((i10 + 1) / 86400) - 1;
        }
        return new e(v2, i13, bVar2, t10, i12, i16, w9, kVar3, kVar2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f22951a == eVar.f22951a && this.f22952b == eVar.f22952b && this.f22953c == eVar.f22953c && this.f22956f == eVar.f22956f && this.f22955e == eVar.f22955e && this.f22954d.equals(eVar.f22954d) && this.f22957n.equals(eVar.f22957n) && this.f22958o.equals(eVar.f22958o) && this.f22959p.equals(eVar.f22959p)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int E = ((this.f22954d.E() + this.f22955e) << 15) + (this.f22951a.ordinal() << 11) + ((this.f22952b + 32) << 5);
        b bVar = this.f22953c;
        if (bVar == null) {
            i10 = 7;
        } else {
            i10 = bVar.ordinal();
        }
        return ((this.f22957n.f21779b ^ (v.g(this.f22956f) + (E + (i10 << 2)))) ^ this.f22958o.f21779b) ^ this.f22959p.f21779b;
    }

    public final String toString() {
        String str;
        StringBuilder q10 = android.support.v4.media.a.q("TransitionRule[");
        k kVar = this.f22958o;
        k kVar2 = this.f22959p;
        kVar.getClass();
        if (kVar2.f21779b - kVar.f21779b > 0) {
            str = "Gap ";
        } else {
            str = "Overlap ";
        }
        q10.append(str);
        q10.append(this.f22958o);
        q10.append(" to ");
        q10.append(this.f22959p);
        q10.append(", ");
        b bVar = this.f22953c;
        if (bVar != null) {
            byte b10 = this.f22952b;
            if (b10 == -1) {
                q10.append(bVar.name());
                q10.append(" on or before last day of ");
                q10.append(this.f22951a.name());
            } else if (b10 < 0) {
                q10.append(bVar.name());
                q10.append(" on or before last day minus ");
                q10.append((-this.f22952b) - 1);
                q10.append(" of ");
                q10.append(this.f22951a.name());
            } else {
                q10.append(bVar.name());
                q10.append(" on or after ");
                q10.append(this.f22951a.name());
                q10.append(' ');
                q10.append(this.f22952b);
            }
        } else {
            q10.append(this.f22951a.name());
            q10.append(' ');
            q10.append(this.f22952b);
        }
        q10.append(" at ");
        if (this.f22955e == 0) {
            q10.append(this.f22954d);
        } else {
            long E = (long) ((this.f22955e * 24 * 60) + (this.f22954d.E() / 60));
            long T = l0.T(E, 60);
            if (T < 10) {
                q10.append(0);
            }
            q10.append(T);
            q10.append(':');
            long j10 = (long) 60;
            long j11 = (long) ((int) (((E % j10) + j10) % j10));
            if (j11 < 10) {
                q10.append(0);
            }
            q10.append(j11);
        }
        q10.append(" ");
        q10.append(l.u(this.f22956f));
        q10.append(", standard offset ");
        q10.append(this.f22957n);
        q10.append(']');
        return q10.toString();
    }
}
