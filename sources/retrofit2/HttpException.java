package retrofit2;

import java.util.Objects;
import okhttp3.Response;
import ul.y;

public class HttpException extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    public final transient y<?> f22764a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HttpException(y<?> yVar) {
        super("HTTP " + yVar.f23246a.f22127d + " " + yVar.f23246a.f22126c);
        Objects.requireNonNull(yVar, "response == null");
        Response response = yVar.f23246a;
        int i10 = response.f22127d;
        String str = response.f22126c;
        this.f22764a = yVar;
    }
}
