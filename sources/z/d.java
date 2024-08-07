package z;

import android.view.ViewGroup;
import ba.h;
import cd.b;
import cd.e;
import com.google.android.gms.internal.safetynet.zzaf;
import com.google.android.gms.internal.safetynet.zzh;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseNetworkException;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import f0.m0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kd.j;
import t6.k;
import uc.l;
import ud.a;
import ud.g;
import w6.m;
import y.o;

/* compiled from: ExtraSupportedSurfaceCombinationsContainer */
public final class d implements m, OnFailureListener, l {

    /* renamed from: a  reason: collision with root package name */
    public Object f17746a;

    public /* synthetic */ d(Object obj) {
        this.f17746a = obj;
    }

    public final boolean a(Class cls) {
        for (m0 m0Var : (List) this.f17746a) {
            if (cls.isAssignableFrom(m0Var.getClass())) {
                return true;
            }
        }
        return false;
    }

    public final void accept(Object obj, Object obj2) {
        ((zzh) ((zzaf) obj).getService()).zzf(new o7.l((TaskCompletionSource) obj2));
    }

    public final e b(b bVar, Map map) {
        ChecksumException checksumException;
        a aVar = new a(bVar);
        try {
            return c(aVar, map);
        } catch (FormatException e10) {
            e = e10;
            checksumException = null;
            try {
                aVar.e();
                aVar.f15491b = null;
                aVar.f15492c = null;
                aVar.f15493d = true;
                aVar.d();
                aVar.c();
                aVar.b();
                e c10 = c(aVar, map);
                c10.f4705e = new g();
                return c10;
            } catch (ChecksumException | FormatException unused) {
                if (e != null) {
                    throw e;
                }
                throw checksumException;
            }
        } catch (ChecksumException e11) {
            checksumException = e11;
            e = null;
            aVar.e();
            aVar.f15491b = null;
            aVar.f15492c = null;
            aVar.f15493d = true;
            aVar.d();
            aVar.c();
            aVar.b();
            e c102 = c(aVar, map);
            c102.f4705e = new g();
            return c102;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:147:0x0273 A[Catch:{ IllegalArgumentException -> 0x0371 }] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x036d A[LOOP:21: B:111:0x0220->B:210:0x036d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0353 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final cd.e c(ud.a r28, java.util.Map r29) {
        /*
            r27 = this;
            r0 = r28
            ud.h r1 = r28.d()
            ud.e r2 = r28.c()
            int r2 = r2.f15499a
            ud.e r3 = r28.c()
            ud.h r4 = r28.d()
            ud.c[] r5 = ud.c.values()
            byte r3 = r3.f15500b
            r3 = r5[r3]
            cd.b r5 = r0.f15490a
            int r6 = r5.f4690b
            r3.getClass()
            r7 = 0
            r8 = r7
        L_0x0025:
            if (r8 >= r6) goto L_0x0039
            r9 = r7
        L_0x0028:
            if (r9 >= r6) goto L_0x0036
            boolean r10 = r3.b(r8, r9)
            if (r10 == 0) goto L_0x0033
            r5.a(r9, r8)
        L_0x0033:
            int r9 = r9 + 1
            goto L_0x0028
        L_0x0036:
            int r8 = r8 + 1
            goto L_0x0025
        L_0x0039:
            int r3 = r4.f15517a
            r5 = 4
            int r3 = r3 * r5
            int r3 = r3 + 17
            cd.b r8 = new cd.b
            r8.<init>(r3, r3)
            r9 = 9
            r8.j(r7, r7, r9, r9)
            int r10 = r3 + -8
            r11 = 8
            r8.j(r10, r7, r11, r9)
            r8.j(r7, r10, r9, r11)
            int[] r10 = r4.f15518b
            int r10 = r10.length
            r12 = r7
        L_0x0057:
            r13 = 5
            if (r12 >= r10) goto L_0x0082
            int[] r14 = r4.f15518b
            r14 = r14[r12]
            int r14 = r14 + -2
            r15 = r7
        L_0x0061:
            if (r15 >= r10) goto L_0x007e
            if (r12 != 0) goto L_0x006b
            if (r15 == 0) goto L_0x007a
            int r5 = r10 + -1
            if (r15 == r5) goto L_0x007a
        L_0x006b:
            int r5 = r10 + -1
            if (r12 != r5) goto L_0x0071
            if (r15 == 0) goto L_0x007a
        L_0x0071:
            int[] r5 = r4.f15518b
            r5 = r5[r15]
            int r5 = r5 + -2
            r8.j(r5, r14, r13, r13)
        L_0x007a:
            int r15 = r15 + 1
            r5 = 4
            goto L_0x0061
        L_0x007e:
            int r12 = r12 + 1
            r5 = 4
            goto L_0x0057
        L_0x0082:
            int r5 = r3 + -17
            r10 = 6
            r12 = 1
            r8.j(r10, r9, r12, r5)
            r8.j(r9, r10, r5, r12)
            int r5 = r4.f15517a
            r14 = 3
            if (r5 <= r10) goto L_0x0099
            int r3 = r3 + -11
            r8.j(r3, r7, r14, r10)
            r8.j(r7, r3, r10, r14)
        L_0x0099:
            int r3 = r4.f15520d
            byte[] r5 = new byte[r3]
            int r15 = r6 + -1
            r13 = r7
            r17 = r13
            r18 = r17
            r16 = r12
            r9 = r15
        L_0x00a7:
            r14 = 2
            if (r9 <= 0) goto L_0x010a
            if (r9 != r10) goto L_0x00ae
            int r9 = r9 + -1
        L_0x00ae:
            r10 = r7
        L_0x00af:
            if (r10 >= r6) goto L_0x00fe
            if (r16 == 0) goto L_0x00b8
            int r19 = r15 - r10
            r12 = r19
            goto L_0x00b9
        L_0x00b8:
            r12 = r10
        L_0x00b9:
            if (r7 >= r14) goto L_0x00f4
            int r14 = r9 - r7
            boolean r20 = r8.b(r14, r12)
            if (r20 != 0) goto L_0x00ea
            int r11 = r17 + 1
            int r17 = r18 << 1
            r21 = r6
            cd.b r6 = r0.f15490a
            boolean r6 = r6.b(r14, r12)
            if (r6 == 0) goto L_0x00d4
            r6 = r17 | 1
            goto L_0x00d6
        L_0x00d4:
            r6 = r17
        L_0x00d6:
            r14 = 8
            if (r11 != r14) goto L_0x00e5
            int r11 = r13 + 1
            byte r6 = (byte) r6
            r5[r13] = r6
            r13 = r11
            r17 = 0
            r18 = 0
            goto L_0x00ec
        L_0x00e5:
            r18 = r6
            r17 = r11
            goto L_0x00ec
        L_0x00ea:
            r21 = r6
        L_0x00ec:
            int r7 = r7 + 1
            r6 = r21
            r11 = 8
            r14 = 2
            goto L_0x00b9
        L_0x00f4:
            r21 = r6
            int r10 = r10 + 1
            r7 = 0
            r11 = 8
            r12 = 1
            r14 = 2
            goto L_0x00af
        L_0x00fe:
            r21 = r6
            r16 = r16 ^ 1
            int r9 = r9 + -2
            r7 = 0
            r10 = 6
            r11 = 8
            r12 = 1
            goto L_0x00a7
        L_0x010a:
            int r0 = r4.f15520d
            if (r13 != r0) goto L_0x037c
            int r0 = r1.f15520d
            if (r3 != r0) goto L_0x0376
            ud.h$b[] r0 = r1.f15519c
            int r3 = v.v.g(r2)
            r0 = r0[r3]
            ud.h$a[] r3 = r0.f15524b
            int r4 = r3.length
            r6 = 0
            r7 = 0
        L_0x011f:
            if (r6 >= r4) goto L_0x0129
            r8 = r3[r6]
            int r8 = r8.f15521a
            int r7 = r7 + r8
            int r6 = r6 + 1
            goto L_0x011f
        L_0x0129:
            ud.b[] r4 = new ud.b[r7]
            int r6 = r3.length
            r8 = 0
            r9 = 0
        L_0x012e:
            if (r8 >= r6) goto L_0x014e
            r10 = r3[r8]
            r11 = 0
        L_0x0133:
            int r12 = r10.f15521a
            if (r11 >= r12) goto L_0x014b
            int r12 = r10.f15522b
            int r13 = r0.f15523a
            int r13 = r13 + r12
            int r14 = r9 + 1
            ud.b r15 = new ud.b
            byte[] r13 = new byte[r13]
            r15.<init>(r12, r13)
            r4[r9] = r15
            int r11 = r11 + 1
            r9 = r14
            goto L_0x0133
        L_0x014b:
            int r8 = r8 + 1
            goto L_0x012e
        L_0x014e:
            r8 = 0
            r3 = r4[r8]
            byte[] r3 = r3.f15495b
            int r3 = r3.length
            int r6 = r7 + -1
        L_0x0156:
            if (r6 < 0) goto L_0x0162
            r8 = r4[r6]
            byte[] r8 = r8.f15495b
            int r8 = r8.length
            if (r8 == r3) goto L_0x0162
            int r6 = r6 + -1
            goto L_0x0156
        L_0x0162:
            r8 = 1
            int r6 = r6 + r8
            int r0 = r0.f15523a
            int r3 = r3 - r0
            r0 = 0
            r8 = 0
        L_0x0169:
            if (r8 >= r3) goto L_0x017f
            r10 = 0
        L_0x016c:
            if (r10 >= r9) goto L_0x017c
            r11 = r4[r10]
            byte[] r11 = r11.f15495b
            int r12 = r0 + 1
            byte r0 = r5[r0]
            r11[r8] = r0
            int r10 = r10 + 1
            r0 = r12
            goto L_0x016c
        L_0x017c:
            int r8 = r8 + 1
            goto L_0x0169
        L_0x017f:
            r8 = r6
        L_0x0180:
            if (r8 >= r9) goto L_0x0190
            r10 = r4[r8]
            byte[] r10 = r10.f15495b
            int r11 = r0 + 1
            byte r0 = r5[r0]
            r10[r3] = r0
            int r8 = r8 + 1
            r0 = r11
            goto L_0x0180
        L_0x0190:
            r8 = 0
            r10 = r4[r8]
            byte[] r10 = r10.f15495b
            int r10 = r10.length
        L_0x0196:
            if (r3 >= r10) goto L_0x01b2
            r11 = r8
        L_0x0199:
            if (r11 >= r9) goto L_0x01af
            if (r11 >= r6) goto L_0x019f
            r12 = r3
            goto L_0x01a1
        L_0x019f:
            int r12 = r3 + 1
        L_0x01a1:
            r13 = r4[r11]
            byte[] r13 = r13.f15495b
            int r14 = r0 + 1
            byte r0 = r5[r0]
            r13[r12] = r0
            int r11 = r11 + 1
            r0 = r14
            goto L_0x0199
        L_0x01af:
            int r3 = r3 + 1
            goto L_0x0196
        L_0x01b2:
            r0 = r8
            r3 = r0
        L_0x01b4:
            if (r0 >= r7) goto L_0x01be
            r5 = r4[r0]
            int r5 = r5.f15494a
            int r3 = r3 + r5
            int r0 = r0 + 1
            goto L_0x01b4
        L_0x01be:
            byte[] r10 = new byte[r3]
            r0 = r8
            r3 = r0
        L_0x01c2:
            if (r0 >= r7) goto L_0x0204
            r5 = r4[r0]
            byte[] r6 = r5.f15495b
            int r5 = r5.f15494a
            int r9 = r6.length
            int[] r11 = new int[r9]
            r12 = r8
        L_0x01ce:
            if (r12 >= r9) goto L_0x01d9
            byte r13 = r6[r12]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r11[r12] = r13
            int r12 = r12 + 1
            goto L_0x01ce
        L_0x01d9:
            r15 = r27
            java.lang.Object r9 = r15.f17746a     // Catch:{ ReedSolomonException -> 0x01ff }
            z.d r9 = (z.d) r9     // Catch:{ ReedSolomonException -> 0x01ff }
            int r12 = r6.length     // Catch:{ ReedSolomonException -> 0x01ff }
            int r12 = r12 - r5
            r9.d(r11, r12)     // Catch:{ ReedSolomonException -> 0x01ff }
            r9 = r8
        L_0x01e5:
            if (r9 >= r5) goto L_0x01ef
            r12 = r11[r9]
            byte r12 = (byte) r12
            r6[r9] = r12
            int r9 = r9 + 1
            goto L_0x01e5
        L_0x01ef:
            r9 = r8
        L_0x01f0:
            if (r9 >= r5) goto L_0x01fc
            int r11 = r3 + 1
            byte r12 = r6[r9]
            r10[r3] = r12
            int r9 = r9 + 1
            r3 = r11
            goto L_0x01f0
        L_0x01fc:
            int r0 = r0 + 1
            goto L_0x01c2
        L_0x01ff:
            com.google.zxing.ChecksumException r0 = com.google.zxing.ChecksumException.a()
            throw r0
        L_0x0204:
            r15 = r27
            char[] r0 = ud.d.f15497a
            ud.f r0 = ud.f.TERMINATOR
            cd.c r3 = new cd.c
            r3.<init>(r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 50
            r4.<init>(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 1
            r5.<init>(r6)
            r7 = -1
            r9 = r8
            r11 = 0
            r8 = r7
        L_0x0220:
            int r12 = r3.a()     // Catch:{ IllegalArgumentException -> 0x0371 }
            r13 = 7
            r14 = 4
            if (r12 >= r14) goto L_0x0229
            goto L_0x026c
        L_0x0229:
            int r12 = r3.b(r14)     // Catch:{ IllegalArgumentException -> 0x0371 }
            if (r12 == 0) goto L_0x026c
            r6 = 1
            if (r12 == r6) goto L_0x0269
            r6 = 2
            if (r12 == r6) goto L_0x0266
            r6 = 3
            if (r12 == r6) goto L_0x0263
            if (r12 == r14) goto L_0x0260
            r6 = 5
            if (r12 == r6) goto L_0x025d
            if (r12 == r13) goto L_0x025a
            r6 = 8
            if (r12 == r6) goto L_0x0257
            r6 = 9
            if (r12 == r6) goto L_0x0254
            r6 = 13
            if (r12 != r6) goto L_0x024e
            ud.f r6 = ud.f.HANZI     // Catch:{ IllegalArgumentException -> 0x0371 }
            goto L_0x026d
        L_0x024e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0371 }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x0371 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0371 }
        L_0x0254:
            ud.f r6 = ud.f.FNC1_SECOND_POSITION     // Catch:{ IllegalArgumentException -> 0x0371 }
            goto L_0x026d
        L_0x0257:
            ud.f r6 = ud.f.KANJI     // Catch:{ IllegalArgumentException -> 0x0371 }
            goto L_0x026d
        L_0x025a:
            ud.f r6 = ud.f.ECI     // Catch:{ IllegalArgumentException -> 0x0371 }
            goto L_0x026d
        L_0x025d:
            ud.f r6 = ud.f.FNC1_FIRST_POSITION     // Catch:{ IllegalArgumentException -> 0x0371 }
            goto L_0x026d
        L_0x0260:
            ud.f r6 = ud.f.BYTE     // Catch:{ IllegalArgumentException -> 0x0371 }
            goto L_0x026d
        L_0x0263:
            ud.f r6 = ud.f.STRUCTURED_APPEND     // Catch:{ IllegalArgumentException -> 0x0371 }
            goto L_0x026d
        L_0x0266:
            ud.f r6 = ud.f.ALPHANUMERIC     // Catch:{ IllegalArgumentException -> 0x0371 }
            goto L_0x026d
        L_0x0269:
            ud.f r6 = ud.f.NUMERIC     // Catch:{ IllegalArgumentException -> 0x0371 }
            goto L_0x026d
        L_0x026c:
            r6 = r0
        L_0x026d:
            int r12 = r6.ordinal()     // Catch:{ IllegalArgumentException -> 0x0371 }
            if (r12 == 0) goto L_0x034e
            r14 = 3
            if (r12 == r14) goto L_0x0335
            r14 = 5
            if (r12 == r14) goto L_0x02de
            if (r12 == r13) goto L_0x02d8
            r13 = 8
            if (r12 == r13) goto L_0x02d8
            r13 = 9
            if (r12 == r13) goto L_0x02c3
            int r12 = r6.b(r1)     // Catch:{ IllegalArgumentException -> 0x0371 }
            int r12 = r3.b(r12)     // Catch:{ IllegalArgumentException -> 0x0371 }
            int r13 = r6.ordinal()     // Catch:{ IllegalArgumentException -> 0x0371 }
            r14 = 1
            if (r13 == r14) goto L_0x02bd
            r14 = 2
            if (r13 == r14) goto L_0x02b7
            r14 = 4
            if (r13 == r14) goto L_0x02a5
            r14 = 6
            if (r13 != r14) goto L_0x02a0
            ud.d.d(r3, r4, r12)     // Catch:{ IllegalArgumentException -> 0x0371 }
            goto L_0x034e
        L_0x02a0:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()     // Catch:{ IllegalArgumentException -> 0x0371 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0371 }
        L_0x02a5:
            r14 = 6
            r21 = r3
            r22 = r4
            r23 = r12
            r24 = r11
            r25 = r5
            r26 = r29
            ud.d.b(r21, r22, r23, r24, r25, r26)     // Catch:{ IllegalArgumentException -> 0x0371 }
            goto L_0x034e
        L_0x02b7:
            r14 = 6
            ud.d.a(r3, r4, r12, r9)     // Catch:{ IllegalArgumentException -> 0x0371 }
            goto L_0x034e
        L_0x02bd:
            r14 = 6
            ud.d.e(r3, r4, r12)     // Catch:{ IllegalArgumentException -> 0x0371 }
            goto L_0x034e
        L_0x02c3:
            r12 = 4
            r14 = 6
            int r13 = r3.b(r12)     // Catch:{ IllegalArgumentException -> 0x0371 }
            int r12 = r6.b(r1)     // Catch:{ IllegalArgumentException -> 0x0371 }
            int r12 = r3.b(r12)     // Catch:{ IllegalArgumentException -> 0x0371 }
            r14 = 1
            if (r13 != r14) goto L_0x02da
            ud.d.c(r3, r4, r12)     // Catch:{ IllegalArgumentException -> 0x0371 }
            goto L_0x02da
        L_0x02d8:
            r14 = 1
            r9 = r14
        L_0x02da:
            r12 = 8
            goto L_0x0351
        L_0x02de:
            r11 = 8
            r14 = 1
            int r12 = r3.b(r11)     // Catch:{ IllegalArgumentException -> 0x0371 }
            r11 = r12 & 128(0x80, float:1.794E-43)
            if (r11 != 0) goto L_0x02ec
            r11 = r12 & 127(0x7f, float:1.78E-43)
            goto L_0x030f
        L_0x02ec:
            r11 = r12 & 192(0xc0, float:2.69E-43)
            r13 = 128(0x80, float:1.794E-43)
            if (r11 != r13) goto L_0x02fe
            r11 = 8
            int r13 = r3.b(r11)     // Catch:{ IllegalArgumentException -> 0x0371 }
            r12 = r12 & 63
            int r12 = r12 << r11
            r11 = r12 | r13
            goto L_0x030f
        L_0x02fe:
            r11 = r12 & 224(0xe0, float:3.14E-43)
            r13 = 192(0xc0, float:2.69E-43)
            if (r11 != r13) goto L_0x0330
            r11 = 16
            int r13 = r3.b(r11)     // Catch:{ IllegalArgumentException -> 0x0371 }
            r12 = r12 & 31
            int r11 = r12 << 16
            r11 = r11 | r13
        L_0x030f:
            java.util.HashMap r12 = cd.d.f4696c     // Catch:{ IllegalArgumentException -> 0x0371 }
            if (r11 < 0) goto L_0x032b
            r12 = 900(0x384, float:1.261E-42)
            if (r11 >= r12) goto L_0x032b
            java.util.HashMap r12 = cd.d.f4696c     // Catch:{ IllegalArgumentException -> 0x0371 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ IllegalArgumentException -> 0x0371 }
            java.lang.Object r11 = r12.get(r11)     // Catch:{ IllegalArgumentException -> 0x0371 }
            cd.d r11 = (cd.d) r11     // Catch:{ IllegalArgumentException -> 0x0371 }
            if (r11 == 0) goto L_0x0326
            goto L_0x02da
        L_0x0326:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()     // Catch:{ IllegalArgumentException -> 0x0371 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0371 }
        L_0x032b:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()     // Catch:{ IllegalArgumentException -> 0x0371 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0371 }
        L_0x0330:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()     // Catch:{ IllegalArgumentException -> 0x0371 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0371 }
        L_0x0335:
            r14 = 1
            int r7 = r3.a()     // Catch:{ IllegalArgumentException -> 0x0371 }
            r8 = 16
            if (r7 < r8) goto L_0x0349
            r12 = 8
            int r7 = r3.b(r12)     // Catch:{ IllegalArgumentException -> 0x0371 }
            int r8 = r3.b(r12)     // Catch:{ IllegalArgumentException -> 0x0371 }
            goto L_0x0351
        L_0x0349:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()     // Catch:{ IllegalArgumentException -> 0x0371 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0371 }
        L_0x034e:
            r12 = 8
            r14 = 1
        L_0x0351:
            if (r6 != r0) goto L_0x036d
            cd.e r0 = new cd.e
            java.lang.String r11 = r4.toString()
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x0361
            r12 = 0
            goto L_0x0362
        L_0x0361:
            r12 = r5
        L_0x0362:
            java.lang.String r13 = n0.l.r(r2)
            r9 = r0
            r14 = r7
            r15 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15)
            return r0
        L_0x036d:
            r15 = r27
            goto L_0x0220
        L_0x0371:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        L_0x0376:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x037c:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z.d.c(ud.a, java.util.Map):cd.e");
    }

    public final void d(int[] iArr, int i10) {
        int[] iArr2;
        int i11;
        ed.b bVar = new ed.b((ed.a) this.f17746a, iArr);
        int[] iArr3 = new int[i10];
        int i12 = 0;
        boolean z10 = true;
        for (int i13 = 0; i13 < i10; i13++) {
            ed.a aVar = (ed.a) this.f17746a;
            int b10 = bVar.b(aVar.f9347a[aVar.f9353g + i13]);
            iArr3[(i10 - 1) - i13] = b10;
            if (b10 != 0) {
                z10 = false;
            }
        }
        if (!z10) {
            ed.b bVar2 = new ed.b((ed.a) this.f17746a, iArr3);
            ed.b a10 = ((ed.a) this.f17746a).a(i10, 1);
            if (a10.f9355b.length - 1 < bVar2.f9355b.length - 1) {
                ed.b bVar3 = a10;
                a10 = bVar2;
                bVar2 = bVar3;
            }
            ed.a aVar2 = (ed.a) this.f17746a;
            ed.b bVar4 = aVar2.f9349c;
            ed.b bVar5 = aVar2.f9350d;
            ed.b bVar6 = bVar4;
            while (bVar2.f9355b.length - 1 >= i10 / 2) {
                if (!bVar2.d()) {
                    ed.b bVar7 = ((ed.a) this.f17746a).f9349c;
                    int b11 = ((ed.a) this.f17746a).b(bVar2.c(bVar2.f9355b.length - 1));
                    while (a10.f9355b.length - 1 >= bVar2.f9355b.length - 1 && !a10.d()) {
                        int[] iArr4 = a10.f9355b;
                        int length = (iArr4.length - 1) - (bVar2.f9355b.length - 1);
                        int c10 = ((ed.a) this.f17746a).c(a10.c(iArr4.length - 1), b11);
                        bVar7 = bVar7.a(((ed.a) this.f17746a).a(length, c10));
                        a10 = a10.a(bVar2.g(length, c10));
                    }
                    ed.b a11 = bVar7.f(bVar5).a(bVar6);
                    if (a10.f9355b.length - 1 < bVar2.f9355b.length - 1) {
                        ed.b bVar8 = a10;
                        a10 = bVar2;
                        bVar2 = bVar8;
                        ed.b bVar9 = bVar5;
                        bVar5 = a11;
                        bVar6 = bVar9;
                    } else {
                        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
                    }
                } else {
                    throw new ReedSolomonException("r_{i-1} was zero");
                }
            }
            int c11 = bVar5.c(0);
            if (c11 != 0) {
                int b12 = ((ed.a) this.f17746a).b(c11);
                ed.b e10 = bVar5.e(b12);
                ed.b e11 = bVar2.e(b12);
                int length2 = e10.f9355b.length - 1;
                if (length2 == 1) {
                    iArr2 = new int[]{e10.c(1)};
                } else {
                    int[] iArr5 = new int[length2];
                    int i14 = 0;
                    for (int i15 = 1; i15 < ((ed.a) this.f17746a).f9351e && i14 < length2; i15++) {
                        if (e10.b(i15) == 0) {
                            iArr5[i14] = ((ed.a) this.f17746a).b(i15);
                            i14++;
                        }
                    }
                    if (i14 == length2) {
                        iArr2 = iArr5;
                    } else {
                        throw new ReedSolomonException("Error locator degree does not match number of roots");
                    }
                }
                int length3 = iArr2.length;
                int[] iArr6 = new int[length3];
                for (int i16 = 0; i16 < length3; i16++) {
                    int b13 = ((ed.a) this.f17746a).b(iArr2[i16]);
                    int i17 = 1;
                    for (int i18 = 0; i18 < length3; i18++) {
                        if (i16 != i18) {
                            int c12 = ((ed.a) this.f17746a).c(iArr2[i18], b13);
                            if ((c12 & 1) == 0) {
                                i11 = c12 | 1;
                            } else {
                                i11 = c12 & -2;
                            }
                            i17 = ((ed.a) this.f17746a).c(i17, i11);
                        }
                    }
                    int c13 = ((ed.a) this.f17746a).c(e11.b(b13), ((ed.a) this.f17746a).b(i17));
                    iArr6[i16] = c13;
                    ed.a aVar3 = (ed.a) this.f17746a;
                    if (aVar3.f9353g != 0) {
                        iArr6[i16] = aVar3.c(c13, b13);
                    }
                }
                while (i12 < iArr2.length) {
                    int length4 = iArr.length - 1;
                    ed.a aVar4 = (ed.a) this.f17746a;
                    int i19 = iArr2[i12];
                    if (i19 != 0) {
                        int i20 = length4 - aVar4.f9348b[i19];
                        if (i20 >= 0) {
                            iArr[i20] = iArr[i20] ^ iArr6[i12];
                            i12++;
                        } else {
                            throw new ReedSolomonException("Bad error location");
                        }
                    } else {
                        aVar4.getClass();
                        throw new IllegalArgumentException();
                    }
                }
                return;
            }
            throw new ReedSolomonException("sigmaTilde(0) was zero");
        }
    }

    public final b e(String str, uc.a aVar) {
        if (aVar == uc.a.UPC_A) {
            return ((j) this.f17746a).e("0".concat(String.valueOf(str)), uc.a.EAN_13);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(aVar)));
    }

    public final m0 f(Class cls) {
        for (m0 m0Var : (List) this.f17746a) {
            if (m0Var.getClass() == cls) {
                return m0Var;
            }
        }
        return null;
    }

    public final int g() {
        return ((l9.a) this.f17746a).f12897a.length;
    }

    public final void onFailure(Exception exc) {
        long j10;
        if (exc instanceof FirebaseNetworkException) {
            a7.a aVar = h.f4112e;
            aVar.b("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            h hVar = (h) ((k) this.f17746a).f14860c;
            int i10 = (int) hVar.f4114b;
            if (i10 == 30 || i10 == 60 || i10 == 120 || i10 == 240 || i10 == 480) {
                long j11 = hVar.f4114b;
                j10 = j11 + j11;
            } else if (i10 != 960) {
                j10 = 30;
            } else {
                j10 = 960;
            }
            hVar.f4114b = j10;
            hVar.f4113a = (hVar.f4114b * 1000) + System.currentTimeMillis();
            aVar.b(n0.l.i("Scheduling refresh for ", hVar.f4113a), new Object[0]);
            hVar.f4115c.postDelayed(hVar.f4116d, hVar.f4114b * 1000);
        }
    }

    public /* synthetic */ d(ViewGroup viewGroup) {
        this.f17746a = viewGroup.getOverlay();
    }

    public /* synthetic */ d(ArrayList arrayList) {
        this.f17746a = new ArrayList(arrayList);
    }

    public d(int i10) {
        if (i10 != 3) {
            switch (i10) {
                case 10:
                    this.f17746a = new j();
                    return;
                case 11:
                    this.f17746a = new d((Object) ed.a.f9343l);
                    return;
                case 12:
                    this.f17746a = new ArrayList();
                    return;
                default:
                    this.f17746a = (o) y.k.a(o.class);
                    return;
            }
        } else {
            this.f17746a = new HashMap();
        }
    }

    public /* synthetic */ d() {
        this.f17746a = new AtomicInteger(0);
    }
}
