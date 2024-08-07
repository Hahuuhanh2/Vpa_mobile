package com.google.android.play.core.integrity;

import android.content.Context;
import s8.g;
import s8.i;
import s8.j;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class s {

    /* renamed from: a  reason: collision with root package name */
    private final s f7298a = this;

    /* renamed from: b  reason: collision with root package name */
    private final j f7299b;

    /* renamed from: c  reason: collision with root package name */
    private final j f7300c;

    /* renamed from: d  reason: collision with root package name */
    private final j f7301d;

    /* renamed from: e  reason: collision with root package name */
    private final j f7302e;

    /* renamed from: f  reason: collision with root package name */
    private final j f7303f;

    public s(Context context, r rVar) {
        if (context != null) {
            i iVar = new i(context);
            this.f7299b = iVar;
            j b10 = g.b(ac.f7189a);
            this.f7300c = b10;
            au auVar = new au(iVar, l.f7291a);
            this.f7301d = auVar;
            j b11 = g.b(new al(iVar, b10, auVar, l.f7291a));
            this.f7302e = b11;
            this.f7303f = g.b(new ab(b11));
            return;
        }
        throw new NullPointerException("instance cannot be null");
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f7303f.a();
    }
}
