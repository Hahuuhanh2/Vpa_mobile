package rh;

import android.content.Context;
import android.support.v4.media.a;
import com.vpa.daugia.module.auth.data.model.AccountType;
import com.vpa.daugia.module.auth.data.model.User;
import lg.b;
import sk.j;

/* compiled from: ProfileState.kt */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f22792a;

    /* renamed from: b  reason: collision with root package name */
    public User f22793b;

    /* renamed from: c  reason: collision with root package name */
    public b f22794c;

    public f(Context context, User user, b bVar) {
        j.f(user, "data");
        this.f22792a = context;
        this.f22793b = user;
        this.f22794c = bVar;
    }

    public final String a() {
        Integer accountType = this.f22793b.getAccountType();
        int value = AccountType.PERSON.getValue();
        if (accountType != null && accountType.intValue() == value) {
            return this.f22793b.getFullname();
        }
        return this.f22793b.getCompanyName();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return j.a(this.f22792a, fVar.f22792a) && j.a(this.f22793b, fVar.f22793b) && j.a(this.f22794c, fVar.f22794c);
    }

    public final int hashCode() {
        int hashCode = this.f22793b.hashCode();
        return this.f22794c.hashCode() + ((hashCode + (this.f22792a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder q10 = a.q("ProfileState(context=");
        q10.append(this.f22792a);
        q10.append(", data=");
        q10.append(this.f22793b);
        q10.append(", sharedPrefsHelper=");
        q10.append(this.f22794c);
        q10.append(')');
        return q10.toString();
    }
}
