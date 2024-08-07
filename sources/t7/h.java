package t7;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.media.a;
import android.util.Property;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;

/* compiled from: MotionSpec */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final v0.h<String, i> f14897a = new v0.h<>();

    /* renamed from: b  reason: collision with root package name */
    public final v0.h<String, PropertyValuesHolder[]> f14898b = new v0.h<>();

    public static h a(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return b(context, resourceId);
    }

    public static h b(Context context, int i10) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (loadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return c(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i10);
            return null;
        }
    }

    public static h c(ArrayList arrayList) {
        h hVar = new h();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Animator animator = (Animator) arrayList.get(i10);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                hVar.h(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = b.f14886b;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = b.f14887c;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = b.f14888d;
                }
                i iVar = new i(startDelay, duration, interpolator);
                iVar.f14902d = objectAnimator.getRepeatCount();
                iVar.f14903e = objectAnimator.getRepeatMode();
                hVar.f14897a.put(propertyName, iVar);
                i10++;
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return hVar;
    }

    public final ObjectAnimator d(String str, ExtendedFloatingActionButton extendedFloatingActionButton, Property property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(extendedFloatingActionButton, e(str));
        ofPropertyValuesHolder.setProperty(property);
        f(str).a(ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    public final PropertyValuesHolder[] e(String str) {
        if (g(str)) {
            PropertyValuesHolder[] orDefault = this.f14898b.getOrDefault(str, null);
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[orDefault.length];
            for (int i10 = 0; i10 < orDefault.length; i10++) {
                propertyValuesHolderArr[i10] = orDefault[i10].clone();
            }
            return propertyValuesHolderArr;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return this.f14897a.equals(((h) obj).f14897a);
    }

    public final i f(String str) {
        boolean z10;
        if (this.f14897a.getOrDefault(str, null) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return this.f14897a.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public final boolean g(String str) {
        if (this.f14898b.getOrDefault(str, null) != null) {
            return true;
        }
        return false;
    }

    public final void h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f14898b.put(str, propertyValuesHolderArr);
    }

    public final int hashCode() {
        return this.f14897a.hashCode();
    }

    public final String toString() {
        StringBuilder p10 = a.p(10);
        p10.append(h.class.getName());
        p10.append('{');
        p10.append(Integer.toHexString(System.identityHashCode(this)));
        p10.append(" timings: ");
        p10.append(this.f14897a);
        p10.append("}\n");
        return p10.toString();
    }
}
