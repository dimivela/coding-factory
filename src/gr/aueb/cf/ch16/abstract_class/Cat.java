package gr.aueb.cf.ch16.abstract_class;

public class Cat  extends Animal {

    public Cat() {
        super();
    }

    @Override
    public String toString() {
        return getId() + ", " + getName();
    }


}
