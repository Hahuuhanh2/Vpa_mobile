package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.n;
import com.google.crypto.tink.shaded.protobuf.p;
import j9.c;

/* compiled from: ArrayDecoders */
public final class d {

    /* compiled from: ArrayDecoders */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f7334a;

        /* renamed from: b  reason: collision with root package name */
        public long f7335b;

        /* renamed from: c  reason: collision with root package name */
        public Object f7336c;

        /* renamed from: d  reason: collision with root package name */
        public final i f7337d;

        public a(i iVar) {
            iVar.getClass();
            this.f7337d = iVar;
        }
    }

    public static int A(byte[] bArr, int i10, a aVar) {
        int G = G(bArr, i10, aVar);
        int i11 = aVar.f7334a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.e();
        } else if (i11 == 0) {
            aVar.f7336c = "";
            return G;
        } else {
            aVar.f7336c = new String(bArr, G, i11, p.f7415a);
            return G + i11;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044 A[EDGE_INSN: B:21:0x0044->B:17:0x0044 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    public static int B(int r4, byte[] r5, int r6, int r7, com.google.crypto.tink.shaded.protobuf.p.c<?> r8, com.google.crypto.tink.shaded.protobuf.d.a r9) {
        /*
            int r6 = G(r5, r6, r9)
            int r0 = r9.f7334a
            if (r0 < 0) goto L_0x0045
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0010
            r8.add(r1)
            goto L_0x001b
        L_0x0010:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.p.f7415a
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
        L_0x001a:
            int r6 = r6 + r0
        L_0x001b:
            if (r6 >= r7) goto L_0x0044
            int r0 = G(r5, r6, r9)
            int r2 = r9.f7334a
            if (r4 == r2) goto L_0x0026
            goto L_0x0044
        L_0x0026:
            int r6 = G(r5, r0, r9)
            int r0 = r9.f7334a
            if (r0 < 0) goto L_0x003f
            if (r0 != 0) goto L_0x0034
            r8.add(r1)
            goto L_0x001b
        L_0x0034:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.p.f7415a
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
            goto L_0x001a
        L_0x003f:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r4 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.e()
            throw r4
        L_0x0044:
            return r6
        L_0x0045:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r4 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.e()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.d.B(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.p$c, com.google.crypto.tink.shaded.protobuf.d$a):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        r2 = r7 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (com.google.crypto.tink.shaded.protobuf.i0.e(r6, r7, r2) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r9.add(new java.lang.String(r6, r7, r0, com.google.crypto.tink.shaded.protobuf.p.f7415a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.b();
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0059 A[EDGE_INSN: B:28:0x0059->B:23:0x0059 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int C(int r5, byte[] r6, int r7, int r8, com.google.crypto.tink.shaded.protobuf.p.c<?> r9, com.google.crypto.tink.shaded.protobuf.d.a r10) {
        /*
            int r7 = G(r6, r7, r10)
            int r0 = r10.f7334a
            if (r0 < 0) goto L_0x005f
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0010
            r9.add(r1)
            goto L_0x0023
        L_0x0010:
            int r2 = r7 + r0
            boolean r3 = com.google.crypto.tink.shaded.protobuf.i0.e(r6, r7, r2)
            if (r3 == 0) goto L_0x005a
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.p.f7415a
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
        L_0x0022:
            r7 = r2
        L_0x0023:
            if (r7 >= r8) goto L_0x0059
            int r0 = G(r6, r7, r10)
            int r2 = r10.f7334a
            if (r5 == r2) goto L_0x002e
            goto L_0x0059
        L_0x002e:
            int r7 = G(r6, r0, r10)
            int r0 = r10.f7334a
            if (r0 < 0) goto L_0x0054
            if (r0 != 0) goto L_0x003c
            r9.add(r1)
            goto L_0x0023
        L_0x003c:
            int r2 = r7 + r0
            boolean r3 = com.google.crypto.tink.shaded.protobuf.i0.e(r6, r7, r2)
            if (r3 == 0) goto L_0x004f
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.p.f7415a
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
            goto L_0x0022
        L_0x004f:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.b()
            throw r5
        L_0x0054:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.e()
            throw r5
        L_0x0059:
            return r7
        L_0x005a:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.b()
            throw r5
        L_0x005f:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.e()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.d.C(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.p$c, com.google.crypto.tink.shaded.protobuf.d$a):int");
    }

    public static int D(byte[] bArr, int i10, a aVar) {
        int G = G(bArr, i10, aVar);
        int i11 = aVar.f7334a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.e();
        } else if (i11 == 0) {
            aVar.f7336c = "";
            return G;
        } else {
            aVar.f7336c = i0.f7397a.a(bArr, G, i11);
            return G + i11;
        }
    }

    public static int E(int i10, byte[] bArr, int i11, int i12, h0 h0Var, a aVar) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int I = I(bArr, i11, aVar);
                h0Var.c(i10, Long.valueOf(aVar.f7335b));
                return I;
            } else if (i13 == 1) {
                h0Var.c(i10, Long.valueOf(i(i11, bArr)));
                return i11 + 8;
            } else if (i13 == 2) {
                int G = G(bArr, i11, aVar);
                int i14 = aVar.f7334a;
                if (i14 < 0) {
                    throw InvalidProtocolBufferException.e();
                } else if (i14 <= bArr.length - G) {
                    if (i14 == 0) {
                        h0Var.c(i10, c.f11735b);
                    } else {
                        h0Var.c(i10, c.l(bArr, G, i14));
                    }
                    return G + i14;
                } else {
                    throw InvalidProtocolBufferException.g();
                }
            } else if (i13 == 3) {
                h0 h0Var2 = new h0();
                int i15 = (i10 & -8) | 4;
                int i16 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int G2 = G(bArr, i11, aVar);
                    int i17 = aVar.f7334a;
                    if (i17 == i15) {
                        i16 = i17;
                        i11 = G2;
                        break;
                    }
                    i16 = i17;
                    i11 = E(i17, bArr, G2, i12, h0Var2, aVar);
                }
                if (i11 > i12 || i16 != i15) {
                    throw InvalidProtocolBufferException.f();
                }
                h0Var.c(i10, h0Var2);
                return i11;
            } else if (i13 == 5) {
                h0Var.c(i10, Integer.valueOf(g(i11, bArr)));
                return i11 + 4;
            } else {
                throw InvalidProtocolBufferException.a();
            }
        } else {
            throw InvalidProtocolBufferException.a();
        }
    }

    public static int F(int i10, byte[] bArr, int i11, a aVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            aVar.f7334a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i13 + 1;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            aVar.f7334a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            aVar.f7334a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            aVar.f7334a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] < 0) {
                i19 = i21;
            } else {
                aVar.f7334a = i20;
                return i21;
            }
        }
    }

    public static int G(byte[] bArr, int i10, a aVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return F(b10, bArr, i11, aVar);
        }
        aVar.f7334a = b10;
        return i11;
    }

    public static int H(int i10, byte[] bArr, int i11, int i12, p.c<?> cVar, a aVar) {
        o oVar = (o) cVar;
        int G = G(bArr, i11, aVar);
        oVar.i(aVar.f7334a);
        while (G < i12) {
            int G2 = G(bArr, G, aVar);
            if (i10 != aVar.f7334a) {
                break;
            }
            G = G(bArr, G2, aVar);
            oVar.i(aVar.f7334a);
        }
        return G;
    }

    public static int I(byte[] bArr, int i10, a aVar) {
        int i11 = i10 + 1;
        long j10 = (long) bArr[i10];
        if (j10 >= 0) {
            aVar.f7335b = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & Byte.MAX_VALUE)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & Byte.MAX_VALUE)) << i13;
            int i15 = i14;
            b10 = b11;
            i12 = i15;
        }
        aVar.f7335b = j11;
        return i12;
    }

    public static int J(int i10, byte[] bArr, int i11, int i12, p.c<?> cVar, a aVar) {
        u uVar = (u) cVar;
        int I = I(bArr, i11, aVar);
        uVar.i(aVar.f7335b);
        while (I < i12) {
            int G = G(bArr, I, aVar);
            if (i10 != aVar.f7334a) {
                break;
            }
            I = I(bArr, G, aVar);
            uVar.i(aVar.f7335b);
        }
        return I;
    }

    public static int K(Object obj, c0 c0Var, byte[] bArr, int i10, int i11, int i12, a aVar) {
        int J = ((z) c0Var).J(obj, bArr, i10, i11, i12, aVar);
        aVar.f7336c = obj;
        return J;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int L(java.lang.Object r6, com.google.crypto.tink.shaded.protobuf.c0 r7, byte[] r8, int r9, int r10, com.google.crypto.tink.shaded.protobuf.d.a r11) {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = F(r9, r8, r0, r11)
            int r9 = r11.f7334a
        L_0x000c:
            r3 = r0
            if (r9 < 0) goto L_0x001e
            int r10 = r10 - r3
            if (r9 > r10) goto L_0x001e
            int r9 = r9 + r3
            r0 = r7
            r1 = r6
            r2 = r8
            r4 = r9
            r5 = r11
            r0.j(r1, r2, r3, r4, r5)
            r11.f7336c = r6
            return r9
        L_0x001e:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r6 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.g()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.d.L(java.lang.Object, com.google.crypto.tink.shaded.protobuf.c0, byte[], int, int, com.google.crypto.tink.shaded.protobuf.d$a):int");
    }

    public static int M(int i10, byte[] bArr, int i11, int i12, a aVar) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                return I(bArr, i11, aVar);
            }
            if (i13 == 1) {
                return i11 + 8;
            }
            if (i13 == 2) {
                return G(bArr, i11, aVar) + aVar.f7334a;
            }
            if (i13 == 3) {
                int i14 = (i10 & -8) | 4;
                int i15 = 0;
                while (i11 < i12) {
                    i11 = G(bArr, i11, aVar);
                    i15 = aVar.f7334a;
                    if (i15 == i14) {
                        break;
                    }
                    i11 = M(i15, bArr, i11, i12, aVar);
                }
                if (i11 <= i12 && i15 == i14) {
                    return i11;
                }
                throw InvalidProtocolBufferException.f();
            } else if (i13 == 5) {
                return i11 + 4;
            } else {
                throw InvalidProtocolBufferException.a();
            }
        } else {
            throw InvalidProtocolBufferException.a();
        }
    }

    public static int a(int i10, byte[] bArr, int i11, int i12, p.c<?> cVar, a aVar) {
        boolean z10;
        boolean z11;
        e eVar = (e) cVar;
        int I = I(bArr, i11, aVar);
        if (aVar.f7335b != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        eVar.i(z10);
        while (I < i12) {
            int G = G(bArr, I, aVar);
            if (i10 != aVar.f7334a) {
                break;
            }
            I = I(bArr, G, aVar);
            if (aVar.f7335b != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            eVar.i(z11);
        }
        return I;
    }

    public static int b(byte[] bArr, int i10, a aVar) {
        int G = G(bArr, i10, aVar);
        int i11 = aVar.f7334a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.e();
        } else if (i11 > bArr.length - G) {
            throw InvalidProtocolBufferException.g();
        } else if (i11 == 0) {
            aVar.f7336c = c.f11735b;
            return G;
        } else {
            aVar.f7336c = c.l(bArr, G, i11);
            return G + i11;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x004d A[EDGE_INSN: B:30:0x004d->B:22:0x004d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int c(int r2, byte[] r3, int r4, int r5, com.google.crypto.tink.shaded.protobuf.p.c<?> r6, com.google.crypto.tink.shaded.protobuf.d.a r7) {
        /*
            int r4 = G(r3, r4, r7)
            int r0 = r7.f7334a
            if (r0 < 0) goto L_0x0053
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L_0x004e
            if (r0 != 0) goto L_0x0014
            j9.c$f r0 = j9.c.f11735b
            r6.add(r0)
            goto L_0x001c
        L_0x0014:
            j9.c$f r1 = j9.c.l(r3, r4, r0)
            r6.add(r1)
        L_0x001b:
            int r4 = r4 + r0
        L_0x001c:
            if (r4 >= r5) goto L_0x004d
            int r0 = G(r3, r4, r7)
            int r1 = r7.f7334a
            if (r2 == r1) goto L_0x0027
            goto L_0x004d
        L_0x0027:
            int r4 = G(r3, r0, r7)
            int r0 = r7.f7334a
            if (r0 < 0) goto L_0x0048
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L_0x0043
            if (r0 != 0) goto L_0x003b
            j9.c$f r0 = j9.c.f11735b
            r6.add(r0)
            goto L_0x001c
        L_0x003b:
            j9.c$f r1 = j9.c.l(r3, r4, r0)
            r6.add(r1)
            goto L_0x001b
        L_0x0043:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.g()
            throw r2
        L_0x0048:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.e()
            throw r2
        L_0x004d:
            return r4
        L_0x004e:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.g()
            throw r2
        L_0x0053:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.e()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.d.c(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.p$c, com.google.crypto.tink.shaded.protobuf.d$a):int");
    }

    public static double d(int i10, byte[] bArr) {
        return Double.longBitsToDouble(i(i10, bArr));
    }

    public static int e(int i10, byte[] bArr, int i11, int i12, p.c<?> cVar, a aVar) {
        h hVar = (h) cVar;
        hVar.i(Double.longBitsToDouble(i(i11, bArr)));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int G = G(bArr, i13, aVar);
            if (i10 != aVar.f7334a) {
                break;
            }
            hVar.i(Double.longBitsToDouble(i(G, bArr)));
            i13 = G + 8;
        }
        return i13;
    }

    public static int f(int i10, byte[] bArr, int i11, int i12, Object obj, x xVar, a aVar) {
        if (aVar.f7337d.f7394a.get(new i.a(xVar, i10 >>> 3)) == null) {
            return E(i10, bArr, i11, i12, z.q(obj), aVar);
        }
        n.c cVar = (n.c) obj;
        l<n.d> lVar = cVar.extensions;
        if (lVar.f7400b) {
            cVar.extensions = lVar.clone();
        }
        throw null;
    }

    public static int g(int i10, byte[] bArr) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int h(int i10, byte[] bArr, int i11, int i12, p.c<?> cVar, a aVar) {
        o oVar = (o) cVar;
        oVar.i(g(i11, bArr));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int G = G(bArr, i13, aVar);
            if (i10 != aVar.f7334a) {
                break;
            }
            oVar.i(g(G, bArr));
            i13 = G + 4;
        }
        return i13;
    }

    public static long i(int i10, byte[] bArr) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public static int j(int i10, byte[] bArr, int i11, int i12, p.c<?> cVar, a aVar) {
        u uVar = (u) cVar;
        uVar.i(i(i11, bArr));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int G = G(bArr, i13, aVar);
            if (i10 != aVar.f7334a) {
                break;
            }
            uVar.i(i(G, bArr));
            i13 = G + 8;
        }
        return i13;
    }

    public static float k(int i10, byte[] bArr) {
        return Float.intBitsToFloat(g(i10, bArr));
    }

    public static int l(int i10, byte[] bArr, int i11, int i12, p.c<?> cVar, a aVar) {
        m mVar = (m) cVar;
        mVar.i(Float.intBitsToFloat(g(i11, bArr)));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int G = G(bArr, i13, aVar);
            if (i10 != aVar.f7334a) {
                break;
            }
            mVar.i(Float.intBitsToFloat(g(G, bArr)));
            i13 = G + 4;
        }
        return i13;
    }

    public static int m(c0 c0Var, int i10, byte[] bArr, int i11, int i12, p.c<?> cVar, a aVar) {
        int i13 = (i10 & -8) | 4;
        Object b10 = c0Var.b();
        int K = K(b10, c0Var, bArr, i11, i12, i13, aVar);
        c0Var.c(b10);
        aVar.f7336c = b10;
        cVar.add(b10);
        while (K < i12) {
            int G = G(bArr, K, aVar);
            if (i10 != aVar.f7334a) {
                break;
            }
            Object b11 = c0Var.b();
            int K2 = K(b11, c0Var, bArr, G, i12, i13, aVar);
            c0Var.c(b11);
            aVar.f7336c = b11;
            cVar.add(b11);
            K = K2;
        }
        return K;
    }

    public static int n(c0 c0Var, byte[] bArr, int i10, int i11, a aVar) {
        Object b10 = c0Var.b();
        int L = L(b10, c0Var, bArr, i10, i11, aVar);
        c0Var.c(b10);
        aVar.f7336c = b10;
        return L;
    }

    public static int o(c0<?> c0Var, int i10, byte[] bArr, int i11, int i12, p.c<?> cVar, a aVar) {
        int n10 = n(c0Var, bArr, i11, i12, aVar);
        cVar.add(aVar.f7336c);
        while (n10 < i12) {
            int G = G(bArr, n10, aVar);
            if (i10 != aVar.f7334a) {
                break;
            }
            n10 = n(c0Var, bArr, G, i12, aVar);
            cVar.add(aVar.f7336c);
        }
        return n10;
    }

    public static int p(byte[] bArr, int i10, p.c<?> cVar, a aVar) {
        boolean z10;
        e eVar = (e) cVar;
        int G = G(bArr, i10, aVar);
        int i11 = aVar.f7334a + G;
        while (G < i11) {
            G = I(bArr, G, aVar);
            if (aVar.f7335b != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            eVar.i(z10);
        }
        if (G == i11) {
            return G;
        }
        throw InvalidProtocolBufferException.g();
    }

    public static int q(byte[] bArr, int i10, p.c<?> cVar, a aVar) {
        h hVar = (h) cVar;
        int G = G(bArr, i10, aVar);
        int i11 = aVar.f7334a + G;
        while (G < i11) {
            hVar.i(Double.longBitsToDouble(i(G, bArr)));
            G += 8;
        }
        if (G == i11) {
            return G;
        }
        throw InvalidProtocolBufferException.g();
    }

    public static int r(byte[] bArr, int i10, p.c<?> cVar, a aVar) {
        o oVar = (o) cVar;
        int G = G(bArr, i10, aVar);
        int i11 = aVar.f7334a + G;
        while (G < i11) {
            oVar.i(g(G, bArr));
            G += 4;
        }
        if (G == i11) {
            return G;
        }
        throw InvalidProtocolBufferException.g();
    }

    public static int s(byte[] bArr, int i10, p.c<?> cVar, a aVar) {
        u uVar = (u) cVar;
        int G = G(bArr, i10, aVar);
        int i11 = aVar.f7334a + G;
        while (G < i11) {
            uVar.i(i(G, bArr));
            G += 8;
        }
        if (G == i11) {
            return G;
        }
        throw InvalidProtocolBufferException.g();
    }

    public static int t(byte[] bArr, int i10, p.c<?> cVar, a aVar) {
        m mVar = (m) cVar;
        int G = G(bArr, i10, aVar);
        int i11 = aVar.f7334a + G;
        while (G < i11) {
            mVar.i(Float.intBitsToFloat(g(G, bArr)));
            G += 4;
        }
        if (G == i11) {
            return G;
        }
        throw InvalidProtocolBufferException.g();
    }

    public static int u(byte[] bArr, int i10, p.c<?> cVar, a aVar) {
        o oVar = (o) cVar;
        int G = G(bArr, i10, aVar);
        int i11 = aVar.f7334a + G;
        while (G < i11) {
            G = G(bArr, G, aVar);
            oVar.i(f.b(aVar.f7334a));
        }
        if (G == i11) {
            return G;
        }
        throw InvalidProtocolBufferException.g();
    }

    public static int v(byte[] bArr, int i10, p.c<?> cVar, a aVar) {
        u uVar = (u) cVar;
        int G = G(bArr, i10, aVar);
        int i11 = aVar.f7334a + G;
        while (G < i11) {
            G = I(bArr, G, aVar);
            uVar.i(f.c(aVar.f7335b));
        }
        if (G == i11) {
            return G;
        }
        throw InvalidProtocolBufferException.g();
    }

    public static int w(byte[] bArr, int i10, p.c<?> cVar, a aVar) {
        o oVar = (o) cVar;
        int G = G(bArr, i10, aVar);
        int i11 = aVar.f7334a + G;
        while (G < i11) {
            G = G(bArr, G, aVar);
            oVar.i(aVar.f7334a);
        }
        if (G == i11) {
            return G;
        }
        throw InvalidProtocolBufferException.g();
    }

    public static int x(byte[] bArr, int i10, p.c<?> cVar, a aVar) {
        u uVar = (u) cVar;
        int G = G(bArr, i10, aVar);
        int i11 = aVar.f7334a + G;
        while (G < i11) {
            G = I(bArr, G, aVar);
            uVar.i(aVar.f7335b);
        }
        if (G == i11) {
            return G;
        }
        throw InvalidProtocolBufferException.g();
    }

    public static int y(int i10, byte[] bArr, int i11, int i12, p.c<?> cVar, a aVar) {
        o oVar = (o) cVar;
        int G = G(bArr, i11, aVar);
        oVar.i(f.b(aVar.f7334a));
        while (G < i12) {
            int G2 = G(bArr, G, aVar);
            if (i10 != aVar.f7334a) {
                break;
            }
            G = G(bArr, G2, aVar);
            oVar.i(f.b(aVar.f7334a));
        }
        return G;
    }

    public static int z(int i10, byte[] bArr, int i11, int i12, p.c<?> cVar, a aVar) {
        u uVar = (u) cVar;
        int I = I(bArr, i11, aVar);
        uVar.i(f.c(aVar.f7335b));
        while (I < i12) {
            int G = G(bArr, I, aVar);
            if (i10 != aVar.f7334a) {
                break;
            }
            I = I(bArr, G, aVar);
            uVar.i(f.c(aVar.f7335b));
        }
        return I;
    }
}
