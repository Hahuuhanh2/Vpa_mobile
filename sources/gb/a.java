package gb;

/* compiled from: MessagingClientEvent */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final long f10411a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10412b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10413c;

    /* renamed from: d  reason: collision with root package name */
    public final b f10414d;

    /* renamed from: e  reason: collision with root package name */
    public final c f10415e;

    /* renamed from: f  reason: collision with root package name */
    public final String f10416f;

    /* renamed from: g  reason: collision with root package name */
    public final String f10417g;

    /* renamed from: h  reason: collision with root package name */
    public final int f10418h = 0;

    /* renamed from: i  reason: collision with root package name */
    public final int f10419i;

    /* renamed from: j  reason: collision with root package name */
    public final String f10420j;

    /* renamed from: k  reason: collision with root package name */
    public final long f10421k;

    /* renamed from: l  reason: collision with root package name */
    public final C0112a f10422l;

    /* renamed from: m  reason: collision with root package name */
    public final String f10423m;

    /* renamed from: n  reason: collision with root package name */
    public final long f10424n;

    /* renamed from: o  reason: collision with root package name */
    public final String f10425o;

    /* renamed from: gb.a$a  reason: collision with other inner class name */
    /* compiled from: MessagingClientEvent */
    public enum C0112a implements va.c {
        MESSAGE_DELIVERED(1);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f10428a;

        /* access modifiers changed from: public */
        C0112a(int i10) {
            this.f10428a = i10;
        }

        public final int a() {
            return this.f10428a;
        }
    }

    /* compiled from: MessagingClientEvent */
    public enum b implements va.c {
        DATA_MESSAGE(1),
        DISPLAY_NOTIFICATION(3);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f10432a;

        /* access modifiers changed from: public */
        b(int i10) {
            this.f10432a = i10;
        }

        public final int a() {
            return this.f10432a;
        }
    }

    /* compiled from: MessagingClientEvent */
    public enum c implements va.c {
        ANDROID(1);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f10435a;

        /* access modifiers changed from: public */
        c(int i10) {
            this.f10435a = i10;
        }

        public final int a() {
            return this.f10435a;
        }
    }

    public a(long j10, String str, String str2, b bVar, c cVar, String str3, String str4, int i10, String str5, C0112a aVar, String str6, String str7) {
        this.f10411a = j10;
        this.f10412b = str;
        this.f10413c = str2;
        this.f10414d = bVar;
        this.f10415e = cVar;
        this.f10416f = str3;
        this.f10417g = str4;
        this.f10419i = i10;
        this.f10420j = str5;
        this.f10421k = 0;
        this.f10422l = aVar;
        this.f10423m = str6;
        this.f10424n = 0;
        this.f10425o = str7;
    }
}
