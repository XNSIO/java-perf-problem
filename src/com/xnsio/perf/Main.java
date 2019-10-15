package com.xnsio.perf;

import static java.lang.Runtime.getRuntime;
import static java.lang.System.nanoTime;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Pair> input = buildInput();
        int loopCount = args.length == 1 ? Integer.parseInt(args[0]) : 20000;
        execute(input, loopCount, "--- Primitive - Single Instance ------------", new PrimitiveDataMapper()::execute);
        execute(input, loopCount, "--- Primitive - New Instance ---------------", PrimitiveDataMapper::_execute);
    }

    private static void execute(final List<Pair> input, int loopCount, String name, Function<List<Pair>, Boolean> function)
            throws InterruptedException {
        Runtime runtime = getRuntime();
        System.gc();
        Thread.sleep(2000);
        long startTime = nanoTime();
        long initialMemoryUsed = memUsed(runtime);
        for (int i = 0; i < loopCount; ++i)
            function.apply(input);
        long timeElapsed = nanoTime() - startTime;
        long afterMemoryUsed = memUsed(runtime);
        System.out.print(name + " Mem consumed " + (afterMemoryUsed - initialMemoryUsed) / (1024 * 1024) + " MB");
        System.out.println(" & Exec-time: " + timeElapsed / 1000000 + " milli-secs");
    }

    private static long memUsed(Runtime runtime) {
        return runtime.totalMemory() - runtime.freeMemory();
    }

    static List<Pair> buildInput() {
        List<Pair> input = new ArrayList<>();
        input.add(new Pair("_1", "1"));
        input.add(new Pair("_2", "2"));
        input.add(new Pair("_3", "3"));
        input.add(new Pair("_4", "4"));
        input.add(new Pair("_5", "5"));
        input.add(new Pair("_6", "6"));
        input.add(new Pair("_7", "7"));
        input.add(new Pair("_8", "8"));
        input.add(new Pair("_9", "9"));
        input.add(new Pair("_10", "10"));
        input.add(new Pair("_11", "11"));
        input.add(new Pair("_12", "12"));
        input.add(new Pair("_13", "13"));
        input.add(new Pair("_14", "14"));
        input.add(new Pair("_15", "15"));
        input.add(new Pair("_16", "16"));
        input.add(new Pair("_17", "17"));
        input.add(new Pair("_18", "18"));
        input.add(new Pair("_19", "19"));
        input.add(new Pair("_20", "20"));
        input.add(new Pair("_21", "21"));
        input.add(new Pair("_22", "22"));
        input.add(new Pair("_23", "23"));
        input.add(new Pair("_24", "24"));
        input.add(new Pair("_25", "25"));
        input.add(new Pair("_26", "26"));
        input.add(new Pair("_27", "27"));
        input.add(new Pair("_28", "28"));
        input.add(new Pair("_29", "29"));
        input.add(new Pair("_30", "30"));
        input.add(new Pair("_31", "31"));
        input.add(new Pair("_32", "32"));
        input.add(new Pair("_33", "33"));
        input.add(new Pair("_34", "34"));
        input.add(new Pair("_35", "35"));
        return input;
    }
}
