//package w1l2.linkedlist;
//
//import org.junit.*;
//import static org.junit.Assert.*;
//
//public class TestSLLWithIter {
//
//    /** Test to see that the initial list is empty */
//    @Test
//    public void test1() {
//        SLLWithIterator testInstance = new SLLWithIterator();
//        assertEquals(0, testInstance.size());
//    }
//
//    /**
//     * Test to see that the get method throws an
//     * exception on an empty list
//     */
//    @Test(expected = IndexOutOfBoundsException.class)
//    public void test2() {
//        SLLWithIterator testInstance = new SLLWithIterator();
//        assertNull(testInstance.get(0));
//    }
//
//    /** Test to see that add method inserts an item */
//    @Test
//    public void test3() {
//        SLLWithIterator<String> testInstance = new SLLWithIterator<String>();
//        testInstance.add("tom");
//        assertEquals(1, testInstance.size());
//        assertEquals("[tom]", testInstance.toString());
//    }
//
//    /** Test to see that add method inserts three items */
//    @Test
//    public void test4() {
//        SLLWithIterator<String> testInstance = new SLLWithIterator<String>();
//        testInstance.add("tom");
//        testInstance.add("dick");
//        testInstance.add("harry");
//        assertEquals(3, testInstance.size());
//        assertEquals("[tom ==> dick ==> harry]", testInstance.toString());
//    }
//
//    /** Test the get method on a list of three items */
//    @Test
//    public void test5() {
//        SLLWithIterator<String> testInstance = new SLLWithIterator<String>();
//        testInstance.add("tom");
//        testInstance.add("dick");
//        testInstance.add("harry");
//        assertEquals("tom", testInstance.get(0));
//        assertEquals("dick", testInstance.get(1));
//        assertEquals("harry", testInstance.get(2));
//    }
//
//    /** Test the remove method on an empty list */
//    @Test(expected = IndexOutOfBoundsException.class)
//    public void test6() {
//        SLLWithIterator<String> testInstance = new SLLWithIterator<String>();
//        assertEquals("tom", testInstance.remove(0));
//    }
//
//    /** Test the remove method on a list with only one item */
//    @Test
//    public void test7() {
//        SLLWithIterator<String> testInstance = new SLLWithIterator<String>();
//        testInstance.add("tom");
//        assertEquals("tom", testInstance.remove(0));
//        assertEquals(0, testInstance.size());
//    }
//
//    /** Test the remove method by removing the first item */
//    @Test
//    public void test8() {
//        SLLWithIterator<String> testInstance = new SLLWithIterator<String>();
//        testInstance.add("tom");
//        testInstance.add("dick");
//        testInstance.add("harry");
//        assertEquals("tom", testInstance.remove(0));
//        assertEquals(2, testInstance.size());
//        assertEquals("[dick ==> harry]", testInstance.toString());
//    }
//
//    /** Test the remove method by removing the middle item */
//    @Test
//    public void test9() {
//        SLLWithIterator<String> testInstance = new SLLWithIterator<String>();
//        testInstance.add("tom");
//        testInstance.add("dick");
//        testInstance.add("harry");
//        assertEquals("dick", testInstance.remove(1));
//        assertEquals(2, testInstance.size());
//        assertEquals("[tom ==> harry]", testInstance.toString());
//    }
//
//    /** Test the remove method by removing the last item */
//    @Test
//    public void test10() {
//        SLLWithIterator<String> testInstance = new SLLWithIterator<String>();
//        testInstance.add("tom");
//        testInstance.add("dick");
//        testInstance.add("harry");
//        assertEquals("harry", testInstance.remove(2));
//        assertEquals(2, testInstance.size());
//        assertEquals("[tom ==> dick]", testInstance.toString());
//    }
//
//    /** Test the add method to see if it adds in the middle */
//    @Test
//    public void test11() {
//        SLLWithIterator<String> testInstance = new SLLWithIterator<String>();
//        testInstance.add("tom");
//        testInstance.add("dick");
//        testInstance.add("harry");
//        testInstance.add(1, "sam");
//        assertEquals(4, testInstance.size());
//        assertEquals("[tom ==> sam ==> dick ==> harry]",
//                testInstance.toString());
//    }
//
//    /** Test the add method to see if it adds in the middle */
//    @Test
//    public void test12() {
//        SLLWithIterator<String> testInstance = new SLLWithIterator<String>();
//        testInstance.add("tom");
//        testInstance.add("dick");
//        testInstance.add("harry");
//        testInstance.add(2, "sam");
//        assertEquals(4, testInstance.size());
//        assertEquals("[tom ==> dick ==> sam ==> harry]",
//                testInstance.toString());
//    }
//
//    /** Test the add method to see if it adds at the beginning */
//    @Test
//    public void test13() {
//        SLLWithIterator<String> testInstance = new SLLWithIterator<String>();
//        testInstance.add("tom");
//        testInstance.add("dick");
//        testInstance.add("harry");
//        testInstance.add(0, "sam");
//        assertEquals(4, testInstance.size());
//        assertEquals("[sam ==> tom ==> dick ==> harry]",
//                testInstance.toString());
//    }
//
//    /** Test the add method to see if it adds at the end */
//    @Test
//    public void test14() {
//        SLLWithIterator<String> testInstance = new SLLWithIterator<String>();
//        testInstance.add("tom");
//        testInstance.add("dick");
//        testInstance.add("harry");
//        testInstance.add(3, "sam");
//        assertEquals(4, testInstance.size());
//        assertEquals("[tom ==> dick ==> harry ==> sam]",
//                testInstance.toString());
//    }
//
//    /** Test the iterator on an empty list */
//    @Test
//    public void test15() {
//        SLLWithIterator<String> testInstance = new SLLWithIterator<String>();
//        java.util.Iterator<String> iter = testInstance.iterator();
//        assertFalse(iter.hasNext());
//    }
//
//    /** Test the iterator on an empty list */
//    @Test(expected = java.util.NoSuchElementException.class)
//    public void test16() {
//        SLLWithIterator<String> testInstance = new SLLWithIterator<String>();
//        java.util.Iterator<String> iter = testInstance.iterator();
//        iter.next();
//    }
//
//    /** Test the iterator on a list with one element */
//    @Test
//    public void test17() {
//        SLLWithIterator<String> testInstance = new SLLWithIterator<String>();
//        testInstance.add("tom");
//        java.util.Iterator<String> iter = testInstance.iterator();
//        assertTrue(iter.hasNext());
//        assertEquals("tom", iter.next());
//        assertFalse(iter.hasNext());
//    }
//
//    /** Test the iterator on a list with three elements */
//    @Test
//    public void test18() {
//        SLLWithIterator<String> testInstance = new SLLWithIterator<String>();
//        testInstance.add("tom");
//        testInstance.add("dick");
//        testInstance.add("harry");
//        java.util.Iterator<String> iter = testInstance.iterator();
//        assertTrue(iter.hasNext());
//        assertEquals("tom", iter.next());
//        assertEquals("dick", iter.next());
//        assertEquals("harry", iter.next());
//        assertFalse(iter.hasNext());
//    }
//}
