package yg;

import com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard;
import fk.p;
import java.util.ArrayList;
import sk.j;

/* compiled from: FileItemState.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final ContactPersonIdentityCard f23536a;

    public a(ContactPersonIdentityCard contactPersonIdentityCard) {
        this.f23536a = contactPersonIdentityCard;
    }

    public final String a() {
        Integer num;
        ArrayList<gf.a> files;
        gf.a aVar;
        ArrayList<gf.a> files2;
        ContactPersonIdentityCard contactPersonIdentityCard = this.f23536a;
        if (contactPersonIdentityCard == null || (files2 = contactPersonIdentityCard.getFiles()) == null) {
            num = null;
        } else {
            num = Integer.valueOf(files2.size());
        }
        j.c(num);
        if (num.intValue() <= 1 || (files = this.f23536a.getFiles()) == null || (aVar = (gf.a) p.S0(files)) == null) {
            return null;
        }
        return aVar.a();
    }

    public final String b() {
        ArrayList<gf.a> files;
        gf.a aVar;
        ContactPersonIdentityCard contactPersonIdentityCard = this.f23536a;
        if (contactPersonIdentityCard == null || (files = contactPersonIdentityCard.getFiles()) == null || (aVar = (gf.a) p.N0(files)) == null) {
            return null;
        }
        return aVar.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && j.a(this.f23536a, ((a) obj).f23536a);
    }

    public final int hashCode() {
        ContactPersonIdentityCard contactPersonIdentityCard = this.f23536a;
        if (contactPersonIdentityCard == null) {
            return 0;
        }
        return contactPersonIdentityCard.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("FileItemState(item=");
        q10.append(this.f23536a);
        q10.append(')');
        return q10.toString();
    }
}
