package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.o;
import r2.l;
import v0.h;
import w1.f;

public class ComponentActivity extends Activity implements l, f.a {

    /* renamed from: a  reason: collision with root package name */
    public o f2085a = new o(this);

    public ComponentActivity() {
        new h();
    }

    public o B() {
        return this.f2085a;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !f.a(decorView, keyEvent)) {
            return f.b(this, decorView, this, keyEvent);
        }
        return true;
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !f.a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i10 = ReportFragment.f2726b;
        ReportFragment.b.b(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        o oVar = this.f2085a;
        oVar.getClass();
        oVar.e("markState");
        oVar.h();
        super.onSaveInstanceState(bundle);
    }

    public final boolean u(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
