package p4;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import f0.b0;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: DiskLruCache */
public final class a implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final File f14040a;

    /* renamed from: b  reason: collision with root package name */
    public final File f14041b;

    /* renamed from: c  reason: collision with root package name */
    public final File f14042c;

    /* renamed from: d  reason: collision with root package name */
    public final File f14043d;

    /* renamed from: e  reason: collision with root package name */
    public final int f14044e;

    /* renamed from: f  reason: collision with root package name */
    public long f14045f;

    /* renamed from: n  reason: collision with root package name */
    public final int f14046n;

    /* renamed from: o  reason: collision with root package name */
    public long f14047o = 0;

    /* renamed from: p  reason: collision with root package name */
    public BufferedWriter f14048p;

    /* renamed from: q  reason: collision with root package name */
    public final LinkedHashMap<String, d> f14049q = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: r  reason: collision with root package name */
    public int f14050r;

    /* renamed from: s  reason: collision with root package name */
    public long f14051s = 0;

    /* renamed from: t  reason: collision with root package name */
    public final ThreadPoolExecutor f14052t = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());

    /* renamed from: u  reason: collision with root package name */
    public final C0177a f14053u = new C0177a();

    /* renamed from: p4.a$a  reason: collision with other inner class name */
    /* compiled from: DiskLruCache */
    public class C0177a implements Callable<Void> {
        public C0177a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object call() {
            /*
                r3 = this;
                p4.a r0 = p4.a.this
                monitor-enter(r0)
                p4.a r1 = p4.a.this     // Catch:{ all -> 0x0023 }
                java.io.BufferedWriter r2 = r1.f14048p     // Catch:{ all -> 0x0023 }
                if (r2 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
                goto L_0x0021
            L_0x000b:
                r1.R()     // Catch:{ all -> 0x0023 }
                p4.a r1 = p4.a.this     // Catch:{ all -> 0x0023 }
                boolean r1 = r1.x()     // Catch:{ all -> 0x0023 }
                if (r1 == 0) goto L_0x0020
                p4.a r1 = p4.a.this     // Catch:{ all -> 0x0023 }
                r1.L()     // Catch:{ all -> 0x0023 }
                p4.a r1 = p4.a.this     // Catch:{ all -> 0x0023 }
                r2 = 0
                r1.f14050r = r2     // Catch:{ all -> 0x0023 }
            L_0x0020:
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            L_0x0021:
                r0 = 0
                return r0
            L_0x0023:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p4.a.C0177a.call():java.lang.Object");
        }
    }

    /* compiled from: DiskLruCache */
    public static final class b implements ThreadFactory {
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* compiled from: DiskLruCache */
    public final class c {

        /* renamed from: a  reason: collision with root package name */
        public final d f14055a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f14056b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f14057c;

        public c(d dVar) {
            boolean[] zArr;
            this.f14055a = dVar;
            if (dVar.f14063e) {
                zArr = null;
            } else {
                zArr = new boolean[a.this.f14046n];
            }
            this.f14056b = zArr;
        }

        public final void a() {
            a.d(a.this, this, false);
        }

        public final File b() {
            File file;
            synchronized (a.this) {
                d dVar = this.f14055a;
                if (dVar.f14064f == this) {
                    if (!dVar.f14063e) {
                        this.f14056b[0] = true;
                    }
                    file = dVar.f14062d[0];
                    a.this.f14040a.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            }
            return file;
        }
    }

    /* compiled from: DiskLruCache */
    public final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f14059a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f14060b;

        /* renamed from: c  reason: collision with root package name */
        public File[] f14061c;

        /* renamed from: d  reason: collision with root package name */
        public File[] f14062d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f14063e;

        /* renamed from: f  reason: collision with root package name */
        public c f14064f;

        public d(String str) {
            this.f14059a = str;
            int i10 = a.this.f14046n;
            this.f14060b = new long[i10];
            this.f14061c = new File[i10];
            this.f14062d = new File[i10];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i11 = 0; i11 < a.this.f14046n; i11++) {
                sb2.append(i11);
                this.f14061c[i11] = new File(a.this.f14040a, sb2.toString());
                sb2.append(".tmp");
                this.f14062d[i11] = new File(a.this.f14040a, sb2.toString());
                sb2.setLength(length);
            }
        }

        public final String a() {
            StringBuilder sb2 = new StringBuilder();
            for (long append : this.f14060b) {
                sb2.append(' ');
                sb2.append(append);
            }
            return sb2.toString();
        }
    }

    /* compiled from: DiskLruCache */
    public final class e {

        /* renamed from: a  reason: collision with root package name */
        public final File[] f14066a;

        public e(File[] fileArr) {
            this.f14066a = fileArr;
        }
    }

    public a(File file, long j10) {
        File file2 = file;
        this.f14040a = file2;
        this.f14044e = 1;
        this.f14041b = new File(file2, "journal");
        this.f14042c = new File(file2, "journal.tmp");
        this.f14043d = new File(file2, "journal.bkp");
        this.f14046n = 1;
        this.f14045f = j10;
    }

    public static void N(File file, File file2, boolean z10) {
        if (z10) {
            i(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(p4.a r9, p4.a.c r10, boolean r11) {
        /*
            monitor-enter(r9)
            p4.a$d r0 = r10.f14055a     // Catch:{ all -> 0x00f9 }
            p4.a$c r1 = r0.f14064f     // Catch:{ all -> 0x00f9 }
            if (r1 != r10) goto L_0x00f3
            r1 = 0
            if (r11 == 0) goto L_0x0046
            boolean r2 = r0.f14063e     // Catch:{ all -> 0x00f9 }
            if (r2 != 0) goto L_0x0046
            r2 = r1
        L_0x000f:
            int r3 = r9.f14046n     // Catch:{ all -> 0x00f9 }
            if (r2 >= r3) goto L_0x0046
            boolean[] r3 = r10.f14056b     // Catch:{ all -> 0x00f9 }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00f9 }
            if (r3 == 0) goto L_0x002c
            java.io.File[] r3 = r0.f14062d     // Catch:{ all -> 0x00f9 }
            r3 = r3[r2]     // Catch:{ all -> 0x00f9 }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x00f9 }
            if (r3 != 0) goto L_0x0029
            r10.a()     // Catch:{ all -> 0x00f9 }
            monitor-exit(r9)
            goto L_0x00f2
        L_0x0029:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002c:
            r10.a()     // Catch:{ all -> 0x00f9 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f9 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f9 }
            r11.<init>()     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x00f9 }
            r11.append(r2)     // Catch:{ all -> 0x00f9 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00f9 }
            r10.<init>(r11)     // Catch:{ all -> 0x00f9 }
            throw r10     // Catch:{ all -> 0x00f9 }
        L_0x0046:
            int r10 = r9.f14046n     // Catch:{ all -> 0x00f9 }
            if (r1 >= r10) goto L_0x0076
            java.io.File[] r10 = r0.f14062d     // Catch:{ all -> 0x00f9 }
            r10 = r10[r1]     // Catch:{ all -> 0x00f9 }
            if (r11 == 0) goto L_0x0070
            boolean r2 = r10.exists()     // Catch:{ all -> 0x00f9 }
            if (r2 == 0) goto L_0x0073
            java.io.File[] r2 = r0.f14061c     // Catch:{ all -> 0x00f9 }
            r2 = r2[r1]     // Catch:{ all -> 0x00f9 }
            r10.renameTo(r2)     // Catch:{ all -> 0x00f9 }
            long[] r10 = r0.f14060b     // Catch:{ all -> 0x00f9 }
            r3 = r10[r1]     // Catch:{ all -> 0x00f9 }
            long r5 = r2.length()     // Catch:{ all -> 0x00f9 }
            long[] r10 = r0.f14060b     // Catch:{ all -> 0x00f9 }
            r10[r1] = r5     // Catch:{ all -> 0x00f9 }
            long r7 = r9.f14047o     // Catch:{ all -> 0x00f9 }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f14047o = r7     // Catch:{ all -> 0x00f9 }
            goto L_0x0073
        L_0x0070:
            i(r10)     // Catch:{ all -> 0x00f9 }
        L_0x0073:
            int r1 = r1 + 1
            goto L_0x0046
        L_0x0076:
            int r10 = r9.f14050r     // Catch:{ all -> 0x00f9 }
            r1 = 1
            int r10 = r10 + r1
            r9.f14050r = r10     // Catch:{ all -> 0x00f9 }
            r10 = 0
            r0.f14064f = r10     // Catch:{ all -> 0x00f9 }
            boolean r10 = r0.f14063e     // Catch:{ all -> 0x00f9 }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00b8
            r0.f14063e = r1     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.f14048p     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.f14048p     // Catch:{ all -> 0x00f9 }
            r10.append(r3)     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.f14048p     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = r0.f14059a     // Catch:{ all -> 0x00f9 }
            r10.append(r1)     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.f14048p     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = r0.a()     // Catch:{ all -> 0x00f9 }
            r10.append(r1)     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.f14048p     // Catch:{ all -> 0x00f9 }
            r10.append(r2)     // Catch:{ all -> 0x00f9 }
            if (r11 == 0) goto L_0x00d7
            long r10 = r9.f14051s     // Catch:{ all -> 0x00f9 }
            r1 = 1
            long r10 = r10 + r1
            r9.f14051s = r10     // Catch:{ all -> 0x00f9 }
            r0.getClass()     // Catch:{ all -> 0x00f9 }
            goto L_0x00d7
        L_0x00b8:
            java.util.LinkedHashMap<java.lang.String, p4.a$d> r10 = r9.f14049q     // Catch:{ all -> 0x00f9 }
            java.lang.String r11 = r0.f14059a     // Catch:{ all -> 0x00f9 }
            r10.remove(r11)     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.f14048p     // Catch:{ all -> 0x00f9 }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.f14048p     // Catch:{ all -> 0x00f9 }
            r10.append(r3)     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.f14048p     // Catch:{ all -> 0x00f9 }
            java.lang.String r11 = r0.f14059a     // Catch:{ all -> 0x00f9 }
            r10.append(r11)     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.f14048p     // Catch:{ all -> 0x00f9 }
            r10.append(r2)     // Catch:{ all -> 0x00f9 }
        L_0x00d7:
            java.io.BufferedWriter r10 = r9.f14048p     // Catch:{ all -> 0x00f9 }
            s(r10)     // Catch:{ all -> 0x00f9 }
            long r10 = r9.f14047o     // Catch:{ all -> 0x00f9 }
            long r0 = r9.f14045f     // Catch:{ all -> 0x00f9 }
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x00ea
            boolean r10 = r9.x()     // Catch:{ all -> 0x00f9 }
            if (r10 == 0) goto L_0x00f1
        L_0x00ea:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f14052t     // Catch:{ all -> 0x00f9 }
            p4.a$a r11 = r9.f14053u     // Catch:{ all -> 0x00f9 }
            r10.submit(r11)     // Catch:{ all -> 0x00f9 }
        L_0x00f1:
            monitor-exit(r9)
        L_0x00f2:
            return
        L_0x00f3:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f9 }
            r10.<init>()     // Catch:{ all -> 0x00f9 }
            throw r10     // Catch:{ all -> 0x00f9 }
        L_0x00f9:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.a.d(p4.a, p4.a$c, boolean):void");
    }

    @TargetApi(26)
    public static void h(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void i(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void s(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static a z(File file, long j10) {
        if (j10 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    N(file2, file3, false);
                }
            }
            a aVar = new a(file, j10);
            if (aVar.f14041b.exists()) {
                try {
                    aVar.E();
                    aVar.B();
                    return aVar;
                } catch (IOException e10) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                    aVar.close();
                    c.a(aVar.f14040a);
                }
            }
            file.mkdirs();
            a aVar2 = new a(file, j10);
            aVar2.L();
            return aVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final void B() {
        i(this.f14042c);
        Iterator<d> it = this.f14049q.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i10 = 0;
            if (next.f14064f == null) {
                while (i10 < this.f14046n) {
                    this.f14047o += next.f14060b[i10];
                    i10++;
                }
            } else {
                next.f14064f = null;
                while (i10 < this.f14046n) {
                    i(next.f14061c[i10]);
                    i(next.f14062d[i10]);
                    i10++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:16|17|(1:19)|(1:21)(1:22)|23|24|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f14050r = r2 - r9.f14049q.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006d, code lost:
        if (r1.f14071e == -1) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006f, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        if (r0 != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        L();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        r9.f14048p = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f14041b, true), p4.c.f14073a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0060 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0060=Splitter:B:16:0x0060, B:29:0x0093=Splitter:B:29:0x0093} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            p4.b r1 = new p4.b
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f14041b
            r2.<init>(r3)
            java.nio.charset.Charset r3 = p4.c.f14073a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.d()     // Catch:{ all -> 0x0091 }
            java.lang.String r3 = r1.d()     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = r1.d()     // Catch:{ all -> 0x0091 }
            java.lang.String r5 = r1.d()     // Catch:{ all -> 0x0091 }
            java.lang.String r6 = r1.d()     // Catch:{ all -> 0x0091 }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x0091 }
            if (r7 == 0) goto L_0x0093
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x0091 }
            if (r7 == 0) goto L_0x0093
            int r7 = r9.f14044e     // Catch:{ all -> 0x0091 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x0091 }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x0091 }
            if (r4 == 0) goto L_0x0093
            int r4 = r9.f14046n     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x0091 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0091 }
            if (r4 == 0) goto L_0x0093
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x0091 }
            if (r4 == 0) goto L_0x0093
            r0 = 0
            r2 = r0
        L_0x0056:
            java.lang.String r3 = r1.d()     // Catch:{ EOFException -> 0x0060 }
            r9.K(r3)     // Catch:{ EOFException -> 0x0060 }
            int r2 = r2 + 1
            goto L_0x0056
        L_0x0060:
            java.util.LinkedHashMap<java.lang.String, p4.a$d> r3 = r9.f14049q     // Catch:{ all -> 0x0091 }
            int r3 = r3.size()     // Catch:{ all -> 0x0091 }
            int r2 = r2 - r3
            r9.f14050r = r2     // Catch:{ all -> 0x0091 }
            int r2 = r1.f14071e     // Catch:{ all -> 0x0091 }
            r3 = -1
            r4 = 1
            if (r2 != r3) goto L_0x0070
            r0 = r4
        L_0x0070:
            if (r0 == 0) goto L_0x0076
            r9.L()     // Catch:{ all -> 0x0091 }
            goto L_0x008b
        L_0x0076:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x0091 }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0091 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0091 }
            java.io.File r5 = r9.f14041b     // Catch:{ all -> 0x0091 }
            r3.<init>(r5, r4)     // Catch:{ all -> 0x0091 }
            java.nio.charset.Charset r4 = p4.c.f14073a     // Catch:{ all -> 0x0091 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0091 }
            r0.<init>(r2)     // Catch:{ all -> 0x0091 }
            r9.f14048p = r0     // Catch:{ all -> 0x0091 }
        L_0x008b:
            r1.close()     // Catch:{ RuntimeException -> 0x008f, Exception -> 0x008e }
        L_0x008e:
            return
        L_0x008f:
            r0 = move-exception
            throw r0
        L_0x0091:
            r0 = move-exception
            goto L_0x00c1
        L_0x0093:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0091 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0091 }
            r7.<init>()     // Catch:{ all -> 0x0091 }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x0091 }
            r7.append(r2)     // Catch:{ all -> 0x0091 }
            r7.append(r0)     // Catch:{ all -> 0x0091 }
            r7.append(r3)     // Catch:{ all -> 0x0091 }
            r7.append(r0)     // Catch:{ all -> 0x0091 }
            r7.append(r5)     // Catch:{ all -> 0x0091 }
            r7.append(r0)     // Catch:{ all -> 0x0091 }
            r7.append(r6)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0091 }
            r4.<init>(r0)     // Catch:{ all -> 0x0091 }
            throw r4     // Catch:{ all -> 0x0091 }
        L_0x00c1:
            r1.close()     // Catch:{ RuntimeException -> 0x00c5, Exception -> 0x00c4 }
        L_0x00c4:
            throw r0
        L_0x00c5:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.a.E():void");
    }

    public final void K(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i10);
            if (indexOf2 == -1) {
                str2 = str.substring(i10);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f14049q.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i10, indexOf2);
            }
            d dVar = this.f14049q.get(str2);
            if (dVar == null) {
                dVar = new d(str2);
                this.f14049q.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f14063e = true;
                dVar.f14064f = null;
                if (split.length == a.this.f14046n) {
                    int i11 = 0;
                    while (i11 < split.length) {
                        try {
                            dVar.f14060b[i11] = Long.parseLong(split[i11]);
                            i11++;
                        } catch (NumberFormatException unused) {
                            StringBuilder q10 = android.support.v4.media.a.q("unexpected journal line: ");
                            q10.append(Arrays.toString(split));
                            throw new IOException(q10.toString());
                        }
                    }
                    return;
                }
                StringBuilder q11 = android.support.v4.media.a.q("unexpected journal line: ");
                q11.append(Arrays.toString(split));
                throw new IOException(q11.toString());
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f14064f = new c(dVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException(b0.r("unexpected journal line: ", str));
            }
        } else {
            throw new IOException(b0.r("unexpected journal line: ", str));
        }
    }

    /* JADX INFO: finally extract failed */
    public final synchronized void L() {
        BufferedWriter bufferedWriter = this.f14048p;
        if (bufferedWriter != null) {
            h(bufferedWriter);
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f14042c), c.f14073a));
        try {
            bufferedWriter2.write("libcore.io.DiskLruCache");
            bufferedWriter2.write("\n");
            bufferedWriter2.write("1");
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f14044e));
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f14046n));
            bufferedWriter2.write("\n");
            bufferedWriter2.write("\n");
            for (d next : this.f14049q.values()) {
                if (next.f14064f != null) {
                    bufferedWriter2.write("DIRTY " + next.f14059a + 10);
                } else {
                    bufferedWriter2.write("CLEAN " + next.f14059a + next.a() + 10);
                }
            }
            h(bufferedWriter2);
            if (this.f14041b.exists()) {
                N(this.f14041b, this.f14043d, true);
            }
            N(this.f14042c, this.f14041b, false);
            this.f14043d.delete();
            this.f14048p = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f14041b, true), c.f14073a));
        } catch (Throwable th2) {
            h(bufferedWriter2);
            throw th2;
        }
    }

    public final void R() {
        while (this.f14047o > this.f14045f) {
            String str = (String) this.f14049q.entrySet().iterator().next().getKey();
            synchronized (this) {
                if (this.f14048p != null) {
                    d dVar = this.f14049q.get(str);
                    if (dVar != null) {
                        if (dVar.f14064f == null) {
                            for (int i10 = 0; i10 < this.f14046n; i10++) {
                                File file = dVar.f14061c[i10];
                                if (file.exists()) {
                                    if (!file.delete()) {
                                        throw new IOException("failed to delete " + file);
                                    }
                                }
                                long j10 = this.f14047o;
                                long[] jArr = dVar.f14060b;
                                this.f14047o = j10 - jArr[i10];
                                jArr[i10] = 0;
                            }
                            this.f14050r++;
                            this.f14048p.append("REMOVE");
                            this.f14048p.append(' ');
                            this.f14048p.append(str);
                            this.f14048p.append(10);
                            this.f14049q.remove(str);
                            if (x()) {
                                this.f14052t.submit(this.f14053u);
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("cache is closed");
                }
            }
        }
    }

    public final synchronized void close() {
        if (this.f14048p != null) {
            Iterator it = new ArrayList(this.f14049q.values()).iterator();
            while (it.hasNext()) {
                c cVar = ((d) it.next()).f14064f;
                if (cVar != null) {
                    cVar.a();
                }
            }
            R();
            h(this.f14048p);
            this.f14048p = null;
        }
    }

    public final c q(String str) {
        c cVar;
        synchronized (this) {
            if (this.f14048p != null) {
                d dVar = this.f14049q.get(str);
                cVar = null;
                if (dVar == null) {
                    dVar = new d(str);
                    this.f14049q.put(str, dVar);
                } else if (dVar.f14064f != null) {
                }
                cVar = new c(dVar);
                dVar.f14064f = cVar;
                this.f14048p.append("DIRTY");
                this.f14048p.append(' ');
                this.f14048p.append(str);
                this.f14048p.append(10);
                s(this.f14048p);
            } else {
                throw new IllegalStateException("cache is closed");
            }
        }
        return cVar;
    }

    public final synchronized e v(String str) {
        if (this.f14048p != null) {
            d dVar = this.f14049q.get(str);
            if (dVar == null) {
                return null;
            }
            if (!dVar.f14063e) {
                return null;
            }
            for (File exists : dVar.f14061c) {
                if (!exists.exists()) {
                    return null;
                }
            }
            this.f14050r++;
            this.f14048p.append("READ");
            this.f14048p.append(' ');
            this.f14048p.append(str);
            this.f14048p.append(10);
            if (x()) {
                this.f14052t.submit(this.f14053u);
            }
            return new e(dVar.f14061c);
        }
        throw new IllegalStateException("cache is closed");
    }

    public final boolean x() {
        int i10 = this.f14050r;
        if (i10 < 2000 || i10 < this.f14049q.size()) {
            return false;
        }
        return true;
    }
}
