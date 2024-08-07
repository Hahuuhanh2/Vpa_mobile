package d;

import a3.c;
import a3.d;
import a3.e;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.R$id;
import androidx.lifecycle.i;
import androidx.lifecycle.o;
import j7.a;
import p3.l0;
import r2.l;

/* compiled from: ComponentDialog.kt */
public class j extends Dialog implements l, a0, e {

    /* renamed from: a  reason: collision with root package name */
    public o f8436a;

    /* renamed from: b  reason: collision with root package name */
    public final d f8437b = new d(this);

    /* renamed from: c  reason: collision with root package name */
    public final y f8438c = new y(new i(this, 0));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(Context context, int i10) {
        super(context, i10);
        sk.j.f(context, "context");
    }

    public static void a(j jVar) {
        sk.j.f(jVar, "this$0");
        super.onBackPressed();
    }

    public final o B() {
        o oVar = this.f8436a;
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = new o(this);
        this.f8436a = oVar2;
        return oVar2;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        sk.j.f(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public final y b() {
        return this.f8438c;
    }

    public final void c() {
        Window window = getWindow();
        sk.j.c(window);
        View decorView = window.getDecorView();
        sk.j.e(decorView, "window!!.decorView");
        a.s0(decorView, this);
        Window window2 = getWindow();
        sk.j.c(window2);
        View decorView2 = window2.getDecorView();
        sk.j.e(decorView2, "window!!.decorView");
        decorView2.setTag(R$id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        sk.j.c(window3);
        View decorView3 = window3.getDecorView();
        sk.j.e(decorView3, "window!!.decorView");
        l0.F0(decorView3, this);
    }

    public final void onBackPressed() {
        this.f8438c.b();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            y yVar = this.f8438c;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            sk.j.e(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            yVar.getClass();
            yVar.f8465f = onBackInvokedDispatcher;
            yVar.c(yVar.f8467h);
        }
        this.f8437b.b(bundle);
        o oVar = this.f8436a;
        if (oVar == null) {
            oVar = new o(this);
            this.f8436a = oVar;
        }
        oVar.f(i.a.ON_CREATE);
    }

    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        sk.j.e(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f8437b.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    public void onStart() {
        super.onStart();
        o oVar = this.f8436a;
        if (oVar == null) {
            oVar = new o(this);
            this.f8436a = oVar;
        }
        oVar.f(i.a.ON_RESUME);
    }

    public void onStop() {
        o oVar = this.f8436a;
        if (oVar == null) {
            oVar = new o(this);
            this.f8436a = oVar;
        }
        oVar.f(i.a.ON_DESTROY);
        this.f8436a = null;
        super.onStop();
    }

    public final c q() {
        return this.f8437b.f89b;
    }

    public void setContentView(int i10) {
        c();
        super.setContentView(i10);
    }

    public void setContentView(View view) {
        sk.j.f(view, "view");
        c();
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        sk.j.f(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
