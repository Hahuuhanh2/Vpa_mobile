package g0;

import al.g0;
import android.support.v4.media.a;
import g0.g;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ExifOutputStream */
public final class i extends FilterOutputStream {

    /* renamed from: n  reason: collision with root package name */
    public static final byte[] f10249n = "Exif\u0000\u0000".getBytes(f.f10229d);

    /* renamed from: a  reason: collision with root package name */
    public final g f10250a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f10251b = new byte[1];

    /* renamed from: c  reason: collision with root package name */
    public final ByteBuffer f10252c = ByteBuffer.allocate(4);

    /* renamed from: d  reason: collision with root package name */
    public int f10253d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f10254e;

    /* renamed from: f  reason: collision with root package name */
    public int f10255f;

    public i(ByteArrayOutputStream byteArrayOutputStream, g gVar) {
        super(new BufferedOutputStream(byteArrayOutputStream, 65536));
        this.f10250a = gVar;
    }

    public final void write(byte[] bArr, int i10, int i11) {
        while (true) {
            int i12 = this.f10254e;
            if ((i12 > 0 || this.f10255f > 0 || this.f10253d != 2) && i11 > 0) {
                if (i12 > 0) {
                    int min = Math.min(i11, i12);
                    i11 -= min;
                    this.f10254e -= min;
                    i10 += min;
                }
                int i13 = this.f10255f;
                if (i13 > 0) {
                    int min2 = Math.min(i11, i13);
                    this.out.write(bArr, i10, min2);
                    i11 -= min2;
                    this.f10255f -= min2;
                    i10 += min2;
                }
                if (i11 != 0) {
                    int i14 = this.f10253d;
                    boolean z10 = true;
                    int i15 = 4;
                    if (i14 == 0) {
                        int min3 = Math.min(i11, 2 - this.f10252c.position());
                        this.f10252c.put(bArr, i10, min3);
                        i10 += min3;
                        i11 -= min3;
                        if (this.f10252c.position() >= 2) {
                            this.f10252c.rewind();
                            if (this.f10252c.getShort() == -40) {
                                this.out.write(this.f10252c.array(), 0, 2);
                                this.f10253d = 1;
                                this.f10252c.rewind();
                                b bVar = new b(this.out, ByteOrder.BIG_ENDIAN);
                                bVar.h(-31);
                                int[] iArr = new int[4];
                                int[] iArr2 = new int[4];
                                j[] jVarArr = g.f10235c;
                                int i16 = 0;
                                while (i16 < i15) {
                                    j jVar = jVarArr[i16];
                                    int i17 = 0;
                                    while (true) {
                                        j[] jVarArr2 = g.f10235c;
                                        if (i17 >= i15) {
                                            break;
                                        }
                                        this.f10250a.a(i17).remove(jVar.f10257b);
                                        i17++;
                                        i15 = 4;
                                    }
                                    i16++;
                                    i15 = 4;
                                }
                                if (!this.f10250a.a(1).isEmpty()) {
                                    this.f10250a.a(0).put(g.f10235c[1].f10257b, f.a(0, this.f10250a.f10239b));
                                }
                                if (!this.f10250a.a(2).isEmpty()) {
                                    this.f10250a.a(0).put(g.f10235c[2].f10257b, f.a(0, this.f10250a.f10239b));
                                }
                                if (!this.f10250a.a(3).isEmpty()) {
                                    this.f10250a.a(1).put(g.f10235c[3].f10257b, f.a(0, this.f10250a.f10239b));
                                }
                                int i18 = 0;
                                while (true) {
                                    j[] jVarArr3 = g.f10235c;
                                    if (i18 >= 4) {
                                        break;
                                    }
                                    int i19 = 0;
                                    for (Map.Entry<String, f> value : this.f10250a.a(i18).entrySet()) {
                                        f fVar = (f) value.getValue();
                                        int i20 = f.f10231f[fVar.f10232a] * fVar.f10233b;
                                        if (i20 > 4) {
                                            i19 += i20;
                                        }
                                    }
                                    iArr2[i18] = iArr2[i18] + i19;
                                    i18++;
                                }
                                int i21 = 8;
                                int i22 = 0;
                                while (true) {
                                    j[] jVarArr4 = g.f10235c;
                                    if (i22 >= 4) {
                                        break;
                                    }
                                    if (!this.f10250a.a(i22).isEmpty()) {
                                        iArr[i22] = i21;
                                        i21 = (this.f10250a.a(i22).size() * 12) + 2 + 4 + iArr2[i22] + i21;
                                    }
                                    i22++;
                                }
                                int i23 = i21 + 8;
                                if (!this.f10250a.a(1).isEmpty()) {
                                    this.f10250a.a(0).put(g.f10235c[1].f10257b, f.a((long) iArr[1], this.f10250a.f10239b));
                                }
                                if (!this.f10250a.a(2).isEmpty()) {
                                    this.f10250a.a(0).put(g.f10235c[2].f10257b, f.a((long) iArr[2], this.f10250a.f10239b));
                                }
                                if (!this.f10250a.a(3).isEmpty()) {
                                    this.f10250a.a(1).put(g.f10235c[3].f10257b, f.a((long) iArr[3], this.f10250a.f10239b));
                                }
                                bVar.h((short) i23);
                                bVar.write(f10249n);
                                bVar.h(this.f10250a.f10239b == ByteOrder.BIG_ENDIAN ? (short) 19789 : 18761);
                                bVar.f10221b = this.f10250a.f10239b;
                                bVar.h((short) 42);
                                bVar.d((int) 8);
                                int i24 = 0;
                                while (true) {
                                    j[] jVarArr5 = g.f10235c;
                                    if (i24 >= 4) {
                                        break;
                                    }
                                    if (!this.f10250a.a(i24).isEmpty()) {
                                        bVar.h((short) this.f10250a.a(i24).size());
                                        int size = (this.f10250a.a(i24).size() * 12) + iArr[i24] + 2 + 4;
                                        for (Map.Entry next : this.f10250a.a(i24).entrySet()) {
                                            j jVar2 = (j) ((HashMap) g.a.f10243f.get(i24)).get(next.getKey());
                                            StringBuilder q10 = a.q("Tag not supported: ");
                                            q10.append((String) next.getKey());
                                            q10.append(". Tag needs to be ported from ExifInterface to ExifData.");
                                            g0.D(jVar2, q10.toString());
                                            int i25 = jVar2.f10256a;
                                            f fVar2 = (f) next.getValue();
                                            int i26 = f.f10231f[fVar2.f10232a] * fVar2.f10233b;
                                            bVar.h((short) i25);
                                            bVar.h((short) fVar2.f10232a);
                                            bVar.d(fVar2.f10233b);
                                            if (i26 > 4) {
                                                bVar.d((int) ((long) size));
                                                size += i26;
                                            } else {
                                                bVar.write(fVar2.f10234c);
                                                if (i26 < 4) {
                                                    for (int i27 = 4; i26 < i27; i27 = 4) {
                                                        bVar.f10220a.write(0);
                                                        i26++;
                                                    }
                                                }
                                            }
                                        }
                                        bVar.d((int) 0);
                                        for (Map.Entry<String, f> value2 : this.f10250a.a(i24).entrySet()) {
                                            byte[] bArr2 = ((f) value2.getValue()).f10234c;
                                            if (bArr2.length > 4) {
                                                bVar.write(bArr2, 0, bArr2.length);
                                            }
                                        }
                                    }
                                    i24++;
                                }
                                bVar.f10221b = ByteOrder.BIG_ENDIAN;
                            } else {
                                throw new IOException("Not a valid jpeg image, cannot write exif");
                            }
                        } else {
                            return;
                        }
                    } else if (i14 != 1) {
                        continue;
                    } else {
                        int min4 = Math.min(i11, 4 - this.f10252c.position());
                        this.f10252c.put(bArr, i10, min4);
                        i10 += min4;
                        i11 -= min4;
                        if (this.f10252c.position() == 2 && this.f10252c.getShort() == -39) {
                            this.out.write(this.f10252c.array(), 0, 2);
                            this.f10252c.rewind();
                        }
                        if (this.f10252c.position() >= 4) {
                            this.f10252c.rewind();
                            short s10 = this.f10252c.getShort();
                            if (s10 == -31) {
                                this.f10254e = (this.f10252c.getShort() & 65535) - 2;
                                this.f10253d = 2;
                            } else {
                                if (s10 < -64 || s10 > -49 || s10 == -60 || s10 == -56 || s10 == -52) {
                                    z10 = false;
                                }
                                if (!z10) {
                                    this.out.write(this.f10252c.array(), 0, 4);
                                    this.f10255f = (this.f10252c.getShort() & 65535) - 2;
                                } else {
                                    this.out.write(this.f10252c.array(), 0, 4);
                                    this.f10253d = 2;
                                }
                            }
                            this.f10252c.rewind();
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
        if (i11 > 0) {
            this.out.write(bArr, i10, i11);
        }
    }

    public final void write(int i10) {
        byte[] bArr = this.f10251b;
        bArr[0] = (byte) (i10 & 255);
        write(bArr);
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
