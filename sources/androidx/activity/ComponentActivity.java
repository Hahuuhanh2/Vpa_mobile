package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.viewmodel.R$id;
import d.a0;
import d.p;
import d.q;
import d.y;
import e0.c0;
import e0.u;
import g.a;
import i1.a;
import i1.k;
import i1.w;
import i1.z;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p3.l0;
import r2.l;
import r2.x;
import sk.j;
import w1.i;

public class ComponentActivity extends androidx.core.app.ComponentActivity implements x, androidx.lifecycle.f, a3.e, a0, f.g, k1.c, k1.d, w, i1.x, w1.h {
    public static final /* synthetic */ int A = 0;

    /* renamed from: b  reason: collision with root package name */
    public final e.a f268b = new e.a();

    /* renamed from: c  reason: collision with root package name */
    public final w1.i f269c = new w1.i(new d.d(this, 0));

    /* renamed from: d  reason: collision with root package name */
    public final o f270d;

    /* renamed from: e  reason: collision with root package name */
    public final a3.d f271e;

    /* renamed from: f  reason: collision with root package name */
    public r2.w f272f;

    /* renamed from: n  reason: collision with root package name */
    public androidx.lifecycle.a0 f273n;

    /* renamed from: o  reason: collision with root package name */
    public y f274o;

    /* renamed from: p  reason: collision with root package name */
    public final i f275p;

    /* renamed from: q  reason: collision with root package name */
    public final p f276q;

    /* renamed from: r  reason: collision with root package name */
    public final AtomicInteger f277r;

    /* renamed from: s  reason: collision with root package name */
    public final a f278s;

    /* renamed from: t  reason: collision with root package name */
    public final CopyOnWriteArrayList<v1.a<Configuration>> f279t;

    /* renamed from: u  reason: collision with root package name */
    public final CopyOnWriteArrayList<v1.a<Integer>> f280u;

    /* renamed from: v  reason: collision with root package name */
    public final CopyOnWriteArrayList<v1.a<Intent>> f281v;

    /* renamed from: w  reason: collision with root package name */
    public final CopyOnWriteArrayList<v1.a<k>> f282w;

    /* renamed from: x  reason: collision with root package name */
    public final CopyOnWriteArrayList<v1.a<z>> f283x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f284y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f285z;

    public class a extends f.f {
        public a() {
        }

        public final void b(int i10, g.a aVar, Object obj) {
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0108a b10 = aVar.b(componentActivity, obj);
            if (b10 != null) {
                new Handler(Looper.getMainLooper()).post(new a(this, i10, b10));
                return;
            }
            Intent a10 = aVar.a(componentActivity, obj);
            Bundle bundle = null;
            if (a10.getExtras() != null && a10.getExtras().getClassLoader() == null) {
                a10.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a10.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a10.getAction())) {
                String[] stringArrayExtra = a10.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                i1.a.a(componentActivity, stringArrayExtra, i10);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a10.getAction())) {
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a10.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    IntentSender intentSender = intentSenderRequest.f305a;
                    Intent intent = intentSenderRequest.f306b;
                    int i11 = intentSenderRequest.f307c;
                    int i12 = intentSenderRequest.f308d;
                    int i13 = i1.a.f10925a;
                    a.C0120a.c(componentActivity, intentSender, i10, intent, i11, i12, 0, bundle2);
                } catch (IntentSender.SendIntentException e10) {
                    new Handler(Looper.getMainLooper()).post(new b(this, i10, e10));
                }
            } else {
                int i14 = i1.a.f10925a;
                a.C0120a.b(componentActivity, a10, i10, bundle2);
            }
        }
    }

    public class b implements n {
        public b() {
        }

        public final void q(l lVar, i.a aVar) {
            View view;
            if (aVar == i.a.ON_STOP) {
                Window window = ComponentActivity.this.getWindow();
                if (window != null) {
                    view = window.peekDecorView();
                } else {
                    view = null;
                }
                if (view != null) {
                    view.cancelPendingInputEvents();
                }
            }
        }
    }

    public class c implements n {
        public c() {
        }

        public final void q(l lVar, i.a aVar) {
            if (aVar == i.a.ON_DESTROY) {
                ComponentActivity.this.f268b.f8968b = null;
                if (!ComponentActivity.this.isChangingConfigurations()) {
                    ComponentActivity.this.n().a();
                }
                i iVar = ComponentActivity.this.f275p;
                ComponentActivity.this.getWindow().getDecorView().removeCallbacks(iVar);
                ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(iVar);
            }
        }
    }

    public class d implements n {
        public d() {
        }

        public final void q(l lVar, i.a aVar) {
            ComponentActivity componentActivity = ComponentActivity.this;
            if (componentActivity.f272f == null) {
                h hVar = (h) componentActivity.getLastNonConfigurationInstance();
                if (hVar != null) {
                    componentActivity.f272f = hVar.f292a;
                }
                if (componentActivity.f272f == null) {
                    componentActivity.f272f = new r2.w();
                }
            }
            ComponentActivity.this.f270d.c(this);
        }
    }

    public class e implements Runnable {
        public e() {
        }

        public final void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            } catch (NullPointerException e11) {
                if (!TextUtils.equals(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e11;
                }
            }
        }
    }

    public class f implements n {
        public f() {
        }

        public final void q(l lVar, i.a aVar) {
            if (aVar == i.a.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
                y yVar = ComponentActivity.this.f274o;
                OnBackInvokedDispatcher a10 = g.a((ComponentActivity) lVar);
                yVar.getClass();
                j.f(a10, "invoker");
                yVar.f8465f = a10;
                yVar.c(yVar.f8467h);
            }
        }
    }

    public static class g {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    public static final class h {

        /* renamed from: a  reason: collision with root package name */
        public r2.w f292a;
    }

    public class i implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final long f293a = (SystemClock.uptimeMillis() + 10000);

        /* renamed from: b  reason: collision with root package name */
        public Runnable f294b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f295c = false;

        public i() {
        }

        public final void a(View view) {
            if (!this.f295c) {
                this.f295c = true;
                view.getViewTreeObserver().addOnDrawListener(this);
            }
        }

        public final void execute(Runnable runnable) {
            this.f294b = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            if (!this.f295c) {
                decorView.postOnAnimation(new d.h(this, 0));
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        public final void onDraw() {
            boolean z10;
            Runnable runnable = this.f294b;
            if (runnable != null) {
                runnable.run();
                this.f294b = null;
                p pVar = ComponentActivity.this.f276q;
                synchronized (pVar.f8442b) {
                    z10 = pVar.f8443c;
                }
                if (z10) {
                    this.f295c = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                }
            } else if (SystemClock.uptimeMillis() > this.f293a) {
                this.f295c = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        public final void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    public ComponentActivity() {
        o oVar = new o(this);
        this.f270d = oVar;
        a3.d dVar = new a3.d(this);
        this.f271e = dVar;
        this.f274o = null;
        i iVar = new i();
        this.f275p = iVar;
        this.f276q = new p(iVar, new d.e(this));
        this.f277r = new AtomicInteger();
        this.f278s = new a();
        this.f279t = new CopyOnWriteArrayList<>();
        this.f280u = new CopyOnWriteArrayList<>();
        this.f281v = new CopyOnWriteArrayList<>();
        this.f282w = new CopyOnWriteArrayList<>();
        this.f283x = new CopyOnWriteArrayList<>();
        this.f284y = false;
        this.f285z = false;
        int i10 = Build.VERSION.SDK_INT;
        oVar.a(new b());
        oVar.a(new c());
        oVar.a(new d());
        dVar.a();
        androidx.lifecycle.y.b(this);
        if (i10 <= 23) {
            oVar.a(new q(this));
        }
        dVar.f89b.c("android:support:activity-result", new d.f(this, 0));
        D(new d.g(this));
    }

    public final void A(v1.a<Configuration> aVar) {
        this.f279t.add(aVar);
    }

    public final o B() {
        return this.f270d;
    }

    public final void D(e.b bVar) {
        e.a aVar = this.f268b;
        aVar.getClass();
        if (aVar.f8968b != null) {
            bVar.a();
        }
        aVar.f8967a.add(bVar);
    }

    public final void E() {
        j7.a.s0(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        j.f(decorView, "<this>");
        decorView.setTag(R$id.view_tree_view_model_store_owner, this);
        l0.F0(getWindow().getDecorView(), this);
        View decorView2 = getWindow().getDecorView();
        j.f(decorView2, "<this>");
        decorView2.setTag(R$id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView3 = getWindow().getDecorView();
        j.f(decorView3, "<this>");
        decorView3.setTag(R$id.report_drawn, this);
    }

    public final f.b F(f.a aVar, g.a aVar2) {
        a aVar3 = this.f278s;
        StringBuilder q10 = android.support.v4.media.a.q("activity_rq#");
        q10.append(this.f277r.getAndIncrement());
        return aVar3.c(q10.toString(), this, aVar2, aVar);
    }

    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        E();
        this.f275p.a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    public final y b() {
        if (this.f274o == null) {
            this.f274o = new y(new e());
            this.f270d.a(new f());
        }
        return this.f274o;
    }

    public final void e(u uVar) {
        this.f282w.remove(uVar);
    }

    public f0.b f() {
        Bundle bundle;
        if (this.f273n == null) {
            Application application = getApplication();
            if (getIntent() != null) {
                bundle = getIntent().getExtras();
            } else {
                bundle = null;
            }
            this.f273n = new androidx.lifecycle.a0(application, this, bundle);
        }
        return this.f273n;
    }

    public final s2.b g() {
        s2.b bVar = new s2.b();
        if (getApplication() != null) {
            bVar.f14601a.put(e0.f2756a, getApplication());
        }
        bVar.f14601a.put(androidx.lifecycle.y.f2839a, this);
        bVar.f14601a.put(androidx.lifecycle.y.f2840b, this);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            bVar.f14601a.put(androidx.lifecycle.y.f2841c, getIntent().getExtras());
        }
        return bVar;
    }

    public final void h(u uVar) {
        this.f282w.add(uVar);
    }

    public final void i(androidx.fragment.app.u uVar) {
        this.f279t.remove(uVar);
    }

    public final void j(c0 c0Var) {
        this.f280u.add(c0Var);
    }

    public final f.f k() {
        return this.f278s;
    }

    public final void l(c0 c0Var) {
        this.f280u.remove(c0Var);
    }

    public final void m(androidx.fragment.app.u uVar) {
        this.f283x.add(uVar);
    }

    public final r2.w n() {
        if (getApplication() != null) {
            if (this.f272f == null) {
                h hVar = (h) getLastNonConfigurationInstance();
                if (hVar != null) {
                    this.f272f = hVar.f292a;
                }
                if (this.f272f == null) {
                    this.f272f = new r2.w();
                }
            }
            return this.f272f;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (!this.f278s.a(i10, i11, intent)) {
            super.onActivityResult(i10, i11, intent);
        }
    }

    @Deprecated
    public final void onBackPressed() {
        b().b();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<v1.a<Configuration>> it = this.f279t.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        this.f271e.b(bundle);
        e.a aVar = this.f268b;
        aVar.getClass();
        aVar.f8968b = this;
        Iterator it = aVar.f8967a.iterator();
        while (it.hasNext()) {
            ((e.b) it.next()).a();
        }
        super.onCreate(bundle);
        int i10 = ReportFragment.f2726b;
        ReportFragment.b.b(this);
    }

    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        w1.i iVar = this.f269c;
        MenuInflater menuInflater = getMenuInflater();
        Iterator<w1.k> it = iVar.f16324b.iterator();
        while (it.hasNext()) {
            it.next().c(menu, menuInflater);
        }
        return true;
    }

    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 != 0) {
            return false;
        }
        Iterator<w1.k> it = this.f269c.f16324b.iterator();
        while (it.hasNext()) {
            if (it.next().a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void onMultiWindowModeChanged(boolean z10) {
        if (!this.f284y) {
            Iterator<v1.a<k>> it = this.f282w.iterator();
            while (it.hasNext()) {
                it.next().accept(new k(z10));
            }
        }
    }

    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<v1.a<Intent>> it = this.f281v.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    public void onPanelClosed(int i10, Menu menu) {
        Iterator<w1.k> it = this.f269c.f16324b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
        super.onPanelClosed(i10, menu);
    }

    public final void onPictureInPictureModeChanged(boolean z10) {
        if (!this.f285z) {
            Iterator<v1.a<z>> it = this.f283x.iterator();
            while (it.hasNext()) {
                it.next().accept(new z(z10));
            }
        }
    }

    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        Iterator<w1.k> it = this.f269c.f16324b.iterator();
        while (it.hasNext()) {
            it.next().d(menu);
        }
        return true;
    }

    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (!this.f278s.a(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i10, strArr, iArr);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        h hVar;
        r2.w wVar = this.f272f;
        if (wVar == null && (hVar = (h) getLastNonConfigurationInstance()) != null) {
            wVar = hVar.f292a;
        }
        if (wVar == null) {
            return null;
        }
        h hVar2 = new h();
        hVar2.f292a = wVar;
        return hVar2;
    }

    public void onSaveInstanceState(Bundle bundle) {
        o oVar = this.f270d;
        if (oVar instanceof o) {
            oVar.h();
        }
        super.onSaveInstanceState(bundle);
        this.f271e.c(bundle);
    }

    public final void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<v1.a<Integer>> it = this.f280u.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    public final a3.c q() {
        return this.f271e.f89b;
    }

    public final void r(FragmentManager.c cVar) {
        w1.i iVar = this.f269c;
        iVar.f16324b.add(cVar);
        iVar.f16323a.run();
    }

    public final void reportFullyDrawn() {
        try {
            if (h3.a.a()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            p pVar = this.f276q;
            synchronized (pVar.f8442b) {
                pVar.f8443c = true;
                Iterator it = pVar.f8444d.iterator();
                while (it.hasNext()) {
                    ((rk.a) it.next()).invoke();
                }
                pVar.f8444d.clear();
                ek.i iVar = ek.i.f20112a;
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public void setContentView(int i10) {
        E();
        this.f275p.a(getWindow().getDecorView());
        super.setContentView(i10);
    }

    @Deprecated
    public final void startActivityForResult(Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Deprecated
    public final void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    public final void x(FragmentManager.c cVar) {
        w1.i iVar = this.f269c;
        iVar.f16324b.remove(cVar);
        if (((i.a) iVar.f16325c.remove(cVar)) == null) {
            iVar.f16323a.run();
            return;
        }
        throw null;
    }

    public final void y(androidx.fragment.app.u uVar) {
        this.f283x.remove(uVar);
    }

    @Deprecated
    public final void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Deprecated
    public final void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    /* JADX INFO: finally extract failed */
    public final void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        this.f284y = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.f284y = false;
            Iterator<v1.a<k>> it = this.f282w.iterator();
            while (it.hasNext()) {
                it.next().accept(new k(z10, 0));
            }
        } catch (Throwable th2) {
            this.f284y = false;
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        this.f285z = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.f285z = false;
            Iterator<v1.a<z>> it = this.f283x.iterator();
            while (it.hasNext()) {
                it.next().accept(new z(z10, 0));
            }
        } catch (Throwable th2) {
            this.f285z = false;
            throw th2;
        }
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        E();
        this.f275p.a(getWindow().getDecorView());
        super.setContentView(view);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        E();
        this.f275p.a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }
}
