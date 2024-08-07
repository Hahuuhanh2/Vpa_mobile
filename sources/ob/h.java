package ob;

import java.util.regex.Pattern;
import lb.a;
import mb.d;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import tb.h;

/* compiled from: NetworkRequestMetricBuilderUtil */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f13816a = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    public static Long a(HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
            return null;
        } catch (NumberFormatException unused) {
            a.d().a();
            return null;
        }
    }

    public static String b(HttpResponse httpResponse) {
        String value;
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader == null || (value = firstHeader.getValue()) == null) {
            return null;
        }
        return value;
    }

    public static void c(d dVar) {
        if (!((tb.h) dVar.f13253o.f7906b).g0()) {
            h.a aVar = dVar.f13253o;
            aVar.s();
            tb.h.H((tb.h) aVar.f7906b);
        }
        dVar.e();
    }
}
