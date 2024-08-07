package okhttp3.internal.http2;

import f0.b0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ll.f;
import ll.h;
import ll.i;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.http2.Http2Stream;
import rk.a;
import sk.j;

/* compiled from: Http2Connection.kt */
public final class Http2Connection implements Closeable {
    public static final Companion I = new Companion(0);
    public static final Settings J;
    public long A;
    public long B;
    public long C;
    public long D;
    public final Socket E;
    public final Http2Writer F;
    public final ReaderRunnable G;
    public final LinkedHashSet H;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f22404a;

    /* renamed from: b  reason: collision with root package name */
    public final Listener f22405b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f22406c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final String f22407d;

    /* renamed from: e  reason: collision with root package name */
    public int f22408e;

    /* renamed from: f  reason: collision with root package name */
    public int f22409f;

    /* renamed from: n  reason: collision with root package name */
    public boolean f22410n;

    /* renamed from: o  reason: collision with root package name */
    public final TaskRunner f22411o;

    /* renamed from: p  reason: collision with root package name */
    public final TaskQueue f22412p;

    /* renamed from: q  reason: collision with root package name */
    public final TaskQueue f22413q;

    /* renamed from: r  reason: collision with root package name */
    public final TaskQueue f22414r;

    /* renamed from: s  reason: collision with root package name */
    public final PushObserver f22415s;

    /* renamed from: t  reason: collision with root package name */
    public long f22416t;

    /* renamed from: u  reason: collision with root package name */
    public long f22417u;

    /* renamed from: v  reason: collision with root package name */
    public long f22418v;

    /* renamed from: w  reason: collision with root package name */
    public long f22419w;

    /* renamed from: x  reason: collision with root package name */
    public long f22420x;

    /* renamed from: y  reason: collision with root package name */
    public final Settings f22421y;

    /* renamed from: z  reason: collision with root package name */
    public Settings f22422z;

    /* compiled from: Http2Connection.kt */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public boolean f22455a = true;

        /* renamed from: b  reason: collision with root package name */
        public final TaskRunner f22456b;

        /* renamed from: c  reason: collision with root package name */
        public Socket f22457c;

        /* renamed from: d  reason: collision with root package name */
        public String f22458d;

        /* renamed from: e  reason: collision with root package name */
        public i f22459e;

        /* renamed from: f  reason: collision with root package name */
        public h f22460f;

        /* renamed from: g  reason: collision with root package name */
        public Listener f22461g;

        /* renamed from: h  reason: collision with root package name */
        public PushObserver f22462h;

        /* renamed from: i  reason: collision with root package name */
        public int f22463i;

        public Builder(TaskRunner taskRunner) {
            j.f(taskRunner, "taskRunner");
            this.f22456b = taskRunner;
            this.f22461g = Listener.f22464a;
            this.f22462h = PushObserver.f22527a;
        }
    }

    /* compiled from: Http2Connection.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    /* compiled from: Http2Connection.kt */
    public static abstract class Listener {

        /* renamed from: a  reason: collision with root package name */
        public static final Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1 f22464a = new Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1();

        /* compiled from: Http2Connection.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(int i10) {
                this();
            }
        }

        static {
            new Companion(0);
        }

        public void a(Http2Connection http2Connection, Settings settings) {
            j.f(http2Connection, "connection");
            j.f(settings, "settings");
        }

        public abstract void b(Http2Stream http2Stream);
    }

    /* compiled from: Http2Connection.kt */
    public final class ReaderRunnable implements Http2Reader.Handler, a<ek.i> {

        /* renamed from: a  reason: collision with root package name */
        public final Http2Reader f22465a;

        public ReaderRunnable(Http2Reader http2Reader) {
            this.f22465a = http2Reader;
        }

        public final void a(int i10, List list) {
            Http2Connection http2Connection = Http2Connection.this;
            http2Connection.getClass();
            synchronized (http2Connection) {
                if (http2Connection.H.contains(Integer.valueOf(i10))) {
                    http2Connection.z(i10, ErrorCode.PROTOCOL_ERROR);
                    return;
                }
                http2Connection.H.add(Integer.valueOf(i10));
                TaskQueue taskQueue = http2Connection.f22413q;
                taskQueue.c(new Http2Connection$pushRequestLater$$inlined$execute$default$1(http2Connection.f22407d + '[' + i10 + "] onRequest", http2Connection, i10, list), 0);
            }
        }

        public final void b() {
        }

        public final void e(int i10, long j10) {
            if (i10 == 0) {
                Http2Connection http2Connection = Http2Connection.this;
                synchronized (http2Connection) {
                    http2Connection.D += j10;
                    http2Connection.notifyAll();
                    ek.i iVar = ek.i.f20112a;
                }
                return;
            }
            Http2Stream i11 = Http2Connection.this.i(i10);
            if (i11 != null) {
                synchronized (i11) {
                    i11.f22493f += j10;
                    if (j10 > 0) {
                        i11.notifyAll();
                    }
                    ek.i iVar2 = ek.i.f20112a;
                }
            }
        }

        public final void f(int i10, int i11, i iVar, boolean z10) {
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            int i12 = i10;
            int i13 = i11;
            i iVar2 = iVar;
            j.f(iVar2, "source");
            Http2Connection.this.getClass();
            if (i12 == 0 || (i12 & 1) != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                Http2Connection http2Connection = Http2Connection.this;
                http2Connection.getClass();
                f fVar = new f();
                long j10 = (long) i13;
                iVar2.G0(j10);
                iVar2.J0(fVar, j10);
                TaskQueue taskQueue = http2Connection.f22413q;
                taskQueue.c(new Http2Connection$pushDataLater$$inlined$execute$default$1(http2Connection.f22407d + '[' + i12 + "] onData", http2Connection, i10, fVar, i11, z10), 0);
                return;
            }
            Http2Stream i14 = Http2Connection.this.i(i12);
            if (i14 == null) {
                Http2Connection.this.z(i12, ErrorCode.PROTOCOL_ERROR);
                long j11 = (long) i13;
                Http2Connection.this.v(j11);
                iVar2.skip(j11);
                return;
            }
            byte[] bArr = Util.f22171a;
            Http2Stream.FramingSource framingSource = i14.f22496i;
            long j12 = (long) i13;
            framingSource.getClass();
            long j13 = j12;
            while (true) {
                if (j13 <= 0) {
                    Http2Stream http2Stream = Http2Stream.this;
                    byte[] bArr2 = Util.f22171a;
                    http2Stream.f22489b.v(j12);
                    break;
                }
                synchronized (Http2Stream.this) {
                    z12 = framingSource.f22507b;
                    if (framingSource.f22509d.f20878b + j13 > framingSource.f22506a) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    ek.i iVar3 = ek.i.f20112a;
                }
                if (z13) {
                    iVar2.skip(j13);
                    Http2Stream.this.e(ErrorCode.FLOW_CONTROL_ERROR);
                    break;
                } else if (z12) {
                    iVar2.skip(j13);
                    break;
                } else {
                    long J0 = iVar2.J0(framingSource.f22508c, j13);
                    if (J0 != -1) {
                        j13 -= J0;
                        Http2Stream http2Stream2 = Http2Stream.this;
                        synchronized (http2Stream2) {
                            if (framingSource.f22510e) {
                                framingSource.f22508c.q();
                            } else {
                                f fVar2 = framingSource.f22509d;
                                if (fVar2.f20878b == 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                fVar2.E0(framingSource.f22508c);
                                if (z14) {
                                    http2Stream2.notifyAll();
                                }
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
            if (z10) {
                i14.i(Util.f22172b, true);
            }
        }

        public final void h() {
        }

        public final void i(boolean z10, int i10, int i11) {
            if (z10) {
                Http2Connection http2Connection = Http2Connection.this;
                synchronized (http2Connection) {
                    if (i10 == 1) {
                        http2Connection.f22417u++;
                    } else if (i10 != 2) {
                        if (i10 == 3) {
                            http2Connection.notifyAll();
                        }
                        ek.i iVar = ek.i.f20112a;
                    } else {
                        http2Connection.f22419w++;
                    }
                }
                return;
            }
            Http2Connection.this.f22412p.c(new Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1(android.support.v4.media.a.o(new StringBuilder(), Http2Connection.this.f22407d, " ping"), Http2Connection.this, i10, i11), 0);
        }

        public final Object invoke() {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            e = null;
            try {
                this.f22465a.h(this);
                do {
                } while (this.f22465a.d(false, this));
                errorCode = ErrorCode.NO_ERROR;
                try {
                    Http2Connection.this.d(errorCode, ErrorCode.CANCEL, (IOException) null);
                } catch (IOException e10) {
                    e = e10;
                    try {
                        ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                        Http2Connection.this.d(errorCode3, errorCode3, e);
                        Util.c(this.f22465a);
                        return ek.i.f20112a;
                    } catch (Throwable th2) {
                        th = th2;
                        Http2Connection.this.d(errorCode, errorCode2, e);
                        Util.c(this.f22465a);
                        throw th;
                    }
                }
            } catch (IOException e11) {
                e = e11;
                errorCode = errorCode2;
                ErrorCode errorCode32 = ErrorCode.PROTOCOL_ERROR;
                Http2Connection.this.d(errorCode32, errorCode32, e);
                Util.c(this.f22465a);
                return ek.i.f20112a;
            } catch (Throwable th3) {
                th = th3;
                errorCode = errorCode2;
                Http2Connection.this.d(errorCode, errorCode2, e);
                Util.c(this.f22465a);
                throw th;
            }
            Util.c(this.f22465a);
            return ek.i.f20112a;
        }

        public final void j(Settings settings) {
            Http2Connection.this.f22412p.c(new Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1(android.support.v4.media.a.o(new StringBuilder(), Http2Connection.this.f22407d, " applyAndAckSettings"), this, settings), 0);
        }

        public final void k(int i10, ErrorCode errorCode) {
            Http2Connection.this.getClass();
            boolean z10 = true;
            if (i10 == 0 || (i10 & 1) != 0) {
                z10 = false;
            }
            if (z10) {
                Http2Connection http2Connection = Http2Connection.this;
                http2Connection.getClass();
                TaskQueue taskQueue = http2Connection.f22413q;
                taskQueue.c(new Http2Connection$pushResetLater$$inlined$execute$default$1(http2Connection.f22407d + '[' + i10 + "] onReset", http2Connection, i10, errorCode), 0);
                return;
            }
            Http2Stream q10 = Http2Connection.this.q(i10);
            if (q10 != null) {
                synchronized (q10) {
                    if (q10.f22500m == null) {
                        q10.f22500m = errorCode;
                        q10.notifyAll();
                    }
                }
            }
        }

        public final void l(int i10, List list, boolean z10) {
            int i11 = i10;
            Http2Connection.this.getClass();
            boolean z11 = true;
            if (i11 == 0 || (i11 & 1) != 0) {
                z11 = false;
            }
            if (z11) {
                Http2Connection http2Connection = Http2Connection.this;
                http2Connection.getClass();
                TaskQueue taskQueue = http2Connection.f22413q;
                taskQueue.c(new Http2Connection$pushHeadersLater$$inlined$execute$default$1(http2Connection.f22407d + '[' + i10 + "] onHeaders", http2Connection, i10, list, z10), 0);
                return;
            }
            Http2Connection http2Connection2 = Http2Connection.this;
            synchronized (http2Connection2) {
                Http2Stream i12 = http2Connection2.i(i10);
                if (i12 != null) {
                    ek.i iVar = ek.i.f20112a;
                    i12.i(Util.v(list), z10);
                } else if (!http2Connection2.f22410n) {
                    if (i11 > http2Connection2.f22408e) {
                        if (i11 % 2 != http2Connection2.f22409f % 2) {
                            Http2Stream http2Stream = new Http2Stream(i10, http2Connection2, false, z10, Util.v(list));
                            http2Connection2.f22408e = i11;
                            http2Connection2.f22406c.put(Integer.valueOf(i10), http2Stream);
                            TaskQueue f10 = http2Connection2.f22411o.f();
                            f10.c(new Http2Connection$ReaderRunnable$headers$lambda$2$$inlined$execute$default$1(http2Connection2.f22407d + '[' + i10 + "] onStream", http2Connection2, http2Stream), 0);
                        }
                    }
                }
            }
        }

        public final void m(int i10, ErrorCode errorCode, ll.j jVar) {
            int i11;
            Object[] array;
            j.f(jVar, "debugData");
            jVar.i();
            Http2Connection http2Connection = Http2Connection.this;
            synchronized (http2Connection) {
                array = http2Connection.f22406c.values().toArray(new Http2Stream[0]);
                http2Connection.f22410n = true;
                ek.i iVar = ek.i.f20112a;
            }
            for (Http2Stream http2Stream : (Http2Stream[]) array) {
                if (http2Stream.f22488a > i10 && http2Stream.g()) {
                    ErrorCode errorCode2 = ErrorCode.REFUSED_STREAM;
                    synchronized (http2Stream) {
                        if (http2Stream.f22500m == null) {
                            http2Stream.f22500m = errorCode2;
                            http2Stream.notifyAll();
                        }
                    }
                    Http2Connection.this.q(http2Stream.f22488a);
                }
            }
        }
    }

    static {
        Settings settings = new Settings();
        settings.b(7, 65535);
        settings.b(5, 16384);
        J = settings;
    }

    public Http2Connection(Builder builder) {
        int i10;
        boolean z10 = builder.f22455a;
        this.f22404a = z10;
        this.f22405b = builder.f22461g;
        String str = builder.f22458d;
        if (str != null) {
            this.f22407d = str;
            if (builder.f22455a) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            this.f22409f = i10;
            TaskRunner taskRunner = builder.f22456b;
            this.f22411o = taskRunner;
            TaskQueue f10 = taskRunner.f();
            this.f22412p = f10;
            this.f22413q = taskRunner.f();
            this.f22414r = taskRunner.f();
            this.f22415s = builder.f22462h;
            Settings settings = new Settings();
            if (builder.f22455a) {
                settings.b(7, 16777216);
            }
            this.f22421y = settings;
            Settings settings2 = J;
            this.f22422z = settings2;
            this.D = (long) settings2.a();
            Socket socket = builder.f22457c;
            if (socket != null) {
                this.E = socket;
                h hVar = builder.f22460f;
                if (hVar != null) {
                    this.F = new Http2Writer(hVar, z10);
                    i iVar = builder.f22459e;
                    if (iVar != null) {
                        this.G = new ReaderRunnable(new Http2Reader(iVar, z10));
                        this.H = new LinkedHashSet();
                        int i11 = builder.f22463i;
                        if (i11 != 0) {
                            long nanos = TimeUnit.MILLISECONDS.toNanos((long) i11);
                            f10.c(new Http2Connection$special$$inlined$schedule$1(b0.r(str, " ping"), this, nanos), nanos);
                            return;
                        }
                        return;
                    }
                    j.l("source");
                    throw null;
                }
                j.l("sink");
                throw null;
            }
            j.l("socket");
            throw null;
        }
        j.l("connectionName");
        throw null;
    }

    public final void B(int i10, long j10) {
        TaskQueue taskQueue = this.f22412p;
        taskQueue.c(new Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1(this.f22407d + '[' + i10 + "] windowUpdate", this, i10, j10), 0);
    }

    public final void close() {
        d(ErrorCode.NO_ERROR, ErrorCode.CANCEL, (IOException) null);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x003a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(okhttp3.internal.http2.ErrorCode r4, okhttp3.internal.http2.ErrorCode r5, java.io.IOException r6) {
        /*
            r3 = this;
            byte[] r0 = okhttp3.internal.Util.f22171a
            r3.s(r4)     // Catch:{ IOException -> 0x0005 }
        L_0x0005:
            r4 = 0
            monitor-enter(r3)
            java.util.LinkedHashMap r0 = r3.f22406c     // Catch:{ all -> 0x004f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x004f }
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto L_0x0023
            java.util.LinkedHashMap r4 = r3.f22406c     // Catch:{ all -> 0x004f }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x004f }
            okhttp3.internal.http2.Http2Stream[] r0 = new okhttp3.internal.http2.Http2Stream[r1]     // Catch:{ all -> 0x004f }
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch:{ all -> 0x004f }
            java.util.LinkedHashMap r0 = r3.f22406c     // Catch:{ all -> 0x004f }
            r0.clear()     // Catch:{ all -> 0x004f }
        L_0x0023:
            ek.i r0 = ek.i.f20112a     // Catch:{ all -> 0x004f }
            monitor-exit(r3)
            okhttp3.internal.http2.Http2Stream[] r4 = (okhttp3.internal.http2.Http2Stream[]) r4
            if (r4 == 0) goto L_0x0035
            int r0 = r4.length
        L_0x002b:
            if (r1 >= r0) goto L_0x0035
            r2 = r4[r1]
            r2.c(r5, r6)     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            int r1 = r1 + 1
            goto L_0x002b
        L_0x0035:
            okhttp3.internal.http2.Http2Writer r4 = r3.F     // Catch:{ IOException -> 0x003a }
            r4.close()     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            java.net.Socket r4 = r3.E     // Catch:{ IOException -> 0x003f }
            r4.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            okhttp3.internal.concurrent.TaskQueue r4 = r3.f22412p
            r4.e()
            okhttp3.internal.concurrent.TaskQueue r4 = r3.f22413q
            r4.e()
            okhttp3.internal.concurrent.TaskQueue r4 = r3.f22414r
            r4.e()
            return
        L_0x004f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.d(okhttp3.internal.http2.ErrorCode, okhttp3.internal.http2.ErrorCode, java.io.IOException):void");
    }

    public final void flush() {
        Http2Writer http2Writer = this.F;
        synchronized (http2Writer) {
            if (!http2Writer.f22518e) {
                http2Writer.f22514a.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void h(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        d(errorCode, errorCode, iOException);
    }

    public final synchronized Http2Stream i(int i10) {
        return (Http2Stream) this.f22406c.get(Integer.valueOf(i10));
    }

    public final synchronized Http2Stream q(int i10) {
        Http2Stream http2Stream;
        http2Stream = (Http2Stream) this.f22406c.remove(Integer.valueOf(i10));
        notifyAll();
        return http2Stream;
    }

    public final void s(ErrorCode errorCode) {
        synchronized (this.F) {
            synchronized (this) {
                if (!this.f22410n) {
                    this.f22410n = true;
                    int i10 = this.f22408e;
                    ek.i iVar = ek.i.f20112a;
                    this.F.q(i10, errorCode, Util.f22171a);
                }
            }
        }
    }

    public final synchronized void v(long j10) {
        long j11 = this.A + j10;
        this.A = j11;
        long j12 = j11 - this.B;
        if (j12 >= ((long) (this.f22421y.a() / 2))) {
            B(0, j12);
            this.B += j12;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:27|28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.F.f22517d);
        r6 = (long) r2;
        r8.C += r6;
        r4 = ek.i.f20112a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x005b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(int r9, boolean r10, ll.f r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            okhttp3.internal.http2.Http2Writer r12 = r8.F
            r12.h(r10, r9, r11, r3)
            return
        L_0x000d:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x006a
            monitor-enter(r8)
        L_0x0012:
            long r4 = r8.C     // Catch:{ InterruptedException -> 0x005b }
            long r6 = r8.D     // Catch:{ InterruptedException -> 0x005b }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0032
            java.util.LinkedHashMap r2 = r8.f22406c     // Catch:{ InterruptedException -> 0x005b }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x005b }
            boolean r2 = r2.containsKey(r4)     // Catch:{ InterruptedException -> 0x005b }
            if (r2 == 0) goto L_0x002a
            r8.wait()     // Catch:{ InterruptedException -> 0x005b }
            goto L_0x0012
        L_0x002a:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x005b }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x005b }
            throw r9     // Catch:{ InterruptedException -> 0x005b }
        L_0x0032:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch:{ all -> 0x0059 }
            int r2 = (int) r4     // Catch:{ all -> 0x0059 }
            okhttp3.internal.http2.Http2Writer r4 = r8.F     // Catch:{ all -> 0x0059 }
            int r4 = r4.f22517d     // Catch:{ all -> 0x0059 }
            int r2 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x0059 }
            long r4 = r8.C     // Catch:{ all -> 0x0059 }
            long r6 = (long) r2     // Catch:{ all -> 0x0059 }
            long r4 = r4 + r6
            r8.C = r4     // Catch:{ all -> 0x0059 }
            ek.i r4 = ek.i.f20112a     // Catch:{ all -> 0x0059 }
            monitor-exit(r8)
            long r12 = r12 - r6
            okhttp3.internal.http2.Http2Writer r4 = r8.F
            if (r10 == 0) goto L_0x0054
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0054
            r5 = 1
            goto L_0x0055
        L_0x0054:
            r5 = r3
        L_0x0055:
            r4.h(r5, r9, r11, r2)
            goto L_0x000d
        L_0x0059:
            r9 = move-exception
            goto L_0x0068
        L_0x005b:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0059 }
            r9.interrupt()     // Catch:{ all -> 0x0059 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0059 }
            r9.<init>()     // Catch:{ all -> 0x0059 }
            throw r9     // Catch:{ all -> 0x0059 }
        L_0x0068:
            monitor-exit(r8)
            throw r9
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.x(int, boolean, ll.f, long):void");
    }

    public final void z(int i10, ErrorCode errorCode) {
        TaskQueue taskQueue = this.f22412p;
        taskQueue.c(new Http2Connection$writeSynResetLater$$inlined$execute$default$1(this.f22407d + '[' + i10 + "] writeSynReset", this, i10, errorCode), 0);
    }
}
