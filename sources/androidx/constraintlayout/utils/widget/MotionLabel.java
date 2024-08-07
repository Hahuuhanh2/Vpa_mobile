package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.R$attr;
import androidx.constraintlayout.widget.R$styleable;
import f1.c;

public class MotionLabel extends View implements c {
    public int A = 1;
    public int B = 1;
    public String C;
    public int D = 8388659;
    public int E = 0;
    public boolean F = false;
    public float G;
    public float H;
    public float I;
    public Drawable J;
    public Matrix K;
    public Bitmap L;
    public BitmapShader M;
    public Matrix N;
    public float O = Float.NaN;
    public float P = Float.NaN;
    public float Q = 0.0f;
    public float R = 0.0f;
    public Paint S = new Paint();
    public int T = 0;
    public Rect U;
    public Paint V;
    public float W;

    /* renamed from: a  reason: collision with root package name */
    public TextPaint f1807a = new TextPaint();

    /* renamed from: a0  reason: collision with root package name */
    public float f1808a0 = Float.NaN;

    /* renamed from: b  reason: collision with root package name */
    public Path f1809b = new Path();

    /* renamed from: b0  reason: collision with root package name */
    public float f1810b0 = Float.NaN;

    /* renamed from: c  reason: collision with root package name */
    public int f1811c = 65535;

    /* renamed from: c0  reason: collision with root package name */
    public float f1812c0 = Float.NaN;

    /* renamed from: d  reason: collision with root package name */
    public int f1813d = 65535;

    /* renamed from: d0  reason: collision with root package name */
    public float f1814d0 = Float.NaN;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1815e = false;

    /* renamed from: f  reason: collision with root package name */
    public float f1816f = 0.0f;

    /* renamed from: n  reason: collision with root package name */
    public float f1817n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    public ViewOutlineProvider f1818o;

    /* renamed from: p  reason: collision with root package name */
    public RectF f1819p;

    /* renamed from: q  reason: collision with root package name */
    public float f1820q = 48.0f;

    /* renamed from: r  reason: collision with root package name */
    public float f1821r = Float.NaN;

    /* renamed from: s  reason: collision with root package name */
    public int f1822s;

    /* renamed from: t  reason: collision with root package name */
    public int f1823t;

    /* renamed from: u  reason: collision with root package name */
    public float f1824u = 0.0f;

    /* renamed from: v  reason: collision with root package name */
    public String f1825v = "Hello World";

    /* renamed from: w  reason: collision with root package name */
    public boolean f1826w = true;

    /* renamed from: x  reason: collision with root package name */
    public Rect f1827x = new Rect();

    /* renamed from: y  reason: collision with root package name */
    public int f1828y = 1;

    /* renamed from: z  reason: collision with root package name */
    public int f1829z = 1;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        public final void getOutline(View view, Outline outline) {
            int width = MotionLabel.this.getWidth();
            int height = MotionLabel.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * MotionLabel.this.f1816f) / 2.0f);
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), MotionLabel.this.f1817n);
        }
    }

    public MotionLabel(Context context) {
        super(context);
        c(context, (AttributeSet) null);
    }

    private float getHorizontalOffset() {
        float f10;
        float f11;
        if (Float.isNaN(this.f1821r)) {
            f10 = 1.0f;
        } else {
            f10 = this.f1820q / this.f1821r;
        }
        TextPaint textPaint = this.f1807a;
        String str = this.f1825v;
        float measureText = textPaint.measureText(str, 0, str.length()) * f10;
        if (Float.isNaN(this.H)) {
            f11 = (float) getMeasuredWidth();
        } else {
            f11 = this.H;
        }
        return ((this.Q + 1.0f) * (((f11 - ((float) getPaddingLeft())) - ((float) getPaddingRight())) - measureText)) / 2.0f;
    }

    private float getVerticalOffset() {
        float f10;
        float f11;
        if (Float.isNaN(this.f1821r)) {
            f10 = 1.0f;
        } else {
            f10 = this.f1820q / this.f1821r;
        }
        Paint.FontMetrics fontMetrics = this.f1807a.getFontMetrics();
        if (Float.isNaN(this.I)) {
            f11 = (float) getMeasuredHeight();
        } else {
            f11 = this.I;
        }
        float paddingTop = (f11 - ((float) getPaddingTop())) - ((float) getPaddingBottom());
        float f12 = fontMetrics.descent;
        float f13 = fontMetrics.ascent;
        return (((1.0f - this.R) * (paddingTop - ((f12 - f13) * f10))) / 2.0f) - (f10 * f13);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        float f14;
        int i10 = (int) (f10 + 0.5f);
        this.G = f10 - ((float) i10);
        int i11 = (int) (f12 + 0.5f);
        int i12 = i11 - i10;
        int i13 = (int) (f13 + 0.5f);
        int i14 = (int) (0.5f + f11);
        int i15 = i13 - i14;
        float f15 = f12 - f10;
        this.H = f15;
        float f16 = f13 - f11;
        this.I = f16;
        if (this.N != null) {
            this.H = f15;
            this.I = f16;
            d();
        }
        if (getMeasuredHeight() == i15 && getMeasuredWidth() == i12) {
            super.layout(i10, i14, i11, i13);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
            super.layout(i10, i14, i11, i13);
        }
        if (this.F) {
            if (this.U == null) {
                this.V = new Paint();
                this.U = new Rect();
                this.V.set(this.f1807a);
                this.W = this.V.getTextSize();
            }
            this.H = f15;
            this.I = f16;
            Paint paint = this.V;
            String str = this.f1825v;
            paint.getTextBounds(str, 0, str.length(), this.U);
            int width = this.U.width();
            float height = ((float) this.U.height()) * 1.3f;
            float f17 = (f15 - ((float) this.f1829z)) - ((float) this.f1828y);
            float f18 = (f16 - ((float) this.B)) - ((float) this.A);
            float f19 = (float) width;
            if (f19 * f18 > height * f17) {
                this.f1807a.setTextSize((this.W * f17) / f19);
            } else {
                this.f1807a.setTextSize((this.W * f18) / height);
            }
            if (this.f1815e || !Float.isNaN(this.f1821r)) {
                if (Float.isNaN(this.f1821r)) {
                    f14 = 1.0f;
                } else {
                    f14 = this.f1820q / this.f1821r;
                }
                b(f14);
            }
        }
    }

    public final void b(float f10) {
        if (this.f1815e || f10 != 1.0f) {
            this.f1809b.reset();
            String str = this.f1825v;
            int length = str.length();
            this.f1807a.getTextBounds(str, 0, length, this.f1827x);
            this.f1807a.getTextPath(str, 0, length, 0.0f, 0.0f, this.f1809b);
            if (f10 != 1.0f) {
                f1.a.a();
                Matrix matrix = new Matrix();
                matrix.postScale(f10, f10);
                this.f1809b.transform(matrix);
            }
            Rect rect = this.f1827x;
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = (float) getHeight();
            rectF.right = (float) getWidth();
            this.f1826w = false;
        }
    }

    public final void c(Context context, AttributeSet attributeSet) {
        Typeface typeface;
        Typeface typeface2;
        int i10;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R$attr.colorPrimary, typedValue, true);
        TextPaint textPaint = this.f1807a;
        int i11 = typedValue.data;
        this.f1811c = i11;
        textPaint.setColor(i11);
        boolean z10 = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.MotionLabel);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = obtainStyledAttributes.getIndex(i12);
                if (index == R$styleable.MotionLabel_android_text) {
                    setText(obtainStyledAttributes.getText(index));
                } else if (index == R$styleable.MotionLabel_android_fontFamily) {
                    this.C = obtainStyledAttributes.getString(index);
                } else if (index == R$styleable.MotionLabel_scaleFromTextSize) {
                    this.f1821r = (float) obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f1821r);
                } else if (index == R$styleable.MotionLabel_android_textSize) {
                    this.f1820q = (float) obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f1820q);
                } else if (index == R$styleable.MotionLabel_android_textStyle) {
                    this.f1822s = obtainStyledAttributes.getInt(index, this.f1822s);
                } else if (index == R$styleable.MotionLabel_android_typeface) {
                    this.f1823t = obtainStyledAttributes.getInt(index, this.f1823t);
                } else if (index == R$styleable.MotionLabel_android_textColor) {
                    this.f1811c = obtainStyledAttributes.getColor(index, this.f1811c);
                } else if (index == R$styleable.MotionLabel_borderRound) {
                    float dimension = obtainStyledAttributes.getDimension(index, this.f1817n);
                    this.f1817n = dimension;
                    setRound(dimension);
                } else if (index == R$styleable.MotionLabel_borderRoundPercent) {
                    float f10 = obtainStyledAttributes.getFloat(index, this.f1816f);
                    this.f1816f = f10;
                    setRoundPercent(f10);
                } else if (index == R$styleable.MotionLabel_android_gravity) {
                    setGravity(obtainStyledAttributes.getInt(index, -1));
                } else if (index == R$styleable.MotionLabel_android_autoSizeTextType) {
                    this.E = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.MotionLabel_textOutlineColor) {
                    this.f1813d = obtainStyledAttributes.getInt(index, this.f1813d);
                    this.f1815e = true;
                } else if (index == R$styleable.MotionLabel_textOutlineThickness) {
                    this.f1824u = obtainStyledAttributes.getDimension(index, this.f1824u);
                    this.f1815e = true;
                } else if (index == R$styleable.MotionLabel_textBackground) {
                    this.J = obtainStyledAttributes.getDrawable(index);
                    this.f1815e = true;
                } else if (index == R$styleable.MotionLabel_textBackgroundPanX) {
                    this.f1808a0 = obtainStyledAttributes.getFloat(index, this.f1808a0);
                } else if (index == R$styleable.MotionLabel_textBackgroundPanY) {
                    this.f1810b0 = obtainStyledAttributes.getFloat(index, this.f1810b0);
                } else if (index == R$styleable.MotionLabel_textPanX) {
                    this.Q = obtainStyledAttributes.getFloat(index, this.Q);
                } else if (index == R$styleable.MotionLabel_textPanY) {
                    this.R = obtainStyledAttributes.getFloat(index, this.R);
                } else if (index == R$styleable.MotionLabel_textBackgroundRotate) {
                    this.f1814d0 = obtainStyledAttributes.getFloat(index, this.f1814d0);
                } else if (index == R$styleable.MotionLabel_textBackgroundZoom) {
                    this.f1812c0 = obtainStyledAttributes.getFloat(index, this.f1812c0);
                } else if (index == R$styleable.MotionLabel_textureHeight) {
                    this.O = obtainStyledAttributes.getDimension(index, this.O);
                } else if (index == R$styleable.MotionLabel_textureWidth) {
                    this.P = obtainStyledAttributes.getDimension(index, this.P);
                } else if (index == R$styleable.MotionLabel_textureEffect) {
                    this.T = obtainStyledAttributes.getInt(index, this.T);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.J != null) {
            this.N = new Matrix();
            int intrinsicWidth = this.J.getIntrinsicWidth();
            int intrinsicHeight = this.J.getIntrinsicHeight();
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                if (Float.isNaN(this.P)) {
                    intrinsicWidth = 128;
                } else {
                    intrinsicWidth = (int) this.P;
                }
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                if (Float.isNaN(this.O)) {
                    intrinsicHeight = 128;
                } else {
                    intrinsicHeight = (int) this.O;
                }
            }
            if (this.T != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.L = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.L);
            this.J.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.J.setFilterBitmap(true);
            this.J.draw(canvas);
            if (this.T != 0) {
                Bitmap bitmap = this.L;
                System.nanoTime();
                int width = bitmap.getWidth() / 2;
                int height = bitmap.getHeight() / 2;
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
                for (int i13 = 0; i13 < 4 && width >= 32 && height >= 32; i13++) {
                    width /= 2;
                    height /= 2;
                    createScaledBitmap = Bitmap.createScaledBitmap(createScaledBitmap, width, height, true);
                }
                this.L = createScaledBitmap;
            }
            Bitmap bitmap2 = this.L;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.M = new BitmapShader(bitmap2, tileMode, tileMode);
        }
        this.f1828y = getPaddingLeft();
        this.f1829z = getPaddingRight();
        this.A = getPaddingTop();
        this.B = getPaddingBottom();
        String str = this.C;
        int i14 = this.f1823t;
        int i15 = this.f1822s;
        if (str != null) {
            typeface = Typeface.create(str, i15);
            if (typeface != null) {
                setTypeface(typeface);
                this.f1807a.setColor(this.f1811c);
                this.f1807a.setStrokeWidth(this.f1824u);
                this.f1807a.setStyle(Paint.Style.FILL_AND_STROKE);
                this.f1807a.setFlags(128);
                setTextSize(this.f1820q);
                this.f1807a.setAntiAlias(true);
            }
        } else {
            typeface = null;
        }
        if (i14 == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i14 == 2) {
            typeface = Typeface.SERIF;
        } else if (i14 == 3) {
            typeface = Typeface.MONOSPACE;
        }
        float f11 = 0.0f;
        if (i15 > 0) {
            if (typeface == null) {
                typeface2 = Typeface.defaultFromStyle(i15);
            } else {
                typeface2 = Typeface.create(typeface, i15);
            }
            setTypeface(typeface2);
            if (typeface2 != null) {
                i10 = typeface2.getStyle();
            } else {
                i10 = 0;
            }
            int i16 = (~i10) & i15;
            TextPaint textPaint2 = this.f1807a;
            if ((i16 & 1) != 0) {
                z10 = true;
            }
            textPaint2.setFakeBoldText(z10);
            TextPaint textPaint3 = this.f1807a;
            if ((i16 & 2) != 0) {
                f11 = -0.25f;
            }
            textPaint3.setTextSkewX(f11);
        } else {
            this.f1807a.setFakeBoldText(false);
            this.f1807a.setTextSkewX(0.0f);
            setTypeface(typeface);
        }
        this.f1807a.setColor(this.f1811c);
        this.f1807a.setStrokeWidth(this.f1824u);
        this.f1807a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f1807a.setFlags(128);
        setTextSize(this.f1820q);
        this.f1807a.setAntiAlias(true);
    }

    public final void d() {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16 = 0.0f;
        if (Float.isNaN(this.f1808a0)) {
            f10 = 0.0f;
        } else {
            f10 = this.f1808a0;
        }
        if (Float.isNaN(this.f1810b0)) {
            f11 = 0.0f;
        } else {
            f11 = this.f1810b0;
        }
        if (Float.isNaN(this.f1812c0)) {
            f12 = 1.0f;
        } else {
            f12 = this.f1812c0;
        }
        if (!Float.isNaN(this.f1814d0)) {
            f16 = this.f1814d0;
        }
        this.N.reset();
        float width = (float) this.L.getWidth();
        float height = (float) this.L.getHeight();
        if (Float.isNaN(this.P)) {
            f13 = this.H;
        } else {
            f13 = this.P;
        }
        if (Float.isNaN(this.O)) {
            f14 = this.I;
        } else {
            f14 = this.O;
        }
        if (width * f14 < height * f13) {
            f15 = f13 / width;
        } else {
            f15 = f14 / height;
        }
        float f17 = f12 * f15;
        this.N.postScale(f17, f17);
        float f18 = width * f17;
        float f19 = f13 - f18;
        float f20 = f17 * height;
        float f21 = f14 - f20;
        if (!Float.isNaN(this.O)) {
            f21 = this.O / 2.0f;
        }
        if (!Float.isNaN(this.P)) {
            f19 = this.P / 2.0f;
        }
        this.N.postTranslate((((f10 * f19) + f13) - f18) * 0.5f, (((f11 * f21) + f14) - f20) * 0.5f);
        this.N.postRotate(f16, f13 / 2.0f, f14 / 2.0f);
        this.M.setLocalMatrix(this.N);
    }

    public float getRound() {
        return this.f1817n;
    }

    public float getRoundPercent() {
        return this.f1816f;
    }

    public float getScaleFromTextSize() {
        return this.f1821r;
    }

    public float getTextBackgroundPanX() {
        return this.f1808a0;
    }

    public float getTextBackgroundPanY() {
        return this.f1810b0;
    }

    public float getTextBackgroundRotate() {
        return this.f1814d0;
    }

    public float getTextBackgroundZoom() {
        return this.f1812c0;
    }

    public int getTextOutlineColor() {
        return this.f1813d;
    }

    public float getTextPanX() {
        return this.Q;
    }

    public float getTextPanY() {
        return this.R;
    }

    public float getTextureHeight() {
        return this.O;
    }

    public float getTextureWidth() {
        return this.P;
    }

    public Typeface getTypeface() {
        return this.f1807a.getTypeface();
    }

    public final void layout(int i10, int i11, int i12, int i13) {
        float f10;
        super.layout(i10, i11, i12, i13);
        boolean isNaN = Float.isNaN(this.f1821r);
        if (isNaN) {
            f10 = 1.0f;
        } else {
            f10 = this.f1820q / this.f1821r;
        }
        this.H = (float) (i12 - i10);
        this.I = (float) (i13 - i11);
        if (this.F) {
            if (this.U == null) {
                this.V = new Paint();
                this.U = new Rect();
                this.V.set(this.f1807a);
                this.W = this.V.getTextSize();
            }
            Paint paint = this.V;
            String str = this.f1825v;
            paint.getTextBounds(str, 0, str.length(), this.U);
            int width = this.U.width();
            int height = (int) (((float) this.U.height()) * 1.3f);
            float f11 = (this.H - ((float) this.f1829z)) - ((float) this.f1828y);
            float f12 = (this.I - ((float) this.B)) - ((float) this.A);
            if (isNaN) {
                float f13 = (float) width;
                float f14 = (float) height;
                if (f13 * f12 > f14 * f11) {
                    this.f1807a.setTextSize((this.W * f11) / f13);
                } else {
                    this.f1807a.setTextSize((this.W * f12) / f14);
                }
            } else {
                float f15 = (float) width;
                float f16 = (float) height;
                if (f15 * f12 > f16 * f11) {
                    f10 = f11 / f15;
                } else {
                    f10 = f12 / f16;
                }
            }
        }
        if (this.f1815e || !isNaN) {
            float f17 = (float) i10;
            float f18 = (float) i11;
            float f19 = (float) i12;
            float f20 = (float) i13;
            if (this.N != null) {
                this.H = f19 - f17;
                this.I = f20 - f18;
                d();
            }
            b(f10);
        }
    }

    public final void onDraw(Canvas canvas) {
        float f10;
        if (Float.isNaN(this.f1821r)) {
            f10 = 1.0f;
        } else {
            f10 = this.f1820q / this.f1821r;
        }
        super.onDraw(canvas);
        if (this.f1815e || f10 != 1.0f) {
            if (this.f1826w) {
                b(f10);
            }
            if (this.K == null) {
                this.K = new Matrix();
            }
            if (this.f1815e) {
                this.S.set(this.f1807a);
                this.K.reset();
                float horizontalOffset = ((float) this.f1828y) + getHorizontalOffset();
                float verticalOffset = ((float) this.A) + getVerticalOffset();
                this.K.postTranslate(horizontalOffset, verticalOffset);
                this.K.preScale(f10, f10);
                this.f1809b.transform(this.K);
                if (this.M != null) {
                    this.f1807a.setFilterBitmap(true);
                    this.f1807a.setShader(this.M);
                } else {
                    this.f1807a.setColor(this.f1811c);
                }
                this.f1807a.setStyle(Paint.Style.FILL);
                this.f1807a.setStrokeWidth(this.f1824u);
                canvas.drawPath(this.f1809b, this.f1807a);
                if (this.M != null) {
                    this.f1807a.setShader((Shader) null);
                }
                this.f1807a.setColor(this.f1813d);
                this.f1807a.setStyle(Paint.Style.STROKE);
                this.f1807a.setStrokeWidth(this.f1824u);
                canvas.drawPath(this.f1809b, this.f1807a);
                this.K.reset();
                this.K.postTranslate(-horizontalOffset, -verticalOffset);
                this.f1809b.transform(this.K);
                this.f1807a.set(this.S);
                return;
            }
            float horizontalOffset2 = ((float) this.f1828y) + getHorizontalOffset();
            float verticalOffset2 = ((float) this.A) + getVerticalOffset();
            this.K.reset();
            this.K.preTranslate(horizontalOffset2, verticalOffset2);
            this.f1809b.transform(this.K);
            this.f1807a.setColor(this.f1811c);
            this.f1807a.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f1807a.setStrokeWidth(this.f1824u);
            canvas.drawPath(this.f1809b, this.f1807a);
            this.K.reset();
            this.K.preTranslate(-horizontalOffset2, -verticalOffset2);
            this.f1809b.transform(this.K);
            return;
        }
        canvas.drawText(this.f1825v, this.G + ((float) this.f1828y) + getHorizontalOffset(), ((float) this.A) + getVerticalOffset(), this.f1807a);
    }

    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.F = false;
        this.f1828y = getPaddingLeft();
        this.f1829z = getPaddingRight();
        this.A = getPaddingTop();
        this.B = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            TextPaint textPaint = this.f1807a;
            String str = this.f1825v;
            textPaint.getTextBounds(str, 0, str.length(), this.f1827x);
            if (mode != 1073741824) {
                size = (int) (((float) this.f1827x.width()) + 0.99999f);
            }
            size += this.f1828y + this.f1829z;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (((float) this.f1807a.getFontMetricsInt((Paint.FontMetricsInt) null)) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.A + this.B + fontMetricsInt;
            }
        } else if (this.E != 0) {
            this.F = true;
        }
        setMeasuredDimension(size, size2);
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int i10) {
        if ((i10 & 8388615) == 0) {
            i10 |= 8388611;
        }
        if ((i10 & 112) == 0) {
            i10 |= 48;
        }
        if (i10 != this.D) {
            invalidate();
        }
        this.D = i10;
        int i11 = i10 & 112;
        if (i11 == 48) {
            this.R = -1.0f;
        } else if (i11 != 80) {
            this.R = 0.0f;
        } else {
            this.R = 1.0f;
        }
        int i12 = i10 & 8388615;
        if (i12 != 3) {
            if (i12 != 5) {
                if (i12 != 8388611) {
                    if (i12 != 8388613) {
                        this.Q = 0.0f;
                        return;
                    }
                }
            }
            this.Q = 1.0f;
            return;
        }
        this.Q = -1.0f;
    }

    public void setRound(float f10) {
        boolean z10;
        if (Float.isNaN(f10)) {
            this.f1817n = f10;
            float f11 = this.f1816f;
            this.f1816f = -1.0f;
            setRoundPercent(f11);
            return;
        }
        if (this.f1817n != f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1817n = f10;
        if (f10 != 0.0f) {
            if (this.f1809b == null) {
                this.f1809b = new Path();
            }
            if (this.f1819p == null) {
                this.f1819p = new RectF();
            }
            if (this.f1818o == null) {
                b bVar = new b();
                this.f1818o = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f1819p.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.f1809b.reset();
            Path path = this.f1809b;
            RectF rectF = this.f1819p;
            float f12 = this.f1817n;
            path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f10) {
        boolean z10;
        if (this.f1816f != f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1816f = f10;
        if (f10 != 0.0f) {
            if (this.f1809b == null) {
                this.f1809b = new Path();
            }
            if (this.f1819p == null) {
                this.f1819p = new RectF();
            }
            if (this.f1818o == null) {
                a aVar = new a();
                this.f1818o = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.f1816f) / 2.0f;
            this.f1819p.set(0.0f, 0.0f, (float) width, (float) height);
            this.f1809b.reset();
            this.f1809b.addRoundRect(this.f1819p, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f10) {
        this.f1821r = f10;
    }

    public void setText(CharSequence charSequence) {
        this.f1825v = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f10) {
        this.f1808a0 = f10;
        d();
        invalidate();
    }

    public void setTextBackgroundPanY(float f10) {
        this.f1810b0 = f10;
        d();
        invalidate();
    }

    public void setTextBackgroundRotate(float f10) {
        this.f1814d0 = f10;
        d();
        invalidate();
    }

    public void setTextBackgroundZoom(float f10) {
        this.f1812c0 = f10;
        d();
        invalidate();
    }

    public void setTextFillColor(int i10) {
        this.f1811c = i10;
        invalidate();
    }

    public void setTextOutlineColor(int i10) {
        this.f1813d = i10;
        this.f1815e = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f10) {
        this.f1824u = f10;
        this.f1815e = true;
        if (Float.isNaN(f10)) {
            this.f1824u = 1.0f;
            this.f1815e = false;
        }
        invalidate();
    }

    public void setTextPanX(float f10) {
        this.Q = f10;
        invalidate();
    }

    public void setTextPanY(float f10) {
        this.R = f10;
        invalidate();
    }

    public void setTextSize(float f10) {
        float f11;
        this.f1820q = f10;
        f1.a.a();
        float f12 = this.f1821r;
        TextPaint textPaint = this.f1807a;
        if (!Float.isNaN(f12)) {
            f10 = this.f1821r;
        }
        textPaint.setTextSize(f10);
        if (Float.isNaN(this.f1821r)) {
            f11 = 1.0f;
        } else {
            f11 = this.f1820q / this.f1821r;
        }
        b(f11);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f10) {
        this.O = f10;
        d();
        invalidate();
    }

    public void setTextureWidth(float f10) {
        this.P = f10;
        d();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        if (this.f1807a.getTypeface() != typeface) {
            this.f1807a.setTypeface(typeface);
        }
    }

    public MotionLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context, attributeSet);
    }

    public MotionLabel(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c(context, attributeSet);
    }
}
