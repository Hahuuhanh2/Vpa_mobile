package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    public static final PorterDuff.Mode f2119k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f2120a;

    /* renamed from: b  reason: collision with root package name */
    public Object f2121b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f2122c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f2123d;

    /* renamed from: e  reason: collision with root package name */
    public int f2124e;

    /* renamed from: f  reason: collision with root package name */
    public int f2125f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f2126g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f2127h;

    /* renamed from: i  reason: collision with root package name */
    public String f2128i;

    /* renamed from: j  reason: collision with root package name */
    public String f2129j;

    public static class a {
        public static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        }

        public static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }

        public static int c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException unused) {
                Objects.toString(obj);
                return -1;
            } catch (InvocationTargetException unused2) {
                Objects.toString(obj);
                return -1;
            } catch (NoSuchMethodException unused3) {
                Objects.toString(obj);
                return -1;
            }
        }

        public static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }

        public static Drawable e(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0076  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static android.graphics.drawable.Icon f(androidx.core.graphics.drawable.IconCompat r6, android.content.Context r7) {
            /*
                int r0 = r6.f2120a
                r1 = 0
                r2 = 26
                switch(r0) {
                    case -1: goto L_0x00f8;
                    case 0: goto L_0x0008;
                    case 1: goto L_0x00df;
                    case 2: goto L_0x00d4;
                    case 3: goto L_0x00c7;
                    case 4: goto L_0x00be;
                    case 5: goto L_0x00a4;
                    case 6: goto L_0x0010;
                    default: goto L_0x0008;
                }
            L_0x0008:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "Unknown type"
                r6.<init>(r7)
                throw r6
            L_0x0010:
                int r0 = android.os.Build.VERSION.SDK_INT
                r3 = 30
                if (r0 < r3) goto L_0x0020
                android.net.Uri r7 = r6.e()
                android.graphics.drawable.Icon r7 = androidx.core.graphics.drawable.IconCompat.d.a(r7)
                goto L_0x00e7
            L_0x0020:
                if (r7 == 0) goto L_0x008d
                android.net.Uri r3 = r6.e()
                java.lang.String r4 = r3.getScheme()
                java.lang.String r5 = "content"
                boolean r5 = r5.equals(r4)
                if (r5 != 0) goto L_0x004e
                java.lang.String r5 = "file"
                boolean r4 = r5.equals(r4)
                if (r4 == 0) goto L_0x003b
                goto L_0x004e
            L_0x003b:
                java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x004a }
                java.io.File r4 = new java.io.File     // Catch:{ FileNotFoundException -> 0x004a }
                java.lang.Object r5 = r6.f2121b     // Catch:{ FileNotFoundException -> 0x004a }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ FileNotFoundException -> 0x004a }
                r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x004a }
                r7.<init>(r4)     // Catch:{ FileNotFoundException -> 0x004a }
                goto L_0x005b
            L_0x004a:
                r3.toString()
                goto L_0x005a
            L_0x004e:
                android.content.ContentResolver r7 = r7.getContentResolver()     // Catch:{ Exception -> 0x0057 }
                java.io.InputStream r7 = r7.openInputStream(r3)     // Catch:{ Exception -> 0x0057 }
                goto L_0x005b
            L_0x0057:
                r3.toString()
            L_0x005a:
                r7 = 0
            L_0x005b:
                if (r7 == 0) goto L_0x0076
                if (r0 < r2) goto L_0x0069
                android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeStream(r7)
                android.graphics.drawable.Icon r7 = androidx.core.graphics.drawable.IconCompat.b.b(r7)
                goto L_0x00e7
            L_0x0069:
                android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeStream(r7)
                android.graphics.Bitmap r7 = androidx.core.graphics.drawable.IconCompat.a(r7, r1)
                android.graphics.drawable.Icon r7 = android.graphics.drawable.Icon.createWithBitmap(r7)
                goto L_0x00e7
            L_0x0076:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "Cannot load adaptive icon from uri: "
                java.lang.StringBuilder r0 = android.support.v4.media.a.q(r0)
                android.net.Uri r6 = r6.e()
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                r7.<init>(r6)
                throw r7
            L_0x008d:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Context is required to resolve the file uri of the icon: "
                java.lang.StringBuilder r0 = android.support.v4.media.a.q(r0)
                android.net.Uri r6 = r6.e()
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                r7.<init>(r6)
                throw r7
            L_0x00a4:
                int r7 = android.os.Build.VERSION.SDK_INT
                if (r7 < r2) goto L_0x00b1
                java.lang.Object r7 = r6.f2121b
                android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
                android.graphics.drawable.Icon r7 = androidx.core.graphics.drawable.IconCompat.b.b(r7)
                goto L_0x00e7
            L_0x00b1:
                java.lang.Object r7 = r6.f2121b
                android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
                android.graphics.Bitmap r7 = androidx.core.graphics.drawable.IconCompat.a(r7, r1)
                android.graphics.drawable.Icon r7 = android.graphics.drawable.Icon.createWithBitmap(r7)
                goto L_0x00e7
            L_0x00be:
                java.lang.Object r7 = r6.f2121b
                java.lang.String r7 = (java.lang.String) r7
                android.graphics.drawable.Icon r7 = android.graphics.drawable.Icon.createWithContentUri(r7)
                goto L_0x00e7
            L_0x00c7:
                java.lang.Object r7 = r6.f2121b
                byte[] r7 = (byte[]) r7
                int r0 = r6.f2124e
                int r1 = r6.f2125f
                android.graphics.drawable.Icon r7 = android.graphics.drawable.Icon.createWithData(r7, r0, r1)
                goto L_0x00e7
            L_0x00d4:
                java.lang.String r7 = r6.d()
                int r0 = r6.f2124e
                android.graphics.drawable.Icon r7 = android.graphics.drawable.Icon.createWithResource(r7, r0)
                goto L_0x00e7
            L_0x00df:
                java.lang.Object r7 = r6.f2121b
                android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
                android.graphics.drawable.Icon r7 = android.graphics.drawable.Icon.createWithBitmap(r7)
            L_0x00e7:
                android.content.res.ColorStateList r0 = r6.f2126g
                if (r0 == 0) goto L_0x00ee
                r7.setTintList(r0)
            L_0x00ee:
                android.graphics.PorterDuff$Mode r6 = r6.f2127h
                android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.drawable.IconCompat.f2119k
                if (r6 == r0) goto L_0x00f7
                r7.setTintMode(r6)
            L_0x00f7:
                return r7
            L_0x00f8:
                java.lang.Object r6 = r6.f2121b
                android.graphics.drawable.Icon r6 = (android.graphics.drawable.Icon) r6
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.a.f(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
        }
    }

    public static class b {
        public static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        public static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    public static class c {
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    public static class d {
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f2120a = -1;
        this.f2122c = null;
        this.f2123d = null;
        this.f2124e = 0;
        this.f2125f = 0;
        this.f2126g = null;
        this.f2127h = f2119k;
        this.f2128i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z10) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f10 = (float) min;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate(((float) (-(bitmap.getWidth() - min))) / 2.0f, ((float) (-(bitmap.getHeight() - min))) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    public static IconCompat b(Resources resources, String str, int i10) {
        str.getClass();
        if (i10 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f2124e = i10;
            if (resources != null) {
                try {
                    iconCompat.f2121b = resources.getResourceName(i10);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f2121b = str;
            }
            iconCompat.f2129j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public final int c() {
        int i10 = this.f2120a;
        if (i10 == -1) {
            return a.a(this.f2121b);
        }
        if (i10 == 2) {
            return this.f2124e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final String d() {
        int i10 = this.f2120a;
        if (i10 == -1) {
            return a.b(this.f2121b);
        }
        if (i10 == 2) {
            String str = this.f2129j;
            if (str == null || TextUtils.isEmpty(str)) {
                return ((String) this.f2121b).split(":", -1)[0];
            }
            return this.f2129j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public final Uri e() {
        int i10 = this.f2120a;
        if (i10 == -1) {
            return a.d(this.f2121b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f2121b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final String toString() {
        String str;
        if (this.f2120a == -1) {
            return String.valueOf(this.f2121b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f2120a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f2120a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f2121b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f2121b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f2129j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", new Object[]{Integer.valueOf(c())}));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f2124e);
                if (this.f2125f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f2125f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f2121b);
                break;
        }
        if (this.f2126g != null) {
            sb2.append(" tint=");
            sb2.append(this.f2126g);
        }
        if (this.f2127h != f2119k) {
            sb2.append(" mode=");
            sb2.append(this.f2127h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i10) {
        this.f2122c = null;
        this.f2123d = null;
        this.f2124e = 0;
        this.f2125f = 0;
        this.f2126g = null;
        this.f2127h = f2119k;
        this.f2128i = null;
        this.f2120a = i10;
    }
}
