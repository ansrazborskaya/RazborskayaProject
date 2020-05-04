package com.stormnet.homework.homework5.task2;

public enum Alphabet {
    A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z;

    public int getLetterPosition() {
        int index = this.ordinal() + 1;
        return index;
    }
}
