package b5;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import b5.k;
import com.bumptech.glide.load.ImageHeaderParser;
import f0.b0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import s4.g;
import s4.h;
import s4.i;
import v4.c;

/* compiled from: Downsampler */
public final class l {

    /* renamed from: f  reason: collision with root package name */
    public static final g<s4.b> f4032f = g.a(s4.b.PREFER_ARGB_8888, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: g  reason: collision with root package name */
    public static final g<i> f4033g = new g<>("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, g.f14626e);

    /* renamed from: h  reason: collision with root package name */
    public static final g<Boolean> f4034h;

    /* renamed from: i  reason: collision with root package name */
    public static final g<Boolean> f4035i;

    /* renamed from: j  reason: collision with root package name */
    public static final Set<String> f4036j = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));

    /* renamed from: k  reason: collision with root package name */
    public static final a f4037k = new a();

    /* renamed from: l  reason: collision with root package name */
    public static final ArrayDeque f4038l = new ArrayDeque(0);

    /* renamed from: a  reason: collision with root package name */
    public final c f4039a;

    /* renamed from: b  reason: collision with root package name */
    public final DisplayMetrics f4040b;

    /* renamed from: c  reason: collision with root package name */
    public final v4.b f4041c;

    /* renamed from: d  reason: collision with root package name */
    public final List<ImageHeaderParser> f4042d;

    /* renamed from: e  reason: collision with root package name */
    public final q f4043e;

    /* compiled from: Downsampler */
    public class a implements b {
        public final void a(Bitmap bitmap, c cVar) {
        }

        public final void b() {
        }
    }

    /* compiled from: Downsampler */
    public interface b {
        void a(Bitmap bitmap, c cVar);

        void b();
    }

    static {
        k.e eVar = k.f4025a;
        Boolean bool = Boolean.FALSE;
        f4034h = g.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f4035i = g.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = o5.l.f13754a;
    }

    public l(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, c cVar, v4.b bVar) {
        if (q.f4051j == null) {
            synchronized (q.class) {
                if (q.f4051j == null) {
                    q.f4051j = new q();
                }
            }
        }
        this.f4043e = q.f4051j;
        this.f4042d = list;
        j7.a.r(displayMetrics);
        this.f4040b = displayMetrics;
        j7.a.r(cVar);
        this.f4039a = cVar;
        j7.a.r(bVar);
        this.f4041c = bVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap c(b5.r r4, android.graphics.BitmapFactory.Options r5, b5.l.b r6, v4.c r7) {
        /*
            boolean r0 = r5.inJustDecodeBounds
            if (r0 != 0) goto L_0x000a
            r6.b()
            r4.c()
        L_0x000a:
            int r0 = r5.outWidth
            int r1 = r5.outHeight
            java.lang.String r2 = r5.outMimeType
            java.util.concurrent.locks.Lock r3 = b5.y.f4088d
            r3.lock()
            android.graphics.Bitmap r4 = r4.b(r5)     // Catch:{ IllegalArgumentException -> 0x001f }
            r3.unlock()
            return r4
        L_0x001d:
            r4 = move-exception
            goto L_0x0040
        L_0x001f:
            r3 = move-exception
            java.io.IOException r0 = e(r3, r0, r1, r2, r5)     // Catch:{ all -> 0x001d }
            java.lang.String r1 = "Downsampler"
            r2 = 3
            android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x001d }
            android.graphics.Bitmap r1 = r5.inBitmap     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x003f
            r7.d(r1)     // Catch:{ IOException -> 0x003e }
            r1 = 0
            r5.inBitmap = r1     // Catch:{ IOException -> 0x003e }
            android.graphics.Bitmap r4 = c(r4, r5, r6, r7)     // Catch:{ IOException -> 0x003e }
            java.util.concurrent.locks.Lock r5 = b5.y.f4088d
            r5.unlock()
            return r4
        L_0x003e:
            throw r0     // Catch:{ all -> 0x001d }
        L_0x003f:
            throw r0     // Catch:{ all -> 0x001d }
        L_0x0040:
            java.util.concurrent.locks.Lock r5 = b5.y.f4088d
            r5.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.l.c(b5.r, android.graphics.BitmapFactory$Options, b5.l$b, v4.c):android.graphics.Bitmap");
    }

    @TargetApi(19)
    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        StringBuilder q10 = android.support.v4.media.a.q(" (");
        q10.append(bitmap.getAllocationByteCount());
        q10.append(")");
        String sb2 = q10.toString();
        StringBuilder q11 = android.support.v4.media.a.q("[");
        q11.append(bitmap.getWidth());
        q11.append("x");
        q11.append(bitmap.getHeight());
        q11.append("] ");
        q11.append(bitmap.getConfig());
        q11.append(sb2);
        return q11.toString();
    }

    public static IOException e(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        StringBuilder u10 = b0.u("Exception decoding bitmap, outWidth: ", i10, ", outHeight: ", i11, ", outMimeType: ");
        u10.append(str);
        u10.append(", inBitmap: ");
        u10.append(d(options.inBitmap));
        return new IOException(u10.toString(), illegalArgumentException);
    }

    public static void f(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final d a(r rVar, int i10, int i11, h hVar, b bVar) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        boolean z10;
        h hVar2 = hVar;
        byte[] bArr = (byte[]) this.f4041c.c(65536, byte[].class);
        synchronized (l.class) {
            arrayDeque = f4038l;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                f(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        s4.b bVar2 = (s4.b) hVar2.c(f4032f);
        i iVar = (i) hVar2.c(f4033g);
        k kVar = (k) hVar2.c(k.f4030f);
        boolean booleanValue = ((Boolean) hVar2.c(f4034h)).booleanValue();
        g gVar = f4035i;
        if (hVar2.c(gVar) == null || !((Boolean) hVar2.c(gVar)).booleanValue()) {
            z10 = false;
        } else {
            z10 = true;
        }
        try {
            d d10 = d.d(b(rVar, options2, kVar, bVar2, iVar, z10, i10, i11, booleanValue, bVar), this.f4039a);
            f(options2);
            synchronized (arrayDeque) {
                arrayDeque.offer(options2);
            }
            this.f4041c.put(bArr);
            return d10;
        } catch (Throwable th2) {
            f(options2);
            ArrayDeque arrayDeque2 = f4038l;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options2);
                this.f4041c.put(bArr);
                throw th2;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0298 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap b(b5.r r27, android.graphics.BitmapFactory.Options r28, b5.k r29, s4.b r30, s4.i r31, boolean r32, int r33, int r34, boolean r35, b5.l.b r36) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r8 = r28
            r2 = r29
            r9 = r31
            r10 = r36
            int r3 = o5.h.f13744a
            android.os.SystemClock.elapsedRealtimeNanos()
            v4.c r3 = r0.f4039a
            r11 = 1
            r8.inJustDecodeBounds = r11
            c(r1, r8, r10, r3)
            r12 = 0
            r8.inJustDecodeBounds = r12
            int r13 = r8.outWidth
            int r14 = r8.outHeight
            r3 = -1
            if (r13 == r3) goto L_0x0029
            if (r14 != r3) goto L_0x0026
            goto L_0x0029
        L_0x0026:
            r6 = r32
            goto L_0x002a
        L_0x0029:
            r6 = r12
        L_0x002a:
            int r15 = r27.a()
            r3 = 270(0x10e, float:3.78E-43)
            r4 = 90
            switch(r15) {
                case 3: goto L_0x003b;
                case 4: goto L_0x003b;
                case 5: goto L_0x0039;
                case 6: goto L_0x0039;
                case 7: goto L_0x0037;
                case 8: goto L_0x0037;
                default: goto L_0x0035;
            }
        L_0x0035:
            r5 = r12
            goto L_0x003d
        L_0x0037:
            r5 = r3
            goto L_0x003d
        L_0x0039:
            r5 = r4
            goto L_0x003d
        L_0x003b:
            r5 = 180(0xb4, float:2.52E-43)
        L_0x003d:
            switch(r15) {
                case 2: goto L_0x0042;
                case 3: goto L_0x0042;
                case 4: goto L_0x0042;
                case 5: goto L_0x0042;
                case 6: goto L_0x0042;
                case 7: goto L_0x0042;
                case 8: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            r7 = r12
            goto L_0x0043
        L_0x0042:
            r7 = r11
        L_0x0043:
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = r33
            if (r11 != r12) goto L_0x0059
            if (r5 == r4) goto L_0x0050
            if (r5 != r3) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r11 = 0
            goto L_0x0051
        L_0x0050:
            r11 = 1
        L_0x0051:
            r3 = r34
            if (r11 == 0) goto L_0x0057
            r11 = r14
            goto L_0x005b
        L_0x0057:
            r11 = r13
            goto L_0x005b
        L_0x0059:
            r3 = r34
        L_0x005b:
            if (r3 != r12) goto L_0x006d
            if (r5 == r4) goto L_0x0066
            r3 = 270(0x10e, float:3.78E-43)
            if (r5 != r3) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r3 = 0
            goto L_0x0067
        L_0x0066:
            r3 = 1
        L_0x0067:
            if (r3 == 0) goto L_0x006b
            r12 = r13
            goto L_0x006e
        L_0x006b:
            r12 = r14
            goto L_0x006e
        L_0x006d:
            r12 = r3
        L_0x006e:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r3 = r27.d()
            v4.c r4 = r0.f4039a
            r17 = r15
            java.lang.String r15 = "Downsampler"
            if (r13 <= 0) goto L_0x0239
            if (r14 > 0) goto L_0x008a
            r16 = r6
            r32 = r7
            r9 = r15
            r0 = 0
            r2 = 3
            r25 = r13
            r13 = r12
            r12 = r25
            goto L_0x0245
        L_0x008a:
            r9 = 90
            if (r5 == r9) goto L_0x0095
            r9 = 270(0x10e, float:3.78E-43)
            if (r5 != r9) goto L_0x0093
            goto L_0x0095
        L_0x0093:
            r5 = 0
            goto L_0x0096
        L_0x0095:
            r5 = 1
        L_0x0096:
            r32 = r7
            if (r5 == 0) goto L_0x009d
            r9 = r13
            r5 = r14
            goto L_0x009f
        L_0x009d:
            r5 = r13
            r9 = r14
        L_0x009f:
            float r7 = r2.b(r5, r9, r11, r12)
            r16 = 0
            int r18 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x01f0
            r16 = r6
            int r6 = r2.a(r5, r9, r11, r12)
            if (r6 == 0) goto L_0x01e8
            float r0 = (float) r5
            r18 = r14
            float r14 = r7 * r0
            r19 = r13
            double r13 = (double) r14
            r20 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r13 = r13 + r20
            int r13 = (int) r13
            float r14 = (float) r9
            r22 = r15
            float r15 = r7 * r14
            r23 = r11
            r24 = r12
            double r11 = (double) r15
            double r11 = r11 + r20
            int r11 = (int) r11
            int r12 = r5 / r13
            int r11 = r9 / r11
            r13 = 1
            if (r6 != r13) goto L_0x00d7
            int r11 = java.lang.Math.max(r12, r11)
            goto L_0x00db
        L_0x00d7:
            int r11 = java.lang.Math.min(r12, r11)
        L_0x00db:
            int r12 = android.os.Build.VERSION.SDK_INT
            r13 = 23
            if (r12 > r13) goto L_0x00ed
            java.util.Set<java.lang.String> r13 = f4036j
            java.lang.String r15 = r8.outMimeType
            boolean r13 = r13.contains(r15)
            if (r13 == 0) goto L_0x00ed
            r6 = 1
            goto L_0x0105
        L_0x00ed:
            int r11 = java.lang.Integer.highestOneBit(r11)
            r13 = 1
            int r11 = java.lang.Math.max(r13, r11)
            if (r6 != r13) goto L_0x0104
            float r6 = (float) r11
            r13 = 1065353216(0x3f800000, float:1.0)
            float r7 = r13 / r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x0104
            int r6 = r11 << 1
            goto L_0x0105
        L_0x0104:
            r6 = r11
        L_0x0105:
            r8.inSampleSize = r6
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG
            if (r3 != r7) goto L_0x0126
            r3 = 8
            int r4 = java.lang.Math.min(r6, r3)
            float r4 = (float) r4
            float r0 = r0 / r4
            double r11 = (double) r0
            double r11 = java.lang.Math.ceil(r11)
            int r0 = (int) r11
            float r14 = r14 / r4
            double r4 = (double) r14
            double r4 = java.lang.Math.ceil(r4)
            int r4 = (int) r4
            int r6 = r6 / r3
            if (r6 <= 0) goto L_0x017f
            int r0 = r0 / r6
            int r4 = r4 / r6
            goto L_0x017f
        L_0x0126:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG
            if (r3 == r7) goto L_0x0170
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A
            if (r3 != r7) goto L_0x012f
            goto L_0x0170
        L_0x012f:
            boolean r3 = r3.isWebp()
            if (r3 == 0) goto L_0x0154
            r3 = 24
            if (r12 < r3) goto L_0x0145
            float r3 = (float) r6
            float r0 = r0 / r3
            int r0 = java.lang.Math.round(r0)
            float r14 = r14 / r3
            int r4 = java.lang.Math.round(r14)
            goto L_0x017f
        L_0x0145:
            float r3 = (float) r6
            float r0 = r0 / r3
            double r4 = (double) r0
            double r4 = java.lang.Math.floor(r4)
            int r0 = (int) r4
            float r14 = r14 / r3
            double r3 = (double) r14
            double r3 = java.lang.Math.floor(r3)
            goto L_0x017e
        L_0x0154:
            int r0 = r5 % r6
            if (r0 != 0) goto L_0x0162
            int r0 = r9 % r6
            if (r0 == 0) goto L_0x015d
            goto L_0x0162
        L_0x015d:
            int r0 = r5 / r6
            int r4 = r9 / r6
            goto L_0x017f
        L_0x0162:
            r0 = 1
            r8.inJustDecodeBounds = r0
            c(r1, r8, r10, r4)
            r0 = 0
            r8.inJustDecodeBounds = r0
            int r0 = r8.outWidth
            int r3 = r8.outHeight
            goto L_0x0180
        L_0x0170:
            float r3 = (float) r6
            float r0 = r0 / r3
            double r4 = (double) r0
            double r4 = java.lang.Math.floor(r4)
            int r0 = (int) r4
            float r14 = r14 / r3
            double r3 = (double) r14
            double r3 = java.lang.Math.floor(r3)
        L_0x017e:
            int r4 = (int) r3
        L_0x017f:
            r3 = r4
        L_0x0180:
            r11 = r23
            r13 = r24
            float r0 = r2.b(r0, r3, r11, r13)
            double r2 = (double) r0
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0191
            r6 = r2
            goto L_0x0193
        L_0x0191:
            double r6 = r4 / r2
        L_0x0193:
            r14 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            double r6 = r6 * r14
            long r6 = java.lang.Math.round(r6)
            int r6 = (int) r6
            double r14 = (double) r6
            double r14 = r14 * r2
            double r14 = r14 + r20
            int r7 = (int) r14
            float r9 = (float) r7
            float r6 = (float) r6
            float r9 = r9 / r6
            double r14 = (double) r9
            double r14 = r2 / r14
            double r6 = (double) r7
            double r14 = r14 * r6
            double r14 = r14 + r20
            int r6 = (int) r14
            r8.inTargetDensity = r6
            if (r0 > 0) goto L_0x01b3
            goto L_0x01b5
        L_0x01b3:
            double r2 = r4 / r2
        L_0x01b5:
            r4 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            double r2 = r2 * r4
            long r2 = java.lang.Math.round(r2)
            int r0 = (int) r2
            r8.inDensity = r0
            int r2 = r8.inTargetDensity
            if (r2 <= 0) goto L_0x01cc
            if (r0 <= 0) goto L_0x01cc
            if (r2 == r0) goto L_0x01cc
            r0 = 1
            goto L_0x01cd
        L_0x01cc:
            r0 = 0
        L_0x01cd:
            if (r0 == 0) goto L_0x01d6
            r0 = 1
            r8.inScaled = r0
            r9 = r22
            r0 = 0
            goto L_0x01dd
        L_0x01d6:
            r0 = 0
            r8.inTargetDensity = r0
            r8.inDensity = r0
            r9 = r22
        L_0x01dd:
            r2 = 2
            android.util.Log.isLoggable(r9, r2)
            r15 = r26
            r14 = r18
            r12 = r19
            goto L_0x0250
        L_0x01e8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot round with null rounding"
            r0.<init>(r1)
            throw r0
        L_0x01f0:
            r19 = r13
            r18 = r14
            r13 = r12
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Cannot scale with factor: "
            r1.append(r3)
            r1.append(r7)
            java.lang.String r3 = " from: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = ", source: ["
            r1.append(r2)
            r12 = r19
            r1.append(r12)
            java.lang.String r2 = "x"
            r1.append(r2)
            r1.append(r14)
            java.lang.String r3 = "], target: ["
            r1.append(r3)
            r1.append(r11)
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0239:
            r16 = r6
            r32 = r7
            r9 = r15
            r0 = 0
            r25 = r13
            r13 = r12
            r12 = r25
            r2 = 3
        L_0x0245:
            boolean r4 = android.util.Log.isLoggable(r9, r2)
            if (r4 == 0) goto L_0x024e
            java.util.Objects.toString(r3)
        L_0x024e:
            r15 = r26
        L_0x0250:
            b5.q r2 = r15.f4043e
            r3 = r11
            r4 = r13
            r5 = r28
            r6 = r16
            r7 = r32
            boolean r2 = r2.b(r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x0262
        L_0x0260:
            r2 = 1
            goto L_0x0292
        L_0x0262:
            s4.b r2 = s4.b.PREFER_ARGB_8888
            r3 = r30
            if (r3 == r2) goto L_0x028d
            com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = r27.d()     // Catch:{ IOException -> 0x0271 }
            boolean r2 = r2.hasAlpha()     // Catch:{ IOException -> 0x0271 }
            goto L_0x027c
        L_0x0271:
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r9, r2)
            if (r2 == 0) goto L_0x027b
            java.util.Objects.toString(r30)
        L_0x027b:
            r2 = r0
        L_0x027c:
            if (r2 == 0) goto L_0x0281
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            goto L_0x0283
        L_0x0281:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGB_565
        L_0x0283:
            r8.inPreferredConfig = r2
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.RGB_565
            if (r2 != r3) goto L_0x0260
            r2 = 1
            r8.inDither = r2
            goto L_0x0292
        L_0x028d:
            r2 = 1
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            r8.inPreferredConfig = r3
        L_0x0292:
            int r3 = android.os.Build.VERSION.SDK_INT
            int r4 = r8.inSampleSize
            if (r12 < 0) goto L_0x029e
            if (r14 < 0) goto L_0x029e
            if (r35 == 0) goto L_0x029e
            r12 = r13
            goto L_0x02d7
        L_0x029e:
            int r5 = r8.inTargetDensity
            if (r5 <= 0) goto L_0x02aa
            int r6 = r8.inDensity
            if (r6 <= 0) goto L_0x02aa
            if (r5 == r6) goto L_0x02aa
            r13 = r2
            goto L_0x02ab
        L_0x02aa:
            r13 = r0
        L_0x02ab:
            if (r13 == 0) goto L_0x02b4
            float r5 = (float) r5
            int r6 = r8.inDensity
            float r6 = (float) r6
            float r13 = r5 / r6
            goto L_0x02b6
        L_0x02b4:
            r13 = 1065353216(0x3f800000, float:1.0)
        L_0x02b6:
            float r5 = (float) r12
            float r4 = (float) r4
            float r5 = r5 / r4
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            float r6 = (float) r14
            float r6 = r6 / r4
            double r6 = (double) r6
            double r6 = java.lang.Math.ceil(r6)
            int r4 = (int) r6
            float r5 = (float) r5
            float r5 = r5 * r13
            int r11 = java.lang.Math.round(r5)
            float r4 = (float) r4
            float r4 = r4 * r13
            int r12 = java.lang.Math.round(r4)
            r4 = 2
            android.util.Log.isLoggable(r9, r4)
        L_0x02d7:
            r4 = 26
            r5 = 0
            if (r11 <= 0) goto L_0x02f7
            if (r12 <= 0) goto L_0x02f7
            v4.c r6 = r15.f4039a
            if (r3 < r4) goto L_0x02ec
            android.graphics.Bitmap$Config r7 = r8.inPreferredConfig
            android.graphics.Bitmap$Config r13 = android.graphics.Bitmap.Config.HARDWARE
            if (r7 != r13) goto L_0x02e9
            goto L_0x02f7
        L_0x02e9:
            android.graphics.Bitmap$Config r7 = r8.outConfig
            goto L_0x02ed
        L_0x02ec:
            r7 = r5
        L_0x02ed:
            if (r7 != 0) goto L_0x02f1
            android.graphics.Bitmap$Config r7 = r8.inPreferredConfig
        L_0x02f1:
            android.graphics.Bitmap r6 = r6.c(r11, r12, r7)
            r8.inBitmap = r6
        L_0x02f7:
            r6 = r31
            if (r6 == 0) goto L_0x0328
            r7 = 28
            if (r3 < r7) goto L_0x031e
            s4.i r3 = s4.i.DISPLAY_P3
            if (r6 != r3) goto L_0x030f
            android.graphics.ColorSpace r3 = r8.outColorSpace
            if (r3 == 0) goto L_0x030f
            boolean r3 = r3.isWideGamut()
            if (r3 == 0) goto L_0x030f
            r13 = r2
            goto L_0x0310
        L_0x030f:
            r13 = r0
        L_0x0310:
            if (r13 == 0) goto L_0x0315
            android.graphics.ColorSpace$Named r3 = android.graphics.ColorSpace.Named.DISPLAY_P3
            goto L_0x0317
        L_0x0315:
            android.graphics.ColorSpace$Named r3 = android.graphics.ColorSpace.Named.SRGB
        L_0x0317:
            android.graphics.ColorSpace r3 = android.graphics.ColorSpace.get(r3)
            r8.inPreferredColorSpace = r3
            goto L_0x0328
        L_0x031e:
            if (r3 < r4) goto L_0x0328
            android.graphics.ColorSpace$Named r3 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r3 = android.graphics.ColorSpace.get(r3)
            r8.inPreferredColorSpace = r3
        L_0x0328:
            v4.c r3 = r15.f4039a
            android.graphics.Bitmap r1 = c(r1, r8, r10, r3)
            v4.c r3 = r15.f4039a
            r10.a(r1, r3)
            r3 = 2
            boolean r3 = android.util.Log.isLoggable(r9, r3)
            if (r3 == 0) goto L_0x034c
            d(r1)
            android.graphics.Bitmap r3 = r8.inBitmap
            d(r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.getName()
            android.os.SystemClock.elapsedRealtimeNanos()
        L_0x034c:
            if (r1 == 0) goto L_0x03f2
            android.util.DisplayMetrics r3 = r15.f4040b
            int r3 = r3.densityDpi
            r1.setDensity(r3)
            v4.c r3 = r15.f4039a
            switch(r17) {
                case 2: goto L_0x035c;
                case 3: goto L_0x035c;
                case 4: goto L_0x035c;
                case 5: goto L_0x035c;
                case 6: goto L_0x035c;
                case 7: goto L_0x035c;
                case 8: goto L_0x035c;
                default: goto L_0x035a;
            }
        L_0x035a:
            r11 = r0
            goto L_0x035d
        L_0x035c:
            r11 = r2
        L_0x035d:
            if (r11 != 0) goto L_0x0362
            r5 = r1
            goto L_0x03e7
        L_0x0362:
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r4 = 1119092736(0x42b40000, float:90.0)
            r5 = 1127481344(0x43340000, float:180.0)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            switch(r17) {
                case 2: goto L_0x039a;
                case 3: goto L_0x0396;
                case 4: goto L_0x038d;
                case 5: goto L_0x0384;
                case 6: goto L_0x0380;
                case 7: goto L_0x0377;
                case 8: goto L_0x0373;
                default: goto L_0x0372;
            }
        L_0x0372:
            goto L_0x039f
        L_0x0373:
            r0.setRotate(r2)
            goto L_0x039f
        L_0x0377:
            r0.setRotate(r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.postScale(r6, r2)
            goto L_0x039f
        L_0x0380:
            r0.setRotate(r4)
            goto L_0x039f
        L_0x0384:
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.setRotate(r4)
            r0.postScale(r6, r2)
            goto L_0x039f
        L_0x038d:
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.setRotate(r5)
            r0.postScale(r6, r2)
            goto L_0x039f
        L_0x0396:
            r0.setRotate(r5)
            goto L_0x039f
        L_0x039a:
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.setScale(r6, r2)
        L_0x039f:
            android.graphics.RectF r2 = new android.graphics.RectF
            int r4 = r1.getWidth()
            float r4 = (float) r4
            int r5 = r1.getHeight()
            float r5 = (float) r5
            r6 = 0
            r2.<init>(r6, r6, r4, r5)
            r0.mapRect(r2)
            float r4 = r2.width()
            int r4 = java.lang.Math.round(r4)
            float r5 = r2.height()
            int r5 = java.lang.Math.round(r5)
            android.graphics.Bitmap$Config r6 = r1.getConfig()
            if (r6 == 0) goto L_0x03cd
            android.graphics.Bitmap$Config r6 = r1.getConfig()
            goto L_0x03cf
        L_0x03cd:
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x03cf:
            android.graphics.Bitmap r3 = r3.e(r4, r5, r6)
            float r4 = r2.left
            float r4 = -r4
            float r2 = r2.top
            float r2 = -r2
            r0.postTranslate(r4, r2)
            boolean r2 = r1.hasAlpha()
            r3.setHasAlpha(r2)
            b5.y.a(r1, r3, r0)
            r5 = r3
        L_0x03e7:
            boolean r0 = r1.equals(r5)
            if (r0 != 0) goto L_0x03f2
            v4.c r0 = r15.f4039a
            r0.d(r1)
        L_0x03f2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.l.b(b5.r, android.graphics.BitmapFactory$Options, b5.k, s4.b, s4.i, boolean, int, int, boolean, b5.l$b):android.graphics.Bitmap");
    }
}
