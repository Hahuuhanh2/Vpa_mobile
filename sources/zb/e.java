package zb;

import android.net.Uri;
import ek.i;
import ik.d;
import ik.f;
import java.net.URL;
import java.util.Map;
import jk.a;
import p3.l0;
import xb.b;
import zb.c;

/* compiled from: RemoteSettingsFetcher.kt */
public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public final b f17925a;

    /* renamed from: b  reason: collision with root package name */
    public final f f17926b;

    /* renamed from: c  reason: collision with root package name */
    public final String f17927c = "firebase-settings.crashlytics.com";

    public e(b bVar, f fVar) {
        this.f17925a = bVar;
        this.f17926b = fVar;
    }

    public static final URL b(e eVar) {
        eVar.getClass();
        return new URL(new Uri.Builder().scheme("https").authority(eVar.f17927c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(eVar.f17925a.f17176a).appendPath("settings").appendQueryParameter("build_version", eVar.f17925a.f17181f.f17174c).appendQueryParameter("display_version", eVar.f17925a.f17181f.f17173b).build().toString());
    }

    public final Object a(Map map, c.b bVar, c.C0252c cVar, c.a aVar) {
        Object V0 = l0.V0(aVar, this.f17926b, new d(this, map, bVar, cVar, (d<? super d>) null));
        if (V0 == a.COROUTINE_SUSPENDED) {
            return V0;
        }
        return i.f20112a;
    }
}
