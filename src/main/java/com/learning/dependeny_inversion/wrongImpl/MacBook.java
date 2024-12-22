package com.learning.dependeny_inversion.wrongImpl;

public class MacBook {
    //this not follows dependency inversion principle
    //why bcs we r using concrete class  not interface.
//    for ex : WiredKeyBoard >> this one is concrete when we want to change to bluetooth we cant do that .

    private final WiredKeyBoard keyBoard;
    private final WiredMouse mouse;

    public MacBook() {
        this.keyBoard = new WiredKeyBoard();
        this.mouse = new WiredMouse();
    }
}
