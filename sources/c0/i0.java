package c0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.util.JsonReader;
import android.view.View;
import c0.j0;
import ca.g;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.internal.h;
import com.google.android.material.textfield.TextInputLayout;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.i;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.ots.core.base.BaseActivity;
import com.vpa.daugia.module.auction.ui.activity.DetailAuctionResultActivity;
import com.vpa.daugia.module.auth.ui.activity.ChangePasswordActivity;
import com.vpa.daugia.module.auth.ui.activity.OtpActivity;
import com.vpa.daugia.module.common.ui.activity.WebViewActivity;
import d9.b;
import d9.p;
import d9.s;
import d9.u;
import da.l;
import f6.w;
import i9.n;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import ka.r;
import l8.c;
import l8.m;
import la.a;
import m6.o;
import n0.j;
import n1.e;
import p.a;
import ub.f;
import v.g0;
import w1.q;
import w1.w0;
import x8.n;
import x8.p;
import z.d;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i0 implements a, o.a, m.b, h.a, TextInputLayout.e, b.a, p.a, f.a, SuccessContinuation, g, a.C0157a, q, ca.f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4288a;

    public /* synthetic */ i0(int i10) {
        this.f4288a = i10;
    }

    public List a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    public Object apply(Object obj) {
        boolean z10 = false;
        switch (this.f4288a) {
            case 0:
                List list = (List) obj;
                j0.c cVar = j0.f4289v;
                return null;
            case 2:
                return new j((x) obj);
            case 3:
                Cursor cursor = (Cursor) obj;
                c6.b bVar = o.f13164f;
                if (!cursor.moveToNext()) {
                    return null;
                }
                return Long.valueOf(cursor.getLong(0));
            case 4:
                c6.b bVar2 = o.f13164f;
                if (((Cursor) obj).getCount() > 0) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            default:
                return Boolean.valueOf(((Cursor) obj).moveToNext());
        }
    }

    public androidx.fragment.app.o b(u uVar) {
        p.a aVar;
        s sVar = (s) uVar;
        d9.m mVar = x8.q.f17145a;
        if (sVar.f8805a.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                n J = n.J(sVar.f8807c, i.a());
                if (J.H() == 0) {
                    int size = J.G().size();
                    if (size != 16) {
                        if (size != 32) {
                            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(size)}));
                        }
                    }
                    Integer valueOf = Integer.valueOf(size);
                    i9.i0 i0Var = sVar.f8809e;
                    int ordinal = i0Var.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                aVar = p.a.f17143d;
                            } else if (ordinal != 4) {
                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i0Var.a());
                            }
                        }
                        aVar = p.a.f17142c;
                    } else {
                        aVar = p.a.f17141b;
                    }
                    if (valueOf != null) {
                        x8.p pVar = new x8.p(valueOf.intValue(), aVar);
                        n.a aVar2 = new n.a();
                        aVar2.f17135a = pVar;
                        aVar2.f17136b = new d((Object) l9.a.a(J.G().s()));
                        aVar2.f17137c = sVar.f8810f;
                        return aVar2.a();
                    }
                    throw new GeneralSecurityException("Key size is not set");
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (InvalidProtocolBufferException unused) {
                throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
        }
    }

    public Object c(JsonReader jsonReader) {
        switch (this.f4288a) {
            case 22:
                return la.a.b(jsonReader);
            case 23:
                ua.d dVar = la.a.f12898a;
                r.a aVar = new r.a();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    char c10 = 65535;
                    switch (nextName.hashCode()) {
                        case -1266514778:
                            if (nextName.equals("frames")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 3373707:
                            if (nextName.equals("name")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 2125650548:
                            if (nextName.equals("importance")) {
                                c10 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            aVar.f12398c = la.a.d(jsonReader, new g0(23));
                            break;
                        case 1:
                            String nextString = jsonReader.nextString();
                            if (nextString != null) {
                                aVar.f12396a = nextString;
                                break;
                            } else {
                                throw new NullPointerException("Null name");
                            }
                        case 2:
                            aVar.f12397b = Integer.valueOf(jsonReader.nextInt());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return aVar.a();
            default:
                return la.a.a(jsonReader);
        }
    }

    public String d(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        if (i10 < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
            return "";
        }
        return "embedded";
    }

    public void e(ValueAnimator valueAnimator, View view) {
        switch (this.f4288a) {
            case 7:
                Float f10 = (Float) valueAnimator.getAnimatedValue();
                view.setScaleX(f10.floatValue());
                view.setScaleY(f10.floatValue());
                return;
            default:
                view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }

    public Object f(androidx.fragment.app.o oVar) {
        e9.g gVar = (e9.g) oVar;
        return new f9.b();
    }

    public w0 g(View view, w0 w0Var) {
        switch (this.f4288a) {
            case 25:
                int i10 = BaseActivity.N;
                sk.j.f(view, "v");
                e a10 = w0Var.a(7);
                sk.j.e(a10, "getInsets(...)");
                view.setPadding(a10.f13427a, a10.f13428b, a10.f13429c, a10.f13430d);
                return w0Var;
            case 26:
                int i11 = DetailAuctionResultActivity.U;
                sk.j.f(view, "v");
                e a11 = w0Var.a(7);
                sk.j.e(a11, "getInsets(...)");
                view.setPadding(a11.f13427a, a11.f13428b, a11.f13429c, a11.f13430d);
                return w0Var;
            case 27:
                int i12 = ChangePasswordActivity.Y;
                sk.j.f(view, "v");
                e a12 = w0Var.a(7);
                sk.j.e(a12, "getInsets(...)");
                view.setPadding(a12.f13427a, a12.f13428b, a12.f13429c, a12.f13430d);
                return w0Var;
            case 28:
                int i13 = OtpActivity.V;
                sk.j.f(view, "v");
                e a13 = w0Var.a(7);
                sk.j.e(a13, "getInsets(...)");
                view.setPadding(a13.f13427a, a13.f13428b, a13.f13429c, a13.f13430d);
                return w0Var;
            default:
                int i14 = WebViewActivity.O;
                sk.j.f(view, "v");
                e a14 = w0Var.a(7);
                sk.j.e(a14, "getInsets(...)");
                view.setPadding(a14.f13427a, a14.f13428b, a14.f13429c, a14.f13430d);
                return w0Var;
        }
    }

    public l8.d h(l8.d dVar) {
        int i10 = MaskableFrameLayout.f5955f;
        if (dVar instanceof l8.a) {
            return new c(((l8.a) dVar).f12772a);
        }
        return dVar;
    }

    public Object k(ca.s sVar) {
        switch (this.f4288a) {
            case 0:
                return ExecutorsRegistrar.f7566a.get();
            case 1:
                ca.o<ScheduledExecutorService> oVar = ExecutorsRegistrar.f7566a;
                return l.f8863a;
            case 2:
                return w.b((Context) sVar.a(Context.class));
            case 3:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(sVar);
            case 4:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(sVar);
            case 5:
                return FirebasePerfRegistrar.providesFirebasePerformance(sVar);
            default:
                return FirebaseSessionsRegistrar.m10getComponents$lambda0(sVar);
        }
    }

    public Task then(Object obj) {
        return Tasks.forResult(v9.b.J((v9.a) obj));
    }
}
