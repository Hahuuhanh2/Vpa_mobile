package x;

import android.util.Size;
import android.view.Surface;
import c0.p0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import x.f;

/* compiled from: OutputConfigurationCompatBaseImpl */
public class k implements f.a {

    /* renamed from: a  reason: collision with root package name */
    public final Object f16838a;

    /* compiled from: OutputConfigurationCompatBaseImpl */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<Surface> f16839a;

        /* renamed from: b  reason: collision with root package name */
        public final Size f16840b;

        /* renamed from: c  reason: collision with root package name */
        public final int f16841c;

        /* renamed from: d  reason: collision with root package name */
        public final int f16842d;

        /* renamed from: e  reason: collision with root package name */
        public String f16843e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f16844f = false;

        /* renamed from: g  reason: collision with root package name */
        public long f16845g = 1;

        public a(Surface surface) {
            Size size;
            int i10;
            int i11;
            this.f16839a = Collections.singletonList(surface);
            try {
                Method declaredMethod = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("getSurfaceSize", new Class[]{Surface.class});
                declaredMethod.setAccessible(true);
                size = (Size) declaredMethod.invoke((Object) null, new Object[]{surface});
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                p0.c("OutputConfigCompat");
                size = null;
            }
            this.f16840b = size;
            try {
                i10 = ((Integer) Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("detectSurfaceType", new Class[]{Surface.class}).invoke((Object) null, new Object[]{surface})).intValue();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                p0.c("OutputConfigCompat");
                i10 = 0;
            }
            this.f16841c = i10;
            try {
                i11 = ((Integer) Surface.class.getDeclaredMethod("getGenerationId", new Class[0]).invoke(surface, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused3) {
                p0.c("OutputConfigCompat");
                i11 = -1;
            }
            this.f16842d = i11;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f16840b.equals(aVar.f16840b) || this.f16841c != aVar.f16841c || this.f16842d != aVar.f16842d || this.f16844f != aVar.f16844f || this.f16845g != aVar.f16845g || !Objects.equals(this.f16843e, aVar.f16843e)) {
                return false;
            }
            int min = Math.min(this.f16839a.size(), aVar.f16839a.size());
            for (int i10 = 0; i10 < min; i10++) {
                if (this.f16839a.get(i10) != aVar.f16839a.get(i10)) {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode() {
            int i10;
            int hashCode = this.f16839a.hashCode() ^ 31;
            int i11 = this.f16842d ^ ((hashCode << 5) - hashCode);
            int hashCode2 = this.f16840b.hashCode() ^ ((i11 << 5) - i11);
            int i12 = this.f16841c ^ ((hashCode2 << 5) - hashCode2);
            boolean z10 = this.f16844f ^ ((i12 << 5) - i12);
            int i13 = ((z10 ? 1 : 0) << true) - z10;
            String str = this.f16843e;
            if (str == null) {
                i10 = 0;
            } else {
                i10 = str.hashCode();
            }
            int i14 = i10 ^ i13;
            int i15 = (i14 << 5) - i14;
            long j10 = this.f16845g;
            return ((int) (j10 ^ (j10 >>> 32))) ^ i15;
        }
    }

    public k(Surface surface) {
        this.f16838a = new a(surface);
    }

    public void a(long j10) {
    }

    public void b(Surface surface) {
        if (getSurface() == surface) {
            throw new IllegalStateException("Surface is already added!");
        } else if (!h()) {
            throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        } else {
            throw new IllegalArgumentException("Exceeds maximum number of surfaces");
        }
    }

    public void c(long j10) {
        ((a) this.f16838a).f16845g = j10;
    }

    public String d() {
        return ((a) this.f16838a).f16843e;
    }

    public void e() {
        ((a) this.f16838a).f16844f = true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        return Objects.equals(this.f16838a, ((k) obj).f16838a);
    }

    public void f(String str) {
        ((a) this.f16838a).f16843e = str;
    }

    public Object g() {
        return null;
    }

    public Surface getSurface() {
        List<Surface> list = ((a) this.f16838a).f16839a;
        if (list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    public boolean h() {
        return ((a) this.f16838a).f16844f;
    }

    public final int hashCode() {
        return this.f16838a.hashCode();
    }

    public k(Object obj) {
        this.f16838a = obj;
    }
}
