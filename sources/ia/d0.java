package ia;

import a1.c;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import ka.b0;
import ka.c0;
import ka.o;
import ka.p;
import ka.r;
import ka.s;
import pa.e;
import pa.g;
import qa.a;
import qa.b;

/* compiled from: CrashlyticsReportDataCapture */
public final class d0 {

    /* renamed from: f  reason: collision with root package name */
    public static final HashMap f11280f;

    /* renamed from: g  reason: collision with root package name */
    public static final String f11281g = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{"18.4.3"});

    /* renamed from: a  reason: collision with root package name */
    public final Context f11282a;

    /* renamed from: b  reason: collision with root package name */
    public final k0 f11283b;

    /* renamed from: c  reason: collision with root package name */
    public final a f11284c;

    /* renamed from: d  reason: collision with root package name */
    public final b f11285d;

    /* renamed from: e  reason: collision with root package name */
    public final g f11286e;

    static {
        HashMap hashMap = new HashMap();
        f11280f = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
    }

    public d0(Context context, k0 k0Var, a aVar, a aVar2, e eVar) {
        this.f11282a = context;
        this.f11283b = k0Var;
        this.f11284c = aVar;
        this.f11285d = aVar2;
        this.f11286e = eVar;
    }

    public static p c(c cVar, int i10) {
        String str = (String) cVar.f25b;
        String str2 = (String) cVar.f24a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) cVar.f26c;
        int i11 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        c cVar2 = (c) cVar.f27d;
        if (i10 >= 8) {
            c cVar3 = cVar2;
            while (cVar3 != null) {
                cVar3 = (c) cVar3.f27d;
                i11++;
            }
        }
        p.a aVar = new p.a();
        if (str != null) {
            aVar.f12382a = str;
            aVar.f12383b = str2;
            aVar.f12384c = new c0<>(d(stackTraceElementArr, 4));
            aVar.f12386e = Integer.valueOf(i11);
            if (cVar2 != null && i11 == 0) {
                aVar.f12385d = c(cVar2, i10 + 1);
            }
            return aVar.a();
        }
        throw new NullPointerException("Null type");
    }

    public static c0 d(StackTraceElement[] stackTraceElementArr, int i10) {
        long j10;
        ArrayList arrayList = new ArrayList();
        int length = stackTraceElementArr.length;
        int i11 = 0;
        while (i11 < length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i11];
            s.a aVar = new s.a();
            aVar.f12408e = Integer.valueOf(i10);
            long j11 = 0;
            if (stackTraceElement.isNativeMethod()) {
                j10 = Math.max((long) stackTraceElement.getLineNumber(), 0);
            } else {
                j10 = 0;
            }
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j11 = (long) stackTraceElement.getLineNumber();
            }
            aVar.f12404a = Long.valueOf(j10);
            if (str != null) {
                aVar.f12405b = str;
                aVar.f12406c = fileName;
                aVar.f12407d = Long.valueOf(j11);
                arrayList.add(aVar.a());
                i11++;
            } else {
                throw new NullPointerException("Null symbol");
            }
        }
        return new c0(arrayList);
    }

    public static r e(Thread thread, StackTraceElement[] stackTraceElementArr, int i10) {
        r.a aVar = new r.a();
        String name = thread.getName();
        if (name != null) {
            aVar.f12396a = name;
            aVar.f12397b = Integer.valueOf(i10);
            aVar.f12398c = new c0<>(d(stackTraceElementArr, i10));
            return aVar.a();
        }
        throw new NullPointerException("Null name");
    }

    public final c0<b0.e.d.a.b.C0143a> a() {
        b0.e.d.a.b.C0143a[] aVarArr = new b0.e.d.a.b.C0143a[1];
        o.a aVar = new o.a();
        aVar.f12373a = 0L;
        aVar.f12374b = 0L;
        a aVar2 = this.f11284c;
        String str = aVar2.f11252e;
        if (str != null) {
            aVar.f12375c = str;
            aVar.f12376d = aVar2.f11249b;
            aVarArr[0] = aVar.a();
            return new c0<>(Arrays.asList(aVarArr));
        }
        throw new NullPointerException("Null name");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ka.t b(int r14) {
        /*
            r13 = this;
            android.content.Context r0 = r13.f11282a
            r1 = 2
            r2 = 0
            r3 = 0
            r4 = 1
            android.content.IntentFilter r5 = new android.content.IntentFilter     // Catch:{ IllegalStateException -> 0x0041 }
            java.lang.String r6 = "android.intent.action.BATTERY_CHANGED"
            r5.<init>(r6)     // Catch:{ IllegalStateException -> 0x0041 }
            android.content.Intent r0 = r0.registerReceiver(r2, r5)     // Catch:{ IllegalStateException -> 0x0041 }
            if (r0 == 0) goto L_0x0041
            java.lang.String r5 = "status"
            r6 = -1
            int r5 = r0.getIntExtra(r5, r6)     // Catch:{ IllegalStateException -> 0x0041 }
            if (r5 != r6) goto L_0x001d
            goto L_0x0023
        L_0x001d:
            if (r5 == r1) goto L_0x0025
            r7 = 5
            if (r5 != r7) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r5 = r3
            goto L_0x0026
        L_0x0025:
            r5 = r4
        L_0x0026:
            java.lang.String r7 = "level"
            int r7 = r0.getIntExtra(r7, r6)     // Catch:{ IllegalStateException -> 0x003f }
            java.lang.String r8 = "scale"
            int r0 = r0.getIntExtra(r8, r6)     // Catch:{ IllegalStateException -> 0x003f }
            if (r7 == r6) goto L_0x003f
            if (r0 != r6) goto L_0x0037
            goto L_0x003f
        L_0x0037:
            float r6 = (float) r7     // Catch:{ IllegalStateException -> 0x003f }
            float r0 = (float) r0     // Catch:{ IllegalStateException -> 0x003f }
            float r6 = r6 / r0
            java.lang.Float r0 = java.lang.Float.valueOf(r6)     // Catch:{ IllegalStateException -> 0x003f }
            goto L_0x0043
        L_0x003f:
            r0 = r2
            goto L_0x0043
        L_0x0041:
            r0 = r2
            r5 = r3
        L_0x0043:
            if (r0 == 0) goto L_0x004d
            double r6 = r0.doubleValue()
            java.lang.Double r2 = java.lang.Double.valueOf(r6)
        L_0x004d:
            if (r5 == 0) goto L_0x0063
            if (r0 != 0) goto L_0x0052
            goto L_0x0063
        L_0x0052:
            float r0 = r0.floatValue()
            double r5 = (double) r0
            r7 = 4607092346807469998(0x3fefae147ae147ae, double:0.99)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0061
            goto L_0x0064
        L_0x0061:
            r1 = 3
            goto L_0x0064
        L_0x0063:
            r1 = r4
        L_0x0064:
            android.content.Context r0 = r13.f11282a
            boolean r5 = ia.h.g()
            if (r5 == 0) goto L_0x006d
            goto L_0x007e
        L_0x006d:
            java.lang.String r5 = "sensor"
            java.lang.Object r0 = r0.getSystemService(r5)
            android.hardware.SensorManager r0 = (android.hardware.SensorManager) r0
            r5 = 8
            android.hardware.Sensor r0 = r0.getDefaultSensor(r5)
            if (r0 == 0) goto L_0x007e
            r3 = r4
        L_0x007e:
            android.content.Context r0 = r13.f11282a
            long r4 = ia.h.a(r0)
            android.content.Context r0 = r13.f11282a
            android.app.ActivityManager$MemoryInfo r6 = new android.app.ActivityManager$MemoryInfo
            r6.<init>()
            java.lang.String r7 = "activity"
            java.lang.Object r0 = r0.getSystemService(r7)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            r0.getMemoryInfo(r6)
            long r6 = r6.availMem
            long r4 = r4 - r6
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a0
            goto L_0x00a1
        L_0x00a0:
            r4 = r6
        L_0x00a1:
            java.io.File r0 = android.os.Environment.getDataDirectory()
            java.lang.String r0 = r0.getPath()
            android.os.StatFs r6 = new android.os.StatFs
            r6.<init>(r0)
            int r0 = r6.getBlockSize()
            long r7 = (long) r0
            int r0 = r6.getBlockCount()
            long r9 = (long) r0
            long r9 = r9 * r7
            int r0 = r6.getAvailableBlocks()
            long r11 = (long) r0
            long r7 = r7 * r11
            long r9 = r9 - r7
            ka.t$a r0 = new ka.t$a
            r0.<init>()
            r0.f12415a = r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f12416b = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r0.f12417c = r1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r0.f12418d = r14
            java.lang.Long r14 = java.lang.Long.valueOf(r4)
            r0.f12419e = r14
            java.lang.Long r14 = java.lang.Long.valueOf(r9)
            r0.f12420f = r14
            ka.t r14 = r0.a()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.d0.b(int):ka.t");
    }
}
