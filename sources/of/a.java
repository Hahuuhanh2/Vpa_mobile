package of;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.databinding.DataBinderMapperImpl;
import com.google.android.material.R$id;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.ots.core.R$color;
import com.ots.core.R$drawable;
import com.ots.core.R$layout;
import d2.f;
import d2.l;
import hf.v;
import n1.e;
import sk.j;
import w1.d0;
import w1.w0;

/* compiled from: BaseSnackBar.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final View f13871a;

    /* renamed from: of.a$a  reason: collision with other inner class name */
    /* compiled from: BaseSnackBar.kt */
    public static final class C0172a implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public float f13872a;

        /* renamed from: b  reason: collision with root package name */
        public float f13873b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f13874c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Snackbar.SnackbarLayout f13875d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ a f13876e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Snackbar f13877f;

        /* renamed from: of.a$a$a  reason: collision with other inner class name */
        /* compiled from: BaseSnackBar.kt */
        public static final class C0173a implements Animator.AnimatorListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Snackbar f13878a;

            public C0173a(Snackbar snackbar) {
                this.f13878a = snackbar;
            }

            public final void onAnimationCancel(Animator animator) {
                j.f(animator, "animation");
            }

            public final void onAnimationEnd(Animator animator) {
                j.f(animator, "animation");
                this.f13878a.b(3);
            }

            public final void onAnimationRepeat(Animator animator) {
                j.f(animator, "animation");
            }

            public final void onAnimationStart(Animator animator) {
                j.f(animator, "animation");
            }
        }

        /* renamed from: of.a$a$b */
        /* compiled from: BaseSnackBar.kt */
        public static final class b implements Animator.AnimatorListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Snackbar.SnackbarLayout f13879a;

            public b(Snackbar.SnackbarLayout snackbarLayout) {
                this.f13879a = snackbarLayout;
            }

            public final void onAnimationCancel(Animator animator) {
                j.f(animator, "animation");
            }

            public final void onAnimationEnd(Animator animator) {
                j.f(animator, "animation");
                this.f13879a.setAlpha(1.0f);
                this.f13879a.setElevation(0.0f);
            }

            public final void onAnimationRepeat(Animator animator) {
                j.f(animator, "animation");
            }

            public final void onAnimationStart(Animator animator) {
                j.f(animator, "animation");
            }
        }

        public C0172a(Snackbar.SnackbarLayout snackbarLayout, a aVar, Snackbar snackbar) {
            this.f13875d = snackbarLayout;
            this.f13876e = aVar;
            this.f13877f = snackbar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            j.f(view, "v");
            j.f(motionEvent, "event");
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f13872a = motionEvent.getRawX();
                this.f13873b = motionEvent.getRawY();
                this.f13874c = false;
            } else if (action != 1) {
                if (action == 2) {
                    float rawX = motionEvent.getRawX() - this.f13872a;
                    if (Math.abs(rawX) > Math.abs(motionEvent.getRawY() - this.f13873b) && Math.abs(rawX) > 10.0f) {
                        this.f13874c = true;
                    }
                    if (this.f13874c) {
                        this.f13875d.setTranslationX(rawX);
                        this.f13875d.setAlpha(((float) 1) - (Math.abs(rawX) / ((float) this.f13875d.getWidth())));
                        Snackbar.SnackbarLayout snackbarLayout = this.f13875d;
                        a aVar = this.f13876e;
                        Context context = aVar.f13871a.getContext();
                        j.e(context, "getContext(...)");
                        aVar.getClass();
                        snackbarLayout.setElevation((float) ((int) (((float) 8) * context.getResources().getDisplayMetrics().density)));
                    }
                }
            } else if (this.f13874c) {
                if (Math.abs(motionEvent.getRawX() - this.f13872a) > ((float) (this.f13875d.getWidth() / 4))) {
                    Snackbar.SnackbarLayout snackbarLayout2 = this.f13875d;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(snackbarLayout2, "translationX", new float[]{(float) snackbarLayout2.getWidth()});
                    ofFloat.setDuration(200);
                    ofFloat.addListener(new C0173a(this.f13877f));
                    ofFloat.start();
                } else {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f13875d, "translationX", new float[]{0.0f});
                    ofFloat2.setDuration(200);
                    ofFloat2.addListener(new b(this.f13875d));
                    ofFloat2.start();
                }
            }
            return true;
        }
    }

    public a(View view) {
        this.f13871a = view;
    }

    @SuppressLint({"RestrictedApi", "ClickableViewAccessibility"})
    public final void a(String str, b bVar) {
        int i10;
        j.f(bVar, "state");
        LayoutInflater from = LayoutInflater.from(this.f13871a.getContext());
        int i11 = v.B;
        DataBinderMapperImpl dataBinderMapperImpl = f.f8544a;
        e eVar = null;
        v vVar = (v) l.l(from, R$layout.snackbar_base, (ViewGroup) null, (Object) null);
        j.e(vVar, "inflate(...)");
        vVar.f10818z.setText(str);
        Snackbar i12 = Snackbar.i(this.f13871a, "");
        BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout = i12.f6818i;
        j.d(snackbarBaseLayout, "null cannot be cast to non-null type com.google.android.material.snackbar.Snackbar.SnackbarLayout");
        Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) snackbarBaseLayout;
        ((TextView) snackbarLayout.findViewById(R$id.snackbar_text)).setVisibility(4);
        ((TextView) snackbarLayout.findViewById(R$id.snackbar_action)).setVisibility(4);
        snackbarLayout.addView(vVar.f8554e, 0);
        snackbarLayout.setBackgroundResource(R$color.transparent);
        ViewGroup.LayoutParams layoutParams = i12.f6818i.getLayoutParams();
        j.d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 48;
        w0 a10 = d0.j.a(this.f13871a);
        if (a10 != null) {
            eVar = a10.a(7);
        }
        if (eVar != null) {
            i10 = eVar.f13428b;
        } else {
            i10 = 0;
        }
        Context context = this.f13871a.getContext();
        j.e(context, "getContext(...)");
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843499});
        j.e(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int dimension = (int) obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
        if (i10 <= 0) {
            i10 = dimension;
        }
        layoutParams2.setMargins(0, i10, 0, 0);
        i12.f6818i.setLayoutParams(layoutParams2);
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            vVar.A.setText("Thành công");
            vVar.f10816x.setImageResource(R$drawable.ic_succes_snack_bar);
            vVar.f10815w.setBackgroundResource(R$drawable.bg_success_snack_bar);
            vVar.f10817y.setBackgroundResource(R$drawable.ic_line_success_snack_bar);
        } else if (ordinal == 1) {
            vVar.A.setText("Cảnh báo");
            vVar.f10816x.setImageResource(R$drawable.ic_warning_base);
            vVar.f10815w.setBackgroundResource(R$drawable.bg_warning_snack_bar);
            vVar.f10817y.setBackgroundResource(R$drawable.ic_line_warning_snack_bar);
        } else if (ordinal == 2) {
            vVar.A.setText("Thông báo");
            vVar.f10816x.setImageResource(R$drawable.ic_error_snack_bar);
            vVar.f10815w.setBackgroundResource(R$drawable.bg_error_snack_bar);
            vVar.f10817y.setBackgroundResource(R$drawable.ic_line_error_snack_bar);
        }
        snackbarLayout.setOnTouchListener(new C0172a(snackbarLayout, this, i12));
        i12.j();
    }
}
