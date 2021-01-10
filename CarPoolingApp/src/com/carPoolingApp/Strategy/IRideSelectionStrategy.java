package com.carPoolingApp.Strategy;

public interface IRideSelectionStrategy {
    void select(String name, String origin, String destination);
}
