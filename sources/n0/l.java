package n0;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.vpa.daugia.di.App;
import dk.a;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.Timer;
import ng.p;
import rl.g;
import sk.j;
import sl.c;
import sl.h;
import ze.f;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class l implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f13351a = {2, 1, 4, 3};

    public static /* synthetic */ int a(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 0;
        }
        if (i10 == 3) {
            return 3;
        }
        if (i10 == 4) {
            return 2;
        }
        throw null;
    }

    public static /* synthetic */ String b(int i10) {
        if (i10 == 1) {
            return "_fstec";
        }
        if (i10 == 2) {
            return "_fsntc";
        }
        if (i10 == 3) {
            return "_tsns";
        }
        if (i10 == 4) {
            return "_fr_tot";
        }
        if (i10 == 5) {
            return "_fr_slo";
        }
        if (i10 == 6) {
            return "_fr_fzn";
        }
        throw null;
    }

    public static /* synthetic */ String c(int i10) {
        if (i10 == 1) {
            return "_as";
        }
        if (i10 == 2) {
            return "_astui";
        }
        if (i10 == 3) {
            return "_astfd";
        }
        if (i10 == 4) {
            return "_asti";
        }
        if (i10 == 5) {
            return "_fs";
        }
        if (i10 == 6) {
            return "_bs";
        }
        throw null;
    }

    public static /* synthetic */ long d(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 4;
        }
        throw null;
    }

    public static /* synthetic */ String e(int i10) {
        if (i10 == 1) {
            return "BASE";
        }
        if (i10 == 2) {
            return "REALTIME";
        }
        throw null;
    }

    public static int f(String str, int i10, int i11) {
        return (str.hashCode() + i10) * i11;
    }

    public static a g(p pVar, int i10) {
        return ij.a.a(new p.a(pVar, i10));
    }

    public static String h(long j10, SimpleDateFormat simpleDateFormat) {
        return simpleDateFormat.format(new Date(j10));
    }

    public static String i(String str, long j10) {
        return str + j10;
    }

    public static String j(String str, g gVar) {
        return str + gVar;
    }

    public static String k(StringBuilder sb2, String str, char c10) {
        sb2.append(str);
        sb2.append(c10);
        return sb2.toString();
    }

    public static StringBuilder l(String str, int i10, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(i10);
        sb2.append(str2);
        return sb2;
    }

    public static /* synthetic */ Iterator m() {
        try {
            return Arrays.asList(new h[]{new c()}).iterator();
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }

    public static Timer n(Timer timer) {
        timer.cancel();
        return new Timer();
    }

    public static /* synthetic */ void o(int i10, String str) {
        if (i10 == 0) {
            NullPointerException nullPointerException = new NullPointerException(j.i(str));
            j.j(j.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    public static void p(Exception exc, r2.p pVar) {
        pVar.k(new f.a(exc));
    }

    public static /* synthetic */ String q(int i10) {
        if (i10 == 1) {
            return "NOT_REQUIRED";
        }
        if (i10 == 2) {
            return "CONNECTED";
        }
        if (i10 == 3) {
            return "UNMETERED";
        }
        if (i10 == 4) {
            return "NOT_ROAMING";
        }
        if (i10 == 5) {
            return "METERED";
        }
        if (i10 == 6) {
            return "TEMPORARILY_UNMETERED";
        }
        throw null;
    }

    public static /* synthetic */ String r(int i10) {
        if (i10 == 1) {
            return "L";
        }
        if (i10 == 2) {
            return "M";
        }
        if (i10 == 3) {
            return "Q";
        }
        if (i10 == 4) {
            return "H";
        }
        throw null;
    }

    public static /* synthetic */ String s(int i10) {
        return i10 == 1 ? "NOT_REQUIRED" : i10 == 2 ? "CONNECTED" : i10 == 3 ? "UNMETERED" : i10 == 4 ? "NOT_ROAMING" : i10 == 5 ? "METERED" : i10 == 6 ? "TEMPORARILY_UNMETERED" : "null";
    }

    public static /* synthetic */ String t(int i10) {
        return i10 == 1 ? "NORMAL" : i10 == 2 ? "ALWAYS" : i10 == 3 ? "NEVER" : i10 == 4 ? "NOT_NEGATIVE" : i10 == 5 ? "EXCEEDS_PAD" : "null";
    }

    public static /* synthetic */ String u(int i10) {
        return i10 == 1 ? "UTC" : i10 == 2 ? "WALL" : i10 == 3 ? "STANDARD" : "null";
    }

    public static /* synthetic */ String v(int i10) {
        return i10 == 1 ? "INITIALIZE" : i10 == 2 ? "SWITCH_TO_SOURCE_SERVICE" : i10 == 3 ? "DECODE_DATA" : "null";
    }

    public static /* synthetic */ int w(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        } else if (str.equals("DEFAULT_APP_CHECK_TOKEN")) {
            return 1;
        } else {
            if (str.equals("UNKNOWN_APP_CHECK_TOKEN")) {
                return 2;
            }
            throw new IllegalArgumentException("No enum constant com.google.firebase.appcheck.internal.StorageHelper.TokenType.".concat(str));
        }
    }

    public void onComplete(Task task) {
        App.a aVar = App.f19364o;
        j.f(task, "task");
        Object result = task.getResult();
        j.e(result, "getResult(...)");
        j7.a.f11711s = (String) result;
    }
}
