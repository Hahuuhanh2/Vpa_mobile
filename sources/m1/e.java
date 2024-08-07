package m1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import m1.c;
import n1.h;
import org.xmlpull.v1.XmlPullParserException;
import v.f;

/* compiled from: ResourcesCompat */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f13062a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap<d, SparseArray<c>> f13063b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f13064c = new Object();

    /* compiled from: ResourcesCompat */
    public static class a {
        public static Drawable a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getDrawable(i10, theme);
        }

        public static Drawable b(Resources resources, int i10, int i11, Resources.Theme theme) {
            return resources.getDrawableForDensity(i10, i11, theme);
        }
    }

    /* compiled from: ResourcesCompat */
    public static class b {
        public static int a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColor(i10, theme);
        }

        public static ColorStateList b(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColorStateList(i10, theme);
        }
    }

    /* compiled from: ResourcesCompat */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final ColorStateList f13065a;

        /* renamed from: b  reason: collision with root package name */
        public final Configuration f13066b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13067c;

        public c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            int i10;
            this.f13065a = colorStateList;
            this.f13066b = configuration;
            if (theme == null) {
                i10 = 0;
            } else {
                i10 = theme.hashCode();
            }
            this.f13067c = i10;
        }
    }

    /* compiled from: ResourcesCompat */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f13068a;

        /* renamed from: b  reason: collision with root package name */
        public final Resources.Theme f13069b;

        public d(Resources resources, Resources.Theme theme) {
            this.f13068a = resources;
            this.f13069b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (!this.f13068a.equals(dVar.f13068a) || !v1.b.a(this.f13069b, dVar.f13069b)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return v1.b.b(this.f13068a, this.f13069b);
        }
    }

    /* renamed from: m1.e$e  reason: collision with other inner class name */
    /* compiled from: ResourcesCompat */
    public static abstract class C0160e {
        public final void a(int i10) {
            new Handler(Looper.getMainLooper()).post(new f(this, i10));
        }

        public final void b(Typeface typeface) {
            new Handler(Looper.getMainLooper()).post(new f(14, this, typeface));
        }

        public abstract void c(int i10);

        public abstract void d(Typeface typeface);
    }

    public static Typeface a(Context context, int i10) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i10, new TypedValue(), 0, (C0160e) null, false, false);
    }

    public static Typeface b(Context context, int i10, TypedValue typedValue, int i11, C0160e eVar, boolean z10, boolean z11) {
        int i12 = i10;
        TypedValue typedValue2 = typedValue;
        int i13 = i11;
        C0160e eVar2 = eVar;
        Resources resources = context.getResources();
        resources.getValue(i12, typedValue2, true);
        CharSequence charSequence = typedValue2.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            Typeface typeface = null;
            if (charSequence2.startsWith("res/")) {
                int i14 = typedValue2.assetCookie;
                v0.f<String, Typeface> fVar = h.f13435b;
                Typeface typeface2 = fVar.get(h.b(resources, i12, charSequence2, i14, i13));
                if (typeface2 != null) {
                    if (eVar2 != null) {
                        eVar2.b(typeface2);
                    }
                    typeface = typeface2;
                } else if (!z11) {
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            c.b a10 = c.a(resources.getXml(i12), resources);
                            if (a10 != null) {
                                typeface = h.a(context, a10, resources, i10, charSequence2, typedValue2.assetCookie, i11, eVar, z10);
                            } else if (eVar2 != null) {
                                eVar2.a(-3);
                            }
                        } else {
                            int i15 = typedValue2.assetCookie;
                            Typeface d10 = h.f13434a.d(context, resources, i10, charSequence2, i11);
                            if (d10 != null) {
                                fVar.put(h.b(resources, i12, charSequence2, i15, i13), d10);
                            }
                            if (eVar2 != null) {
                                if (d10 != null) {
                                    eVar2.b(d10);
                                } else {
                                    eVar2.a(-3);
                                }
                            }
                            typeface = d10;
                        }
                    } catch (IOException | XmlPullParserException unused) {
                        if (eVar2 != null) {
                            eVar2.a(-3);
                        }
                    }
                }
            } else if (eVar2 != null) {
                eVar2.a(-3);
            }
            if (typeface != null || eVar2 != null || z11) {
                return typeface;
            }
            StringBuilder q10 = android.support.v4.media.a.q("Font resource ID #0x");
            q10.append(Integer.toHexString(i10));
            q10.append(" could not be retrieved.");
            throw new Resources.NotFoundException(q10.toString());
        }
        StringBuilder q11 = android.support.v4.media.a.q("Resource \"");
        q11.append(resources.getResourceName(i12));
        q11.append("\" (");
        q11.append(Integer.toHexString(i10));
        q11.append(") is not a Font: ");
        q11.append(typedValue2);
        throw new Resources.NotFoundException(q11.toString());
    }
}
