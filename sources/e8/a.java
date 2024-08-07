package e8;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;
import lc.b;
import t7.h;

/* compiled from: BaseMotionStrategy */
public abstract class a implements g {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9238a;

    /* renamed from: b  reason: collision with root package name */
    public final ExtendedFloatingActionButton f9239b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<Animator.AnimatorListener> f9240c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final b f9241d;

    /* renamed from: e  reason: collision with root package name */
    public h f9242e;

    /* renamed from: f  reason: collision with root package name */
    public h f9243f;

    /* renamed from: e8.a$a  reason: collision with other inner class name */
    /* compiled from: BaseMotionStrategy */
    public class C0099a extends Property<ExtendedFloatingActionButton, Float> {
        public C0099a() {
            super(Float.class, "LABEL_OPACITY_PROPERTY");
        }

        public final Object get(Object obj) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
            float alpha = (((float) Color.alpha(extendedFloatingActionButton.getCurrentTextColor())) / 255.0f) / ((float) Color.alpha(extendedFloatingActionButton.N.getColorForState(extendedFloatingActionButton.getDrawableState(), a.this.f9239b.N.getDefaultColor())));
            LinearInterpolator linearInterpolator = t7.b.f14885a;
            return Float.valueOf((alpha * 1.0f) + 0.0f);
        }

        public final void set(Object obj, Object obj2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
            Float f10 = (Float) obj2;
            int colorForState = extendedFloatingActionButton.N.getColorForState(extendedFloatingActionButton.getDrawableState(), a.this.f9239b.N.getDefaultColor());
            float floatValue = f10.floatValue();
            LinearInterpolator linearInterpolator = t7.b.f14885a;
            ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (((((((float) Color.alpha(colorForState)) / 255.0f) - 0.0f) * floatValue) + 0.0f) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f10.floatValue() == 1.0f) {
                extendedFloatingActionButton.f(extendedFloatingActionButton.N);
            } else {
                extendedFloatingActionButton.f(valueOf);
            }
        }
    }

    public a(ExtendedFloatingActionButton extendedFloatingActionButton, b bVar) {
        this.f9239b = extendedFloatingActionButton;
        this.f9238a = extendedFloatingActionButton.getContext();
        this.f9241d = bVar;
    }

    public void c() {
        this.f9241d.f12907b = null;
    }

    public AnimatorSet g() {
        h hVar = this.f9243f;
        if (hVar == null) {
            if (this.f9242e == null) {
                this.f9242e = h.b(this.f9238a, d());
            }
            hVar = this.f9242e;
            hVar.getClass();
        }
        return h(hVar);
    }

    public final AnimatorSet h(h hVar) {
        ArrayList arrayList = new ArrayList();
        if (hVar.g("opacity")) {
            arrayList.add(hVar.d("opacity", this.f9239b, View.ALPHA));
        }
        if (hVar.g("scale")) {
            arrayList.add(hVar.d("scale", this.f9239b, View.SCALE_Y));
            arrayList.add(hVar.d("scale", this.f9239b, View.SCALE_X));
        }
        if (hVar.g("width")) {
            arrayList.add(hVar.d("width", this.f9239b, ExtendedFloatingActionButton.R));
        }
        if (hVar.g("height")) {
            arrayList.add(hVar.d("height", this.f9239b, ExtendedFloatingActionButton.S));
        }
        if (hVar.g("paddingStart")) {
            arrayList.add(hVar.d("paddingStart", this.f9239b, ExtendedFloatingActionButton.T));
        }
        if (hVar.g("paddingEnd")) {
            arrayList.add(hVar.d("paddingEnd", this.f9239b, ExtendedFloatingActionButton.U));
        }
        if (hVar.g("labelOpacity")) {
            arrayList.add(hVar.d("labelOpacity", this.f9239b, new C0099a()));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        m9.b.R(animatorSet, arrayList);
        return animatorSet;
    }
}
