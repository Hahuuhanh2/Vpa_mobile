package okhttp3.internal.http;

import f0.b0;
import java.net.ProtocolException;
import okhttp3.Protocol;
import sk.j;
import yk.h;

/* compiled from: StatusLine.kt */
public final class StatusLine {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f22332d = new Companion(0);

    /* renamed from: a  reason: collision with root package name */
    public final Protocol f22333a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22334b;

    /* renamed from: c  reason: collision with root package name */
    public final String f22335c;

    /* compiled from: StatusLine.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static StatusLine a(String str) {
            Protocol protocol;
            String str2;
            j.f(str, "statusLine");
            int i10 = 9;
            if (h.L0(str, "HTTP/1.", false)) {
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException(b0.r("Unexpected status line: ", str));
                }
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else if (charAt == 1) {
                    protocol = Protocol.HTTP_1_1;
                } else {
                    throw new ProtocolException(b0.r("Unexpected status line: ", str));
                }
            } else if (h.L0(str, "ICY ", false)) {
                protocol = Protocol.HTTP_1_0;
                i10 = 4;
            } else {
                throw new ProtocolException(b0.r("Unexpected status line: ", str));
            }
            int i11 = i10 + 3;
            if (str.length() >= i11) {
                try {
                    String substring = str.substring(i10, i11);
                    j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (str.length() <= i11) {
                        str2 = "";
                    } else if (str.charAt(i11) == ' ') {
                        str2 = str.substring(i10 + 4);
                        j.e(str2, "this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new ProtocolException(b0.r("Unexpected status line: ", str));
                    }
                    return new StatusLine(protocol, parseInt, str2);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException(b0.r("Unexpected status line: ", str));
                }
            } else {
                throw new ProtocolException(b0.r("Unexpected status line: ", str));
            }
        }
    }

    public StatusLine(Protocol protocol, int i10, String str) {
        j.f(protocol, "protocol");
        j.f(str, "message");
        this.f22333a = protocol;
        this.f22334b = i10;
        this.f22335c = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f22333a == Protocol.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f22334b);
        sb2.append(' ');
        sb2.append(this.f22335c);
        String sb3 = sb2.toString();
        j.e(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
