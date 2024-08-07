package b5;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: HardwareConfigState */
public final class q {

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f4048g;

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f4049h;

    /* renamed from: i  reason: collision with root package name */
    public static final File f4050i = new File("/proc/self/fd");

    /* renamed from: j  reason: collision with root package name */
    public static volatile q f4051j;

    /* renamed from: k  reason: collision with root package name */
    public static volatile int f4052k = -1;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4053a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4054b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4055c;

    /* renamed from: d  reason: collision with root package name */
    public int f4056d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4057e = true;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f4058f = new AtomicBoolean(false);

    static {
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        boolean z11 = true;
        if (i10 < 29) {
            z10 = true;
        } else {
            z10 = false;
        }
        f4048g = z10;
        if (i10 < 26) {
            z11 = false;
        }
        f4049h = z11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009e, code lost:
        if (r2 == false) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q() {
        /*
            r26 = this;
            r0 = r26
            r26.<init>()
            r1 = 1
            r0.f4057e = r1
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r3 = 0
            r2.<init>(r3)
            r0.f4058f = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r2 == r4) goto L_0x0017
            goto L_0x005b
        L_0x0017:
            java.lang.String r5 = "SC-04J"
            java.lang.String r6 = "SM-N935"
            java.lang.String r7 = "SM-J720"
            java.lang.String r8 = "SM-G570F"
            java.lang.String r9 = "SM-G570M"
            java.lang.String r10 = "SM-G960"
            java.lang.String r11 = "SM-G965"
            java.lang.String r12 = "SM-G935"
            java.lang.String r13 = "SM-G930"
            java.lang.String r14 = "SM-A520"
            java.lang.String r15 = "SM-A720F"
            java.lang.String r16 = "moto e5"
            java.lang.String r17 = "moto e5 play"
            java.lang.String r18 = "moto e5 plus"
            java.lang.String r19 = "moto e5 cruise"
            java.lang.String r20 = "moto g(6) forge"
            java.lang.String r21 = "moto g(6) play"
            java.lang.String[] r2 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x0045:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x005b
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = android.os.Build.MODEL
            boolean r4 = r5.startsWith(r4)
            if (r4 == 0) goto L_0x0045
            r2 = r1
            goto L_0x005c
        L_0x005b:
            r2 = r3
        L_0x005c:
            if (r2 != 0) goto L_0x00a1
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 27
            if (r2 == r4) goto L_0x0066
            r2 = r3
            goto L_0x009e
        L_0x0066:
            java.lang.String r5 = "LG-M250"
            java.lang.String r6 = "LG-M320"
            java.lang.String r7 = "LG-Q710AL"
            java.lang.String r8 = "LG-Q710PL"
            java.lang.String r9 = "LGM-K121K"
            java.lang.String r10 = "LGM-K121L"
            java.lang.String r11 = "LGM-K121S"
            java.lang.String r12 = "LGM-X320K"
            java.lang.String r13 = "LGM-X320L"
            java.lang.String r14 = "LGM-X320S"
            java.lang.String r15 = "LGM-X401L"
            java.lang.String r16 = "LGM-X401S"
            java.lang.String r17 = "LM-Q610.FG"
            java.lang.String r18 = "LM-Q610.FGN"
            java.lang.String r19 = "LM-Q617.FG"
            java.lang.String r20 = "LM-Q617.FGN"
            java.lang.String r21 = "LM-Q710.FG"
            java.lang.String r22 = "LM-Q710.FGN"
            java.lang.String r23 = "LM-X220PM"
            java.lang.String r24 = "LM-X220QMA"
            java.lang.String r25 = "LM-X410PM"
            java.lang.String[] r2 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25}
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.lang.String r4 = android.os.Build.MODEL
            boolean r2 = r2.contains(r4)
        L_0x009e:
            if (r2 != 0) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r1 = r3
        L_0x00a2:
            r0.f4053a = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x00b1
            r1 = 20000(0x4e20, float:2.8026E-41)
            r0.f4054b = r1
            r0.f4055c = r3
            goto L_0x00b9
        L_0x00b1:
            r1 = 700(0x2bc, float:9.81E-43)
            r0.f4054b = r1
            r1 = 128(0x80, float:1.794E-43)
            r0.f4055c = r1
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.q.<init>():void");
    }

    public final boolean a(int i10, int i11, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        int i12;
        boolean z14;
        if (!z10) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        } else if (!this.f4053a) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        } else if (!f4049h) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        } else {
            if (!f4048g || this.f4058f.get()) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (z12) {
                Log.isLoggable("HardwareConfig", 2);
                return false;
            } else if (z11) {
                Log.isLoggable("HardwareConfig", 2);
                return false;
            } else {
                int i13 = this.f4055c;
                if (i10 < i13) {
                    Log.isLoggable("HardwareConfig", 2);
                    return false;
                } else if (i11 < i13) {
                    Log.isLoggable("HardwareConfig", 2);
                    return false;
                } else {
                    synchronized (this) {
                        int i14 = this.f4056d + 1;
                        this.f4056d = i14;
                        if (i14 >= 50) {
                            this.f4056d = 0;
                            int length = f4050i.list().length;
                            if (f4052k != -1) {
                                i12 = f4052k;
                            } else {
                                i12 = this.f4054b;
                            }
                            if (((long) length) < ((long) i12)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            this.f4057e = z14;
                            if (!z14) {
                                Log.isLoggable("Downsampler", 5);
                            }
                        }
                        z13 = this.f4057e;
                    }
                    if (z13) {
                        return true;
                    }
                    Log.isLoggable("HardwareConfig", 2);
                    return false;
                }
            }
        }
    }

    @TargetApi(26)
    public final boolean b(int i10, int i11, BitmapFactory.Options options, boolean z10, boolean z11) {
        boolean a10 = a(i10, i11, z10, z11);
        if (a10) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return a10;
    }
}
