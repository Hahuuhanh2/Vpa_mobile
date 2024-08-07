package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import w1.t;

/* compiled from: FragmentAnim */
public final class n {
    public static int a(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i10});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* compiled from: FragmentAnim */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f2687a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f2688b;

        public a(Animation animation) {
            this.f2687a = animation;
            this.f2688b = null;
        }

        public a(Animator animator) {
            this.f2687a = null;
            this.f2688b = animator;
        }
    }

    /* compiled from: FragmentAnim */
    public static class b extends AnimationSet implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final ViewGroup f2689a;

        /* renamed from: b  reason: collision with root package name */
        public final View f2690b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2691c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2692d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2693e = true;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f2689a = viewGroup;
            this.f2690b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public final boolean getTransformation(long j10, Transformation transformation) {
            this.f2693e = true;
            if (this.f2691c) {
                return !this.f2692d;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f2691c = true;
                t.a(this.f2689a, this);
            }
            return true;
        }

        public final void run() {
            if (this.f2691c || !this.f2693e) {
                this.f2689a.endViewTransition(this.f2690b);
                this.f2692d = true;
                return;
            }
            this.f2693e = false;
            this.f2689a.post(this);
        }

        public final boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f2693e = true;
            if (this.f2691c) {
                return !this.f2692d;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f2691c = true;
                t.a(this.f2689a, this);
            }
            return true;
        }
    }
}
