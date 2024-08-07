package m1;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import androidx.core.R$styleable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
import t1.f;

/* compiled from: FontResourcesParserCompat */
public final class c {

    /* compiled from: FontResourcesParserCompat */
    public static class a {
        public static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    /* compiled from: FontResourcesParserCompat */
    public interface b {
    }

    /* renamed from: m1.c$c  reason: collision with other inner class name */
    /* compiled from: FontResourcesParserCompat */
    public static final class C0159c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final d[] f13049a;

        public C0159c(d[] dVarArr) {
            this.f13049a = dVarArr;
        }
    }

    /* compiled from: FontResourcesParserCompat */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f13050a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13051b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f13052c;

        /* renamed from: d  reason: collision with root package name */
        public final String f13053d;

        /* renamed from: e  reason: collision with root package name */
        public final int f13054e;

        /* renamed from: f  reason: collision with root package name */
        public final int f13055f;

        public d(int i10, int i11, int i12, String str, String str2, boolean z10) {
            this.f13050a = str;
            this.f13051b = i10;
            this.f13052c = z10;
            this.f13053d = str2;
            this.f13054e = i11;
            this.f13055f = i12;
        }
    }

    /* compiled from: FontResourcesParserCompat */
    public static final class e implements b {

        /* renamed from: a  reason: collision with root package name */
        public final f f13056a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13057b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13058c;

        /* renamed from: d  reason: collision with root package name */
        public final String f13059d;

        public e(f fVar, int i10, int i11, String str) {
            this.f13056a = fVar;
            this.f13058c = i10;
            this.f13057b = i11;
            this.f13059d = str;
        }
    }

    public static b a(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        boolean z10;
        Resources resources2 = resources;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, (String) null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.FontFamily);
                String string = obtainAttributes.getString(R$styleable.FontFamily_fontProviderAuthority);
                String string2 = obtainAttributes.getString(R$styleable.FontFamily_fontProviderPackage);
                String string3 = obtainAttributes.getString(R$styleable.FontFamily_fontProviderQuery);
                int resourceId = obtainAttributes.getResourceId(R$styleable.FontFamily_fontProviderCerts, 0);
                int integer = obtainAttributes.getInteger(R$styleable.FontFamily_fontProviderFetchStrategy, 1);
                int integer2 = obtainAttributes.getInteger(R$styleable.FontFamily_fontProviderFetchTimeout, 500);
                String string4 = obtainAttributes.getString(R$styleable.FontFamily_fontProviderSystemFontFamily);
                obtainAttributes.recycle();
                if (string == null || string2 == null || string3 == null) {
                    ArrayList arrayList = new ArrayList();
                    while (xmlResourceParser.next() != 3) {
                        if (xmlResourceParser.getEventType() == 2) {
                            if (xmlResourceParser.getName().equals("font")) {
                                TypedArray obtainAttributes2 = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.FontFamilyFont);
                                int i10 = R$styleable.FontFamilyFont_fontWeight;
                                if (!obtainAttributes2.hasValue(i10)) {
                                    i10 = R$styleable.FontFamilyFont_android_fontWeight;
                                }
                                int i11 = obtainAttributes2.getInt(i10, 400);
                                int i12 = R$styleable.FontFamilyFont_fontStyle;
                                if (!obtainAttributes2.hasValue(i12)) {
                                    i12 = R$styleable.FontFamilyFont_android_fontStyle;
                                }
                                if (1 == obtainAttributes2.getInt(i12, 0)) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                int i13 = R$styleable.FontFamilyFont_ttcIndex;
                                if (!obtainAttributes2.hasValue(i13)) {
                                    i13 = R$styleable.FontFamilyFont_android_ttcIndex;
                                }
                                int i14 = R$styleable.FontFamilyFont_fontVariationSettings;
                                if (!obtainAttributes2.hasValue(i14)) {
                                    i14 = R$styleable.FontFamilyFont_android_fontVariationSettings;
                                }
                                String string5 = obtainAttributes2.getString(i14);
                                int i15 = obtainAttributes2.getInt(i13, 0);
                                int i16 = R$styleable.FontFamilyFont_font;
                                if (!obtainAttributes2.hasValue(i16)) {
                                    i16 = R$styleable.FontFamilyFont_android_font;
                                }
                                int resourceId2 = obtainAttributes2.getResourceId(i16, 0);
                                String string6 = obtainAttributes2.getString(i16);
                                obtainAttributes2.recycle();
                                while (xmlResourceParser.next() != 3) {
                                    c(xmlResourceParser);
                                }
                                arrayList.add(new d(i11, i15, resourceId2, string6, string5, z10));
                            } else {
                                c(xmlResourceParser);
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    return new C0159c((d[]) arrayList.toArray(new d[0]));
                }
                while (xmlResourceParser.next() != 3) {
                    c(xmlResourceParser);
                }
                return new e(new f(string, string2, string3, b(resources2, resourceId)), integer, integer2, string4);
            }
            c(xmlResourceParser);
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> b(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a.a(obtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String decode : stringArray) {
                            arrayList2.add(Base64.decode(decode, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i10);
                ArrayList arrayList3 = new ArrayList();
                for (String decode2 : stringArray2) {
                    arrayList3.add(Base64.decode(decode2, 0));
                }
                arrayList.add(arrayList3);
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void c(XmlResourceParser xmlResourceParser) {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }
}
