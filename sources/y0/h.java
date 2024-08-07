package y0;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import bc.u;
import cd.b;
import com.google.android.gms.common.R$string;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.gson.JsonIOException;
import com.google.zxing.NotFoundException;
import fk.p;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import ll.i;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import p3.w;
import t6.t;
import uc.j;
import uc.k;
import ul.f;
import vd.c;
import x3.l;
import yk.a;

/* compiled from: SnapshotWeakSet.kt */
public class h implements Continuation, f {

    /* renamed from: a  reason: collision with root package name */
    public Object f17386a;

    /* renamed from: b  reason: collision with root package name */
    public Object f17387b;

    public /* synthetic */ h(Object obj, Object obj2) {
        this.f17386a = obj;
        this.f17387b = obj2;
    }

    public static j g(j jVar, float f10, float f11) {
        float f12;
        float f13;
        float f14 = jVar.f15488a;
        float f15 = jVar.f15489b;
        if (f14 < f10) {
            f12 = f14 - 1.0f;
        } else {
            f12 = f14 + 1.0f;
        }
        if (f15 < f11) {
            f13 = f15 - 1.0f;
        } else {
            f13 = f15 + 1.0f;
        }
        return new j(f12, f13);
    }

    public static j j(j jVar, j jVar2, int i10) {
        float f10 = jVar2.f15488a;
        float f11 = jVar.f15488a;
        float f12 = (float) (i10 + 1);
        float f13 = jVar2.f15489b;
        float f14 = jVar.f15489b;
        return new j(f11 + ((f10 - f11) / f12), f14 + ((f13 - f14) / f12));
    }

    public final Object a(Object obj) {
        Charset charset;
        ResponseBody responseBody = (ResponseBody) obj;
        bc.h hVar = (bc.h) this.f17386a;
        ResponseBody.BomAwareReader bomAwareReader = responseBody.f22152a;
        if (bomAwareReader == null) {
            i i10 = responseBody.i();
            MediaType h10 = responseBody.h();
            if (h10 == null || (charset = h10.a(a.f23582b)) == null) {
                charset = a.f23582b;
            }
            bomAwareReader = new ResponseBody.BomAwareReader(i10, charset);
            responseBody.f22152a = bomAwareReader;
        }
        hVar.getClass();
        hc.a aVar = new hc.a(bomAwareReader);
        aVar.f10712b = hVar.f4154k;
        try {
            Object a10 = ((u) this.f17387b).a(aVar);
            if (aVar.k0() == 10) {
                return a10;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }

    public final float b(c cVar, c cVar2) {
        float l10 = l((int) cVar.f15488a, (int) cVar.f15489b, (int) cVar2.f15488a, (int) cVar2.f15489b);
        float l11 = l((int) cVar2.f15488a, (int) cVar2.f15489b, (int) cVar.f15488a, (int) cVar.f15489b);
        if (Float.isNaN(l10)) {
            return l11 / 7.0f;
        }
        if (Float.isNaN(l11)) {
            return l10 / 7.0f;
        }
        return (l10 + l11) / 14.0f;
    }

    public final boolean c(l lVar) {
        boolean containsKey;
        synchronized (this.f17386a) {
            containsKey = ((Map) this.f17387b).containsKey(lVar);
        }
        return containsKey;
    }

    public final vd.a d(float f10, float f11, int i10, int i11) {
        int i12;
        vd.a b10;
        vd.a b11;
        int i13 = (int) (f11 * f10);
        int max = Math.max(0, i10 - i13);
        int min = Math.min(((b) this.f17386a).f4689a - 1, i10 + i13) - max;
        float f12 = 3.0f * f10;
        if (((float) min) >= f12) {
            int max2 = Math.max(0, i11 - i13);
            int min2 = Math.min(((b) this.f17386a).f4690b - 1, i11 + i13) - max2;
            if (((float) min2) >= f12) {
                vd.b bVar = new vd.b((b) this.f17386a, max, max2, min, min2, f10, (k) this.f17387b);
                int i14 = bVar.f16172c;
                int i15 = bVar.f16175f;
                int i16 = bVar.f16174e + i14;
                int i17 = (i15 / 2) + bVar.f16173d;
                int[] iArr = new int[3];
                for (int i18 = 0; i18 < i15; i18++) {
                    if ((i18 & 1) == 0) {
                        i12 = (i18 + 1) / 2;
                    } else {
                        i12 = -((i18 + 1) / 2);
                    }
                    int i19 = i12 + i17;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    iArr[2] = 0;
                    int i20 = i14;
                    while (i20 < i16 && !bVar.f16170a.b(i20, i19)) {
                        i20++;
                    }
                    int i21 = 0;
                    while (i20 < i16) {
                        if (!bVar.f16170a.b(i20, i19)) {
                            if (i21 == 1) {
                                i21++;
                            }
                            iArr[i21] = iArr[i21] + 1;
                        } else if (i21 == 1) {
                            iArr[1] = iArr[1] + 1;
                        } else if (i21 != 2) {
                            i21++;
                            iArr[i21] = iArr[i21] + 1;
                        } else if (bVar.a(iArr) && (b11 = bVar.b(i19, i20, iArr)) != null) {
                            return b11;
                        } else {
                            iArr[0] = iArr[2];
                            iArr[1] = 1;
                            iArr[2] = 0;
                            i21 = 1;
                        }
                        i20++;
                    }
                    if (bVar.a(iArr) && (b10 = bVar.b(i19, i16, iArr)) != null) {
                        return b10;
                    }
                }
                if (!bVar.f16171b.isEmpty()) {
                    return (vd.a) bVar.f16171b.get(0);
                }
                throw NotFoundException.f7967c;
            }
            throw NotFoundException.f7967c;
        }
        throw NotFoundException.f7967c;
    }

    public final String e(String str) {
        int identifier = ((Resources) this.f17386a).getIdentifier(str, "string", (String) this.f17387b);
        if (identifier == 0) {
            return null;
        }
        return ((Resources) this.f17386a).getString(identifier);
    }

    public final boolean f(j jVar) {
        float f10 = jVar.f15488a;
        if (f10 < 0.0f) {
            return false;
        }
        b bVar = (b) this.f17386a;
        if (f10 >= ((float) bVar.f4689a)) {
            return false;
        }
        float f11 = jVar.f15489b;
        if (f11 <= 0.0f || f11 >= ((float) bVar.f4690b)) {
            return false;
        }
        return true;
    }

    public final List h(String str) {
        List Z0;
        sk.j.f(str, "workSpecId");
        synchronized (this.f17386a) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) this.f17387b).entrySet()) {
                if (sk.j.a(((l) entry.getKey()).f17010a, str)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (l remove : linkedHashMap.keySet()) {
                ((Map) this.f17387b).remove(remove);
            }
            Z0 = p.Z0(linkedHashMap.values());
        }
        return Z0;
    }

    public final w i(l lVar) {
        w wVar;
        sk.j.f(lVar, "id");
        synchronized (this.f17386a) {
            wVar = (w) ((Map) this.f17387b).remove(lVar);
        }
        return wVar;
    }

    public final float k(int i10, int i11, int i12, int i13) {
        boolean z10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z11;
        h hVar;
        boolean z12 = true;
        if (Math.abs(i13 - i11) > Math.abs(i12 - i10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i16 = i10;
            i17 = i11;
            i14 = i12;
            i15 = i13;
        } else {
            i17 = i10;
            i16 = i11;
            i15 = i12;
            i14 = i13;
        }
        int abs = Math.abs(i15 - i17);
        int i24 = i14 - i16;
        int abs2 = Math.abs(i24);
        int i25 = 2;
        int i26 = (-abs) / 2;
        int i27 = -1;
        if (i17 < i15) {
            i18 = 1;
        } else {
            i18 = -1;
        }
        if (i16 < i14) {
            i27 = 1;
        }
        int i28 = i15 + i18;
        int i29 = i17;
        int i30 = i16;
        int i31 = 0;
        while (true) {
            if (i29 == i28) {
                i19 = i28;
                i20 = i24;
                i21 = i25;
                break;
            }
            if (z10) {
                i22 = i30;
            } else {
                i22 = i29;
            }
            boolean z13 = z10;
            if (z10) {
                i23 = i29;
            } else {
                i23 = i30;
            }
            if (i31 == z12) {
                i19 = i28;
                i20 = i24;
                z11 = z12;
                hVar = this;
            } else {
                hVar = this;
                i19 = i28;
                i20 = i24;
                z11 = false;
            }
            if (z11 == ((b) hVar.f17386a).b(i22, i23)) {
                if (i31 == 2) {
                    double d10 = (double) (i29 - i17);
                    double d11 = (double) (i30 - i16);
                    return (float) Math.sqrt((d11 * d11) + (d10 * d10));
                }
                i31++;
            }
            i26 += abs2;
            if (i26 > 0) {
                if (i30 == i14) {
                    i21 = 2;
                    break;
                }
                i30 += i27;
                i26 -= abs;
            }
            i29 += i18;
            i24 = i20;
            i28 = i19;
            z10 = z13;
            z12 = true;
            i25 = 2;
        }
        if (i31 != i21) {
            return Float.NaN;
        }
        double d12 = (double) (i19 - i17);
        double d13 = (double) i20;
        return (float) Math.sqrt((d13 * d13) + (d12 * d12));
    }

    public final float l(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float k10 = k(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        int i15 = 0;
        if (i14 < 0) {
            f10 = ((float) i10) / ((float) (i10 - i14));
            i14 = 0;
        } else {
            Object obj = this.f17386a;
            if (i14 >= ((b) obj).f4689a) {
                int i16 = ((b) obj).f4689a - 1;
                f10 = ((float) ((((b) obj).f4689a - 1) - i10)) / ((float) (i14 - i10));
                i14 = i16;
            } else {
                f10 = 1.0f;
            }
        }
        float f12 = (float) i11;
        int i17 = (int) (f12 - (((float) (i13 - i11)) * f10));
        if (i17 < 0) {
            f11 = f12 / ((float) (i11 - i17));
        } else {
            Object obj2 = this.f17386a;
            if (i17 >= ((b) obj2).f4690b) {
                f11 = ((float) ((((b) obj2).f4690b - 1) - i11)) / ((float) (i17 - i11));
                i15 = ((b) obj2).f4690b - 1;
            } else {
                i15 = i17;
                f11 = 1.0f;
            }
        }
        return (k(i10, i11, (int) ((((float) (i14 - i10)) * f11) + ((float) i10)), i15) + k10) - 1.0f;
    }

    public final w m(l lVar) {
        w wVar;
        synchronized (this.f17386a) {
            Map map = (Map) this.f17387b;
            Object obj = map.get(lVar);
            if (obj == null) {
                obj = new w(lVar);
                map.put(lVar, obj);
            }
            wVar = (w) obj;
        }
        return wVar;
    }

    public final int n(j jVar, j jVar2) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        j jVar3 = jVar;
        j jVar4 = jVar2;
        int i15 = (int) jVar3.f15488a;
        int i16 = (int) jVar3.f15489b;
        int i17 = (int) jVar4.f15488a;
        int i18 = (int) jVar4.f15489b;
        int i19 = 0;
        int i20 = 1;
        if (Math.abs(i18 - i16) > Math.abs(i17 - i15)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i21 = i15;
            i15 = i16;
            i16 = i21;
            int i22 = i17;
            i17 = i18;
            i18 = i22;
        }
        int abs = Math.abs(i17 - i15);
        int abs2 = Math.abs(i18 - i16);
        int i23 = (-abs) / 2;
        if (i16 < i18) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        if (i15 >= i17) {
            i20 = -1;
        }
        b bVar = (b) this.f17386a;
        if (z10) {
            i11 = i16;
        } else {
            i11 = i15;
        }
        if (z10) {
            i12 = i15;
        } else {
            i12 = i16;
        }
        boolean b10 = bVar.b(i11, i12);
        while (i15 != i17) {
            b bVar2 = (b) this.f17386a;
            if (z10) {
                i13 = i16;
            } else {
                i13 = i15;
            }
            if (z10) {
                i14 = i15;
            } else {
                i14 = i16;
            }
            boolean b11 = bVar2.b(i13, i14);
            if (b11 != b10) {
                i19++;
                b10 = b11;
            }
            i23 += abs2;
            if (i23 > 0) {
                if (i16 == i18) {
                    break;
                }
                i16 += i10;
                i23 -= abs;
            }
            i15 += i20;
        }
        return i19;
    }

    public final Object then(Task task) {
        boolean z10;
        t6.a aVar = (t6.a) this.f17386a;
        Bundle bundle = (Bundle) this.f17387b;
        aVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        if (bundle2 == null || !bundle2.containsKey("google.messenger")) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return task;
        }
        return aVar.a(bundle).onSuccessTask(t.f14884a, j7.a.f11718z);
    }

    public /* synthetic */ h(Context context) {
        y6.j.f(context);
        Resources resources = context.getResources();
        this.f17386a = resources;
        this.f17387b = resources.getResourcePackageName(R$string.common_google_play_services_unknown_issue);
    }

    public h(int i10) {
        if (i10 == 1) {
            this.f17386a = new Object();
            this.f17387b = new LinkedHashMap();
        } else if (i10 != 2) {
            this.f17386a = new int[16];
            this.f17387b = new w0.j[16];
        } else {
            this.f17386a = new AtomicReference();
            this.f17387b = new v0.b();
        }
    }

    public h(b bVar, int i10) {
        if (i10 != 7) {
            this.f17386a = bVar;
            this.f17387b = new dd.a(bVar);
            return;
        }
        this.f17386a = bVar;
    }
}
