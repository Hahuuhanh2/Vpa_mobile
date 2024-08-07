package v;

import al.g0;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.impl.x;
import f0.e;
import f0.r0;
import f0.s0;
import g0.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p3.l0;
import w.t;
import w.z;
import y.o;
import z.d;
import z.n;

/* compiled from: SupportedSurfaceCombination */
public final class t1 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f15841a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f15842b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f15843c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f15844d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f15845e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f15846f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final String f15847g;

    /* renamed from: h  reason: collision with root package name */
    public final d f15848h;

    /* renamed from: i  reason: collision with root package name */
    public final t f15849i;

    /* renamed from: j  reason: collision with root package name */
    public final d f15850j;

    /* renamed from: k  reason: collision with root package name */
    public final int f15851k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f15852l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f15853m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f15854n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f15855o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f15856p;

    /* renamed from: q  reason: collision with root package name */
    public e f15857q;

    /* renamed from: r  reason: collision with root package name */
    public ArrayList f15858r;

    /* renamed from: s  reason: collision with root package name */
    public final d1 f15859s;

    /* renamed from: t  reason: collision with root package name */
    public final lb.b f15860t;

    /* renamed from: u  reason: collision with root package name */
    public final n f15861u;

    /* renamed from: v  reason: collision with root package name */
    public final e1 f15862v;

    /* compiled from: SupportedSurfaceCombination */
    public static class a {
        public static Size[] a(StreamConfigurationMap streamConfigurationMap, int i10) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i10);
        }
    }

    /* compiled from: SupportedSurfaceCombination */
    public static abstract class b {
        public abstract int a();

        public abstract int b();
    }

    public t1(Context context, String str, z zVar, d dVar) {
        int i10;
        s0.a aVar;
        ArrayList arrayList;
        s0.a aVar2;
        ArrayList arrayList2;
        int i11;
        boolean z10;
        boolean z11;
        s0.a aVar3;
        s0.a aVar4;
        ArrayList arrayList3;
        s0.a aVar5;
        s0.a aVar6;
        s0.a aVar7;
        s0.a aVar8;
        s0.a aVar9;
        s0.a aVar10;
        boolean z12;
        String str2 = str;
        s0.a aVar11 = s0.a.s1440p;
        s0.a aVar12 = s0.a.RECORD;
        this.f15852l = false;
        this.f15853m = false;
        this.f15854n = false;
        this.f15855o = false;
        this.f15856p = false;
        this.f15858r = new ArrayList();
        this.f15860t = new lb.b(1);
        this.f15861u = new n();
        str.getClass();
        this.f15847g = str2;
        dVar.getClass();
        this.f15848h = dVar;
        this.f15850j = new d(0);
        this.f15859s = d1.b(context);
        try {
            t b10 = zVar.b(str2);
            this.f15849i = b10;
            Integer num = (Integer) b10.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = 2;
            }
            this.f15851k = i10;
            int[] iArr = (int[]) b10.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i12 : iArr) {
                    if (i12 == 3) {
                        this.f15852l = true;
                    } else if (i12 == 6) {
                        this.f15853m = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i12 == 16) {
                        this.f15856p = true;
                    }
                }
            }
            e1 e1Var = new e1(this.f15849i);
            this.f15862v = e1Var;
            ArrayList arrayList4 = this.f15841a;
            int i13 = this.f15851k;
            boolean z13 = this.f15852l;
            boolean z14 = this.f15853m;
            s0.a aVar13 = s0.a.VGA;
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            r0 r0Var = new r0();
            s0.a aVar14 = s0.a.MAXIMUM;
            r0Var.a(s0.a(1, aVar14));
            arrayList6.add(r0Var);
            r0 r0Var2 = new r0();
            r0Var2.a(s0.a(3, aVar14));
            arrayList6.add(r0Var2);
            r0 r0Var3 = new r0();
            r0Var3.a(s0.a(2, aVar14));
            arrayList6.add(r0Var3);
            r0 r0Var4 = new r0();
            s0.a aVar15 = s0.a.PREVIEW;
            s0.a aVar16 = aVar15;
            s0.a aVar17 = aVar14;
            ArrayList arrayList7 = arrayList6;
            r0 c10 = v.c(1, aVar16, r0Var4, 3, aVar17, arrayList7, r0Var4);
            r0 c11 = v.c(2, aVar16, c10, 3, aVar17, arrayList7, c10);
            int i14 = 1;
            s0.a aVar18 = aVar15;
            r0 c12 = v.c(1, aVar16, c11, 1, aVar18, arrayList7, c11);
            r0 c13 = v.c(1, aVar16, c12, 2, aVar18, arrayList7, c12);
            s0.a aVar19 = aVar13;
            c13.a(s0.a(1, aVar15));
            c13.a(s0.a(2, aVar15));
            int i15 = 3;
            c13.a(s0.a(3, aVar14));
            arrayList6.add(c13);
            arrayList5.addAll(arrayList6);
            if (i13 == 0 || i13 == 1 || i13 == 3) {
                ArrayList arrayList8 = new ArrayList();
                r0 r0Var5 = new r0();
                s0.a aVar20 = aVar15;
                s0.a aVar21 = aVar12;
                s0.a aVar22 = aVar14;
                ArrayList arrayList9 = arrayList8;
                ArrayList arrayList10 = arrayList5;
                r0 c14 = v.c(1, aVar15, r0Var5, 1, aVar21, arrayList9, r0Var5);
                s0.a aVar23 = aVar20;
                r0 c15 = v.c(1, aVar23, c14, 2, aVar21, arrayList9, c14);
                r0 c16 = v.c(2, aVar23, c15, 2, aVar21, arrayList9, c15);
                i15 = 3;
                aVar3 = aVar19;
                ArrayList arrayList11 = arrayList8;
                z11 = z14;
                s0.a aVar24 = aVar20;
                z10 = z13;
                i11 = i13;
                arrayList = arrayList4;
                aVar = aVar12;
                s0.a aVar25 = aVar;
                ArrayList arrayList12 = arrayList11;
                r0 b11 = v.b(1, aVar24, c16, 1, aVar12, 3, aVar25, arrayList12, c16);
                r0 b12 = v.b(1, aVar24, b11, 2, aVar, 3, aVar25, arrayList12, b11);
                aVar2 = aVar20;
                b12.a(s0.a(2, aVar2));
                b12.a(s0.a(2, aVar2));
                aVar4 = aVar22;
                b12.a(s0.a(3, aVar4));
                arrayList11.add(b12);
                arrayList2 = arrayList10;
                arrayList2.addAll(arrayList11);
                i14 = 1;
            } else {
                aVar3 = aVar19;
                aVar4 = aVar14;
                arrayList2 = arrayList5;
                z10 = z13;
                i11 = i13;
                arrayList = arrayList4;
                aVar = aVar12;
                aVar2 = aVar15;
                z11 = z14;
            }
            if (i11 == i14 || i11 == i15) {
                ArrayList arrayList13 = new ArrayList();
                r0 r0Var6 = new r0();
                int i16 = i14;
                s0.a aVar26 = aVar2;
                s0.a aVar27 = aVar4;
                ArrayList arrayList14 = arrayList13;
                r0 c17 = v.c(i16, aVar26, r0Var6, i14, aVar27, arrayList14, r0Var6);
                r0 c18 = v.c(i16, aVar26, c17, 2, aVar27, arrayList14, c17);
                r0 c19 = v.c(2, aVar26, c18, 2, aVar27, arrayList14, c18);
                s0.a aVar28 = aVar2;
                s0.a aVar29 = aVar4;
                ArrayList arrayList15 = arrayList13;
                r0 b13 = v.b(1, aVar26, c19, 1, aVar28, 3, aVar29, arrayList15, c19);
                r0 b14 = v.b(2, aVar3, b13, 1, aVar28, 2, aVar29, arrayList15, b13);
                b14.a(s0.a(2, aVar3));
                b14.a(s0.a(2, aVar2));
                b14.a(s0.a(2, aVar4));
                arrayList13.add(b14);
                arrayList2.addAll(arrayList13);
            }
            if (z10) {
                ArrayList arrayList16 = new ArrayList();
                r0 r0Var7 = new r0();
                r0Var7.a(s0.a(4, aVar4));
                arrayList16.add(r0Var7);
                r0 r0Var8 = new r0();
                s0.a aVar30 = aVar2;
                s0.a aVar31 = aVar4;
                ArrayList arrayList17 = arrayList16;
                r0 c20 = v.c(1, aVar30, r0Var8, 4, aVar31, arrayList17, r0Var8);
                r0 c21 = v.c(2, aVar30, c20, 4, aVar31, arrayList17, c20);
                s0.a aVar32 = aVar2;
                s0.a aVar33 = aVar4;
                ArrayList arrayList18 = arrayList16;
                r0 b15 = v.b(1, aVar30, c21, 1, aVar32, 4, aVar33, arrayList18, c21);
                r0 b16 = v.b(1, aVar30, b15, 2, aVar32, 4, aVar33, arrayList18, b15);
                r0 b17 = v.b(2, aVar30, b16, 2, aVar32, 4, aVar33, arrayList18, b16);
                r0 b18 = v.b(1, aVar30, b17, 3, aVar4, 4, aVar33, arrayList18, b17);
                b18.a(s0.a(2, aVar2));
                b18.a(s0.a(3, aVar4));
                b18.a(s0.a(4, aVar4));
                arrayList16.add(b18);
                arrayList2.addAll(arrayList16);
            }
            if (z11 && i11 == 0) {
                ArrayList arrayList19 = new ArrayList();
                r0 r0Var9 = new r0();
                s0.a aVar34 = aVar2;
                s0.a aVar35 = aVar4;
                ArrayList arrayList20 = arrayList19;
                r0 c22 = v.c(1, aVar34, r0Var9, 1, aVar35, arrayList20, r0Var9);
                r0 c23 = v.c(1, aVar34, c22, 2, aVar35, arrayList20, c22);
                c23.a(s0.a(2, aVar2));
                c23.a(s0.a(2, aVar4));
                arrayList19.add(c23);
                arrayList2.addAll(arrayList19);
            }
            if (i11 == 3) {
                ArrayList arrayList21 = new ArrayList();
                r0 r0Var10 = new r0();
                r0Var10.a(s0.a(1, aVar2));
                r0Var10.a(s0.a(1, aVar3));
                r0Var10.a(s0.a(2, aVar4));
                r0Var10.a(s0.a(4, aVar4));
                arrayList21.add(r0Var10);
                r0 r0Var11 = new r0();
                r0Var11.a(s0.a(1, aVar2));
                r0Var11.a(s0.a(1, aVar3));
                r0Var11.a(s0.a(3, aVar4));
                r0Var11.a(s0.a(4, aVar4));
                arrayList21.add(r0Var11);
                arrayList2.addAll(arrayList21);
            }
            arrayList.addAll(arrayList2);
            ArrayList arrayList22 = this.f15841a;
            d dVar2 = this.f15850j;
            String str3 = this.f15847g;
            int i17 = this.f15851k;
            if (((o) dVar2.f17746a) == null) {
                arrayList3 = new ArrayList();
            } else {
                r0 r0Var12 = o.f17341a;
                String str4 = Build.DEVICE;
                if ("heroqltevzw".equalsIgnoreCase(str4) || "heroqltetmo".equalsIgnoreCase(str4)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    ArrayList arrayList23 = new ArrayList();
                    arrayList3 = arrayList23;
                    if (str3.equals("1")) {
                        arrayList23.add(o.f17341a);
                        arrayList3 = arrayList23;
                    }
                } else if (o.a()) {
                    ArrayList arrayList24 = new ArrayList();
                    arrayList3 = arrayList24;
                    if (i17 == 0) {
                        arrayList24.add(o.f17341a);
                        arrayList24.add(o.f17342b);
                        arrayList3 = arrayList24;
                    }
                } else if (o.b()) {
                    arrayList3 = Collections.singletonList(o.f17343c);
                } else {
                    arrayList3 = Collections.emptyList();
                }
            }
            arrayList22.addAll(arrayList3);
            if (this.f15856p) {
                ArrayList arrayList25 = this.f15842b;
                ArrayList arrayList26 = new ArrayList();
                r0 r0Var13 = new r0();
                s0.a aVar36 = s0.a.ULTRA_MAXIMUM;
                s0.a aVar37 = aVar36;
                aVar5 = aVar2;
                s0.a aVar38 = aVar;
                ArrayList arrayList27 = arrayList26;
                r0 b19 = v.b(2, aVar37, r0Var13, 1, aVar2, 1, aVar38, arrayList27, r0Var13);
                s0.a aVar39 = aVar5;
                r0 b20 = v.b(3, aVar37, b19, 1, aVar39, 1, aVar38, arrayList27, b19);
                r0 b21 = v.b(4, aVar37, b20, 1, aVar39, 1, aVar38, arrayList27, b20);
                s0.a aVar40 = aVar36;
                s0.a aVar41 = aVar5;
                s0.a aVar42 = aVar4;
                ArrayList arrayList28 = arrayList26;
                r0 b22 = v.b(2, aVar40, b21, 1, aVar41, 3, aVar42, arrayList28, b21);
                r0 b23 = v.b(3, aVar40, b22, 1, aVar41, 3, aVar42, arrayList28, b22);
                r0 b24 = v.b(4, aVar40, b23, 1, aVar41, 3, aVar42, arrayList28, b23);
                r0 b25 = v.b(2, aVar40, b24, 1, aVar41, 2, aVar42, arrayList28, b24);
                r0 b26 = v.b(3, aVar40, b25, 1, aVar41, 2, aVar42, arrayList28, b25);
                r0 b27 = v.b(4, aVar40, b26, 1, aVar41, 2, aVar42, arrayList28, b26);
                r0 b28 = v.b(2, aVar40, b27, 1, aVar41, 4, aVar42, arrayList28, b27);
                r0 b29 = v.b(3, aVar40, b28, 1, aVar41, 4, aVar42, arrayList28, b28);
                b29.a(s0.a(4, aVar36));
                b29.a(s0.a(1, aVar5));
                b29.a(s0.a(4, aVar4));
                arrayList26.add(b29);
                arrayList25.addAll(arrayList26);
            } else {
                aVar5 = aVar2;
            }
            boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.f15854n = hasSystemFeature;
            if (hasSystemFeature) {
                ArrayList arrayList29 = this.f15843c;
                ArrayList arrayList30 = new ArrayList();
                r0 r0Var14 = new r0();
                r0Var14.a(s0.a(2, aVar11));
                arrayList30.add(r0Var14);
                r0 r0Var15 = new r0();
                r0Var15.a(s0.a(1, aVar11));
                arrayList30.add(r0Var15);
                r0 r0Var16 = new r0();
                r0Var16.a(s0.a(3, aVar11));
                arrayList30.add(r0Var16);
                r0 r0Var17 = new r0();
                s0.a aVar43 = s0.a.s720p;
                aVar7 = aVar4;
                s0.a aVar44 = aVar43;
                s0.a aVar45 = aVar11;
                ArrayList arrayList31 = arrayList30;
                aVar6 = aVar5;
                r0 c24 = v.c(2, aVar44, r0Var17, 3, aVar45, arrayList31, r0Var17);
                r0 c25 = v.c(1, aVar44, c24, 3, aVar45, arrayList31, c24);
                r0 c26 = v.c(2, aVar44, c25, 2, aVar45, arrayList31, c25);
                r0 c27 = v.c(2, aVar44, c26, 1, aVar45, arrayList31, c26);
                r0 c28 = v.c(1, aVar44, c27, 2, aVar45, arrayList31, c27);
                c28.a(s0.a(1, aVar43));
                c28.a(s0.a(1, aVar11));
                arrayList30.add(c28);
                arrayList29.addAll(arrayList30);
            } else {
                aVar7 = aVar4;
                aVar6 = aVar5;
            }
            if (e1Var.f15664c) {
                ArrayList arrayList32 = this.f15845e;
                ArrayList arrayList33 = new ArrayList();
                r0 r0Var18 = new r0();
                r0Var18.a(s0.a(1, aVar7));
                arrayList33.add(r0Var18);
                r0 r0Var19 = new r0();
                r0Var19.a(s0.a(2, aVar7));
                arrayList33.add(r0Var19);
                r0 r0Var20 = new r0();
                s0.a aVar46 = aVar6;
                s0.a aVar47 = aVar7;
                ArrayList arrayList34 = arrayList33;
                r0 c29 = v.c(1, aVar46, r0Var20, 3, aVar47, arrayList34, r0Var20);
                r0 c30 = v.c(1, aVar46, c29, 2, aVar47, arrayList34, c29);
                r0 c31 = v.c(2, aVar46, c30, 2, aVar47, arrayList34, c30);
                r0 c32 = v.c(1, aVar6, c31, 1, aVar, arrayList33, c31);
                ArrayList arrayList35 = arrayList33;
                aVar10 = aVar7;
                r0 b30 = v.b(1, aVar6, c32, 1, aVar, 2, aVar, arrayList35, c32);
                aVar9 = aVar6;
                b30.a(s0.a(1, aVar9));
                aVar8 = aVar;
                b30.a(s0.a(1, aVar8));
                b30.a(s0.a(3, aVar8));
                arrayList35.add(b30);
                arrayList32.addAll(arrayList35);
            } else {
                aVar8 = aVar;
                aVar9 = aVar6;
                aVar10 = aVar7;
            }
            boolean d10 = s1.d(this.f15849i);
            this.f15855o = d10;
            if (d10 && Build.VERSION.SDK_INT >= 33) {
                ArrayList arrayList36 = this.f15846f;
                ArrayList arrayList37 = new ArrayList();
                r0 r0Var21 = new r0();
                r0Var21.a(new f0.d(1, aVar11, 4));
                arrayList37.add(r0Var21);
                r0 r0Var22 = new r0();
                r0Var22.a(new f0.d(2, aVar11, 4));
                arrayList37.add(r0Var22);
                r0 r0Var23 = new r0();
                r0Var23.a(new f0.d(1, aVar8, 3));
                arrayList37.add(r0Var23);
                r0 r0Var24 = new r0();
                r0Var24.a(new f0.d(2, aVar8, 3));
                arrayList37.add(r0Var24);
                r0 r0Var25 = new r0();
                r0Var25.a(new f0.d(3, aVar10, 2));
                arrayList37.add(r0Var25);
                r0 r0Var26 = new r0();
                r0Var26.a(new f0.d(2, aVar10, 2));
                arrayList37.add(r0Var26);
                r0 r0Var27 = new r0();
                r0Var27.a(new f0.d(1, aVar9, 1));
                r0Var27.a(new f0.d(3, aVar10, 2));
                arrayList37.add(r0Var27);
                r0 r0Var28 = new r0();
                r0Var28.a(new f0.d(1, aVar9, 1));
                r0Var28.a(new f0.d(2, aVar10, 2));
                arrayList37.add(r0Var28);
                r0 r0Var29 = new r0();
                r0Var29.a(new f0.d(1, aVar9, 1));
                r0Var29.a(new f0.d(1, aVar8, 3));
                arrayList37.add(r0Var29);
                r0 r0Var30 = new r0();
                r0Var30.a(new f0.d(1, aVar9, 1));
                r0Var30.a(new f0.d(2, aVar8, 3));
                arrayList37.add(r0Var30);
                r0 r0Var31 = new r0();
                r0Var31.a(new f0.d(1, aVar9, 1));
                r0Var31.a(new f0.d(2, aVar9, 1));
                arrayList37.add(r0Var31);
                r0 r0Var32 = new r0();
                r0Var32.a(new f0.d(1, aVar9, 1));
                r0Var32.a(new f0.d(1, aVar8, 3));
                r0Var32.a(new f0.d(3, aVar8, 2));
                arrayList37.add(r0Var32);
                r0 r0Var33 = new r0();
                r0Var33.a(new f0.d(1, aVar9, 1));
                r0Var33.a(new f0.d(2, aVar8, 3));
                r0Var33.a(new f0.d(3, aVar8, 2));
                arrayList37.add(r0Var33);
                r0 r0Var34 = new r0();
                r0Var34.a(new f0.d(1, aVar9, 1));
                r0Var34.a(new f0.d(2, aVar9, 1));
                r0Var34.a(new f0.d(3, aVar10, 2));
                arrayList37.add(r0Var34);
                arrayList36.addAll(arrayList37);
            }
            b();
        } catch (CameraAccessExceptionCompat e10) {
            throw l0.B(e10);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.util.Size} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Size c(android.hardware.camera2.params.StreamConfigurationMap r4, int r5, boolean r6) {
        /*
            r0 = 34
            if (r5 != r0) goto L_0x000b
            java.lang.Class<android.graphics.SurfaceTexture> r0 = android.graphics.SurfaceTexture.class
            android.util.Size[] r0 = r4.getOutputSizes(r0)
            goto L_0x000f
        L_0x000b:
            android.util.Size[] r0 = r4.getOutputSizes(r5)
        L_0x000f:
            if (r0 == 0) goto L_0x0050
            int r1 = r0.length
            if (r1 != 0) goto L_0x0015
            goto L_0x0050
        L_0x0015:
            g0.c r1 = new g0.c
            r2 = 0
            r1.<init>(r2)
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.Object r0 = java.util.Collections.max(r0, r1)
            android.util.Size r0 = (android.util.Size) r0
            android.util.Size r3 = m0.a.f13036a
            if (r6 == 0) goto L_0x003d
            android.util.Size[] r4 = v.t1.a.a(r4, r5)
            if (r4 == 0) goto L_0x003d
            int r5 = r4.length
            if (r5 <= 0) goto L_0x003d
            java.util.List r4 = java.util.Arrays.asList(r4)
            java.lang.Object r4 = java.util.Collections.max(r4, r1)
            r3 = r4
            android.util.Size r3 = (android.util.Size) r3
        L_0x003d:
            r4 = 2
            android.util.Size[] r4 = new android.util.Size[r4]
            r4[r2] = r0
            r5 = 1
            r4[r5] = r3
            java.util.List r4 = java.util.Arrays.asList(r4)
            java.lang.Object r4 = java.util.Collections.max(r4, r1)
            android.util.Size r4 = (android.util.Size) r4
            return r4
        L_0x0050:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: v.t1.c(android.hardware.camera2.params.StreamConfigurationMap, int, boolean):android.util.Size");
    }

    public static int e(Range<Integer> range, Range<Integer> range2) {
        boolean z10;
        if (range.contains(range2.getUpper()) || range.contains(range2.getLower())) {
            z10 = false;
        } else {
            z10 = true;
        }
        g0.E("Ranges must not intersect", z10);
        if (range.getLower().intValue() > range2.getUpper().intValue()) {
            return range.getLower().intValue() - range2.getUpper().intValue();
        }
        return range2.getLower().intValue() - range.getUpper().intValue();
    }

    public static int f(Range<Integer> range) {
        return (range.getUpper().intValue() - range.getLower().intValue()) + 1;
    }

    public final boolean a(c cVar, List list) {
        List<r0> list2;
        if (this.f15844d.containsKey(cVar)) {
            list2 = (List) this.f15844d.get(cVar);
        } else {
            ArrayList arrayList = new ArrayList();
            int i10 = cVar.f15601b;
            if (i10 == 8) {
                int i11 = cVar.f15600a;
                if (i11 == 1) {
                    arrayList = this.f15843c;
                } else if (i11 != 2) {
                    arrayList.addAll(this.f15841a);
                } else {
                    arrayList.addAll(this.f15842b);
                    arrayList.addAll(this.f15841a);
                }
            } else if (i10 == 10 && cVar.f15600a == 0) {
                arrayList.addAll(this.f15845e);
            }
            this.f15844d.put(cVar, arrayList);
            list2 = arrayList;
        }
        boolean z10 = false;
        for (r0 c10 : list2) {
            if (c10.c(list) != null) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                break;
            }
        }
        return z10;
    }

    public final void b() {
        Size size;
        Size size2;
        CamcorderProfile camcorderProfile;
        Size e10 = this.f15859s.e();
        try {
            int parseInt = Integer.parseInt(this.f15847g);
            CamcorderProfile camcorderProfile2 = null;
            if (this.f15848h.b(parseInt, 1)) {
                camcorderProfile = this.f15848h.a(parseInt, 1);
            } else {
                camcorderProfile = null;
            }
            if (camcorderProfile != null) {
                size = new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
                this.f15857q = new e(m0.a.f13037b, new HashMap(), e10, new HashMap(), size, new HashMap(), new HashMap());
            }
            size2 = m0.a.f13038c;
            if (this.f15848h.b(parseInt, 10)) {
                camcorderProfile2 = this.f15848h.a(parseInt, 10);
            } else if (this.f15848h.b(parseInt, 8)) {
                camcorderProfile2 = this.f15848h.a(parseInt, 8);
            } else if (this.f15848h.b(parseInt, 12)) {
                camcorderProfile2 = this.f15848h.a(parseInt, 12);
            } else if (this.f15848h.b(parseInt, 6)) {
                camcorderProfile2 = this.f15848h.a(parseInt, 6);
            } else if (this.f15848h.b(parseInt, 5)) {
                camcorderProfile2 = this.f15848h.a(parseInt, 5);
            } else if (this.f15848h.b(parseInt, 4)) {
                camcorderProfile2 = this.f15848h.a(parseInt, 4);
            }
            if (camcorderProfile2 != null) {
                size2 = new Size(camcorderProfile2.videoFrameWidth, camcorderProfile2.videoFrameHeight);
            }
            size = size2;
            this.f15857q = new e(m0.a.f13037b, new HashMap(), e10, new HashMap(), size, new HashMap(), new HashMap());
        } catch (NumberFormatException unused) {
            Size[] outputSizes = this.f15849i.b().f16200a.f16212a.getOutputSizes(MediaRecorder.class);
            if (outputSizes != null) {
                Arrays.sort(outputSizes, new c(true));
                int length = outputSizes.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        size2 = m0.a.f13038c;
                        break;
                    }
                    Size size3 = outputSizes[i10];
                    int width = size3.getWidth();
                    Size size4 = m0.a.f13040e;
                    if (width <= size4.getWidth() && size3.getHeight() <= size4.getHeight()) {
                        size2 = size3;
                        break;
                    }
                    i10++;
                }
            } else {
                size2 = m0.a.f13038c;
            }
        }
    }

    public final List d(c cVar, List list) {
        boolean z10;
        androidx.camera.core.impl.c cVar2 = s1.f15834a;
        if (cVar.f15600a == 0 && cVar.f15601b == 8) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return null;
        }
        Iterator it = this.f15846f.iterator();
        while (it.hasNext()) {
            List<s0> c10 = ((r0) it.next()).c(list);
            if (c10 != null) {
                return c10;
            }
        }
        return null;
    }

    public final Pair g(int i10, ArrayList arrayList, List list, ArrayList arrayList2, ArrayList arrayList3, int i11, HashMap hashMap, HashMap hashMap2) {
        int i12;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.a aVar = (androidx.camera.core.impl.a) it.next();
            arrayList4.add(aVar.f());
            if (hashMap != null) {
                hashMap.put(Integer.valueOf(arrayList4.size() - 1), aVar);
            }
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            Size size = (Size) list.get(i13);
            x xVar = (x) arrayList2.get(((Integer) arrayList3.get(i13)).intValue());
            int l10 = xVar.l();
            arrayList4.add(s0.e(i10, l10, size, h(l10)));
            if (hashMap2 != null) {
                hashMap2.put(Integer.valueOf(arrayList4.size() - 1), xVar);
            }
            try {
                i12 = (int) (1.0E9d / ((double) ((StreamConfigurationMap) this.f15849i.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(xVar.l(), size)));
            } catch (Exception unused) {
                i12 = 0;
            }
            i11 = Math.min(i11, i12);
        }
        return new Pair(arrayList4, Integer.valueOf(i11));
    }

    public final e h(int i10) {
        StreamConfigurationMap streamConfigurationMap;
        if (!this.f15858r.contains(Integer.valueOf(i10))) {
            i(this.f15857q.f9525b, m0.a.f13039d, i10);
            i(this.f15857q.f9527d, m0.a.f13041f, i10);
            Map<Integer, Size> map = this.f15857q.f9529f;
            Size c10 = c(this.f15849i.b().f16200a.f16212a, i10, true);
            if (c10 != null) {
                map.put(Integer.valueOf(i10), c10);
            }
            Map<Integer, Size> map2 = this.f15857q.f9530g;
            if (Build.VERSION.SDK_INT >= 31 && this.f15856p && (streamConfigurationMap = (StreamConfigurationMap) this.f15849i.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) != null) {
                map2.put(Integer.valueOf(i10), c(streamConfigurationMap, i10, true));
            }
            this.f15858r.add(Integer.valueOf(i10));
        }
        return this.f15857q;
    }

    public final void i(Map<Integer, Size> map, Size size, int i10) {
        if (this.f15854n) {
            Size c10 = c(this.f15849i.b().f16200a.f16212a, i10, false);
            Integer valueOf = Integer.valueOf(i10);
            if (c10 != null) {
                size = (Size) Collections.min(Arrays.asList(new Size[]{size, c10}), new c(false));
            }
            map.put(valueOf, size);
        }
    }
}
