package j$.util.concurrent;

import java.util.Map;

class m implements Map.Entry {

    /* renamed from: a  reason: collision with root package name */
    final int f18429a;

    /* renamed from: b  reason: collision with root package name */
    final Object f18430b;

    /* renamed from: c  reason: collision with root package name */
    volatile Object f18431c;

    /* renamed from: d  reason: collision with root package name */
    volatile m f18432d;

    m(int i10, Object obj, Object obj2, m mVar) {
        this.f18429a = i10;
        this.f18430b = obj;
        this.f18431c = obj2;
        this.f18432d = mVar;
    }

    /* access modifiers changed from: package-private */
    public m a(int i10, Object obj) {
        Object obj2;
        if (obj == null) {
            return null;
        }
        m mVar = this;
        do {
            if (mVar.f18429a == i10 && ((obj2 = mVar.f18430b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return mVar;
            }
            mVar = mVar.f18432d;
        } while (mVar != null);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r0 = r2.f18431c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = (java.util.Map.Entry) r3;
        r0 = r3.getKey();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r3 = r3.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r1 = r2.f18430b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof java.util.Map.Entry
            if (r0 == 0) goto L_0x0028
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r3 = r3.getValue()
            if (r3 == 0) goto L_0x0028
            java.lang.Object r1 = r2.f18430b
            if (r0 == r1) goto L_0x001c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0028
        L_0x001c:
            java.lang.Object r0 = r2.f18431c
            if (r3 == r0) goto L_0x0026
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0028
        L_0x0026:
            r3 = 1
            goto L_0x0029
        L_0x0028:
            r3 = 0
        L_0x0029:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.m.equals(java.lang.Object):boolean");
    }

    public final Object getKey() {
        return this.f18430b;
    }

    public final Object getValue() {
        return this.f18431c;
    }

    public final int hashCode() {
        return this.f18430b.hashCode() ^ this.f18431c.hashCode();
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return this.f18430b + "=" + this.f18431c;
    }
}
