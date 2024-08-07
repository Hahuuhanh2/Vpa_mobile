package ua;

import java.io.Writer;

/* compiled from: JsonDataEncoderBuilder */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f15406a;

    public d(e eVar) {
        this.f15406a = eVar;
    }

    public final void a(Object obj, Writer writer) {
        e eVar = this.f15406a;
        f fVar = new f(writer, eVar.f15411a, eVar.f15412b, eVar.f15413c, eVar.f15414d);
        fVar.a(obj);
        fVar.c();
        fVar.f15417b.flush();
    }
}
