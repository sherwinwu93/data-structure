package inheritance3.ex03;

import java.util.NoSuchElementException;

public class SLLListVista<Blah> extends SLList<Blah> {
    @Override
    public Blah indexOf(int x) {
        try {
            Blah xth = super.indexOf(x);
            return xth;
        } catch (Exception e) {
            throw new NoSuchElementException();
        }
    }
}
