package y6;

import f0.b0;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class i {

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f17563a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final Object f17564b;

        public /* synthetic */ a(Object obj) {
            j.f(obj);
            this.f17564b = obj;
        }

        public final void a(Object obj, String str) {
            this.f17563a.add(b0.s(str, "=", String.valueOf(obj)));
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f17564b.getClass().getSimpleName());
            sb2.append('{');
            int size = this.f17563a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) this.f17563a.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }
}
