package ca;

import al.g0;
import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.AutoCompleteTextView;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.view.PreviewView;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.search.SearchView;
import com.google.android.material.textfield.k;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import com.ots.core.R$dimen;
import com.vpa.daugia.module.auth.ui.activity.StepThreePersonalActivity;
import com.vpa.daugia.ui.splash.SplashActivity;
import e0.x;
import i0.f;
import ia.o0;
import java.io.IOException;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import rk.l;
import v.c0;
import v.n;
import v.u;
import v.y0;
import w1.c;
import w1.d0;
import w1.q;
import w1.q0;
import w1.w0;
import x1.j;
import z.s;
import z0.b;
import z1.d;
import z1.e;
import za.a;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements f, OnCompleteListener, b.c, s.b, p.a, d, j, q, x1.d, ga.a, a.C0251a, Continuation, OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4605a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4606b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f4605a = i10;
        this.f4606b = obj;
    }

    public boolean a(View view) {
        int i10 = BottomSheetDragHandleView.f5850t;
        return ((BottomSheetDragHandleView) this.f4606b).c();
    }

    public Object apply(Object obj) {
        Void voidR = (Void) obj;
        ((androidx.camera.view.a) this.f4606b).a(PreviewView.g.STREAMING);
        return null;
    }

    public boolean b(e eVar, int i10, Bundle bundle) {
        c.b bVar;
        View view = (View) this.f4606b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                eVar.f17808a.b();
                Parcelable parcelable = (Parcelable) eVar.f17808a.e();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception unused) {
                return false;
            }
        }
        ClipData clipData = new ClipData(eVar.f17808a.d(), new ClipData.Item(eVar.f17808a.a()));
        if (i11 >= 31) {
            bVar = new c.a(clipData, 2);
        } else {
            bVar = new c.C0211c(clipData, 2);
        }
        bVar.a(eVar.f17808a.c());
        bVar.setExtras(bundle);
        if (d0.k(view, bVar.build()) == null) {
            return true;
        }
        return false;
    }

    public void c(Bundle bundle) {
        ((ea.a) this.f4606b).f9324a.c(bundle);
    }

    public String e(b.a aVar) {
        String str;
        boolean z10 = false;
        switch (this.f4605a) {
            case 0:
                u uVar = (u) this.f4606b;
                uVar.getClass();
                try {
                    uVar.f15865c.execute(new n(1, uVar, aVar));
                    return "isMeteringRepeatingAttached";
                } catch (RejectedExecutionException unused) {
                    aVar.b(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
                    return "isMeteringRepeatingAttached";
                }
            case 1:
                ((c0.f) this.f4606b).f15638a.f15764j.a(aVar, true);
                return "TorchOn";
            case 2:
                y0 y0Var = (y0) this.f4606b;
                synchronized (y0Var.f15940a) {
                    if (y0Var.f15953n == null) {
                        z10 = true;
                    }
                    g0.E("Release completer expected to be null", z10);
                    y0Var.f15953n = aVar;
                    str = "Release[session=" + y0Var + "]";
                }
                return str;
            case 4:
                s sVar = (s) this.f4606b;
                sVar.f17770d = aVar;
                return "WaitForRepeatingRequestStart[" + sVar + "]";
            case 5:
                b0.c cVar = (b0.c) this.f4606b;
                cVar.f3865d.execute(new n(6, cVar, aVar));
                return "clearCaptureRequestOptions";
            case 6:
                ((x) this.f4606b).f9063e = aVar;
                return "CaptureCompleteFuture";
            case 7:
                DeferrableSurface deferrableSurface = (DeferrableSurface) this.f4606b;
                synchronized (deferrableSurface.f1313a) {
                    deferrableSurface.f1316d = aVar;
                }
                return "DeferrableSurface-termination(" + deferrableSurface + ")";
            default:
                v8.a aVar2 = (v8.a) this.f4606b;
                f.e(false, aVar2, aVar, j7.a.x());
                return "nonCancellationPropagating[" + aVar2 + "]";
        }
    }

    public void f(za.b bVar) {
        fa.c cVar = (fa.c) this.f4606b;
        cVar.getClass();
        Log.isLoggable("FirebaseCrashlytics", 3);
        cVar.f10074b.set((fa.a) bVar.get());
    }

    public w0 g(View view, w0 w0Var) {
        switch (this.f4605a) {
            case 13:
                SearchView.e((SearchView) this.f4606b, w0Var);
                return w0Var;
            default:
                StepThreePersonalActivity stepThreePersonalActivity = (StepThreePersonalActivity) this.f4606b;
                int i10 = StepThreePersonalActivity.f19534a0;
                sk.j.f(stepThreePersonalActivity, "this$0");
                sk.j.f(view, "v");
                n1.e a10 = w0Var.a(7);
                sk.j.e(a10, "getInsets(...)");
                view.setPadding(stepThreePersonalActivity.getResources().getDimensionPixelSize(R$dimen.dp_20), a10.f13428b, stepThreePersonalActivity.getResources().getDimensionPixelSize(R$dimen.dp_20), a10.f13430d);
                return w0Var;
        }
    }

    public Object k(s sVar) {
        switch (this.f4605a) {
            case 0:
                return this.f4606b;
            default:
                return RemoteConfigRegistrar.lambda$getComponents$0((r) this.f4606b, sVar);
        }
    }

    public void onComplete(Task task) {
        switch (this.f4605a) {
            case 0:
                ((ScheduledFuture) this.f4606b).cancel(false);
                return;
            default:
                SplashActivity splashActivity = (SplashActivity) this.f4606b;
                int i10 = SplashActivity.T;
                sk.j.f(splashActivity, "this$0");
                sk.j.f(task, "task");
                if (task.isSuccessful()) {
                    lg.b bVar = splashActivity.S;
                    if (bVar != null) {
                        bVar.f20850a.getBoolean("OnDebug", false);
                        return;
                    } else {
                        sk.j.l("sharedPrefsHelper");
                        throw null;
                    }
                } else {
                    return;
                }
        }
    }

    public void onSuccess(Object obj) {
        switch (this.f4605a) {
            case 20:
                ((RemoteConfigManager) this.f4606b).lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0((Boolean) obj);
                return;
            default:
                l lVar = (l) this.f4606b;
                sk.j.f(lVar, "$tmp0");
                lVar.invoke(obj);
                return;
        }
    }

    public void onTouchExplorationStateChanged(boolean z10) {
        boolean z11;
        k kVar = (k) this.f4606b;
        AutoCompleteTextView autoCompleteTextView = kVar.f7037h;
        if (autoCompleteTextView != null) {
            int i10 = 1;
            if (autoCompleteTextView.getInputType() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                CheckableImageButton checkableImageButton = kVar.f7077d;
                if (z10) {
                    i10 = 2;
                }
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                d0.d.s(checkableImageButton, i10);
            }
        }
    }

    public Object then(Task task) {
        switch (this.f4605a) {
            case 17:
                ExecutorService executorService = o0.f11348a;
                ((CountDownLatch) this.f4606b).countDown();
                return null;
            case 18:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f4606b;
                ExecutorService executorService2 = o0.f11348a;
                if (task.isSuccessful()) {
                    taskCompletionSource.setResult(task.getResult());
                } else if (task.getException() != null) {
                    taskCompletionSource.setException(task.getException());
                }
                return null;
            default:
                ((fb.n) this.f4606b).getClass();
                Bundle bundle = (Bundle) task.getResult(IOException.class);
                if (bundle != null) {
                    String string = bundle.getString("registration_id");
                    if (string != null || (string = bundle.getString("unregistered")) != null) {
                        return string;
                    }
                    String string2 = bundle.getString("error");
                    if ("RST".equals(string2)) {
                        throw new IOException("INSTANCE_ID_RESET");
                    } else if (string2 != null) {
                        throw new IOException(string2);
                    } else {
                        bundle.toString();
                        new Throwable();
                        throw new IOException("SERVICE_NOT_AVAILABLE");
                    }
                } else {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
        }
    }
}
