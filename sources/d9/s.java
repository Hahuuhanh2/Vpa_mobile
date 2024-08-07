package d9;

import i9.i0;
import i9.y;
import j9.c;
import java.security.GeneralSecurityException;
import l9.a;

/* compiled from: ProtoKeySerialization */
public final class s implements u {

    /* renamed from: a  reason: collision with root package name */
    public final String f8805a;

    /* renamed from: b  reason: collision with root package name */
    public final a f8806b;

    /* renamed from: c  reason: collision with root package name */
    public final c f8807c;

    /* renamed from: d  reason: collision with root package name */
    public final y.b f8808d;

    /* renamed from: e  reason: collision with root package name */
    public final i0 f8809e;

    /* renamed from: f  reason: collision with root package name */
    public final Integer f8810f;

    public s(String str, c cVar, y.b bVar, i0 i0Var, Integer num) {
        this.f8805a = str;
        this.f8806b = w.b(str);
        this.f8807c = cVar;
        this.f8808d = bVar;
        this.f8809e = i0Var;
        this.f8810f = num;
    }

    public static s a(String str, c cVar, y.b bVar, i0 i0Var, Integer num) {
        if (i0Var == i0.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new s(str, cVar, bVar, i0Var, num);
    }
}
