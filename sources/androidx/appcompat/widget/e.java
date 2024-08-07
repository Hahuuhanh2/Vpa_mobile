package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import o1.a;

/* compiled from: AppCompatCheckedTextViewHelper */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final CheckedTextView f1083a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f1084b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f1085c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1086d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1087e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1088f;

    public e(CheckedTextView checkedTextView) {
        this.f1083a = checkedTextView;
    }

    public final void a() {
        Drawable checkMarkDrawable = this.f1083a.getCheckMarkDrawable();
        if (checkMarkDrawable == null) {
            return;
        }
        if (this.f1086d || this.f1087e) {
            Drawable mutate = checkMarkDrawable.mutate();
            if (this.f1086d) {
                a.b.h(mutate, this.f1084b);
            }
            if (this.f1087e) {
                a.b.i(mutate, this.f1085c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f1083a.getDrawableState());
            }
            this.f1083a.setCheckMarkDrawable(mutate);
        }
    }
}
