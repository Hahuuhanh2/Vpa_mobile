package mj;

import fk.h;
import fk.p;
import fk.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import nc.b;
import rk.a;
import sk.j;
import sk.k;
import v.v;

/* compiled from: QRCodeAnalyzer.kt */
public final class c extends k implements a<nc.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f21549a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(0);
        this.f21549a = dVar;
    }

    public final Object invoke() {
        b.a aVar;
        Integer num;
        int i10;
        boolean z10;
        boolean z11;
        List list;
        int[] iArr = this.f21549a.f21550a;
        boolean z12 = true;
        if (iArr.length > 1) {
            aVar = new b.a();
            if (iArr.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int i11 = iArr[0];
                j.f(iArr, "<this>");
                int length = iArr.length - 1;
                if (length < 0) {
                    length = 0;
                }
                if (length >= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    if (length == 0) {
                        list = r.f20213a;
                    } else {
                        int length2 = iArr.length;
                        if (length >= length2) {
                            list = h.x0(iArr);
                        } else if (length == 1) {
                            list = j7.a.c0(Integer.valueOf(iArr[length2 - 1]));
                        } else {
                            ArrayList arrayList = new ArrayList(length);
                            for (int i12 = length2 - length; i12 < length2; i12++) {
                                arrayList.add(Integer.valueOf(iArr[i12]));
                            }
                            list = arrayList;
                        }
                    }
                    int[] Y0 = p.Y0(list);
                    int[] copyOf = Arrays.copyOf(Y0, Y0.length);
                    aVar.f13568a = i11;
                    if (copyOf != null) {
                        for (int i13 : copyOf) {
                            aVar.f13568a = i13 | aVar.f13568a;
                        }
                    }
                } else {
                    throw new IllegalArgumentException(v.d("Requested element count ", length, " is less than zero.").toString());
                }
            } else {
                throw new NoSuchElementException("Array is empty.");
            }
        } else {
            aVar = new b.a();
            if (iArr.length != 0) {
                z12 = false;
            }
            if (z12) {
                num = null;
            } else {
                num = Integer.valueOf(iArr[0]);
            }
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = -1;
            }
            aVar.f13568a = i10;
        }
        try {
            return m9.b.z(new b(aVar.f13568a));
        } catch (Exception e10) {
            this.f21549a.f21552c.invoke(e10);
            return null;
        }
    }
}
