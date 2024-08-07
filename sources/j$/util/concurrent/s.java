package j$.util.concurrent;

final class s extends m {

    /* renamed from: e  reason: collision with root package name */
    s f18450e;

    /* renamed from: f  reason: collision with root package name */
    s f18451f;

    /* renamed from: g  reason: collision with root package name */
    s f18452g;

    /* renamed from: h  reason: collision with root package name */
    s f18453h;

    /* renamed from: i  reason: collision with root package name */
    boolean f18454i;

    s(int i10, Object obj, Object obj2, s sVar, s sVar2) {
        super(i10, obj, obj2, sVar);
        this.f18450e = sVar2;
    }

    /* access modifiers changed from: package-private */
    public final m a(int i10, Object obj) {
        return b(i10, obj, (Class) null);
    }

    /* access modifiers changed from: package-private */
    public final s b(int i10, Object obj, Class cls) {
        int d10;
        if (obj == null) {
            return null;
        }
        s sVar = this;
        do {
            s sVar2 = sVar.f18451f;
            s sVar3 = sVar.f18452g;
            int i11 = sVar.f18429a;
            if (i11 <= i10) {
                if (i11 >= i10) {
                    Object obj2 = sVar.f18430b;
                    if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                        return sVar;
                    }
                    if (sVar2 != null) {
                        if (sVar3 != null) {
                            if ((cls == null && (cls = ConcurrentHashMap.c(obj)) == null) || (d10 = ConcurrentHashMap.d(cls, obj, obj2)) == 0) {
                                s b10 = sVar3.b(i10, obj, cls);
                                if (b10 != null) {
                                    return b10;
                                }
                            } else if (d10 >= 0) {
                                sVar2 = sVar3;
                            }
                        }
                    }
                }
                sVar = sVar3;
                continue;
            }
            sVar = sVar2;
            continue;
        } while (sVar != null);
        return null;
    }
}
