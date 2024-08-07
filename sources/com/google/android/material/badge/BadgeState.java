package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.google.android.material.R$dimen;
import com.google.android.material.R$plurals;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.u;
import i8.c;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

public final class BadgeState {

    /* renamed from: a  reason: collision with root package name */
    public final State f5675a;

    /* renamed from: b  reason: collision with root package name */
    public final State f5676b = new State();

    /* renamed from: c  reason: collision with root package name */
    public final float f5677c;

    /* renamed from: d  reason: collision with root package name */
    public final float f5678d;

    /* renamed from: e  reason: collision with root package name */
    public final float f5679e;

    /* renamed from: f  reason: collision with root package name */
    public final float f5680f;

    /* renamed from: g  reason: collision with root package name */
    public final float f5681g;

    /* renamed from: h  reason: collision with root package name */
    public final float f5682h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5683i;

    /* renamed from: j  reason: collision with root package name */
    public final int f5684j;

    /* renamed from: k  reason: collision with root package name */
    public int f5685k;

    public BadgeState(Context context, State state) {
        int i10;
        AttributeSet attributeSet;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z11;
        Locale locale;
        int next;
        int i28 = a.f5706v;
        int i29 = a.f5705u;
        state = state == null ? new State() : state;
        int i30 = state.f5686a;
        if (i30 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i30);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                } else if (TextUtils.equals(xml.getName(), "badge")) {
                    attributeSet = Xml.asAttributeSet(xml);
                    i10 = attributeSet.getStyleAttribute();
                } else {
                    throw new XmlPullParserException("Must have a <badge> start tag");
                }
            } catch (IOException | XmlPullParserException e10) {
                StringBuilder q10 = a.q("Can't load badge resource ID #0x");
                q10.append(Integer.toHexString(i30));
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(q10.toString());
                notFoundException.initCause(e10);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i10 = 0;
        }
        if (i10 == 0) {
            i11 = i29;
        } else {
            i11 = i10;
        }
        TypedArray d10 = u.d(context, attributeSet, R$styleable.Badge, i28, i11, new int[0]);
        Resources resources = context.getResources();
        this.f5677c = (float) d10.getDimensionPixelSize(R$styleable.Badge_badgeRadius, -1);
        this.f5683i = context.getResources().getDimensionPixelSize(R$dimen.mtrl_badge_horizontal_edge_offset);
        this.f5684j = context.getResources().getDimensionPixelSize(R$dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f5678d = (float) d10.getDimensionPixelSize(R$styleable.Badge_badgeWithTextRadius, -1);
        int i31 = R$styleable.Badge_badgeWidth;
        int i32 = R$dimen.m3_badge_size;
        this.f5679e = d10.getDimension(i31, resources.getDimension(i32));
        int i33 = R$styleable.Badge_badgeWithTextWidth;
        int i34 = R$dimen.m3_badge_with_text_size;
        this.f5681g = d10.getDimension(i33, resources.getDimension(i34));
        this.f5680f = d10.getDimension(R$styleable.Badge_badgeHeight, resources.getDimension(i32));
        this.f5682h = d10.getDimension(R$styleable.Badge_badgeWithTextHeight, resources.getDimension(i34));
        this.f5685k = d10.getInt(R$styleable.Badge_offsetAlignmentMode, 1);
        State state2 = this.f5676b;
        int i35 = state.f5694p;
        state2.f5694p = i35 == -2 ? 255 : i35;
        int i36 = state.f5696r;
        if (i36 != -2) {
            state2.f5696r = i36;
        } else {
            int i37 = R$styleable.Badge_number;
            if (d10.hasValue(i37)) {
                this.f5676b.f5696r = d10.getInt(i37, 0);
            } else {
                this.f5676b.f5696r = -1;
            }
        }
        String str = state.f5695q;
        if (str != null) {
            this.f5676b.f5695q = str;
        } else {
            int i38 = R$styleable.Badge_badgeText;
            if (d10.hasValue(i38)) {
                this.f5676b.f5695q = d10.getString(i38);
            }
        }
        State state3 = this.f5676b;
        state3.f5700v = state.f5700v;
        CharSequence charSequence = state.f5701w;
        state3.f5701w = charSequence == null ? context.getString(R$string.mtrl_badge_numberless_content_description) : charSequence;
        State state4 = this.f5676b;
        int i39 = state.f5702x;
        state4.f5702x = i39 == 0 ? R$plurals.mtrl_badge_content_description : i39;
        int i40 = state.f5703y;
        state4.f5703y = i40 == 0 ? R$string.mtrl_exceed_max_badge_number_content_description : i40;
        Boolean bool = state.A;
        if (bool == null || bool.booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        state4.A = Boolean.valueOf(z10);
        State state5 = this.f5676b;
        int i41 = state.f5697s;
        state5.f5697s = i41 == -2 ? d10.getInt(R$styleable.Badge_maxCharacterCount, -2) : i41;
        State state6 = this.f5676b;
        int i42 = state.f5698t;
        state6.f5698t = i42 == -2 ? d10.getInt(R$styleable.Badge_maxNumber, -2) : i42;
        State state7 = this.f5676b;
        Integer num = state.f5690e;
        if (num == null) {
            i12 = d10.getResourceId(R$styleable.Badge_badgeShapeAppearance, R$style.ShapeAppearance_M3_Sys_Shape_Corner_Full);
        } else {
            i12 = num.intValue();
        }
        state7.f5690e = Integer.valueOf(i12);
        State state8 = this.f5676b;
        Integer num2 = state.f5691f;
        if (num2 == null) {
            i13 = d10.getResourceId(R$styleable.Badge_badgeShapeAppearanceOverlay, 0);
        } else {
            i13 = num2.intValue();
        }
        state8.f5691f = Integer.valueOf(i13);
        State state9 = this.f5676b;
        Integer num3 = state.f5692n;
        if (num3 == null) {
            i14 = d10.getResourceId(R$styleable.Badge_badgeWithTextShapeAppearance, R$style.ShapeAppearance_M3_Sys_Shape_Corner_Full);
        } else {
            i14 = num3.intValue();
        }
        state9.f5692n = Integer.valueOf(i14);
        State state10 = this.f5676b;
        Integer num4 = state.f5693o;
        if (num4 == null) {
            i15 = d10.getResourceId(R$styleable.Badge_badgeWithTextShapeAppearanceOverlay, 0);
        } else {
            i15 = num4.intValue();
        }
        state10.f5693o = Integer.valueOf(i15);
        State state11 = this.f5676b;
        Integer num5 = state.f5687b;
        if (num5 == null) {
            i16 = c.a(context, d10, R$styleable.Badge_backgroundColor).getDefaultColor();
        } else {
            i16 = num5.intValue();
        }
        state11.f5687b = Integer.valueOf(i16);
        State state12 = this.f5676b;
        Integer num6 = state.f5689d;
        if (num6 == null) {
            i17 = d10.getResourceId(R$styleable.Badge_badgeTextAppearance, R$style.TextAppearance_MaterialComponents_Badge);
        } else {
            i17 = num6.intValue();
        }
        state12.f5689d = Integer.valueOf(i17);
        Integer num7 = state.f5688c;
        if (num7 != null) {
            this.f5676b.f5688c = num7;
        } else {
            int i43 = R$styleable.Badge_badgeTextColor;
            if (d10.hasValue(i43)) {
                this.f5676b.f5688c = Integer.valueOf(c.a(context, d10, i43).getDefaultColor());
            } else {
                int intValue = this.f5676b.f5689d.intValue();
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(intValue, R$styleable.TextAppearance);
                obtainStyledAttributes.getDimension(R$styleable.TextAppearance_android_textSize, 0.0f);
                ColorStateList a10 = c.a(context, obtainStyledAttributes, R$styleable.TextAppearance_android_textColor);
                c.a(context, obtainStyledAttributes, R$styleable.TextAppearance_android_textColorHint);
                c.a(context, obtainStyledAttributes, R$styleable.TextAppearance_android_textColorLink);
                obtainStyledAttributes.getInt(R$styleable.TextAppearance_android_textStyle, 0);
                obtainStyledAttributes.getInt(R$styleable.TextAppearance_android_typeface, 1);
                int i44 = R$styleable.TextAppearance_fontFamily;
                i44 = !obtainStyledAttributes.hasValue(i44) ? R$styleable.TextAppearance_android_fontFamily : i44;
                obtainStyledAttributes.getResourceId(i44, 0);
                obtainStyledAttributes.getString(i44);
                obtainStyledAttributes.getBoolean(R$styleable.TextAppearance_textAllCaps, false);
                c.a(context, obtainStyledAttributes, R$styleable.TextAppearance_android_shadowColor);
                obtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowDx, 0.0f);
                obtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowDy, 0.0f);
                obtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowRadius, 0.0f);
                obtainStyledAttributes.recycle();
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(intValue, R$styleable.MaterialTextAppearance);
                int i45 = R$styleable.MaterialTextAppearance_android_letterSpacing;
                obtainStyledAttributes2.hasValue(i45);
                obtainStyledAttributes2.getFloat(i45, 0.0f);
                obtainStyledAttributes2.recycle();
                this.f5676b.f5688c = Integer.valueOf(a10.getDefaultColor());
            }
        }
        State state13 = this.f5676b;
        Integer num8 = state.f5704z;
        if (num8 == null) {
            i18 = d10.getInt(R$styleable.Badge_badgeGravity, 8388661);
        } else {
            i18 = num8.intValue();
        }
        state13.f5704z = Integer.valueOf(i18);
        State state14 = this.f5676b;
        Integer num9 = state.B;
        if (num9 == null) {
            i19 = d10.getDimensionPixelSize(R$styleable.Badge_badgeWidePadding, resources.getDimensionPixelSize(R$dimen.mtrl_badge_long_text_horizontal_padding));
        } else {
            i19 = num9.intValue();
        }
        state14.B = Integer.valueOf(i19);
        State state15 = this.f5676b;
        Integer num10 = state.C;
        if (num10 == null) {
            i20 = d10.getDimensionPixelSize(R$styleable.Badge_badgeVerticalPadding, resources.getDimensionPixelSize(R$dimen.m3_badge_with_text_vertical_padding));
        } else {
            i20 = num10.intValue();
        }
        state15.C = Integer.valueOf(i20);
        State state16 = this.f5676b;
        Integer num11 = state.D;
        if (num11 == null) {
            i21 = d10.getDimensionPixelOffset(R$styleable.Badge_horizontalOffset, 0);
        } else {
            i21 = num11.intValue();
        }
        state16.D = Integer.valueOf(i21);
        State state17 = this.f5676b;
        Integer num12 = state.E;
        if (num12 == null) {
            i22 = d10.getDimensionPixelOffset(R$styleable.Badge_verticalOffset, 0);
        } else {
            i22 = num12.intValue();
        }
        state17.E = Integer.valueOf(i22);
        State state18 = this.f5676b;
        Integer num13 = state.F;
        if (num13 == null) {
            i23 = d10.getDimensionPixelOffset(R$styleable.Badge_horizontalOffsetWithText, state18.D.intValue());
        } else {
            i23 = num13.intValue();
        }
        state18.F = Integer.valueOf(i23);
        State state19 = this.f5676b;
        Integer num14 = state.G;
        if (num14 == null) {
            i24 = d10.getDimensionPixelOffset(R$styleable.Badge_verticalOffsetWithText, state19.E.intValue());
        } else {
            i24 = num14.intValue();
        }
        state19.G = Integer.valueOf(i24);
        State state20 = this.f5676b;
        Integer num15 = state.J;
        if (num15 == null) {
            i25 = d10.getDimensionPixelOffset(R$styleable.Badge_largeFontVerticalOffsetAdjustment, 0);
        } else {
            i25 = num15.intValue();
        }
        state20.J = Integer.valueOf(i25);
        State state21 = this.f5676b;
        Integer num16 = state.H;
        if (num16 == null) {
            i26 = 0;
        } else {
            i26 = num16.intValue();
        }
        state21.H = Integer.valueOf(i26);
        State state22 = this.f5676b;
        Integer num17 = state.I;
        if (num17 == null) {
            i27 = 0;
        } else {
            i27 = num17.intValue();
        }
        state22.I = Integer.valueOf(i27);
        State state23 = this.f5676b;
        Boolean bool2 = state.K;
        if (bool2 == null) {
            z11 = d10.getBoolean(R$styleable.Badge_autoAdjustToWithinGrandparentBounds, false);
        } else {
            z11 = bool2.booleanValue();
        }
        state23.K = Boolean.valueOf(z11);
        d10.recycle();
        Locale locale2 = state.f5699u;
        if (locale2 == null) {
            State state24 = this.f5676b;
            if (Build.VERSION.SDK_INT >= 24) {
                locale = Locale.getDefault(Locale.Category.FORMAT);
            } else {
                locale = Locale.getDefault();
            }
            state24.f5699u = locale;
        } else {
            this.f5676b.f5699u = locale2;
        }
        this.f5675a = state;
    }

    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new a();
        public Boolean A = Boolean.TRUE;
        public Integer B;
        public Integer C;
        public Integer D;
        public Integer E;
        public Integer F;
        public Integer G;
        public Integer H;
        public Integer I;
        public Integer J;
        public Boolean K;

        /* renamed from: a  reason: collision with root package name */
        public int f5686a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f5687b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f5688c;

        /* renamed from: d  reason: collision with root package name */
        public Integer f5689d;

        /* renamed from: e  reason: collision with root package name */
        public Integer f5690e;

        /* renamed from: f  reason: collision with root package name */
        public Integer f5691f;

        /* renamed from: n  reason: collision with root package name */
        public Integer f5692n;

        /* renamed from: o  reason: collision with root package name */
        public Integer f5693o;

        /* renamed from: p  reason: collision with root package name */
        public int f5694p = 255;

        /* renamed from: q  reason: collision with root package name */
        public String f5695q;

        /* renamed from: r  reason: collision with root package name */
        public int f5696r = -2;

        /* renamed from: s  reason: collision with root package name */
        public int f5697s = -2;

        /* renamed from: t  reason: collision with root package name */
        public int f5698t = -2;

        /* renamed from: u  reason: collision with root package name */
        public Locale f5699u;

        /* renamed from: v  reason: collision with root package name */
        public CharSequence f5700v;

        /* renamed from: w  reason: collision with root package name */
        public CharSequence f5701w;

        /* renamed from: x  reason: collision with root package name */
        public int f5702x;

        /* renamed from: y  reason: collision with root package name */
        public int f5703y;

        /* renamed from: z  reason: collision with root package name */
        public Integer f5704z;

        public class a implements Parcelable.Creator<State> {
            public final Object createFromParcel(Parcel parcel) {
                return new State(parcel);
            }

            public final Object[] newArray(int i10) {
                return new State[i10];
            }
        }

        public State() {
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            String str;
            parcel.writeInt(this.f5686a);
            parcel.writeSerializable(this.f5687b);
            parcel.writeSerializable(this.f5688c);
            parcel.writeSerializable(this.f5689d);
            parcel.writeSerializable(this.f5690e);
            parcel.writeSerializable(this.f5691f);
            parcel.writeSerializable(this.f5692n);
            parcel.writeSerializable(this.f5693o);
            parcel.writeInt(this.f5694p);
            parcel.writeString(this.f5695q);
            parcel.writeInt(this.f5696r);
            parcel.writeInt(this.f5697s);
            parcel.writeInt(this.f5698t);
            CharSequence charSequence = this.f5700v;
            String str2 = null;
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            parcel.writeString(str);
            CharSequence charSequence2 = this.f5701w;
            if (charSequence2 != null) {
                str2 = charSequence2.toString();
            }
            parcel.writeString(str2);
            parcel.writeInt(this.f5702x);
            parcel.writeSerializable(this.f5704z);
            parcel.writeSerializable(this.B);
            parcel.writeSerializable(this.C);
            parcel.writeSerializable(this.D);
            parcel.writeSerializable(this.E);
            parcel.writeSerializable(this.F);
            parcel.writeSerializable(this.G);
            parcel.writeSerializable(this.J);
            parcel.writeSerializable(this.H);
            parcel.writeSerializable(this.I);
            parcel.writeSerializable(this.A);
            parcel.writeSerializable(this.f5699u);
            parcel.writeSerializable(this.K);
        }

        public State(Parcel parcel) {
            this.f5686a = parcel.readInt();
            this.f5687b = (Integer) parcel.readSerializable();
            this.f5688c = (Integer) parcel.readSerializable();
            this.f5689d = (Integer) parcel.readSerializable();
            this.f5690e = (Integer) parcel.readSerializable();
            this.f5691f = (Integer) parcel.readSerializable();
            this.f5692n = (Integer) parcel.readSerializable();
            this.f5693o = (Integer) parcel.readSerializable();
            this.f5694p = parcel.readInt();
            this.f5695q = parcel.readString();
            this.f5696r = parcel.readInt();
            this.f5697s = parcel.readInt();
            this.f5698t = parcel.readInt();
            this.f5700v = parcel.readString();
            this.f5701w = parcel.readString();
            this.f5702x = parcel.readInt();
            this.f5704z = (Integer) parcel.readSerializable();
            this.B = (Integer) parcel.readSerializable();
            this.C = (Integer) parcel.readSerializable();
            this.D = (Integer) parcel.readSerializable();
            this.E = (Integer) parcel.readSerializable();
            this.F = (Integer) parcel.readSerializable();
            this.G = (Integer) parcel.readSerializable();
            this.J = (Integer) parcel.readSerializable();
            this.H = (Integer) parcel.readSerializable();
            this.I = (Integer) parcel.readSerializable();
            this.A = (Boolean) parcel.readSerializable();
            this.f5699u = (Locale) parcel.readSerializable();
            this.K = (Boolean) parcel.readSerializable();
        }
    }
}
