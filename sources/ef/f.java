package ef;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.app.m;
import com.ots.core.R$style;
import ff.a;
import sk.j;

/* compiled from: BaseDialog.kt */
public final class f extends m {

    /* compiled from: BaseDialog.kt */
    public static class a<B extends a<B>> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f9450a;

        /* renamed from: b  reason: collision with root package name */
        public f f9451b;

        /* renamed from: c  reason: collision with root package name */
        public int f9452c;

        /* renamed from: d  reason: collision with root package name */
        public View f9453d;

        /* renamed from: e  reason: collision with root package name */
        public int f9454e = -2;

        /* renamed from: f  reason: collision with root package name */
        public int f9455f = -2;

        /* renamed from: g  reason: collision with root package name */
        public boolean f9456g = true;

        /* renamed from: h  reason: collision with root package name */
        public int f9457h = -1;

        public a(Context context) {
            j.f(context, "context");
            this.f9450a = context;
        }

        public final void a() {
            f fVar = this.f9451b;
            if (fVar != null) {
                fVar.dismiss();
            }
        }

        public final boolean b() {
            if (this.f9451b != null) {
                return true;
            }
            return false;
        }

        public final void c() {
            f fVar;
            Window window;
            int i10 = a.C0107a.f10212b;
            this.f9457h = i10;
            if (b() && (fVar = this.f9451b) != null && (window = fVar.getWindow()) != null) {
                window.setWindowAnimations(i10);
            }
        }

        public final void d(boolean z10) {
            f fVar;
            this.f9456g = z10;
            if (b() && (fVar = this.f9451b) != null) {
                fVar.setCancelable(z10);
            }
        }

        public final void e(View view) {
            ViewGroup.LayoutParams layoutParams;
            int i10;
            Window window;
            if (view != null) {
                this.f9453d = view;
                if (b()) {
                    f fVar = this.f9451b;
                    if (fVar != null) {
                        fVar.setContentView(view);
                        return;
                    }
                    return;
                }
                View view2 = this.f9453d;
                ViewGroup.LayoutParams layoutParams2 = null;
                if (view2 != null) {
                    layoutParams = view2.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if (layoutParams != null && this.f9454e == -2 && this.f9455f == -2) {
                    g(layoutParams.width);
                    int i11 = layoutParams.height;
                    this.f9455f = i11;
                    if (b()) {
                        f fVar2 = this.f9451b;
                        if (!(fVar2 == null || (window = fVar2.getWindow()) == null)) {
                            WindowManager.LayoutParams attributes = window.getAttributes();
                            if (attributes != null) {
                                attributes.height = i11;
                            }
                            window.setAttributes(attributes);
                        }
                    } else {
                        View view3 = this.f9453d;
                        if (view3 != null) {
                            layoutParams2 = view3.getLayoutParams();
                        }
                        if (layoutParams2 != null) {
                            layoutParams2.height = i11;
                            View view4 = this.f9453d;
                            if (view4 != null) {
                                view4.setLayoutParams(layoutParams2);
                            }
                        }
                    }
                }
                if (this.f9452c == 0) {
                    if (layoutParams instanceof FrameLayout.LayoutParams) {
                        int i12 = ((FrameLayout.LayoutParams) layoutParams).gravity;
                        if (i12 != -1) {
                            f(i12);
                        }
                    } else if ((layoutParams instanceof LinearLayout.LayoutParams) && (i10 = ((LinearLayout.LayoutParams) layoutParams).gravity) != 0) {
                        f(i10);
                    }
                    if (this.f9452c == 0) {
                        f(17);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("are you ok?");
        }

        public final void f(int i10) {
            f fVar;
            Window window;
            this.f9452c = Gravity.getAbsoluteGravity(i10, this.f9450a.getResources().getConfiguration().getLayoutDirection());
            if (b() && (fVar = this.f9451b) != null && (window = fVar.getWindow()) != null) {
                window.setGravity(i10);
            }
        }

        public final void g(int i10) {
            ViewGroup.LayoutParams layoutParams;
            Window window;
            this.f9454e = i10;
            if (b()) {
                f fVar = this.f9451b;
                if (fVar != null && (window = fVar.getWindow()) != null) {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    if (attributes != null) {
                        attributes.width = i10;
                    }
                    window.setAttributes(attributes);
                    return;
                }
                return;
            }
            View view = this.f9453d;
            if (view != null) {
                layoutParams = view.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                layoutParams.width = i10;
                View view2 = this.f9453d;
                if (view2 != null) {
                    view2.setLayoutParams(layoutParams);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x004d  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0054  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0079  */
        /* JADX WARNING: Removed duplicated region for block: B:4:0x0009  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0006 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void h() {
            /*
                r5 = this;
                android.content.Context r0 = r5.f9450a
            L_0x0002:
                boolean r1 = r0 instanceof android.app.Activity
                if (r1 == 0) goto L_0x0009
                android.app.Activity r0 = (android.app.Activity) r0
                goto L_0x0017
            L_0x0009:
                boolean r1 = r0 instanceof android.content.ContextWrapper
                r2 = 0
                if (r1 == 0) goto L_0x0016
                android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
                android.content.Context r0 = r0.getBaseContext()
                if (r0 != 0) goto L_0x0002
            L_0x0016:
                r0 = r2
            L_0x0017:
                if (r0 == 0) goto L_0x00be
                boolean r1 = r0.isFinishing()
                if (r1 != 0) goto L_0x00be
                boolean r0 = r0.isDestroyed()
                if (r0 == 0) goto L_0x0027
                goto L_0x00be
            L_0x0027:
                boolean r0 = r5.b()
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x009e
                android.view.View r0 = r5.f9453d
                if (r0 == 0) goto L_0x0096
                boolean r0 = r5.b()
                if (r0 == 0) goto L_0x004a
                ef.f r0 = r5.f9451b
                if (r0 == 0) goto L_0x0045
                boolean r0 = r0.isShowing()
                if (r0 != r2) goto L_0x0045
                r0 = r2
                goto L_0x0046
            L_0x0045:
                r0 = r1
            L_0x0046:
                if (r0 == 0) goto L_0x004a
                r0 = r2
                goto L_0x004b
            L_0x004a:
                r0 = r1
            L_0x004b:
                if (r0 == 0) goto L_0x0050
                r5.a()
            L_0x0050:
                int r0 = r5.f9452c
                if (r0 != 0) goto L_0x0058
                r0 = 17
                r5.f9452c = r0
            L_0x0058:
                android.content.Context r0 = r5.f9450a
                java.lang.String r3 = "context"
                sk.j.f(r0, r3)
                ef.f r3 = new ef.f
                r3.<init>(r0)
                r5.f9451b = r3
                android.view.View r0 = r5.f9453d
                sk.j.c(r0)
                r3.setContentView((android.view.View) r0)
                boolean r0 = r5.f9456g
                r3.setCancelable(r0)
                android.view.Window r0 = r3.getWindow()
                if (r0 == 0) goto L_0x009e
                android.view.WindowManager$LayoutParams r3 = r0.getAttributes()
                java.lang.String r4 = "getAttributes(...)"
                sk.j.e(r3, r4)
                int r4 = r5.f9454e
                r3.width = r4
                int r4 = r5.f9455f
                r3.height = r4
                int r4 = r5.f9452c
                r3.gravity = r4
                int r4 = r5.f9457h
                r3.windowAnimations = r4
                r0.setAttributes(r3)
                goto L_0x009e
            L_0x0096:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "are you ok?"
                r0.<init>(r1)
                throw r0
            L_0x009e:
                boolean r0 = r5.b()
                if (r0 == 0) goto L_0x00b4
                ef.f r0 = r5.f9451b
                if (r0 == 0) goto L_0x00b0
                boolean r0 = r0.isShowing()
                if (r0 != r2) goto L_0x00b0
                r0 = r2
                goto L_0x00b1
            L_0x00b0:
                r0 = r1
            L_0x00b1:
                if (r0 == 0) goto L_0x00b4
                r1 = r2
            L_0x00b4:
                if (r1 == 0) goto L_0x00b7
                return
            L_0x00b7:
                ef.f r0 = r5.f9451b
                if (r0 == 0) goto L_0x00be
                r0.show()
            L_0x00be:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ef.f.a.h():void");
        }
    }

    public f(Context context) {
        super(context, R$style.BaseDialogTheme);
    }
}
