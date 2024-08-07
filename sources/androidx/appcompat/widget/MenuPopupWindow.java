package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import java.lang.reflect.Method;

public final class MenuPopupWindow extends ListPopupWindow implements c0 {
    public static Method L;
    public c0 K;

    public static class MenuDropDownListView extends y {

        /* renamed from: t  reason: collision with root package name */
        public final int f916t;

        /* renamed from: u  reason: collision with root package name */
        public final int f917u;

        /* renamed from: v  reason: collision with root package name */
        public c0 f918v;

        /* renamed from: w  reason: collision with root package name */
        public h f919w;

        public static class a {
            public static int a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public MenuDropDownListView(Context context, boolean z10) {
            super(context, z10);
            if (1 == a.a(context.getResources().getConfiguration())) {
                this.f916t = 21;
                this.f917u = 22;
                return;
            }
            this.f916t = 22;
            this.f917u = 21;
        }

        public final boolean onHoverEvent(MotionEvent motionEvent) {
            int i10;
            e eVar;
            int pointToPosition;
            int i11;
            if (this.f918v != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i10 = headerViewListAdapter.getHeadersCount();
                    eVar = (e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i10 = 0;
                    eVar = (e) adapter;
                }
                h hVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i11 = pointToPosition - i10) >= 0 && i11 < eVar.getCount()) {
                    hVar = eVar.getItem(i11);
                }
                h hVar2 = this.f919w;
                if (hVar2 != hVar) {
                    f fVar = eVar.f608a;
                    if (hVar2 != null) {
                        this.f918v.g(fVar, hVar2);
                    }
                    this.f919w = hVar;
                    if (hVar != null) {
                        this.f918v.d(fVar, hVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
            e eVar;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.f916t) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i10 != this.f917u) {
                return super.onKeyDown(i10, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    eVar = (e) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    eVar = (e) adapter;
                }
                eVar.f608a.c(false);
                return true;
            }
        }

        public void setHoverListener(c0 c0Var) {
            this.f918v = c0Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    public static class a {
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    public static class b {
        public static void a(PopupWindow popupWindow, boolean z10) {
            popupWindow.setTouchModal(z10);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                L = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public MenuPopupWindow(Context context, int i10, int i11) {
        super(context, (AttributeSet) null, i10, i11);
    }

    public final void d(f fVar, h hVar) {
        c0 c0Var = this.K;
        if (c0Var != null) {
            c0Var.d(fVar, hVar);
        }
    }

    public final void g(f fVar, MenuItem menuItem) {
        c0 c0Var = this.K;
        if (c0Var != null) {
            c0Var.g(fVar, menuItem);
        }
    }

    public final y q(Context context, boolean z10) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z10);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }
}
