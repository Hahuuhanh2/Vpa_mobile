package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.R$styleable;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import f0.b0;
import p2.a;

/* compiled from: FragmentLayoutInflaterFactory */
public final class s implements LayoutInflater.Factory2 {

    /* renamed from: a  reason: collision with root package name */
    public final FragmentManager f2701a;

    /* compiled from: FragmentLayoutInflaterFactory */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ z f2702a;

        public a(z zVar) {
            this.f2702a = zVar;
        }

        public final void onViewAttachedToWindow(View view) {
            z zVar = this.f2702a;
            Fragment fragment = zVar.f2721c;
            zVar.k();
            l0.f((ViewGroup) fragment.L.getParent(), s.this.f2701a).e();
        }

        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public s(FragmentManager fragmentManager) {
        this.f2701a = fragmentManager;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        z zVar;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f2701a);
        }
        Activity activity = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Fragment);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(R$styleable.Fragment_android_name);
        }
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.Fragment_android_id, -1);
        String string = obtainStyledAttributes.getString(R$styleable.Fragment_android_tag);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            int i10 = 0;
            try {
                z10 = Fragment.class.isAssignableFrom(q.b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                z10 = false;
            }
            if (z10) {
                if (view != null) {
                    i10 = view.getId();
                }
                if (i10 == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                Fragment C = resourceId != -1 ? this.f2701a.C(resourceId) : null;
                if (C == null && string != null) {
                    C = this.f2701a.D(string);
                }
                if (C == null && i10 != -1) {
                    C = this.f2701a.C(i10);
                }
                if (C == null) {
                    q G = this.f2701a.G();
                    context.getClassLoader();
                    C = G.a(attributeValue);
                    C.f2455t = true;
                    C.C = resourceId != 0 ? resourceId : i10;
                    C.D = i10;
                    C.E = string;
                    C.f2456u = true;
                    FragmentManager fragmentManager = this.f2701a;
                    C.f2460y = fragmentManager;
                    r<?> rVar = fragmentManager.f2504u;
                    C.f2461z = rVar;
                    Context context2 = rVar.f2698c;
                    C.J = true;
                    if (rVar != null) {
                        activity = rVar.f2697b;
                    }
                    if (activity != null) {
                        C.J = true;
                    }
                    zVar = fragmentManager.a(C);
                    if (FragmentManager.J(2)) {
                        C.toString();
                        Integer.toHexString(resourceId);
                    }
                } else if (!C.f2456u) {
                    C.f2456u = true;
                    FragmentManager fragmentManager2 = this.f2701a;
                    C.f2460y = fragmentManager2;
                    r<?> rVar2 = fragmentManager2.f2504u;
                    C.f2461z = rVar2;
                    Context context3 = rVar2.f2698c;
                    C.J = true;
                    if (rVar2 != null) {
                        activity = rVar2.f2697b;
                    }
                    if (activity != null) {
                        C.J = true;
                    }
                    zVar = fragmentManager2.f(C);
                    if (FragmentManager.J(2)) {
                        C.toString();
                        Integer.toHexString(resourceId);
                    }
                } else {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i10) + " with another fragment for " + attributeValue);
                }
                ViewGroup viewGroup = (ViewGroup) view;
                a.c cVar = p2.a.f13907a;
                FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(C, viewGroup);
                p2.a.c(fragmentTagUsageViolation);
                a.c a10 = p2.a.a(C);
                if (a10.f13916a.contains(a.C0176a.DETECT_FRAGMENT_TAG_USAGE) && p2.a.f(a10, C.getClass(), FragmentTagUsageViolation.class)) {
                    p2.a.b(a10, fragmentTagUsageViolation);
                }
                C.K = viewGroup;
                zVar.k();
                zVar.j();
                View view2 = C.L;
                if (view2 != null) {
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (C.L.getTag() == null) {
                        C.L.setTag(string);
                    }
                    C.L.addOnAttachStateChangeListener(new a(zVar));
                    return C.L;
                }
                throw new IllegalStateException(b0.s("Fragment ", attributeValue, " did not create a view."));
            }
        }
        return null;
    }
}
