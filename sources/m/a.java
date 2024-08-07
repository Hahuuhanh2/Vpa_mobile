package m;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import o1.a;
import q1.b;

/* compiled from: ActionMenuItem */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f13004a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f13005b;

    /* renamed from: c  reason: collision with root package name */
    public Intent f13006c;

    /* renamed from: d  reason: collision with root package name */
    public char f13007d;

    /* renamed from: e  reason: collision with root package name */
    public int f13008e = 4096;

    /* renamed from: f  reason: collision with root package name */
    public char f13009f;

    /* renamed from: g  reason: collision with root package name */
    public int f13010g = 4096;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f13011h;

    /* renamed from: i  reason: collision with root package name */
    public Context f13012i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f13013j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f13014k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f13015l = null;

    /* renamed from: m  reason: collision with root package name */
    public PorterDuff.Mode f13016m = null;

    /* renamed from: n  reason: collision with root package name */
    public boolean f13017n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f13018o = false;

    /* renamed from: p  reason: collision with root package name */
    public int f13019p = 16;

    public a(Context context, CharSequence charSequence) {
        this.f13012i = context;
        this.f13004a = charSequence;
    }

    public final b a(w1.b bVar) {
        throw new UnsupportedOperationException();
    }

    public final w1.b b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f13011h;
        if (drawable == null) {
            return;
        }
        if (this.f13017n || this.f13018o) {
            this.f13011h = drawable;
            Drawable mutate = drawable.mutate();
            this.f13011h = mutate;
            if (this.f13017n) {
                a.b.h(mutate, this.f13015l);
            }
            if (this.f13018o) {
                a.b.i(this.f13011h, this.f13016m);
            }
        }
    }

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean expandActionView() {
        return false;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final View getActionView() {
        return null;
    }

    public final int getAlphabeticModifiers() {
        return this.f13010g;
    }

    public final char getAlphabeticShortcut() {
        return this.f13009f;
    }

    public final CharSequence getContentDescription() {
        return this.f13013j;
    }

    public final int getGroupId() {
        return 0;
    }

    public final Drawable getIcon() {
        return this.f13011h;
    }

    public final ColorStateList getIconTintList() {
        return this.f13015l;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f13016m;
    }

    public final Intent getIntent() {
        return this.f13006c;
    }

    public final int getItemId() {
        return 16908332;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f13008e;
    }

    public final char getNumericShortcut() {
        return this.f13007d;
    }

    public final int getOrder() {
        return 0;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.f13004a;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f13005b;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f13004a;
    }

    public final CharSequence getTooltipText() {
        return this.f13014k;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final boolean isCheckable() {
        if ((this.f13019p & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isChecked() {
        if ((this.f13019p & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isEnabled() {
        if ((this.f13019p & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isVisible() {
        if ((this.f13019p & 8) == 0) {
            return true;
        }
        return false;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f13009f = Character.toLowerCase(c10);
        return this;
    }

    public final MenuItem setCheckable(boolean z10) {
        this.f13019p = z10 | (this.f13019p & true) ? 1 : 0;
        return this;
    }

    public final MenuItem setChecked(boolean z10) {
        int i10;
        int i11 = this.f13019p & -3;
        if (z10) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f13019p = i10 | i11;
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f13013j = charSequence;
        return this;
    }

    public final MenuItem setEnabled(boolean z10) {
        int i10;
        int i11 = this.f13019p & -17;
        if (z10) {
            i10 = 16;
        } else {
            i10 = 0;
        }
        this.f13019p = i10 | i11;
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f13011h = drawable;
        c();
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f13015l = colorStateList;
        this.f13017n = true;
        c();
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f13016m = mode;
        this.f13018o = true;
        c();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f13006c = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c10) {
        this.f13007d = c10;
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public final MenuItem setShortcut(char c10, char c11) {
        this.f13007d = c10;
        this.f13009f = Character.toLowerCase(c11);
        return this;
    }

    public final void setShowAsAction(int i10) {
    }

    public final MenuItem setShowAsActionFlags(int i10) {
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f13004a = charSequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f13005b = charSequence;
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f13014k = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z10) {
        int i10 = 8;
        int i11 = this.f13019p & 8;
        if (z10) {
            i10 = 0;
        }
        this.f13019p = i11 | i10;
        return this;
    }

    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f13009f = Character.toLowerCase(c10);
        this.f13010g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    /* renamed from: setContentDescription  reason: collision with other method in class */
    public final b m20setContentDescription(CharSequence charSequence) {
        this.f13013j = charSequence;
        return this;
    }

    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.f13007d = c10;
        this.f13008e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    public final MenuItem setTitle(int i10) {
        this.f13004a = this.f13012i.getResources().getString(i10);
        return this;
    }

    /* renamed from: setTooltipText  reason: collision with other method in class */
    public final b m21setTooltipText(CharSequence charSequence) {
        this.f13014k = charSequence;
        return this;
    }

    public final MenuItem setIcon(int i10) {
        this.f13011h = k1.a.getDrawable(this.f13012i, i10);
        c();
        return this;
    }

    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f13007d = c10;
        this.f13008e = KeyEvent.normalizeMetaState(i10);
        this.f13009f = Character.toLowerCase(c11);
        this.f13010g = KeyEvent.normalizeMetaState(i11);
        return this;
    }
}
