package f;

import g.a;

/* compiled from: ActivityResultRegistry */
public final class e extends b<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f9500a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f9501b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f9502c;

    public e(f fVar, String str, a aVar) {
        this.f9502c = fVar;
        this.f9500a = str;
        this.f9501b = aVar;
    }

    public final void a(Object obj) {
        Integer num = (Integer) this.f9502c.f9504b.get(this.f9500a);
        if (num != null) {
            this.f9502c.f9506d.add(this.f9500a);
            try {
                this.f9502c.b(num.intValue(), this.f9501b, obj);
            } catch (Exception e10) {
                this.f9502c.f9506d.remove(this.f9500a);
                throw e10;
            }
        } else {
            StringBuilder q10 = android.support.v4.media.a.q("Attempting to launch an unregistered ActivityResultLauncher with contract ");
            q10.append(this.f9501b);
            q10.append(" and input ");
            q10.append(obj);
            q10.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
            throw new IllegalStateException(q10.toString());
        }
    }

    public final void b() {
        this.f9502c.f(this.f9500a);
    }
}