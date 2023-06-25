package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest04 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2001");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh!" + "'", str1, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh!");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2002");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2003");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2004");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2005");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2006");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-39), 110, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 110");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2007");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0 };
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray3, (java.lang.Object) (byte) 10, (int) (byte) -1);
        char[] charArray19 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray19);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray19);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray19);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray19);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray19);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray19);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!", charArray19);
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray3, (java.lang.Object) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!", (int) (short) -1);
        int int30 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) objArray3, (-65));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2008");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h" + "'", str1, "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2009");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2010");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2011");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2012");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i" + "'", str1, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2013");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h", "!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h" + "'", str2, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2014");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2015");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2016");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (short) -1, (-10), 25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2017");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2018");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2019");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2020");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2021");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2022");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhihhi!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2023");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-2), (-101), (int) '\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -101");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2024");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj4 = null;
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, obj4, (int) '\n');
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray17 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray17);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray17);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray17, 100);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray17);
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h", charArray17);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2025");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!");
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj7 = null;
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, obj7, (int) '\n');
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray20 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray20);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray20);
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) charArray20, 100);
        java.lang.Object[] objArray26 = new java.lang.Object[] { 0 };
        int int29 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray26, (java.lang.Object) (byte) 10, (int) (byte) -1);
        int int31 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) objArray26, (int) (byte) 100);
        char[] charArray40 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean41 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray40);
        boolean boolean42 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray40);
        boolean boolean43 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray40);
        int int45 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) charArray40, 101);
        boolean boolean46 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray40);
        boolean boolean47 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray40);
        boolean boolean48 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray40);
        boolean boolean49 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray40);
        int int51 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean49, 20);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2026");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2027");
        char[] charArray13 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray13);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi", charArray13);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2028");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2029");
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhi");
        char[] charArray16 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray16);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray16);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray16);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray16);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray16);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray16);
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray16);
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) charArray16, 3);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi", charArray16);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh", charArray16);
        boolean boolean28 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!", charArray16);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2030");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hh", "hhi!", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hh" + "'", str3, "hh");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2031");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhih\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2032");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2033");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) 1.0f, 3);
        int[] intArray10 = new int[] { (byte) -1, (short) 1, (short) 1 };
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray10);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) intArray10, 31);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray10);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) intArray10, (int) (short) 10);
        java.lang.CharSequence charSequence19 = null;
        char[] charArray26 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray26);
        boolean boolean28 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence19, charArray26);
        int int30 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray26, 42);
        boolean boolean31 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray26);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2034");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2035");
        char[] charArray9 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2036");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2037");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2038");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(87, (-52), 113);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 113");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2039");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hh!hhhh!hhh!hhhh!h!hh!hhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2040");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "h", (java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2041");
        char[] charArray9 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2042");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhihhi!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2043");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi", "hhihhi!hh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2044");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2045");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2046");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2047");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("ii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2048");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2049");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2050");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2051");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2052");
        char[] charArray13 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2053");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2054");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(25, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2055");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2056");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2057");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h", (java.lang.CharSequence) "hhi!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2058");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(149, 44, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 44");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2059");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2060");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi", (java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2061");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!", (java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2062");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h", "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2063");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(149, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 20");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2064");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh", (java.lang.CharSequence) "hh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2065");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean17, (-90));
        java.lang.Class<?> wildcardClass20 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2066");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2067");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-13), (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2068");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-9), 0, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2069");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2070");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2071");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(4, (-3), 65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 65");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2072");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hh!hhhh!hhh!hhhh!h!hh!hhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hh!hhhh!hhh!hhhh!h!hh!hhhh" + "'", str1, "hh!hhhh!hhh!hhhh!h!hh!hhhh");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2073");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (short) 10, (-99), (-65));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -65");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2074");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) '4', (int) '\000', 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2075");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(10, 53, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 53");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2076");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2077");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-20), 26, (-35));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 26");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2078");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-35), 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2079");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-22), 9, 58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 58");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2080");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!", (java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2081");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh" + "'", str1, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2082");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhi!!");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray11);
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray11, (-13));
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "ii", charArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "ii");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2083");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2084");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(31, (-2), (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2085");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi" + "'", str2, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2086");
        char[] charArray9 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2087");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2088");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi", "hhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2089");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhi!");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0 };
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray3, (java.lang.Object) (byte) 10, (int) (byte) -1);
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray3, (java.lang.Object) 'a', 10);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray3, (java.lang.Object) "hi!", 5);
        java.lang.String[] strArray15 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray15, (java.lang.Object) 1.0f, 3);
        java.lang.String[] strArray20 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray15, (java.lang.Object) strArray20, 0);
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray20, (java.lang.Object) "!", (-9));
        java.lang.Class<?> wildcardClass26 = strArray20.getClass();
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray3, (java.lang.Object) wildcardClass26, (int) (byte) 100);
        int int30 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int28, (int) (byte) 1);
        java.lang.Class<?> wildcardClass31 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2090");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi" + "'", str1, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2091");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) ' ', (-20), 26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -20");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2092");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhi is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2093");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(27, 90, (-97));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2094");
        char[] charArray9 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2095");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-2), (int) '\000', (-22));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2096");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-32), (-97));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2097");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2098");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2099");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2100");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(45, 101, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 101");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2101");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear((-39));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2102");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(110, (-99), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -99");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2103");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hh!hhhh!hhh!hhhh!h!hh!hhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hh!hhhh!hhh!hhhh!h!hh!hhhhh is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2104");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2105");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhihhi!hhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2106");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2107");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2108");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2109");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!", "hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!" + "'", str2, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2110");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("ii");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi!hhi");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hhihhi!hhi", (int) '4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2111");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2112");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(6, 1, (-999999999));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: -999999999");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2113");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhi!", "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2114");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-13), 22, 87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2115");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2116");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!" + "'", str1, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2117");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih", "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hhh" + "'", str3, "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hhh");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2118");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2119");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-20), (int) (short) 0, (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2120");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(9, (-22));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2121");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2122");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2123");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-22), (int) (byte) 1, (-25));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2124");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) -1, 27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 27");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2125");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(48, (int) (byte) 1, (-39));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: -39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2126");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2127");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih" + "'", str1, "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2128");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2129");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray10);
        java.lang.Class<?> wildcardClass16 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2130");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(0, (-99), (-39));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2131");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hh!hhhh!hhh!hhhh!h!hh!hhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2132");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2133");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!", "hh!hhhh!hhh!hhhh!h!hh!hhhhh", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!" + "'", str3, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2134");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2135");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (short) -1, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2136");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 109 + "'", int1 == 109);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2137");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2138");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h", (java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2139");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2140");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(29, (-52));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2141");
        char[] charArray9 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "ii", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2142");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(0, 27, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 27");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2143");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) 'a', (int) '\000', (-35));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2144");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h", (java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2145");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence1, charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hh", charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2146");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) '#', 52, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2147");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2148");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (byte) 100, 39, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2149");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhihhhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2150");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(84, (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -101");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2151");
        char[] charArray9 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i!", charArray9);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2152");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2153");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hh", (java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2154");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh" + "'", str1, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2155");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi!" + "'", str1, "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi!");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2156");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2157");
        comp5111.assignment.cut.Subject.StringTasks stringTasks0 = new comp5111.assignment.cut.Subject.StringTasks();
        java.lang.Class<?> wildcardClass1 = stringTasks0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2158");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hh!hhhh!hhh!hhhh!h!hh!hhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh!hhhh!hhh!hhhh!h!hh!hhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2159");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj2 = null;
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj2, (int) '\n');
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray15 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray15);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray15);
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray15, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2160");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hh!hhhh!hhh!hhhh!h!hh!hhhhh");
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean19, 47);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2161");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h" + "'", str3, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2162");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2163");
        java.lang.Object[] objArray1 = new java.lang.Object[] { 0 };
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray1, (java.lang.Object) (byte) 10, (int) (byte) -1);
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray1, (java.lang.Object) 'a', 10);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray1, (java.lang.Object) "hi!", 5);
        java.lang.Object obj12 = null;
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray1, obj12, 1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2164");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2165");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi", "hhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!" + "'", str2, "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2166");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi", "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2167");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2168");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hhh is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2169");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-97), (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2170");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!", (java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2171");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!", (java.lang.CharSequence) "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2172");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!", (java.lang.CharSequence) "hhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2173");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h" + "'", str1, "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h");
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2174");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(11, 90, 149);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2175");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(5, (-84), 87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -84");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2176");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhi");
        char[] charArray13 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray13, 3);
        java.lang.String[] strArray24 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj25 = null;
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray24, obj25, (int) '\n');
        int int30 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray24, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray38 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean39 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray38);
        boolean boolean40 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray38);
        int int42 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray24, (java.lang.Object) charArray38, 100);
        java.lang.Object[] objArray44 = new java.lang.Object[] { 0 };
        int int47 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray44, (java.lang.Object) (byte) 10, (int) (byte) -1);
        int int49 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray24, (java.lang.Object) objArray44, (int) (byte) 100);
        int int51 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) objArray44, 31);
        int int52 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) objArray44);
        java.lang.Class<?> wildcardClass53 = objArray44.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[0]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2177");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2178");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhh" + "'", str1, "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhh");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2179");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih" + "'", str1, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2180");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) 53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2181");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-25), (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2182");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh" + "'", str1, "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2183");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-19), (-13), (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2184");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh" + "'", str1, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2185");
        char[] charArray9 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2186");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray10);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2187");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2188");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2189");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhi" + "'", str1, "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhi");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2190");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2191");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(0, (-3), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2192");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2193");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2194");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi!");
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray12, 0);
        java.lang.Class<?> wildcardClass22 = charArray12.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2195");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(5, 56, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 56");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2196");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2197");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2198");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2199");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2200");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (short) 100, 0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2201");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2202");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h", "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h" + "'", str3, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2203");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2204");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2205");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2206");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-32), (-65), (-39));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -65");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2207");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) ' ', 47, 109);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 47");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2208");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh", "hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!" + "'", str2, "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!");
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2209");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2210");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2211");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh" + "'", str1, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh");
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2212");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2213");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
        java.lang.Object[] objArray4 = null;
        comp5111.assignment.cut.Subject.StringTasks stringTasks5 = new comp5111.assignment.cut.Subject.StringTasks();
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray4, (java.lang.Object) stringTasks5, (int) '\n');
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) stringTasks5, 22);
        char[] charArray20 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray20);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray20);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray20);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray20);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray20);
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray20, 32);
        boolean boolean28 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhi!", charArray20);
        boolean boolean29 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!", charArray20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2214");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2215");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray11);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2216");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2217");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih" + "'", str1, "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2218");
        char[] charArray10 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2219");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) '\r', 110, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 110");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2220");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2221");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2222");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2223");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2224");
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj5 = null;
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, obj5, (int) '\n');
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray18 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray18);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray18);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) charArray18, 100);
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray18);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi", charArray18);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi!", charArray18);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2225");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("", "h", "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2226");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2227");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2228");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("i!");
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj5 = null;
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, obj5, (int) '\n');
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray18 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray18);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray18);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) charArray18, 100);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray18);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean24, (-2));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2229");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2230");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (byte) 0, (int) (byte) 1, 80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: 80");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2231");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2232");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2233");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-87), 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2234");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2235");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2236");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh" + "'", str1, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2237");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray8 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence0, charArray8);
        java.lang.Class<?> wildcardClass11 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2238");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(1, 4, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: 56");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2239");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hi", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hh", "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2240");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(65, 47, 110);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 47");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2241");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2242");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(56, 27, 84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 84");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2243");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2244");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2245");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) 'a', (int) (short) -1, 84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 84");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2246");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi" + "'", str2, "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi");
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2247");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2248");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hh!hhhh!hhh!hhhh!h!hh!hhhh", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hh!hhhh!hhh!hhhh!h!hh!hhhh" + "'", str2, "hh!hhhh!hhh!hhhh!h!hh!hhhh");
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2249");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2250");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2251");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2252");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hhh", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2253");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-10), 32, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2254");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2255");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhihhi!hh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2256");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2257");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2258");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(100, 52, (-42));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2259");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-84), 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2260");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!" + "'", str1, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2261");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2262");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(90, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 29");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2263");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2264");
        char[] charArray13 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray13);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2265");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2266");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2267");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2268");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2269");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2270");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2271");
        char[] charArray9 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hi");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2272");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj4 = null;
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, obj4, (int) '\n');
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray17 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray17);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray17);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray17, 100);
        java.lang.Object[] objArray23 = new java.lang.Object[] { 0 };
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray23, (java.lang.Object) (byte) 10, (int) (byte) -1);
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) objArray23, (int) (byte) 100);
        char[] charArray37 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean38 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray37);
        boolean boolean39 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray37);
        boolean boolean40 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray37);
        int int42 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray37, 101);
        boolean boolean43 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh", charArray37);
        boolean boolean44 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh", charArray37);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2273");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2274");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2275");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhih", "hh!hhhh!hhh!hhhh!h!hh!hhhh", "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhih" + "'", str3, "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhih");
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2276");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray13 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence3, charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi", charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2277");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhi!", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi", "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhi!" + "'", str3, "hhi!");
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2278");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh", "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi!", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh" + "'", str3, "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh");
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2279");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
        java.lang.Object[] objArray3 = null;
        comp5111.assignment.cut.Subject.StringTasks stringTasks4 = new comp5111.assignment.cut.Subject.StringTasks();
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray3, (java.lang.Object) stringTasks4, (int) '\n');
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) stringTasks4, 22);
        char[] charArray19 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray19);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray19);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray19);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray19);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray19);
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray19, 32);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hh", charArray19);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2280");
        char[] charArray1 = new char[] {};
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray1);
        boolean boolean3 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2281");
        java.lang.Object[] objArray0 = null;
        java.lang.Object obj1 = null;
        int int3 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray0, obj1, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2282");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh", (java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2283");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhih", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2284");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(0, 149);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 149");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2285");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hh!hhhh!hhh!hhhh!h!hh!hhhhh", "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hh", "i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hh!hhhh!hhh!hhhh!h!hh!hhhhh" + "'", str3, "hh!hhhh!hhh!hhhh!h!hh!hhhhh");
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2286");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("h");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) false, 101);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("h");
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray6, (-10));
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray6);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2287");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2288");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2289");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2290");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2291");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(3, (int) 'a', 29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2292");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear((-97));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2293");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2294");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2295");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2296");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih", (java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2297");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("");
        java.lang.Object obj2 = null;
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj2, 65);
        java.lang.Class<?> wildcardClass5 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2298");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 1.0f, 3);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray6, 0);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) "!", (-9));
        java.lang.Object obj12 = null;
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, obj12, 39);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!", 11);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2299");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi" + "'", str1, "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi");
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2300");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(101, 110);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 110");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2301");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2302");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-13), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2303");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(87, 53, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 53");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2304");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2305");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2306");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhi");
        char[] charArray14 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray14);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray14);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray14);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray14);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray14, 3);
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray14);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!", charArray14);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2307");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2308");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2309");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2310");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h", (java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2311");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2312");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2313");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhi!hhi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2314");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(11, (-9), 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2315");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2316");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhih");
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h", charArray12);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean20, 48);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2317");
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi", charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2318");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2319");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2320");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "h", (java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2321");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh", (java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2322");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) ' ', 999999999, (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -101");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2323");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!!", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi" + "'", str3, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi");
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2324");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!", "i!", "hh!hhhh!hhh!hhhh!h!hh!hhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhhh" + "'", str3, "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhhh");
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2325");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2326");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!" + "'", str1, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2327");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2328");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2329");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) '\n', 13, (-35));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2330");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!" + "'", str1, "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!");
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2331");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(19, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2332");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
        java.lang.Object[] objArray2 = null;
        comp5111.assignment.cut.Subject.StringTasks stringTasks3 = new comp5111.assignment.cut.Subject.StringTasks();
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray2, (java.lang.Object) stringTasks3, (int) '\n');
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) stringTasks3, 22);
        char[] charArray19 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray19);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray19);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray19);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray19);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray19);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray19);
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean25, 31);
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        java.lang.Class<?> wildcardClass29 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2333");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("ii", "hh!hhhh!hhh!hhhh!h!hh!hhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ii" + "'", str2, "ii");
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2334");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(999999999, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2335");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi", (java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2336");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh" + "'", str1, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2337");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2338");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2339");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2340");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2341");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2342");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(87, (int) (short) -1, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2343");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh" + "'", str1, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh");
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2344");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2345");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi" + "'", str1, "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi");
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2346");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-62), 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2347");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!", "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhih", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!" + "'", str3, "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!");
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2348");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2349");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-42), 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 20");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2350");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih", (java.lang.CharSequence) "hhihhi!hhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2351");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2352");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hi!", (int) (short) 1);
        char[] charArray14 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray14);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray14);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray14);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hi!", (int) (byte) 10);
        java.lang.Object obj22 = null;
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj22, 62);
        char[] charArray34 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean35 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray34);
        boolean boolean36 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray34);
        boolean boolean37 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray34);
        boolean boolean38 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray34);
        boolean boolean39 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray34);
        int int41 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray34, (-1));
        char[] charArray50 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean51 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray50);
        boolean boolean52 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray50);
        int int54 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean52, (int) '\000');
        int int57 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 13, (-32));
        // The following exception was thrown during execution in test generation
        try {
            int int58 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2353");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hh", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2354");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2355");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh" + "'", str1, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh");
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2356");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih", (java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2357");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2358");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2359");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "ii", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hh", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2360");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2361");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2362");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h", (java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2363");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2364");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2365");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2366");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(999999999, (-32), (-25));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2367");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hi!", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2368");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46 + "'", int1 == 46);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2369");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2370");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-100), (int) (byte) 10, 83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 83");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2371");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2372");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2373");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-42), 30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 30");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2374");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2375");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2376");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-90), (-19), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -19");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2377");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2378");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-101), 0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2379");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2380");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2381");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2382");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2383");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hh!hhhh!hhh!hhhh!h!hh!hhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hh!hhhh!hhh!hhhh!h!hh!hhh" + "'", str1, "hh!hhhh!hhh!hhhh!h!hh!hhh");
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2384");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(25, 27, (-62));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -62");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2385");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhh" + "'", str1, "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhh");
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2386");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(2, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2387");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals(charSequence0, (java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2388");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2389");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!" + "'", str1, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2390");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2391");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hi", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2392");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (byte) 0, (-39), (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2393");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2394");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(65, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2395");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hi!", (int) (short) 1);
        char[] charArray14 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray14);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray14);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray14);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hi!", (int) (byte) 10);
        java.lang.Object obj22 = null;
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj22, 62);
        java.lang.String[] strArray26 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int29 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray26, (java.lang.Object) 1.0f, 3);
        int[] intArray33 = new int[] { (byte) -1, (short) 1, (short) 1 };
        boolean boolean34 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray33);
        boolean boolean35 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray33);
        int int37 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray26, (java.lang.Object) intArray33, 31);
        int int40 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray26, (java.lang.Object) 90, 1);
        java.lang.String[] strArray42 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        int int44 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray26, (java.lang.Object) strArray42, 101);
        int int47 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray42, (java.lang.Object) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!!", 17);
        int int49 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int47, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2396");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(80, (-999999999), (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2397");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhi", (java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2398");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2399");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hh!hhhh!hhh!hhhh!h!hh!hhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh!hhhh!hhh!hhhh!h!hh!hhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2400");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(97, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2401");
        char[] charArray9 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2402");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!", "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2403");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2404");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(0, (-101), 45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2405");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-65), 97, (-13));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2406");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2407");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(29, (int) (byte) 0, 53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 53");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2408");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi" + "'", str2, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2409");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-10), 13, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2410");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 47 + "'", int1 == 47);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2411");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2412");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2413");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(101, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2414");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "", (java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2415");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2416");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 54 + "'", int1 == 54);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2417");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-19), 3, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2418");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(0, 0, (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2419");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(45, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2420");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2421");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh", "!", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihh" + "'", str3, "hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihh");
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2422");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2423");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        java.lang.Class<?> wildcardClass16 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2424");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2425");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(4, 30, (-45));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 30");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2426");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hh", (java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2427");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2428");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh" + "'", str1, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh");
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2429");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2430");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("", "hh", "hhihhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2431");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhi!hhi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2432");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2433");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!!", (java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2434");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi!", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2435");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhihh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2436");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(109);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2437");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh", (java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2438");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhih\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2439");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi" + "'", str1, "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi");
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2440");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh" + "'", str1, "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh");
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2441");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-32), 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2442");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray13 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence3, charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!", charArray13);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hh", charArray13);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh!hhhh!hhh!hhhh!h!hh!hhhh", charArray13);
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2443");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) '\n', 0, (-25));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2444");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hh", "hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hh" + "'", str3, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hh");
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2445");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhihhi is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2446");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (short) 0, 42, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2447");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi");
        char[] charArray8 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray8);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray8, (int) (short) 1);
        char[] charArray23 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray23);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray23);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray23);
        boolean boolean27 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray23);
        boolean boolean28 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray23);
        boolean boolean29 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray23);
        int int31 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean29, (-84));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2448");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hi", (java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2449");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h", "!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h" + "'", str2, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h");
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2450");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2451");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (byte) 10, (int) 'a', (int) '\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2452");
        char[] charArray9 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2453");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh", "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh" + "'", str3, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2454");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("h");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "h", 100);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj9 = null;
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray8, obj9, (int) '\n');
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray8, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray22 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray22);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray22);
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray8, (java.lang.Object) charArray22, 100);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray22);
        int int29 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "", (-9));
        int int30 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        comp5111.assignment.cut.Subject.CharTasks charTasks31 = new comp5111.assignment.cut.Subject.CharTasks();
        int int33 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charTasks31, (int) '4');
        java.lang.String[] strArray35 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int38 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray35, (java.lang.Object) 'a', 0);
        java.lang.String[] strArray40 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj41 = null;
        int int43 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray40, obj41, (int) '\n');
        int int46 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray40, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray54 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean55 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray54);
        boolean boolean56 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray54);
        int int58 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray40, (java.lang.Object) charArray54, 100);
        java.lang.Object[] objArray60 = new java.lang.Object[] { 0 };
        int int63 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray60, (java.lang.Object) (byte) 10, (int) (byte) -1);
        int int65 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray40, (java.lang.Object) objArray60, (int) (byte) 100);
        char[] charArray74 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean75 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray74);
        boolean boolean76 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray74);
        boolean boolean77 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray74);
        int int79 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray40, (java.lang.Object) charArray74, 101);
        int int81 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray35, (java.lang.Object) strArray40, (int) (byte) 100);
        java.lang.String[] strArray83 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!");
        java.lang.String[] strArray85 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
        java.lang.Object[] objArray86 = null;
        comp5111.assignment.cut.Subject.StringTasks stringTasks87 = new comp5111.assignment.cut.Subject.StringTasks();
        int int89 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray86, (java.lang.Object) stringTasks87, (int) '\n');
        int int91 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray85, (java.lang.Object) stringTasks87, 22);
        int int93 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray83, (java.lang.Object) stringTasks87, 65);
        int int95 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray40, (java.lang.Object) 65, 90);
        int int97 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int95, 39);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[0]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray74), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray74), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray74), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2455");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (byte) 10, 83, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 56");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2456");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2457");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2458");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hi!", (int) (short) 1);
        char[] charArray14 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray14);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray14);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray14);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hi!", (int) (byte) 10);
        java.lang.Object obj22 = null;
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj22, 62);
        char[] charArray34 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean35 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray34);
        boolean boolean36 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray34);
        boolean boolean37 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray34);
        boolean boolean38 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray34);
        boolean boolean39 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray34);
        int int40 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray34);
        int int42 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int40, 52);
        java.lang.String[] strArray43 = comp5111.assignment.cut.Subject.ArrayTasks.EMPTY_STRING_ARRAY;
        java.lang.Class<?> wildcardClass44 = strArray43.getClass();
        int int46 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) wildcardClass44, (-97));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2459");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) 1, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2460");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2461");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-39), (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2462");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2463");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2464");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(56, (int) '\r', 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2465");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2466");
        char[] charArray9 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2467");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2468");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hh!hhhh!hhh!hhhh!h!hh!hhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh!hhhh!hhh!hhhh!h!hh!hhhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2469");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(20);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2470");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2471");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-2), (-2), (-22));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2472");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2473");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhi");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2474");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(6, 45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2475");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(62, 999999999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 999999999");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2476");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi" + "'", str1, "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi");
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2477");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "!", (java.lang.CharSequence) "hhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2478");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(29, 90, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2479");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi", "!", "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi" + "'", str3, "hhihhi");
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2480");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2481");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2482");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-22), (-10), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2483");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2484");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2485");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi");
        comp5111.assignment.cut.Subject.FilenameTasks filenameTasks2 = new comp5111.assignment.cut.Subject.FilenameTasks();
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) filenameTasks2, 2);
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.ArrayTasks.EMPTY_STRING_ARRAY;
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray5, (int) (short) -1);
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray5);
        char[] charArray19 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray19);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray19);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray19);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray19);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray19);
        boolean boolean25 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray19);
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) boolean25, (-62));
        // The following exception was thrown during execution in test generation
        try {
            int int28 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2486");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh" + "'", str1, "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh");
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2487");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2488");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) 1.0f, 3);
        int[] intArray12 = new int[] { (byte) -1, (short) 1, (short) 1 };
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray12);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) intArray12, 31);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray12);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) intArray12, (int) (short) 10);
        java.lang.CharSequence charSequence21 = null;
        char[] charArray28 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean29 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray28);
        boolean boolean30 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence21, charArray28);
        int int32 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray28, 42);
        boolean boolean33 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray28);
        boolean boolean34 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h", charArray28);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2489");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2490");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi" + "'", str2, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2491");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2492");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(46, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2493");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2494");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2495");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2496");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2497");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2498");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2499");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi" + "'", str1, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest04.test2500");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }
}

