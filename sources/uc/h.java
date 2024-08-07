package uc;

import java.util.EnumMap;
import java.util.Map;

/* compiled from: Result */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f15472a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f15473b;

    /* renamed from: c  reason: collision with root package name */
    public j[] f15474c;

    /* renamed from: d  reason: collision with root package name */
    public final a f15475d;

    /* renamed from: e  reason: collision with root package name */
    public Map<i, Object> f15476e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public h(String str, byte[] bArr, j[] jVarArr, a aVar) {
        this(str, bArr, jVarArr, aVar, 0);
        System.currentTimeMillis();
    }

    public final void a(Map<i, Object> map) {
        if (map != null) {
            Map<i, Object> map2 = this.f15476e;
            if (map2 == null) {
                this.f15476e = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public final void b(i iVar, Object obj) {
        if (this.f15476e == null) {
            this.f15476e = new EnumMap(i.class);
        }
        this.f15476e.put(iVar, obj);
    }

    public final String toString() {
        return this.f15472a;
    }

    public h(String str, byte[] bArr, j[] jVarArr, a aVar, int i10) {
        this.f15472a = str;
        this.f15473b = bArr;
        this.f15474c = jVarArr;
        this.f15475d = aVar;
        this.f15476e = null;
    }
}
