package xd;

import android.graphics.Rect;
import f0.b0;

/* compiled from: SourceData */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f17312a;

    /* renamed from: b  reason: collision with root package name */
    public int f17313b;

    /* renamed from: c  reason: collision with root package name */
    public int f17314c;

    /* renamed from: d  reason: collision with root package name */
    public int f17315d;

    /* renamed from: e  reason: collision with root package name */
    public int f17316e;

    /* renamed from: f  reason: collision with root package name */
    public Rect f17317f;

    public o(byte[] bArr, int i10, int i11, int i12, int i13) {
        this.f17312a = bArr;
        this.f17313b = i10;
        this.f17314c = i11;
        this.f17316e = i13;
        this.f17315d = i12;
        if (i10 * i11 > bArr.length) {
            StringBuilder u10 = b0.u("Image data does not match the resolution. ", i10, "x", i11, " > ");
            u10.append(bArr.length);
            throw new IllegalArgumentException(u10.toString());
        }
    }
}
