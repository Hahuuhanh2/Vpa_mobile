package m0;

import android.util.Size;

/* compiled from: SizeUtil */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Size f13036a = new Size(0, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final Size f13037b = new Size(640, 480);

    /* renamed from: c  reason: collision with root package name */
    public static final Size f13038c = new Size(720, 480);

    /* renamed from: d  reason: collision with root package name */
    public static final Size f13039d = new Size(1280, 720);

    /* renamed from: e  reason: collision with root package name */
    public static final Size f13040e = new Size(1920, 1080);

    /* renamed from: f  reason: collision with root package name */
    public static final Size f13041f = new Size(1920, 1440);

    static {
        new Size(320, 240);
    }

    public static int a(Size size) {
        return size.getHeight() * size.getWidth();
    }
}
