package i2;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.p;
import ek.i;
import f0.b0;
import f2.l;
import f2.p;
import h2.d;
import h2.e;
import h2.f;
import i2.e;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import sk.j;
import v.v;

/* compiled from: PreferencesSerializer.kt */
public final class g implements l<e> {

    /* renamed from: a  reason: collision with root package name */
    public static final g f11028a = new g();

    /* compiled from: PreferencesSerializer.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11029a;

        static {
            int[] iArr = new int[b0._values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[6] = 3;
            iArr[2] = 4;
            iArr[3] = 5;
            iArr[4] = 6;
            iArr[5] = 7;
            iArr[7] = 8;
            f11029a = iArr;
        }
    }

    public final a a() {
        return new a(true, 1);
    }

    public final a b(FileInputStream fileInputStream) {
        int i10;
        try {
            d t10 = d.t(fileInputStream);
            a aVar = new a(false, 1);
            e.b[] bVarArr = (e.b[]) Arrays.copyOf(new e.b[0], 0);
            j.f(bVarArr, "pairs");
            aVar.b();
            if (bVarArr.length <= 0) {
                Map<String, f> r10 = t10.r();
                j.e(r10, "preferencesProto.preferencesMap");
                for (Map.Entry next : r10.entrySet()) {
                    String str = (String) next.getKey();
                    f fVar = (f) next.getValue();
                    j.e(str, "name");
                    j.e(fVar, "value");
                    int F = fVar.F();
                    if (F == 0) {
                        i10 = -1;
                    } else {
                        i10 = a.f11029a[v.g(F)];
                    }
                    switch (i10) {
                        case -1:
                            throw new CorruptionException("Value case is null.");
                        case 1:
                            aVar.d(new e.a(str), Boolean.valueOf(fVar.x()));
                            break;
                        case 2:
                            aVar.d(new e.a(str), Float.valueOf(fVar.A()));
                            break;
                        case 3:
                            aVar.d(new e.a(str), Double.valueOf(fVar.z()));
                            break;
                        case 4:
                            aVar.d(new e.a(str), Integer.valueOf(fVar.B()));
                            break;
                        case 5:
                            aVar.d(new e.a(str), Long.valueOf(fVar.C()));
                            break;
                        case 6:
                            e.a aVar2 = new e.a(str);
                            String D = fVar.D();
                            j.e(D, "value.string");
                            aVar.d(aVar2, D);
                            break;
                        case 7:
                            e.a aVar3 = new e.a(str);
                            p.c s10 = fVar.E().s();
                            j.e(s10, "value.stringSet.stringsList");
                            aVar.d(aVar3, fk.p.d1(s10));
                            break;
                        case 8:
                            throw new CorruptionException("Value not set.");
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                return new a((Map<e.a<?>, Object>) new LinkedHashMap(aVar.a()), true);
            }
            bVarArr[0].getClass();
            aVar.d((e.a<?>) null, (Object) null);
            throw null;
        } catch (InvalidProtocolBufferException e10) {
            throw new CorruptionException(e10);
        }
    }

    public final i c(Object obj, p.b bVar) {
        n nVar;
        Map<e.a<?>, Object> a10 = ((e) obj).a();
        d.a s10 = d.s();
        for (Map.Entry next : a10.entrySet()) {
            Object value = next.getValue();
            String str = ((e.a) next.getKey()).f11024a;
            if (value instanceof Boolean) {
                f.a G = f.G();
                boolean booleanValue = ((Boolean) value).booleanValue();
                G.m();
                f.u((f) G.f2307b, booleanValue);
                nVar = G.k();
            } else if (value instanceof Float) {
                f.a G2 = f.G();
                float floatValue = ((Number) value).floatValue();
                G2.m();
                f.v((f) G2.f2307b, floatValue);
                nVar = G2.k();
            } else if (value instanceof Double) {
                f.a G3 = f.G();
                double doubleValue = ((Number) value).doubleValue();
                G3.m();
                f.s((f) G3.f2307b, doubleValue);
                nVar = G3.k();
            } else if (value instanceof Integer) {
                f.a G4 = f.G();
                int intValue = ((Number) value).intValue();
                G4.m();
                f.w((f) G4.f2307b, intValue);
                nVar = G4.k();
            } else if (value instanceof Long) {
                f.a G5 = f.G();
                long longValue = ((Number) value).longValue();
                G5.m();
                f.p((f) G5.f2307b, longValue);
                nVar = G5.k();
            } else if (value instanceof String) {
                f.a G6 = f.G();
                G6.m();
                f.q((f) G6.f2307b, (String) value);
                nVar = G6.k();
            } else if (value instanceof Set) {
                f.a G7 = f.G();
                e.a t10 = h2.e.t();
                t10.m();
                h2.e.q((h2.e) t10.f2307b, (Set) value);
                G7.m();
                f.r((f) G7.f2307b, t10);
                nVar = G7.k();
            } else {
                throw new IllegalStateException(j.k(value.getClass().getName(), "PreferencesSerializer does not support type: "));
            }
            s10.getClass();
            str.getClass();
            s10.m();
            d.q((d) s10.f2307b).put(str, (f) nVar);
        }
        d dVar = (d) s10.k();
        int c10 = dVar.c();
        Logger logger = CodedOutputStream.f2201c;
        if (c10 > 4096) {
            c10 = 4096;
        }
        CodedOutputStream.c cVar = new CodedOutputStream.c(bVar, c10);
        dVar.j(cVar);
        if (cVar.f2206n > 0) {
            cVar.I0();
        }
        return i.f20112a;
    }
}
