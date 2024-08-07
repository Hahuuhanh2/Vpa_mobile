package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.q0;

public class ActionMenuItemView extends AppCompatTextView implements k.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: o  reason: collision with root package name */
    public h f531o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f532p;

    /* renamed from: q  reason: collision with root package name */
    public Drawable f533q;

    /* renamed from: r  reason: collision with root package name */
    public f.b f534r;

    /* renamed from: s  reason: collision with root package name */
    public a f535s;

    /* renamed from: t  reason: collision with root package name */
    public b f536t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f537u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f538v;

    /* renamed from: w  reason: collision with root package name */
    public int f539w;

    /* renamed from: x  reason: collision with root package name */
    public int f540x;

    /* renamed from: y  reason: collision with root package name */
    public int f541y;

    public class a extends a0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        public final m.f b() {
            ActionMenuPresenter.a aVar;
            b bVar = ActionMenuItemView.this.f536t;
            if (bVar == null || (aVar = ActionMenuPresenter.this.B) == null) {
                return null;
            }
            return aVar.a();
        }

        public final boolean c() {
            m.f b10;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            f.b bVar = actionMenuItemView.f534r;
            if (bVar == null || !bVar.a(actionMenuItemView.f531o) || (b10 = b()) == null || !b10.a()) {
                return false;
            }
            return true;
        }
    }

    public static abstract class b {
    }

    public ActionMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    public final boolean a() {
        return l();
    }

    public final boolean b() {
        if (!l() || this.f531o.getIcon() != null) {
            return false;
        }
        return true;
    }

    public final void c(h hVar) {
        int i10;
        this.f531o = hVar;
        setIcon(hVar.getIcon());
        setTitle(hVar.getTitleCondensed());
        setId(hVar.f642a);
        if (hVar.isVisible()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        setEnabled(hVar.isEnabled());
        if (hVar.hasSubMenu() && this.f535s == null) {
            this.f535s = new a();
        }
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public h getItemData() {
        return this.f531o;
    }

    public final boolean l() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean m() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 >= 480 || ((i10 >= 640 && i11 >= 480) || configuration.orientation == 2)) {
            return true;
        }
        return false;
    }

    public final void n() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z10;
        boolean z11 = true;
        boolean z12 = !TextUtils.isEmpty(this.f532p);
        if (this.f533q != null) {
            if ((this.f531o.f666y & 4) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 || (!this.f537u && !this.f538v)) {
                z11 = false;
            }
        }
        boolean z13 = z12 & z11;
        CharSequence charSequence3 = null;
        if (z13) {
            charSequence = this.f532p;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.f531o.f658q;
        if (TextUtils.isEmpty(charSequence4)) {
            if (z13) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f531o.f646e;
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(charSequence4);
        }
        CharSequence charSequence5 = this.f531o.f659r;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z13) {
                charSequence3 = this.f531o.f646e;
            }
            q0.a(this, charSequence3);
            return;
        }
        q0.a(this, charSequence5);
    }

    public final void onClick(View view) {
        f.b bVar = this.f534r;
        if (bVar != null) {
            bVar.a(this.f531o);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f537u = m();
        n();
    }

    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        boolean l10 = l();
        if (l10 && (i13 = this.f540x) >= 0) {
            super.setPadding(i13, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i12 = Math.min(size, this.f539w);
        } else {
            i12 = this.f539w;
        }
        if (mode != 1073741824 && this.f539w > 0 && measuredWidth < i12) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
        }
        if (!l10 && this.f533q != null) {
            super.setPadding((getMeasuredWidth() - this.f533q.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (!this.f531o.hasSubMenu() || (aVar = this.f535s) == null || !aVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f538v != z10) {
            this.f538v = z10;
            h hVar = this.f531o;
            if (hVar != null) {
                f fVar = hVar.f655n;
                fVar.f625k = true;
                fVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f533q = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f541y;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i10) / ((float) intrinsicWidth)));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i10) / ((float) intrinsicHeight)));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        n();
    }

    public void setItemInvoker(f.b bVar) {
        this.f534r = bVar;
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f540x = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f536t = bVar;
    }

    public void setShortcut(boolean z10, char c10) {
    }

    public void setTitle(CharSequence charSequence) {
        this.f532p = charSequence;
        n();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f537u = m();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ActionMenuItemView, i10, 0);
        this.f539w = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f541y = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f540x = -1;
        setSaveEnabled(false);
    }
}
