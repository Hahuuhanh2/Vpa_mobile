package cd;

import java.util.HashMap;

/* compiled from: CharacterSetECI */
public enum d {
    ;
    

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap f4696c = null;

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap f4697d = null;

    /* renamed from: a  reason: collision with root package name */
    public final int[] f4699a;

    /* renamed from: b  reason: collision with root package name */
    public final String[] f4700b;

    /* access modifiers changed from: public */
    static {
        f4696c = new HashMap();
        f4697d = new HashMap();
        for (d dVar : values()) {
            for (int valueOf : dVar.f4699a) {
                f4696c.put(Integer.valueOf(valueOf), dVar);
            }
            f4697d.put(dVar.name(), dVar);
            for (String put : dVar.f4700b) {
                f4697d.put(put, dVar);
            }
        }
    }

    /* access modifiers changed from: public */
    d() {
        throw null;
    }

    /* access modifiers changed from: public */
    d(int i10, String... strArr) {
        this.f4699a = new int[]{i10};
        this.f4700b = strArr;
    }

    /* access modifiers changed from: public */
    d(int[] iArr, String... strArr) {
        this.f4699a = iArr;
        this.f4700b = strArr;
    }
}
