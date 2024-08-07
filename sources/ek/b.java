package ek;

import sk.j;

/* compiled from: KotlinVersion.kt */
public final class b implements Comparable<b> {

    /* renamed from: e  reason: collision with root package name */
    public static final b f20096e = new b();

    /* renamed from: a  reason: collision with root package name */
    public final int f20097a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final int f20098b = 9;

    /* renamed from: c  reason: collision with root package name */
    public final int f20099c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final int f20100d;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        if (r1 != false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b() {
        /*
            r5 = this;
            r5.<init>()
            r0 = 1
            r5.f20097a = r0
            r1 = 9
            r5.f20098b = r1
            r2 = 0
            r5.f20099c = r2
            vk.h r3 = new vk.h
            r4 = 255(0xff, float:3.57E-43)
            r3.<init>(r2, r4)
            int r3 = r3.f23336b
            if (r0 > r3) goto L_0x001a
            r3 = r0
            goto L_0x001b
        L_0x001a:
            r3 = r2
        L_0x001b:
            if (r3 == 0) goto L_0x003a
            vk.h r3 = new vk.h
            r3.<init>(r2, r4)
            int r3 = r3.f23336b
            if (r1 > r3) goto L_0x0028
            r1 = r0
            goto L_0x0029
        L_0x0028:
            r1 = r2
        L_0x0029:
            if (r1 == 0) goto L_0x003a
            vk.h r1 = new vk.h
            r1.<init>(r2, r4)
            int r1 = r1.f23336b
            if (r1 < 0) goto L_0x0036
            r1 = r0
            goto L_0x0037
        L_0x0036:
            r1 = r2
        L_0x0037:
            if (r1 == 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r0 = r2
        L_0x003b:
            if (r0 == 0) goto L_0x0043
            r0 = 67840(0x10900, float:9.5064E-41)
            r5.f20100d = r0
            return
        L_0x0043:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Version components are out of range: 1.9.0"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ek.b.<init>():void");
    }

    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        j.f(bVar, "other");
        return this.f20100d - bVar.f20100d;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            bVar = (b) obj;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            return false;
        }
        if (this.f20100d == bVar.f20100d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f20100d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f20097a);
        sb2.append('.');
        sb2.append(this.f20098b);
        sb2.append('.');
        sb2.append(this.f20099c);
        return sb2.toString();
    }
}
