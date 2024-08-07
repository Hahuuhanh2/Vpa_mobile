package lc;

import com.google.zxing.ChecksumException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import ed.a;
import java.lang.reflect.Field;
import java.util.HashMap;
import y.c0;
import y.k;
import z.d;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12906a;

    /* renamed from: b  reason: collision with root package name */
    public Object f12907b;

    public b() {
        throw null;
    }

    public /* synthetic */ b(int i10, int i11) {
        this.f12906a = i10;
    }

    public final void a(byte[] bArr, int i10, int i11, int i12, int i13) {
        int i14;
        int i15 = i11 + i12;
        if (i13 == 0) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        int[] iArr = new int[(i15 / i14)];
        for (int i16 = 0; i16 < i15; i16++) {
            if (i13 == 0 || i16 % 2 == i13 - 1) {
                iArr[i16 / i14] = bArr[i16 + i10] & 255;
            }
        }
        try {
            ((d) this.f12907b).d(iArr, i12 / i14);
            for (int i17 = 0; i17 < i11; i17++) {
                if (i13 == 0 || i17 % 2 == i13 - 1) {
                    bArr[i17 + i10] = (byte) iArr[i17 / i14];
                }
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.a();
        }
    }

    public final float b(String str, Object obj) {
        HashMap hashMap;
        float[] fArr;
        if (((HashMap) this.f12907b).containsKey(obj) && (hashMap = (HashMap) ((HashMap) this.f12907b).get(obj)) != null && hashMap.containsKey(str) && (fArr = (float[]) hashMap.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }

    public final String toString() {
        switch (this.f12906a) {
            case 7:
                return ((Field) this.f12907b).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b(Object obj, int i10) {
        this.f12906a = i10;
        this.f12907b = obj;
    }

    public b(int i10) {
        this.f12906a = i10;
        if (i10 == 2) {
            this.f12907b = new HashMap();
        } else if (i10 != 8) {
            this.f12907b = (c0) k.a(c0.class);
        } else {
            this.f12907b = new d((Object) a.f9346o);
        }
    }
}
