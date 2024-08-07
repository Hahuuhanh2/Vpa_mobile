package wb;

import vb.f;

/* compiled from: FirebaseRemoteConfigValueImpl */
public final class i implements f {

    /* renamed from: a  reason: collision with root package name */
    public final String f16788a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16789b;

    public i(String str, int i10) {
        this.f16788a = str;
        this.f16789b = i10;
    }

    public final int a() {
        return this.f16789b;
    }

    public final long b() {
        if (this.f16789b == 0) {
            return 0;
        }
        String trim = d().trim();
        try {
            return Long.valueOf(trim).longValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", new Object[]{trim, "long"}), e10);
        }
    }

    public final double c() {
        if (this.f16789b == 0) {
            return 0.0d;
        }
        String trim = d().trim();
        try {
            return Double.valueOf(trim).doubleValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", new Object[]{trim, "double"}), e10);
        }
    }

    public final String d() {
        if (this.f16789b == 0) {
            return "";
        }
        String str = this.f16788a;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
    }

    public final boolean e() {
        if (this.f16789b == 0) {
            return false;
        }
        String trim = d().trim();
        if (f.f16776e.matcher(trim).matches()) {
            return true;
        }
        if (f.f16777f.matcher(trim).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", new Object[]{trim, "boolean"}));
    }
}
