package m;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.m;
import java.lang.reflect.Method;
import w1.b;

/* compiled from: MenuItemWrapperICS */
public final class c extends b implements MenuItem {

    /* renamed from: d  reason: collision with root package name */
    public final q1.b f13023d;

    /* renamed from: e  reason: collision with root package name */
    public Method f13024e;

    /* compiled from: MenuItemWrapperICS */
    public class a extends w1.b {

        /* renamed from: b  reason: collision with root package name */
        public final ActionProvider f13025b;

        public a(ActionProvider actionProvider) {
            this.f13025b = actionProvider;
        }

        public final boolean a() {
            return this.f13025b.hasSubMenu();
        }

        public final View c() {
            return this.f13025b.onCreateActionView();
        }

        public final boolean e() {
            return this.f13025b.onPerformDefaultAction();
        }

        public final void f(m mVar) {
            this.f13025b.onPrepareSubMenu(c.this.e(mVar));
        }
    }

    /* compiled from: MenuItemWrapperICS */
    public class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: d  reason: collision with root package name */
        public b.C0210b f13027d;

        public b(c cVar, ActionProvider actionProvider) {
            super(actionProvider);
        }

        public final boolean b() {
            return this.f13025b.isVisible();
        }

        public final View d(MenuItem menuItem) {
            return this.f13025b.onCreateActionView(menuItem);
        }

        public final boolean g() {
            return this.f13025b.overridesItemVisibility();
        }

        public final void h(h.a aVar) {
            this.f13027d = aVar;
            this.f13025b.setVisibilityListener(this);
        }

        public final void onActionProviderVisibilityChanged(boolean z10) {
            b.C0210b bVar = this.f13027d;
            if (bVar != null) {
                f fVar = h.this.f655n;
                fVar.f622h = true;
                fVar.p(true);
            }
        }
    }

    /* renamed from: m.c$c  reason: collision with other inner class name */
    /* compiled from: MenuItemWrapperICS */
    public static class C0158c extends FrameLayout implements l.b {

        /* renamed from: a  reason: collision with root package name */
        public final CollapsibleActionView f13028a;

        public C0158c(View view) {
            super(view.getContext());
            this.f13028a = (CollapsibleActionView) view;
            addView(view);
        }

        public final void onActionViewCollapsed() {
            this.f13028a.onActionViewCollapsed();
        }

        public final void onActionViewExpanded() {
            this.f13028a.onActionViewExpanded();
        }
    }

    /* compiled from: MenuItemWrapperICS */
    public class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a  reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f13029a;

        public d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f13029a = onActionExpandListener;
        }

        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f13029a.onMenuItemActionCollapse(c.this.d(menuItem));
        }

        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f13029a.onMenuItemActionExpand(c.this.d(menuItem));
        }
    }

    /* compiled from: MenuItemWrapperICS */
    public class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f13031a;

        public e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f13031a = onMenuItemClickListener;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            return this.f13031a.onMenuItemClick(c.this.d(menuItem));
        }
    }

    public c(Context context, q1.b bVar) {
        super(context);
        if (bVar != null) {
            this.f13023d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final boolean collapseActionView() {
        return this.f13023d.collapseActionView();
    }

    public final boolean expandActionView() {
        return this.f13023d.expandActionView();
    }

    public final ActionProvider getActionProvider() {
        w1.b b10 = this.f13023d.b();
        if (b10 instanceof a) {
            return ((a) b10).f13025b;
        }
        return null;
    }

    public final View getActionView() {
        View actionView = this.f13023d.getActionView();
        if (actionView instanceof C0158c) {
            return (View) ((C0158c) actionView).f13028a;
        }
        return actionView;
    }

    public final int getAlphabeticModifiers() {
        return this.f13023d.getAlphabeticModifiers();
    }

    public final char getAlphabeticShortcut() {
        return this.f13023d.getAlphabeticShortcut();
    }

    public final CharSequence getContentDescription() {
        return this.f13023d.getContentDescription();
    }

    public final int getGroupId() {
        return this.f13023d.getGroupId();
    }

    public final Drawable getIcon() {
        return this.f13023d.getIcon();
    }

    public final ColorStateList getIconTintList() {
        return this.f13023d.getIconTintList();
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f13023d.getIconTintMode();
    }

    public final Intent getIntent() {
        return this.f13023d.getIntent();
    }

    public final int getItemId() {
        return this.f13023d.getItemId();
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f13023d.getMenuInfo();
    }

    public final int getNumericModifiers() {
        return this.f13023d.getNumericModifiers();
    }

    public final char getNumericShortcut() {
        return this.f13023d.getNumericShortcut();
    }

    public final int getOrder() {
        return this.f13023d.getOrder();
    }

    public final SubMenu getSubMenu() {
        return e(this.f13023d.getSubMenu());
    }

    public final CharSequence getTitle() {
        return this.f13023d.getTitle();
    }

    public final CharSequence getTitleCondensed() {
        return this.f13023d.getTitleCondensed();
    }

    public final CharSequence getTooltipText() {
        return this.f13023d.getTooltipText();
    }

    public final boolean hasSubMenu() {
        return this.f13023d.hasSubMenu();
    }

    public final boolean isActionViewExpanded() {
        return this.f13023d.isActionViewExpanded();
    }

    public final boolean isCheckable() {
        return this.f13023d.isCheckable();
    }

    public final boolean isChecked() {
        return this.f13023d.isChecked();
    }

    public final boolean isEnabled() {
        return this.f13023d.isEnabled();
    }

    public final boolean isVisible() {
        return this.f13023d.isVisible();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this, actionProvider);
        q1.b bVar2 = this.f13023d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.a(bVar);
        return this;
    }

    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0158c(view);
        }
        this.f13023d.setActionView(view);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f13023d.setAlphabeticShortcut(c10);
        return this;
    }

    public final MenuItem setCheckable(boolean z10) {
        this.f13023d.setCheckable(z10);
        return this;
    }

    public final MenuItem setChecked(boolean z10) {
        this.f13023d.setChecked(z10);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f13023d.setContentDescription(charSequence);
        return this;
    }

    public final MenuItem setEnabled(boolean z10) {
        this.f13023d.setEnabled(z10);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f13023d.setIcon(drawable);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f13023d.setIconTintList(colorStateList);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f13023d.setIconTintMode(mode);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f13023d.setIntent(intent);
        return this;
    }

    public final MenuItem setNumericShortcut(char c10) {
        this.f13023d.setNumericShortcut(c10);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        d dVar;
        q1.b bVar = this.f13023d;
        if (onActionExpandListener != null) {
            dVar = new d(onActionExpandListener);
        } else {
            dVar = null;
        }
        bVar.setOnActionExpandListener(dVar);
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        e eVar;
        q1.b bVar = this.f13023d;
        if (onMenuItemClickListener != null) {
            eVar = new e(onMenuItemClickListener);
        } else {
            eVar = null;
        }
        bVar.setOnMenuItemClickListener(eVar);
        return this;
    }

    public final MenuItem setShortcut(char c10, char c11) {
        this.f13023d.setShortcut(c10, c11);
        return this;
    }

    public final void setShowAsAction(int i10) {
        this.f13023d.setShowAsAction(i10);
    }

    public final MenuItem setShowAsActionFlags(int i10) {
        this.f13023d.setShowAsActionFlags(i10);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f13023d.setTitle(charSequence);
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f13023d.setTitleCondensed(charSequence);
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f13023d.setTooltipText(charSequence);
        return this;
    }

    public final MenuItem setVisible(boolean z10) {
        return this.f13023d.setVisible(z10);
    }

    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f13023d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    public final MenuItem setIcon(int i10) {
        this.f13023d.setIcon(i10);
        return this;
    }

    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.f13023d.setNumericShortcut(c10, i10);
        return this;
    }

    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f13023d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    public final MenuItem setTitle(int i10) {
        this.f13023d.setTitle(i10);
        return this;
    }

    public final MenuItem setActionView(int i10) {
        this.f13023d.setActionView(i10);
        View actionView = this.f13023d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f13023d.setActionView((View) new C0158c(actionView));
        }
        return this;
    }
}
