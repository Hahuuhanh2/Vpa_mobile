package og;

import al.a0;
import al.e0;
import al.r0;
import android.content.Context;
import bc.h;
import com.vpa.daugia.C0540R$string;
import ef.k;
import fl.m;
import ik.d;
import j7.a;
import java.nio.charset.Charset;
import lg.b;
import ll.f;
import ll.i;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.RealInterceptorChain;
import p3.l0;
import sk.j;
import yk.l;

/* compiled from: ApiModule.kt */
public final class c implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f21789a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f21790b;

    public c(Context context, b bVar) {
        this.f21789a = context;
        this.f21790b = bVar;
    }

    public final Response a(RealInterceptorChain realInterceptorChain) {
        i iVar;
        f fVar;
        Request request = realInterceptorChain.f22322e;
        try {
            Response c10 = realInterceptorChain.c(request);
            int i10 = c10.f22127d;
            if (i10 == 401) {
                if (!l.N0(request.f22104a.b(), "user/get-profile") && !l.N0(request.f22104a.b(), "api/customer/get-profile")) {
                    if (!l.N0(request.f22104a.b(), "phong-dau-gia")) {
                        gl.c cVar = r0.f19084a;
                        l0.j0(e0.a(m.f20254a), (a0) null, new a(this.f21789a, this.f21790b, (d<? super a>) null), 3);
                        return c10;
                    }
                }
                Response.Builder builder = new Response.Builder();
                builder.f22138a = request;
                builder.f22139b = Protocol.HTTP_2;
                builder.f22140c = 200;
                builder.f22141d = "Vui lòng đăng nhập lại phòng đấu";
                ResponseBody.Companion companion = ResponseBody.f22151b;
                String i11 = new h().i(new k(true, 401, a.e("Vui lòng đăng nhập lại phòng đấu"), 100));
                j.e(i11, "toJson(...)");
                companion.getClass();
                builder.f22144g = ResponseBody.Companion.a(i11, (MediaType) null);
                return builder.a();
            }
            if (i10 != 200) {
                ResponseBody responseBody = c10.f22130n;
                if (responseBody != null) {
                    iVar = responseBody.i();
                } else {
                    iVar = null;
                }
                if (iVar != null) {
                    iVar.i0(Long.MAX_VALUE);
                }
                if (iVar != null) {
                    fVar = iVar.a();
                } else {
                    fVar = null;
                }
                if (fVar != null) {
                    f s10 = fVar.clone();
                    Charset forName = Charset.forName("UTF-8");
                    j.e(forName, "forName(...)");
                    s10.S(s10.f20878b, forName);
                }
                gl.c cVar2 = r0.f19084a;
                l0.j0(e0.a(m.f20254a), (a0) null, new b((d<? super b>) null), 3);
            }
            return c10;
        } catch (Exception e10) {
            Response.Builder builder2 = new Response.Builder();
            j.f(request, "request");
            builder2.f22138a = request;
            builder2.f22139b = Protocol.HTTP_2;
            builder2.f22140c = 999;
            String string = this.f21789a.getString(C0540R$string.cannot_connect_server);
            j.e(string, "getString(...)");
            builder2.f22141d = string;
            ResponseBody.Companion companion2 = ResponseBody.f22151b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append('{');
            sb2.append(e10);
            sb2.append('}');
            String sb3 = sb2.toString();
            companion2.getClass();
            builder2.f22144g = ResponseBody.Companion.a(sb3, (MediaType) null);
            return builder2.a();
        }
    }
}
