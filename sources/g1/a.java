package g1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.R$styleable;
import f0.b0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import v.v;

/* compiled from: ConstraintAttribute */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f10264a;

    /* renamed from: b  reason: collision with root package name */
    public String f10265b;

    /* renamed from: c  reason: collision with root package name */
    public int f10266c;

    /* renamed from: d  reason: collision with root package name */
    public int f10267d;

    /* renamed from: e  reason: collision with root package name */
    public float f10268e;

    /* renamed from: f  reason: collision with root package name */
    public String f10269f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f10270g;

    /* renamed from: h  reason: collision with root package name */
    public int f10271h;

    public a(String str, int i10, Object obj, boolean z10) {
        this.f10265b = str;
        this.f10266c = i10;
        this.f10264a = z10;
        f(obj);
    }

    public static void d(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        Object obj;
        int i10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.CustomAttribute);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i11 = 0;
        boolean z10 = false;
        Object obj2 = null;
        for (int i12 = 0; i12 < indexCount; i12++) {
            int index = obtainStyledAttributes.getIndex(i12);
            if (index == R$styleable.CustomAttribute_attributeName) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == R$styleable.CustomAttribute_methodName) {
                str = obtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == R$styleable.CustomAttribute_customBoolean) {
                obj2 = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i11 = 6;
            } else {
                if (index == R$styleable.CustomAttribute_customColorValue) {
                    i10 = 3;
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == R$styleable.CustomAttribute_customColorDrawableValue) {
                    i10 = 4;
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    if (index == R$styleable.CustomAttribute_customPixelDimension) {
                        obj2 = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                    } else if (index == R$styleable.CustomAttribute_customDimension) {
                        obj2 = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                    } else if (index == R$styleable.CustomAttribute_customFloatValue) {
                        i10 = 2;
                        obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                    } else if (index == R$styleable.CustomAttribute_customIntegerValue) {
                        obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                        i10 = 1;
                    } else if (index == R$styleable.CustomAttribute_customStringValue) {
                        i10 = 5;
                        obj = obtainStyledAttributes.getString(index);
                    } else if (index == R$styleable.CustomAttribute_customReference) {
                        i10 = 8;
                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        obj = Integer.valueOf(resourceId);
                    }
                    i11 = 7;
                }
                Object obj3 = obj;
                i11 = i10;
                obj2 = obj3;
            }
        }
        if (!(str == null || obj2 == null)) {
            hashMap.put(str, new a(str, i11, obj2, z10));
        }
        obtainStyledAttributes.recycle();
    }

    public static void e(View view, HashMap<String, a> hashMap) {
        Class<?> cls = view.getClass();
        Iterator<String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            a aVar = hashMap.get(next);
            if (!aVar.f10264a) {
                next = b0.r("set", next);
            }
            try {
                switch (v.g(aVar.f10266c)) {
                    case 0:
                        cls.getMethod(next, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f10267d)});
                        break;
                    case 1:
                        cls.getMethod(next, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f10268e)});
                        break;
                    case 2:
                        cls.getMethod(next, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f10271h)});
                        break;
                    case 3:
                        Method method = cls.getMethod(next, new Class[]{Drawable.class});
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f10271h);
                        method.invoke(view, new Object[]{colorDrawable});
                        break;
                    case 4:
                        cls.getMethod(next, new Class[]{CharSequence.class}).invoke(view, new Object[]{aVar.f10269f});
                        break;
                    case 5:
                        cls.getMethod(next, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(aVar.f10270g)});
                        break;
                    case 6:
                        cls.getMethod(next, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f10268e)});
                        break;
                    case 7:
                        cls.getMethod(next, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f10267d)});
                        break;
                }
            } catch (NoSuchMethodException e10) {
                e10.getMessage();
            } catch (IllegalAccessException e11) {
                e11.printStackTrace();
            } catch (InvocationTargetException e12) {
                e12.printStackTrace();
            }
        }
    }

    public final float a() {
        switch (v.g(this.f10266c)) {
            case 0:
                return (float) this.f10267d;
            case 1:
                return this.f10268e;
            case 2:
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
                throw new RuntimeException("Cannot interpolate String");
            case 5:
                if (this.f10270g) {
                    return 1.0f;
                }
                return 0.0f;
            case 6:
                return this.f10268e;
            default:
                return Float.NaN;
        }
    }

    public final void b(float[] fArr) {
        float f10;
        switch (v.g(this.f10266c)) {
            case 0:
                fArr[0] = (float) this.f10267d;
                return;
            case 1:
                fArr[0] = this.f10268e;
                return;
            case 2:
            case 3:
                int i10 = this.f10271h;
                float pow = (float) Math.pow((double) (((float) ((i10 >> 16) & 255)) / 255.0f), 2.2d);
                float pow2 = (float) Math.pow((double) (((float) ((i10 >> 8) & 255)) / 255.0f), 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow((double) (((float) (i10 & 255)) / 255.0f), 2.2d);
                fArr[3] = ((float) ((i10 >> 24) & 255)) / 255.0f;
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                if (this.f10270g) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                fArr[0] = f10;
                return;
            case 6:
                fArr[0] = this.f10268e;
                return;
            default:
                return;
        }
    }

    public final int c() {
        int g2 = v.g(this.f10266c);
        if (g2 == 2 || g2 == 3) {
            return 4;
        }
        return 1;
    }

    public final void f(Object obj) {
        switch (v.g(this.f10266c)) {
            case 0:
            case 7:
                this.f10267d = ((Integer) obj).intValue();
                return;
            case 1:
                this.f10268e = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f10271h = ((Integer) obj).intValue();
                return;
            case 4:
                this.f10269f = (String) obj;
                return;
            case 5:
                this.f10270g = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.f10268e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public a(a aVar, Object obj) {
        this.f10264a = false;
        this.f10265b = aVar.f10265b;
        this.f10266c = aVar.f10266c;
        f(obj);
    }
}
