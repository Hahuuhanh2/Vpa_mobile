package x;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;

/* compiled from: InputConfigurationCompat */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final c f16826a;

    /* compiled from: InputConfigurationCompat */
    public static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final InputConfiguration f16827a;

        public a(InputConfiguration inputConfiguration) {
            this.f16827a = inputConfiguration;
        }

        public final InputConfiguration a() {
            return this.f16827a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            return Objects.equals(this.f16827a, ((c) obj).a());
        }

        public final int hashCode() {
            return this.f16827a.hashCode();
        }

        public final String toString() {
            return this.f16827a.toString();
        }
    }

    /* compiled from: InputConfigurationCompat */
    public static final class b extends a {
        public b(InputConfiguration inputConfiguration) {
            super(inputConfiguration);
        }
    }

    /* compiled from: InputConfigurationCompat */
    public interface c {
        InputConfiguration a();
    }

    public e(a aVar) {
        this.f16826a = aVar;
    }

    public static e a(InputConfiguration inputConfiguration) {
        if (inputConfiguration == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return new e(new b(inputConfiguration));
        }
        return new e(new a(inputConfiguration));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f16826a.equals(((e) obj).f16826a);
    }

    public final int hashCode() {
        return this.f16826a.hashCode();
    }

    public final String toString() {
        return this.f16826a.toString();
    }
}
