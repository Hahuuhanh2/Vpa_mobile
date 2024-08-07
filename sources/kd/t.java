package kd;

import cd.a;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.EnumMap;
import uc.h;
import uc.i;
import uc.j;
import x2.g;

/* compiled from: UPCEANExtensionSupport */
public final class t {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f12503c = {1, 1, 2};

    /* renamed from: a  reason: collision with root package name */
    public final g f12504a = new g(8);

    /* renamed from: b  reason: collision with root package name */
    public final s f12505b = new s();

    public final h a(int i10, int i11, a aVar) {
        EnumMap enumMap;
        int i12 = i10;
        a aVar2 = aVar;
        int[] n10 = u.n(aVar2, i11, false, f12503c, new int[3]);
        try {
            return this.f12505b.a(i12, aVar2, n10);
        } catch (ReaderException unused) {
            g gVar = this.f12504a;
            StringBuilder sb2 = (StringBuilder) gVar.f16905c;
            sb2.setLength(0);
            int[] iArr = (int[]) gVar.f16904b;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            int i13 = aVar2.f4688b;
            int i14 = n10[1];
            int i15 = 0;
            for (int i16 = 0; i16 < 2 && i14 < i13; i16++) {
                int j10 = u.j(aVar2, iArr, i14, u.f12510h);
                sb2.append((char) ((j10 % 10) + 48));
                for (int i17 : iArr) {
                    i14 += i17;
                }
                if (j10 >= 10) {
                    i15 |= 1 << (1 - i16);
                }
                if (i16 != 1) {
                    i14 = aVar2.g(aVar2.f(i14));
                }
            }
            if (sb2.length() != 2) {
                throw NotFoundException.f7967c;
            } else if (Integer.parseInt(sb2.toString()) % 4 == i15) {
                String sb3 = sb2.toString();
                if (sb3.length() != 2) {
                    enumMap = null;
                } else {
                    enumMap = new EnumMap(i.class);
                    enumMap.put(i.ISSUE_NUMBER, Integer.valueOf(sb3));
                }
                float f10 = (float) i12;
                h hVar = new h(sb3, (byte[]) null, new j[]{new j(((float) (n10[0] + n10[1])) / 2.0f, f10), new j((float) i14, f10)}, uc.a.UPC_EAN_EXTENSION);
                if (enumMap != null) {
                    hVar.a(enumMap);
                }
                return hVar;
            } else {
                throw NotFoundException.f7967c;
            }
        }
    }
}
