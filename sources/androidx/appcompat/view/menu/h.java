package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import o1.a;
import q1.b;
import w1.b;

/* compiled from: MenuItemImpl */
public final class h implements b {
    public w1.b A;
    public MenuItem.OnActionExpandListener B;
    public boolean C = false;

    /* renamed from: a  reason: collision with root package name */
    public final int f642a;

    /* renamed from: b  reason: collision with root package name */
    public final int f643b;

    /* renamed from: c  reason: collision with root package name */
    public final int f644c;

    /* renamed from: d  reason: collision with root package name */
    public final int f645d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f646e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f647f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f648g;

    /* renamed from: h  reason: collision with root package name */
    public char f649h;

    /* renamed from: i  reason: collision with root package name */
    public int f650i = 4096;

    /* renamed from: j  reason: collision with root package name */
    public char f651j;

    /* renamed from: k  reason: collision with root package name */
    public int f652k = 4096;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f653l;

    /* renamed from: m  reason: collision with root package name */
    public int f654m = 0;

    /* renamed from: n  reason: collision with root package name */
    public f f655n;

    /* renamed from: o  reason: collision with root package name */
    public m f656o;

    /* renamed from: p  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f657p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f658q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f659r;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f660s = null;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuff.Mode f661t = null;

    /* renamed from: u  reason: collision with root package name */
    public boolean f662u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f663v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f664w = false;

    /* renamed from: x  reason: collision with root package name */
    public int f665x = 16;

    /* renamed from: y  reason: collision with root package name */
    public int f666y;

    /* renamed from: z  reason: collision with root package name */
    public View f667z;

    /* compiled from: MenuItemImpl */
    public class a implements b.C0210b {
        public a() {
        }
    }

    public h(f fVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f655n = fVar;
        this.f642a = i11;
        this.f643b = i10;
        this.f644c = i12;
        this.f645d = i13;
        this.f646e = charSequence;
        this.f666y = i14;
    }

    public static void c(int i10, int i11, String str, StringBuilder sb2) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    public final q1.b a(w1.b bVar) {
        w1.b bVar2 = this.A;
        if (bVar2 != null) {
            bVar2.getClass();
            bVar2.f16283a = null;
        }
        this.f667z = null;
        this.A = bVar;
        this.f655n.p(true);
        w1.b bVar3 = this.A;
        if (bVar3 != null) {
            bVar3.h(new a());
        }
        return this;
    }

    public final w1.b b() {
        return this.A;
    }

    public final boolean collapseActionView() {
        if ((this.f666y & 8) == 0) {
            return false;
        }
        if (this.f667z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f655n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f664w && (this.f662u || this.f663v)) {
            drawable = drawable.mutate();
            if (this.f662u) {
                a.b.h(drawable, this.f660s);
            }
            if (this.f663v) {
                a.b.i(drawable, this.f661t);
            }
            this.f664w = false;
        }
        return drawable;
    }

    public final boolean e() {
        w1.b bVar;
        if ((this.f666y & 8) == 0) {
            return false;
        }
        if (this.f667z == null && (bVar = this.A) != null) {
            this.f667z = bVar.d(this);
        }
        if (this.f667z != null) {
            return true;
        }
        return false;
    }

    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f655n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        int i10;
        int i11 = this.f665x & -5;
        if (z10) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        this.f665x = i10 | i11;
    }

    public final void g(boolean z10) {
        if (z10) {
            this.f665x |= 32;
        } else {
            this.f665x &= -33;
        }
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final View getActionView() {
        View view = this.f667z;
        if (view != null) {
            return view;
        }
        w1.b bVar = this.A;
        if (bVar == null) {
            return null;
        }
        View d10 = bVar.d(this);
        this.f667z = d10;
        return d10;
    }

    public final int getAlphabeticModifiers() {
        return this.f652k;
    }

    public final char getAlphabeticShortcut() {
        return this.f651j;
    }

    public final CharSequence getContentDescription() {
        return this.f658q;
    }

    public final int getGroupId() {
        return this.f643b;
    }

    public final Drawable getIcon() {
        Drawable drawable = this.f653l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f654m;
        if (i10 == 0) {
            return null;
        }
        Drawable a10 = h.a.a(this.f655n.f615a, i10);
        this.f654m = 0;
        this.f653l = a10;
        return d(a10);
    }

    public final ColorStateList getIconTintList() {
        return this.f660s;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f661t;
    }

    public final Intent getIntent() {
        return this.f648g;
    }

    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f642a;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f650i;
    }

    public final char getNumericShortcut() {
        return this.f649h;
    }

    public final int getOrder() {
        return this.f644c;
    }

    public final SubMenu getSubMenu() {
        return this.f656o;
    }

    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f646e;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f647f;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f646e;
    }

    public final CharSequence getTooltipText() {
        return this.f659r;
    }

    public final boolean hasSubMenu() {
        if (this.f656o != null) {
            return true;
        }
        return false;
    }

    public final boolean isActionViewExpanded() {
        return this.C;
    }

    public final boolean isCheckable() {
        if ((this.f665x & 1) == 1) {
            return true;
        }
        return false;
    }

    public final boolean isChecked() {
        if ((this.f665x & 2) == 2) {
            return true;
        }
        return false;
    }

    public final boolean isEnabled() {
        if ((this.f665x & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isVisible() {
        w1.b bVar = this.A;
        if (bVar == null || !bVar.g()) {
            if ((this.f665x & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.f665x & 8) != 0 || !this.A.b()) {
            return false;
        } else {
            return true;
        }
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final MenuItem setActionView(View view) {
        int i10;
        this.f667z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f642a) > 0) {
            view.setId(i10);
        }
        f fVar = this.f655n;
        fVar.f625k = true;
        fVar.p(true);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f651j == c10) {
            return this;
        }
        this.f651j = Character.toLowerCase(c10);
        this.f655n.p(false);
        return this;
    }

    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f665x;
        boolean z11 = z10 | (i10 & true);
        this.f665x = z11 ? 1 : 0;
        if (i10 != z11) {
            this.f655n.p(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean z10) {
        boolean z11;
        int i10;
        int i11 = this.f665x;
        int i12 = 2;
        if ((i11 & 4) != 0) {
            f fVar = this.f655n;
            fVar.getClass();
            int i13 = this.f643b;
            int size = fVar.f620f.size();
            fVar.y();
            for (int i14 = 0; i14 < size; i14++) {
                h hVar = fVar.f620f.get(i14);
                if (hVar.f643b == i13) {
                    boolean z12 = true;
                    if ((hVar.f665x & 4) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 && hVar.isCheckable()) {
                        if (hVar != this) {
                            z12 = false;
                        }
                        int i15 = hVar.f665x;
                        int i16 = i15 & -3;
                        if (z12) {
                            i10 = 2;
                        } else {
                            i10 = 0;
                        }
                        int i17 = i10 | i16;
                        hVar.f665x = i17;
                        if (i15 != i17) {
                            hVar.f655n.p(false);
                        }
                    }
                }
            }
            fVar.x();
        } else {
            int i18 = i11 & -3;
            if (!z10) {
                i12 = 0;
            }
            int i19 = i12 | i18;
            this.f665x = i19;
            if (i11 != i19) {
                this.f655n.p(false);
            }
        }
        return this;
    }

    public final MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f665x |= 16;
        } else {
            this.f665x &= -17;
        }
        this.f655n.p(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f654m = 0;
        this.f653l = drawable;
        this.f664w = true;
        this.f655n.p(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f660s = colorStateList;
        this.f662u = true;
        this.f664w = true;
        this.f655n.p(false);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f661t = mode;
        this.f663v = true;
        this.f664w = true;
        this.f655n.p(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f648g = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c10) {
        if (this.f649h == c10) {
            return this;
        }
        this.f649h = c10;
        this.f655n.p(false);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f657p = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c10, char c11) {
        this.f649h = c10;
        this.f651j = Character.toLowerCase(c11);
        this.f655n.p(false);
        return this;
    }

    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 == 0 || i11 == 1 || i11 == 2) {
            this.f666y = i10;
            f fVar = this.f655n;
            fVar.f625k = true;
            fVar.p(true);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f646e = charSequence;
        this.f655n.p(false);
        m mVar = this.f656o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f647f = charSequence;
        this.f655n.p(false);
        return this;
    }

    public final MenuItem setVisible(boolean z10) {
        int i10;
        int i11 = this.f665x;
        int i12 = i11 & -9;
        boolean z11 = false;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i13 = i10 | i12;
        this.f665x = i13;
        if (i11 != i13) {
            z11 = true;
        }
        if (z11) {
            f fVar = this.f655n;
            fVar.f622h = true;
            fVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f646e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final q1.b setContentDescription(CharSequence charSequence) {
        this.f658q = charSequence;
        this.f655n.p(false);
        return this;
    }

    public final q1.b setTooltipText(CharSequence charSequence) {
        this.f659r = charSequence;
        this.f655n.p(false);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f651j == c10 && this.f652k == i10) {
            return this;
        }
        this.f651j = Character.toLowerCase(c10);
        this.f652k = KeyEvent.normalizeMetaState(i10);
        this.f655n.p(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f649h == c10 && this.f650i == i10) {
            return this;
        }
        this.f649h = c10;
        this.f650i = KeyEvent.normalizeMetaState(i10);
        this.f655n.p(false);
        return this;
    }

    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f649h = c10;
        this.f650i = KeyEvent.normalizeMetaState(i10);
        this.f651j = Character.toLowerCase(c11);
        this.f652k = KeyEvent.normalizeMetaState(i11);
        this.f655n.p(false);
        return this;
    }

    public final MenuItem setIcon(int i10) {
        this.f653l = null;
        this.f654m = i10;
        this.f664w = true;
        this.f655n.p(false);
        return this;
    }

    public final MenuItem setTitle(int i10) {
        setTitle((CharSequence) this.f655n.f615a.getString(i10));
        return this;
    }

    public final MenuItem setActionView(int i10) {
        int i11;
        Context context = this.f655n.f615a;
        View inflate = LayoutInflater.from(context).inflate(i10, new LinearLayout(context), false);
        this.f667z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i11 = this.f642a) > 0) {
            inflate.setId(i11);
        }
        f fVar = this.f655n;
        fVar.f625k = true;
        fVar.p(true);
        return this;
    }
}
