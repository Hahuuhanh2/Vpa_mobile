package j$.time;

public abstract class d {
    protected d() {
    }

    public static d d() {
        return new c(ZoneId.systemDefault());
    }

    public static d e() {
        return new c(ZoneOffset.UTC);
    }

    public abstract ZoneId a();

    public abstract Instant b();

    public abstract long c();
}
