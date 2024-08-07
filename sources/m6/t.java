package m6;

import android.content.Context;
import dk.a;
import h6.b;
import m6.f;
import m6.h;

/* compiled from: SchemaManager_Factory */
public final class t implements b<s> {

    /* renamed from: a  reason: collision with root package name */
    public final a<Context> f13179a;

    /* renamed from: b  reason: collision with root package name */
    public final a<String> f13180b;

    /* renamed from: c  reason: collision with root package name */
    public final a<Integer> f13181c;

    public t(a aVar) {
        f fVar = f.a.f13151a;
        h hVar = h.a.f13153a;
        this.f13179a = aVar;
        this.f13180b = fVar;
        this.f13181c = hVar;
    }

    public final Object get() {
        return new s(this.f13181c.get().intValue(), this.f13179a.get(), this.f13180b.get());
    }
}
