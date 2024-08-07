package c0;

import al.g0;
import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.p;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.u;
import c6.e;
import ca.f;
import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.navigation.NavigationBarView;
import com.google.firebase.abt.AbtException;
import com.google.firebase.messaging.c;
import com.google.firebase.remoteconfig.internal.b;
import com.vpa.daugia.ui.splash.SplashActivity;
import com.vpa.daugia.ui.splash.SplashViewModel;
import f0.b0;
import f0.d0;
import f0.i;
import fk.h;
import i6.c;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import l6.l;
import m6.o;
import mg.e3;
import n0.u;
import n6.a;
import org.json.JSONArray;
import org.json.JSONException;
import p.a;
import p0.a;
import sk.j;
import ua.d;
import v.c0;
import v.k0;
import v.o1;
import v.r1;
import v.v;
import v.y0;
import w1.q;
import w1.w0;
import xb.r;
import xb.s;
import y4.g;
import z0.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class q0 implements d0.a, f, OnCompleteListener, g, b.c, o1.c, a, a.C0174a, a.C0164a, o.a, SuccessContinuation, ha.b, Continuation, e, q, x5.e, x5.g, NavigationBarView.c, i0.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4315a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4316b;

    public /* synthetic */ q0(Object obj, int i10) {
        this.f4315a = i10;
        this.f4316b = obj;
    }

    public void a() {
        ph.a aVar = (ph.a) this.f4316b;
        j.f(aVar, "this$0");
        ((PDFView) aVar.f22642i.f21381f).r();
    }

    public Object apply(Object obj) {
        boolean z10 = true;
        switch (this.f4315a) {
            case 2:
                r1 r1Var = (r1) this.f4316b;
                Void voidR = (Void) obj;
                y0 y0Var = r1Var.f15820d;
                if (r1Var.f15824h != 2) {
                    z10 = false;
                }
                StringBuilder q10 = android.support.v4.media.a.q("Invalid state state:");
                q10.append(v.j(r1Var.f15824h));
                g0.y(q10.toString(), z10);
                List<DeferrableSurface> b10 = r1Var.f15823g.b();
                ArrayList arrayList = new ArrayList();
                for (DeferrableSurface next : b10) {
                    g0.y("Surface must be SessionProcessorSurface", next instanceof f0.q0);
                    arrayList.add((f0.q0) next);
                }
                new k0(y0Var, arrayList);
                r1Var.getClass();
                p0.a("ProcessingCaptureSession");
                r1Var.f15817a.i();
                r1Var.f15824h = 3;
                u uVar = r1Var.f15822f;
                if (uVar != null) {
                    r1Var.h(uVar);
                }
                if (r1Var.f15825i != null) {
                    r1Var.f(r1Var.f15825i);
                    r1Var.f15825i = null;
                }
                return null;
            case 9:
                Map map = (Map) this.f4316b;
                Cursor cursor = (Cursor) obj;
                c6.b bVar = o.f13164f;
                while (cursor.moveToNext()) {
                    long j10 = cursor.getLong(0);
                    Set set = (Set) map.get(Long.valueOf(j10));
                    if (set == null) {
                        set = new HashSet();
                        map.put(Long.valueOf(j10), set);
                    }
                    set.add(new o.b(cursor.getString(1), cursor.getString(2)));
                }
                return null;
            case 10:
                o oVar = (o) this.f4316b;
                Cursor cursor2 = (Cursor) obj;
                c6.b bVar2 = o.f13164f;
                oVar.getClass();
                while (cursor2.moveToNext()) {
                    oVar.d((long) cursor2.getInt(0), c.a.MAX_RETRIES_REACHED, cursor2.getString(1));
                }
                return null;
            default:
                r rVar = (r) obj;
                ((xb.j) this.f4316b).getClass();
                d dVar = s.f17251a;
                dVar.getClass();
                StringWriter stringWriter = new StringWriter();
                try {
                    dVar.a(rVar, stringWriter);
                } catch (IOException unused) {
                }
                String stringWriter2 = stringWriter.toString();
                j.e(stringWriter2, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
                byte[] bytes = stringWriter2.getBytes(yk.a.f23582b);
                j.e(bytes, "this as java.lang.String).getBytes(charset)");
                return bytes;
        }
    }

    public Map b() {
        switch (this.f4315a) {
            case 0:
                p002if.c cVar = (p002if.c) this.f4316b;
                j.f(cVar, "this$0");
                StringBuilder q10 = android.support.v4.media.a.q("Bearer ");
                q10.append(cVar.f11438q);
                return h.u0(new ek.e("Authorization", q10.toString()), new ek.e("Csrf", "MTcwOTEwMzU4NzI4MQ=="), new ek.e("App", "Mobile"));
            default:
                String str = (String) this.f4316b;
                j.f(str, "$token");
                return h.u0(new ek.e("Authorization", b0.r("Bearer ", str)), new ek.e("Csrf", "MTcwOTEwMzU4NzI4MQ=="), new ek.e("App", "Mobile"));
        }
    }

    public void c(ha.a aVar) {
        ea.a aVar2 = (ea.a) this.f4316b;
        synchronized (aVar2) {
            if (aVar2.f9325b instanceof ha.c) {
                aVar2.f9326c.add(aVar);
            }
            aVar2.f9325b.c(aVar);
        }
    }

    public Object d() {
        switch (this.f4315a) {
            case 5:
                return Integer.valueOf(((m6.d) this.f4316b).e());
            case 6:
                ((l6.j) this.f4316b).f12751i.i();
                return null;
            case 7:
                return ((m6.c) this.f4316b).q();
            default:
                l lVar = (l) this.f4316b;
                for (f6.s a10 : lVar.f12762b.C()) {
                    lVar.f12763c.a(a10, 1);
                }
                return null;
        }
    }

    public String e(b.a aVar) {
        switch (this.f4315a) {
            case 0:
                v.o oVar = (v.o) this.f4316b;
                oVar.f15757c.execute(new p(2, oVar, aVar));
                return "updateSessionConfigAsync";
            default:
                u.a aVar2 = (u.a) this.f4316b;
                aVar2.f13405p = aVar;
                StringBuilder q10 = android.support.v4.media.a.q("SettableFuture hashCode: ");
                q10.append(aVar2.hashCode());
                return q10.toString();
        }
    }

    public void f(d0 d0Var) {
        switch (this.f4315a) {
            case 0:
                androidx.camera.core.e eVar = (androidx.camera.core.e) this.f4316b;
                synchronized (eVar.f1287a) {
                    eVar.f1289c++;
                }
                eVar.l(d0Var);
                return;
            default:
                e0.l lVar = (e0.l) this.f4316b;
                lVar.getClass();
                try {
                    androidx.camera.core.d d10 = d0Var.d();
                    if (d10 != null) {
                        lVar.b(d10);
                        return;
                    } else {
                        lVar.d(new ImageCaptureException("Failed to acquire latest image", (Throwable) null));
                        return;
                    }
                } catch (IllegalStateException e10) {
                    lVar.d(new ImageCaptureException("Failed to acquire latest image", e10));
                    return;
                }
        }
    }

    public w0 g(View view, w0 w0Var) {
        ch.b bVar = (ch.b) this.f4316b;
        int i10 = ch.b.f19177q0;
        j.f(bVar, "this$0");
        j.f(view, "v");
        n1.e a10 = w0Var.a(7);
        j.e(a10, "getInsets(...)");
        ((e3) bVar.i0()).f21042w.setPadding(a10.f13427a, a10.f13428b, a10.f13429c, a10.f13430d);
        return w0Var;
    }

    public void h(int i10) {
        Context context = (Context) this.f4316b;
        j.f(context, "$context");
        Toast.makeText(context, "Error while opening page" + i10, 1).show();
    }

    public Object k(ca.s sVar) {
        switch (this.f4315a) {
            case 0:
                return this.f4316b;
            default:
                return new xa.b((Context) sVar.a(Context.class), ((m9.d) sVar.a(m9.d.class)).f(), sVar.h(xa.c.class), sVar.c(ub.g.class), (Executor) sVar.d((ca.r) this.f4316b));
        }
    }

    public void onComplete(Task task) {
        switch (this.f4315a) {
            case 0:
                ((c.a) this.f4316b).f7622b.trySetResult(null);
                return;
            default:
                SplashActivity splashActivity = (SplashActivity) this.f4316b;
                int i10 = SplashActivity.T;
                j.f(splashActivity, "this$0");
                j.f(task, "task");
                if (task.isSuccessful()) {
                    String str = (String) task.getResult();
                    j.c(str);
                    lg.b bVar = ((SplashViewModel) splashActivity.R.getValue()).f19927d;
                    bVar.getClass();
                    bVar.f20850a.edit().putString("FCM_TOKEN", str).apply();
                    return;
                }
                return;
        }
    }

    public Task then(Object obj) {
        switch (this.f4315a) {
            case 11:
                u9.a aVar = (u9.a) this.f4316b;
                int i10 = u9.a.f15399d;
                aVar.getClass();
                return Tasks.call(aVar.f15401b, new com.airbnb.lottie.h(1, aVar, new u9.b((String) obj, 0)));
            default:
                wb.d dVar = (wb.d) obj;
                int[] iArr = com.google.firebase.remoteconfig.internal.b.f7686j;
                return Tasks.forResult((b.a) this.f4316b);
        }
    }

    public Object then(Task task) {
        boolean z10;
        vb.e eVar = (vb.e) this.f4316b;
        eVar.getClass();
        if (task.isSuccessful()) {
            wb.c cVar = eVar.f16145d;
            synchronized (cVar) {
                cVar.f16762c = Tasks.forResult(null);
            }
            wb.h hVar = cVar.f16761b;
            synchronized (hVar) {
                hVar.f16786a.deleteFile(hVar.f16787b);
            }
            if (task.getResult() != null) {
                JSONArray jSONArray = ((wb.d) task.getResult()).f16768d;
                if (eVar.f16143b != null) {
                    try {
                        eVar.f16143b.c(vb.e.f(jSONArray));
                    } catch (AbtException | JSONException unused) {
                    }
                }
            }
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    /* renamed from: apply  reason: collision with other method in class */
    public v8.a m0apply(Object obj) {
        switch (this.f4315a) {
            case 0:
                c0.c cVar = (c0.c) this.f4316b;
                cVar.getClass();
                if (!Boolean.TRUE.equals((Boolean) obj)) {
                    return i0.f.c((Object) null);
                }
                long j10 = cVar.f15627f;
                v.o oVar = cVar.f15624c;
                kh.h hVar = new kh.h(1);
                Set<i> set = c0.f15602h;
                c0.e eVar = new c0.e(j10, hVar);
                oVar.i(eVar);
                return eVar.f15632b;
            default:
                Void voidR = (Void) obj;
                long j11 = c0.f.f15636e;
                v.o oVar2 = ((c0.f) this.f4316b).f15638a;
                kh.h hVar2 = new kh.h(2);
                Set<i> set2 = c0.f15602h;
                c0.e eVar2 = new c0.e(j11, hVar2);
                oVar2.i(eVar2);
                return eVar2.f15632b;
        }
    }
}
