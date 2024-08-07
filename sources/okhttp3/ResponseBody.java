package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import ll.f;
import ll.i;
import okhttp3.MediaType;
import okhttp3.internal.Util;
import p3.l0;
import sk.j;
import yk.a;

/* compiled from: ResponseBody.kt */
public abstract class ResponseBody implements Closeable {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f22151b = new Companion(0);

    /* renamed from: a  reason: collision with root package name */
    public BomAwareReader f22152a;

    /* compiled from: ResponseBody.kt */
    public static final class BomAwareReader extends Reader {

        /* renamed from: a  reason: collision with root package name */
        public final i f22153a;

        /* renamed from: b  reason: collision with root package name */
        public final Charset f22154b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f22155c;

        /* renamed from: d  reason: collision with root package name */
        public InputStreamReader f22156d;

        public BomAwareReader(i iVar, Charset charset) {
            j.f(iVar, "source");
            j.f(charset, "charset");
            this.f22153a = iVar;
            this.f22154b = charset;
        }

        public final void close() {
            ek.i iVar;
            this.f22155c = true;
            InputStreamReader inputStreamReader = this.f22156d;
            if (inputStreamReader != null) {
                inputStreamReader.close();
                iVar = ek.i.f20112a;
            } else {
                iVar = null;
            }
            if (iVar == null) {
                this.f22153a.close();
            }
        }

        public final int read(char[] cArr, int i10, int i11) {
            j.f(cArr, "cbuf");
            if (!this.f22155c) {
                InputStreamReader inputStreamReader = this.f22156d;
                if (inputStreamReader == null) {
                    inputStreamReader = new InputStreamReader(this.f22153a.O0(), Util.r(this.f22153a, this.f22154b));
                    this.f22156d = inputStreamReader;
                }
                return inputStreamReader.read(cArr, i10, i11);
            }
            throw new IOException("Stream closed");
        }
    }

    /* compiled from: ResponseBody.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static ResponseBody$Companion$asResponseBody$1 a(String str, MediaType mediaType) {
            j.f(str, "<this>");
            Charset charset = a.f23582b;
            if (mediaType != null) {
                MediaType.Companion companion = MediaType.f22026e;
                Charset a10 = mediaType.a((Charset) null);
                if (a10 == null) {
                    MediaType.f22026e.getClass();
                    mediaType = MediaType.Companion.b(mediaType + "; charset=utf-8");
                } else {
                    charset = a10;
                }
            }
            f fVar = new f();
            j.f(charset, "charset");
            fVar.t0(str, 0, str.length(), charset);
            return new ResponseBody$Companion$asResponseBody$1(mediaType, fVar.f20878b, fVar);
        }
    }

    public void close() {
        Util.c(i());
    }

    public abstract long d();

    public abstract MediaType h();

    public abstract i i();

    public final String q() {
        Charset charset;
        i i10 = i();
        try {
            MediaType h10 = h();
            if (h10 != null) {
                charset = h10.a(a.f23582b);
                if (charset == null) {
                }
                String V = i10.V(Util.r(i10, charset));
                l0.u(i10, (Throwable) null);
                return V;
            }
            charset = a.f23582b;
            String V2 = i10.V(Util.r(i10, charset));
            l0.u(i10, (Throwable) null);
            return V2;
        } catch (Throwable th2) {
            l0.u(i10, th);
            throw th2;
        }
    }
}
