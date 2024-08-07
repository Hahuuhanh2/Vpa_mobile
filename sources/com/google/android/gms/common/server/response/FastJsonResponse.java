package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.VisibleForTesting;
import h7.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import m9.b;
import p3.l0;
import y6.i;
import y6.j;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class FastJsonResponse {

    @VisibleForTesting
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final a CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final int f5466a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5467b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f5468c;

        /* renamed from: d  reason: collision with root package name */
        public final int f5469d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f5470e;

        /* renamed from: f  reason: collision with root package name */
        public final String f5471f;

        /* renamed from: n  reason: collision with root package name */
        public final int f5472n;

        /* renamed from: o  reason: collision with root package name */
        public final Class f5473o;

        /* renamed from: p  reason: collision with root package name */
        public final String f5474p;

        /* renamed from: q  reason: collision with root package name */
        public zan f5475q;

        /* renamed from: r  reason: collision with root package name */
        public StringToIntConverter f5476r;

        public Field(int i10, int i11, boolean z10, int i12, boolean z11, String str, int i13, String str2, zaa zaa) {
            this.f5466a = i10;
            this.f5467b = i11;
            this.f5468c = z10;
            this.f5469d = i12;
            this.f5470e = z11;
            this.f5471f = str;
            this.f5472n = i13;
            if (str2 == null) {
                this.f5473o = null;
                this.f5474p = null;
            } else {
                this.f5473o = SafeParcelResponse.class;
                this.f5474p = str2;
            }
            if (zaa == null) {
                this.f5476r = null;
                return;
            }
            StringToIntConverter stringToIntConverter = zaa.f5462b;
            if (stringToIntConverter != null) {
                this.f5476r = stringToIntConverter;
                return;
            }
            throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
        }

        public final String toString() {
            i.a aVar = new i.a(this);
            aVar.a(Integer.valueOf(this.f5466a), "versionCode");
            aVar.a(Integer.valueOf(this.f5467b), "typeIn");
            aVar.a(Boolean.valueOf(this.f5468c), "typeInArray");
            aVar.a(Integer.valueOf(this.f5469d), "typeOut");
            aVar.a(Boolean.valueOf(this.f5470e), "typeOutArray");
            aVar.a(this.f5471f, "outputFieldName");
            aVar.a(Integer.valueOf(this.f5472n), "safeParcelFieldId");
            String str = this.f5474p;
            if (str == null) {
                str = null;
            }
            aVar.a(str, "concreteTypeName");
            Class cls = this.f5473o;
            if (cls != null) {
                aVar.a(cls.getCanonicalName(), "concreteType.class");
            }
            if (this.f5476r != null) {
                aVar.a(StringToIntConverter.class.getCanonicalName(), "converterName");
            }
            return aVar.toString();
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            int n12 = l0.n1(20293, parcel);
            l0.b1(parcel, 1, this.f5466a);
            l0.b1(parcel, 2, this.f5467b);
            l0.X0(parcel, 3, this.f5468c);
            l0.b1(parcel, 4, this.f5469d);
            l0.X0(parcel, 5, this.f5470e);
            l0.f1(parcel, 6, this.f5471f);
            l0.b1(parcel, 7, this.f5472n);
            String str = this.f5474p;
            zaa zaa = null;
            if (str == null) {
                str = null;
            }
            l0.f1(parcel, 8, str);
            StringToIntConverter stringToIntConverter = this.f5476r;
            if (stringToIntConverter != null) {
                zaa = new zaa(stringToIntConverter);
            }
            l0.e1(parcel, 9, zaa, i10);
            l0.o1(n12, parcel);
        }
    }

    public static final Object h(Field field, Object obj) {
        StringToIntConverter stringToIntConverter = field.f5476r;
        if (stringToIntConverter == null) {
            return obj;
        }
        stringToIntConverter.getClass();
        String str = (String) stringToIntConverter.f5460c.get(((Integer) obj).intValue());
        if (str != null || !stringToIntConverter.f5459b.containsKey("gms_unknown")) {
            return str;
        }
        return "gms_unknown";
    }

    public static final void i(StringBuilder sb2, Field field, Object obj) {
        int i10 = field.f5467b;
        if (i10 == 11) {
            Class cls = field.f5473o;
            j.f(cls);
            sb2.append(((FastJsonResponse) cls.cast(obj)).toString());
        } else if (i10 == 7) {
            sb2.append("\"");
            sb2.append(f.a((String) obj));
            sb2.append("\"");
        } else {
            sb2.append(obj);
        }
    }

    public abstract Map<String, Field<?, ?>> a();

    public final Object d(Field field) {
        boolean z10;
        String str = field.f5471f;
        if (field.f5473o == null) {
            return e();
        }
        if (e() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object[] objArr = {field.f5471f};
        if (z10) {
            try {
                return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), new Class[0]).invoke(this, new Object[0]);
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        } else {
            throw new IllegalStateException(String.format("Concrete field shouldn't be value object: %s", objArr));
        }
    }

    public abstract Object e();

    public final boolean f(Field field) {
        if (field.f5469d != 11) {
            return g();
        }
        if (field.f5470e) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    public abstract boolean g();

    public String toString() {
        Map<String, Field<?, ?>> a10 = a();
        StringBuilder sb2 = new StringBuilder(100);
        for (String next : a10.keySet()) {
            Field field = a10.get(next);
            if (f(field)) {
                Object h10 = h(field, d(field));
                if (sb2.length() == 0) {
                    sb2.append("{");
                } else {
                    sb2.append(",");
                }
                sb2.append("\"");
                sb2.append(next);
                sb2.append("\":");
                if (h10 != null) {
                    switch (field.f5469d) {
                        case 8:
                            sb2.append("\"");
                            sb2.append(Base64.encodeToString((byte[]) h10, 0));
                            sb2.append("\"");
                            break;
                        case 9:
                            sb2.append("\"");
                            sb2.append(Base64.encodeToString((byte[]) h10, 10));
                            sb2.append("\"");
                            break;
                        case 10:
                            b.g0(sb2, (HashMap) h10);
                            break;
                        default:
                            if (!field.f5468c) {
                                i(sb2, field, h10);
                                break;
                            } else {
                                ArrayList arrayList = (ArrayList) h10;
                                sb2.append("[");
                                int size = arrayList.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    if (i10 > 0) {
                                        sb2.append(",");
                                    }
                                    Object obj = arrayList.get(i10);
                                    if (obj != null) {
                                        i(sb2, field, obj);
                                    }
                                }
                                sb2.append("]");
                                break;
                            }
                    }
                } else {
                    sb2.append("null");
                }
            }
        }
        if (sb2.length() > 0) {
            sb2.append("}");
        } else {
            sb2.append("{}");
        }
        return sb2.toString();
    }
}
