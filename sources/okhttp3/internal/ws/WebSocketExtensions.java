package okhttp3.internal.ws;

import android.support.v4.media.a;
import sk.j;

/* compiled from: WebSocketExtensions.kt */
public final class WebSocketExtensions {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f22614a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f22615b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f22616c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f22617d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f22618e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f22619f;

    /* compiled from: WebSocketExtensions.kt */
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

    public WebSocketExtensions() {
        this(false, (Integer) null, false, (Integer) null, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        return this.f22614a == webSocketExtensions.f22614a && j.a(this.f22615b, webSocketExtensions.f22615b) && this.f22616c == webSocketExtensions.f22616c && j.a(this.f22617d, webSocketExtensions.f22617d) && this.f22618e == webSocketExtensions.f22618e && this.f22619f == webSocketExtensions.f22619f;
    }

    public final int hashCode() {
        boolean z10 = this.f22614a;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int i10 = (z10 ? 1 : 0) * true;
        Integer num = this.f22615b;
        int i11 = 0;
        int hashCode = (i10 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z12 = this.f22616c;
        if (z12) {
            z12 = true;
        }
        int i12 = (hashCode + (z12 ? 1 : 0)) * 31;
        Integer num2 = this.f22617d;
        if (num2 != null) {
            i11 = num2.hashCode();
        }
        int i13 = (i12 + i11) * 31;
        boolean z13 = this.f22618e;
        if (z13) {
            z13 = true;
        }
        int i14 = (i13 + (z13 ? 1 : 0)) * 31;
        boolean z14 = this.f22619f;
        if (!z14) {
            z11 = z14;
        }
        return i14 + (z11 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder q10 = a.q("WebSocketExtensions(perMessageDeflate=");
        q10.append(this.f22614a);
        q10.append(", clientMaxWindowBits=");
        q10.append(this.f22615b);
        q10.append(", clientNoContextTakeover=");
        q10.append(this.f22616c);
        q10.append(", serverMaxWindowBits=");
        q10.append(this.f22617d);
        q10.append(", serverNoContextTakeover=");
        q10.append(this.f22618e);
        q10.append(", unknownValues=");
        q10.append(this.f22619f);
        q10.append(')');
        return q10.toString();
    }

    public WebSocketExtensions(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13) {
        this.f22614a = z10;
        this.f22615b = num;
        this.f22616c = z11;
        this.f22617d = num2;
        this.f22618e = z12;
        this.f22619f = z13;
    }
}
