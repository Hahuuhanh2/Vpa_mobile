package okhttp3.internal.http1;

import ll.i;
import okhttp3.Headers;

/* compiled from: HeadersReader.kt */
public final class HeadersReader {

    /* renamed from: a  reason: collision with root package name */
    public final i f22336a;

    /* renamed from: b  reason: collision with root package name */
    public long f22337b = 262144;

    /* compiled from: HeadersReader.kt */
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

    public HeadersReader(i iVar) {
        this.f22336a = iVar;
    }

    public final Headers a() {
        boolean z10;
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String F = this.f22336a.F(this.f22337b);
            this.f22337b -= (long) F.length();
            if (F.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return builder.d();
            }
            builder.b(F);
        }
    }
}
