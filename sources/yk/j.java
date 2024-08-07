package yk;

import ek.e;
import java.util.List;
import rk.p;
import sk.k;

/* compiled from: Strings.kt */
public final class j extends k implements p<CharSequence, Integer, e<? extends Integer, ? extends Integer>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List<String> f23599a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f23600b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(List<String> list, boolean z10) {
        super(2);
        this.f23599a = list;
        this.f23600b = z10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r14, java.lang.Object r15) {
        /*
            r13 = this;
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            java.lang.String r0 = "$this$$receiver"
            sk.j.f(r14, r0)
            java.util.List<java.lang.String> r6 = r13.f23599a
            boolean r7 = r13.f23600b
            r0 = 0
            r8 = 0
            if (r7 != 0) goto L_0x004e
            int r1 = r6.size()
            r2 = 1
            if (r1 != r2) goto L_0x004e
            int r1 = r6.size()
            if (r1 == 0) goto L_0x0046
            if (r1 != r2) goto L_0x003e
            java.lang.Object r1 = r6.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 4
            int r14 = yk.l.S0(r14, r1, r15, r0, r2)
            if (r14 >= 0) goto L_0x0033
            goto L_0x00de
        L_0x0033:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            ek.e r15 = new ek.e
            r15.<init>(r14, r1)
            goto L_0x00df
        L_0x003e:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r15 = "List has more than one element."
            r14.<init>(r15)
            throw r14
        L_0x0046:
            java.util.NoSuchElementException r14 = new java.util.NoSuchElementException
            java.lang.String r15 = "List is empty."
            r14.<init>(r15)
            throw r14
        L_0x004e:
            vk.h r1 = new vk.h
            if (r15 >= 0) goto L_0x0053
            r15 = r0
        L_0x0053:
            int r0 = r14.length()
            r1.<init>(r15, r0)
            boolean r0 = r14 instanceof java.lang.String
            if (r0 == 0) goto L_0x009f
            int r9 = r1.f23336b
            int r10 = r1.f23337c
            if (r10 <= 0) goto L_0x0066
            if (r15 <= r9) goto L_0x006a
        L_0x0066:
            if (r10 >= 0) goto L_0x00de
            if (r9 > r15) goto L_0x00de
        L_0x006a:
            java.util.Iterator r11 = r6.iterator()
        L_0x006e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x008c
            java.lang.Object r12 = r11.next()
            r3 = r12
            java.lang.String r3 = (java.lang.String) r3
            r0 = 0
            r4 = r14
            java.lang.String r4 = (java.lang.String) r4
            int r2 = r3.length()
            r1 = r15
            r5 = r7
            boolean r0 = yk.h.I0(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x006e
            goto L_0x008d
        L_0x008c:
            r12 = r8
        L_0x008d:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x009b
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            ek.e r15 = new ek.e
            r15.<init>(r14, r12)
            goto L_0x00df
        L_0x009b:
            if (r15 == r9) goto L_0x00de
            int r15 = r15 + r10
            goto L_0x006a
        L_0x009f:
            int r9 = r1.f23336b
            int r10 = r1.f23337c
            if (r10 <= 0) goto L_0x00a7
            if (r15 <= r9) goto L_0x00ab
        L_0x00a7:
            if (r10 >= 0) goto L_0x00de
            if (r9 > r15) goto L_0x00de
        L_0x00ab:
            java.util.Iterator r11 = r6.iterator()
        L_0x00af:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00cb
            java.lang.Object r12 = r11.next()
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            int r4 = r0.length()
            r2 = r14
            r3 = r15
            r5 = r7
            boolean r0 = yk.l.a1(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00af
            goto L_0x00cc
        L_0x00cb:
            r12 = r8
        L_0x00cc:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x00da
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            ek.e r15 = new ek.e
            r15.<init>(r14, r12)
            goto L_0x00df
        L_0x00da:
            if (r15 == r9) goto L_0x00de
            int r15 = r15 + r10
            goto L_0x00ab
        L_0x00de:
            r15 = r8
        L_0x00df:
            if (r15 == 0) goto L_0x00f4
            A r14 = r15.f20102a
            B r15 = r15.f20103b
            java.lang.String r15 = (java.lang.String) r15
            int r15 = r15.length()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            ek.e r8 = new ek.e
            r8.<init>(r14, r15)
        L_0x00f4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.j.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
