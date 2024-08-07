package androidx.emoji2.text;

import al.g0;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: EmojiCompat */
public final class d {

    /* renamed from: i  reason: collision with root package name */
    public static final Object f2379i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static volatile d f2380j;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantReadWriteLock f2381a;

    /* renamed from: b  reason: collision with root package name */
    public final v0.d f2382b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f2383c = 3;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f2384d;

    /* renamed from: e  reason: collision with root package name */
    public final a f2385e;

    /* renamed from: f  reason: collision with root package name */
    public final g f2386f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2387g;

    /* renamed from: h  reason: collision with root package name */
    public final b f2388h;

    /* compiled from: EmojiCompat */
    public static final class a extends b {

        /* renamed from: b  reason: collision with root package name */
        public volatile f f2389b;

        /* renamed from: c  reason: collision with root package name */
        public volatile h f2390c;

        public a(d dVar) {
            super(dVar);
        }
    }

    /* compiled from: EmojiCompat */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final d f2391a;

        public b(d dVar) {
            this.f2391a = dVar;
        }
    }

    /* compiled from: EmojiCompat */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final g f2392a;

        /* renamed from: b  reason: collision with root package name */
        public int f2393b = 0;

        /* renamed from: c  reason: collision with root package name */
        public b f2394c = new b();

        public c(g gVar) {
            this.f2392a = gVar;
        }
    }

    /* renamed from: androidx.emoji2.text.d$d  reason: collision with other inner class name */
    /* compiled from: EmojiCompat */
    public interface C0022d {
    }

    /* compiled from: EmojiCompat */
    public static abstract class e {
        public void a() {
        }

        public void b() {
        }
    }

    /* compiled from: EmojiCompat */
    public static class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f2395a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2396b;

        public f(List list, int i10, Throwable th2) {
            g0.D(list, "initCallbacks cannot be null");
            this.f2395a = new ArrayList(list);
            this.f2396b = i10;
        }

        public final void run() {
            int size = this.f2395a.size();
            int i10 = 0;
            if (this.f2396b != 1) {
                while (i10 < size) {
                    ((e) this.f2395a.get(i10)).a();
                    i10++;
                }
                return;
            }
            while (i10 < size) {
                ((e) this.f2395a.get(i10)).b();
                i10++;
            }
        }
    }

    /* compiled from: EmojiCompat */
    public interface g {
        void a(h hVar);
    }

    /* compiled from: EmojiCompat */
    public static abstract class h {
        public abstract void a(Throwable th2);

        public abstract void b(h hVar);
    }

    /* compiled from: EmojiCompat */
    public static class i {
    }

    public d(EmojiCompatInitializer.a aVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f2381a = reentrantReadWriteLock;
        g gVar = aVar.f2392a;
        this.f2386f = gVar;
        int i10 = aVar.f2393b;
        this.f2387g = i10;
        this.f2388h = aVar.f2394c;
        this.f2384d = new Handler(Looper.getMainLooper());
        this.f2382b = new v0.d();
        a aVar2 = new a(this);
        this.f2385e = aVar2;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.f2383c = 0;
            } catch (Throwable th2) {
                this.f2381a.writeLock().unlock();
                throw th2;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                gVar.a(new c(aVar2));
            } catch (Throwable th3) {
                aVar2.f2391a.d(th3);
            }
        }
    }

    public static d a() {
        d dVar;
        boolean z10;
        synchronized (f2379i) {
            dVar = f2380j;
            if (dVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            g0.E("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", z10);
        }
        return dVar;
    }

    public final int b() {
        this.f2381a.readLock().lock();
        try {
            return this.f2383c;
        } finally {
            this.f2381a.readLock().unlock();
        }
    }

    public final void c() {
        boolean z10;
        boolean z11 = true;
        if (this.f2387g == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0.E("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", z10);
        if (b() != 1) {
            z11 = false;
        }
        if (!z11) {
            this.f2381a.writeLock().lock();
            try {
                if (this.f2383c != 0) {
                    this.f2383c = 0;
                    this.f2381a.writeLock().unlock();
                    a aVar = this.f2385e;
                    aVar.getClass();
                    try {
                        aVar.f2391a.f2386f.a(new c(aVar));
                    } catch (Throwable th2) {
                        aVar.f2391a.d(th2);
                    }
                }
            } finally {
                this.f2381a.writeLock().unlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void d(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f2381a.writeLock().lock();
        try {
            this.f2383c = 2;
            arrayList.addAll(this.f2382b);
            this.f2382b.clear();
            this.f2381a.writeLock().unlock();
            this.f2384d.post(new f(arrayList, this.f2383c, th2));
        } catch (Throwable th3) {
            this.f2381a.writeLock().unlock();
            throw th3;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void e() {
        ArrayList arrayList = new ArrayList();
        this.f2381a.writeLock().lock();
        try {
            this.f2383c = 1;
            arrayList.addAll(this.f2382b);
            this.f2382b.clear();
            this.f2381a.writeLock().unlock();
            this.f2384d.post(new f(arrayList, this.f2383c, (Throwable) null));
        } catch (Throwable th2) {
            this.f2381a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x017c, code lost:
        ((l2.g) r2).b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00ed, code lost:
        if (r7.b(r2, r11, r0, r10.f2405d.f2422b) != false) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00ef, code lost:
        if (r3 != null) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f1, code lost:
        r3 = new l2.j((android.text.Spannable) new android.text.SpannableString(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00fb, code lost:
        r4 = r10.f2405d.f2422b;
        r7.f2399a.getClass();
        r3.setSpan(new l2.h(r4), r11, r0, 33);
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0177, code lost:
        if (r8 != false) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x017a, code lost:
        if (r8 == false) goto L_0x0182;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009b A[Catch:{ all -> 0x0184 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b7 A[Catch:{ all -> 0x0184 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence f(int r17, int r18, java.lang.CharSequence r19) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            int r3 = r16.b()
            r5 = 1
            if (r3 != r5) goto L_0x000f
            r3 = r5
            goto L_0x0010
        L_0x000f:
            r3 = 0
        L_0x0010:
            java.lang.String r6 = "Not initialized yet"
            al.g0.E(r6, r3)
            if (r0 < 0) goto L_0x019b
            if (r1 < 0) goto L_0x0191
            if (r0 > r1) goto L_0x001d
            r3 = r5
            goto L_0x001e
        L_0x001d:
            r3 = 0
        L_0x001e:
            java.lang.String r6 = "start should be <= than end"
            al.g0.y(r6, r3)
            r3 = 0
            if (r2 != 0) goto L_0x0027
            return r3
        L_0x0027:
            int r6 = r19.length()
            if (r0 > r6) goto L_0x002f
            r6 = r5
            goto L_0x0030
        L_0x002f:
            r6 = 0
        L_0x0030:
            java.lang.String r7 = "start should be < than charSequence length"
            al.g0.y(r7, r6)
            int r6 = r19.length()
            if (r1 > r6) goto L_0x003d
            r6 = r5
            goto L_0x003e
        L_0x003d:
            r6 = 0
        L_0x003e:
            java.lang.String r7 = "end should be < than charSequence length"
            al.g0.y(r7, r6)
            int r6 = r19.length()
            if (r6 == 0) goto L_0x018e
            if (r0 != r1) goto L_0x004d
            goto L_0x018e
        L_0x004d:
            r6 = r16
            androidx.emoji2.text.d$a r7 = r6.f2385e
            androidx.emoji2.text.f r7 = r7.f2389b
            r7.getClass()
            boolean r8 = r2 instanceof l2.g
            if (r8 == 0) goto L_0x0060
            r9 = r2
            l2.g r9 = (l2.g) r9
            r9.a()
        L_0x0060:
            if (r8 != 0) goto L_0x0080
            boolean r9 = r2 instanceof android.text.Spannable     // Catch:{ all -> 0x0184 }
            if (r9 == 0) goto L_0x0067
            goto L_0x0080
        L_0x0067:
            boolean r9 = r2 instanceof android.text.Spanned     // Catch:{ all -> 0x0184 }
            if (r9 == 0) goto L_0x0088
            r9 = r2
            android.text.Spanned r9 = (android.text.Spanned) r9     // Catch:{ all -> 0x0184 }
            int r10 = r0 + -1
            int r11 = r1 + 1
            java.lang.Class<l2.e> r12 = l2.e.class
            int r9 = r9.nextSpanTransition(r10, r11, r12)     // Catch:{ all -> 0x0184 }
            if (r9 > r1) goto L_0x0088
            l2.j r3 = new l2.j     // Catch:{ all -> 0x0184 }
            r3.<init>((java.lang.CharSequence) r2)     // Catch:{ all -> 0x0184 }
            goto L_0x0088
        L_0x0080:
            l2.j r3 = new l2.j     // Catch:{ all -> 0x0184 }
            r9 = r2
            android.text.Spannable r9 = (android.text.Spannable) r9     // Catch:{ all -> 0x0184 }
            r3.<init>((android.text.Spannable) r9)     // Catch:{ all -> 0x0184 }
        L_0x0088:
            if (r3 == 0) goto L_0x00b5
            java.lang.Class<l2.e> r9 = l2.e.class
            java.lang.Object[] r9 = r3.getSpans(r0, r1, r9)     // Catch:{ all -> 0x0184 }
            l2.e[] r9 = (l2.e[]) r9     // Catch:{ all -> 0x0184 }
            if (r9 == 0) goto L_0x00b5
            int r10 = r9.length     // Catch:{ all -> 0x0184 }
            if (r10 <= 0) goto L_0x00b5
            int r10 = r9.length     // Catch:{ all -> 0x0184 }
            r11 = 0
        L_0x0099:
            if (r11 >= r10) goto L_0x00b5
            r12 = r9[r11]     // Catch:{ all -> 0x0184 }
            int r13 = r3.getSpanStart(r12)     // Catch:{ all -> 0x0184 }
            int r14 = r3.getSpanEnd(r12)     // Catch:{ all -> 0x0184 }
            if (r13 == r1) goto L_0x00aa
            r3.removeSpan(r12)     // Catch:{ all -> 0x0184 }
        L_0x00aa:
            int r0 = java.lang.Math.min(r13, r0)     // Catch:{ all -> 0x0184 }
            int r1 = java.lang.Math.max(r14, r1)     // Catch:{ all -> 0x0184 }
            int r11 = r11 + 1
            goto L_0x0099
        L_0x00b5:
            if (r0 == r1) goto L_0x017a
            int r9 = r19.length()     // Catch:{ all -> 0x0184 }
            if (r0 < r9) goto L_0x00bf
            goto L_0x017a
        L_0x00bf:
            r9 = 2147483647(0x7fffffff, float:NaN)
            androidx.emoji2.text.f$a r10 = new androidx.emoji2.text.f$a     // Catch:{ all -> 0x0184 }
            androidx.emoji2.text.h r11 = r7.f2400b     // Catch:{ all -> 0x0184 }
            androidx.emoji2.text.h$a r11 = r11.f2419c     // Catch:{ all -> 0x0184 }
            r10.<init>(r11)     // Catch:{ all -> 0x0184 }
            int r11 = java.lang.Character.codePointAt(r2, r0)     // Catch:{ all -> 0x0184 }
            r12 = 0
        L_0x00d0:
            r13 = r11
        L_0x00d1:
            r11 = r0
        L_0x00d2:
            r14 = 2
            r15 = 33
            if (r0 >= r1) goto L_0x012c
            if (r12 >= r9) goto L_0x012c
            int r4 = r10.a(r13)     // Catch:{ all -> 0x0184 }
            if (r4 == r5) goto L_0x011c
            if (r4 == r14) goto L_0x0110
            r14 = 3
            if (r4 == r14) goto L_0x00e5
            goto L_0x00d2
        L_0x00e5:
            androidx.emoji2.text.h$a r4 = r10.f2405d     // Catch:{ all -> 0x0184 }
            l2.d r4 = r4.f2422b     // Catch:{ all -> 0x0184 }
            boolean r4 = r7.b(r2, r11, r0, r4)     // Catch:{ all -> 0x0184 }
            if (r4 != 0) goto L_0x010e
            if (r3 != 0) goto L_0x00fb
            l2.j r3 = new l2.j     // Catch:{ all -> 0x0184 }
            android.text.SpannableString r4 = new android.text.SpannableString     // Catch:{ all -> 0x0184 }
            r4.<init>(r2)     // Catch:{ all -> 0x0184 }
            r3.<init>((android.text.Spannable) r4)     // Catch:{ all -> 0x0184 }
        L_0x00fb:
            androidx.emoji2.text.h$a r4 = r10.f2405d     // Catch:{ all -> 0x0184 }
            l2.d r4 = r4.f2422b     // Catch:{ all -> 0x0184 }
            androidx.emoji2.text.d$i r14 = r7.f2399a     // Catch:{ all -> 0x0184 }
            r14.getClass()     // Catch:{ all -> 0x0184 }
            l2.h r14 = new l2.h     // Catch:{ all -> 0x0184 }
            r14.<init>(r4)     // Catch:{ all -> 0x0184 }
            r3.setSpan(r14, r11, r0, r15)     // Catch:{ all -> 0x0184 }
            int r12 = r12 + 1
        L_0x010e:
            r11 = r13
            goto L_0x00d0
        L_0x0110:
            int r4 = java.lang.Character.charCount(r13)     // Catch:{ all -> 0x0184 }
            int r0 = r0 + r4
            if (r0 >= r1) goto L_0x00d2
            int r13 = java.lang.Character.codePointAt(r2, r0)     // Catch:{ all -> 0x0184 }
            goto L_0x00d2
        L_0x011c:
            int r0 = java.lang.Character.codePointAt(r2, r11)     // Catch:{ all -> 0x0184 }
            int r0 = java.lang.Character.charCount(r0)     // Catch:{ all -> 0x0184 }
            int r0 = r0 + r11
            if (r0 >= r1) goto L_0x00d1
            int r13 = java.lang.Character.codePointAt(r2, r0)     // Catch:{ all -> 0x0184 }
            goto L_0x00d1
        L_0x012c:
            int r1 = r10.f2402a     // Catch:{ all -> 0x0184 }
            if (r1 != r14) goto L_0x0142
            androidx.emoji2.text.h$a r1 = r10.f2404c     // Catch:{ all -> 0x0184 }
            l2.d r1 = r1.f2422b     // Catch:{ all -> 0x0184 }
            if (r1 == 0) goto L_0x0142
            int r1 = r10.f2407f     // Catch:{ all -> 0x0184 }
            if (r1 > r5) goto L_0x0140
            boolean r1 = r10.c()     // Catch:{ all -> 0x0184 }
            if (r1 == 0) goto L_0x0142
        L_0x0140:
            r4 = r5
            goto L_0x0143
        L_0x0142:
            r4 = 0
        L_0x0143:
            if (r4 == 0) goto L_0x016a
            if (r12 >= r9) goto L_0x016a
            androidx.emoji2.text.h$a r1 = r10.f2404c     // Catch:{ all -> 0x0184 }
            l2.d r1 = r1.f2422b     // Catch:{ all -> 0x0184 }
            boolean r1 = r7.b(r2, r11, r0, r1)     // Catch:{ all -> 0x0184 }
            if (r1 != 0) goto L_0x016a
            if (r3 != 0) goto L_0x0159
            l2.j r1 = new l2.j     // Catch:{ all -> 0x0184 }
            r1.<init>((java.lang.CharSequence) r2)     // Catch:{ all -> 0x0184 }
            r3 = r1
        L_0x0159:
            androidx.emoji2.text.h$a r1 = r10.f2404c     // Catch:{ all -> 0x0184 }
            l2.d r1 = r1.f2422b     // Catch:{ all -> 0x0184 }
            androidx.emoji2.text.d$i r4 = r7.f2399a     // Catch:{ all -> 0x0184 }
            r4.getClass()     // Catch:{ all -> 0x0184 }
            l2.h r4 = new l2.h     // Catch:{ all -> 0x0184 }
            r4.<init>(r1)     // Catch:{ all -> 0x0184 }
            r3.setSpan(r4, r11, r0, r15)     // Catch:{ all -> 0x0184 }
        L_0x016a:
            if (r3 == 0) goto L_0x0177
            android.text.Spannable r0 = r3.f12647b     // Catch:{ all -> 0x0184 }
            if (r8 == 0) goto L_0x0183
            r1 = r2
            l2.g r1 = (l2.g) r1
            r1.b()
            goto L_0x0183
        L_0x0177:
            if (r8 == 0) goto L_0x0182
            goto L_0x017c
        L_0x017a:
            if (r8 == 0) goto L_0x0182
        L_0x017c:
            r0 = r2
            l2.g r0 = (l2.g) r0
            r0.b()
        L_0x0182:
            r0 = r2
        L_0x0183:
            return r0
        L_0x0184:
            r0 = move-exception
            if (r8 == 0) goto L_0x018d
            r1 = r2
            l2.g r1 = (l2.g) r1
            r1.b()
        L_0x018d:
            throw r0
        L_0x018e:
            r6 = r16
            return r2
        L_0x0191:
            r6 = r16
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "end cannot be negative"
            r0.<init>(r1)
            throw r0
        L_0x019b:
            r6 = r16
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "start cannot be negative"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.d.f(int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    public final void g(e eVar) {
        g0.D(eVar, "initCallback cannot be null");
        this.f2381a.writeLock().lock();
        try {
            if (this.f2383c != 1) {
                if (this.f2383c != 2) {
                    this.f2382b.add(eVar);
                }
            }
            this.f2384d.post(new f(Arrays.asList(new e[]{eVar}), this.f2383c, (Throwable) null));
        } finally {
            this.f2381a.writeLock().unlock();
        }
    }
}
