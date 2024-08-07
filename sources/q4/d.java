package q4;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* compiled from: GifHeaderParser */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f14340a = new byte[256];

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f14341b;

    /* renamed from: c  reason: collision with root package name */
    public c f14342c;

    /* renamed from: d  reason: collision with root package name */
    public int f14343d = 0;

    public final boolean a() {
        if (this.f14342c.f14330b != 0) {
            return true;
        }
        return false;
    }

    public final c b() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (this.f14341b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (a()) {
            return this.f14342c;
        } else {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < 6; i10++) {
                sb2.append((char) c());
            }
            if (!sb2.toString().startsWith("GIF")) {
                this.f14342c.f14330b = 1;
            } else {
                this.f14342c.f14334f = f();
                this.f14342c.f14335g = f();
                int c10 = c();
                c cVar = this.f14342c;
                if ((c10 & 128) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                cVar.f14336h = z13;
                cVar.f14337i = (int) Math.pow(2.0d, (double) ((c10 & 7) + 1));
                this.f14342c.f14338j = c();
                c cVar2 = this.f14342c;
                c();
                cVar2.getClass();
                if (this.f14342c.f14336h && !a()) {
                    c cVar3 = this.f14342c;
                    cVar3.f14329a = e(cVar3.f14337i);
                    c cVar4 = this.f14342c;
                    cVar4.f14339k = cVar4.f14329a[cVar4.f14338j];
                }
            }
            if (!a()) {
                boolean z14 = false;
                while (!z14 && !a() && this.f14342c.f14331c <= Integer.MAX_VALUE) {
                    int c11 = c();
                    if (c11 == 33) {
                        int c12 = c();
                        if (c12 == 1) {
                            g();
                        } else if (c12 == 249) {
                            this.f14342c.f14332d = new b();
                            c();
                            int c13 = c();
                            b bVar = this.f14342c.f14332d;
                            int i11 = (c13 & 28) >> 2;
                            bVar.f14324g = i11;
                            if (i11 == 0) {
                                bVar.f14324g = 1;
                            }
                            if ((c13 & 1) != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            bVar.f14323f = z10;
                            int f10 = f();
                            if (f10 < 2) {
                                f10 = 10;
                            }
                            b bVar2 = this.f14342c.f14332d;
                            bVar2.f14326i = f10 * 10;
                            bVar2.f14325h = c();
                            c();
                        } else if (c12 == 254) {
                            g();
                        } else if (c12 != 255) {
                            g();
                        } else {
                            d();
                            StringBuilder sb3 = new StringBuilder();
                            for (int i12 = 0; i12 < 11; i12++) {
                                sb3.append((char) this.f14340a[i12]);
                            }
                            if (sb3.toString().equals("NETSCAPE2.0")) {
                                do {
                                    d();
                                    byte[] bArr = this.f14340a;
                                    if (bArr[0] == 1) {
                                        byte b10 = bArr[1];
                                        byte b11 = bArr[2];
                                        this.f14342c.getClass();
                                    }
                                    if (this.f14343d <= 0) {
                                        break;
                                    }
                                } while (a());
                            } else {
                                g();
                            }
                        }
                    } else if (c11 == 44) {
                        c cVar5 = this.f14342c;
                        if (cVar5.f14332d == null) {
                            cVar5.f14332d = new b();
                        }
                        this.f14342c.f14332d.f14318a = f();
                        this.f14342c.f14332d.f14319b = f();
                        this.f14342c.f14332d.f14320c = f();
                        this.f14342c.f14332d.f14321d = f();
                        int c14 = c();
                        if ((c14 & 128) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        int pow = (int) Math.pow(2.0d, (double) ((c14 & 7) + 1));
                        b bVar3 = this.f14342c.f14332d;
                        if ((c14 & 64) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        bVar3.f14322e = z12;
                        if (z11) {
                            bVar3.f14328k = e(pow);
                        } else {
                            bVar3.f14328k = null;
                        }
                        this.f14342c.f14332d.f14327j = this.f14341b.position();
                        c();
                        g();
                        if (!a()) {
                            c cVar6 = this.f14342c;
                            cVar6.f14331c++;
                            cVar6.f14333e.add(cVar6.f14332d);
                        }
                    } else if (c11 != 59) {
                        this.f14342c.f14330b = 1;
                    } else {
                        z14 = true;
                    }
                }
                c cVar7 = this.f14342c;
                if (cVar7.f14331c < 0) {
                    cVar7.f14330b = 1;
                }
            }
            return this.f14342c;
        }
    }

    public final int c() {
        try {
            return this.f14341b.get() & 255;
        } catch (Exception unused) {
            this.f14342c.f14330b = 1;
            return 0;
        }
    }

    public final void d() {
        int c10 = c();
        this.f14343d = c10;
        if (c10 > 0) {
            int i10 = 0;
            while (true) {
                try {
                    int i11 = this.f14343d;
                    if (i10 < i11) {
                        int i12 = i11 - i10;
                        this.f14341b.get(this.f14340a, i10, i12);
                        i10 += i12;
                    } else {
                        return;
                    }
                } catch (Exception unused) {
                    Log.isLoggable("GifHeaderParser", 3);
                    this.f14342c.f14330b = 1;
                    return;
                }
            }
        }
    }

    public final int[] e(int i10) {
        byte[] bArr = new byte[(i10 * 3)];
        int[] iArr = null;
        try {
            this.f14341b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = i12 + 1;
                int i14 = i13 + 1;
                int i15 = i14 + 1;
                int i16 = i11 + 1;
                iArr[i11] = ((bArr[i12] & 255) << 16) | -16777216 | ((bArr[i13] & 255) << 8) | (bArr[i14] & 255);
                i12 = i15;
                i11 = i16;
            }
        } catch (BufferUnderflowException unused) {
            Log.isLoggable("GifHeaderParser", 3);
            this.f14342c.f14330b = 1;
        }
        return iArr;
    }

    public final int f() {
        return this.f14341b.getShort();
    }

    public final void g() {
        int c10;
        do {
            c10 = c();
            this.f14341b.position(Math.min(this.f14341b.position() + c10, this.f14341b.limit()));
        } while (c10 > 0);
    }
}
