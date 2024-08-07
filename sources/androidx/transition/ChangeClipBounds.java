package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import i3.p;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

public class ChangeClipBounds extends Transition {
    public static final String[] F = {"android:clipBounds:clip"};

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f3410a;

        public a(View view) {
            this.f3410a = view;
        }

        public final void onAnimationEnd(Animator animator) {
            View view = this.f3410a;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.f.c(view, (Rect) null);
        }
    }

    public ChangeClipBounds() {
        throw null;
    }

    public ChangeClipBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void L(p pVar) {
        View view = pVar.f11063b;
        if (view.getVisibility() != 8) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            Rect a10 = d0.f.a(view);
            pVar.f11062a.put("android:clipBounds:clip", a10);
            if (a10 == null) {
                pVar.f11062a.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
            }
        }
    }

    public final void e(p pVar) {
        L(pVar);
    }

    public final void j(p pVar) {
        L(pVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: android.graphics.Rect} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: android.graphics.Rect} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator n(android.view.ViewGroup r8, i3.p r9, i3.p r10) {
        /*
            r7 = this;
            r8 = 0
            if (r9 == 0) goto L_0x0080
            if (r10 == 0) goto L_0x0080
            java.util.HashMap r0 = r9.f11062a
            java.lang.String r1 = "android:clipBounds:clip"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0080
            java.util.HashMap r0 = r10.f11062a
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x0018
            goto L_0x0080
        L_0x0018:
            java.util.HashMap r0 = r9.f11062a
            java.lang.Object r0 = r0.get(r1)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            java.util.HashMap r2 = r10.f11062a
            java.lang.Object r1 = r2.get(r1)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x002e
            r4 = r2
            goto L_0x002f
        L_0x002e:
            r4 = r3
        L_0x002f:
            if (r0 != 0) goto L_0x0034
            if (r1 != 0) goto L_0x0034
            return r8
        L_0x0034:
            java.lang.String r5 = "android:clipBounds:bounds"
            if (r0 != 0) goto L_0x0042
            java.util.HashMap r9 = r9.f11062a
            java.lang.Object r9 = r9.get(r5)
            r0 = r9
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            goto L_0x004d
        L_0x0042:
            if (r1 != 0) goto L_0x004d
            java.util.HashMap r9 = r10.f11062a
            java.lang.Object r9 = r9.get(r5)
            r1 = r9
            android.graphics.Rect r1 = (android.graphics.Rect) r1
        L_0x004d:
            boolean r9 = r0.equals(r1)
            if (r9 == 0) goto L_0x0054
            return r8
        L_0x0054:
            android.view.View r8 = r10.f11063b
            java.util.WeakHashMap<android.view.View, w1.q0> r9 = w1.d0.f16298a
            w1.d0.f.c(r8, r0)
            i3.j r8 = new i3.j
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r8.<init>(r9)
            android.view.View r9 = r10.f11063b
            i3.r$b r5 = i3.r.f11070c
            r6 = 2
            android.graphics.Rect[] r6 = new android.graphics.Rect[r6]
            r6[r3] = r0
            r6[r2] = r1
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofObject(r9, r5, r8, r6)
            if (r4 == 0) goto L_0x0080
            android.view.View r9 = r10.f11063b
            androidx.transition.ChangeClipBounds$a r10 = new androidx.transition.ChangeClipBounds$a
            r10.<init>(r9)
            r8.addListener(r10)
        L_0x0080:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeClipBounds.n(android.view.ViewGroup, i3.p, i3.p):android.animation.Animator");
    }

    public final String[] s() {
        return F;
    }
}
