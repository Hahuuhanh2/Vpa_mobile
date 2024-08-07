package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.p;
import androidx.datastore.preferences.protobuf.v;
import j2.a0;
import j2.c;
import j2.l;
import j2.o;
import j2.s;
import j2.t;
import j2.u;
import j2.v;
import j2.y;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: MessageSchema */
public final class b0<T> implements u<T> {

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f2212r = new int[0];

    /* renamed from: s  reason: collision with root package name */
    public static final Unsafe f2213s = y.o();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f2214a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f2215b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2216c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2217d;

    /* renamed from: e  reason: collision with root package name */
    public final z f2218e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2219f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2220g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f2221h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f2222i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f2223j;

    /* renamed from: k  reason: collision with root package name */
    public final int f2224k;

    /* renamed from: l  reason: collision with root package name */
    public final int f2225l;

    /* renamed from: m  reason: collision with root package name */
    public final o f2226m;

    /* renamed from: n  reason: collision with root package name */
    public final t f2227n;

    /* renamed from: o  reason: collision with root package name */
    public final j0<?, ?> f2228o;

    /* renamed from: p  reason: collision with root package name */
    public final j<?> f2229p;

    /* renamed from: q  reason: collision with root package name */
    public final x f2230q;

    public b0(int[] iArr, Object[] objArr, int i10, int i11, z zVar, boolean z10, int[] iArr2, int i12, int i13, o oVar, t tVar, j0 j0Var, j jVar, x xVar) {
        boolean z11;
        this.f2214a = iArr;
        this.f2215b = objArr;
        this.f2216c = i10;
        this.f2217d = i11;
        this.f2220g = zVar instanceof n;
        this.f2221h = z10;
        if (jVar == null || !jVar.e(zVar)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f2219f = z11;
        this.f2222i = false;
        this.f2223j = iArr2;
        this.f2224k = i12;
        this.f2225l = i13;
        this.f2226m = oVar;
        this.f2227n = tVar;
        this.f2228o = j0Var;
        this.f2229p = jVar;
        this.f2218e = zVar;
        this.f2230q = xVar;
    }

    public static <T> int A(T t10, long j10) {
        return ((Integer) y.n(t10, j10)).intValue();
    }

    public static <T> long B(T t10, long j10) {
        return ((Long) y.n(t10, j10)).longValue();
    }

    public static Field H(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder w9 = f0.b0.w("Field ", str, " for ");
            w9.append(cls.getName());
            w9.append(" not found. Known fields are ");
            w9.append(Arrays.toString(declaredFields));
            throw new RuntimeException(w9.toString());
        }
    }

    public static int K(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static void O(int i10, Object obj, g gVar) {
        if (obj instanceof String) {
            gVar.f2264a.w0(i10, (String) obj);
            return;
        }
        gVar.b(i10, (c) obj);
    }

    public static List<?> s(Object obj, long j10) {
        return (List) y.n(obj, j10);
    }

    public static b0 x(l lVar, o oVar, t tVar, j0 j0Var, j jVar, x xVar) {
        if (lVar instanceof t) {
            return y((t) lVar, oVar, tVar, j0Var, jVar, xVar);
        }
        v vVar = (v) lVar;
        throw null;
    }

    public static <T> b0<T> y(t tVar, o oVar, t tVar2, j0<?, ?> j0Var, j<?> jVar, x xVar) {
        boolean z10;
        int i10;
        int i11;
        char c10;
        char c11;
        char c12;
        int[] iArr;
        char c13;
        char c14;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z11;
        char c15;
        String str;
        char c16;
        char c17;
        char c18;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        char c19;
        int i22;
        Field field;
        int i23;
        char charAt;
        int i24;
        int i25;
        char c20;
        Field field2;
        Field field3;
        int i26;
        char charAt2;
        int i27;
        char charAt3;
        int i28;
        char charAt4;
        int i29;
        int i30;
        char charAt5;
        int i31;
        char charAt6;
        int i32;
        char charAt7;
        int i33;
        char charAt8;
        int i34;
        char charAt9;
        int i35;
        char charAt10;
        int i36;
        char charAt11;
        int i37;
        char charAt12;
        int i38;
        char charAt13;
        char charAt14;
        char c21 = 0;
        if (tVar.c() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        String e10 = tVar.e();
        int length = e10.length();
        char charAt15 = e10.charAt(0);
        if (charAt15 >= 55296) {
            char c22 = charAt15 & 8191;
            int i39 = 1;
            int i40 = 13;
            while (true) {
                i10 = i39 + 1;
                charAt14 = e10.charAt(i39);
                if (charAt14 < 55296) {
                    break;
                }
                c22 |= (charAt14 & 8191) << i40;
                i40 += 13;
                i39 = i10;
            }
            charAt15 = c22 | (charAt14 << i40);
        } else {
            i10 = 1;
        }
        int i41 = i10 + 1;
        char charAt16 = e10.charAt(i10);
        if (charAt16 >= 55296) {
            char c23 = charAt16 & 8191;
            int i42 = 13;
            while (true) {
                i38 = i41 + 1;
                charAt13 = e10.charAt(i41);
                if (charAt13 < 55296) {
                    break;
                }
                c23 |= (charAt13 & 8191) << i42;
                i42 += 13;
                i41 = i38;
            }
            charAt16 = c23 | (charAt13 << i42);
            i41 = i38;
        }
        if (charAt16 == 0) {
            c14 = 0;
            c12 = 0;
            c11 = 0;
            c10 = 0;
            i11 = 0;
            iArr = f2212r;
            c13 = 0;
        } else {
            int i43 = i41 + 1;
            char charAt17 = e10.charAt(i41);
            if (charAt17 >= 55296) {
                char c24 = charAt17 & 8191;
                int i44 = 13;
                while (true) {
                    i37 = i43 + 1;
                    charAt12 = e10.charAt(i43);
                    if (charAt12 < 55296) {
                        break;
                    }
                    c24 |= (charAt12 & 8191) << i44;
                    i44 += 13;
                    i43 = i37;
                }
                charAt17 = c24 | (charAt12 << i44);
                i43 = i37;
            }
            int i45 = i43 + 1;
            char charAt18 = e10.charAt(i43);
            if (charAt18 >= 55296) {
                char c25 = charAt18 & 8191;
                int i46 = 13;
                while (true) {
                    i36 = i45 + 1;
                    charAt11 = e10.charAt(i45);
                    if (charAt11 < 55296) {
                        break;
                    }
                    c25 |= (charAt11 & 8191) << i46;
                    i46 += 13;
                    i45 = i36;
                }
                charAt18 = c25 | (charAt11 << i46);
                i45 = i36;
            }
            int i47 = i45 + 1;
            char charAt19 = e10.charAt(i45);
            if (charAt19 >= 55296) {
                char c26 = charAt19 & 8191;
                int i48 = 13;
                while (true) {
                    i35 = i47 + 1;
                    charAt10 = e10.charAt(i47);
                    if (charAt10 < 55296) {
                        break;
                    }
                    c26 |= (charAt10 & 8191) << i48;
                    i48 += 13;
                    i47 = i35;
                }
                charAt19 = c26 | (charAt10 << i48);
                i47 = i35;
            }
            int i49 = i47 + 1;
            c12 = e10.charAt(i47);
            if (c12 >= 55296) {
                char c27 = c12 & 8191;
                int i50 = 13;
                while (true) {
                    i34 = i49 + 1;
                    charAt9 = e10.charAt(i49);
                    if (charAt9 < 55296) {
                        break;
                    }
                    c27 |= (charAt9 & 8191) << i50;
                    i50 += 13;
                    i49 = i34;
                }
                c12 = c27 | (charAt9 << i50);
                i49 = i34;
            }
            int i51 = i49 + 1;
            char charAt20 = e10.charAt(i49);
            if (charAt20 >= 55296) {
                char c28 = charAt20 & 8191;
                int i52 = 13;
                while (true) {
                    i33 = i51 + 1;
                    charAt8 = e10.charAt(i51);
                    if (charAt8 < 55296) {
                        break;
                    }
                    c28 |= (charAt8 & 8191) << i52;
                    i52 += 13;
                    i51 = i33;
                }
                charAt20 = c28 | (charAt8 << i52);
                i51 = i33;
            }
            int i53 = i51 + 1;
            c10 = e10.charAt(i51);
            if (c10 >= 55296) {
                char c29 = c10 & 8191;
                int i54 = 13;
                while (true) {
                    i32 = i53 + 1;
                    charAt7 = e10.charAt(i53);
                    if (charAt7 < 55296) {
                        break;
                    }
                    c29 |= (charAt7 & 8191) << i54;
                    i54 += 13;
                    i53 = i32;
                }
                c10 = c29 | (charAt7 << i54);
                i53 = i32;
            }
            int i55 = i53 + 1;
            char charAt21 = e10.charAt(i53);
            if (charAt21 >= 55296) {
                char c30 = charAt21 & 8191;
                int i56 = i55;
                int i57 = 13;
                while (true) {
                    i31 = i56 + 1;
                    charAt6 = e10.charAt(i56);
                    if (charAt6 < 55296) {
                        break;
                    }
                    c30 |= (charAt6 & 8191) << i57;
                    i57 += 13;
                    i56 = i31;
                }
                charAt21 = c30 | (charAt6 << i57);
                i29 = i31;
            } else {
                i29 = i55;
            }
            int i58 = i29 + 1;
            char charAt22 = e10.charAt(i29);
            if (charAt22 >= 55296) {
                char c31 = charAt22 & 8191;
                int i59 = i58;
                int i60 = 13;
                while (true) {
                    i30 = i59 + 1;
                    charAt5 = e10.charAt(i59);
                    if (charAt5 < 55296) {
                        break;
                    }
                    c31 |= (charAt5 & 8191) << i60;
                    i60 += 13;
                    i59 = i30;
                }
                charAt22 = c31 | (charAt5 << i60);
                i58 = i30;
            }
            i11 = (charAt17 * 2) + charAt18;
            c13 = charAt20;
            c11 = charAt22;
            c21 = charAt17;
            i41 = i58;
            char c32 = charAt19;
            iArr = new int[(charAt22 + c10 + charAt21)];
            c14 = c32;
        }
        Unsafe unsafe = f2213s;
        Object[] d10 = tVar.d();
        Class<?> cls = tVar.b().getClass();
        int i61 = i41;
        int[] iArr2 = new int[(c13 * 3)];
        Object[] objArr = new Object[(c13 * 2)];
        int i62 = c10 + c11;
        char c33 = c11;
        int i63 = i62;
        int i64 = 0;
        int i65 = 0;
        int i66 = i61;
        int i67 = i11;
        int i68 = i66;
        while (i68 < length) {
            int i69 = i68 + 1;
            int charAt23 = e10.charAt(i68);
            if (charAt23 >= 55296) {
                int i70 = charAt23 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i28 = i71 + 1;
                    charAt4 = e10.charAt(i71);
                    i12 = length;
                    if (charAt4 < 55296) {
                        break;
                    }
                    i70 |= (charAt4 & 8191) << i72;
                    i72 += 13;
                    i71 = i28;
                    length = i12;
                }
                charAt23 = i70 | (charAt4 << i72);
                i13 = i28;
            } else {
                i12 = length;
                i13 = i69;
            }
            int i73 = i13 + 1;
            char charAt24 = e10.charAt(i13);
            int i74 = i73;
            if (charAt24 >= 55296) {
                char c34 = charAt24 & 8191;
                int i75 = i74;
                int i76 = 13;
                while (true) {
                    i27 = i75 + 1;
                    charAt3 = e10.charAt(i75);
                    i14 = i62;
                    if (charAt3 < 55296) {
                        break;
                    }
                    c34 |= (charAt3 & 8191) << i76;
                    i76 += 13;
                    i75 = i27;
                    i62 = i14;
                }
                charAt24 = c34 | (charAt3 << i76);
                i15 = i27;
            } else {
                i14 = i62;
                i15 = i74;
            }
            char c35 = charAt24 & 255;
            char c36 = c11;
            if ((charAt24 & 1024) != 0) {
                iArr[i65] = i64;
                i65++;
            }
            if (c35 >= '3') {
                int i77 = i15 + 1;
                char charAt25 = e10.charAt(i15);
                int i78 = i77;
                if (charAt25 >= 55296) {
                    char c37 = charAt25 & 8191;
                    int i79 = i78;
                    int i80 = 13;
                    while (true) {
                        i26 = i79 + 1;
                        charAt2 = e10.charAt(i79);
                        z11 = z10;
                        if (charAt2 < 55296) {
                            break;
                        }
                        c37 |= (charAt2 & 8191) << i80;
                        i80 += 13;
                        i79 = i26;
                        z10 = z11;
                    }
                    charAt25 = c37 | (charAt2 << i80);
                    i25 = i26;
                } else {
                    z11 = z10;
                    i25 = i78;
                }
                int i81 = c35 - '3';
                int i82 = i25;
                if (i81 == 9 || i81 == 17) {
                    c20 = 2;
                    objArr[((i64 / 3) * 2) + 1] = d10[i67];
                    i67++;
                } else {
                    if (i81 == 12 && (charAt15 & 1) == 1) {
                        objArr[((i64 / 3) * 2) + 1] = d10[i67];
                        i67++;
                    }
                    c20 = 2;
                }
                int i83 = charAt25 * c20;
                Object obj = d10[i83];
                if (obj instanceof Field) {
                    field2 = (Field) obj;
                } else {
                    field2 = H(cls, (String) obj);
                    d10[i83] = field2;
                }
                c15 = c12;
                i16 = (int) unsafe.objectFieldOffset(field2);
                int i84 = i83 + 1;
                Object obj2 = d10[i84];
                if (obj2 instanceof Field) {
                    field3 = (Field) obj2;
                } else {
                    field3 = H(cls, (String) obj2);
                    d10[i84] = field3;
                }
                i17 = (int) unsafe.objectFieldOffset(field3);
                str = e10;
                c16 = c21;
                i18 = i82;
                i19 = 0;
                c18 = 2;
                c17 = c14;
            } else {
                z11 = z10;
                c15 = c12;
                int i85 = i67 + 1;
                Field H = H(cls, (String) d10[i67]);
                if (c35 == 9 || c35 == 17) {
                    c17 = c14;
                    c19 = 1;
                    objArr[((i64 / 3) * 2) + 1] = H.getType();
                } else {
                    if (c35 == 27 || c35 == '1') {
                        c17 = c14;
                        c19 = 1;
                        i24 = i85 + 1;
                        objArr[((i64 / 3) * 2) + 1] = d10[i85];
                    } else if (c35 == 12 || c35 == 30 || c35 == ',') {
                        c17 = c14;
                        c19 = 1;
                        if ((charAt15 & 1) == 1) {
                            i24 = i85 + 1;
                            objArr[((i64 / 3) * 2) + 1] = d10[i85];
                        }
                    } else {
                        if (c35 == '2') {
                            int i86 = c33 + 1;
                            iArr[c33] = i64;
                            int i87 = (i64 / 3) * 2;
                            int i88 = i85 + 1;
                            objArr[i87] = d10[i85];
                            if ((charAt24 & 2048) != 0) {
                                i85 = i88 + 1;
                                objArr[i87 + 1] = d10[i88];
                                c17 = c14;
                                c33 = i86;
                                c19 = 1;
                            } else {
                                c33 = i86;
                                i85 = i88;
                            }
                        }
                        c17 = c14;
                        c19 = 1;
                    }
                    i85 = i24;
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(H);
                if ((charAt15 & 1) != c19 || c35 > 17) {
                    str = e10;
                    c16 = c21;
                    c18 = 2;
                    i19 = 0;
                    i22 = 0;
                } else {
                    int i89 = i15 + 1;
                    char charAt26 = e10.charAt(i15);
                    if (charAt26 >= 55296) {
                        char c38 = charAt26 & 8191;
                        int i90 = 13;
                        while (true) {
                            i23 = i89 + 1;
                            charAt = e10.charAt(i89);
                            if (charAt < 55296) {
                                break;
                            }
                            c38 |= (charAt & 8191) << i90;
                            i90 += 13;
                            i89 = i23;
                        }
                        charAt26 = c38 | (charAt << i90);
                        i89 = i23;
                    }
                    c18 = 2;
                    int i91 = (charAt26 / ' ') + (c21 * 2);
                    Object obj3 = d10[i91];
                    str = e10;
                    if (obj3 instanceof Field) {
                        field = (Field) obj3;
                    } else {
                        field = H(cls, (String) obj3);
                        d10[i91] = field;
                    }
                    c16 = c21;
                    i22 = (int) unsafe.objectFieldOffset(field);
                    i19 = charAt26 % ' ';
                    i15 = i89;
                }
                if (c35 >= 18 && c35 <= '1') {
                    iArr[i63] = objectFieldOffset;
                    i63++;
                }
                i67 = i85;
                i16 = objectFieldOffset;
                int i92 = i15;
                i17 = i22;
                i18 = i92;
            }
            int i93 = i64 + 1;
            iArr2[i64] = charAt23;
            int i94 = i93 + 1;
            if ((charAt24 & 512) != 0) {
                i20 = 536870912;
            } else {
                i20 = 0;
            }
            if ((charAt24 & 256) != 0) {
                i21 = 268435456;
            } else {
                i21 = 0;
            }
            iArr2[i93] = i21 | i20 | (c35 << 20) | i16;
            i64 = i94 + 1;
            iArr2[i94] = (i19 << 20) | i17;
            i68 = i18;
            char c39 = c18;
            c11 = c36;
            c14 = c17;
            length = i12;
            i62 = i14;
            c21 = c16;
            e10 = str;
            c12 = c15;
            z10 = z11;
        }
        char c40 = c14;
        boolean z12 = z10;
        return new b0(iArr2, objArr, c14, c12, tVar.b(), z10, iArr, c11, i62, oVar, tVar2, j0Var, jVar, xVar);
    }

    public static long z(int i10) {
        return (long) (i10 & 1048575);
    }

    public final int C(int i10) {
        if (i10 < this.f2216c || i10 > this.f2217d) {
            return -1;
        }
        int i11 = 0;
        int length = (this.f2214a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f2214a[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    public final <E> void D(Object obj, long j10, f0 f0Var, u<E> uVar, i iVar) {
        f0Var.D(this.f2227n.c(obj, j10), uVar, iVar);
    }

    public final <E> void E(Object obj, int i10, f0 f0Var, u<E> uVar, i iVar) {
        f0Var.c(this.f2227n.c(obj, (long) (i10 & 1048575)), uVar, iVar);
    }

    public final void F(Object obj, int i10, f0 f0Var) {
        boolean z10;
        if ((536870912 & i10) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            y.u(obj, (long) (i10 & 1048575), f0Var.M());
        } else if (this.f2220g) {
            y.u(obj, (long) (i10 & 1048575), f0Var.z());
        } else {
            y.u(obj, (long) (i10 & 1048575), f0Var.E());
        }
    }

    public final void G(Object obj, int i10, f0 f0Var) {
        boolean z10;
        if ((536870912 & i10) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f0Var.C(this.f2227n.c(obj, (long) (i10 & 1048575)));
        } else {
            f0Var.B(this.f2227n.c(obj, (long) (i10 & 1048575)));
        }
    }

    public final void I(int i10, Object obj) {
        if (!this.f2221h) {
            int i11 = this.f2214a[i10 + 2];
            long j10 = (long) (i11 & 1048575);
            y.s(obj, y.l(obj, j10) | (1 << (i11 >>> 20)), j10);
        }
    }

    public final void J(T t10, int i10, int i11) {
        y.s(t10, i10, (long) (this.f2214a[i11 + 2] & 1048575));
    }

    public final int L(int i10) {
        return this.f2214a[i10 + 1];
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0365  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0375  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0385  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03d3  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03fa  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0407  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0423  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0434  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x044c  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0458  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0464  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x047c  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0488  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0494  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x04a5  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void M(java.lang.Object r19, androidx.datastore.preferences.protobuf.g r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r0.f2219f
            if (r3 == 0) goto L_0x0021
            androidx.datastore.preferences.protobuf.j<?> r3 = r0.f2229p
            androidx.datastore.preferences.protobuf.l r3 = r3.c(r1)
            boolean r5 = r3.h()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.k()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            r6 = -1
            int[] r7 = r0.f2214a
            int r7 = r7.length
            sun.misc.Unsafe r8 = f2213s
            r10 = 0
            r11 = 0
        L_0x002b:
            if (r10 >= r7) goto L_0x04a3
            int r12 = r0.L(r10)
            int[] r13 = r0.f2214a
            r14 = r13[r10]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r15 = r15 & r12
            int r15 = r15 >>> 20
            boolean r4 = r0.f2221h
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != 0) goto L_0x005b
            r4 = 17
            if (r15 > r4) goto L_0x005b
            int r4 = r10 + 2
            r4 = r13[r4]
            r13 = r4 & r16
            r17 = r10
            if (r13 == r6) goto L_0x0055
            long r9 = (long) r13
            int r11 = r8.getInt(r1, r9)
            r6 = r13
        L_0x0055:
            int r4 = r4 >>> 20
            r9 = 1
            int r4 = r9 << r4
            goto L_0x005e
        L_0x005b:
            r17 = r10
            r4 = 0
        L_0x005e:
            if (r5 == 0) goto L_0x007b
            androidx.datastore.preferences.protobuf.j<?> r9 = r0.f2229p
            r9.a(r5)
            if (r14 < 0) goto L_0x007b
            androidx.datastore.preferences.protobuf.j<?> r9 = r0.f2229p
            r9.j(r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0079
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x005e
        L_0x0079:
            r5 = 0
            goto L_0x005e
        L_0x007b:
            r9 = r12 & r16
            long r9 = (long) r9
            r12 = r17
            switch(r15) {
                case 0: goto L_0x0494;
                case 1: goto L_0x0488;
                case 2: goto L_0x047c;
                case 3: goto L_0x0470;
                case 4: goto L_0x0464;
                case 5: goto L_0x0458;
                case 6: goto L_0x044c;
                case 7: goto L_0x0440;
                case 8: goto L_0x0434;
                case 9: goto L_0x0423;
                case 10: goto L_0x0414;
                case 11: goto L_0x0407;
                case 12: goto L_0x03fa;
                case 13: goto L_0x03ed;
                case 14: goto L_0x03e0;
                case 15: goto L_0x03d3;
                case 16: goto L_0x03c6;
                case 17: goto L_0x03b5;
                case 18: goto L_0x03a5;
                case 19: goto L_0x0395;
                case 20: goto L_0x0385;
                case 21: goto L_0x0375;
                case 22: goto L_0x0365;
                case 23: goto L_0x0355;
                case 24: goto L_0x0345;
                case 25: goto L_0x0335;
                case 26: goto L_0x0326;
                case 27: goto L_0x0313;
                case 28: goto L_0x0304;
                case 29: goto L_0x02f4;
                case 30: goto L_0x02e4;
                case 31: goto L_0x02d4;
                case 32: goto L_0x02c4;
                case 33: goto L_0x02b4;
                case 34: goto L_0x02a4;
                case 35: goto L_0x0294;
                case 36: goto L_0x0284;
                case 37: goto L_0x0274;
                case 38: goto L_0x0264;
                case 39: goto L_0x0254;
                case 40: goto L_0x0244;
                case 41: goto L_0x0234;
                case 42: goto L_0x0224;
                case 43: goto L_0x0214;
                case 44: goto L_0x0204;
                case 45: goto L_0x01f4;
                case 46: goto L_0x01e4;
                case 47: goto L_0x01d4;
                case 48: goto L_0x01c4;
                case 49: goto L_0x01b1;
                case 50: goto L_0x01a8;
                case 51: goto L_0x0193;
                case 52: goto L_0x017e;
                case 53: goto L_0x016f;
                case 54: goto L_0x0160;
                case 55: goto L_0x0151;
                case 56: goto L_0x0142;
                case 57: goto L_0x0133;
                case 58: goto L_0x011e;
                case 59: goto L_0x010f;
                case 60: goto L_0x00fc;
                case 61: goto L_0x00ec;
                case 62: goto L_0x00de;
                case 63: goto L_0x00d0;
                case 64: goto L_0x00c2;
                case 65: goto L_0x00b4;
                case 66: goto L_0x00a6;
                case 67: goto L_0x0098;
                case 68: goto L_0x0086;
                default: goto L_0x0083;
            }
        L_0x0083:
            r13 = 0
            goto L_0x049f
        L_0x0086:
            boolean r4 = r0.r(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = r8.getObject(r1, r9)
            j2.u r9 = r0.n(r12)
            r2.h(r14, r9, r4)
            goto L_0x0083
        L_0x0098:
            boolean r4 = r0.r(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            long r9 = B(r1, r9)
            r2.p(r14, r9)
            goto L_0x0083
        L_0x00a6:
            boolean r4 = r0.r(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            int r4 = A(r1, r9)
            r2.o(r14, r4)
            goto L_0x0083
        L_0x00b4:
            boolean r4 = r0.r(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            long r9 = B(r1, r9)
            r2.n(r14, r9)
            goto L_0x0083
        L_0x00c2:
            boolean r4 = r0.r(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            int r4 = A(r1, r9)
            r2.m(r14, r4)
            goto L_0x0083
        L_0x00d0:
            boolean r4 = r0.r(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            int r4 = A(r1, r9)
            r2.d(r14, r4)
            goto L_0x0083
        L_0x00de:
            boolean r4 = r0.r(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            int r4 = A(r1, r9)
            r2.q(r14, r4)
            goto L_0x0083
        L_0x00ec:
            boolean r4 = r0.r(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = r8.getObject(r1, r9)
            j2.c r4 = (j2.c) r4
            r2.b(r14, r4)
            goto L_0x0083
        L_0x00fc:
            boolean r4 = r0.r(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = r8.getObject(r1, r9)
            j2.u r9 = r0.n(r12)
            r2.k(r14, r9, r4)
            goto L_0x0083
        L_0x010f:
            boolean r4 = r0.r(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = r8.getObject(r1, r9)
            O(r14, r4, r2)
            goto L_0x0083
        L_0x011e:
            boolean r4 = r0.r(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = j2.y.n(r1, r9)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r2.a(r14, r4)
            goto L_0x0083
        L_0x0133:
            boolean r4 = r0.r(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            int r4 = A(r1, r9)
            r2.e(r14, r4)
            goto L_0x0083
        L_0x0142:
            boolean r4 = r0.r(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            long r9 = B(r1, r9)
            r2.f(r14, r9)
            goto L_0x0083
        L_0x0151:
            boolean r4 = r0.r(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            int r4 = A(r1, r9)
            r2.i(r14, r4)
            goto L_0x0083
        L_0x0160:
            boolean r4 = r0.r(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            long r9 = B(r1, r9)
            r2.r(r14, r9)
            goto L_0x0083
        L_0x016f:
            boolean r4 = r0.r(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            long r9 = B(r1, r9)
            r2.j(r14, r9)
            goto L_0x0083
        L_0x017e:
            boolean r4 = r0.r(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = j2.y.n(r1, r9)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r2.g(r14, r4)
            goto L_0x0083
        L_0x0193:
            boolean r4 = r0.r(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = j2.y.n(r1, r9)
            java.lang.Double r4 = (java.lang.Double) r4
            double r9 = r4.doubleValue()
            r2.c(r14, r9)
            goto L_0x0083
        L_0x01a8:
            java.lang.Object r4 = r8.getObject(r1, r9)
            r0.N(r2, r14, r4, r12)
            goto L_0x0083
        L_0x01b1:
            int[] r4 = r0.f2214a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            j2.u r10 = r0.n(r12)
            androidx.datastore.preferences.protobuf.g0.L(r4, r9, r2, r10)
            goto L_0x0083
        L_0x01c4:
            int[] r4 = r0.f2214a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 1
            androidx.datastore.preferences.protobuf.g0.S(r4, r9, r2, r13)
            goto L_0x0083
        L_0x01d4:
            r13 = 1
            int[] r4 = r0.f2214a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.g0.R(r4, r9, r2, r13)
            goto L_0x0083
        L_0x01e4:
            r13 = 1
            int[] r4 = r0.f2214a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.g0.Q(r4, r9, r2, r13)
            goto L_0x0083
        L_0x01f4:
            r13 = 1
            int[] r4 = r0.f2214a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.g0.P(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0204:
            r13 = 1
            int[] r4 = r0.f2214a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.g0.H(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0214:
            r13 = 1
            int[] r4 = r0.f2214a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.g0.U(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0224:
            r13 = 1
            int[] r4 = r0.f2214a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.g0.E(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0234:
            r13 = 1
            int[] r4 = r0.f2214a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.g0.I(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0244:
            r13 = 1
            int[] r4 = r0.f2214a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.g0.J(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0254:
            r13 = 1
            int[] r4 = r0.f2214a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.g0.M(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0264:
            r13 = 1
            int[] r4 = r0.f2214a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.g0.V(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0274:
            r13 = 1
            int[] r4 = r0.f2214a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.g0.N(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0284:
            r13 = 1
            int[] r4 = r0.f2214a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.g0.K(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0294:
            r13 = 1
            int[] r4 = r0.f2214a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.g0.G(r4, r9, r2, r13)
            goto L_0x0083
        L_0x02a4:
            int[] r4 = r0.f2214a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 0
            androidx.datastore.preferences.protobuf.g0.S(r4, r9, r2, r13)
            goto L_0x049f
        L_0x02b4:
            r13 = 0
            int[] r4 = r0.f2214a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.g0.R(r4, r9, r2, r13)
            goto L_0x049f
        L_0x02c4:
            r13 = 0
            int[] r4 = r0.f2214a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.g0.Q(r4, r9, r2, r13)
            goto L_0x049f
        L_0x02d4:
            r13 = 0
            int[] r4 = r0.f2214a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.g0.P(r4, r9, r2, r13)
            goto L_0x049f
        L_0x02e4:
            r13 = 0
            int[] r4 = r0.f2214a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.g0.H(r4, r9, r2, r13)
            goto L_0x049f
        L_0x02f4:
            r13 = 0
            int[] r4 = r0.f2214a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.g0.U(r4, r9, r2, r13)
            goto L_0x049f
        L_0x0304:
            int[] r4 = r0.f2214a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.g0.F(r4, r9, r2)
            goto L_0x0083
        L_0x0313:
            int[] r4 = r0.f2214a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            j2.u r10 = r0.n(r12)
            androidx.datastore.preferences.protobuf.g0.O(r4, r9, r2, r10)
            goto L_0x0083
        L_0x0326:
            int[] r4 = r0.f2214a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.g0.T(r4, r9, r2)
            goto L_0x0083
        L_0x0335:
            int[] r4 = r0.f2214a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 0
            androidx.datastore.preferences.protobuf.g0.E(r4, r9, r2, r13)
            goto L_0x049f
        L_0x0345:
            r13 = 0
            int[] r4 = r0.f2214a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.g0.I(r4, r9, r2, r13)
            goto L_0x049f
        L_0x0355:
            r13 = 0
            int[] r4 = r0.f2214a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.g0.J(r4, r9, r2, r13)
            goto L_0x049f
        L_0x0365:
            r13 = 0
            int[] r4 = r0.f2214a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.g0.M(r4, r9, r2, r13)
            goto L_0x049f
        L_0x0375:
            r13 = 0
            int[] r4 = r0.f2214a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.g0.V(r4, r9, r2, r13)
            goto L_0x049f
        L_0x0385:
            r13 = 0
            int[] r4 = r0.f2214a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.g0.N(r4, r9, r2, r13)
            goto L_0x049f
        L_0x0395:
            r13 = 0
            int[] r4 = r0.f2214a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.g0.K(r4, r9, r2, r13)
            goto L_0x049f
        L_0x03a5:
            r13 = 0
            int[] r4 = r0.f2214a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            androidx.datastore.preferences.protobuf.g0.G(r4, r9, r2, r13)
            goto L_0x049f
        L_0x03b5:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            java.lang.Object r4 = r8.getObject(r1, r9)
            j2.u r9 = r0.n(r12)
            r2.h(r14, r9, r4)
            goto L_0x049f
        L_0x03c6:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            long r9 = r8.getLong(r1, r9)
            r2.p(r14, r9)
            goto L_0x049f
        L_0x03d3:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            int r4 = r8.getInt(r1, r9)
            r2.o(r14, r4)
            goto L_0x049f
        L_0x03e0:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            long r9 = r8.getLong(r1, r9)
            r2.n(r14, r9)
            goto L_0x049f
        L_0x03ed:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            int r4 = r8.getInt(r1, r9)
            r2.m(r14, r4)
            goto L_0x049f
        L_0x03fa:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            int r4 = r8.getInt(r1, r9)
            r2.d(r14, r4)
            goto L_0x049f
        L_0x0407:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            int r4 = r8.getInt(r1, r9)
            r2.q(r14, r4)
            goto L_0x049f
        L_0x0414:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            java.lang.Object r4 = r8.getObject(r1, r9)
            j2.c r4 = (j2.c) r4
            r2.b(r14, r4)
            goto L_0x049f
        L_0x0423:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            java.lang.Object r4 = r8.getObject(r1, r9)
            j2.u r9 = r0.n(r12)
            r2.k(r14, r9, r4)
            goto L_0x049f
        L_0x0434:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            java.lang.Object r4 = r8.getObject(r1, r9)
            O(r14, r4, r2)
            goto L_0x049f
        L_0x0440:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            boolean r4 = j2.y.f(r1, r9)
            r2.a(r14, r4)
            goto L_0x049f
        L_0x044c:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            int r4 = r8.getInt(r1, r9)
            r2.e(r14, r4)
            goto L_0x049f
        L_0x0458:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            long r9 = r8.getLong(r1, r9)
            r2.f(r14, r9)
            goto L_0x049f
        L_0x0464:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            int r4 = r8.getInt(r1, r9)
            r2.i(r14, r4)
            goto L_0x049f
        L_0x0470:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            long r9 = r8.getLong(r1, r9)
            r2.r(r14, r9)
            goto L_0x049f
        L_0x047c:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            long r9 = r8.getLong(r1, r9)
            r2.j(r14, r9)
            goto L_0x049f
        L_0x0488:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            float r4 = j2.y.k(r1, r9)
            r2.g(r14, r4)
            goto L_0x049f
        L_0x0494:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x049f
            double r9 = j2.y.j(r1, r9)
            r2.c(r14, r9)
        L_0x049f:
            int r10 = r12 + 3
            goto L_0x002b
        L_0x04a3:
            if (r5 == 0) goto L_0x04ba
            androidx.datastore.preferences.protobuf.j<?> r4 = r0.f2229p
            r4.j(r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04b8
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x04a3
        L_0x04b8:
            r5 = 0
            goto L_0x04a3
        L_0x04ba:
            androidx.datastore.preferences.protobuf.j0<?, ?> r3 = r0.f2228o
            androidx.datastore.preferences.protobuf.k0 r1 = r3.g(r1)
            r3.s(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.b0.M(java.lang.Object, androidx.datastore.preferences.protobuf.g):void");
    }

    public final void N(g gVar, int i10, Object obj, int i11) {
        if (obj != null) {
            v.a<?, ?> c10 = this.f2230q.c(m(i11));
            w e10 = this.f2230q.e(obj);
            gVar.f2264a.getClass();
            for (Map.Entry entry : e10.entrySet()) {
                gVar.f2264a.y0(i10, 2);
                gVar.f2264a.A0(v.a(c10, entry.getKey(), entry.getValue()));
                v.b(gVar.f2264a, c10, entry.getKey(), entry.getValue());
            }
        }
    }

    public final void a(T t10, T t11) {
        t11.getClass();
        for (int i10 = 0; i10 < this.f2214a.length; i10 += 3) {
            int L = L(i10);
            long j10 = (long) (1048575 & L);
            int i11 = this.f2214a[i10];
            switch ((L & 267386880) >>> 20) {
                case 0:
                    if (!q(i10, t11)) {
                        break;
                    } else {
                        y.f11529d.m(t10, j10, y.j(t11, j10));
                        I(i10, t10);
                        break;
                    }
                case 1:
                    if (!q(i10, t11)) {
                        break;
                    } else {
                        y.f11529d.n(t10, j10, y.k(t11, j10));
                        I(i10, t10);
                        break;
                    }
                case 2:
                    if (!q(i10, t11)) {
                        break;
                    } else {
                        y.t(t10, j10, y.m(t11, j10));
                        I(i10, t10);
                        break;
                    }
                case 3:
                    if (!q(i10, t11)) {
                        break;
                    } else {
                        y.t(t10, j10, y.m(t11, j10));
                        I(i10, t10);
                        break;
                    }
                case 4:
                    if (!q(i10, t11)) {
                        break;
                    } else {
                        y.s(t10, y.l(t11, j10), j10);
                        I(i10, t10);
                        break;
                    }
                case 5:
                    if (!q(i10, t11)) {
                        break;
                    } else {
                        y.t(t10, j10, y.m(t11, j10));
                        I(i10, t10);
                        break;
                    }
                case 6:
                    if (!q(i10, t11)) {
                        break;
                    } else {
                        y.s(t10, y.l(t11, j10), j10);
                        I(i10, t10);
                        break;
                    }
                case 7:
                    if (!q(i10, t11)) {
                        break;
                    } else {
                        y.f11529d.k(t10, j10, y.f(t11, j10));
                        I(i10, t10);
                        break;
                    }
                case 8:
                    if (!q(i10, t11)) {
                        break;
                    } else {
                        y.u(t10, j10, y.n(t11, j10));
                        I(i10, t10);
                        break;
                    }
                case 9:
                    v(i10, t10, t11);
                    break;
                case 10:
                    if (!q(i10, t11)) {
                        break;
                    } else {
                        y.u(t10, j10, y.n(t11, j10));
                        I(i10, t10);
                        break;
                    }
                case 11:
                    if (!q(i10, t11)) {
                        break;
                    } else {
                        y.s(t10, y.l(t11, j10), j10);
                        I(i10, t10);
                        break;
                    }
                case 12:
                    if (!q(i10, t11)) {
                        break;
                    } else {
                        y.s(t10, y.l(t11, j10), j10);
                        I(i10, t10);
                        break;
                    }
                case 13:
                    if (!q(i10, t11)) {
                        break;
                    } else {
                        y.s(t10, y.l(t11, j10), j10);
                        I(i10, t10);
                        break;
                    }
                case 14:
                    if (!q(i10, t11)) {
                        break;
                    } else {
                        y.t(t10, j10, y.m(t11, j10));
                        I(i10, t10);
                        break;
                    }
                case 15:
                    if (!q(i10, t11)) {
                        break;
                    } else {
                        y.s(t10, y.l(t11, j10), j10);
                        I(i10, t10);
                        break;
                    }
                case 16:
                    if (!q(i10, t11)) {
                        break;
                    } else {
                        y.t(t10, j10, y.m(t11, j10));
                        I(i10, t10);
                        break;
                    }
                case 17:
                    v(i10, t10, t11);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f2227n.b(t10, j10, t11);
                    break;
                case 50:
                    x xVar = this.f2230q;
                    Class<?> cls = g0.f2265a;
                    y.u(t10, j10, xVar.a(y.n(t10, j10), y.n(t11, j10)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!r(t11, i11, i10)) {
                        break;
                    } else {
                        y.u(t10, j10, y.n(t11, j10));
                        J(t10, i11, i10);
                        break;
                    }
                case 60:
                    w(i10, t10, t11);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!r(t11, i11, i10)) {
                        break;
                    } else {
                        y.u(t10, j10, y.n(t11, j10));
                        J(t10, i11, i10);
                        break;
                    }
                case 68:
                    w(i10, t10, t11);
                    break;
            }
        }
        if (!this.f2221h) {
            j0<?, ?> j0Var = this.f2228o;
            Class<?> cls2 = g0.f2265a;
            j0Var.o(t10, j0Var.k(j0Var.g(t10), j0Var.g(t11)));
            if (this.f2219f) {
                g0.B(this.f2229p, t10, t11);
            }
        }
    }

    public final T b() {
        return this.f2226m.a(this.f2218e);
    }

    public final void c(T t10) {
        int i10;
        int i11 = this.f2224k;
        while (true) {
            i10 = this.f2225l;
            if (i11 >= i10) {
                break;
            }
            long L = (long) (L(this.f2223j[i11]) & 1048575);
            Object n10 = y.n(t10, L);
            if (n10 != null) {
                y.u(t10, L, this.f2230q.b(n10));
            }
            i11++;
        }
        int length = this.f2223j.length;
        while (i10 < length) {
            this.f2227n.a(t10, (long) this.f2223j[i10]);
            i10++;
        }
        this.f2228o.j(t10);
        if (this.f2219f) {
            this.f2229p.f(t10);
        }
    }

    public final boolean d(T t10) {
        int i10;
        boolean z10;
        boolean z11;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            boolean z12 = true;
            if (i12 < this.f2224k) {
                int i14 = this.f2223j[i12];
                int i15 = this.f2214a[i14];
                int L = L(i14);
                if (!this.f2221h) {
                    int i16 = this.f2214a[i14 + 2];
                    int i17 = i16 & 1048575;
                    i10 = 1 << (i16 >>> 20);
                    if (i17 != i11) {
                        i13 = f2213s.getInt(t10, (long) i17);
                        i11 = i17;
                    }
                } else {
                    i10 = 0;
                }
                if ((268435456 & L) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (this.f2221h) {
                        z11 = q(i14, t10);
                    } else if ((i13 & i10) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        return false;
                    }
                }
                int i18 = (267386880 & L) >>> 20;
                if (i18 == 9 || i18 == 17) {
                    if (this.f2221h) {
                        z12 = q(i14, t10);
                    } else if ((i13 & i10) == 0) {
                        z12 = false;
                    }
                    if (z12 && !n(i14).d(y.n(t10, (long) (L & 1048575)))) {
                        return false;
                    }
                } else {
                    if (i18 != 27) {
                        if (i18 == 60 || i18 == 68) {
                            if (r(t10, i15, i14) && !n(i14).d(y.n(t10, (long) (L & 1048575)))) {
                                return false;
                            }
                        } else if (i18 != 49) {
                            if (i18 != 50) {
                                continue;
                            } else {
                                w e10 = this.f2230q.e(y.n(t10, (long) (L & 1048575)));
                                if (!e10.isEmpty()) {
                                    if (this.f2230q.c(m(i14)).f2335c.f11539a == a0.MESSAGE) {
                                        u<?> uVar = null;
                                        Iterator it = e10.values().iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            Object next = it.next();
                                            if (uVar == null) {
                                                uVar = s.f11516c.a(next.getClass());
                                            }
                                            if (!uVar.d(next)) {
                                                z12 = false;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (!z12) {
                                    return false;
                                }
                            }
                        }
                    }
                    List list = (List) y.n(t10, (long) (L & 1048575));
                    if (!list.isEmpty()) {
                        u n10 = n(i14);
                        int i19 = 0;
                        while (true) {
                            if (i19 >= list.size()) {
                                break;
                            } else if (!n10.d(list.get(i19))) {
                                z12 = false;
                                break;
                            } else {
                                i19++;
                            }
                        }
                    }
                    if (!z12) {
                        return false;
                    }
                }
                i12++;
            } else if (!this.f2219f || this.f2229p.c(t10).i()) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
        if (androidx.datastore.preferences.protobuf.g0.C(j2.y.n(r10, r6), j2.y.n(r11, r6)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        if (androidx.datastore.preferences.protobuf.g0.C(j2.y.n(r10, r6), j2.y.n(r11, r6)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
        if (j2.y.m(r10, r6) == j2.y.m(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0097, code lost:
        if (j2.y.l(r10, r6) == j2.y.l(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ab, code lost:
        if (j2.y.m(r10, r6) == j2.y.m(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bd, code lost:
        if (j2.y.l(r10, r6) == j2.y.l(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cf, code lost:
        if (j2.y.l(r10, r6) == j2.y.l(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e1, code lost:
        if (j2.y.l(r10, r6) == j2.y.l(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f7, code lost:
        if (androidx.datastore.preferences.protobuf.g0.C(j2.y.n(r10, r6), j2.y.n(r11, r6)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010d, code lost:
        if (androidx.datastore.preferences.protobuf.g0.C(j2.y.n(r10, r6), j2.y.n(r11, r6)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0123, code lost:
        if (androidx.datastore.preferences.protobuf.g0.C(j2.y.n(r10, r6), j2.y.n(r11, r6)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0135, code lost:
        if (j2.y.f(r10, r6) == j2.y.f(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0147, code lost:
        if (j2.y.l(r10, r6) == j2.y.l(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x015b, code lost:
        if (j2.y.m(r10, r6) == j2.y.m(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x016d, code lost:
        if (j2.y.l(r10, r6) == j2.y.l(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0180, code lost:
        if (j2.y.m(r10, r6) == j2.y.m(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0193, code lost:
        if (j2.y.m(r10, r6) == j2.y.m(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ac, code lost:
        if (java.lang.Float.floatToIntBits(j2.y.k(r10, r6)) == java.lang.Float.floatToIntBits(j2.y.k(r11, r6))) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c7, code lost:
        if (java.lang.Double.doubleToLongBits(j2.y.j(r10, r6)) == java.lang.Double.doubleToLongBits(j2.y.j(r11, r6))) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ca, code lost:
        r3 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f2214a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01d2
            int r4 = r9.L(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x01af;
                case 1: goto L_0x0196;
                case 2: goto L_0x0183;
                case 3: goto L_0x0170;
                case 4: goto L_0x015f;
                case 5: goto L_0x014b;
                case 6: goto L_0x0139;
                case 7: goto L_0x0127;
                case 8: goto L_0x0111;
                case 9: goto L_0x00fb;
                case 10: goto L_0x00e5;
                case 11: goto L_0x00d3;
                case 12: goto L_0x00c1;
                case 13: goto L_0x00af;
                case 14: goto L_0x009b;
                case 15: goto L_0x0089;
                case 16: goto L_0x0075;
                case 17: goto L_0x005f;
                case 18: goto L_0x0051;
                case 19: goto L_0x0051;
                case 20: goto L_0x0051;
                case 21: goto L_0x0051;
                case 22: goto L_0x0051;
                case 23: goto L_0x0051;
                case 24: goto L_0x0051;
                case 25: goto L_0x0051;
                case 26: goto L_0x0051;
                case 27: goto L_0x0051;
                case 28: goto L_0x0051;
                case 29: goto L_0x0051;
                case 30: goto L_0x0051;
                case 31: goto L_0x0051;
                case 32: goto L_0x0051;
                case 33: goto L_0x0051;
                case 34: goto L_0x0051;
                case 35: goto L_0x0051;
                case 36: goto L_0x0051;
                case 37: goto L_0x0051;
                case 38: goto L_0x0051;
                case 39: goto L_0x0051;
                case 40: goto L_0x0051;
                case 41: goto L_0x0051;
                case 42: goto L_0x0051;
                case 43: goto L_0x0051;
                case 44: goto L_0x0051;
                case 45: goto L_0x0051;
                case 46: goto L_0x0051;
                case 47: goto L_0x0051;
                case 48: goto L_0x0051;
                case 49: goto L_0x0051;
                case 50: goto L_0x0043;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01cb
        L_0x001c:
            int[] r4 = r9.f2214a
            int r8 = r2 + 2
            r4 = r4[r8]
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = j2.y.l(r10, r4)
            int r4 = j2.y.l(r11, r4)
            if (r8 != r4) goto L_0x0030
            r4 = r3
            goto L_0x0031
        L_0x0030:
            r4 = r1
        L_0x0031:
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = j2.y.n(r10, r6)
            java.lang.Object r5 = j2.y.n(r11, r6)
            boolean r4 = androidx.datastore.preferences.protobuf.g0.C(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0043:
            java.lang.Object r3 = j2.y.n(r10, r6)
            java.lang.Object r4 = j2.y.n(r11, r6)
            boolean r3 = androidx.datastore.preferences.protobuf.g0.C(r3, r4)
            goto L_0x01cb
        L_0x0051:
            java.lang.Object r3 = j2.y.n(r10, r6)
            java.lang.Object r4 = j2.y.n(r11, r6)
            boolean r3 = androidx.datastore.preferences.protobuf.g0.C(r3, r4)
            goto L_0x01cb
        L_0x005f:
            boolean r4 = r9.j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = j2.y.n(r10, r6)
            java.lang.Object r5 = j2.y.n(r11, r6)
            boolean r4 = androidx.datastore.preferences.protobuf.g0.C(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0075:
            boolean r4 = r9.j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = j2.y.m(r10, r6)
            long r6 = j2.y.m(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0089:
            boolean r4 = r9.j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = j2.y.l(r10, r6)
            int r5 = j2.y.l(r11, r6)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x009b:
            boolean r4 = r9.j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = j2.y.m(r10, r6)
            long r6 = j2.y.m(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x00af:
            boolean r4 = r9.j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = j2.y.l(r10, r6)
            int r5 = j2.y.l(r11, r6)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x00c1:
            boolean r4 = r9.j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = j2.y.l(r10, r6)
            int r5 = j2.y.l(r11, r6)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x00d3:
            boolean r4 = r9.j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = j2.y.l(r10, r6)
            int r5 = j2.y.l(r11, r6)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x00e5:
            boolean r4 = r9.j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = j2.y.n(r10, r6)
            java.lang.Object r5 = j2.y.n(r11, r6)
            boolean r4 = androidx.datastore.preferences.protobuf.g0.C(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x00fb:
            boolean r4 = r9.j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = j2.y.n(r10, r6)
            java.lang.Object r5 = j2.y.n(r11, r6)
            boolean r4 = androidx.datastore.preferences.protobuf.g0.C(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0111:
            boolean r4 = r9.j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = j2.y.n(r10, r6)
            java.lang.Object r5 = j2.y.n(r11, r6)
            boolean r4 = androidx.datastore.preferences.protobuf.g0.C(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0127:
            boolean r4 = r9.j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            boolean r4 = j2.y.f(r10, r6)
            boolean r5 = j2.y.f(r11, r6)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x0139:
            boolean r4 = r9.j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = j2.y.l(r10, r6)
            int r5 = j2.y.l(r11, r6)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x014b:
            boolean r4 = r9.j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = j2.y.m(r10, r6)
            long r6 = j2.y.m(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x015f:
            boolean r4 = r9.j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = j2.y.l(r10, r6)
            int r5 = j2.y.l(r11, r6)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x0170:
            boolean r4 = r9.j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = j2.y.m(r10, r6)
            long r6 = j2.y.m(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0183:
            boolean r4 = r9.j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = j2.y.m(r10, r6)
            long r6 = j2.y.m(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0196:
            boolean r4 = r9.j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            float r4 = j2.y.k(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = j2.y.k(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x01af:
            boolean r4 = r9.j(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            double r4 = j2.y.j(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = j2.y.j(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x01ca:
            r3 = r1
        L_0x01cb:
            if (r3 != 0) goto L_0x01ce
            return r1
        L_0x01ce:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01d2:
            androidx.datastore.preferences.protobuf.j0<?, ?> r0 = r9.f2228o
            androidx.datastore.preferences.protobuf.k0 r0 = r0.g(r10)
            androidx.datastore.preferences.protobuf.j0<?, ?> r2 = r9.f2228o
            androidx.datastore.preferences.protobuf.k0 r2 = r2.g(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01e5
            return r1
        L_0x01e5:
            boolean r0 = r9.f2219f
            if (r0 == 0) goto L_0x01fa
            androidx.datastore.preferences.protobuf.j<?> r0 = r9.f2229p
            androidx.datastore.preferences.protobuf.l r10 = r0.c(r10)
            androidx.datastore.preferences.protobuf.j<?> r0 = r9.f2229p
            androidx.datastore.preferences.protobuf.l r11 = r0.c(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01fa:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.b0.e(java.lang.Object, java.lang.Object):boolean");
    }

    public final int f(T t10) {
        if (this.f2221h) {
            return p(t10);
        }
        return o(t10);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00de, code lost:
        if (r3 != false) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d9, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f3, code lost:
        if (r3 != false) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01f6, code lost:
        r8 = 1237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f7, code lost:
        r3 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0241, code lost:
        r2 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0243, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(T r11) {
        /*
            r10 = this;
            int[] r0 = r10.f2214a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x0247
            int r3 = r10.L(r1)
            int[] r4 = r10.f2214a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            r8 = 1231(0x4cf, float:1.725E-42)
            r9 = 1237(0x4d5, float:1.733E-42)
            switch(r3) {
                case 0: goto L_0x0233;
                case 1: goto L_0x0228;
                case 2: goto L_0x021d;
                case 3: goto L_0x0212;
                case 4: goto L_0x020b;
                case 5: goto L_0x0200;
                case 6: goto L_0x01f9;
                case 7: goto L_0x01eb;
                case 8: goto L_0x01de;
                case 9: goto L_0x01cf;
                case 10: goto L_0x01c3;
                case 11: goto L_0x01bb;
                case 12: goto L_0x01b3;
                case 13: goto L_0x01ab;
                case 14: goto L_0x019f;
                case 15: goto L_0x0197;
                case 16: goto L_0x018b;
                case 17: goto L_0x0180;
                case 18: goto L_0x0174;
                case 19: goto L_0x0174;
                case 20: goto L_0x0174;
                case 21: goto L_0x0174;
                case 22: goto L_0x0174;
                case 23: goto L_0x0174;
                case 24: goto L_0x0174;
                case 25: goto L_0x0174;
                case 26: goto L_0x0174;
                case 27: goto L_0x0174;
                case 28: goto L_0x0174;
                case 29: goto L_0x0174;
                case 30: goto L_0x0174;
                case 31: goto L_0x0174;
                case 32: goto L_0x0174;
                case 33: goto L_0x0174;
                case 34: goto L_0x0174;
                case 35: goto L_0x0174;
                case 36: goto L_0x0174;
                case 37: goto L_0x0174;
                case 38: goto L_0x0174;
                case 39: goto L_0x0174;
                case 40: goto L_0x0174;
                case 41: goto L_0x0174;
                case 42: goto L_0x0174;
                case 43: goto L_0x0174;
                case 44: goto L_0x0174;
                case 45: goto L_0x0174;
                case 46: goto L_0x0174;
                case 47: goto L_0x0174;
                case 48: goto L_0x0174;
                case 49: goto L_0x0174;
                case 50: goto L_0x0168;
                case 51: goto L_0x014c;
                case 52: goto L_0x0134;
                case 53: goto L_0x0122;
                case 54: goto L_0x0110;
                case 55: goto L_0x0102;
                case 56: goto L_0x00f0;
                case 57: goto L_0x00e2;
                case 58: goto L_0x00ca;
                case 59: goto L_0x00b6;
                case 60: goto L_0x00a4;
                case 61: goto L_0x0092;
                case 62: goto L_0x0084;
                case 63: goto L_0x0076;
                case 64: goto L_0x0068;
                case 65: goto L_0x0056;
                case 66: goto L_0x0048;
                case 67: goto L_0x0036;
                case 68: goto L_0x0024;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x0243
        L_0x0024:
            boolean r3 = r10.r(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            java.lang.Object r3 = j2.y.n(r11, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x0036:
            boolean r3 = r10.r(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            long r3 = B(r11, r5)
            int r3 = androidx.datastore.preferences.protobuf.p.a(r3)
            goto L_0x0241
        L_0x0048:
            boolean r3 = r10.r(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = A(r11, r5)
            goto L_0x0241
        L_0x0056:
            boolean r3 = r10.r(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            long r3 = B(r11, r5)
            int r3 = androidx.datastore.preferences.protobuf.p.a(r3)
            goto L_0x0241
        L_0x0068:
            boolean r3 = r10.r(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = A(r11, r5)
            goto L_0x0241
        L_0x0076:
            boolean r3 = r10.r(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = A(r11, r5)
            goto L_0x0241
        L_0x0084:
            boolean r3 = r10.r(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = A(r11, r5)
            goto L_0x0241
        L_0x0092:
            boolean r3 = r10.r(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            java.lang.Object r3 = j2.y.n(r11, r5)
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x00a4:
            boolean r3 = r10.r(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            java.lang.Object r3 = j2.y.n(r11, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x00b6:
            boolean r3 = r10.r(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            java.lang.Object r3 = j2.y.n(r11, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x00ca:
            boolean r3 = r10.r(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            java.lang.Object r3 = j2.y.n(r11, r5)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.nio.charset.Charset r4 = androidx.datastore.preferences.protobuf.p.f2318a
            if (r3 == 0) goto L_0x01f6
            goto L_0x01f7
        L_0x00e2:
            boolean r3 = r10.r(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = A(r11, r5)
            goto L_0x0241
        L_0x00f0:
            boolean r3 = r10.r(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            long r3 = B(r11, r5)
            int r3 = androidx.datastore.preferences.protobuf.p.a(r3)
            goto L_0x0241
        L_0x0102:
            boolean r3 = r10.r(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = A(r11, r5)
            goto L_0x0241
        L_0x0110:
            boolean r3 = r10.r(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            long r3 = B(r11, r5)
            int r3 = androidx.datastore.preferences.protobuf.p.a(r3)
            goto L_0x0241
        L_0x0122:
            boolean r3 = r10.r(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            long r3 = B(r11, r5)
            int r3 = androidx.datastore.preferences.protobuf.p.a(r3)
            goto L_0x0241
        L_0x0134:
            boolean r3 = r10.r(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            java.lang.Object r3 = j2.y.n(r11, r5)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0241
        L_0x014c:
            boolean r3 = r10.r(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            java.lang.Object r3 = j2.y.n(r11, r5)
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = androidx.datastore.preferences.protobuf.p.a(r3)
            goto L_0x0241
        L_0x0168:
            int r2 = r2 * 53
            java.lang.Object r3 = j2.y.n(r11, r5)
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x0174:
            int r2 = r2 * 53
            java.lang.Object r3 = j2.y.n(r11, r5)
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x0180:
            java.lang.Object r3 = j2.y.n(r11, r5)
            if (r3 == 0) goto L_0x01d9
            int r7 = r3.hashCode()
            goto L_0x01d9
        L_0x018b:
            int r2 = r2 * 53
            long r3 = j2.y.m(r11, r5)
            int r3 = androidx.datastore.preferences.protobuf.p.a(r3)
            goto L_0x0241
        L_0x0197:
            int r2 = r2 * 53
            int r3 = j2.y.l(r11, r5)
            goto L_0x0241
        L_0x019f:
            int r2 = r2 * 53
            long r3 = j2.y.m(r11, r5)
            int r3 = androidx.datastore.preferences.protobuf.p.a(r3)
            goto L_0x0241
        L_0x01ab:
            int r2 = r2 * 53
            int r3 = j2.y.l(r11, r5)
            goto L_0x0241
        L_0x01b3:
            int r2 = r2 * 53
            int r3 = j2.y.l(r11, r5)
            goto L_0x0241
        L_0x01bb:
            int r2 = r2 * 53
            int r3 = j2.y.l(r11, r5)
            goto L_0x0241
        L_0x01c3:
            int r2 = r2 * 53
            java.lang.Object r3 = j2.y.n(r11, r5)
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x01cf:
            java.lang.Object r3 = j2.y.n(r11, r5)
            if (r3 == 0) goto L_0x01d9
            int r7 = r3.hashCode()
        L_0x01d9:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0243
        L_0x01de:
            int r2 = r2 * 53
            java.lang.Object r3 = j2.y.n(r11, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x01eb:
            int r2 = r2 * 53
            boolean r3 = j2.y.f(r11, r5)
            java.nio.charset.Charset r4 = androidx.datastore.preferences.protobuf.p.f2318a
            if (r3 == 0) goto L_0x01f6
            goto L_0x01f7
        L_0x01f6:
            r8 = r9
        L_0x01f7:
            r3 = r8
            goto L_0x0241
        L_0x01f9:
            int r2 = r2 * 53
            int r3 = j2.y.l(r11, r5)
            goto L_0x0241
        L_0x0200:
            int r2 = r2 * 53
            long r3 = j2.y.m(r11, r5)
            int r3 = androidx.datastore.preferences.protobuf.p.a(r3)
            goto L_0x0241
        L_0x020b:
            int r2 = r2 * 53
            int r3 = j2.y.l(r11, r5)
            goto L_0x0241
        L_0x0212:
            int r2 = r2 * 53
            long r3 = j2.y.m(r11, r5)
            int r3 = androidx.datastore.preferences.protobuf.p.a(r3)
            goto L_0x0241
        L_0x021d:
            int r2 = r2 * 53
            long r3 = j2.y.m(r11, r5)
            int r3 = androidx.datastore.preferences.protobuf.p.a(r3)
            goto L_0x0241
        L_0x0228:
            int r2 = r2 * 53
            float r3 = j2.y.k(r11, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0241
        L_0x0233:
            int r2 = r2 * 53
            double r3 = j2.y.j(r11, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = androidx.datastore.preferences.protobuf.p.a(r3)
        L_0x0241:
            int r3 = r3 + r2
            r2 = r3
        L_0x0243:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x0247:
            int r2 = r2 * 53
            androidx.datastore.preferences.protobuf.j0<?, ?> r0 = r10.f2228o
            androidx.datastore.preferences.protobuf.k0 r0 = r0.g(r11)
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r1 = r10.f2219f
            if (r1 == 0) goto L_0x0265
            int r0 = r0 * 53
            androidx.datastore.preferences.protobuf.j<?> r1 = r10.f2229p
            androidx.datastore.preferences.protobuf.l r11 = r1.c(r11)
            int r11 = r11.hashCode()
            int r0 = r0 + r11
        L_0x0265:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.b0.g(java.lang.Object):int");
    }

    public final void h(T t10, f0 f0Var, i iVar) {
        iVar.getClass();
        t(this.f2228o, this.f2229p, t10, f0Var, iVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0369  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x03cf  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x03f5  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0417  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0428  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0439  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x046e  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0494  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x04a5  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x04b5  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x04c5  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x04d5  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x04e5  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x04f5  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0505  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x051a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0514 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0358  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(java.lang.Object r13, androidx.datastore.preferences.protobuf.g r14) {
        /*
            r12 = this;
            r14.getClass()
            boolean r0 = r12.f2221h
            if (r0 == 0) goto L_0x0538
            boolean r0 = r12.f2219f
            r1 = 0
            if (r0 == 0) goto L_0x0023
            androidx.datastore.preferences.protobuf.j<?> r0 = r12.f2229p
            androidx.datastore.preferences.protobuf.l r0 = r0.c(r13)
            boolean r2 = r0.h()
            if (r2 != 0) goto L_0x0023
            java.util.Iterator r0 = r0.k()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0025
        L_0x0023:
            r0 = r1
            r2 = r0
        L_0x0025:
            int[] r3 = r12.f2214a
            int r3 = r3.length
            r4 = 0
            r5 = r4
        L_0x002a:
            if (r5 >= r3) goto L_0x0518
            int r6 = r12.L(r5)
            int[] r7 = r12.f2214a
            r7 = r7[r5]
        L_0x0034:
            if (r2 == 0) goto L_0x0051
            androidx.datastore.preferences.protobuf.j<?> r8 = r12.f2229p
            r8.a(r2)
            if (r7 < 0) goto L_0x0051
            androidx.datastore.preferences.protobuf.j<?> r8 = r12.f2229p
            r8.j(r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004f
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0034
        L_0x004f:
            r2 = r1
            goto L_0x0034
        L_0x0051:
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r8 = r8 & r6
            int r8 = r8 >>> 20
            r9 = 1
            r10 = 1048575(0xfffff, float:1.469367E-39)
            switch(r8) {
                case 0: goto L_0x0505;
                case 1: goto L_0x04f5;
                case 2: goto L_0x04e5;
                case 3: goto L_0x04d5;
                case 4: goto L_0x04c5;
                case 5: goto L_0x04b5;
                case 6: goto L_0x04a5;
                case 7: goto L_0x0494;
                case 8: goto L_0x0483;
                case 9: goto L_0x046e;
                case 10: goto L_0x045b;
                case 11: goto L_0x044a;
                case 12: goto L_0x0439;
                case 13: goto L_0x0428;
                case 14: goto L_0x0417;
                case 15: goto L_0x0406;
                case 16: goto L_0x03f5;
                case 17: goto L_0x03e0;
                case 18: goto L_0x03cf;
                case 19: goto L_0x03be;
                case 20: goto L_0x03ad;
                case 21: goto L_0x039c;
                case 22: goto L_0x038b;
                case 23: goto L_0x037a;
                case 24: goto L_0x0369;
                case 25: goto L_0x0358;
                case 26: goto L_0x0347;
                case 27: goto L_0x0332;
                case 28: goto L_0x0321;
                case 29: goto L_0x0310;
                case 30: goto L_0x02ff;
                case 31: goto L_0x02ee;
                case 32: goto L_0x02dd;
                case 33: goto L_0x02cc;
                case 34: goto L_0x02bb;
                case 35: goto L_0x02aa;
                case 36: goto L_0x0299;
                case 37: goto L_0x0288;
                case 38: goto L_0x0277;
                case 39: goto L_0x0266;
                case 40: goto L_0x0255;
                case 41: goto L_0x0244;
                case 42: goto L_0x0233;
                case 43: goto L_0x0222;
                case 44: goto L_0x0211;
                case 45: goto L_0x0200;
                case 46: goto L_0x01ef;
                case 47: goto L_0x01de;
                case 48: goto L_0x01cd;
                case 49: goto L_0x01b8;
                case 50: goto L_0x01ad;
                case 51: goto L_0x0196;
                case 52: goto L_0x017f;
                case 53: goto L_0x016e;
                case 54: goto L_0x015d;
                case 55: goto L_0x014c;
                case 56: goto L_0x013b;
                case 57: goto L_0x012a;
                case 58: goto L_0x0113;
                case 59: goto L_0x0102;
                case 60: goto L_0x00ed;
                case 61: goto L_0x00da;
                case 62: goto L_0x00c9;
                case 63: goto L_0x00b8;
                case 64: goto L_0x00a7;
                case 65: goto L_0x0096;
                case 66: goto L_0x0085;
                case 67: goto L_0x0074;
                case 68: goto L_0x005f;
                default: goto L_0x005d;
            }
        L_0x005d:
            goto L_0x0514
        L_0x005f:
            boolean r8 = r12.r(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r8)
            j2.u r8 = r12.n(r5)
            r14.h(r7, r8, r6)
            goto L_0x0514
        L_0x0074:
            boolean r8 = r12.r(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = B(r13, r8)
            r14.p(r7, r8)
            goto L_0x0514
        L_0x0085:
            boolean r8 = r12.r(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = A(r13, r8)
            r14.o(r7, r6)
            goto L_0x0514
        L_0x0096:
            boolean r8 = r12.r(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = B(r13, r8)
            r14.n(r7, r8)
            goto L_0x0514
        L_0x00a7:
            boolean r8 = r12.r(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = A(r13, r8)
            r14.m(r7, r6)
            goto L_0x0514
        L_0x00b8:
            boolean r8 = r12.r(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = A(r13, r8)
            r14.d(r7, r6)
            goto L_0x0514
        L_0x00c9:
            boolean r8 = r12.r(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = A(r13, r8)
            r14.q(r7, r6)
            goto L_0x0514
        L_0x00da:
            boolean r8 = r12.r(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r8)
            j2.c r6 = (j2.c) r6
            r14.b(r7, r6)
            goto L_0x0514
        L_0x00ed:
            boolean r8 = r12.r(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r8)
            j2.u r8 = r12.n(r5)
            r14.k(r7, r8, r6)
            goto L_0x0514
        L_0x0102:
            boolean r8 = r12.r(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r8)
            O(r7, r6, r14)
            goto L_0x0514
        L_0x0113:
            boolean r8 = r12.r(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r8)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r14.a(r7, r6)
            goto L_0x0514
        L_0x012a:
            boolean r8 = r12.r(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = A(r13, r8)
            r14.e(r7, r6)
            goto L_0x0514
        L_0x013b:
            boolean r8 = r12.r(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = B(r13, r8)
            r14.f(r7, r8)
            goto L_0x0514
        L_0x014c:
            boolean r8 = r12.r(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = A(r13, r8)
            r14.i(r7, r6)
            goto L_0x0514
        L_0x015d:
            boolean r8 = r12.r(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = B(r13, r8)
            r14.r(r7, r8)
            goto L_0x0514
        L_0x016e:
            boolean r8 = r12.r(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = B(r13, r8)
            r14.j(r7, r8)
            goto L_0x0514
        L_0x017f:
            boolean r8 = r12.r(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r8)
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r14.g(r7, r6)
            goto L_0x0514
        L_0x0196:
            boolean r8 = r12.r(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r8)
            java.lang.Double r6 = (java.lang.Double) r6
            double r8 = r6.doubleValue()
            r14.c(r7, r8)
            goto L_0x0514
        L_0x01ad:
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r8)
            r12.N(r14, r7, r6, r5)
            goto L_0x0514
        L_0x01b8:
            int[] r7 = r12.f2214a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            j2.u r8 = r12.n(r5)
            androidx.datastore.preferences.protobuf.g0.L(r7, r6, r14, r8)
            goto L_0x0514
        L_0x01cd:
            int[] r7 = r12.f2214a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.S(r7, r6, r14, r9)
            goto L_0x0514
        L_0x01de:
            int[] r7 = r12.f2214a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.R(r7, r6, r14, r9)
            goto L_0x0514
        L_0x01ef:
            int[] r7 = r12.f2214a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.Q(r7, r6, r14, r9)
            goto L_0x0514
        L_0x0200:
            int[] r7 = r12.f2214a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.P(r7, r6, r14, r9)
            goto L_0x0514
        L_0x0211:
            int[] r7 = r12.f2214a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.H(r7, r6, r14, r9)
            goto L_0x0514
        L_0x0222:
            int[] r7 = r12.f2214a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.U(r7, r6, r14, r9)
            goto L_0x0514
        L_0x0233:
            int[] r7 = r12.f2214a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.E(r7, r6, r14, r9)
            goto L_0x0514
        L_0x0244:
            int[] r7 = r12.f2214a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.I(r7, r6, r14, r9)
            goto L_0x0514
        L_0x0255:
            int[] r7 = r12.f2214a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.J(r7, r6, r14, r9)
            goto L_0x0514
        L_0x0266:
            int[] r7 = r12.f2214a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.M(r7, r6, r14, r9)
            goto L_0x0514
        L_0x0277:
            int[] r7 = r12.f2214a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.V(r7, r6, r14, r9)
            goto L_0x0514
        L_0x0288:
            int[] r7 = r12.f2214a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.N(r7, r6, r14, r9)
            goto L_0x0514
        L_0x0299:
            int[] r7 = r12.f2214a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.K(r7, r6, r14, r9)
            goto L_0x0514
        L_0x02aa:
            int[] r7 = r12.f2214a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.G(r7, r6, r14, r9)
            goto L_0x0514
        L_0x02bb:
            int[] r7 = r12.f2214a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.S(r7, r6, r14, r4)
            goto L_0x0514
        L_0x02cc:
            int[] r7 = r12.f2214a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.R(r7, r6, r14, r4)
            goto L_0x0514
        L_0x02dd:
            int[] r7 = r12.f2214a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.Q(r7, r6, r14, r4)
            goto L_0x0514
        L_0x02ee:
            int[] r7 = r12.f2214a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.P(r7, r6, r14, r4)
            goto L_0x0514
        L_0x02ff:
            int[] r7 = r12.f2214a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.H(r7, r6, r14, r4)
            goto L_0x0514
        L_0x0310:
            int[] r7 = r12.f2214a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.U(r7, r6, r14, r4)
            goto L_0x0514
        L_0x0321:
            int[] r7 = r12.f2214a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.F(r7, r6, r14)
            goto L_0x0514
        L_0x0332:
            int[] r7 = r12.f2214a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            j2.u r8 = r12.n(r5)
            androidx.datastore.preferences.protobuf.g0.O(r7, r6, r14, r8)
            goto L_0x0514
        L_0x0347:
            int[] r7 = r12.f2214a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.T(r7, r6, r14)
            goto L_0x0514
        L_0x0358:
            int[] r7 = r12.f2214a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.E(r7, r6, r14, r4)
            goto L_0x0514
        L_0x0369:
            int[] r7 = r12.f2214a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.I(r7, r6, r14, r4)
            goto L_0x0514
        L_0x037a:
            int[] r7 = r12.f2214a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.J(r7, r6, r14, r4)
            goto L_0x0514
        L_0x038b:
            int[] r7 = r12.f2214a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.M(r7, r6, r14, r4)
            goto L_0x0514
        L_0x039c:
            int[] r7 = r12.f2214a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.V(r7, r6, r14, r4)
            goto L_0x0514
        L_0x03ad:
            int[] r7 = r12.f2214a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.N(r7, r6, r14, r4)
            goto L_0x0514
        L_0x03be:
            int[] r7 = r12.f2214a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.K(r7, r6, r14, r4)
            goto L_0x0514
        L_0x03cf:
            int[] r7 = r12.f2214a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.g0.G(r7, r6, r14, r4)
            goto L_0x0514
        L_0x03e0:
            boolean r8 = r12.q(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r8)
            j2.u r8 = r12.n(r5)
            r14.h(r7, r8, r6)
            goto L_0x0514
        L_0x03f5:
            boolean r8 = r12.q(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = j2.y.m(r13, r8)
            r14.p(r7, r8)
            goto L_0x0514
        L_0x0406:
            boolean r8 = r12.q(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = j2.y.l(r13, r8)
            r14.o(r7, r6)
            goto L_0x0514
        L_0x0417:
            boolean r8 = r12.q(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = j2.y.m(r13, r8)
            r14.n(r7, r8)
            goto L_0x0514
        L_0x0428:
            boolean r8 = r12.q(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = j2.y.l(r13, r8)
            r14.m(r7, r6)
            goto L_0x0514
        L_0x0439:
            boolean r8 = r12.q(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = j2.y.l(r13, r8)
            r14.d(r7, r6)
            goto L_0x0514
        L_0x044a:
            boolean r8 = r12.q(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = j2.y.l(r13, r8)
            r14.q(r7, r6)
            goto L_0x0514
        L_0x045b:
            boolean r8 = r12.q(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r8)
            j2.c r6 = (j2.c) r6
            r14.b(r7, r6)
            goto L_0x0514
        L_0x046e:
            boolean r8 = r12.q(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r8)
            j2.u r8 = r12.n(r5)
            r14.k(r7, r8, r6)
            goto L_0x0514
        L_0x0483:
            boolean r8 = r12.q(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j2.y.n(r13, r8)
            O(r7, r6, r14)
            goto L_0x0514
        L_0x0494:
            boolean r8 = r12.q(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            boolean r6 = j2.y.f(r13, r8)
            r14.a(r7, r6)
            goto L_0x0514
        L_0x04a5:
            boolean r8 = r12.q(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = j2.y.l(r13, r8)
            r14.e(r7, r6)
            goto L_0x0514
        L_0x04b5:
            boolean r8 = r12.q(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = j2.y.m(r13, r8)
            r14.f(r7, r8)
            goto L_0x0514
        L_0x04c5:
            boolean r8 = r12.q(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = j2.y.l(r13, r8)
            r14.i(r7, r6)
            goto L_0x0514
        L_0x04d5:
            boolean r8 = r12.q(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = j2.y.m(r13, r8)
            r14.r(r7, r8)
            goto L_0x0514
        L_0x04e5:
            boolean r8 = r12.q(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = j2.y.m(r13, r8)
            r14.j(r7, r8)
            goto L_0x0514
        L_0x04f5:
            boolean r8 = r12.q(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            float r6 = j2.y.k(r13, r8)
            r14.g(r7, r6)
            goto L_0x0514
        L_0x0505:
            boolean r8 = r12.q(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            double r8 = j2.y.j(r13, r8)
            r14.c(r7, r8)
        L_0x0514:
            int r5 = r5 + 3
            goto L_0x002a
        L_0x0518:
            if (r2 == 0) goto L_0x052e
            androidx.datastore.preferences.protobuf.j<?> r3 = r12.f2229p
            r3.j(r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x052c
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0518
        L_0x052c:
            r2 = r1
            goto L_0x0518
        L_0x052e:
            androidx.datastore.preferences.protobuf.j0<?, ?> r0 = r12.f2228o
            androidx.datastore.preferences.protobuf.k0 r13 = r0.g(r13)
            r0.s(r13, r14)
            goto L_0x053b
        L_0x0538:
            r12.M(r13, r14)
        L_0x053b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.b0.i(java.lang.Object, androidx.datastore.preferences.protobuf.g):void");
    }

    public final boolean j(int i10, Object obj, Object obj2) {
        if (q(i10, obj) == q(i10, obj2)) {
            return true;
        }
        return false;
    }

    public final <UT, UB> UB k(Object obj, int i10, UB ub2, j0<UT, UB> j0Var) {
        p.b l10;
        int i11 = this.f2214a[i10];
        Object n10 = y.n(obj, (long) (L(i10) & 1048575));
        if (n10 == null || (l10 = l(i10)) == null) {
            return ub2;
        }
        w g2 = this.f2230q.g(n10);
        v.a<?, ?> c10 = this.f2230q.c(m(i10));
        Iterator it = g2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((Integer) entry.getValue()).intValue();
            if (!l10.a()) {
                if (ub2 == null) {
                    ub2 = j0Var.m();
                }
                int a10 = v.a(c10, entry.getKey(), entry.getValue());
                byte[] bArr = new byte[a10];
                Logger logger = CodedOutputStream.f2201c;
                CodedOutputStream.b bVar = new CodedOutputStream.b(bArr, a10);
                try {
                    v.b(bVar, c10, entry.getKey(), entry.getValue());
                    if (bVar.f2208f - bVar.f2209n == 0) {
                        j0Var.d(ub2, i11, new c.e(bArr));
                        it.remove();
                    } else {
                        throw new IllegalStateException("Did not write as much data as expected.");
                    }
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    public final p.b l(int i10) {
        return (p.b) this.f2215b[((i10 / 3) * 2) + 1];
    }

    public final Object m(int i10) {
        return this.f2215b[(i10 / 3) * 2];
    }

    public final u n(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f2215b;
        u uVar = (u) objArr[i11];
        if (uVar != null) {
            return uVar;
        }
        u a10 = s.f11516c.a((Class) objArr[i11 + 1]);
        this.f2215b[i11] = a10;
        return a10;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x033b, code lost:
        r6 = ((r9 + r4) + r3) + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x049b, code lost:
        r6 = r3 + r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int o(T r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = f2213s
            r4 = -1
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x000a:
            int[] r8 = r0.f2214a
            int r8 = r8.length
            if (r5 >= r8) goto L_0x04ff
            int r8 = r0.L(r5)
            int[] r9 = r0.f2214a
            r10 = r9[r5]
            r11 = 267386880(0xff00000, float:2.3665827E-29)
            r11 = r11 & r8
            int r11 = r11 >>> 20
            r12 = 17
            r13 = 1
            r14 = 1048575(0xfffff, float:1.469367E-39)
            if (r11 > r12) goto L_0x0036
            int r12 = r5 + 2
            r9 = r9[r12]
            r12 = r9 & r14
            int r15 = r9 >>> 20
            int r13 = r13 << r15
            if (r12 == r4) goto L_0x0055
            long r3 = (long) r12
            int r7 = r2.getInt(r1, r3)
            r4 = r12
            goto L_0x0055
        L_0x0036:
            boolean r3 = r0.f2222i
            if (r3 == 0) goto L_0x0053
            j2.f r3 = j2.f.DOUBLE_LIST_PACKED
            int r3 = r3.b()
            if (r11 < r3) goto L_0x0053
            j2.f r3 = j2.f.SINT64_LIST_PACKED
            int r3 = r3.b()
            if (r11 > r3) goto L_0x0053
            int[] r3 = r0.f2214a
            int r9 = r5 + 2
            r3 = r3[r9]
            r3 = r3 & r14
            r9 = r3
            goto L_0x0054
        L_0x0053:
            r9 = 0
        L_0x0054:
            r13 = 0
        L_0x0055:
            r3 = r8 & r14
            r8 = r4
            long r3 = (long) r3
            switch(r11) {
                case 0: goto L_0x04f0;
                case 1: goto L_0x04e6;
                case 2: goto L_0x04d8;
                case 3: goto L_0x04ca;
                case 4: goto L_0x04bc;
                case 5: goto L_0x04b2;
                case 6: goto L_0x04a8;
                case 7: goto L_0x049e;
                case 8: goto L_0x0482;
                case 9: goto L_0x0470;
                case 10: goto L_0x0461;
                case 11: goto L_0x0454;
                case 12: goto L_0x0447;
                case 13: goto L_0x043e;
                case 14: goto L_0x0435;
                case 15: goto L_0x0428;
                case 16: goto L_0x041b;
                case 17: goto L_0x0408;
                case 18: goto L_0x03fd;
                case 19: goto L_0x03f0;
                case 20: goto L_0x03e5;
                case 21: goto L_0x03da;
                case 22: goto L_0x03cf;
                case 23: goto L_0x03c4;
                case 24: goto L_0x03b9;
                case 25: goto L_0x03ae;
                case 26: goto L_0x03a3;
                case 27: goto L_0x0394;
                case 28: goto L_0x0389;
                case 29: goto L_0x037d;
                case 30: goto L_0x0371;
                case 31: goto L_0x0365;
                case 32: goto L_0x0359;
                case 33: goto L_0x034d;
                case 34: goto L_0x0341;
                case 35: goto L_0x031f;
                case 36: goto L_0x0302;
                case 37: goto L_0x02e5;
                case 38: goto L_0x02c8;
                case 39: goto L_0x02aa;
                case 40: goto L_0x028c;
                case 41: goto L_0x026e;
                case 42: goto L_0x0250;
                case 43: goto L_0x0232;
                case 44: goto L_0x0214;
                case 45: goto L_0x01f6;
                case 46: goto L_0x01d8;
                case 47: goto L_0x01ba;
                case 48: goto L_0x019c;
                case 49: goto L_0x018c;
                case 50: goto L_0x017c;
                case 51: goto L_0x0170;
                case 52: goto L_0x0164;
                case 53: goto L_0x0154;
                case 54: goto L_0x0144;
                case 55: goto L_0x0134;
                case 56: goto L_0x0128;
                case 57: goto L_0x011c;
                case 58: goto L_0x0110;
                case 59: goto L_0x00f2;
                case 60: goto L_0x00de;
                case 61: goto L_0x00cc;
                case 62: goto L_0x00bc;
                case 63: goto L_0x00ac;
                case 64: goto L_0x00a0;
                case 65: goto L_0x0094;
                case 66: goto L_0x0084;
                case 67: goto L_0x0074;
                case 68: goto L_0x005e;
                default: goto L_0x005c;
            }
        L_0x005c:
            goto L_0x04fa
        L_0x005e:
            boolean r9 = r0.r(r1, r10, r5)
            if (r9 == 0) goto L_0x04fa
            java.lang.Object r3 = r2.getObject(r1, r3)
            androidx.datastore.preferences.protobuf.z r3 = (androidx.datastore.preferences.protobuf.z) r3
            j2.u r4 = r0.n(r5)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.Q(r10, r3, r4)
            goto L_0x03fa
        L_0x0074:
            boolean r9 = r0.r(r1, r10, r5)
            if (r9 == 0) goto L_0x04fa
            long r3 = B(r1, r3)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.Y(r10, r3)
            goto L_0x03fa
        L_0x0084:
            boolean r9 = r0.r(r1, r10, r5)
            if (r9 == 0) goto L_0x04fa
            int r3 = A(r1, r3)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.X(r10, r3)
            goto L_0x03fa
        L_0x0094:
            boolean r3 = r0.r(r1, r10, r5)
            if (r3 == 0) goto L_0x04fa
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.W(r10)
            goto L_0x03fa
        L_0x00a0:
            boolean r3 = r0.r(r1, r10, r5)
            if (r3 == 0) goto L_0x04fa
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.V(r10)
            goto L_0x03fa
        L_0x00ac:
            boolean r9 = r0.r(r1, r10, r5)
            if (r9 == 0) goto L_0x04fa
            int r3 = A(r1, r3)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.M(r10, r3)
            goto L_0x03fa
        L_0x00bc:
            boolean r9 = r0.r(r1, r10, r5)
            if (r9 == 0) goto L_0x04fa
            int r3 = A(r1, r3)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.c0(r10, r3)
            goto L_0x03fa
        L_0x00cc:
            boolean r9 = r0.r(r1, r10, r5)
            if (r9 == 0) goto L_0x04fa
            java.lang.Object r3 = r2.getObject(r1, r3)
            j2.c r3 = (j2.c) r3
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.K(r10, r3)
            goto L_0x03fa
        L_0x00de:
            boolean r9 = r0.r(r1, r10, r5)
            if (r9 == 0) goto L_0x04fa
            java.lang.Object r3 = r2.getObject(r1, r3)
            j2.u r4 = r0.n(r5)
            int r3 = androidx.datastore.preferences.protobuf.g0.o(r10, r4, r3)
            goto L_0x03fa
        L_0x00f2:
            boolean r9 = r0.r(r1, r10, r5)
            if (r9 == 0) goto L_0x04fa
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof j2.c
            if (r4 == 0) goto L_0x0108
            j2.c r3 = (j2.c) r3
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.K(r10, r3)
            goto L_0x049b
        L_0x0108:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.Z(r10, r3)
            goto L_0x049b
        L_0x0110:
            boolean r3 = r0.r(r1, r10, r5)
            if (r3 == 0) goto L_0x04fa
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.J(r10)
            goto L_0x03fa
        L_0x011c:
            boolean r3 = r0.r(r1, r10, r5)
            if (r3 == 0) goto L_0x04fa
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.N(r10)
            goto L_0x03fa
        L_0x0128:
            boolean r3 = r0.r(r1, r10, r5)
            if (r3 == 0) goto L_0x04fa
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.O(r10)
            goto L_0x03fa
        L_0x0134:
            boolean r9 = r0.r(r1, r10, r5)
            if (r9 == 0) goto L_0x04fa
            int r3 = A(r1, r3)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.R(r10, r3)
            goto L_0x03fa
        L_0x0144:
            boolean r9 = r0.r(r1, r10, r5)
            if (r9 == 0) goto L_0x04fa
            long r3 = B(r1, r3)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.e0(r10, r3)
            goto L_0x03fa
        L_0x0154:
            boolean r9 = r0.r(r1, r10, r5)
            if (r9 == 0) goto L_0x04fa
            long r3 = B(r1, r3)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.T(r10, r3)
            goto L_0x03fa
        L_0x0164:
            boolean r3 = r0.r(r1, r10, r5)
            if (r3 == 0) goto L_0x04fa
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.P(r10)
            goto L_0x03fa
        L_0x0170:
            boolean r3 = r0.r(r1, r10, r5)
            if (r3 == 0) goto L_0x04fa
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.L(r10)
            goto L_0x03fa
        L_0x017c:
            androidx.datastore.preferences.protobuf.x r9 = r0.f2230q
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.lang.Object r4 = r0.m(r5)
            int r3 = r9.d(r10, r3, r4)
            goto L_0x03fa
        L_0x018c:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            j2.u r4 = r0.n(r5)
            int r3 = androidx.datastore.preferences.protobuf.g0.j(r10, r3, r4)
            goto L_0x03fa
        L_0x019c:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.t(r3)
            if (r3 <= 0) goto L_0x04fa
            boolean r4 = r0.f2222i
            if (r4 == 0) goto L_0x01b0
            long r11 = (long) r9
            r2.putInt(r1, r11, r3)
        L_0x01b0:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.b0(r10)
            int r9 = androidx.datastore.preferences.protobuf.CodedOutputStream.d0(r3)
            goto L_0x033b
        L_0x01ba:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.r(r3)
            if (r3 <= 0) goto L_0x04fa
            boolean r4 = r0.f2222i
            if (r4 == 0) goto L_0x01ce
            long r11 = (long) r9
            r2.putInt(r1, r11, r3)
        L_0x01ce:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.b0(r10)
            int r9 = androidx.datastore.preferences.protobuf.CodedOutputStream.d0(r3)
            goto L_0x033b
        L_0x01d8:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.i(r3)
            if (r3 <= 0) goto L_0x04fa
            boolean r4 = r0.f2222i
            if (r4 == 0) goto L_0x01ec
            long r11 = (long) r9
            r2.putInt(r1, r11, r3)
        L_0x01ec:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.b0(r10)
            int r9 = androidx.datastore.preferences.protobuf.CodedOutputStream.d0(r3)
            goto L_0x033b
        L_0x01f6:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.g(r3)
            if (r3 <= 0) goto L_0x04fa
            boolean r4 = r0.f2222i
            if (r4 == 0) goto L_0x020a
            long r11 = (long) r9
            r2.putInt(r1, r11, r3)
        L_0x020a:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.b0(r10)
            int r9 = androidx.datastore.preferences.protobuf.CodedOutputStream.d0(r3)
            goto L_0x033b
        L_0x0214:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.e(r3)
            if (r3 <= 0) goto L_0x04fa
            boolean r4 = r0.f2222i
            if (r4 == 0) goto L_0x0228
            long r11 = (long) r9
            r2.putInt(r1, r11, r3)
        L_0x0228:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.b0(r10)
            int r9 = androidx.datastore.preferences.protobuf.CodedOutputStream.d0(r3)
            goto L_0x033b
        L_0x0232:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.w(r3)
            if (r3 <= 0) goto L_0x04fa
            boolean r4 = r0.f2222i
            if (r4 == 0) goto L_0x0246
            long r11 = (long) r9
            r2.putInt(r1, r11, r3)
        L_0x0246:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.b0(r10)
            int r9 = androidx.datastore.preferences.protobuf.CodedOutputStream.d0(r3)
            goto L_0x033b
        L_0x0250:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.b(r3)
            if (r3 <= 0) goto L_0x04fa
            boolean r4 = r0.f2222i
            if (r4 == 0) goto L_0x0264
            long r11 = (long) r9
            r2.putInt(r1, r11, r3)
        L_0x0264:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.b0(r10)
            int r9 = androidx.datastore.preferences.protobuf.CodedOutputStream.d0(r3)
            goto L_0x033b
        L_0x026e:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.g(r3)
            if (r3 <= 0) goto L_0x04fa
            boolean r4 = r0.f2222i
            if (r4 == 0) goto L_0x0282
            long r11 = (long) r9
            r2.putInt(r1, r11, r3)
        L_0x0282:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.b0(r10)
            int r9 = androidx.datastore.preferences.protobuf.CodedOutputStream.d0(r3)
            goto L_0x033b
        L_0x028c:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.i(r3)
            if (r3 <= 0) goto L_0x04fa
            boolean r4 = r0.f2222i
            if (r4 == 0) goto L_0x02a0
            long r11 = (long) r9
            r2.putInt(r1, r11, r3)
        L_0x02a0:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.b0(r10)
            int r9 = androidx.datastore.preferences.protobuf.CodedOutputStream.d0(r3)
            goto L_0x033b
        L_0x02aa:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.l(r3)
            if (r3 <= 0) goto L_0x04fa
            boolean r4 = r0.f2222i
            if (r4 == 0) goto L_0x02be
            long r11 = (long) r9
            r2.putInt(r1, r11, r3)
        L_0x02be:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.b0(r10)
            int r9 = androidx.datastore.preferences.protobuf.CodedOutputStream.d0(r3)
            goto L_0x033b
        L_0x02c8:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.y(r3)
            if (r3 <= 0) goto L_0x04fa
            boolean r4 = r0.f2222i
            if (r4 == 0) goto L_0x02dc
            long r11 = (long) r9
            r2.putInt(r1, r11, r3)
        L_0x02dc:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.b0(r10)
            int r9 = androidx.datastore.preferences.protobuf.CodedOutputStream.d0(r3)
            goto L_0x033b
        L_0x02e5:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.n(r3)
            if (r3 <= 0) goto L_0x04fa
            boolean r4 = r0.f2222i
            if (r4 == 0) goto L_0x02f9
            long r11 = (long) r9
            r2.putInt(r1, r11, r3)
        L_0x02f9:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.b0(r10)
            int r9 = androidx.datastore.preferences.protobuf.CodedOutputStream.d0(r3)
            goto L_0x033b
        L_0x0302:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.g(r3)
            if (r3 <= 0) goto L_0x04fa
            boolean r4 = r0.f2222i
            if (r4 == 0) goto L_0x0316
            long r11 = (long) r9
            r2.putInt(r1, r11, r3)
        L_0x0316:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.b0(r10)
            int r9 = androidx.datastore.preferences.protobuf.CodedOutputStream.d0(r3)
            goto L_0x033b
        L_0x031f:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.i(r3)
            if (r3 <= 0) goto L_0x04fa
            boolean r4 = r0.f2222i
            if (r4 == 0) goto L_0x0333
            long r11 = (long) r9
            r2.putInt(r1, r11, r3)
        L_0x0333:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.b0(r10)
            int r9 = androidx.datastore.preferences.protobuf.CodedOutputStream.d0(r3)
        L_0x033b:
            int r9 = r9 + r4
            int r9 = r9 + r3
            int r9 = r9 + r6
            r6 = r9
            goto L_0x04fa
        L_0x0341:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.s(r10, r3)
            goto L_0x03fa
        L_0x034d:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.q(r10, r3)
            goto L_0x03fa
        L_0x0359:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.h(r10, r3)
            goto L_0x03fa
        L_0x0365:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.f(r10, r3)
            goto L_0x03fa
        L_0x0371:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.d(r10, r3)
            goto L_0x03fa
        L_0x037d:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.v(r10, r3)
            goto L_0x03fa
        L_0x0389:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.c(r10, r3)
            goto L_0x03fa
        L_0x0394:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            j2.u r4 = r0.n(r5)
            int r3 = androidx.datastore.preferences.protobuf.g0.p(r10, r3, r4)
            goto L_0x03fa
        L_0x03a3:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.u(r10, r3)
            goto L_0x03fa
        L_0x03ae:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.a(r10, r3)
            goto L_0x03fa
        L_0x03b9:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.f(r10, r3)
            goto L_0x03fa
        L_0x03c4:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.h(r10, r3)
            goto L_0x03fa
        L_0x03cf:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.k(r10, r3)
            goto L_0x03fa
        L_0x03da:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.x(r10, r3)
            goto L_0x03fa
        L_0x03e5:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.m(r10, r3)
            goto L_0x03fa
        L_0x03f0:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.f(r10, r3)
        L_0x03fa:
            int r6 = r6 + r3
            goto L_0x04fa
        L_0x03fd:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.g0.h(r10, r3)
            goto L_0x03fa
        L_0x0408:
            r9 = r7 & r13
            if (r9 == 0) goto L_0x04fa
            java.lang.Object r3 = r2.getObject(r1, r3)
            androidx.datastore.preferences.protobuf.z r3 = (androidx.datastore.preferences.protobuf.z) r3
            j2.u r4 = r0.n(r5)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.Q(r10, r3, r4)
            goto L_0x03fa
        L_0x041b:
            r9 = r7 & r13
            if (r9 == 0) goto L_0x04fa
            long r3 = r2.getLong(r1, r3)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.Y(r10, r3)
            goto L_0x03fa
        L_0x0428:
            r9 = r7 & r13
            if (r9 == 0) goto L_0x04fa
            int r3 = r2.getInt(r1, r3)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.X(r10, r3)
            goto L_0x03fa
        L_0x0435:
            r3 = r7 & r13
            if (r3 == 0) goto L_0x04fa
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.W(r10)
            goto L_0x03fa
        L_0x043e:
            r3 = r7 & r13
            if (r3 == 0) goto L_0x04fa
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.V(r10)
            goto L_0x03fa
        L_0x0447:
            r9 = r7 & r13
            if (r9 == 0) goto L_0x04fa
            int r3 = r2.getInt(r1, r3)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.M(r10, r3)
            goto L_0x03fa
        L_0x0454:
            r9 = r7 & r13
            if (r9 == 0) goto L_0x04fa
            int r3 = r2.getInt(r1, r3)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.c0(r10, r3)
            goto L_0x03fa
        L_0x0461:
            r9 = r7 & r13
            if (r9 == 0) goto L_0x04fa
            java.lang.Object r3 = r2.getObject(r1, r3)
            j2.c r3 = (j2.c) r3
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.K(r10, r3)
            goto L_0x03fa
        L_0x0470:
            r9 = r7 & r13
            if (r9 == 0) goto L_0x04fa
            java.lang.Object r3 = r2.getObject(r1, r3)
            j2.u r4 = r0.n(r5)
            int r3 = androidx.datastore.preferences.protobuf.g0.o(r10, r4, r3)
            goto L_0x03fa
        L_0x0482:
            r9 = r7 & r13
            if (r9 == 0) goto L_0x04fa
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof j2.c
            if (r4 == 0) goto L_0x0495
            j2.c r3 = (j2.c) r3
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.K(r10, r3)
            goto L_0x049b
        L_0x0495:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.Z(r10, r3)
        L_0x049b:
            int r3 = r3 + r6
            r6 = r3
            goto L_0x04fa
        L_0x049e:
            r3 = r7 & r13
            if (r3 == 0) goto L_0x04fa
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.J(r10)
            goto L_0x03fa
        L_0x04a8:
            r3 = r7 & r13
            if (r3 == 0) goto L_0x04fa
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.N(r10)
            goto L_0x03fa
        L_0x04b2:
            r3 = r7 & r13
            if (r3 == 0) goto L_0x04fa
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.O(r10)
            goto L_0x03fa
        L_0x04bc:
            r9 = r7 & r13
            if (r9 == 0) goto L_0x04fa
            int r3 = r2.getInt(r1, r3)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.R(r10, r3)
            goto L_0x03fa
        L_0x04ca:
            r9 = r7 & r13
            if (r9 == 0) goto L_0x04fa
            long r3 = r2.getLong(r1, r3)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.e0(r10, r3)
            goto L_0x03fa
        L_0x04d8:
            r9 = r7 & r13
            if (r9 == 0) goto L_0x04fa
            long r3 = r2.getLong(r1, r3)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.T(r10, r3)
            goto L_0x03fa
        L_0x04e6:
            r3 = r7 & r13
            if (r3 == 0) goto L_0x04fa
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.P(r10)
            goto L_0x03fa
        L_0x04f0:
            r3 = r7 & r13
            if (r3 == 0) goto L_0x04fa
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.L(r10)
            goto L_0x03fa
        L_0x04fa:
            int r5 = r5 + 3
            r4 = r8
            goto L_0x000a
        L_0x04ff:
            androidx.datastore.preferences.protobuf.j0<?, ?> r2 = r0.f2228o
            androidx.datastore.preferences.protobuf.k0 r3 = r2.g(r1)
            int r2 = r2.h(r3)
            int r2 = r2 + r6
            boolean r3 = r0.f2219f
            if (r3 == 0) goto L_0x0519
            androidx.datastore.preferences.protobuf.j<?> r3 = r0.f2229p
            androidx.datastore.preferences.protobuf.l r1 = r3.c(r1)
            int r1 = r1.g()
            int r2 = r2 + r1
        L_0x0519:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.b0.o(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0315, code lost:
        r3 = r3 + ((r6 + r4) + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0477, code lost:
        r3 = r3 + r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int p(T r12) {
        /*
            r11 = this;
            sun.misc.Unsafe r0 = f2213s
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0005:
            int[] r4 = r11.f2214a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x04e1
            int r4 = r11.L(r2)
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r5 = r5 & r4
            int r5 = r5 >>> 20
            int[] r6 = r11.f2214a
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r8 = (long) r4
            j2.f r4 = j2.f.DOUBLE_LIST_PACKED
            int r4 = r4.b()
            if (r5 < r4) goto L_0x0034
            j2.f r4 = j2.f.SINT64_LIST_PACKED
            int r4 = r4.b()
            if (r5 > r4) goto L_0x0034
            int[] r4 = r11.f2214a
            int r10 = r2 + 2
            r4 = r4[r10]
            r4 = r4 & r7
            goto L_0x0035
        L_0x0034:
            r4 = r1
        L_0x0035:
            switch(r5) {
                case 0: goto L_0x04d2;
                case 1: goto L_0x04c7;
                case 2: goto L_0x04b8;
                case 3: goto L_0x04a9;
                case 4: goto L_0x049a;
                case 5: goto L_0x048f;
                case 6: goto L_0x0484;
                case 7: goto L_0x0479;
                case 8: goto L_0x045c;
                case 9: goto L_0x0448;
                case 10: goto L_0x0436;
                case 11: goto L_0x0426;
                case 12: goto L_0x0416;
                case 13: goto L_0x040a;
                case 14: goto L_0x03fe;
                case 15: goto L_0x03ee;
                case 16: goto L_0x03de;
                case 17: goto L_0x03c8;
                case 18: goto L_0x03be;
                case 19: goto L_0x03b4;
                case 20: goto L_0x03aa;
                case 21: goto L_0x03a0;
                case 22: goto L_0x0396;
                case 23: goto L_0x038c;
                case 24: goto L_0x0382;
                case 25: goto L_0x0378;
                case 26: goto L_0x036e;
                case 27: goto L_0x0360;
                case 28: goto L_0x0356;
                case 29: goto L_0x034c;
                case 30: goto L_0x0342;
                case 31: goto L_0x0338;
                case 32: goto L_0x032e;
                case 33: goto L_0x0324;
                case 34: goto L_0x031a;
                case 35: goto L_0x02f9;
                case 36: goto L_0x02dc;
                case 37: goto L_0x02bf;
                case 38: goto L_0x02a2;
                case 39: goto L_0x0284;
                case 40: goto L_0x0266;
                case 41: goto L_0x0248;
                case 42: goto L_0x022a;
                case 43: goto L_0x020c;
                case 44: goto L_0x01ee;
                case 45: goto L_0x01d0;
                case 46: goto L_0x01b2;
                case 47: goto L_0x0194;
                case 48: goto L_0x0176;
                case 49: goto L_0x0168;
                case 50: goto L_0x0158;
                case 51: goto L_0x014c;
                case 52: goto L_0x0140;
                case 53: goto L_0x0130;
                case 54: goto L_0x0120;
                case 55: goto L_0x0110;
                case 56: goto L_0x0104;
                case 57: goto L_0x00f8;
                case 58: goto L_0x00ec;
                case 59: goto L_0x00ce;
                case 60: goto L_0x00ba;
                case 61: goto L_0x00a8;
                case 62: goto L_0x0098;
                case 63: goto L_0x0088;
                case 64: goto L_0x007c;
                case 65: goto L_0x0070;
                case 66: goto L_0x0060;
                case 67: goto L_0x0050;
                case 68: goto L_0x003a;
                default: goto L_0x0038;
            }
        L_0x0038:
            goto L_0x04dd
        L_0x003a:
            boolean r4 = r11.r(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            java.lang.Object r4 = j2.y.n(r12, r8)
            androidx.datastore.preferences.protobuf.z r4 = (androidx.datastore.preferences.protobuf.z) r4
            j2.u r5 = r11.n(r2)
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.Q(r6, r4, r5)
            goto L_0x04dc
        L_0x0050:
            boolean r4 = r11.r(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            long r4 = B(r12, r8)
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.Y(r6, r4)
            goto L_0x04dc
        L_0x0060:
            boolean r4 = r11.r(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = A(r12, r8)
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.X(r6, r4)
            goto L_0x04dc
        L_0x0070:
            boolean r4 = r11.r(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.W(r6)
            goto L_0x04dc
        L_0x007c:
            boolean r4 = r11.r(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.V(r6)
            goto L_0x04dc
        L_0x0088:
            boolean r4 = r11.r(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = A(r12, r8)
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.M(r6, r4)
            goto L_0x04dc
        L_0x0098:
            boolean r4 = r11.r(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = A(r12, r8)
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.c0(r6, r4)
            goto L_0x04dc
        L_0x00a8:
            boolean r4 = r11.r(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            java.lang.Object r4 = j2.y.n(r12, r8)
            j2.c r4 = (j2.c) r4
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.K(r6, r4)
            goto L_0x04dc
        L_0x00ba:
            boolean r4 = r11.r(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            java.lang.Object r4 = j2.y.n(r12, r8)
            j2.u r5 = r11.n(r2)
            int r4 = androidx.datastore.preferences.protobuf.g0.o(r6, r5, r4)
            goto L_0x04dc
        L_0x00ce:
            boolean r4 = r11.r(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            java.lang.Object r4 = j2.y.n(r12, r8)
            boolean r5 = r4 instanceof j2.c
            if (r5 == 0) goto L_0x00e4
            j2.c r4 = (j2.c) r4
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.K(r6, r4)
            goto L_0x0477
        L_0x00e4:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.Z(r6, r4)
            goto L_0x0477
        L_0x00ec:
            boolean r4 = r11.r(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.J(r6)
            goto L_0x04dc
        L_0x00f8:
            boolean r4 = r11.r(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.N(r6)
            goto L_0x04dc
        L_0x0104:
            boolean r4 = r11.r(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.O(r6)
            goto L_0x04dc
        L_0x0110:
            boolean r4 = r11.r(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = A(r12, r8)
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.R(r6, r4)
            goto L_0x04dc
        L_0x0120:
            boolean r4 = r11.r(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            long r4 = B(r12, r8)
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.e0(r6, r4)
            goto L_0x04dc
        L_0x0130:
            boolean r4 = r11.r(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            long r4 = B(r12, r8)
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.T(r6, r4)
            goto L_0x04dc
        L_0x0140:
            boolean r4 = r11.r(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.P(r6)
            goto L_0x04dc
        L_0x014c:
            boolean r4 = r11.r(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.L(r6)
            goto L_0x04dc
        L_0x0158:
            androidx.datastore.preferences.protobuf.x r4 = r11.f2230q
            java.lang.Object r5 = j2.y.n(r12, r8)
            java.lang.Object r7 = r11.m(r2)
            int r4 = r4.d(r6, r5, r7)
            goto L_0x04dc
        L_0x0168:
            java.util.List r4 = s(r12, r8)
            j2.u r5 = r11.n(r2)
            int r4 = androidx.datastore.preferences.protobuf.g0.j(r6, r4, r5)
            goto L_0x04dc
        L_0x0176:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.g0.t(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f2222i
            if (r7 == 0) goto L_0x018a
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x018a:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.b0(r6)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x0194:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.g0.r(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f2222i
            if (r7 == 0) goto L_0x01a8
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x01a8:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.b0(r6)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x01b2:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.g0.i(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f2222i
            if (r7 == 0) goto L_0x01c6
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x01c6:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.b0(r6)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x01d0:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.g0.g(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f2222i
            if (r7 == 0) goto L_0x01e4
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x01e4:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.b0(r6)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x01ee:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.g0.e(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f2222i
            if (r7 == 0) goto L_0x0202
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x0202:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.b0(r6)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x020c:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.g0.w(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f2222i
            if (r7 == 0) goto L_0x0220
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x0220:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.b0(r6)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x022a:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.g0.b(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f2222i
            if (r7 == 0) goto L_0x023e
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x023e:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.b0(r6)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x0248:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.g0.g(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f2222i
            if (r7 == 0) goto L_0x025c
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x025c:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.b0(r6)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x0266:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.g0.i(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f2222i
            if (r7 == 0) goto L_0x027a
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x027a:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.b0(r6)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x0284:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.g0.l(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f2222i
            if (r7 == 0) goto L_0x0298
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x0298:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.b0(r6)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x02a2:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.g0.y(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f2222i
            if (r7 == 0) goto L_0x02b6
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x02b6:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.b0(r6)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x02bf:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.g0.n(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f2222i
            if (r7 == 0) goto L_0x02d3
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x02d3:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.b0(r6)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x02dc:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.g0.g(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f2222i
            if (r7 == 0) goto L_0x02f0
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x02f0:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.b0(r6)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x02f9:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.datastore.preferences.protobuf.g0.i(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f2222i
            if (r7 == 0) goto L_0x030d
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x030d:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.b0(r6)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.d0(r5)
        L_0x0315:
            int r6 = r6 + r4
            int r6 = r6 + r5
            int r3 = r3 + r6
            goto L_0x04dd
        L_0x031a:
            java.util.List r4 = s(r12, r8)
            int r4 = androidx.datastore.preferences.protobuf.g0.s(r6, r4)
            goto L_0x04dc
        L_0x0324:
            java.util.List r4 = s(r12, r8)
            int r4 = androidx.datastore.preferences.protobuf.g0.q(r6, r4)
            goto L_0x04dc
        L_0x032e:
            java.util.List r4 = s(r12, r8)
            int r4 = androidx.datastore.preferences.protobuf.g0.h(r6, r4)
            goto L_0x04dc
        L_0x0338:
            java.util.List r4 = s(r12, r8)
            int r4 = androidx.datastore.preferences.protobuf.g0.f(r6, r4)
            goto L_0x04dc
        L_0x0342:
            java.util.List r4 = s(r12, r8)
            int r4 = androidx.datastore.preferences.protobuf.g0.d(r6, r4)
            goto L_0x04dc
        L_0x034c:
            java.util.List r4 = s(r12, r8)
            int r4 = androidx.datastore.preferences.protobuf.g0.v(r6, r4)
            goto L_0x04dc
        L_0x0356:
            java.util.List r4 = s(r12, r8)
            int r4 = androidx.datastore.preferences.protobuf.g0.c(r6, r4)
            goto L_0x04dc
        L_0x0360:
            java.util.List r4 = s(r12, r8)
            j2.u r5 = r11.n(r2)
            int r4 = androidx.datastore.preferences.protobuf.g0.p(r6, r4, r5)
            goto L_0x04dc
        L_0x036e:
            java.util.List r4 = s(r12, r8)
            int r4 = androidx.datastore.preferences.protobuf.g0.u(r6, r4)
            goto L_0x04dc
        L_0x0378:
            java.util.List r4 = s(r12, r8)
            int r4 = androidx.datastore.preferences.protobuf.g0.a(r6, r4)
            goto L_0x04dc
        L_0x0382:
            java.util.List r4 = s(r12, r8)
            int r4 = androidx.datastore.preferences.protobuf.g0.f(r6, r4)
            goto L_0x04dc
        L_0x038c:
            java.util.List r4 = s(r12, r8)
            int r4 = androidx.datastore.preferences.protobuf.g0.h(r6, r4)
            goto L_0x04dc
        L_0x0396:
            java.util.List r4 = s(r12, r8)
            int r4 = androidx.datastore.preferences.protobuf.g0.k(r6, r4)
            goto L_0x04dc
        L_0x03a0:
            java.util.List r4 = s(r12, r8)
            int r4 = androidx.datastore.preferences.protobuf.g0.x(r6, r4)
            goto L_0x04dc
        L_0x03aa:
            java.util.List r4 = s(r12, r8)
            int r4 = androidx.datastore.preferences.protobuf.g0.m(r6, r4)
            goto L_0x04dc
        L_0x03b4:
            java.util.List r4 = s(r12, r8)
            int r4 = androidx.datastore.preferences.protobuf.g0.f(r6, r4)
            goto L_0x04dc
        L_0x03be:
            java.util.List r4 = s(r12, r8)
            int r4 = androidx.datastore.preferences.protobuf.g0.h(r6, r4)
            goto L_0x04dc
        L_0x03c8:
            boolean r4 = r11.q(r2, r12)
            if (r4 == 0) goto L_0x04dd
            java.lang.Object r4 = j2.y.n(r12, r8)
            androidx.datastore.preferences.protobuf.z r4 = (androidx.datastore.preferences.protobuf.z) r4
            j2.u r5 = r11.n(r2)
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.Q(r6, r4, r5)
            goto L_0x04dc
        L_0x03de:
            boolean r4 = r11.q(r2, r12)
            if (r4 == 0) goto L_0x04dd
            long r4 = j2.y.m(r12, r8)
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.Y(r6, r4)
            goto L_0x04dc
        L_0x03ee:
            boolean r4 = r11.q(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = j2.y.l(r12, r8)
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.X(r6, r4)
            goto L_0x04dc
        L_0x03fe:
            boolean r4 = r11.q(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.W(r6)
            goto L_0x04dc
        L_0x040a:
            boolean r4 = r11.q(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.V(r6)
            goto L_0x04dc
        L_0x0416:
            boolean r4 = r11.q(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = j2.y.l(r12, r8)
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.M(r6, r4)
            goto L_0x04dc
        L_0x0426:
            boolean r4 = r11.q(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = j2.y.l(r12, r8)
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.c0(r6, r4)
            goto L_0x04dc
        L_0x0436:
            boolean r4 = r11.q(r2, r12)
            if (r4 == 0) goto L_0x04dd
            java.lang.Object r4 = j2.y.n(r12, r8)
            j2.c r4 = (j2.c) r4
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.K(r6, r4)
            goto L_0x04dc
        L_0x0448:
            boolean r4 = r11.q(r2, r12)
            if (r4 == 0) goto L_0x04dd
            java.lang.Object r4 = j2.y.n(r12, r8)
            j2.u r5 = r11.n(r2)
            int r4 = androidx.datastore.preferences.protobuf.g0.o(r6, r5, r4)
            goto L_0x04dc
        L_0x045c:
            boolean r4 = r11.q(r2, r12)
            if (r4 == 0) goto L_0x04dd
            java.lang.Object r4 = j2.y.n(r12, r8)
            boolean r5 = r4 instanceof j2.c
            if (r5 == 0) goto L_0x0471
            j2.c r4 = (j2.c) r4
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.K(r6, r4)
            goto L_0x0477
        L_0x0471:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.Z(r6, r4)
        L_0x0477:
            int r3 = r3 + r4
            goto L_0x04dd
        L_0x0479:
            boolean r4 = r11.q(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.J(r6)
            goto L_0x04dc
        L_0x0484:
            boolean r4 = r11.q(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.N(r6)
            goto L_0x04dc
        L_0x048f:
            boolean r4 = r11.q(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.O(r6)
            goto L_0x04dc
        L_0x049a:
            boolean r4 = r11.q(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = j2.y.l(r12, r8)
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.R(r6, r4)
            goto L_0x04dc
        L_0x04a9:
            boolean r4 = r11.q(r2, r12)
            if (r4 == 0) goto L_0x04dd
            long r4 = j2.y.m(r12, r8)
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.e0(r6, r4)
            goto L_0x04dc
        L_0x04b8:
            boolean r4 = r11.q(r2, r12)
            if (r4 == 0) goto L_0x04dd
            long r4 = j2.y.m(r12, r8)
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.T(r6, r4)
            goto L_0x04dc
        L_0x04c7:
            boolean r4 = r11.q(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.P(r6)
            goto L_0x04dc
        L_0x04d2:
            boolean r4 = r11.q(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.L(r6)
        L_0x04dc:
            int r3 = r3 + r4
        L_0x04dd:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x04e1:
            androidx.datastore.preferences.protobuf.j0<?, ?> r0 = r11.f2228o
            androidx.datastore.preferences.protobuf.k0 r12 = r0.g(r12)
            int r12 = r0.h(r12)
            int r12 = r12 + r3
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.b0.p(java.lang.Object):int");
    }

    public final boolean q(int i10, Object obj) {
        boolean equals;
        if (this.f2221h) {
            int L = L(i10);
            long j10 = (long) (L & 1048575);
            switch ((L & 267386880) >>> 20) {
                case 0:
                    if (y.j(obj, j10) != 0.0d) {
                        return true;
                    }
                    return false;
                case 1:
                    if (y.k(obj, j10) != 0.0f) {
                        return true;
                    }
                    return false;
                case 2:
                    if (y.m(obj, j10) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (y.m(obj, j10) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (y.l(obj, j10) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (y.m(obj, j10) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (y.l(obj, j10) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return y.f(obj, j10);
                case 8:
                    Object n10 = y.n(obj, j10);
                    if (n10 instanceof String) {
                        equals = ((String) n10).isEmpty();
                        break;
                    } else if (n10 instanceof c) {
                        equals = c.f11484b.equals(n10);
                        break;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (y.n(obj, j10) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    equals = c.f11484b.equals(y.n(obj, j10));
                    break;
                case 11:
                    if (y.l(obj, j10) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (y.l(obj, j10) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (y.l(obj, j10) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (y.m(obj, j10) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (y.l(obj, j10) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (y.m(obj, j10) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (y.n(obj, j10) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
            return !equals;
        }
        int i11 = this.f2214a[i10 + 2];
        if ((y.l(obj, (long) (i11 & 1048575)) & (1 << (i11 >>> 20))) != 0) {
            return true;
        }
        return false;
    }

    public final boolean r(T t10, int i10, int i11) {
        if (y.l(t10, (long) (this.f2214a[i11 + 2] & 1048575)) == i10) {
            return true;
        }
        return false;
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final <UT, UB, ET extends androidx.datastore.preferences.protobuf.l.a<ET>> void t(androidx.datastore.preferences.protobuf.j0<UT, UB> r17, androidx.datastore.preferences.protobuf.j<ET> r18, T r19, androidx.datastore.preferences.protobuf.f0 r20, androidx.datastore.preferences.protobuf.i r21) {
        /*
            r16 = this;
            r8 = r16
            r9 = r17
            r0 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r13 = 0
            r14 = r13
            r15 = r14
        L_0x000f:
            int r1 = r20.A()     // Catch:{ all -> 0x05e0 }
            int r7 = r8.C(r1)     // Catch:{ all -> 0x05e0 }
            if (r7 >= 0) goto L_0x0077
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x0035
            int r0 = r8.f2224k
        L_0x0020:
            int r1 = r8.f2225l
            if (r0 >= r1) goto L_0x002f
            int[] r1 = r8.f2223j
            r1 = r1[r0]
            java.lang.Object r14 = r8.k(r10, r1, r14, r9)
            int r0 = r0 + 1
            goto L_0x0020
        L_0x002f:
            if (r14 == 0) goto L_0x0034
            r9.n(r10, r14)
        L_0x0034:
            return
        L_0x0035:
            boolean r2 = r8.f2219f     // Catch:{ all -> 0x05e0 }
            if (r2 != 0) goto L_0x003b
            r1 = r13
            goto L_0x0041
        L_0x003b:
            androidx.datastore.preferences.protobuf.z r2 = r8.f2218e     // Catch:{ all -> 0x05e0 }
            androidx.datastore.preferences.protobuf.n$e r1 = r0.b(r12, r2, r1)     // Catch:{ all -> 0x05e0 }
        L_0x0041:
            if (r1 == 0) goto L_0x004f
            if (r15 != 0) goto L_0x004a
            androidx.datastore.preferences.protobuf.l r2 = r18.d(r19)     // Catch:{ all -> 0x05e0 }
            r15 = r2
        L_0x004a:
            java.lang.Object r14 = r0.g(r1)     // Catch:{ all -> 0x05e0 }
            goto L_0x000f
        L_0x004f:
            r17.p()     // Catch:{ all -> 0x05e0 }
            if (r14 != 0) goto L_0x0059
            androidx.datastore.preferences.protobuf.k0 r1 = r9.f(r10)     // Catch:{ all -> 0x05e0 }
            r14 = r1
        L_0x0059:
            boolean r1 = r9.l(r14, r11)     // Catch:{ all -> 0x05e0 }
            if (r1 == 0) goto L_0x0060
            goto L_0x000f
        L_0x0060:
            int r0 = r8.f2224k
        L_0x0062:
            int r1 = r8.f2225l
            if (r0 >= r1) goto L_0x0071
            int[] r1 = r8.f2223j
            r1 = r1[r0]
            java.lang.Object r14 = r8.k(r10, r1, r14, r9)
            int r0 = r0 + 1
            goto L_0x0062
        L_0x0071:
            if (r14 == 0) goto L_0x0076
            r9.n(r10, r14)
        L_0x0076:
            return
        L_0x0077:
            int r3 = r8.L(r7)     // Catch:{ all -> 0x05e0 }
            int r2 = K(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            switch(r2) {
                case 0: goto L_0x0587;
                case 1: goto L_0x0575;
                case 2: goto L_0x0565;
                case 3: goto L_0x0555;
                case 4: goto L_0x0545;
                case 5: goto L_0x0535;
                case 6: goto L_0x0525;
                case 7: goto L_0x0513;
                case 8: goto L_0x050b;
                case 9: goto L_0x04d4;
                case 10: goto L_0x04c4;
                case 11: goto L_0x04b4;
                case 12: goto L_0x0491;
                case 13: goto L_0x0481;
                case 14: goto L_0x0471;
                case 15: goto L_0x0461;
                case 16: goto L_0x0451;
                case 17: goto L_0x041a;
                case 18: goto L_0x040b;
                case 19: goto L_0x03fc;
                case 20: goto L_0x03ed;
                case 21: goto L_0x03de;
                case 22: goto L_0x03cf;
                case 23: goto L_0x03c0;
                case 24: goto L_0x03b1;
                case 25: goto L_0x03a2;
                case 26: goto L_0x039d;
                case 27: goto L_0x038c;
                case 28: goto L_0x037d;
                case 29: goto L_0x036e;
                case 30: goto L_0x0357;
                case 31: goto L_0x0348;
                case 32: goto L_0x0339;
                case 33: goto L_0x032a;
                case 34: goto L_0x031b;
                case 35: goto L_0x030c;
                case 36: goto L_0x02fd;
                case 37: goto L_0x02ee;
                case 38: goto L_0x02df;
                case 39: goto L_0x02d0;
                case 40: goto L_0x02c1;
                case 41: goto L_0x02b2;
                case 42: goto L_0x02a3;
                case 43: goto L_0x0294;
                case 44: goto L_0x027d;
                case 45: goto L_0x026e;
                case 46: goto L_0x025f;
                case 47: goto L_0x0250;
                case 48: goto L_0x0241;
                case 49: goto L_0x022c;
                case 50: goto L_0x021a;
                case 51: goto L_0x0206;
                case 52: goto L_0x01f2;
                case 53: goto L_0x01de;
                case 54: goto L_0x01ca;
                case 55: goto L_0x01b6;
                case 56: goto L_0x01a2;
                case 57: goto L_0x018e;
                case 58: goto L_0x017a;
                case 59: goto L_0x0172;
                case 60: goto L_0x0139;
                case 61: goto L_0x0129;
                case 62: goto L_0x0115;
                case 63: goto L_0x00ee;
                case 64: goto L_0x00da;
                case 65: goto L_0x00c6;
                case 66: goto L_0x00b2;
                case 67: goto L_0x009e;
                case 68: goto L_0x008a;
                default: goto L_0x0082;
            }     // Catch:{ InvalidWireTypeException -> 0x05b9 }
        L_0x0082:
            if (r14 != 0) goto L_0x059c
            androidx.datastore.preferences.protobuf.k0 r1 = r17.m()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x059b
        L_0x008a:
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.u r4 = r8.n(r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.lang.Object r4 = r11.w(r4, r12)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.u(r10, r2, r4)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.J(r10, r1, r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x009e:
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r4 = r20.x()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.u(r10, r2, r4)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.J(r10, r1, r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x00b2:
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            int r4 = r20.v()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.u(r10, r2, r4)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.J(r10, r1, r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x00c6:
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r4 = r20.k()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.u(r10, r2, r4)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.J(r10, r1, r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x00da:
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            int r4 = r20.I()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.u(r10, r2, r4)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.J(r10, r1, r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x00ee:
            int r2 = r20.s()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            androidx.datastore.preferences.protobuf.p$b r4 = r8.l(r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            if (r4 == 0) goto L_0x0105
            boolean r4 = r4.a()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            if (r4 == 0) goto L_0x00ff
            goto L_0x0105
        L_0x00ff:
            java.lang.Object r14 = androidx.datastore.preferences.protobuf.g0.D(r1, r2, r14, r9)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x0105:
            long r3 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.u(r10, r3, r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.J(r10, r1, r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x0115:
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            int r4 = r20.m()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.u(r10, r2, r4)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.J(r10, r1, r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x0129:
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.c r4 = r20.E()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.u(r10, r2, r4)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.J(r10, r1, r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x0139:
            boolean r2 = r8.r(r10, r1, r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            if (r2 == 0) goto L_0x015b
            long r4 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.lang.Object r2 = j2.y.n(r10, r4)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.u r4 = r8.n(r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.lang.Object r4 = r11.u(r4, r12)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            androidx.datastore.preferences.protobuf.n r2 = androidx.datastore.preferences.protobuf.p.b(r2, r4)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r3 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.u(r10, r3, r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x016d
        L_0x015b:
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.u r4 = r8.n(r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.lang.Object r4 = r11.u(r4, r12)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.u(r10, r2, r4)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.I(r7, r10)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
        L_0x016d:
            r8.J(r10, r1, r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x0172:
            r8.F(r10, r3, r11)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.J(r10, r1, r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x017a:
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            boolean r4 = r20.j()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.u(r10, r2, r4)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.J(r10, r1, r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x018e:
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            int r4 = r20.i()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.u(r10, r2, r4)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.J(r10, r1, r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x01a2:
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r4 = r20.e()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.u(r10, r2, r4)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.J(r10, r1, r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x01b6:
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            int r4 = r20.G()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.u(r10, r2, r4)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.J(r10, r1, r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x01ca:
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r4 = r20.d()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.u(r10, r2, r4)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.J(r10, r1, r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x01de:
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r4 = r20.L()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.u(r10, r2, r4)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.J(r10, r1, r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x01f2:
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            float r4 = r20.readFloat()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.u(r10, r2, r4)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.J(r10, r1, r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x0206:
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            double r4 = r20.readDouble()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.u(r10, r2, r4)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.J(r10, r1, r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x021a:
            java.lang.Object r4 = r8.m(r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r1 = r16
            r2 = r19
            r3 = r7
            r5 = r21
            r6 = r20
            r1.u(r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x022c:
            long r3 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.u r6 = r8.n(r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r1 = r16
            r2 = r19
            r5 = r20
            r7 = r21
            r1.D(r2, r3, r5, r6, r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x0241:
            androidx.datastore.preferences.protobuf.t r1 = r8.f2227n     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.util.List r1 = r1.c(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r11.g(r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x0250:
            androidx.datastore.preferences.protobuf.t r1 = r8.f2227n     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.util.List r1 = r1.c(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r11.b(r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x025f:
            androidx.datastore.preferences.protobuf.t r1 = r8.f2227n     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.util.List r1 = r1.c(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r11.o(r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x026e:
            androidx.datastore.preferences.protobuf.t r1 = r8.f2227n     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.util.List r1 = r1.c(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r11.f(r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x027d:
            androidx.datastore.preferences.protobuf.t r2 = r8.f2227n     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r3 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.util.List r2 = r2.c(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r11.q(r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            androidx.datastore.preferences.protobuf.p$b r3 = r8.l(r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.lang.Object r14 = androidx.datastore.preferences.protobuf.g0.z(r1, r2, r3, r14, r9)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x0294:
            androidx.datastore.preferences.protobuf.t r1 = r8.f2227n     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.util.List r1 = r1.c(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r11.h(r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x02a3:
            androidx.datastore.preferences.protobuf.t r1 = r8.f2227n     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.util.List r1 = r1.c(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r11.y(r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x02b2:
            androidx.datastore.preferences.protobuf.t r1 = r8.f2227n     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.util.List r1 = r1.c(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r11.t(r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x02c1:
            androidx.datastore.preferences.protobuf.t r1 = r8.f2227n     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.util.List r1 = r1.c(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r11.N(r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x02d0:
            androidx.datastore.preferences.protobuf.t r1 = r8.f2227n     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.util.List r1 = r1.c(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r11.p(r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x02df:
            androidx.datastore.preferences.protobuf.t r1 = r8.f2227n     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.util.List r1 = r1.c(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r11.l(r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x02ee:
            androidx.datastore.preferences.protobuf.t r1 = r8.f2227n     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.util.List r1 = r1.c(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r11.n(r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x02fd:
            androidx.datastore.preferences.protobuf.t r1 = r8.f2227n     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.util.List r1 = r1.c(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r11.F(r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x030c:
            androidx.datastore.preferences.protobuf.t r1 = r8.f2227n     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.util.List r1 = r1.c(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r11.K(r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x031b:
            androidx.datastore.preferences.protobuf.t r1 = r8.f2227n     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.util.List r1 = r1.c(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r11.g(r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x032a:
            androidx.datastore.preferences.protobuf.t r1 = r8.f2227n     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.util.List r1 = r1.c(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r11.b(r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x0339:
            androidx.datastore.preferences.protobuf.t r1 = r8.f2227n     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.util.List r1 = r1.c(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r11.o(r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x0348:
            androidx.datastore.preferences.protobuf.t r1 = r8.f2227n     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.util.List r1 = r1.c(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r11.f(r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x0357:
            androidx.datastore.preferences.protobuf.t r2 = r8.f2227n     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r3 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.util.List r2 = r2.c(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r11.q(r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            androidx.datastore.preferences.protobuf.p$b r3 = r8.l(r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.lang.Object r14 = androidx.datastore.preferences.protobuf.g0.z(r1, r2, r3, r14, r9)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x036e:
            androidx.datastore.preferences.protobuf.t r1 = r8.f2227n     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.util.List r1 = r1.c(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r11.h(r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x037d:
            androidx.datastore.preferences.protobuf.t r1 = r8.f2227n     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.util.List r1 = r1.c(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r11.J(r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x038c:
            j2.u r5 = r8.n(r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r1 = r16
            r2 = r19
            r4 = r20
            r6 = r21
            r1.E(r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x039d:
            r8.G(r10, r3, r11)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x03a2:
            androidx.datastore.preferences.protobuf.t r1 = r8.f2227n     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.util.List r1 = r1.c(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r11.y(r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x03b1:
            androidx.datastore.preferences.protobuf.t r1 = r8.f2227n     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.util.List r1 = r1.c(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r11.t(r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x03c0:
            androidx.datastore.preferences.protobuf.t r1 = r8.f2227n     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.util.List r1 = r1.c(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r11.N(r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x03cf:
            androidx.datastore.preferences.protobuf.t r1 = r8.f2227n     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.util.List r1 = r1.c(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r11.p(r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x03de:
            androidx.datastore.preferences.protobuf.t r1 = r8.f2227n     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.util.List r1 = r1.c(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r11.l(r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x03ed:
            androidx.datastore.preferences.protobuf.t r1 = r8.f2227n     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.util.List r1 = r1.c(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r11.n(r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x03fc:
            androidx.datastore.preferences.protobuf.t r1 = r8.f2227n     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.util.List r1 = r1.c(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r11.F(r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x040b:
            androidx.datastore.preferences.protobuf.t r1 = r8.f2227n     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.util.List r1 = r1.c(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r11.K(r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x041a:
            boolean r1 = r8.q(r7, r10)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            if (r1 == 0) goto L_0x043d
            long r1 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.lang.Object r1 = j2.y.n(r10, r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.u r2 = r8.n(r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.lang.Object r2 = r11.w(r2, r12)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            androidx.datastore.preferences.protobuf.n r1 = androidx.datastore.preferences.protobuf.p.b(r1, r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.u(r10, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x043d:
            long r1 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.u r3 = r8.n(r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.lang.Object r3 = r11.w(r3, r12)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.u(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.I(r7, r10)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x0451:
            long r1 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r3 = r20.x()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.t(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.I(r7, r10)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x0461:
            long r1 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            int r3 = r20.v()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.s(r10, r3, r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.I(r7, r10)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x0471:
            long r1 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r3 = r20.k()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.t(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.I(r7, r10)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x0481:
            long r1 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            int r3 = r20.I()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.s(r10, r3, r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.I(r7, r10)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x0491:
            int r2 = r20.s()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            androidx.datastore.preferences.protobuf.p$b r4 = r8.l(r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            if (r4 == 0) goto L_0x04a8
            boolean r4 = r4.a()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            if (r4 == 0) goto L_0x04a2
            goto L_0x04a8
        L_0x04a2:
            java.lang.Object r14 = androidx.datastore.preferences.protobuf.g0.D(r1, r2, r14, r9)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x04a8:
            long r3 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.s(r10, r2, r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.I(r7, r10)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x04b4:
            long r1 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            int r3 = r20.m()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.s(r10, r3, r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.I(r7, r10)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x04c4:
            long r1 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.c r3 = r20.E()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.u(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.I(r7, r10)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x04d4:
            boolean r1 = r8.q(r7, r10)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            if (r1 == 0) goto L_0x04f7
            long r1 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.lang.Object r1 = j2.y.n(r10, r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.u r2 = r8.n(r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.lang.Object r2 = r11.u(r2, r12)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            androidx.datastore.preferences.protobuf.n r1 = androidx.datastore.preferences.protobuf.p.b(r1, r2)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r2 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.u(r10, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x04f7:
            long r1 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.u r3 = r8.n(r7)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            java.lang.Object r3 = r11.u(r3, r12)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.u(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.I(r7, r10)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x050b:
            r8.F(r10, r3, r11)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.I(r7, r10)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x0513:
            long r1 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            boolean r3 = r20.j()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y$e r4 = j2.y.f11529d     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r4.k(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.I(r7, r10)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x0525:
            long r1 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            int r3 = r20.i()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.s(r10, r3, r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.I(r7, r10)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x0535:
            long r1 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r3 = r20.e()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.t(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.I(r7, r10)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x0545:
            long r1 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            int r3 = r20.G()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.s(r10, r3, r1)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.I(r7, r10)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x0555:
            long r1 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r3 = r20.d()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.t(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.I(r7, r10)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x0565:
            long r1 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            long r3 = r20.L()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y.t(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.I(r7, r10)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x0575:
            long r1 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            float r3 = r20.readFloat()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y$e r4 = j2.y.f11529d     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r4.n(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.I(r7, r10)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x0587:
            long r3 = z(r3)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            double r5 = r20.readDouble()     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            j2.y$e r1 = j2.y.f11529d     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r2 = r19
            r1.m(r2, r3, r5)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            r8.I(r7, r10)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            goto L_0x000f
        L_0x059b:
            r14 = r1
        L_0x059c:
            boolean r1 = r9.l(r14, r11)     // Catch:{ InvalidWireTypeException -> 0x05b9 }
            if (r1 != 0) goto L_0x000f
            int r0 = r8.f2224k
        L_0x05a4:
            int r1 = r8.f2225l
            if (r0 >= r1) goto L_0x05b3
            int[] r1 = r8.f2223j
            r1 = r1[r0]
            java.lang.Object r14 = r8.k(r10, r1, r14, r9)
            int r0 = r0 + 1
            goto L_0x05a4
        L_0x05b3:
            if (r14 == 0) goto L_0x05b8
            r9.n(r10, r14)
        L_0x05b8:
            return
        L_0x05b9:
            r17.p()     // Catch:{ all -> 0x05e0 }
            if (r14 != 0) goto L_0x05c3
            androidx.datastore.preferences.protobuf.k0 r1 = r9.f(r10)     // Catch:{ all -> 0x05e0 }
            r14 = r1
        L_0x05c3:
            boolean r1 = r9.l(r14, r11)     // Catch:{ all -> 0x05e0 }
            if (r1 != 0) goto L_0x000f
            int r0 = r8.f2224k
        L_0x05cb:
            int r1 = r8.f2225l
            if (r0 >= r1) goto L_0x05da
            int[] r1 = r8.f2223j
            r1 = r1[r0]
            java.lang.Object r14 = r8.k(r10, r1, r14, r9)
            int r0 = r0 + 1
            goto L_0x05cb
        L_0x05da:
            if (r14 == 0) goto L_0x05df
            r9.n(r10, r14)
        L_0x05df:
            return
        L_0x05e0:
            r0 = move-exception
            int r1 = r8.f2224k
        L_0x05e3:
            int r2 = r8.f2225l
            if (r1 >= r2) goto L_0x05f2
            int[] r2 = r8.f2223j
            r2 = r2[r1]
            java.lang.Object r14 = r8.k(r10, r2, r14, r9)
            int r1 = r1 + 1
            goto L_0x05e3
        L_0x05f2:
            if (r14 == 0) goto L_0x05f7
            r9.n(r10, r14)
        L_0x05f7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.b0.t(androidx.datastore.preferences.protobuf.j0, androidx.datastore.preferences.protobuf.j, java.lang.Object, androidx.datastore.preferences.protobuf.f0, androidx.datastore.preferences.protobuf.i):void");
    }

    public final <K, V> void u(Object obj, int i10, Object obj2, i iVar, f0 f0Var) {
        long L = (long) (L(i10) & 1048575);
        Object n10 = y.n(obj, L);
        if (n10 == null) {
            n10 = this.f2230q.f();
            y.u(obj, L, n10);
        } else if (this.f2230q.h(n10)) {
            w f10 = this.f2230q.f();
            this.f2230q.a(f10, n10);
            y.u(obj, L, f10);
            n10 = f10;
        }
        f0Var.r(this.f2230q.g(n10), this.f2230q.c(obj2), iVar);
    }

    public final void v(int i10, Object obj, Object obj2) {
        long L = (long) (L(i10) & 1048575);
        if (q(i10, obj2)) {
            Object n10 = y.n(obj, L);
            Object n11 = y.n(obj2, L);
            if (n10 != null && n11 != null) {
                y.u(obj, L, p.b(n10, n11));
                I(i10, obj);
            } else if (n11 != null) {
                y.u(obj, L, n11);
                I(i10, obj);
            }
        }
    }

    public final void w(int i10, Object obj, Object obj2) {
        int L = L(i10);
        int i11 = this.f2214a[i10];
        long j10 = (long) (L & 1048575);
        if (r(obj2, i11, i10)) {
            Object n10 = y.n(obj, j10);
            Object n11 = y.n(obj2, j10);
            if (n10 != null && n11 != null) {
                y.u(obj, j10, p.b(n10, n11));
                J(obj, i11, i10);
            } else if (n11 != null) {
                y.u(obj, j10, n11);
                J(obj, i11, i10);
            }
        }
    }
}
