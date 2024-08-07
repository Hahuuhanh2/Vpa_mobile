package hd;

import java.nio.charset.StandardCharsets;
import p3.l0;

/* compiled from: EncoderContext */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f10742a;

    /* renamed from: b  reason: collision with root package name */
    public g f10743b;

    /* renamed from: c  reason: collision with root package name */
    public final StringBuilder f10744c;

    /* renamed from: d  reason: collision with root package name */
    public int f10745d;

    /* renamed from: e  reason: collision with root package name */
    public int f10746e;

    /* renamed from: f  reason: collision with root package name */
    public f f10747f;

    /* renamed from: g  reason: collision with root package name */
    public int f10748g;

    public d(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb2 = new StringBuilder(bytes.length);
        int length = bytes.length;
        int i10 = 0;
        while (i10 < length) {
            char c10 = (char) (bytes[i10] & 255);
            if (c10 != '?' || str.charAt(i10) == '?') {
                sb2.append(c10);
                i10++;
            } else {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
        }
        this.f10742a = sb2.toString();
        this.f10743b = g.FORCE_NONE;
        this.f10744c = new StringBuilder(str.length());
        this.f10746e = -1;
    }

    public final int a() {
        return this.f10744c.length();
    }

    public final char b() {
        return this.f10742a.charAt(this.f10745d);
    }

    public final boolean c() {
        if (this.f10745d < this.f10742a.length() - this.f10748g) {
            return true;
        }
        return false;
    }

    public final void d(int i10) {
        f fVar = this.f10747f;
        if (fVar == null || i10 > fVar.f10755b) {
            this.f10747f = f.f(i10, this.f10743b, (l0) null, (l0) null);
        }
    }

    public final void e(char c10) {
        this.f10744c.append(c10);
    }
}
