package x;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import v.y1;
import x.g;
import x.h;
import x.i;

/* compiled from: SessionConfigurationCompat */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final c f16846a;

    /* compiled from: SessionConfigurationCompat */
    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final SessionConfiguration f16847a;

        /* renamed from: b  reason: collision with root package name */
        public final List<f> f16848b;

        public a(ArrayList arrayList, Executor executor, y1 y1Var) {
            g gVar;
            SessionConfiguration sessionConfiguration = new SessionConfiguration(0, l.a(arrayList), executor, y1Var);
            this.f16847a = sessionConfiguration;
            List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
            ArrayList arrayList2 = new ArrayList(outputConfigurations.size());
            for (OutputConfiguration next : outputConfigurations) {
                f fVar = null;
                if (next != null) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 33) {
                        gVar = new j(next);
                    } else if (i10 >= 28) {
                        gVar = new i(new i.a(next));
                    } else if (i10 >= 26) {
                        gVar = new h(new h.a(next));
                    } else if (i10 >= 24) {
                        gVar = new g(new g.a(next));
                    } else {
                        gVar = null;
                    }
                    if (gVar != null) {
                        fVar = new f(gVar);
                    }
                }
                arrayList2.add(fVar);
            }
            this.f16848b = Collections.unmodifiableList(arrayList2);
        }

        public final e a() {
            return e.a(this.f16847a.getInputConfiguration());
        }

        public final CameraCaptureSession.StateCallback b() {
            return this.f16847a.getStateCallback();
        }

        public final Object c() {
            return this.f16847a;
        }

        public final Executor d() {
            return this.f16847a.getExecutor();
        }

        public final int e() {
            return this.f16847a.getSessionType();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            return Objects.equals(this.f16847a, ((a) obj).f16847a);
        }

        public final List<f> f() {
            return this.f16848b;
        }

        public final void g(CaptureRequest captureRequest) {
            this.f16847a.setSessionParameters(captureRequest);
        }

        public final void h(e eVar) {
            this.f16847a.setInputConfiguration(eVar.f16826a.a());
        }

        public final int hashCode() {
            return this.f16847a.hashCode();
        }
    }

    /* compiled from: SessionConfigurationCompat */
    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public final List<f> f16849a;

        /* renamed from: b  reason: collision with root package name */
        public final CameraCaptureSession.StateCallback f16850b;

        /* renamed from: c  reason: collision with root package name */
        public final Executor f16851c;

        /* renamed from: d  reason: collision with root package name */
        public final int f16852d = 0;

        /* renamed from: e  reason: collision with root package name */
        public e f16853e = null;

        public b(ArrayList arrayList, Executor executor, y1 y1Var) {
            this.f16849a = Collections.unmodifiableList(new ArrayList(arrayList));
            this.f16850b = y1Var;
            this.f16851c = executor;
        }

        public final e a() {
            return this.f16853e;
        }

        public final CameraCaptureSession.StateCallback b() {
            return this.f16850b;
        }

        public final Object c() {
            return null;
        }

        public final Executor d() {
            return this.f16851c;
        }

        public final int e() {
            return this.f16852d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Objects.equals(this.f16853e, bVar.f16853e) && this.f16852d == bVar.f16852d && this.f16849a.size() == bVar.f16849a.size()) {
                    for (int i10 = 0; i10 < this.f16849a.size(); i10++) {
                        if (!this.f16849a.get(i10).equals(bVar.f16849a.get(i10))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public final List<f> f() {
            return this.f16849a;
        }

        public final void g(CaptureRequest captureRequest) {
        }

        public final void h(e eVar) {
            if (this.f16852d != 1) {
                this.f16853e = eVar;
                return;
            }
            throw new UnsupportedOperationException("Method not supported for high speed session types");
        }

        public final int hashCode() {
            int i10;
            int hashCode = this.f16849a.hashCode() ^ 31;
            int i11 = (hashCode << 5) - hashCode;
            e eVar = this.f16853e;
            if (eVar == null) {
                i10 = 0;
            } else {
                i10 = eVar.hashCode();
            }
            int i12 = i10 ^ i11;
            return this.f16852d ^ ((i12 << 5) - i12);
        }
    }

    /* compiled from: SessionConfigurationCompat */
    public interface c {
        e a();

        CameraCaptureSession.StateCallback b();

        Object c();

        Executor d();

        int e();

        List<f> f();

        void g(CaptureRequest captureRequest);

        void h(e eVar);
    }

    public l(ArrayList arrayList, Executor executor, y1 y1Var) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f16846a = new b(arrayList, executor, y1Var);
        } else {
            this.f16846a = new a(arrayList, executor, y1Var);
        }
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) ((f) it.next()).f16828a.g());
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        return this.f16846a.equals(((l) obj).f16846a);
    }

    public final int hashCode() {
        return this.f16846a.hashCode();
    }
}
