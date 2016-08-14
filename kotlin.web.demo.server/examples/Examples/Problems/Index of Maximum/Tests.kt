package maxindex

import org.junit.Test
import kotlin.test.*
import java.util.Arrays

class Tests {
    @Test fun testNull() {
        test(null)
    }

    @Test fun testIndexOfMaximum1() {
        test(0, 0)
    }

    @Test fun testIndexOfMaximum2() {
        test(1, -1, 0)
    }

    @Test fun testIndexOfMaximum3() {
        test(0, -1, -2)
    }

    @Test fun testIndexOfMaximum4() {
        test(1, 1, 3, 2, 1)
    }

    @Test fun testIndexOfMaximum5() {
        test(2, 1, 3, 4, 1)
    }

    @Test fun testIndexOfMaximum6() {
        testAnyIndex(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)
    }

    @Test fun testIndexOfMaximum7() {
        testAnyIndex(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE)
    }
}

fun test(expected: Int?, vararg data: Int) {
    assertEquals(expected, indexOfMax(data), "\ndata = ${Arrays.toString(data)}")
}
fun testAnyIndex(vararg data: Int) {
    val result = indexOfMax(data)
    if (result !in 0..data.size)
        assertEquals("any index between 0 and ${data.size}", result, "\ndata = ${Arrays.toString(data)}")
}
