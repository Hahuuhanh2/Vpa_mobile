package v;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Size;
import android.view.Display;
import java.util.Locale;
import lc.b;
import m0.a;
import y.c0;
import y.m;
import z.i;

/* compiled from: DisplayInfoManager */
public final class d1 {

    /* renamed from: e  reason: collision with root package name */
    public static final Size f15647e = new Size(1920, 1080);

    /* renamed from: f  reason: collision with root package name */
    public static final Size f15648f = new Size(320, 240);

    /* renamed from: g  reason: collision with root package name */
    public static final Size f15649g = new Size(640, 480);

    /* renamed from: h  reason: collision with root package name */
    public static final Object f15650h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public static volatile d1 f15651i;

    /* renamed from: a  reason: collision with root package name */
    public final DisplayManager f15652a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Size f15653b = null;

    /* renamed from: c  reason: collision with root package name */
    public final i f15654c = new i();

    /* renamed from: d  reason: collision with root package name */
    public final b f15655d = new b(1);

    public d1(Context context) {
        this.f15652a = (DisplayManager) context.getSystemService("display");
    }

    public static d1 b(Context context) {
        if (f15651i == null) {
            synchronized (f15650h) {
                if (f15651i == null) {
                    f15651i = new d1(context);
                }
            }
        }
        return f15651i;
    }

    public static Display d(Display[] displayArr, boolean z10) {
        Display display = null;
        int i10 = -1;
        for (Display display2 : displayArr) {
            if (!z10 || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i11 = point.x * point.y;
                if (i11 > i10) {
                    display = display2;
                    i10 = i11;
                }
            }
        }
        return display;
    }

    public final Size a() {
        boolean z10;
        Size a10;
        Size size;
        Point point = new Point();
        boolean z11 = false;
        c(false).getRealSize(point);
        Size size2 = new Size(point.x, point.y);
        Size size3 = f15648f;
        Size size4 = a.f13036a;
        if (size2.getHeight() * size2.getWidth() < size3.getHeight() * size3.getWidth()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (((c0) this.f15655d.f12907b) != null) {
                size = (Size) c0.f17335a.get(Build.MODEL.toUpperCase(Locale.US));
            } else {
                size = null;
            }
            size2 = size;
            if (size2 == null) {
                size2 = f15649g;
            }
        }
        if (size2.getHeight() > size2.getWidth()) {
            size2 = new Size(size2.getHeight(), size2.getWidth());
        }
        int height = size2.getHeight() * size2.getWidth();
        Size size5 = f15647e;
        if (height > size5.getHeight() * size5.getWidth()) {
            size2 = size5;
        }
        if (this.f15654c.f17751a == null || (a10 = m.a(1)) == null) {
            return size2;
        }
        if (a10.getHeight() * a10.getWidth() > size2.getHeight() * size2.getWidth()) {
            z11 = true;
        }
        if (z11) {
            return a10;
        }
        return size2;
    }

    public final Display c(boolean z10) {
        Display[] displays = this.f15652a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display d10 = d(displays, z10);
        if (d10 == null && z10) {
            d10 = d(displays, false);
        }
        if (d10 != null) {
            return d10;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    public final Size e() {
        if (this.f15653b != null) {
            return this.f15653b;
        }
        this.f15653b = a();
        return this.f15653b;
    }
}
