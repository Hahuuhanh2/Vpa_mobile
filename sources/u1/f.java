package u1;

/* compiled from: TextDirectionHeuristicsCompat */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final d f15056a = new d((a) null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final d f15057b = new d((a) null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final d f15058c;

    /* renamed from: d  reason: collision with root package name */
    public static final d f15059d;

    /* compiled from: TextDirectionHeuristicsCompat */
    public static class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f15060a = new a();

        public final int a(CharSequence charSequence, int i10) {
            int i11 = i10 + 0;
            int i12 = 2;
            for (int i13 = 0; i13 < i11 && i12 == 2; i13++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i13));
                d dVar = f.f15056a;
                if (directionality != 0) {
                    if (!(directionality == 1 || directionality == 2)) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i12 = 2;
                                break;
                        }
                    }
                    i12 = 0;
                }
                i12 = 1;
            }
            return i12;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat */
    public interface b {
        int a(CharSequence charSequence, int i10);
    }

    /* compiled from: TextDirectionHeuristicsCompat */
    public static abstract class c implements e {

        /* renamed from: a  reason: collision with root package name */
        public final b f15061a;

        public c(a aVar) {
            this.f15061a = aVar;
        }

        public abstract boolean a();

        public final boolean b(CharSequence charSequence, int i10) {
            if (charSequence == null || i10 < 0 || charSequence.length() - i10 < 0) {
                throw new IllegalArgumentException();
            }
            b bVar = this.f15061a;
            if (bVar == null) {
                return a();
            }
            int a10 = bVar.a(charSequence, i10);
            if (a10 == 0) {
                return true;
            }
            if (a10 != 1) {
                return a();
            }
            return false;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat */
    public static class d extends c {

        /* renamed from: b  reason: collision with root package name */
        public final boolean f15062b;

        public d(a aVar, boolean z10) {
            super(aVar);
            this.f15062b = z10;
        }

        public final boolean a() {
            return this.f15062b;
        }
    }

    static {
        a aVar = a.f15060a;
        f15058c = new d(aVar, false);
        f15059d = new d(aVar, true);
    }
}
