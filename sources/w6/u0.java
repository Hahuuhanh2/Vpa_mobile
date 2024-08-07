package w6;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;
import org.json.JSONException;
import q7.b;
import q7.e;
import q7.f;
import r7.c;
import y6.a;
import y6.j;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class u0 extends c implements c.a, c.b {

    /* renamed from: k  reason: collision with root package name */
    public static final b f16660k = e.f14372a;

    /* renamed from: a  reason: collision with root package name */
    public final Context f16661a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f16662b;

    /* renamed from: c  reason: collision with root package name */
    public final b f16663c;

    /* renamed from: d  reason: collision with root package name */
    public final Set f16664d;

    /* renamed from: e  reason: collision with root package name */
    public final y6.b f16665e;

    /* renamed from: f  reason: collision with root package name */
    public f f16666f;

    /* renamed from: j  reason: collision with root package name */
    public t0 f16667j;

    public u0(Context context, Handler handler, y6.b bVar) {
        b bVar2 = f16660k;
        this.f16661a = context;
        this.f16662b = handler;
        this.f16665e = bVar;
        this.f16664d = bVar.f17535b;
        this.f16663c = bVar2;
    }

    public final void m(int i10) {
        ((a) this.f16666f).disconnect();
    }

    public final void o() {
        GoogleSignInAccount googleSignInAccount;
        r7.a aVar = (r7.a) this.f16666f;
        aVar.getClass();
        try {
            Account account = aVar.f14517b.f17534a;
            if (account == null) {
                account = new Account(a.DEFAULT_ACCOUNT, "com.google");
            }
            if (a.DEFAULT_ACCOUNT.equals(account.name)) {
                s6.a a10 = s6.a.a(aVar.getContext());
                String b10 = a10.b("defaultGoogleSignInAccount");
                if (!TextUtils.isEmpty(b10)) {
                    String b11 = a10.b("googleSignInAccount" + ":" + b10);
                    if (b11 != null) {
                        try {
                            googleSignInAccount = GoogleSignInAccount.Q0(b11);
                        } catch (JSONException unused) {
                        }
                        Integer num = aVar.f14519d;
                        j.f(num);
                        zat zat = new zat(2, account, num.intValue(), googleSignInAccount);
                        r7.e eVar = (r7.e) aVar.getService();
                        zai zai = new zai(1, zat);
                        Parcel zaa = eVar.zaa();
                        zac.zad(zaa, zai);
                        zac.zae(zaa, this);
                        eVar.zac(12, zaa);
                    }
                }
            }
            googleSignInAccount = null;
            Integer num2 = aVar.f14519d;
            j.f(num2);
            zat zat2 = new zat(2, account, num2.intValue(), googleSignInAccount);
            r7.e eVar2 = (r7.e) aVar.getService();
            zai zai2 = new zai(1, zat2);
            Parcel zaa2 = eVar2.zaa();
            zac.zad(zaa2, zai2);
            zac.zae(zaa2, this);
            eVar2.zac(12, zaa2);
        } catch (RemoteException e10) {
            try {
                this.f16662b.post(new i0(this, new zak(1, new ConnectionResult(8, (PendingIntent) null), (zav) null)));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    public final void r(ConnectionResult connectionResult) {
        ((e0) this.f16667j).b(connectionResult);
    }
}
