package tc;

/* compiled from: FieldType */
public enum g {
    DOUBLE_LIST_PACKED(35, 3, r7),
    SINT64_LIST_PACKED(48, 3, r9);
    

    /* renamed from: d  reason: collision with root package name */
    public static final g[] f14990d = null;

    /* renamed from: a  reason: collision with root package name */
    public final int f14992a;

    /* access modifiers changed from: public */
    static {
        int i10;
        g[] values = values();
        f14990d = new g[values.length];
        for (g gVar : values) {
            f14990d[gVar.f14992a] = gVar;
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [int, java.lang.Object] */
    /* access modifiers changed from: public */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    g(int r3, java.lang.Object r4, tc.j r5) {
        /*
            r0 = this;
            r0.<init>(r1, r2)
            r0.f14992a = r3
            if (r4 == 0) goto L_0x001d
            int r1 = r4 + -1
            r2 = 1
            if (r1 == r2) goto L_0x0014
            r3 = 3
            if (r1 == r3) goto L_0x0010
            goto L_0x0017
        L_0x0010:
            r5.getClass()
            goto L_0x0017
        L_0x0014:
            r5.getClass()
        L_0x0017:
            if (r4 != r2) goto L_0x001c
            r5.ordinal()
        L_0x001c:
            return
        L_0x001d:
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tc.g.<init>(java.lang.String, int, int, int, tc.j):void");
    }

    public final int b() {
        return this.f14992a;
    }
}