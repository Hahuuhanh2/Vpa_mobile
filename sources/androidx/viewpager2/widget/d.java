package androidx.viewpager2.widget;

import androidx.recyclerview.widget.RecyclerView;
import cd.a;
import e4.k;
import i4.f;
import java.util.ArrayList;
import java.util.List;
import nd.m;
import nd.p;

/* compiled from: FakeDrag */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f3628a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3629b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f3630c;

    public d(List list) {
        this.f3630c = list;
        this.f3628a = new ArrayList(list.size());
        this.f3629b = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((List) this.f3628a).add(new k((List) ((f) list.get(i10)).f11102b.f10560b));
            ((List) this.f3629b).add(((f) list.get(i10)).f11103c.a());
        }
    }

    public static int d(int i10, int i11, a aVar) {
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            if (aVar.e(i10 + i13)) {
                i12 |= 1 << ((i11 - i13) - 1);
            }
        }
        return i12;
    }

    public final String a(int i10, StringBuilder sb2) {
        String str;
        String str2 = null;
        while (true) {
            m b10 = b(i10, str2);
            String a10 = p.a(b10.f13577b);
            if (a10 != null) {
                sb2.append(a10);
            }
            if (b10.f13579d) {
                str = String.valueOf(b10.f13578c);
            } else {
                str = null;
            }
            int i11 = b10.f13582a;
            if (i10 == i11) {
                return sb2.toString();
            }
            i10 = i11;
            str2 = str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:199:0x03ee, code lost:
        r2 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0410  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x03c5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final nd.m b(int r17, java.lang.String r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            java.lang.Object r2 = r0.f3630c
            java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
            r3 = 0
            r2.setLength(r3)
            if (r1 == 0) goto L_0x0015
            java.lang.Object r2 = r0.f3630c
            java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
            r2.append(r1)
        L_0x0015:
            java.lang.Object r1 = r0.f3629b
            nd.k r1 = (nd.k) r1
            r2 = r17
            r1.f13574a = r2
            r1 = 2
        L_0x001e:
            java.lang.Object r2 = r0.f3629b
            nd.k r2 = (nd.k) r2
            int r4 = r2.f13574a
            int r2 = r2.f13575b
            r5 = 1
            if (r2 != r1) goto L_0x002b
            r6 = r5
            goto L_0x002c
        L_0x002b:
            r6 = r3
        L_0x002c:
            r7 = 15
            r8 = 16
            r14 = 58
            r15 = 32
            r9 = 63
            r10 = 0
            r11 = 36
            r12 = 3
            r13 = 5
            if (r6 == 0) goto L_0x0152
        L_0x003d:
            java.lang.Object r2 = r0.f3629b
            nd.k r2 = (nd.k) r2
            int r2 = r2.f13574a
            int r6 = r2 + 5
            java.lang.Object r1 = r0.f3628a
            cd.a r1 = (cd.a) r1
            int r1 = r1.f4688b
            r3 = 6
            if (r6 <= r1) goto L_0x004f
            goto L_0x006d
        L_0x004f:
            int r1 = r0.c(r2, r13)
            if (r1 < r13) goto L_0x0058
            if (r1 >= r8) goto L_0x0058
            goto L_0x006b
        L_0x0058:
            int r1 = r2 + 6
            java.lang.Object r6 = r0.f3628a
            cd.a r6 = (cd.a) r6
            int r6 = r6.f4688b
            if (r1 <= r6) goto L_0x0063
            goto L_0x006d
        L_0x0063:
            int r1 = r0.c(r2, r3)
            if (r1 < r8) goto L_0x006d
            if (r1 >= r9) goto L_0x006d
        L_0x006b:
            r1 = r5
            goto L_0x006e
        L_0x006d:
            r1 = 0
        L_0x006e:
            if (r1 == 0) goto L_0x0105
            java.lang.Object r1 = r0.f3629b
            nd.k r1 = (nd.k) r1
            int r1 = r1.f13574a
            int r2 = r0.c(r1, r13)
            if (r2 != r7) goto L_0x0084
            nd.l r2 = new nd.l
            int r1 = r1 + 5
            r2.<init>(r11, r1)
            goto L_0x00d1
        L_0x0084:
            if (r2 < r13) goto L_0x0095
            if (r2 >= r7) goto L_0x0095
            nd.l r3 = new nd.l
            int r1 = r1 + 5
            int r2 = r2 + 48
            int r2 = r2 - r13
            char r2 = (char) r2
            r3.<init>(r2, r1)
        L_0x0093:
            r2 = r3
            goto L_0x00d1
        L_0x0095:
            int r2 = r0.c(r1, r3)
            if (r2 < r15) goto L_0x00a8
            if (r2 >= r14) goto L_0x00a8
            nd.l r3 = new nd.l
            int r1 = r1 + 6
            int r2 = r2 + 33
            char r2 = (char) r2
            r3.<init>(r2, r1)
            goto L_0x0093
        L_0x00a8:
            switch(r2) {
                case 58: goto L_0x00c7;
                case 59: goto L_0x00c4;
                case 60: goto L_0x00c1;
                case 61: goto L_0x00be;
                case 62: goto L_0x00bb;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "Decoding invalid alphanumeric value: "
            java.lang.String r2 = r3.concat(r2)
            r1.<init>(r2)
            throw r1
        L_0x00bb:
            r2 = 47
            goto L_0x00c9
        L_0x00be:
            r2 = 46
            goto L_0x00c9
        L_0x00c1:
            r2 = 45
            goto L_0x00c9
        L_0x00c4:
            r2 = 44
            goto L_0x00c9
        L_0x00c7:
            r2 = 42
        L_0x00c9:
            nd.l r3 = new nd.l
            int r1 = r1 + 6
            r3.<init>(r2, r1)
            goto L_0x0093
        L_0x00d1:
            java.lang.Object r1 = r0.f3629b
            r3 = r1
            nd.k r3 = (nd.k) r3
            int r6 = r2.f13582a
            r3.f13574a = r6
            char r2 = r2.f13576b
            if (r2 != r11) goto L_0x00e0
            r3 = r5
            goto L_0x00e1
        L_0x00e0:
            r3 = 0
        L_0x00e1:
            if (r3 == 0) goto L_0x00fa
            nd.m r2 = new nd.m
            nd.k r1 = (nd.k) r1
            int r1 = r1.f13574a
            java.lang.Object r3 = r0.f3630c
            java.lang.StringBuilder r3 = (java.lang.StringBuilder) r3
            java.lang.String r3 = r3.toString()
            r2.<init>(r1, r3)
            ia.e r1 = new ia.e
            r1.<init>(r2, r5)
            goto L_0x014e
        L_0x00fa:
            java.lang.Object r1 = r0.f3630c
            java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
            r1.append(r2)
            r1 = 2
            r3 = 0
            goto L_0x003d
        L_0x0105:
            java.lang.Object r1 = r0.f3629b
            nd.k r1 = (nd.k) r1
            int r1 = r1.f13574a
            boolean r1 = r0.e(r1)
            if (r1 == 0) goto L_0x0120
            java.lang.Object r1 = r0.f3629b
            r2 = r1
            nd.k r2 = (nd.k) r2
            int r3 = r2.f13574a
            int r3 = r3 + r12
            r2.f13574a = r3
            nd.k r1 = (nd.k) r1
            r1.f13575b = r5
            goto L_0x0148
        L_0x0120:
            java.lang.Object r1 = r0.f3629b
            nd.k r1 = (nd.k) r1
            int r1 = r1.f13574a
            boolean r1 = r0.f(r1)
            if (r1 == 0) goto L_0x0148
            java.lang.Object r1 = r0.f3629b
            r2 = r1
            nd.k r2 = (nd.k) r2
            int r3 = r2.f13574a
            int r6 = r3 + 5
            java.lang.Object r7 = r0.f3628a
            cd.a r7 = (cd.a) r7
            int r7 = r7.f4688b
            if (r6 >= r7) goto L_0x0142
            int r3 = r3 + 5
            r2.f13574a = r3
            goto L_0x0144
        L_0x0142:
            r2.f13574a = r7
        L_0x0144:
            nd.k r1 = (nd.k) r1
            r1.f13575b = r12
        L_0x0148:
            ia.e r1 = new ia.e
            r2 = 0
            r1.<init>(r10, r2)
        L_0x014e:
            boolean r2 = r1.f11287a
            goto L_0x02cb
        L_0x0152:
            if (r2 != r12) goto L_0x0156
            r1 = r5
            goto L_0x0157
        L_0x0156:
            r1 = 0
        L_0x0157:
            r2 = 7
            if (r1 == 0) goto L_0x02d0
        L_0x015a:
            java.lang.Object r1 = r0.f3629b
            nd.k r1 = (nd.k) r1
            int r1 = r1.f13574a
            int r3 = r1 + 5
            java.lang.Object r6 = r0.f3628a
            cd.a r6 = (cd.a) r6
            int r6 = r6.f4688b
            r9 = 116(0x74, float:1.63E-43)
            r14 = 64
            r15 = 8
            if (r3 <= r6) goto L_0x0171
            goto L_0x01a7
        L_0x0171:
            int r3 = r0.c(r1, r13)
            if (r3 < r13) goto L_0x017a
            if (r3 >= r8) goto L_0x017a
            goto L_0x01a5
        L_0x017a:
            int r3 = r1 + 7
            java.lang.Object r6 = r0.f3628a
            cd.a r6 = (cd.a) r6
            int r6 = r6.f4688b
            if (r3 <= r6) goto L_0x0185
            goto L_0x01a7
        L_0x0185:
            int r3 = r0.c(r1, r2)
            if (r3 < r14) goto L_0x018e
            if (r3 >= r9) goto L_0x018e
            goto L_0x01a5
        L_0x018e:
            int r3 = r1 + 8
            java.lang.Object r6 = r0.f3628a
            cd.a r6 = (cd.a) r6
            int r6 = r6.f4688b
            if (r3 <= r6) goto L_0x0199
            goto L_0x01a7
        L_0x0199:
            int r1 = r0.c(r1, r15)
            r3 = 232(0xe8, float:3.25E-43)
            if (r1 < r3) goto L_0x01a7
            r3 = 253(0xfd, float:3.55E-43)
            if (r1 >= r3) goto L_0x01a7
        L_0x01a5:
            r1 = r5
            goto L_0x01a8
        L_0x01a7:
            r1 = 0
        L_0x01a8:
            if (r1 == 0) goto L_0x027f
            java.lang.Object r1 = r0.f3629b
            nd.k r1 = (nd.k) r1
            int r1 = r1.f13574a
            int r3 = r0.c(r1, r13)
            if (r3 != r7) goto L_0x01bf
            nd.l r3 = new nd.l
            int r1 = r1 + 5
            r3.<init>(r11, r1)
            goto L_0x0247
        L_0x01bf:
            if (r3 < r13) goto L_0x01d1
            if (r3 >= r7) goto L_0x01d1
            nd.l r6 = new nd.l
            int r1 = r1 + 5
            int r3 = r3 + 48
            int r3 = r3 - r13
            char r3 = (char) r3
            r6.<init>(r3, r1)
        L_0x01ce:
            r3 = r6
            goto L_0x0247
        L_0x01d1:
            int r3 = r0.c(r1, r2)
            r6 = 90
            if (r3 < r14) goto L_0x01e6
            if (r3 >= r6) goto L_0x01e6
            nd.l r6 = new nd.l
            int r1 = r1 + 7
            int r3 = r3 + 1
            char r3 = (char) r3
            r6.<init>(r3, r1)
            goto L_0x01ce
        L_0x01e6:
            if (r3 < r6) goto L_0x01f5
            if (r3 >= r9) goto L_0x01f5
            nd.l r6 = new nd.l
            int r1 = r1 + 7
            int r3 = r3 + 7
            char r3 = (char) r3
            r6.<init>(r3, r1)
            goto L_0x01ce
        L_0x01f5:
            int r3 = r0.c(r1, r15)
            switch(r3) {
                case 232: goto L_0x023d;
                case 233: goto L_0x023a;
                case 234: goto L_0x0237;
                case 235: goto L_0x0234;
                case 236: goto L_0x0231;
                case 237: goto L_0x022e;
                case 238: goto L_0x022b;
                case 239: goto L_0x0228;
                case 240: goto L_0x0225;
                case 241: goto L_0x0222;
                case 242: goto L_0x021f;
                case 243: goto L_0x021c;
                case 244: goto L_0x0219;
                case 245: goto L_0x0216;
                case 246: goto L_0x0213;
                case 247: goto L_0x0210;
                case 248: goto L_0x020d;
                case 249: goto L_0x020a;
                case 250: goto L_0x0207;
                case 251: goto L_0x0204;
                case 252: goto L_0x0201;
                default: goto L_0x01fc;
            }
        L_0x01fc:
            com.google.zxing.FormatException r1 = com.google.zxing.FormatException.a()
            throw r1
        L_0x0201:
            r3 = 32
            goto L_0x023f
        L_0x0204:
            r3 = 95
            goto L_0x023f
        L_0x0207:
            r3 = 63
            goto L_0x023f
        L_0x020a:
            r3 = 62
            goto L_0x023f
        L_0x020d:
            r3 = 61
            goto L_0x023f
        L_0x0210:
            r3 = 60
            goto L_0x023f
        L_0x0213:
            r3 = 59
            goto L_0x023f
        L_0x0216:
            r3 = 58
            goto L_0x023f
        L_0x0219:
            r3 = 47
            goto L_0x023f
        L_0x021c:
            r3 = 46
            goto L_0x023f
        L_0x021f:
            r3 = 45
            goto L_0x023f
        L_0x0222:
            r3 = 44
            goto L_0x023f
        L_0x0225:
            r3 = 43
            goto L_0x023f
        L_0x0228:
            r3 = 42
            goto L_0x023f
        L_0x022b:
            r3 = 41
            goto L_0x023f
        L_0x022e:
            r3 = 40
            goto L_0x023f
        L_0x0231:
            r3 = 39
            goto L_0x023f
        L_0x0234:
            r3 = 38
            goto L_0x023f
        L_0x0237:
            r3 = 37
            goto L_0x023f
        L_0x023a:
            r3 = 34
            goto L_0x023f
        L_0x023d:
            r3 = 33
        L_0x023f:
            nd.l r6 = new nd.l
            int r1 = r1 + 8
            r6.<init>(r3, r1)
            goto L_0x01ce
        L_0x0247:
            java.lang.Object r1 = r0.f3629b
            r6 = r1
            nd.k r6 = (nd.k) r6
            int r9 = r3.f13582a
            r6.f13574a = r9
            char r3 = r3.f13576b
            if (r3 != r11) goto L_0x0256
            r6 = r5
            goto L_0x0257
        L_0x0256:
            r6 = 0
        L_0x0257:
            if (r6 == 0) goto L_0x0270
            nd.m r2 = new nd.m
            nd.k r1 = (nd.k) r1
            int r1 = r1.f13574a
            java.lang.Object r3 = r0.f3630c
            java.lang.StringBuilder r3 = (java.lang.StringBuilder) r3
            java.lang.String r3 = r3.toString()
            r2.<init>(r1, r3)
            ia.e r1 = new ia.e
            r1.<init>(r2, r5)
            goto L_0x02c9
        L_0x0270:
            java.lang.Object r1 = r0.f3630c
            java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
            r1.append(r3)
            r9 = 63
            r14 = 58
            r15 = 32
            goto L_0x015a
        L_0x027f:
            java.lang.Object r1 = r0.f3629b
            nd.k r1 = (nd.k) r1
            int r1 = r1.f13574a
            boolean r1 = r0.e(r1)
            if (r1 == 0) goto L_0x029a
            java.lang.Object r1 = r0.f3629b
            r2 = r1
            nd.k r2 = (nd.k) r2
            int r3 = r2.f13574a
            int r3 = r3 + r12
            r2.f13574a = r3
            nd.k r1 = (nd.k) r1
            r1.f13575b = r5
            goto L_0x02c3
        L_0x029a:
            java.lang.Object r1 = r0.f3629b
            nd.k r1 = (nd.k) r1
            int r1 = r1.f13574a
            boolean r1 = r0.f(r1)
            if (r1 == 0) goto L_0x02c3
            java.lang.Object r1 = r0.f3629b
            r2 = r1
            nd.k r2 = (nd.k) r2
            int r3 = r2.f13574a
            int r6 = r3 + 5
            java.lang.Object r7 = r0.f3628a
            cd.a r7 = (cd.a) r7
            int r7 = r7.f4688b
            if (r6 >= r7) goto L_0x02bc
            int r3 = r3 + 5
            r2.f13574a = r3
            goto L_0x02be
        L_0x02bc:
            r2.f13574a = r7
        L_0x02be:
            nd.k r1 = (nd.k) r1
            r2 = 2
            r1.f13575b = r2
        L_0x02c3:
            ia.e r1 = new ia.e
            r2 = 0
            r1.<init>(r10, r2)
        L_0x02c9:
            boolean r2 = r1.f11287a
        L_0x02cb:
            r6 = r2
            r2 = 2
            r3 = 0
            goto L_0x0407
        L_0x02d0:
            java.lang.Object r1 = r0.f3629b
            nd.k r1 = (nd.k) r1
            int r1 = r1.f13574a
            int r3 = r1 + 7
            java.lang.Object r6 = r0.f3628a
            cd.a r6 = (cd.a) r6
            int r6 = r6.f4688b
            if (r3 <= r6) goto L_0x02e7
            int r1 = r1 + 4
            if (r1 > r6) goto L_0x02e5
            goto L_0x02f6
        L_0x02e5:
            r1 = 0
            goto L_0x0303
        L_0x02e7:
            r3 = r1
        L_0x02e8:
            int r6 = r1 + 3
            if (r3 >= r6) goto L_0x02fb
            java.lang.Object r6 = r0.f3628a
            cd.a r6 = (cd.a) r6
            boolean r6 = r6.e(r3)
            if (r6 == 0) goto L_0x02f8
        L_0x02f6:
            r1 = r5
            goto L_0x0303
        L_0x02f8:
            int r3 = r3 + 1
            goto L_0x02e8
        L_0x02fb:
            java.lang.Object r1 = r0.f3628a
            cd.a r1 = (cd.a) r1
            boolean r1 = r1.e(r6)
        L_0x0303:
            r3 = 4
            if (r1 == 0) goto L_0x03c5
            java.lang.Object r1 = r0.f3629b
            nd.k r1 = (nd.k) r1
            int r1 = r1.f13574a
            int r6 = r1 + 7
            java.lang.Object r7 = r0.f3628a
            cd.a r7 = (cd.a) r7
            int r7 = r7.f4688b
            r8 = 10
            if (r6 <= r7) goto L_0x0339
            int r1 = r0.c(r1, r3)
            if (r1 != 0) goto L_0x032a
            nd.n r1 = new nd.n
            java.lang.Object r3 = r0.f3628a
            cd.a r3 = (cd.a) r3
            int r3 = r3.f4688b
            r1.<init>(r3, r8, r8)
            goto L_0x0349
        L_0x032a:
            nd.n r3 = new nd.n
            java.lang.Object r6 = r0.f3628a
            cd.a r6 = (cd.a) r6
            int r6 = r6.f4688b
            int r1 = r1 + -1
            r3.<init>(r6, r1, r8)
            r1 = r3
            goto L_0x0349
        L_0x0339:
            int r1 = r0.c(r1, r2)
            int r1 = r1 + -8
            int r3 = r1 / 11
            int r1 = r1 % 11
            nd.n r7 = new nd.n
            r7.<init>(r6, r3, r1)
            r1 = r7
        L_0x0349:
            java.lang.Object r3 = r0.f3629b
            r6 = r3
            nd.k r6 = (nd.k) r6
            int r7 = r1.f13582a
            r6.f13574a = r7
            int r6 = r1.f13580b
            if (r6 != r8) goto L_0x0358
            r7 = r5
            goto L_0x0359
        L_0x0358:
            r7 = 0
        L_0x0359:
            if (r7 == 0) goto L_0x0390
            int r2 = r1.f13581c
            if (r2 != r8) goto L_0x0361
            r2 = r5
            goto L_0x0362
        L_0x0361:
            r2 = 0
        L_0x0362:
            if (r2 == 0) goto L_0x0376
            nd.m r1 = new nd.m
            nd.k r3 = (nd.k) r3
            int r2 = r3.f13574a
            java.lang.Object r3 = r0.f3630c
            java.lang.StringBuilder r3 = (java.lang.StringBuilder) r3
            java.lang.String r3 = r3.toString()
            r1.<init>(r2, r3)
            goto L_0x038a
        L_0x0376:
            nd.m r2 = new nd.m
            nd.k r3 = (nd.k) r3
            int r3 = r3.f13574a
            java.lang.Object r6 = r0.f3630c
            java.lang.StringBuilder r6 = (java.lang.StringBuilder) r6
            java.lang.String r6 = r6.toString()
            int r1 = r1.f13581c
            r2.<init>(r3, r1, r6)
            r1 = r2
        L_0x038a:
            ia.e r2 = new ia.e
            r2.<init>(r1, r5)
            goto L_0x03b8
        L_0x0390:
            java.lang.Object r3 = r0.f3630c
            java.lang.StringBuilder r3 = (java.lang.StringBuilder) r3
            r3.append(r6)
            int r1 = r1.f13581c
            if (r1 != r8) goto L_0x039d
            r3 = r5
            goto L_0x039e
        L_0x039d:
            r3 = 0
        L_0x039e:
            if (r3 == 0) goto L_0x03bc
            nd.m r1 = new nd.m
            java.lang.Object r2 = r0.f3629b
            nd.k r2 = (nd.k) r2
            int r2 = r2.f13574a
            java.lang.Object r3 = r0.f3630c
            java.lang.StringBuilder r3 = (java.lang.StringBuilder) r3
            java.lang.String r3 = r3.toString()
            r1.<init>(r2, r3)
            ia.e r2 = new ia.e
            r2.<init>(r1, r5)
        L_0x03b8:
            r1 = r2
            r2 = 2
            r3 = 0
            goto L_0x0405
        L_0x03bc:
            java.lang.Object r3 = r0.f3630c
            java.lang.StringBuilder r3 = (java.lang.StringBuilder) r3
            r3.append(r1)
            goto L_0x02d0
        L_0x03c5:
            java.lang.Object r1 = r0.f3629b
            nd.k r1 = (nd.k) r1
            int r1 = r1.f13574a
            int r2 = r1 + 1
            java.lang.Object r6 = r0.f3628a
            cd.a r6 = (cd.a) r6
            int r6 = r6.f4688b
            if (r2 <= r6) goto L_0x03d6
            goto L_0x03e9
        L_0x03d6:
            r2 = 0
        L_0x03d7:
            if (r2 >= r3) goto L_0x03ee
            int r6 = r2 + r1
            java.lang.Object r7 = r0.f3628a
            cd.a r7 = (cd.a) r7
            int r8 = r7.f4688b
            if (r6 >= r8) goto L_0x03ee
            boolean r6 = r7.e(r6)
            if (r6 == 0) goto L_0x03eb
        L_0x03e9:
            r2 = 0
            goto L_0x03ef
        L_0x03eb:
            int r2 = r2 + 1
            goto L_0x03d7
        L_0x03ee:
            r2 = r5
        L_0x03ef:
            if (r2 == 0) goto L_0x03fe
            java.lang.Object r1 = r0.f3629b
            nd.k r1 = (nd.k) r1
            r2 = 2
            r1.f13575b = r2
            int r6 = r1.f13574a
            int r6 = r6 + r3
            r1.f13574a = r6
            goto L_0x03ff
        L_0x03fe:
            r2 = 2
        L_0x03ff:
            ia.e r1 = new ia.e
            r3 = 0
            r1.<init>(r10, r3)
        L_0x0405:
            boolean r6 = r1.f11287a
        L_0x0407:
            java.lang.Object r7 = r0.f3629b
            nd.k r7 = (nd.k) r7
            int r7 = r7.f13574a
            if (r4 == r7) goto L_0x0410
            goto L_0x0411
        L_0x0410:
            r5 = r3
        L_0x0411:
            if (r5 != 0) goto L_0x0415
            if (r6 == 0) goto L_0x0417
        L_0x0415:
            if (r6 == 0) goto L_0x043f
        L_0x0417:
            java.lang.Object r1 = r1.f11288b
            nd.m r1 = (nd.m) r1
            if (r1 == 0) goto L_0x0431
            boolean r2 = r1.f13579d
            if (r2 == 0) goto L_0x0431
            nd.m r2 = new nd.m
            java.lang.Object r3 = r0.f3630c
            java.lang.StringBuilder r3 = (java.lang.StringBuilder) r3
            java.lang.String r3 = r3.toString()
            int r1 = r1.f13578c
            r2.<init>(r7, r1, r3)
            return r2
        L_0x0431:
            nd.m r1 = new nd.m
            java.lang.Object r2 = r0.f3630c
            java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
            java.lang.String r2 = r2.toString()
            r1.<init>(r7, r2)
            return r1
        L_0x043f:
            r1 = r2
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.d.b(int, java.lang.String):nd.m");
    }

    public final int c(int i10, int i11) {
        return d(i10, i11, (a) this.f3628a);
    }

    public final boolean e(int i10) {
        int i11 = i10 + 3;
        if (i11 > ((a) this.f3628a).f4688b) {
            return false;
        }
        while (i10 < i11) {
            if (((a) this.f3628a).e(i10)) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public final boolean f(int i10) {
        if (i10 + 1 > ((a) this.f3628a).f4688b) {
            return false;
        }
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = i11 + i10;
            Object obj = this.f3628a;
            if (i12 >= ((a) obj).f4688b) {
                return true;
            }
            if (i11 == 2) {
                if (!((a) obj).e(i10 + 2)) {
                    return false;
                }
            } else if (((a) obj).e(i12)) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ d(a aVar) {
        this.f3629b = new nd.k();
        this.f3630c = new StringBuilder();
        this.f3628a = aVar;
    }

    public /* synthetic */ d(ViewPager2 viewPager2, g gVar, RecyclerView recyclerView) {
        this.f3628a = viewPager2;
        this.f3629b = gVar;
        this.f3630c = recyclerView;
    }
}
