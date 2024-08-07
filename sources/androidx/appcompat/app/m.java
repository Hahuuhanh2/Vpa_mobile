package androidx.appcompat.app;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.q;
import d.j;
import w1.f;

/* compiled from: AppCompatDialog */
public class m extends j implements e {

    /* renamed from: d  reason: collision with root package name */
    public AppCompatDelegateImpl f444d;

    /* renamed from: e  reason: collision with root package name */
    public final l f445e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            if (r6 != 0) goto L_0x0014
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r2 = r5.getTheme()
            int r3 = androidx.appcompat.R$attr.dialogTheme
            r2.resolveAttribute(r3, r1, r0)
            int r1 = r1.resourceId
            goto L_0x0015
        L_0x0014:
            r1 = r6
        L_0x0015:
            r4.<init>(r5, r1)
            androidx.appcompat.app.l r1 = new androidx.appcompat.app.l
            r1.<init>(r4)
            r4.f445e = r1
            androidx.appcompat.app.f r1 = r4.d()
            if (r6 != 0) goto L_0x0035
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            int r2 = androidx.appcompat.R$attr.dialogTheme
            r5.resolveAttribute(r2, r6, r0)
            int r6 = r6.resourceId
        L_0x0035:
            r5 = r1
            androidx.appcompat.app.AppCompatDelegateImpl r5 = (androidx.appcompat.app.AppCompatDelegateImpl) r5
            r5.f358b0 = r6
            r1.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.m.<init>(android.content.Context, int):void");
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d().c(view, layoutParams);
    }

    public final f d() {
        if (this.f444d == null) {
            q.a aVar = f.f428a;
            this.f444d = new AppCompatDelegateImpl(getContext(), getWindow(), this, this);
        }
        return this.f444d;
    }

    public final void dismiss() {
        super.dismiss();
        d().n();
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return f.b(this.f445e, getWindow().getDecorView(), this, keyEvent);
    }

    public final boolean e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final <T extends View> T findViewById(int i10) {
        return d().e(i10);
    }

    public final void invalidateOptionsMenu() {
        d().j();
    }

    public final void o() {
    }

    public void onCreate(Bundle bundle) {
        d().i();
        super.onCreate(bundle);
        d().m();
    }

    public final void onStop() {
        super.onStop();
        d().q();
    }

    public void setContentView(int i10) {
        d().t(i10);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().y(charSequence);
    }

    public final void v() {
    }

    public final void z() {
    }

    public void setContentView(View view) {
        d().u(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d().v(view, layoutParams);
    }

    public final void setTitle(int i10) {
        super.setTitle(i10);
        d().y(getContext().getString(i10));
    }
}
