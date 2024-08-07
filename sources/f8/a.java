package f8;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import com.google.android.material.R$attr;
import d.b;

/* compiled from: MaterialBackAnimationHelper */
public abstract class a<V extends View> {

    /* renamed from: a  reason: collision with root package name */
    public final TimeInterpolator f10040a;

    /* renamed from: b  reason: collision with root package name */
    public final V f10041b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10042c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10043d;

    /* renamed from: e  reason: collision with root package name */
    public final int f10044e;

    /* renamed from: f  reason: collision with root package name */
    public b f10045f;

    public a(V v2) {
        this.f10041b = v2;
        Context context = v2.getContext();
        this.f10040a = j.d(context, R$attr.motionEasingStandardDecelerateInterpolator, y1.a.b(0.0f, 0.0f, 0.0f, 1.0f));
        this.f10042c = j.c(context, R$attr.motionDurationMedium2, 300);
        this.f10043d = j.c(context, R$attr.motionDurationShort3, 150);
        this.f10044e = j.c(context, R$attr.motionDurationShort2, 100);
    }
}
