package android.support.v4.media;

import android.hardware.camera2.CaptureResult;
import android.text.Editable;
import android.widget.EditText;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.o;
import androidx.camera.core.impl.q;
import androidx.camera.core.impl.r;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import c0.p0;
import ca.f;
import ca.s;
import com.google.android.gms.internal.mlkit_common.zzbk;
import com.google.android.gms.internal.mlkit_common.zzbo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzdg;
import com.google.android.gms.internal.mlkit_vision_barcode.zzdk;
import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzai;
import com.google.android.gms.internal.p001firebaseauthapi.zzzo;
import com.google.android.material.datepicker.e;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import f0.k;
import g0.g;
import java.nio.ByteBuffer;
import java.util.Objects;
import o0.b;
import o0.c;
import p3.l0;
import v.v;
import yk.l;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements f {
    public static /* synthetic */ String A(int i10) {
        return i10 == 1 ? "SUSPEND" : i10 == 2 ? "DROP_OLDEST" : i10 == 3 ? "DROP_LATEST" : "null";
    }

    public static /* synthetic */ String B(int i10) {
        return i10 == 1 ? "UNKNOWN" : i10 == 2 ? "HORIZONTAL_DIMENSION" : i10 == 3 ? "VERTICAL_DIMENSION" : i10 == 4 ? "LEFT" : i10 == 5 ? "RIGHT" : i10 == 6 ? "TOP" : i10 == 7 ? "BOTTOM" : i10 == 8 ? "BASELINE" : "null";
    }

    public static /* synthetic */ String C(int i10) {
        return i10 == 1 ? "IDLE" : i10 == 2 ? "QUEUING" : i10 == 3 ? "QUEUED" : i10 == 4 ? "RUNNING" : "null";
    }

    public static /* synthetic */ String D(int i10) {
        return i10 == 1 ? "OK" : i10 == 2 ? "BAD_CONFIG" : "null";
    }

    public static /* synthetic */ String E(int i10) {
        return i10 == 1 ? "OK" : i10 == 2 ? "BAD_CONFIG" : i10 == 3 ? "AUTH_ERROR" : "null";
    }

    public static /* synthetic */ String F(int i10) {
        return i10 == 1 ? "ERROR" : "null";
    }

    public static CaptureResult a() {
        return a();
    }

    public static void b(k kVar, g.a aVar) {
        int i10;
        int e10 = kVar.e();
        if (e10 != 1) {
            int g2 = v.g(e10);
            if (g2 == 1) {
                i10 = 32;
            } else if (g2 == 2) {
                i10 = 0;
            } else if (g2 != 3) {
                p0.g("ExifData");
                return;
            } else {
                i10 = 1;
            }
            if ((i10 & 1) == 1) {
                aVar.c("LightSource", String.valueOf(4), aVar.f10244a);
            }
            aVar.c("Flash", String.valueOf(i10), aVar.f10244a);
        }
    }

    public static /* synthetic */ String c(int i10) {
        if (i10 == 1) {
            return "AES256_GCM";
        }
        throw null;
    }

    public static /* synthetic */ String d(int i10) {
        if (i10 == 1) {
            return "AES256_SIV";
        }
        throw null;
    }

    public static float e(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) * f12) + f13;
    }

    public static zzzo f(Integer num, ByteBuffer byteBuffer) {
        return zzzo.zzb(byteBuffer.putInt(num.intValue()).array());
    }

    public static zzbo g(int i10) {
        zzbk zzbk = new zzbk();
        zzbk.zza(i10);
        return zzbk.zzb();
    }

    public static zzdk h(int i10) {
        zzdg zzdg = new zzdg();
        zzdg.zza(i10);
        return zzdg.zzb();
    }

    public static zzai i(int i10) {
        zzae zzae = new zzae();
        zzae.zza(i10);
        return zzae.zzb();
    }

    public static String j(Editable editable) {
        return l.k1(editable.toString()).toString();
    }

    public static String l(RecyclerView recyclerView, StringBuilder sb2) {
        sb2.append(recyclerView.C());
        return sb2.toString();
    }

    public static String m(String str, int i10) {
        return str + i10;
    }

    public static String n(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String o(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static StringBuilder p(char c10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c10);
        return sb2;
    }

    public static StringBuilder q(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static StringBuilder r(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static /* synthetic */ void s(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static r t(i iVar, i iVar2) {
        q qVar;
        if (iVar == null && iVar2 == null) {
            return r.G;
        }
        if (iVar2 != null) {
            qVar = q.M(iVar2);
        } else {
            qVar = q.L();
        }
        if (iVar != null) {
            for (i.a<?> u10 : iVar.d()) {
                u(qVar, iVar2, iVar, u10);
            }
        }
        return r.K(qVar);
    }

    public static void u(q qVar, i iVar, i iVar2, i.a aVar) {
        if (Objects.equals(aVar, o.f1389n)) {
            b bVar = (b) iVar2.e(aVar, null);
            b bVar2 = (b) iVar.e(aVar, null);
            i.b v2 = iVar2.v(aVar);
            if (bVar == null) {
                bVar = bVar2;
            } else if (bVar2 != null) {
                l0 l0Var = bVar2.f13613a;
                c cVar = bVar2.f13614b;
                bVar2.getClass();
                int i10 = bVar2.f13615c;
                l0 l0Var2 = bVar.f13613a;
                if (l0Var2 != null) {
                    l0Var = l0Var2;
                }
                c cVar2 = bVar.f13614b;
                if (cVar2 != null) {
                    cVar = cVar2;
                }
                bVar.getClass();
                int i11 = bVar.f13615c;
                if (i11 != 0) {
                    i10 = i11;
                }
                bVar = new b(l0Var, cVar, (o0.a) null, i10);
            }
            qVar.N(aVar, v2, bVar);
            return;
        }
        qVar.N(aVar, iVar2.v(aVar), iVar2.a(aVar));
    }

    public static void v(EditText... editTextArr) {
        if (editTextArr.length != 0) {
            e eVar = new e(editTextArr, 0);
            for (EditText onFocusChangeListener : editTextArr) {
                onFocusChangeListener.setOnFocusChangeListener(eVar);
            }
            EditText editText = editTextArr[0];
            editText.postDelayed(new w1.v(2, editText), 100);
        }
    }

    public static /* synthetic */ String w(int i10) {
        return i10 == 1 ? "STRING" : i10 == 2 ? "STRING_SET" : i10 == 3 ? "INT" : i10 == 4 ? "LONG" : i10 == 5 ? "FLOAT" : i10 == 6 ? "BOOLEAN" : "null";
    }

    public static /* synthetic */ String x(int i10) {
        return i10 == 1 ? "AES256_GCM" : "null";
    }

    public static /* synthetic */ String y(int i10) {
        return i10 == 1 ? "PENDING_OPEN" : i10 == 2 ? "OPENING" : i10 == 3 ? "OPEN" : i10 == 4 ? "CLOSING" : i10 == 5 ? "CLOSED" : "null";
    }

    public static /* synthetic */ String z(int i10) {
        return i10 == 1 ? "ATTEMPT_MIGRATION" : i10 == 2 ? "NOT_GENERATED" : i10 == 3 ? "UNREGISTERED" : i10 == 4 ? "REGISTERED" : i10 == 5 ? "REGISTER_ERROR" : "null";
    }

    public Object k(s sVar) {
        return ExecutorsRegistrar.f7568c.get();
    }
}
