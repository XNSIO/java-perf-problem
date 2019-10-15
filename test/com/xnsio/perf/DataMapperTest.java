package com.xnsio.perf;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class DataMapperTest {
    private final List<Pair> input = buildInput();

    @Test
    public void testPrimitive() throws Exception {
        PrimitiveDataMapper dataMapper = new PrimitiveDataMapper();
        dataMapper.execute(input);
        assertDataBucket(dataMapper.getData());
    }

    private void assertDataBucket(BucketData data) {
        assertEquals("1", data.get_1());
        assertEquals("2", data.get_2());
        assertEquals("3", data.get_3());
        assertEquals("4", data.get_4());
        assertEquals("13", data.get_13());
        assertEquals("35", data.get_35());
    }

    private List<Pair> buildInput() {
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
