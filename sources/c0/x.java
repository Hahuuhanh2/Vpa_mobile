package c0;

import android.support.v4.media.a;
import v.v;

/* compiled from: DynamicRange */
public final class x {

    /* renamed from: c  reason: collision with root package name */
    public static final x f4366c = new x(0, 0);

    /* renamed from: d  reason: collision with root package name */
    public static final x f4367d = new x(1, 8);

    /* renamed from: e  reason: collision with root package name */
    public static final x f4368e = new x(3, 10);

    /* renamed from: f  reason: collision with root package name */
    public static final x f4369f = new x(4, 10);

    /* renamed from: g  reason: collision with root package name */
    public static final x f4370g = new x(5, 10);

    /* renamed from: h  reason: collision with root package name */
    public static final x f4371h = new x(6, 10);

    /* renamed from: i  reason: collision with root package name */
    public static final x f4372i = new x(6, 8);

    /* renamed from: a  reason: collision with root package name */
    public final int f4373a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4374b;

    public x(int i10, int i11) {
        this.f4373a = i10;
        this.f4374b = i11;
    }

    public final boolean a() {
        if (!b() || this.f4373a == 1 || this.f4374b != 10) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        int i10 = this.f4373a;
        if (i10 == 0 || i10 == 2 || this.f4374b == 0) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f4373a == xVar.f4373a && this.f4374b == xVar.f4374b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f4373a ^ 1000003) * 1000003) ^ this.f4374b;
    }

    public final String toString() {
        String str;
        StringBuilder q10 = a.q("DynamicRange@");
        q10.append(Integer.toHexString(System.identityHashCode(this)));
        q10.append("{encoding=");
        switch (this.f4373a) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        q10.append(str);
        q10.append(", bitDepth=");
        return v.e(q10, this.f4374b, "}");
    }
}
