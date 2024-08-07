package f;

import g.a;

/* compiled from: ActivityResultRegistry */
public final class d extends b<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f9497a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f9498b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f9499c;

    public d(f fVar, String str, a aVar) {
        this.f9499c = fVar;
        this.f9497a = str;
        this.f9498b = aVar;
    }

    public final void a(Object obj) {
        Integer num = (Integer) this.f9499c.f9504b.get(this.f9497a);
        if (num != null) {
            this.f9499c.f9506d.add(this.f9497a);
            try {
                this.f9499c.b(num.intValue(), this.f9498b, obj);
            } catch (Exception e10) {
                this.f9499c.f9506d.remove(this.f9497a);
                throw e10;
            }
        } else {
            StringBuilder q10 = android.support.v4.media.a.q("Attempting to launch an unregistered ActivityResultLauncher with contract ");
            q10.append(this.f9498b);
            q10.append(" and input ");
            q10.append(obj);
            q10.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
            throw new IllegalStateException(q10.toString());
        }
    }

    public final void b() {
        this.f9499c.f(this.f9497a);
    }
}
