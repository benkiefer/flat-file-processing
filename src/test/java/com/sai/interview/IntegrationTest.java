package com.sai.interview;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.StringWriter;

import static junit.framework.Assert.assertEquals;

public class IntegrationTest {
    private String expected;

    @Before
    public void setUp() {
        StringBuilder builder = new StringBuilder();

        builder.append("PT70100045600000000000000012340201311110000000000000200C     Kiefer             \n");
        builder.append("PT99900045600000000000000012340201311110000000000000005C     Kiefer             \n");
        builder.append("PT70500045600000000000000022220201311110000000000000400A     Gooden             \n");
        builder.append("PT99900045600000000000000022220201311110000000000000011A     Gooden             \n");
        builder.append("PT70600045600000000000000044440201311110000000000000200C     Wilson             \n");
        builder.append("PT99900045600000000000000044440201311110000000000000005C     Wilson             \n");
        builder.append("PT70700045600000000000000055550201311110000000000000400A     James              \n");
        builder.append("PT99900045600000000000000055550201311110000000000000011A     James              \n");
        builder.append("PT40100045600000000000000066660201311110000000000001200C     Adams              \n");
        builder.append("PT99900045600000000000000066660201311110000000000000032C     Adams              \n");
        builder.append("PT50100045600000000000000077770201311110000000000000800C     Lincoln            \n");
        builder.append("PT99900045600000000000000077770201311110000000000000021C     Lincoln            \n");

        expected = builder.toString();
    }

    @Test
    @Ignore
    public void end_to_end() {
        StringWriter writer = new StringWriter();

        new ReportRunner().run(writer);

        assertEquals(expected, writer.toString());
    }
}
