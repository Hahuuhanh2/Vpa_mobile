package okhttp3;

import ll.h;

/* compiled from: RequestBody.kt */
public final class RequestBody$Companion$toRequestBody$2 extends RequestBody {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MediaType f22120b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f22121c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ byte[] f22122d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f22123e;

    public RequestBody$Companion$toRequestBody$2(MediaType mediaType, byte[] bArr, int i10, int i11) {
        this.f22120b = mediaType;
        this.f22121c = i10;
        this.f22122d = bArr;
        this.f22123e = i11;
    }

    public final long a() {
        return (long) this.f22121c;
    }

    public final MediaType b() {
        return this.f22120b;
    }

    public final void c(h hVar) {
        hVar.write(this.f22122d, this.f22123e, this.f22121c);
    }
}
