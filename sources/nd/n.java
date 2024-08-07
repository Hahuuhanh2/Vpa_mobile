package nd;

import com.google.zxing.FormatException;

/* compiled from: DecodedNumeric */
public final class n extends o {

    /* renamed from: b  reason: collision with root package name */
    public final int f13580b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13581c;

    public n(int i10, int i11, int i12) {
        super(i10);
        if (i11 < 0 || i11 > 10 || i12 < 0 || i12 > 10) {
            throw FormatException.a();
        }
        this.f13580b = i11;
        this.f13581c = i12;
    }
}
