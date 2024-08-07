package v;

import al.g0;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.hardware.camera2.CameraDevice;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import androidx.camera.core.d;
import androidx.camera.core.e;
import androidx.camera.view.PreviewView;
import androidx.fragment.app.l0;
import androidx.fragment.app.strictmode.Violation;
import androidx.profileinstaller.ProfileInstallerInitializer;
import b0.c;
import c0.b0;
import c0.d1;
import c0.h;
import ca.p;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.material.R$string;
import com.google.android.material.datepicker.f0;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.perf.util.Timer;
import com.ots.base.ui.a;
import com.vpa.daugia.di.App;
import com.vpa.daugia.module.profile.ui.activity.ProfileActivity;
import com.vpa.daugia.module.profile.ui.activity.VerifyActivity;
import da.g;
import e0.i0;
import e0.w;
import e0.x;
import f0.d0;
import g0.m;
import java.io.File;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import m1.e;
import p2.a;
import p3.o0;
import sk.j;
import v.o;
import v1.a;
import w.u;
import x2.k;
import z0.b;
import z3.a;
import ze.f;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15668a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f15669b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f15670c;

    public /* synthetic */ f(int i10, Object obj, Object obj2) {
        this.f15668a = i10;
        this.f15669b = obj;
        this.f15670c = obj2;
    }

    public final void run() {
        Handler handler;
        String str;
        int i10 = 0;
        switch (this.f15668a) {
            case 0:
                f0.f fVar = (f0.f) this.f15670c;
                o.a aVar = ((o) this.f15669b).f15778x;
                aVar.f15779a.remove(fVar);
                aVar.f15780b.remove(fVar);
                return;
            case 1:
                ((Surface) this.f15669b).release();
                ((SurfaceTexture) this.f15670c).release();
                return;
            case 2:
                x1 x1Var = (x1) this.f15669b;
                Objects.requireNonNull(x1Var.f15929f);
                x1Var.f15929f.q((u1) this.f15670c);
                return;
            case 3:
                ((u.b) this.f15669b).f16254a.onOpened((CameraDevice) this.f15670c);
                return;
            case 4:
                ((c) this.f15669b).b((b.a) this.f15670c);
                return;
            case 5:
                androidx.camera.core.f fVar2 = (androidx.camera.core.f) this.f15670c;
                b0.d dVar = b0.f4184s;
                ((androidx.camera.core.f) this.f15669b).a();
                if (fVar2 != null) {
                    fVar2.a();
                    return;
                }
                return;
            case 6:
                e eVar = (e) this.f15669b;
                eVar.getClass();
                ((d0.a) this.f15670c).f(eVar);
                return;
            case 7:
                int i11 = d1.f4212m;
                ((d1.e) this.f15669b).c((d1.d) this.f15670c);
                return;
            case 8:
                int i12 = d1.f4212m;
                ((a) this.f15669b).accept(new h(3, (Surface) this.f15670c));
                return;
            case 9:
                d dVar2 = (d) this.f15670c;
                x xVar = (x) ((w) this.f15669b).f9055e;
                xVar.getClass();
                m.a();
                if (!xVar.f9065g) {
                    g0.E("onImageCaptured() must be called before onFinalResult()", xVar.f9061c.isDone());
                    xVar.a();
                    i0 i0Var = xVar.f9059a;
                    i0Var.a().execute(new f(10, i0Var, dVar2));
                    return;
                }
                return;
            case 10:
                Objects.requireNonNull(((i0) this.f15669b).d());
                Objects.requireNonNull((d) this.f15670c);
                return;
            case 11:
                PreviewView.this.f1465s.a((d1) this.f15670c);
                return;
            case 12:
                ((SurfaceTexture) this.f15670c).getTimestamp();
                ((PreviewView.d) this.f15669b).a();
                return;
            case 13:
                androidx.constraintlayout.motion.widget.c cVar = (androidx.constraintlayout.motion.widget.c) this.f15669b;
                View[] viewArr = (View[]) this.f15670c;
                if (cVar.f1722p != -1) {
                    for (View tag : viewArr) {
                        tag.setTag(cVar.f1722p, Long.valueOf(System.nanoTime()));
                    }
                }
                if (cVar.f1723q != -1) {
                    int length = viewArr.length;
                    while (i10 < length) {
                        viewArr[i10].setTag(cVar.f1723q, (Object) null);
                        i10++;
                    }
                    return;
                }
                return;
            case 14:
                ((e.C0160e) this.f15669b).d((Typeface) this.f15670c);
                return;
            case 15:
                l0 l0Var = (l0) this.f15669b;
                l0.a aVar2 = (l0.a) this.f15670c;
                j.f(l0Var, "this$0");
                j.f(aVar2, "$operation");
                l0Var.f2664b.remove(aVar2);
                l0Var.f2665c.remove(aVar2);
                return;
            case 16:
                a.c cVar2 = (a.c) this.f15669b;
                a.c cVar3 = p2.a.f13907a;
                j.f(cVar2, "$policy");
                j.f((Violation) this.f15670c, "$violation");
                cVar2.getClass();
                throw null;
            case 17:
                Context context = (Context) this.f15670c;
                ((ProfileInstallerInitializer) this.f15669b).getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = ProfileInstallerInitializer.b.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new d.h(context, 16), (long) (new Random().nextInt(Math.max(1000, 1)) + 5000));
                return;
            case 18:
                k kVar = (k) this.f15669b;
                j.f(kVar, "this$0");
                j.f((String) this.f15670c, "$sql");
                kVar.getClass();
                throw null;
            case 19:
                v8.a aVar3 = (v8.a) this.f15670c;
                if (((o0) this.f15669b).f13992w.f17841a instanceof a.b) {
                    aVar3.cancel(true);
                    return;
                }
                return;
            case 20:
                List<t3.a> list = (List) this.f15669b;
                v3.f fVar3 = (v3.f) this.f15670c;
                j.f(list, "$listenersList");
                j.f(fVar3, "this$0");
                for (t3.a a10 : list) {
                    a10.a(fVar3.f16023e);
                }
                return;
            case 21:
                int i13 = JobInfoSchedulerService.f5202a;
                ((JobInfoSchedulerService) this.f15669b).jobFinished((JobParameters) this.f15670c, false);
                return;
            case 22:
                com.google.android.material.datepicker.d dVar3 = (com.google.android.material.datepicker.d) this.f15669b;
                TextInputLayout textInputLayout = dVar3.f6137a;
                DateFormat dateFormat = dVar3.f6139c;
                Context context2 = textInputLayout.getContext();
                textInputLayout.setError(context2.getString(R$string.mtrl_picker_invalid_format) + "\n" + String.format(context2.getString(R$string.mtrl_picker_invalid_format_use), new Object[]{((String) this.f15670c).replace(' ', 160)}) + "\n" + String.format(context2.getString(R$string.mtrl_picker_invalid_format_example), new Object[]{dateFormat.format(new Date(f0.h().getTimeInMillis())).replace(' ', 160)}));
                dVar3.a();
                return;
            case 23:
                p pVar = (p) this.f15669b;
                za.b bVar = (za.b) this.f15670c;
                synchronized (pVar) {
                    if (pVar.f4654b == null) {
                        pVar.f4653a.add(bVar);
                    } else {
                        pVar.f4654b.add(bVar.get());
                    }
                }
                return;
            case 24:
                Runnable runnable = (Runnable) this.f15669b;
                g.b bVar2 = (g.b) this.f15670c;
                try {
                    runnable.run();
                    g.this.p(null);
                    return;
                } catch (Exception e10) {
                    g.this.q(e10);
                    return;
                }
            case 25:
                qb.a aVar4 = (qb.a) this.f15669b;
                lb.a aVar5 = qb.a.f14388g;
                tb.e b10 = aVar4.b((Timer) this.f15670c);
                if (b10 != null) {
                    aVar4.f14390a.add(b10);
                    return;
                }
                return;
            case 26:
                rb.d dVar4 = (rb.d) this.f15669b;
                rb.b bVar3 = (rb.b) this.f15670c;
                lb.a aVar6 = rb.d.f14545y;
                dVar4.getClass();
                dVar4.e(bVar3.f14525a, bVar3.f14526b);
                return;
            case 27:
                com.ots.base.ui.a aVar7 = (com.ots.base.ui.a) this.f15669b;
                gf.b bVar4 = (gf.b) this.f15670c;
                j.f(aVar7, "this$0");
                j.f(bVar4, "$item");
                ArrayList arrayList = new ArrayList();
                Iterator<gf.b> it = aVar7.F0.iterator();
                int i14 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i14 = -1;
                    } else if (!j.a(it.next().b(), bVar4.b())) {
                        i14++;
                    }
                }
                ArrayList<gf.b> arrayList2 = aVar7.F0;
                int size = arrayList2.size() - 1;
                if (size >= 0) {
                    int i15 = 0;
                    while (true) {
                        arrayList2.get(i15).f10499c = false;
                        if (i15 != size) {
                            i15++;
                        }
                    }
                }
                if (i14 != -1) {
                    aVar7.F0.get(i14).f10499c = true;
                }
                arrayList.addAll(aVar7.F0);
                a.C0079a aVar8 = aVar7.G0;
                if (aVar8 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Model add : aVar7.u0().f9444f) {
                        arrayList3.add(add);
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (((gf.b) next).f10499c) {
                            arrayList4.add(next);
                        }
                    }
                    Iterator it3 = arrayList4.iterator();
                    String str2 = "";
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        int i16 = i10 + 1;
                        if (i10 >= 0) {
                            gf.b bVar5 = (gf.b) next2;
                            if (bVar5.f10499c) {
                                StringBuilder q10 = android.support.v4.media.a.q(str2);
                                if (i10 != arrayList4.size() - 1) {
                                    str = bVar5.a() + "; ";
                                } else {
                                    str = bVar5.a();
                                }
                                q10.append(str);
                                str2 = q10.toString();
                            }
                            i10 = i16;
                        } else {
                            j7.a.x0();
                            throw null;
                        }
                    }
                    aVar8.a(arrayList, str2);
                    aVar7.o0();
                    return;
                }
                j.l("onActionDone");
                throw null;
            case 28:
                ai.j jVar = (ai.j) this.f15669b;
                Intent intent = (Intent) this.f15670c;
                int i17 = ai.j.f18980n0;
                j.f(jVar, "this$0");
                j.f(intent, "$webIntent");
                jVar.h0(intent);
                return;
            default:
                VerifyActivity verifyActivity = (VerifyActivity) this.f15669b;
                j.f(verifyActivity, "this$0");
                App.a aVar9 = App.f19364o;
                App a11 = aVar9.a();
                Uri fromFile = Uri.fromFile(new File(verifyActivity.V));
                j.e(fromFile, "fromFile(...)");
                a11.f19367e = kf.e.k(verifyActivity, fromFile);
                App a12 = aVar9.a();
                Uri fromFile2 = Uri.fromFile(new File(verifyActivity.W));
                j.e(fromFile2, "fromFile(...)");
                a12.f19368f = kf.e.k(verifyActivity, fromFile2);
                Intent intent2 = new Intent(verifyActivity, ProfileActivity.class);
                intent2.setFlags(268435456);
                intent2.putExtra("DATA_VERIFY", new bc.h().i(((f.c) ((ze.f) this.f15670c)).f18006a));
                intent2.putExtra("ON_VERIFY_PROFILE", verifyActivity.S);
                verifyActivity.startActivity(intent2);
                verifyActivity.finish();
                return;
        }
    }
}
