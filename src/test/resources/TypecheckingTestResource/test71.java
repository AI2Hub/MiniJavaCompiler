

/**
 * The following class does not typecheck
 */

class A {
  public static void main(String[] args) {
    B b;
    b = new B();
    System.out.println(b.f(99));
    System.out.println(b.f());
  }
}

class B extends C {
  int b;

  public int b() {
    int c;
    c = this.c();
    b = 12 * c;
    return b;
  }

  public int f(int i, int j, int k) {
    return 13;
  }
}

class C extends D {
  int c;
  public int c() {
    int d;
    d = this.d();
    c = 12;
    return c;
  }
}

class D extends E {
  int d;
  public int d() {
    int e;
    e = this.e();
    d = 12 * e;
    return d;
  }
}

class E extends F {
  int e;
  public int e() {
    int f;
    f = this.f();
    e = 12 * f;
    return e;
  }
}

class F {
  int f;
  public int f() {
    f = 12;
    return f;
  }
}