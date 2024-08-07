package hd;

import java.util.Arrays;

/* compiled from: DefaultPlacement */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f10738a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10739b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10740c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f10741d;

    public b(String str, int i10, int i11) {
        this.f10738a = str;
        this.f10740c = i10;
        this.f10739b = i11;
        byte[] bArr = new byte[(i10 * i11)];
        this.f10741d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        if (i10 < 0) {
            int i14 = this.f10739b;
            i10 += i14;
            i11 += 4 - ((i14 + 4) % 8);
        }
        if (i11 < 0) {
            int i15 = this.f10740c;
            i11 += i15;
            i10 += 4 - ((i15 + 4) % 8);
        }
        int i16 = 1;
        if ((this.f10738a.charAt(i12) & (1 << (8 - i13))) == 0) {
            i16 = 0;
        }
        this.f10741d[(i10 * this.f10740c) + i11] = (byte) i16;
    }

    public final void b(int i10, int i11, int i12) {
        int i13 = i10 - 2;
        int i14 = i11 - 2;
        a(i13, i14, i12, 1);
        int i15 = i11 - 1;
        a(i13, i15, i12, 2);
        int i16 = i10 - 1;
        a(i16, i14, i12, 3);
        a(i16, i15, i12, 4);
        a(i16, i11, i12, 5);
        a(i10, i14, i12, 6);
        a(i10, i15, i12, 7);
        a(i10, i11, i12, 8);
    }
}
