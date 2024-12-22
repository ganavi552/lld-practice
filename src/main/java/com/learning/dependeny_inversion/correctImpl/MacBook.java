package com.learning.dependeny_inversion.correctImpl;

import com.learning.dependeny_inversion.wrongImpl.KeyBoard;
import com.learning.dependeny_inversion.wrongImpl.Mouse;

public class MacBook {
    // this follows dependency inversion
    private final KeyBoard keyBoard;
    private final Mouse mouse;

    public MacBook(Mouse mouse, KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
        this.mouse = mouse;
    }
}
