package zb;

import al.d0;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import jk.a;
import kk.e;
import kk.i;
import org.json.JSONObject;
import p3.l0;
import rk.p;
import sk.j;
import sk.r;

@e(c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", f = "RemoteSettingsFetcher.kt", l = {68, 70, 73}, m = "invokeSuspend")
/* compiled from: RemoteSettingsFetcher.kt */
public final class d extends i implements p<d0, ik.d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f17920a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f17921b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map<String, String> f17922c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ p<JSONObject, ik.d<? super ek.i>, Object> f17923d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ p<String, ik.d<? super ek.i>, Object> f17924e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(e eVar, Map<String, String> map, p<? super JSONObject, ? super ik.d<? super ek.i>, ? extends Object> pVar, p<? super String, ? super ik.d<? super ek.i>, ? extends Object> pVar2, ik.d<? super d> dVar) {
        super(2, dVar);
        this.f17921b = eVar;
        this.f17922c = map;
        this.f17923d = pVar;
        this.f17924e = pVar2;
    }

    public final ik.d<ek.i> create(Object obj, ik.d<?> dVar) {
        return new d(this.f17921b, this.f17922c, this.f17923d, this.f17924e, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((d0) obj, (ik.d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f17920a;
        if (i10 == 0) {
            l0.Q0(obj);
            URLConnection openConnection = e.b(this.f17921b).openConnection();
            j.d(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
            httpsURLConnection.setRequestMethod("GET");
            httpsURLConnection.setRequestProperty("Accept", "application/json");
            for (Map.Entry next : this.f17922c.entrySet()) {
                httpsURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
            }
            int responseCode = httpsURLConnection.getResponseCode();
            if (responseCode == 200) {
                InputStream inputStream = httpsURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder sb2 = new StringBuilder();
                r rVar = new r();
                while (true) {
                    T readLine = bufferedReader.readLine();
                    rVar.f22931a = readLine;
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                }
                bufferedReader.close();
                inputStream.close();
                JSONObject jSONObject = new JSONObject(sb2.toString());
                p<JSONObject, ik.d<? super ek.i>, Object> pVar = this.f17923d;
                this.f17920a = 1;
                if (pVar.invoke(jSONObject, this) == aVar) {
                    return aVar;
                }
            } else {
                p<String, ik.d<? super ek.i>, Object> pVar2 = this.f17924e;
                String str = "Bad response code: " + responseCode;
                this.f17920a = 2;
                if (pVar2.invoke(str, this) == aVar) {
                    return aVar;
                }
            }
        } else if (i10 == 1 || i10 == 2) {
            try {
                l0.Q0(obj);
            } catch (Exception e10) {
                p<String, ik.d<? super ek.i>, Object> pVar3 = this.f17924e;
                String message = e10.getMessage();
                if (message == null) {
                    message = e10.toString();
                }
                this.f17920a = 3;
                if (pVar3.invoke(message, this) == aVar) {
                    return aVar;
                }
            }
        } else if (i10 == 3) {
            l0.Q0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return ek.i.f20112a;
    }
}
