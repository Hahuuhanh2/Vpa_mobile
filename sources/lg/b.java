package lg;

import android.content.SharedPreferences;
import bc.h;
import com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard;
import com.vpa.daugia.module.auth.data.model.User;
import sk.e;
import sk.j;

/* compiled from: SharedPrefsHelper.kt */
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f20850a;

    public b(SharedPreferences sharedPreferences) {
        j.f(sharedPreferences, "mSharedPreferences");
        this.f20850a = sharedPreferences;
    }

    public final String a() {
        return d("PREF_KEY_ACCESS_TOKEN");
    }

    public final Object b(Class cls, String str) {
        j.f(cls, "classOfT");
        try {
            h hVar = new h();
            SharedPreferences sharedPreferences = this.f20850a;
            return hVar.d(cls, sharedPreferences.getString("PREF_ANY_" + str, (String) null));
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final String c() {
        return d("FCM_TOKEN");
    }

    public final String d(String str) {
        boolean z10;
        String string = this.f20850a.getString(str, "");
        if (string == null || string.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return "";
        }
        return string;
    }

    public final User e() {
        boolean z10;
        String string = this.f20850a.getString("pref_user", (String) null);
        if (string == null || string.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new User((Integer) null, (String) null, (Object) null, (String) null, (String) null, (String) null, (String) null, (ContactPersonIdentityCard) null, (Object) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ContactPersonIdentityCard) null, (ContactPersonIdentityCard) null, (String) null, (String) null, (String) null, (Object) null, (Long) null, (String) null, (Long) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (Integer) null, (String) null, (Object) null, (String) null, (Integer) null, (Object) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 8191, (e) null);
        }
        return (User) new h().d(User.class, string);
    }

    public final void f() {
        this.f20850a.edit().remove("PREF_ANY_LAST_NOTIFICATION").commit();
        int i10 = kf.h.f12560a;
    }

    public final void g(User user) {
        j.f(user, "user");
        this.f20850a.edit().putString("pref_user", new h().i(user)).apply();
    }

    public final void h(String str) {
        this.f20850a.edit().putString("PREF_KEY_ACCESS_TOKEN", str).apply();
    }

    public final void i(String str) {
        this.f20850a.edit().putString("PREF_KEY_AUCTION_ACCESS_TOKEN", str).apply();
    }

    public final void j(Object obj, String str) {
        j.f(obj, "data");
        String str2 = new h().i(obj).toString();
        SharedPreferences.Editor edit = this.f20850a.edit();
        edit.putString("PREF_ANY_" + str, str2).apply();
    }

    public final void k(String str) {
        j.f(str, "token");
        this.f20850a.edit().putString("PREF_KEY_REFRESH_TOKEN", str).apply();
    }

    public final void l(boolean z10) {
        this.f20850a.edit().putBoolean("PREF_KEY_ACCESS_REMEMBER", z10).apply();
    }
}
