package r4;

import android.util.Log;
import com.bumptech.glide.j;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import o5.c;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.RealCall;
import y4.f;

/* compiled from: OkHttpStreamFetcher */
public final class a implements d<InputStream>, Callback {

    /* renamed from: a  reason: collision with root package name */
    public final Call.Factory f14506a;

    /* renamed from: b  reason: collision with root package name */
    public final f f14507b;

    /* renamed from: c  reason: collision with root package name */
    public c f14508c;

    /* renamed from: d  reason: collision with root package name */
    public ResponseBody f14509d;

    /* renamed from: e  reason: collision with root package name */
    public d.a<? super InputStream> f14510e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Call f14511f;

    public a(Call.Factory factory, f fVar) {
        this.f14506a = factory;
        this.f14507b = fVar;
    }

    public final Class<InputStream> a() {
        return InputStream.class;
    }

    public final void b() {
        try {
            c cVar = this.f14508c;
            if (cVar != null) {
                cVar.close();
            }
        } catch (IOException unused) {
        }
        ResponseBody responseBody = this.f14509d;
        if (responseBody != null) {
            responseBody.close();
        }
        this.f14510e = null;
    }

    public final void c(RealCall realCall, Response response) {
        this.f14509d = response.f22130n;
        if (response.i()) {
            ResponseBody responseBody = this.f14509d;
            j7.a.r(responseBody);
            c cVar = new c(this.f14509d.i().O0(), responseBody.d());
            this.f14508c = cVar;
            this.f14510e.f(cVar);
            return;
        }
        this.f14510e.c(new HttpException(response.f22127d, response.f22126c, (IOException) null));
    }

    public final void cancel() {
        Call call = this.f14511f;
        if (call != null) {
            call.cancel();
        }
    }

    public final s4.a d() {
        return s4.a.REMOTE;
    }

    public final void e(j jVar, d.a<? super InputStream> aVar) {
        Request.Builder builder = new Request.Builder();
        builder.e(this.f14507b.d());
        for (Map.Entry next : this.f14507b.f17462b.b().entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) next.getValue();
            sk.j.f(str, "name");
            sk.j.f(str2, "value");
            builder.f22112c.a(str, str2);
        }
        Request a10 = builder.a();
        this.f14510e = aVar;
        this.f14511f = this.f14506a.a(a10);
        this.f14511f.v(this);
    }

    public final void f(RealCall realCall, IOException iOException) {
        Log.isLoggable("OkHttpFetcher", 3);
        this.f14510e.c(iOException);
    }
}
