package n0;

import al.g0;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Size;
import android.view.Surface;
import c0.p0;
import c0.x;
import f0.b0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: OpenGlRenderer */
public final class m {

    /* renamed from: n  reason: collision with root package name */
    public static final String f13352n;

    /* renamed from: o  reason: collision with root package name */
    public static final String f13353o;

    /* renamed from: p  reason: collision with root package name */
    public static final String f13354p;

    /* renamed from: q  reason: collision with root package name */
    public static final String f13355q;

    /* renamed from: r  reason: collision with root package name */
    public static final FloatBuffer f13356r;

    /* renamed from: s  reason: collision with root package name */
    public static final FloatBuffer f13357s;

    /* renamed from: t  reason: collision with root package name */
    public static final b f13358t = new b(EGL14.EGL_NO_SURFACE, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f13359a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f13360b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public Thread f13361c;

    /* renamed from: d  reason: collision with root package name */
    public EGLDisplay f13362d = EGL14.EGL_NO_DISPLAY;

    /* renamed from: e  reason: collision with root package name */
    public EGLContext f13363e = EGL14.EGL_NO_CONTEXT;

    /* renamed from: f  reason: collision with root package name */
    public EGLConfig f13364f;

    /* renamed from: g  reason: collision with root package name */
    public EGLSurface f13365g = EGL14.EGL_NO_SURFACE;

    /* renamed from: h  reason: collision with root package name */
    public Surface f13366h;

    /* renamed from: i  reason: collision with root package name */
    public int f13367i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f13368j = -1;

    /* renamed from: k  reason: collision with root package name */
    public int f13369k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f13370l = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f13371m = -1;

    /* compiled from: OpenGlRenderer */
    public static abstract class a {
        public abstract EGLSurface a();

        public abstract int b();

        public abstract int c();
    }

    static {
        Locale locale = Locale.US;
        f13352n = String.format(locale, "uniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 %s;\nvoid main() {\n    gl_Position = aPosition;\n    %s = (uTexMatrix * aTextureCoord).xy;\n}\n", new Object[]{"vTextureCoord", "vTextureCoord"});
        f13353o = String.format(locale, "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nout vec2 %s;\nvoid main() {\n  gl_Position = aPosition;\n  %s = (uTexMatrix * aTextureCoord).xy;\n}\n", new Object[]{"vTextureCoord", "vTextureCoord"});
        f13354p = String.format(locale, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 %s;\nuniform samplerExternalOES %s;\nvoid main() {\n    gl_FragColor = texture2D(%s, %s);\n}\n", new Object[]{"vTextureCoord", "sTexture", "sTexture", "vTextureCoord"});
        f13355q = String.format(locale, "#version 300 es\n#extension GL_OES_EGL_image_external : require\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT %s;\nin vec2 %s;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorTransform = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorTransform * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(%s, %s).xyz;\n  outColor = vec4(yuvToRgb(srcYuv), 1.0);\n}", new Object[]{"sTexture", "vTextureCoord", "sTexture", "vTextureCoord"});
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer.position(0);
        f13356r = asFloatBuffer;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        asFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer2.position(0);
        f13357s = asFloatBuffer2;
    }

    public static void a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            StringBuilder v2 = b0.v(str, ": EGL error: 0x");
            v2.append(Integer.toHexString(eglGetError));
            throw new IllegalStateException(v2.toString());
        }
    }

    public static void b(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder v2 = b0.v(str, ": GL error 0x");
            v2.append(Integer.toHexString(glGetError));
            throw new IllegalStateException(v2.toString());
        }
    }

    public static void e(int i10, String str) {
        if (i10 < 0) {
            throw new IllegalStateException(b0.s("Unable to locate '", str, "' in program"));
        }
    }

    public static EGLSurface j(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface) {
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, new int[]{12344}, 0);
        a("eglCreateWindowSurface");
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static int m(x xVar, o oVar) {
        String str;
        if (oVar == o.f13372a) {
            if (xVar.a()) {
                str = f13355q;
            } else {
                str = f13354p;
            }
            return o(35632, str);
        }
        try {
            oVar.getClass();
            throw new IllegalArgumentException("Invalid fragment shader");
        } catch (Throwable th2) {
            if (th2 instanceof IllegalArgumentException) {
                throw th2;
            }
            throw new IllegalArgumentException("Unable to compile fragment shader", th2);
        }
    }

    public static int o(int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        b("glCreateShader type=" + i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        p0.g("OpenGlRenderer");
        GLES20.glDeleteShader(glCreateShader);
        StringBuilder l10 = l.l("Could not compile shader type ", i10, ":");
        l10.append(GLES20.glGetShaderInfoLog(glCreateShader));
        throw new IllegalStateException(l10.toString());
    }

    public final void c() {
        boolean z10;
        if (this.f13361c == Thread.currentThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0.E("Method call must be called on the GL thread.", z10);
    }

    public final void d(boolean z10) {
        boolean z11;
        String str;
        if (z10 == this.f13359a.get()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10) {
            str = "OpenGlRenderer is not initialized";
        } else {
            str = "OpenGlRenderer is already initialized";
        }
        g0.E(str, z11);
    }

    public final void f(x xVar) {
        int i10;
        int i11;
        int i12;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f13362d = eglGetDisplay;
        if (!Objects.equals(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(this.f13362d, iArr, 0, iArr, 1)) {
                if (xVar.a()) {
                    i10 = 10;
                } else {
                    i10 = 8;
                }
                if (xVar.a()) {
                    i11 = 2;
                } else {
                    i11 = 8;
                }
                if (xVar.a()) {
                    i12 = 64;
                } else {
                    i12 = 4;
                }
                int i13 = 3;
                int[] iArr2 = {12324, i10, 12323, i10, 12322, i10, 12321, i11, 12325, 0, 12326, 0, 12352, i12, 12610, !xVar.a(), 12339, 5, 12344};
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig(this.f13362d, iArr2, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    int[] iArr3 = new int[3];
                    iArr3[0] = 12440;
                    if (!xVar.a()) {
                        i13 = 2;
                    }
                    iArr3[1] = i13;
                    iArr3[2] = 12344;
                    EGLContext eglCreateContext = EGL14.eglCreateContext(this.f13362d, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr3, 0);
                    a("eglCreateContext");
                    this.f13364f = eGLConfig;
                    this.f13363e = eglCreateContext;
                    EGL14.eglQueryContext(this.f13362d, eglCreateContext, 12440, new int[1], 0);
                    return;
                }
                throw new IllegalStateException("Unable to find a suitable EGLConfig");
            }
            this.f13362d = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        throw new IllegalStateException("Unable to get EGL14 display");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(c0.x r7, n0.o r8) {
        /*
            r6 = this;
            java.lang.String r0 = "glAttachShader"
            r1 = -1
            boolean r2 = r7.a()     // Catch:{ IllegalStateException -> 0x0070, IllegalArgumentException -> 0x006e }
            if (r2 == 0) goto L_0x000c
            java.lang.String r2 = f13353o     // Catch:{ IllegalStateException -> 0x0070, IllegalArgumentException -> 0x006e }
            goto L_0x000e
        L_0x000c:
            java.lang.String r2 = f13352n     // Catch:{ IllegalStateException -> 0x0070, IllegalArgumentException -> 0x006e }
        L_0x000e:
            r3 = 35633(0x8b31, float:4.9932E-41)
            int r2 = o(r3, r2)     // Catch:{ IllegalStateException -> 0x0070, IllegalArgumentException -> 0x006e }
            int r7 = m(r7, r8)     // Catch:{ IllegalStateException -> 0x0069, IllegalArgumentException -> 0x0067 }
            int r8 = android.opengl.GLES20.glCreateProgram()     // Catch:{ IllegalStateException -> 0x0063, IllegalArgumentException -> 0x0061 }
            java.lang.String r3 = "glCreateProgram"
            b(r3)     // Catch:{ IllegalStateException -> 0x005f, IllegalArgumentException -> 0x005d }
            android.opengl.GLES20.glAttachShader(r8, r2)     // Catch:{ IllegalStateException -> 0x005f, IllegalArgumentException -> 0x005d }
            b(r0)     // Catch:{ IllegalStateException -> 0x005f, IllegalArgumentException -> 0x005d }
            android.opengl.GLES20.glAttachShader(r8, r7)     // Catch:{ IllegalStateException -> 0x005f, IllegalArgumentException -> 0x005d }
            b(r0)     // Catch:{ IllegalStateException -> 0x005f, IllegalArgumentException -> 0x005d }
            android.opengl.GLES20.glLinkProgram(r8)     // Catch:{ IllegalStateException -> 0x005f, IllegalArgumentException -> 0x005d }
            r0 = 1
            int[] r3 = new int[r0]     // Catch:{ IllegalStateException -> 0x005f, IllegalArgumentException -> 0x005d }
            r4 = 35714(0x8b82, float:5.0046E-41)
            r5 = 0
            android.opengl.GLES20.glGetProgramiv(r8, r4, r3, r5)     // Catch:{ IllegalStateException -> 0x005f, IllegalArgumentException -> 0x005d }
            r3 = r3[r5]     // Catch:{ IllegalStateException -> 0x005f, IllegalArgumentException -> 0x005d }
            if (r3 != r0) goto L_0x0042
            r6.f13368j = r8     // Catch:{ IllegalStateException -> 0x005f, IllegalArgumentException -> 0x005d }
            return
        L_0x0042:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x005f, IllegalArgumentException -> 0x005d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x005f, IllegalArgumentException -> 0x005d }
            r3.<init>()     // Catch:{ IllegalStateException -> 0x005f, IllegalArgumentException -> 0x005d }
            java.lang.String r4 = "Could not link program: "
            r3.append(r4)     // Catch:{ IllegalStateException -> 0x005f, IllegalArgumentException -> 0x005d }
            java.lang.String r4 = android.opengl.GLES20.glGetProgramInfoLog(r8)     // Catch:{ IllegalStateException -> 0x005f, IllegalArgumentException -> 0x005d }
            r3.append(r4)     // Catch:{ IllegalStateException -> 0x005f, IllegalArgumentException -> 0x005d }
            java.lang.String r3 = r3.toString()     // Catch:{ IllegalStateException -> 0x005f, IllegalArgumentException -> 0x005d }
            r0.<init>(r3)     // Catch:{ IllegalStateException -> 0x005f, IllegalArgumentException -> 0x005d }
            throw r0     // Catch:{ IllegalStateException -> 0x005f, IllegalArgumentException -> 0x005d }
        L_0x005d:
            r0 = move-exception
            goto L_0x0075
        L_0x005f:
            r0 = move-exception
            goto L_0x0075
        L_0x0061:
            r8 = move-exception
            goto L_0x0064
        L_0x0063:
            r8 = move-exception
        L_0x0064:
            r0 = r8
            r8 = r1
            goto L_0x0075
        L_0x0067:
            r7 = move-exception
            goto L_0x006a
        L_0x0069:
            r7 = move-exception
        L_0x006a:
            r0 = r7
            r7 = r1
            r8 = r7
            goto L_0x0075
        L_0x006e:
            r7 = move-exception
            goto L_0x0071
        L_0x0070:
            r7 = move-exception
        L_0x0071:
            r0 = r7
            r7 = r1
            r8 = r7
            r2 = r8
        L_0x0075:
            if (r2 == r1) goto L_0x007a
            android.opengl.GLES20.glDeleteShader(r2)
        L_0x007a:
            if (r7 == r1) goto L_0x007f
            android.opengl.GLES20.glDeleteShader(r7)
        L_0x007f:
            if (r8 == r1) goto L_0x0084
            android.opengl.GLES20.glDeleteProgram(r8)
        L_0x0084:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.m.g(c0.x, n0.o):void");
    }

    public final void h() {
        EGLDisplay eGLDisplay = this.f13362d;
        EGLConfig eGLConfig = this.f13364f;
        Objects.requireNonNull(eGLConfig);
        EGLConfig eGLConfig2 = eGLConfig;
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        a("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            this.f13365g = eglCreatePbufferSurface;
            return;
        }
        throw new IllegalStateException("surface was null");
    }

    public final void i() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        b("glGenTextures");
        int i10 = iArr[0];
        GLES20.glBindTexture(36197, i10);
        b("glBindTexture " + i10);
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        b("glTexParameter");
        this.f13367i = i10;
    }

    public final String k(x xVar) {
        String str = "";
        d(false);
        try {
            f(xVar);
            h();
            p(this.f13365g);
            String glGetString = GLES20.glGetString(7939);
            if (glGetString != null) {
                str = glGetString;
            }
            return str;
        } catch (IllegalStateException e10) {
            e10.getMessage();
            p0.h("OpenGlRenderer");
            return str;
        } finally {
            q();
        }
    }

    public final void l(x xVar, o oVar) {
        d(false);
        try {
            if (xVar.a() && !k(xVar).contains("GL_EXT_YUV_target")) {
                xVar = x.f4367d;
            }
            f(xVar);
            h();
            p(this.f13365g);
            g(xVar, oVar);
            n();
            i();
            t();
            this.f13361c = Thread.currentThread();
            this.f13359a.set(true);
        } catch (IllegalArgumentException | IllegalStateException e10) {
            q();
            throw e10;
        }
    }

    public final void n() {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f13368j, "aPosition");
        this.f13370l = glGetAttribLocation;
        e(glGetAttribLocation, "aPosition");
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f13368j, "aTextureCoord");
        this.f13371m = glGetAttribLocation2;
        e(glGetAttribLocation2, "aTextureCoord");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f13368j, "uTexMatrix");
        this.f13369k = glGetUniformLocation;
        e(glGetUniformLocation, "uTexMatrix");
    }

    public final void p(EGLSurface eGLSurface) {
        this.f13362d.getClass();
        this.f13363e.getClass();
        if (!EGL14.eglMakeCurrent(this.f13362d, eGLSurface, eGLSurface, this.f13363e)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public final void q() {
        int i10 = this.f13368j;
        if (i10 != -1) {
            GLES20.glDeleteProgram(i10);
            this.f13368j = -1;
        }
        if (!Objects.equals(this.f13362d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.f13362d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (a aVar : this.f13360b.values()) {
                if (!Objects.equals(aVar.a(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.f13362d, aVar.a())) {
                    try {
                        a("eglDestroySurface");
                    } catch (IllegalStateException e10) {
                        e10.toString();
                        p0.c("OpenGlRenderer");
                    }
                }
            }
            this.f13360b.clear();
            if (!Objects.equals(this.f13365g, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f13362d, this.f13365g);
                this.f13365g = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.f13363e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.f13362d, this.f13363e);
                this.f13363e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f13362d);
            this.f13362d = EGL14.EGL_NO_DISPLAY;
        }
        this.f13364f = null;
        this.f13368j = -1;
        this.f13369k = -1;
        this.f13370l = -1;
        this.f13371m = -1;
        this.f13367i = -1;
        this.f13366h = null;
        this.f13361c = null;
    }

    public final void r(Surface surface, boolean z10) {
        a aVar;
        if (this.f13366h == surface) {
            this.f13366h = null;
            p(this.f13365g);
        }
        if (z10) {
            aVar = (a) this.f13360b.remove(surface);
        } else {
            aVar = (a) this.f13360b.put(surface, f13358t);
        }
        if (aVar != null && aVar != f13358t) {
            try {
                EGL14.eglDestroySurface(this.f13362d, aVar.a());
            } catch (RuntimeException e10) {
                e10.getMessage();
                p0.h("OpenGlRenderer");
            }
        }
    }

    public final void s(long j10, float[] fArr, Surface surface) {
        d(true);
        c();
        g0.E("The surface is not registered.", this.f13360b.containsKey(surface));
        a aVar = (a) this.f13360b.get(surface);
        Objects.requireNonNull(aVar);
        if (aVar == f13358t) {
            try {
                EGLDisplay eGLDisplay = this.f13362d;
                EGLConfig eGLConfig = this.f13364f;
                Objects.requireNonNull(eGLConfig);
                EGLSurface j11 = j(eGLDisplay, eGLConfig, surface);
                int[] iArr = new int[1];
                EGL14.eglQuerySurface(this.f13362d, j11, 12375, iArr, 0);
                int i10 = iArr[0];
                int[] iArr2 = new int[1];
                EGL14.eglQuerySurface(this.f13362d, j11, 12374, iArr2, 0);
                Size size = new Size(i10, iArr2[0]);
                aVar = new b(j11, size.getWidth(), size.getHeight());
            } catch (IllegalArgumentException | IllegalStateException e10) {
                e10.getMessage();
                p0.h("OpenGlRenderer");
                aVar = null;
            }
            if (aVar != null) {
                this.f13360b.put(surface, aVar);
            } else {
                return;
            }
        }
        if (surface != this.f13366h) {
            p(aVar.a());
            this.f13366h = surface;
            GLES20.glViewport(0, 0, aVar.c(), aVar.b());
            GLES20.glScissor(0, 0, aVar.c(), aVar.b());
        }
        GLES20.glUniformMatrix4fv(this.f13369k, 1, false, fArr, 0);
        b("glUniformMatrix4fv");
        GLES20.glDrawArrays(5, 0, 4);
        b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.f13362d, aVar.a(), j10);
        if (!EGL14.eglSwapBuffers(this.f13362d, aVar.a())) {
            Integer.toHexString(EGL14.eglGetError());
            p0.g("OpenGlRenderer");
            r(surface, false);
        }
    }

    public final void t() {
        GLES20.glUseProgram(this.f13368j);
        b("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f13367i);
        GLES20.glEnableVertexAttribArray(this.f13370l);
        b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f13370l, 2, 5126, false, 0, f13356r);
        b("glVertexAttribPointer");
        GLES20.glEnableVertexAttribArray(this.f13371m);
        b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f13371m, 2, 5126, false, 0, f13357s);
        b("glVertexAttribPointer");
    }
}
