package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.q;
import androidx.appcompat.widget.t0;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.viewmodel.R$id;
import i1.a;
import i1.l;
import j7.a;
import java.util.ArrayList;
import p3.l0;
import sk.j;

public class AppCompatActivity extends FragmentActivity implements e {
    public AppCompatDelegateImpl H;

    public AppCompatActivity() {
        this.f271e.f89b.c("androidx:appcompat", new c(this));
        D(new d(this));
    }

    public final f I() {
        if (this.H == null) {
            q.a aVar = f.f428a;
            this.H = new AppCompatDelegateImpl(this, (Window) null, this, this);
        }
        return this.H;
    }

    public final ActionBar J() {
        return I().h();
    }

    public final void K() {
        a.s0(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        j.f(decorView, "<this>");
        decorView.setTag(R$id.view_tree_view_model_store_owner, this);
        l0.F0(getWindow().getDecorView(), this);
        View decorView2 = getWindow().getDecorView();
        j.f(decorView2, "<this>");
        decorView2.setTag(androidx.activity.R$id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        K();
        I().c(view, layoutParams);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(I().d(context));
    }

    public final void closeOptionsMenu() {
        ActionBar J = J();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (J == null || !J.a()) {
            super.closeOptionsMenu();
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar J = J();
        if (keyCode != 82 || J == null || !J.j(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public final <T extends View> T findViewById(int i10) {
        return I().e(i10);
    }

    public final MenuInflater getMenuInflater() {
        return I().g();
    }

    public final Resources getResources() {
        int i10 = t0.f1234a;
        return super.getResources();
    }

    public final void invalidateOptionsMenu() {
        I().j();
    }

    public final void o() {
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        I().l(configuration);
    }

    public final void onContentChanged() {
    }

    public void onDestroy() {
        super.onDestroy();
        I().n();
    }

    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10;
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        ActionBar J = J();
        if (menuItem.getItemId() != 16908332 || J == null || (J.d() & 4) == 0) {
            return false;
        }
        Intent a10 = l.a(this);
        if (a10 == null) {
            return false;
        }
        if (l.a.c(this, a10)) {
            ArrayList arrayList = new ArrayList();
            Intent a11 = l.a(this);
            if (a11 == null) {
                a11 = l.a(this);
            }
            if (a11 != null) {
                ComponentName component = a11.getComponent();
                if (component == null) {
                    component = a11.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent b10 = l.b(this, component);
                    while (b10 != null) {
                        arrayList.add(size, b10);
                        b10 = l.b(this, b10.getComponent());
                    }
                    arrayList.add(a11);
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new IllegalArgumentException(e10);
                }
            }
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                if (!k1.a.startActivities(this, intentArr, (Bundle) null)) {
                    Intent intent = new Intent(intentArr[intentArr.length - 1]);
                    intent.addFlags(268435456);
                    startActivity(intent);
                }
                try {
                    int i11 = i1.a.f10925a;
                    a.C0120a.a(this);
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
        } else {
            l.a.b(this, a10);
            return true;
        }
    }

    public final boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    public final void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((AppCompatDelegateImpl) I()).I();
    }

    public void onPostResume() {
        super.onPostResume();
        I().o();
    }

    public void onStart() {
        super.onStart();
        I().p();
    }

    public final void onStop() {
        super.onStop();
        I().q();
    }

    public final void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        I().y(charSequence);
    }

    public final void openOptionsMenu() {
        ActionBar J = J();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (J == null || !J.k()) {
            super.openOptionsMenu();
        }
    }

    public final void setContentView(int i10) {
        K();
        I().t(i10);
    }

    public final void setTheme(int i10) {
        super.setTheme(i10);
        I().x(i10);
    }

    public final void v() {
    }

    public final void z() {
    }

    public void setContentView(View view) {
        K();
        I().u(view);
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        K();
        I().v(view, layoutParams);
    }
}
