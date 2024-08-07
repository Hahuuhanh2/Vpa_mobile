package okhttp3;

import f0.b0;
import java.io.IOException;
import sk.j;

/* compiled from: Protocol.kt */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f22095b = null;

    /* renamed from: a  reason: collision with root package name */
    public final String f22103a;

    /* compiled from: Protocol.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static Protocol a(String str) {
            Protocol protocol = Protocol.HTTP_1_0;
            if (!j.a(str, "http/1.0")) {
                protocol = Protocol.HTTP_1_1;
                if (!j.a(str, "http/1.1")) {
                    protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                    if (!j.a(str, "h2_prior_knowledge")) {
                        protocol = Protocol.HTTP_2;
                        if (!j.a(str, "h2")) {
                            protocol = Protocol.SPDY_3;
                            if (!j.a(str, "spdy/3.1")) {
                                protocol = Protocol.QUIC;
                                if (!j.a(str, "quic")) {
                                    throw new IOException(b0.r("Unexpected protocol: ", str));
                                }
                            }
                        }
                    }
                }
            }
            return protocol;
        }
    }

    /* access modifiers changed from: public */
    static {
        f22095b = new Companion(0);
    }

    /* access modifiers changed from: public */
    Protocol(String str) {
        this.f22103a = str;
    }

    public final String toString() {
        return this.f22103a;
    }
}
