package androidx.camera.core.impl;

import android.graphics.Rect;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.u;
import i0.f;
import java.util.Collections;
import java.util.List;

public interface CameraControlInternal extends CameraControl {

    /* renamed from: a  reason: collision with root package name */
    public static final a f1308a = new a();

    public static final class CameraControlException extends Exception {
    }

    public class a implements CameraControlInternal {
        public final void a(i iVar) {
        }

        public final Rect b() {
            return new Rect();
        }

        public final void c(int i10) {
        }

        public final void d(u.b bVar) {
        }

        public final v8.a e(int i10, int i11, List list) {
            return f.c(Collections.emptyList());
        }

        public final v8.a<Void> f(boolean z10) {
            return f.c((Object) null);
        }

        public final i g() {
            return null;
        }

        public final void h() {
        }
    }

    public interface b {
    }

    void a(i iVar);

    Rect b();

    void c(int i10);

    void d(u.b bVar);

    v8.a e(int i10, int i11, List list);

    i g();

    void h();
}
