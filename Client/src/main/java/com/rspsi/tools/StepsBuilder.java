package com.rspsi.tools;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.MutablePair;

public class StepsBuilder {

    private final Map<String, Object> steps;

    public StepsBuilder() {
        steps = new LinkedHashMap<>();
    } //move notepad tooo this monitor

    public static StepsBuilder create() {
        return new StepsBuilder();
    }

    public static void buildStairs() {
    }

    public StepsBuilder with(String key, Object value) {
        steps.put(key, value);
        return this;
    }

    public Map<String, Object> build() {
        return steps;
    }

    public static Collector<MutablePair<String, Object>, ?, Map<String, Object>> toMap() {
        return Collectors.toMap(MutablePair::getKey, MutablePair::getValue);
    }

    public static MutablePair<String, Object> of(String key, Object value) {
        return new MutablePair<>(key, value);
    }

}
