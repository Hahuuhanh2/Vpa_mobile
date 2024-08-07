package a1;

import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.x;
import androidx.fragment.app.z;
import ba.q;
import ba.u;
import com.google.android.gms.internal.p001firebaseauthapi.zzadz;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.ots.core.R$id;
import j7.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import qa.b;
import y6.j;

/* compiled from: Cache */
public final class c implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public Object f24a;

    /* renamed from: b  reason: collision with root package name */
    public Object f25b;

    /* renamed from: c  reason: collision with root package name */
    public Object f26c;

    /* renamed from: d  reason: collision with root package name */
    public Object f27d;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f24a = obj;
        this.f25b = obj2;
        this.f26c = obj3;
        this.f27d = obj4;
    }

    public static void b(View view) {
        int i10 = R$id.subtitle;
        if (a.D(i10, view) != null) {
            i10 = R$id.thumbnail;
            if (a.D(i10, view) != null) {
                i10 = R$id.title;
                if (a.D(i10, view) != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public void a(Fragment fragment) {
        if (!((ArrayList) this.f24a).contains(fragment)) {
            synchronized (((ArrayList) this.f24a)) {
                ((ArrayList) this.f24a).add(fragment);
            }
            fragment.f2453r = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    public void c() {
        ((HashMap) this.f25b).values().removeAll(Collections.singleton((Object) null));
    }

    public Fragment d(String str) {
        z zVar = (z) ((HashMap) this.f25b).get(str);
        if (zVar != null) {
            return zVar.f2721c;
        }
        return null;
    }

    public Fragment e(String str) {
        for (z zVar : ((HashMap) this.f25b).values()) {
            if (zVar != null) {
                Fragment fragment = zVar.f2721c;
                if (!str.equals(fragment.f2447e)) {
                    fragment = fragment.A.f2486c.e(str);
                }
                if (fragment != null) {
                    return fragment;
                }
            }
        }
        return null;
    }

    public ArrayList f() {
        ArrayList arrayList = new ArrayList();
        for (z zVar : ((HashMap) this.f25b).values()) {
            if (zVar != null) {
                arrayList.add(zVar);
            }
        }
        return arrayList;
    }

    public ArrayList g() {
        ArrayList arrayList = new ArrayList();
        for (z zVar : ((HashMap) this.f25b).values()) {
            if (zVar != null) {
                arrayList.add(zVar.f2721c);
            } else {
                arrayList.add((Object) null);
            }
        }
        return arrayList;
    }

    public List h() {
        ArrayList arrayList;
        if (((ArrayList) this.f24a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f24a)) {
            arrayList = new ArrayList((ArrayList) this.f24a);
        }
        return arrayList;
    }

    public void i(z zVar) {
        boolean z10;
        Fragment fragment = zVar.f2721c;
        if (((HashMap) this.f25b).get(fragment.f2447e) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            ((HashMap) this.f25b).put(fragment.f2447e, zVar);
            if (FragmentManager.J(2)) {
                fragment.toString();
            }
        }
    }

    public void j(z zVar) {
        Fragment fragment = zVar.f2721c;
        if (fragment.H) {
            ((x) this.f27d).e(fragment);
        }
        if (((HashMap) this.f25b).get(fragment.f2447e) == zVar && ((z) ((HashMap) this.f25b).put(fragment.f2447e, (Object) null)) != null && FragmentManager.J(2)) {
            fragment.toString();
        }
    }

    public Bundle k(Bundle bundle, String str) {
        if (bundle != null) {
            return (Bundle) ((HashMap) this.f26c).put(str, bundle);
        }
        return (Bundle) ((HashMap) this.f26c).remove(str);
    }

    public Object then(Task task) {
        u uVar;
        u uVar2;
        RecaptchaAction recaptchaAction = (RecaptchaAction) this.f24a;
        FirebaseAuth firebaseAuth = (FirebaseAuth) this.f25b;
        String str = (String) this.f26c;
        Continuation continuation = (Continuation) this.f27d;
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exception = task.getException();
        j.f(exception);
        SparseArray sparseArray = zzadz.zza;
        if (!(exception instanceof FirebaseAuthException) || !((FirebaseAuthException) exception).f7490a.endsWith("MISSING_RECAPTCHA_TOKEN")) {
            String.valueOf(recaptchaAction);
            exception.getMessage();
            return Tasks.forException(exception);
        }
        if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
            "Falling back to recaptcha enterprise flow for action ".concat(String.valueOf(recaptchaAction));
        }
        synchronized (firebaseAuth) {
            uVar = firebaseAuth.f7480j;
        }
        if (uVar == null) {
            u uVar3 = new u(firebaseAuth.f7471a, firebaseAuth);
            synchronized (firebaseAuth) {
                firebaseAuth.f7480j = uVar3;
            }
        }
        synchronized (firebaseAuth) {
            uVar2 = firebaseAuth.f7480j;
        }
        Task a10 = uVar2.a(str, Boolean.FALSE, recaptchaAction);
        return a10.continueWithTask(continuation).continueWithTask(new q(continuation, recaptchaAction, uVar2, str));
    }

    public /* synthetic */ c(int i10) {
        if (i10 != 1) {
            this.f24a = new e(256, 0);
            this.f25b = new e(256, 0);
            this.f26c = new e(256, 0);
            this.f27d = new g[32];
            return;
        }
        this.f24a = new ArrayList();
        this.f25b = new HashMap();
        this.f26c = new HashMap();
    }

    public /* synthetic */ c(Throwable th2, b bVar) {
        this.f24a = th2.getLocalizedMessage();
        this.f25b = th2.getClass().getName();
        this.f26c = bVar.j(th2.getStackTrace());
        Throwable cause = th2.getCause();
        this.f27d = cause != null ? new c(cause, bVar) : null;
    }
}
