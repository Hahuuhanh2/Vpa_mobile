package g4;

import n0.l;
import v.v;

/* compiled from: DocumentData */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f10341a;

    /* renamed from: b  reason: collision with root package name */
    public String f10342b;

    /* renamed from: c  reason: collision with root package name */
    public float f10343c;

    /* renamed from: d  reason: collision with root package name */
    public int f10344d;

    /* renamed from: e  reason: collision with root package name */
    public int f10345e;

    /* renamed from: f  reason: collision with root package name */
    public float f10346f;

    /* renamed from: g  reason: collision with root package name */
    public float f10347g;

    /* renamed from: h  reason: collision with root package name */
    public int f10348h;

    /* renamed from: i  reason: collision with root package name */
    public int f10349i;

    /* renamed from: j  reason: collision with root package name */
    public float f10350j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f10351k;

    public b(String str, String str2, float f10, int i10, int i11, float f11, float f12, int i12, int i13, float f13, boolean z10) {
        this.f10341a = str;
        this.f10342b = str2;
        this.f10343c = f10;
        this.f10344d = i10;
        this.f10345e = i11;
        this.f10346f = f11;
        this.f10347g = f12;
        this.f10348h = i12;
        this.f10349i = i13;
        this.f10350j = f13;
        this.f10351k = z10;
    }

    public final int hashCode() {
        String str = this.f10342b;
        int g2 = ((v.g(this.f10344d) + (((int) (((float) l.f(str, this.f10341a.hashCode() * 31, 31)) + this.f10343c)) * 31)) * 31) + this.f10345e;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(this.f10346f);
        return (((g2 * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f10348h;
    }

    public b() {
    }
}
