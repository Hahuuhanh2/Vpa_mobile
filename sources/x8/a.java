package x8;

import d9.j;
import d9.m;
import e9.k;
import i9.j0;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import w8.q;

/* compiled from: AeadConfig */
public final class a {
    static {
        new d();
        new k();
        new o();
        new g();
        new v();
        new x();
        new s();
        new z();
        int i10 = j0.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() {
        boolean z10;
        q.g(c.f17097b);
        k.a();
        q.e(new d(), true);
        q.e(new k(), true);
        m mVar = m.f17131a;
        j jVar = j.f8789b;
        jVar.e(m.f17131a);
        jVar.d(m.f17132b);
        jVar.c(m.f17133c);
        jVar.b(m.f17134d);
        if (!a9.a.a()) {
            q.e(new g(), true);
            jVar.e(i.f17115a);
            jVar.d(i.f17116b);
            jVar.c(i.f17117c);
            jVar.b(i.f17118d);
            try {
                Cipher.getInstance("AES/GCM-SIV/NoPadding");
                z10 = true;
            } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
                z10 = false;
            }
            if (z10) {
                q.e(new o(), true);
                m mVar2 = q.f17145a;
                j jVar2 = j.f8789b;
                jVar2.e(q.f17145a);
                jVar2.d(q.f17146b);
                jVar2.c(q.f17147c);
                jVar2.b(q.f17148d);
            }
            q.e(new s(), true);
            m mVar3 = u.f17154a;
            j jVar3 = j.f8789b;
            jVar3.e(u.f17154a);
            jVar3.d(u.f17155b);
            jVar3.c(u.f17156c);
            jVar3.b(u.f17157d);
            q.e(new v(), true);
            q.e(new x(), true);
            q.e(new z(), true);
            jVar3.e(b0.f17092a);
            jVar3.d(b0.f17093b);
            jVar3.c(b0.f17094c);
            jVar3.b(b0.f17095d);
        }
    }
}
