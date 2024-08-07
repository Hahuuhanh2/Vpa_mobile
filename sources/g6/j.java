package g6;

import android.content.Context;
import dk.a;
import h6.b;
import h6.c;
import o6.b;
import o6.c;

/* compiled from: CreationContextFactory_Factory */
public final class j implements b<i> {

    /* renamed from: a  reason: collision with root package name */
    public final a<Context> f10384a;

    /* renamed from: b  reason: collision with root package name */
    public final a<o6.a> f10385b;

    /* renamed from: c  reason: collision with root package name */
    public final a<o6.a> f10386c;

    public j(c cVar) {
        o6.b bVar = b.a.f13758a;
        o6.c cVar2 = c.a.f13759a;
        this.f10384a = cVar;
        this.f10385b = bVar;
        this.f10386c = cVar2;
    }

    public final Object get() {
        return new i(this.f10384a.get(), this.f10385b.get(), this.f10386c.get());
    }
}
