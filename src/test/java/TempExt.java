import groovy.lang.Closure;

public class TempExt {

    public Object hmm = new Temp();
    public Closure clos;

    public void hmm(Closure closure) {
        clos = closure;
    }

    public class Temp {
        String t;
    }
}
