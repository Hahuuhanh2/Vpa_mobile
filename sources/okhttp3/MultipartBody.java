package okhttp3;

import android.support.v4.media.a;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import ll.h;
import ll.j;
import okhttp3.Headers;
import okhttp3.MediaType;

/* compiled from: MultipartBody.kt */
public final class MultipartBody extends RequestBody {

    /* renamed from: f  reason: collision with root package name */
    public static final Companion f22033f = new Companion(0);

    /* renamed from: g  reason: collision with root package name */
    public static final MediaType f22034g = MediaType.Companion.a("multipart/mixed");

    /* renamed from: h  reason: collision with root package name */
    public static final MediaType f22035h = MediaType.Companion.a("multipart/form-data");

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f22036i = {58, 32};

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f22037j = {13, 10};

    /* renamed from: k  reason: collision with root package name */
    public static final byte[] f22038k = {45, 45};

    /* renamed from: b  reason: collision with root package name */
    public final j f22039b;

    /* renamed from: c  reason: collision with root package name */
    public final List<Part> f22040c;

    /* renamed from: d  reason: collision with root package name */
    public final MediaType f22041d;

    /* renamed from: e  reason: collision with root package name */
    public long f22042e = -1;

    /* compiled from: MultipartBody.kt */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final j f22043a;

        /* renamed from: b  reason: collision with root package name */
        public MediaType f22044b = MultipartBody.f22034g;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f22045c = new ArrayList();

        public Builder() {
            String uuid = UUID.randomUUID().toString();
            sk.j.e(uuid, "randomUUID().toString()");
            j jVar = j.f20882d;
            this.f22043a = j.a.b(uuid);
        }
    }

    /* compiled from: MultipartBody.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static void a(StringBuilder sb2, String str) {
            sk.j.f(str, "key");
            sb2.append('\"');
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if (charAt == 10) {
                    sb2.append("%0A");
                } else if (charAt == 13) {
                    sb2.append("%0D");
                } else if (charAt == '\"') {
                    sb2.append("%22");
                } else {
                    sb2.append(charAt);
                }
            }
            sb2.append('\"');
        }
    }

    /* compiled from: MultipartBody.kt */
    public static final class Part {

        /* renamed from: c  reason: collision with root package name */
        public static final Companion f22046c = new Companion(0);

        /* renamed from: a  reason: collision with root package name */
        public final Headers f22047a;

        /* renamed from: b  reason: collision with root package name */
        public final RequestBody f22048b;

        /* compiled from: MultipartBody.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(int i10) {
                this();
            }

            public static Part a(Headers headers, RequestBody requestBody) {
                String str;
                boolean z10;
                sk.j.f(requestBody, "body");
                String str2 = null;
                if (headers != null) {
                    str = headers.g("Content-Type");
                } else {
                    str = null;
                }
                boolean z11 = true;
                if (str == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (headers != null) {
                        str2 = headers.g("Content-Length");
                    }
                    if (str2 != null) {
                        z11 = false;
                    }
                    if (z11) {
                        return new Part(headers, requestBody);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
            }

            public static Part b(String str, String str2, RequestBody$Companion$asRequestBody$1 requestBody$Companion$asRequestBody$1) {
                StringBuilder q10 = a.q("form-data; name=");
                MultipartBody.f22033f.getClass();
                Companion.a(q10, str);
                if (str2 != null) {
                    q10.append("; filename=");
                    Companion.a(q10, str2);
                }
                String sb2 = q10.toString();
                sk.j.e(sb2, "StringBuilder().apply(builderAction).toString()");
                Headers.Builder builder = new Headers.Builder();
                Headers.f22002b.getClass();
                Headers.Companion.a("Content-Disposition");
                builder.c("Content-Disposition", sb2);
                return a(builder.d(), requestBody$Companion$asRequestBody$1);
            }
        }

        public Part(Headers headers, RequestBody requestBody) {
            this.f22047a = headers;
            this.f22048b = requestBody;
        }
    }

    static {
        MediaType.f22026e.getClass();
        MediaType.Companion.a("multipart/alternative");
        MediaType.Companion.a("multipart/digest");
        MediaType.Companion.a("multipart/parallel");
    }

    public MultipartBody(j jVar, MediaType mediaType, List<Part> list) {
        sk.j.f(jVar, "boundaryByteString");
        sk.j.f(mediaType, "type");
        this.f22039b = jVar;
        this.f22040c = list;
        MediaType.f22026e.getClass();
        this.f22041d = MediaType.Companion.a(mediaType + "; boundary=" + jVar.q());
    }

    public final long a() {
        long j10 = this.f22042e;
        if (j10 != -1) {
            return j10;
        }
        long d10 = d((h) null, true);
        this.f22042e = d10;
        return d10;
    }

    public final MediaType b() {
        return this.f22041d;
    }

    public final void c(h hVar) {
        d(hVar, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: ll.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: ll.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: ll.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: ll.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: ll.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long d(ll.h r13, boolean r14) {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x0009
            ll.f r13 = new ll.f
            r13.<init>()
            r0 = r13
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List<okhttp3.MultipartBody$Part> r1 = r12.f22040c
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = r2
        L_0x0014:
            if (r5 >= r1) goto L_0x00a9
            java.util.List<okhttp3.MultipartBody$Part> r6 = r12.f22040c
            java.lang.Object r6 = r6.get(r5)
            okhttp3.MultipartBody$Part r6 = (okhttp3.MultipartBody.Part) r6
            okhttp3.Headers r7 = r6.f22047a
            okhttp3.RequestBody r6 = r6.f22048b
            sk.j.c(r13)
            byte[] r8 = f22038k
            r13.write(r8)
            ll.j r8 = r12.f22039b
            r13.Y(r8)
            byte[] r8 = f22037j
            r13.write(r8)
            if (r7 == 0) goto L_0x005c
            java.lang.String[] r8 = r7.f22003a
            int r8 = r8.length
            int r8 = r8 / 2
            r9 = r2
        L_0x003c:
            if (r9 >= r8) goto L_0x005c
            java.lang.String r10 = r7.i(r9)
            ll.h r10 = r13.O(r10)
            byte[] r11 = f22036i
            ll.h r10 = r10.write(r11)
            java.lang.String r11 = r7.m(r9)
            ll.h r10 = r10.O(r11)
            byte[] r11 = f22037j
            r10.write(r11)
            int r9 = r9 + 1
            goto L_0x003c
        L_0x005c:
            okhttp3.MediaType r7 = r6.b()
            if (r7 == 0) goto L_0x0073
            java.lang.String r8 = "Content-Type: "
            ll.h r8 = r13.O(r8)
            java.lang.String r7 = r7.f22029a
            ll.h r7 = r8.O(r7)
            byte[] r8 = f22037j
            r7.write(r8)
        L_0x0073:
            long r7 = r6.a()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x008d
            java.lang.String r9 = "Content-Length: "
            ll.h r9 = r13.O(r9)
            ll.h r9 = r9.K0(r7)
            byte[] r10 = f22037j
            r9.write(r10)
            goto L_0x0096
        L_0x008d:
            if (r14 == 0) goto L_0x0096
            sk.j.c(r0)
            r0.q()
            return r9
        L_0x0096:
            byte[] r9 = f22037j
            r13.write(r9)
            if (r14 == 0) goto L_0x009f
            long r3 = r3 + r7
            goto L_0x00a2
        L_0x009f:
            r6.c(r13)
        L_0x00a2:
            r13.write(r9)
            int r5 = r5 + 1
            goto L_0x0014
        L_0x00a9:
            sk.j.c(r13)
            byte[] r1 = f22038k
            r13.write(r1)
            ll.j r2 = r12.f22039b
            r13.Y(r2)
            r13.write(r1)
            byte[] r1 = f22037j
            r13.write(r1)
            if (r14 == 0) goto L_0x00c9
            sk.j.c(r0)
            long r13 = r0.f20878b
            long r3 = r3 + r13
            r0.q()
        L_0x00c9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartBody.d(ll.h, boolean):long");
    }
}
