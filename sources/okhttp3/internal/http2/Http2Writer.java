package okhttp3.internal.http2;

import android.support.v4.media.a;
import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ll.f;
import ll.h;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import sk.j;
import u9.b;

/* compiled from: Http2Writer.kt */
public final class Http2Writer implements Closeable {

    /* renamed from: n  reason: collision with root package name */
    public static final Logger f22513n = Logger.getLogger(Http2.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final h f22514a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f22515b;

    /* renamed from: c  reason: collision with root package name */
    public final f f22516c;

    /* renamed from: d  reason: collision with root package name */
    public int f22517d = 16384;

    /* renamed from: e  reason: collision with root package name */
    public boolean f22518e;

    /* renamed from: f  reason: collision with root package name */
    public final Hpack.Writer f22519f;

    /* compiled from: Http2Writer.kt */
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

    public Http2Writer(h hVar, boolean z10) {
        this.f22514a = hVar;
        this.f22515b = z10;
        f fVar = new f();
        this.f22516c = fVar;
        this.f22519f = new Hpack.Writer(fVar);
    }

    public final synchronized void close() {
        this.f22518e = true;
        this.f22514a.close();
    }

    public final synchronized void d(Settings settings) {
        int i10;
        int i11;
        j.f(settings, "peerSettings");
        if (!this.f22518e) {
            int i12 = this.f22517d;
            int i13 = settings.f22529a;
            if ((i13 & 32) != 0) {
                i12 = settings.f22530b[5];
            }
            this.f22517d = i12;
            if ((i13 & 2) != 0) {
                i10 = settings.f22530b[1];
            } else {
                i10 = -1;
            }
            if (i10 != -1) {
                Hpack.Writer writer = this.f22519f;
                if ((i13 & 2) != 0) {
                    i11 = settings.f22530b[1];
                } else {
                    i11 = -1;
                }
                writer.getClass();
                int min = Math.min(i11, 16384);
                int i14 = writer.f22394e;
                if (i14 != min) {
                    if (min < i14) {
                        writer.f22392c = Math.min(writer.f22392c, min);
                    }
                    writer.f22393d = true;
                    writer.f22394e = min;
                    int i15 = writer.f22398i;
                    if (min < i15) {
                        if (min == 0) {
                            fk.h.q0(writer.f22395f, (b) null);
                            writer.f22396g = writer.f22395f.length - 1;
                            writer.f22397h = 0;
                            writer.f22398i = 0;
                        } else {
                            writer.a(i15 - min);
                        }
                    }
                }
            }
            i(0, 0, 4, 1);
            this.f22514a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void h(boolean z10, int i10, f fVar, int i11) {
        if (!this.f22518e) {
            i(i10, i11, 0, z10 ? 1 : 0);
            if (i11 > 0) {
                h hVar = this.f22514a;
                j.c(fVar);
                hVar.Q(fVar, (long) i11);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void i(int i10, int i11, int i12, int i13) {
        boolean z10;
        Logger logger = f22513n;
        boolean z11 = false;
        if (logger.isLoggable(Level.FINE)) {
            Http2.f22399a.getClass();
            logger.fine(Http2.a(i10, i11, i12, i13, false));
        }
        if (i11 <= this.f22517d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if ((Integer.MIN_VALUE & i10) == 0) {
                z11 = true;
            }
            if (z11) {
                h hVar = this.f22514a;
                byte[] bArr = Util.f22171a;
                j.f(hVar, "<this>");
                hVar.writeByte((i11 >>> 16) & 255);
                hVar.writeByte((i11 >>> 8) & 255);
                hVar.writeByte(i11 & 255);
                this.f22514a.writeByte(i12 & 255);
                this.f22514a.writeByte(i13 & 255);
                this.f22514a.writeInt(i10 & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(a.m("reserved bit set: ", i10).toString());
        }
        StringBuilder q10 = a.q("FRAME_SIZE_ERROR length > ");
        q10.append(this.f22517d);
        q10.append(": ");
        q10.append(i11);
        throw new IllegalArgumentException(q10.toString().toString());
    }

    public final synchronized void q(int i10, ErrorCode errorCode, byte[] bArr) {
        boolean z10;
        if (!this.f22518e) {
            boolean z11 = false;
            if (errorCode.f22369a != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i(0, bArr.length + 8, 7, 0);
                this.f22514a.writeInt(i10);
                this.f22514a.writeInt(errorCode.f22369a);
                if (bArr.length == 0) {
                    z11 = true;
                }
                if (!z11) {
                    this.f22514a.write(bArr);
                }
                this.f22514a.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void s(boolean z10, int i10, int i11) {
        int i12;
        if (!this.f22518e) {
            if (z10) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            i(0, 8, 6, i12);
            this.f22514a.writeInt(i10);
            this.f22514a.writeInt(i11);
            this.f22514a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void v(int i10, ErrorCode errorCode) {
        boolean z10;
        j.f(errorCode, "errorCode");
        if (!this.f22518e) {
            if (errorCode.f22369a != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i(i10, 4, 3, 0);
                this.f22514a.writeInt(errorCode.f22369a);
                this.f22514a.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void x(int i10, long j10) {
        boolean z10;
        if (!this.f22518e) {
            if (j10 == 0 || j10 > 2147483647L) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                i(i10, 4, 8, 0);
                this.f22514a.writeInt((int) j10);
                this.f22514a.flush();
            } else {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void z(int i10, long j10) {
        int i11;
        while (j10 > 0) {
            long min = Math.min((long) this.f22517d, j10);
            j10 -= min;
            int i12 = (int) min;
            if (j10 == 0) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            i(i10, i12, 9, i11);
            this.f22514a.Q(this.f22516c, min);
        }
    }
}
