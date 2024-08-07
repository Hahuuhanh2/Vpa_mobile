package com.google.android.play.core.integrity;

import android.content.Context;
import s8.g;
import s8.i;
import s8.j;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class w implements aw {

    /* renamed from: a  reason: collision with root package name */
    private final w f7305a = this;

    /* renamed from: b  reason: collision with root package name */
    private final j f7306b;

    /* renamed from: c  reason: collision with root package name */
    private final j f7307c;

    /* renamed from: d  reason: collision with root package name */
    private final j f7308d;

    /* renamed from: e  reason: collision with root package name */
    private final j f7309e;

    /* renamed from: f  reason: collision with root package name */
    private final j f7310f;

    /* renamed from: g  reason: collision with root package name */
    private final j f7311g;

    public w(Context context, v vVar) {
        if (context != null) {
            i iVar = new i(context);
            this.f7306b = iVar;
            j b10 = g.b(bb.f7242a);
            this.f7307c = b10;
            au auVar = new au(iVar, n.f7296a);
            this.f7308d = auVar;
            j b11 = g.b(new bp(iVar, b10, auVar, n.f7296a));
            this.f7309e = b11;
            j b12 = g.b(new bu(b11));
            this.f7310f = b12;
            this.f7311g = g.b(new ba(b11, b12));
            return;
        }
        throw new NullPointerException("instance cannot be null");
    }

    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f7311g.a();
    }
}
