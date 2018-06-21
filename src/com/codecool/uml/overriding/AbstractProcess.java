package com.codecool.uml.overriding;

abstract class AbstractProcess {

    private void stepBefore() {
        System.out.println("AbstractProcess' stepBefore() called!");
    }

    abstract void action(Orderable item);

    private void stepAfter() {
        System.out.println("AbstractProcess' stepAfter() called!");
    }

    public void process(Orderable item) {
        System.out.println("AbstractProcess' process() called!");
        stepBefore();
        action(item);
        stepAfter();
    }
}
