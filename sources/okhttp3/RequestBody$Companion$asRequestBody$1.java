package okhttp3;

import java.io.File;

/* compiled from: RequestBody.kt */
public final class RequestBody$Companion$asRequestBody$1 extends RequestBody {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MediaType f22116b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ File f22117c;

    public RequestBody$Companion$asRequestBody$1(File file, MediaType mediaType) {
        this.f22116b = mediaType;
        this.f22117c = file;
    }

    public final long a() {
        return this.f22117c.length();
    }

    public final MediaType b() {
        return this.f22116b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        p3.l0.u(r1, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(ll.h r4) {
        /*
            r3 = this;
            java.io.File r0 = r3.f22117c
            java.util.logging.Logger r1 = ll.r.f20900a
            java.lang.String r1 = "<this>"
            sk.j.f(r0, r1)
            ll.q r1 = new ll.q
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r0)
            ll.d0$a r0 = ll.d0.f20871d
            r1.<init>(r2, r0)
            r4.E0(r1)     // Catch:{ all -> 0x001d }
            r4 = 0
            p3.l0.u(r1, r4)
            return
        L_0x001d:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x001f }
        L_0x001f:
            r0 = move-exception
            p3.l0.u(r1, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody$Companion$asRequestBody$1.c(ll.h):void");
    }
}
