package okhttp3.internal.http2;

import android.support.v4.media.a;
import f0.b0;
import fk.h;
import fk.p;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ll.c0;
import ll.d0;
import ll.f;
import ll.i;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import sk.j;
import u9.b;

/* compiled from: Http2Reader.kt */
public final class Http2Reader implements Closeable {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f22476e = new Companion(0);

    /* renamed from: f  reason: collision with root package name */
    public static final Logger f22477f;

    /* renamed from: a  reason: collision with root package name */
    public final i f22478a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f22479b;

    /* renamed from: c  reason: collision with root package name */
    public final ContinuationSource f22480c;

    /* renamed from: d  reason: collision with root package name */
    public final Hpack.Reader f22481d;

    /* compiled from: Http2Reader.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static int a(int i10, int i11, int i12) {
            if ((i11 & 8) != 0) {
                i10--;
            }
            if (i12 <= i10) {
                return i10 - i12;
            }
            throw new IOException(b0.p("PROTOCOL_ERROR padding ", i12, " > remaining length ", i10));
        }
    }

    /* compiled from: Http2Reader.kt */
    public static final class ContinuationSource implements c0 {

        /* renamed from: a  reason: collision with root package name */
        public final i f22482a;

        /* renamed from: b  reason: collision with root package name */
        public int f22483b;

        /* renamed from: c  reason: collision with root package name */
        public int f22484c;

        /* renamed from: d  reason: collision with root package name */
        public int f22485d;

        /* renamed from: e  reason: collision with root package name */
        public int f22486e;

        /* renamed from: f  reason: collision with root package name */
        public int f22487f;

        public ContinuationSource(i iVar) {
            this.f22482a = iVar;
        }

        public final long J0(f fVar, long j10) {
            int i10;
            int readInt;
            j.f(fVar, "sink");
            do {
                int i11 = this.f22486e;
                if (i11 == 0) {
                    this.f22482a.skip((long) this.f22487f);
                    this.f22487f = 0;
                    if ((this.f22484c & 4) != 0) {
                        return -1;
                    }
                    i10 = this.f22485d;
                    int s10 = Util.s(this.f22482a);
                    this.f22486e = s10;
                    this.f22483b = s10;
                    byte readByte = this.f22482a.readByte() & 255;
                    this.f22484c = this.f22482a.readByte() & 255;
                    Http2Reader.f22476e.getClass();
                    Logger logger = Http2Reader.f22477f;
                    if (logger.isLoggable(Level.FINE)) {
                        Http2 http2 = Http2.f22399a;
                        int i12 = this.f22485d;
                        int i13 = this.f22483b;
                        int i14 = this.f22484c;
                        http2.getClass();
                        logger.fine(Http2.a(i12, i13, readByte, i14, true));
                    }
                    readInt = this.f22482a.readInt() & Integer.MAX_VALUE;
                    this.f22485d = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                } else {
                    long J0 = this.f22482a.J0(fVar, Math.min(8192, (long) i11));
                    if (J0 == -1) {
                        return -1;
                    }
                    this.f22486e -= (int) J0;
                    return J0;
                }
            } while (readInt == i10);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }

        public final void close() {
        }

        public final d0 f() {
            return this.f22482a.f();
        }
    }

    /* compiled from: Http2Reader.kt */
    public interface Handler {
        void a(int i10, List list);

        void b();

        void e(int i10, long j10);

        void f(int i10, int i11, i iVar, boolean z10);

        void h();

        void i(boolean z10, int i10, int i11);

        void j(Settings settings);

        void k(int i10, ErrorCode errorCode);

        void l(int i10, List list, boolean z10);

        void m(int i10, ErrorCode errorCode, ll.j jVar);
    }

    static {
        Logger logger = Logger.getLogger(Http2.class.getName());
        j.e(logger, "getLogger(Http2::class.java.name)");
        f22477f = logger;
    }

    public Http2Reader(i iVar, boolean z10) {
        this.f22478a = iVar;
        this.f22479b = z10;
        ContinuationSource continuationSource = new ContinuationSource(iVar);
        this.f22480c = continuationSource;
        this.f22481d = new Hpack.Reader(continuationSource);
    }

    public final void close() {
        this.f22478a.close();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01db, code lost:
        throw new java.io.IOException(android.support.v4.media.a.m("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r6));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(boolean r12, okhttp3.internal.http2.Http2Reader.Handler r13) {
        /*
            r11 = this;
            java.lang.String r0 = "handler"
            sk.j.f(r13, r0)
            r0 = 0
            ll.i r1 = r11.f22478a     // Catch:{ EOFException -> 0x030d }
            r2 = 9
            r1.G0(r2)     // Catch:{ EOFException -> 0x030d }
            ll.i r1 = r11.f22478a
            int r1 = okhttp3.internal.Util.s(r1)
            r2 = 16384(0x4000, float:2.2959E-41)
            if (r1 > r2) goto L_0x0301
            ll.i r3 = r11.f22478a
            byte r3 = r3.readByte()
            r3 = r3 & 255(0xff, float:3.57E-43)
            ll.i r4 = r11.f22478a
            byte r4 = r4.readByte()
            r4 = r4 & 255(0xff, float:3.57E-43)
            ll.i r5 = r11.f22478a
            int r5 = r5.readInt()
            r6 = 2147483647(0x7fffffff, float:NaN)
            r5 = r5 & r6
            java.util.logging.Logger r7 = f22477f
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            boolean r8 = r7.isLoggable(r8)
            r9 = 1
            if (r8 == 0) goto L_0x0048
            okhttp3.internal.http2.Http2 r8 = okhttp3.internal.http2.Http2.f22399a
            r8.getClass()
            java.lang.String r8 = okhttp3.internal.http2.Http2.a(r5, r1, r3, r4, r9)
            r7.fine(r8)
        L_0x0048:
            r7 = 4
            if (r12 == 0) goto L_0x007c
            if (r3 != r7) goto L_0x004e
            goto L_0x007c
        L_0x004e:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "Expected a SETTINGS frame but was "
            java.lang.StringBuilder r13 = android.support.v4.media.a.q(r13)
            okhttp3.internal.http2.Http2 r1 = okhttp3.internal.http2.Http2.f22399a
            r1.getClass()
            java.lang.String[] r1 = okhttp3.internal.http2.Http2.f22401c
            int r2 = r1.length
            if (r3 >= r2) goto L_0x0063
            r0 = r1[r3]
            goto L_0x0071
        L_0x0063:
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r1[r0] = r2
            java.lang.String r0 = "0x%02x"
            java.lang.String r0 = okhttp3.internal.Util.h(r0, r1)
        L_0x0071:
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x007c:
            r12 = 5
            r8 = 0
            r10 = 8
            switch(r3) {
                case 0: goto L_0x02bd;
                case 1: goto L_0x0286;
                case 2: goto L_0x0267;
                case 3: goto L_0x0217;
                case 4: goto L_0x0176;
                case 5: goto L_0x0145;
                case 6: goto L_0x0117;
                case 7: goto L_0x00b7;
                case 8: goto L_0x008b;
                default: goto L_0x0083;
            }
        L_0x0083:
            ll.i r12 = r11.f22478a
            long r0 = (long) r1
            r12.skip(r0)
            goto L_0x0300
        L_0x008b:
            if (r1 != r7) goto L_0x00ab
            ll.i r12 = r11.f22478a
            int r12 = r12.readInt()
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r2 = (long) r12
            long r0 = r0 & r2
            r2 = 0
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 == 0) goto L_0x00a3
            r13.e(r5, r0)
            goto L_0x0300
        L_0x00a3:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "windowSizeIncrement was 0"
            r12.<init>(r13)
            throw r12
        L_0x00ab:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "TYPE_WINDOW_UPDATE length !=4: "
            java.lang.String r13 = android.support.v4.media.a.m(r13, r1)
            r12.<init>(r13)
            throw r12
        L_0x00b7:
            if (r1 < r10) goto L_0x010b
            if (r5 != 0) goto L_0x0103
            ll.i r12 = r11.f22478a
            int r12 = r12.readInt()
            ll.i r2 = r11.f22478a
            int r2 = r2.readInt()
            int r1 = r1 - r10
            okhttp3.internal.http2.ErrorCode$Companion r3 = okhttp3.internal.http2.ErrorCode.f22361b
            r3.getClass()
            okhttp3.internal.http2.ErrorCode[] r3 = okhttp3.internal.http2.ErrorCode.values()
            int r4 = r3.length
            r5 = r0
        L_0x00d3:
            if (r5 >= r4) goto L_0x00e5
            r6 = r3[r5]
            int r7 = r6.f22369a
            if (r7 != r2) goto L_0x00dd
            r7 = r9
            goto L_0x00de
        L_0x00dd:
            r7 = r0
        L_0x00de:
            if (r7 == 0) goto L_0x00e2
            r8 = r6
            goto L_0x00e5
        L_0x00e2:
            int r5 = r5 + 1
            goto L_0x00d3
        L_0x00e5:
            if (r8 == 0) goto L_0x00f7
            ll.j r0 = ll.j.f20882d
            if (r1 <= 0) goto L_0x00f2
            ll.i r0 = r11.f22478a
            long r1 = (long) r1
            ll.j r0 = r0.n(r1)
        L_0x00f2:
            r13.m(r12, r8, r0)
            goto L_0x0300
        L_0x00f7:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "TYPE_GOAWAY unexpected error code: "
            java.lang.String r13 = android.support.v4.media.a.m(r13, r2)
            r12.<init>(r13)
            throw r12
        L_0x0103:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "TYPE_GOAWAY streamId != 0"
            r12.<init>(r13)
            throw r12
        L_0x010b:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "TYPE_GOAWAY length < 8: "
            java.lang.String r13 = android.support.v4.media.a.m(r13, r1)
            r12.<init>(r13)
            throw r12
        L_0x0117:
            if (r1 != r10) goto L_0x0139
            if (r5 != 0) goto L_0x0131
            ll.i r12 = r11.f22478a
            int r12 = r12.readInt()
            ll.i r1 = r11.f22478a
            int r1 = r1.readInt()
            r2 = r4 & 1
            if (r2 == 0) goto L_0x012c
            r0 = r9
        L_0x012c:
            r13.i(r0, r12, r1)
            goto L_0x0300
        L_0x0131:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "TYPE_PING streamId != 0"
            r12.<init>(r13)
            throw r12
        L_0x0139:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "TYPE_PING length != 8: "
            java.lang.String r13 = android.support.v4.media.a.m(r13, r1)
            r12.<init>(r13)
            throw r12
        L_0x0145:
            if (r5 == 0) goto L_0x016e
            r12 = r4 & 8
            if (r12 == 0) goto L_0x0153
            ll.i r12 = r11.f22478a
            byte r12 = r12.readByte()
            r0 = r12 & 255(0xff, float:3.57E-43)
        L_0x0153:
            ll.i r12 = r11.f22478a
            int r12 = r12.readInt()
            r12 = r12 & r6
            okhttp3.internal.http2.Http2Reader$Companion r2 = f22476e
            int r1 = r1 + -4
            r2.getClass()
            int r1 = okhttp3.internal.http2.Http2Reader.Companion.a(r1, r4, r0)
            java.util.List r0 = r11.i(r1, r0, r4, r5)
            r13.a(r12, r0)
            goto L_0x0300
        L_0x016e:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            r12.<init>(r13)
            throw r12
        L_0x0176:
            if (r5 != 0) goto L_0x020f
            r3 = r4 & 1
            if (r3 == 0) goto L_0x018b
            if (r1 != 0) goto L_0x0183
            r13.b()
            goto L_0x0300
        L_0x0183:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "FRAME_SIZE_ERROR ack frame should be empty!"
            r12.<init>(r13)
            throw r12
        L_0x018b:
            int r3 = r1 % 6
            if (r3 != 0) goto L_0x0203
            okhttp3.internal.http2.Settings r3 = new okhttp3.internal.http2.Settings
            r3.<init>()
            vk.h r0 = p3.l0.U0(r0, r1)
            r1 = 6
            vk.f r0 = p3.l0.K0(r0, r1)
            int r1 = r0.f23335a
            int r4 = r0.f23336b
            int r0 = r0.f23337c
            if (r0 <= 0) goto L_0x01a7
            if (r1 <= r4) goto L_0x01ab
        L_0x01a7:
            if (r0 >= 0) goto L_0x01fe
            if (r4 > r1) goto L_0x01fe
        L_0x01ab:
            ll.i r5 = r11.f22478a
            short r5 = r5.readShort()
            r6 = 65535(0xffff, float:9.1834E-41)
            byte[] r8 = okhttp3.internal.Util.f22171a
            r5 = r5 & r6
            ll.i r6 = r11.f22478a
            int r6 = r6.readInt()
            r8 = 2
            if (r5 == r8) goto L_0x01ea
            r8 = 3
            if (r5 == r8) goto L_0x01e8
            if (r5 == r7) goto L_0x01dc
            if (r5 == r12) goto L_0x01c8
            goto L_0x01f7
        L_0x01c8:
            if (r6 < r2) goto L_0x01d0
            r8 = 16777215(0xffffff, float:2.3509886E-38)
            if (r6 > r8) goto L_0x01d0
            goto L_0x01f7
        L_0x01d0:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "
            java.lang.String r13 = android.support.v4.media.a.m(r13, r6)
            r12.<init>(r13)
            throw r12
        L_0x01dc:
            r5 = 7
            if (r6 < 0) goto L_0x01e0
            goto L_0x01f7
        L_0x01e0:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            r12.<init>(r13)
            throw r12
        L_0x01e8:
            r5 = r7
            goto L_0x01f7
        L_0x01ea:
            if (r6 == 0) goto L_0x01f7
            if (r6 != r9) goto L_0x01ef
            goto L_0x01f7
        L_0x01ef:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            r12.<init>(r13)
            throw r12
        L_0x01f7:
            r3.b(r5, r6)
            if (r1 == r4) goto L_0x01fe
            int r1 = r1 + r0
            goto L_0x01ab
        L_0x01fe:
            r13.j(r3)
            goto L_0x0300
        L_0x0203:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "TYPE_SETTINGS length % 6 != 0: "
            java.lang.String r13 = android.support.v4.media.a.m(r13, r1)
            r12.<init>(r13)
            throw r12
        L_0x020f:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "TYPE_SETTINGS streamId != 0"
            r12.<init>(r13)
            throw r12
        L_0x0217:
            if (r1 != r7) goto L_0x0259
            if (r5 == 0) goto L_0x0251
            ll.i r12 = r11.f22478a
            int r12 = r12.readInt()
            okhttp3.internal.http2.ErrorCode$Companion r1 = okhttp3.internal.http2.ErrorCode.f22361b
            r1.getClass()
            okhttp3.internal.http2.ErrorCode[] r1 = okhttp3.internal.http2.ErrorCode.values()
            int r2 = r1.length
            r3 = r0
        L_0x022c:
            if (r3 >= r2) goto L_0x023e
            r4 = r1[r3]
            int r6 = r4.f22369a
            if (r6 != r12) goto L_0x0236
            r6 = r9
            goto L_0x0237
        L_0x0236:
            r6 = r0
        L_0x0237:
            if (r6 == 0) goto L_0x023b
            r8 = r4
            goto L_0x023e
        L_0x023b:
            int r3 = r3 + 1
            goto L_0x022c
        L_0x023e:
            if (r8 == 0) goto L_0x0245
            r13.k(r5, r8)
            goto L_0x0300
        L_0x0245:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r0 = "TYPE_RST_STREAM unexpected error code: "
            java.lang.String r12 = android.support.v4.media.a.m(r0, r12)
            r13.<init>(r12)
            throw r13
        L_0x0251:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "TYPE_RST_STREAM streamId == 0"
            r12.<init>(r13)
            throw r12
        L_0x0259:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "TYPE_RST_STREAM length: "
            java.lang.String r0 = " != 4"
            java.lang.String r13 = v.v.d(r13, r1, r0)
            r12.<init>(r13)
            throw r12
        L_0x0267:
            if (r1 != r12) goto L_0x0278
            if (r5 == 0) goto L_0x0270
            r11.q(r13, r5)
            goto L_0x0300
        L_0x0270:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "TYPE_PRIORITY streamId == 0"
            r12.<init>(r13)
            throw r12
        L_0x0278:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "TYPE_PRIORITY length: "
            java.lang.String r0 = " != 5"
            java.lang.String r13 = v.v.d(r13, r1, r0)
            r12.<init>(r13)
            throw r12
        L_0x0286:
            if (r5 == 0) goto L_0x02b5
            r12 = r4 & 1
            if (r12 == 0) goto L_0x028e
            r12 = r9
            goto L_0x028f
        L_0x028e:
            r12 = r0
        L_0x028f:
            r2 = r4 & 8
            if (r2 == 0) goto L_0x029b
            ll.i r0 = r11.f22478a
            byte r0 = r0.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
        L_0x029b:
            r2 = r4 & 32
            if (r2 == 0) goto L_0x02a4
            r11.q(r13, r5)
            int r1 = r1 + -5
        L_0x02a4:
            okhttp3.internal.http2.Http2Reader$Companion r2 = f22476e
            r2.getClass()
            int r1 = okhttp3.internal.http2.Http2Reader.Companion.a(r1, r4, r0)
            java.util.List r0 = r11.i(r1, r0, r4, r5)
            r13.l(r5, r0, r12)
            goto L_0x0300
        L_0x02b5:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            r12.<init>(r13)
            throw r12
        L_0x02bd:
            if (r5 == 0) goto L_0x02f8
            r12 = r4 & 1
            if (r12 == 0) goto L_0x02c5
            r12 = r9
            goto L_0x02c6
        L_0x02c5:
            r12 = r0
        L_0x02c6:
            r2 = r4 & 32
            if (r2 == 0) goto L_0x02cc
            r2 = r9
            goto L_0x02cd
        L_0x02cc:
            r2 = r0
        L_0x02cd:
            if (r2 != 0) goto L_0x02f0
            r2 = r4 & 8
            if (r2 == 0) goto L_0x02db
            ll.i r0 = r11.f22478a
            byte r0 = r0.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
        L_0x02db:
            okhttp3.internal.http2.Http2Reader$Companion r2 = f22476e
            r2.getClass()
            int r1 = okhttp3.internal.http2.Http2Reader.Companion.a(r1, r4, r0)
            ll.i r2 = r11.f22478a
            r13.f(r5, r1, r2, r12)
            ll.i r12 = r11.f22478a
            long r0 = (long) r0
            r12.skip(r0)
            goto L_0x0300
        L_0x02f0:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            r12.<init>(r13)
            throw r12
        L_0x02f8:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            r12.<init>(r13)
            throw r12
        L_0x0300:
            return r9
        L_0x0301:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "FRAME_SIZE_ERROR: "
            java.lang.String r13 = android.support.v4.media.a.m(r13, r1)
            r12.<init>(r13)
            throw r12
        L_0x030d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Reader.d(boolean, okhttp3.internal.http2.Http2Reader$Handler):boolean");
    }

    public final void h(Handler handler) {
        j.f(handler, "handler");
        if (!this.f22479b) {
            i iVar = this.f22478a;
            ll.j jVar = Http2.f22400b;
            ll.j n10 = iVar.n((long) jVar.f20883a.length);
            Logger logger = f22477f;
            if (logger.isLoggable(Level.FINE)) {
                StringBuilder q10 = a.q("<< CONNECTION ");
                q10.append(n10.j());
                logger.fine(Util.h(q10.toString(), new Object[0]));
            }
            if (!j.a(jVar, n10)) {
                StringBuilder q11 = a.q("Expected a connection header but was ");
                q11.append(n10.q());
                throw new IOException(q11.toString());
            }
        } else if (!d(true, handler)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }

    public final List<Header> i(int i10, int i11, int i12, int i13) {
        ContinuationSource continuationSource = this.f22480c;
        continuationSource.f22486e = i10;
        continuationSource.f22483b = i10;
        continuationSource.f22487f = i11;
        continuationSource.f22484c = i12;
        continuationSource.f22485d = i13;
        Hpack.Reader reader = this.f22481d;
        while (!reader.f22385d.A()) {
            byte readByte = reader.f22385d.readByte();
            byte[] bArr = Util.f22171a;
            byte b10 = readByte & 255;
            if (b10 != 128) {
                boolean z10 = false;
                if ((b10 & 128) == 128) {
                    int e10 = reader.e(b10, 127) - 1;
                    if (e10 >= 0) {
                        Hpack.f22379a.getClass();
                        if (e10 <= Hpack.f22380b.length - 1) {
                            z10 = true;
                        }
                    }
                    if (z10) {
                        Hpack.f22379a.getClass();
                        reader.f22384c.add(Hpack.f22380b[e10]);
                    } else {
                        Hpack.f22379a.getClass();
                        int length = reader.f22387f + 1 + (e10 - Hpack.f22380b.length);
                        if (length >= 0) {
                            Header[] headerArr = reader.f22386e;
                            if (length < headerArr.length) {
                                ArrayList arrayList = reader.f22384c;
                                Header header = headerArr[length];
                                j.c(header);
                                arrayList.add(header);
                            }
                        }
                        StringBuilder q10 = a.q("Header index too large ");
                        q10.append(e10 + 1);
                        throw new IOException(q10.toString());
                    }
                } else if (b10 == 64) {
                    Hpack hpack = Hpack.f22379a;
                    ll.j d10 = reader.d();
                    hpack.getClass();
                    Hpack.a(d10);
                    reader.c(new Header(d10, reader.d()));
                } else if ((b10 & 64) == 64) {
                    reader.c(new Header(reader.b(reader.e(b10, 63) - 1), reader.d()));
                } else if ((b10 & 32) == 32) {
                    int e11 = reader.e(b10, 31);
                    reader.f22383b = e11;
                    if (e11 < 0 || e11 > reader.f22382a) {
                        StringBuilder q11 = a.q("Invalid dynamic table size update ");
                        q11.append(reader.f22383b);
                        throw new IOException(q11.toString());
                    }
                    int i14 = reader.f22389h;
                    if (e11 < i14) {
                        if (e11 == 0) {
                            h.q0(reader.f22386e, (b) null);
                            reader.f22387f = reader.f22386e.length - 1;
                            reader.f22388g = 0;
                            reader.f22389h = 0;
                        } else {
                            reader.a(i14 - e11);
                        }
                    }
                } else if (b10 == 16 || b10 == 0) {
                    Hpack hpack2 = Hpack.f22379a;
                    ll.j d11 = reader.d();
                    hpack2.getClass();
                    Hpack.a(d11);
                    reader.f22384c.add(new Header(d11, reader.d()));
                } else {
                    reader.f22384c.add(new Header(reader.b(reader.e(b10, 15) - 1), reader.d()));
                }
            } else {
                throw new IOException("index == 0");
            }
        }
        Hpack.Reader reader2 = this.f22481d;
        List<Header> Z0 = p.Z0(reader2.f22384c);
        reader2.f22384c.clear();
        return Z0;
    }

    public final void q(Handler handler, int i10) {
        this.f22478a.readInt();
        this.f22478a.readByte();
        byte[] bArr = Util.f22171a;
        handler.h();
    }
}
