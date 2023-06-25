package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest07 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3501");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3502");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3503");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(80, (-17));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3504");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) 1, 79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 79");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3505");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (byte) 100, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3506");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray9 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray9);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence0, charArray9);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3507");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3508");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3509");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3510");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) '\000', 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 48");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3511");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-84), 90, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3512");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!", "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3513");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3514");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3515");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h", "hhihhi!hh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h" + "'", str3, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h");
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3516");
        comp5111.assignment.cut.Subject.FilenameTasks filenameTasks0 = new comp5111.assignment.cut.Subject.FilenameTasks();
        java.lang.Class<?> wildcardClass1 = filenameTasks0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3517");
        char[] charArray9 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!!", charArray9);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3518");
        java.lang.Object[] objArray1 = new java.lang.Object[] { 0 };
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray1, (java.lang.Object) (byte) 10, (int) (byte) -1);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray1, (java.lang.Object) strArray6, 10);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3519");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3520");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3521");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(57);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3522");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi!");
        char[] charArray13 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray13, 0);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!!", charArray13);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3523");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence2, charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!hhhh!hhh!hhhh!h!hh!hhhhh", charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3524");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!h" + "'", str1, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!h");
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3525");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3526");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(51, 100, 426);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 426");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3527");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3528");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3529");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(31, 6, 504);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: 504");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3530");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3531");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3532");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3533");
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
        boolean boolean43 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray37);
        boolean boolean44 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray37);
        boolean boolean45 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh", charArray37);
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
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3534");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3535");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3536");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3537");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh", "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhh", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh" + "'", str3, "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh");
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3538");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3539");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(3, 54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 54");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3540");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(47, (-32));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3541");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi" + "'", str2, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3542");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "h", (java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3543");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi", "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3544");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi!hh!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3545");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3546");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhi!", "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh", "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhi!" + "'", str3, "hhihhi!hhi!");
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3547");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhh", "hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3548");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh", "i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh" + "'", str2, "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh");
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3549");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3550");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3551");
        java.lang.Object[] objArray1 = new java.lang.Object[] { 0 };
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray1, (java.lang.Object) (byte) 10, (int) (byte) -1);
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray1, (java.lang.Object) 'a', (int) '\r');
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3552");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3553");
        comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) '\r', 6, (int) '\r');
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3554");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3555");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhih" + "'", str1, "hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhih");
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3556");
        char[] charArray8 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi!", charArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3557");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj3 = null;
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, obj3, (int) '\n');
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray16 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray16);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray16);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray16, 100);
        java.lang.Object[] objArray22 = new java.lang.Object[] { 0 };
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray22, (java.lang.Object) (byte) 10, (int) (byte) -1);
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) objArray22, (int) (byte) 100);
        char[] charArray36 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean37 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray36);
        boolean boolean38 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray36);
        boolean boolean39 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray36);
        int int41 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray36, 101);
        boolean boolean42 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray36);
        boolean boolean43 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray36);
        boolean boolean44 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh", charArray36);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3558");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3559");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3560");
        char[] charArray9 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        java.lang.Class<?> wildcardClass16 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3561");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhih");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3562");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) '4', 49, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 49");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3563");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(87, (-13));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3564");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3565");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhih\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3566");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhi", (java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3567");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-45), 13, 79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 79");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3568");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 1.0f, 3);
        int[] intArray8 = new int[] { (byte) -1, (short) 1, (short) 1 };
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) intArray8, 31);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 90, 1);
        java.lang.String[] strArray17 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray17, 101);
        java.lang.String[] strArray21 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!", (-90));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3569");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh", (java.lang.CharSequence) "hhi!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3570");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3571");
        char[] charArray13 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!", charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi", charArray13);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi", charArray13);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray13);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3572");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(0, 149, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3573");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi", (java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3574");
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
        java.lang.String[] strArray32 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("i!");
        int int34 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray32, (-99));
        java.lang.String[] strArray36 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int39 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray36, (java.lang.Object) "hi!", (int) (short) 1);
        char[] charArray49 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean50 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray49);
        boolean boolean51 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray49);
        boolean boolean52 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray49);
        boolean boolean53 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray49);
        boolean boolean54 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray49);
        int int56 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray36, (java.lang.Object) "hi!", (int) (byte) 10);
        java.lang.Object obj57 = null;
        int int59 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray36, obj57, 62);
        char[] charArray69 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean70 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray69);
        boolean boolean71 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray69);
        boolean boolean72 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray69);
        boolean boolean73 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray69);
        boolean boolean74 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray69);
        int int76 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray36, (java.lang.Object) charArray69, (-1));
        int int78 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray69, 30);
        // The following exception was thrown during execution in test generation
        try {
            int int79 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) 30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray69), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray69), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray69), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3575");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh" + "'", str3, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3576");
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh!hhhh!hhh!hhhh!h!hh!hhh", charArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3577");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 1.0f, 3);
        int[] intArray8 = new int[] { (byte) -1, (short) 1, (short) 1 };
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) intArray8, 31);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 90, 1);
        java.lang.String[] strArray17 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray17, 101);
        char[] charArray29 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean30 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray29);
        boolean boolean31 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray29);
        boolean boolean32 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray29);
        boolean boolean33 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray29);
        boolean boolean34 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray29);
        boolean boolean35 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!", charArray29);
        int int37 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hhi!!", 29);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3578");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3579");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh" + "'", str1, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3580");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3581");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh", "hhi!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3582");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3583");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi" + "'", str1, "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi");
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3584");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(52, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3585");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3586");
        char[] charArray15 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray15);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray15);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray15);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray15);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray15);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray15);
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray15);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!", charArray15);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi", charArray15);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3587");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3588");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi");
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
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "", (-35));
        java.lang.String[] strArray28 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi");
        comp5111.assignment.cut.Subject.FilenameTasks filenameTasks29 = new comp5111.assignment.cut.Subject.FilenameTasks();
        int int31 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray28, (java.lang.Object) filenameTasks29, 2);
        java.lang.String[] strArray32 = comp5111.assignment.cut.Subject.ArrayTasks.EMPTY_STRING_ARRAY;
        int int34 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray28, (java.lang.Object) strArray32, (int) (short) -1);
        char[] charArray44 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean45 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray44);
        boolean boolean46 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray44);
        boolean boolean47 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray44);
        boolean boolean48 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray44);
        boolean boolean49 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray44);
        int int51 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray32, (java.lang.Object) "hi!", 0);
        int int53 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 0, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3589");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3590");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3591");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3592");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhihhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi" + "'", str1, "hhihhi");
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3593");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh", (java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3594");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 78 + "'", int1 == 78);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3595");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) '\r', 65, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3596");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (byte) 0, 0, 87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 87");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3597");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(48, (int) '\n', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3598");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3599");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3600");
        char[] charArray13 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!!", charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray13);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi", charArray13);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3601");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(100, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3602");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi", "ii", "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi" + "'", str3, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3603");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) '\r', (-13), 83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3604");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(109, (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3605");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h", "hh!hhhh!hhh!hhhh!h!hh!hhhh", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h" + "'", str3, "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h");
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3606");
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
        java.lang.String[] strArray31 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi");
        java.lang.Class<?> wildcardClass32 = strArray31.getClass();
        int int34 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray31, (int) (short) -1);
        char[] charArray43 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean44 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray43);
        boolean boolean45 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray43);
        boolean boolean46 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray43);
        java.lang.Class<?> wildcardClass47 = charArray43.getClass();
        int int49 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) wildcardClass47, (-87));
        java.lang.Object[] objArray51 = new java.lang.Object[] { 0 };
        int int54 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray51, (java.lang.Object) (byte) 10, (int) (byte) -1);
        int int57 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray51, (java.lang.Object) 'a', 10);
        java.lang.String[] strArray59 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int61 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray51, (java.lang.Object) "hi!", 5);
        char[] charArray64 = new char[] {};
        boolean boolean65 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray64);
        boolean boolean66 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray64);
        int int68 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray51, (java.lang.Object) charArray64, (-42));
        int int70 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-42), (-39));
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
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[0]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray64), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray64), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray64), "[]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3607");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh", "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh", "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh" + "'", str3, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh");
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3608");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3609");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3610");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-90), 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3611");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3612");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3613");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3614");
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
        java.lang.Class<?> wildcardClass31 = strArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3615");
        int[] intArray3 = new int[] { (byte) -1, (short) 1, (short) 1 };
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) intArray3);
        java.lang.Class<?> wildcardClass6 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3616");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3617");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(79, 78, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 78");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3618");
        int[] intArray3 = new int[] { (byte) -1, (short) 1, (short) 1 };
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        java.lang.Class<?> wildcardClass10 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3619");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-1), (-11), 57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3620");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3621");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhih\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3622");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3623");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh" + "'", str3, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3624");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(26, 0, 62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3625");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(29, 1, (-52));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3626");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(44, 27, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 27");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3627");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3628");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3629");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihh", "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hh", "hhihhi!hh!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihh" + "'", str3, "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihh");
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3630");
        char[] charArray13 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray13);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray13);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3631");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-10), 109, 46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 109");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3632");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhi!!", "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!!" + "'", str2, "hhi!!");
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3633");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3634");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhihhi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3635");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3636");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh", (java.lang.CharSequence) "hhihhi!hh!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3637");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(82, (-84), (-97));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3638");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3639");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 45 + "'", int1 == 45);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3640");
        char[] charArray9 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        java.lang.Class<?> wildcardClass15 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3641");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3642");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(5, 83, (-52));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3643");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3644");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(193, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3645");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhi!hh!");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hhihhi!hh!", (-97));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3646");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi", charArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3647");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3648");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3649");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3650");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hh" + "'", str1, "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hh");
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3651");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(32, 100, 999999999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 999999999");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3652");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi!", (java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3653");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-2), (-62));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -62");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3654");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi");
        comp5111.assignment.cut.Subject.FilenameTasks filenameTasks4 = new comp5111.assignment.cut.Subject.FilenameTasks();
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) filenameTasks4, 2);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.ArrayTasks.EMPTY_STRING_ARRAY;
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) strArray7, (int) (short) -1);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray11, (java.lang.Object) 1.0f, 3);
        java.lang.String[] strArray16 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray11, (java.lang.Object) strArray16, 0);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, (java.lang.Object) int18, 90);
        java.lang.Object[] objArray22 = new java.lang.Object[] { 0 };
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray22, (java.lang.Object) (byte) 10, (int) (byte) -1);
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray22, (java.lang.Object) 'a', 10);
        java.lang.Class<?> wildcardClass29 = objArray22.getClass();
        int int31 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, (java.lang.Object) wildcardClass29, (int) (byte) 10);
        int int33 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray7, (-97));
        java.lang.Class<?> wildcardClass34 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3655");
        char[] charArray7 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3656");
        char[] charArray8 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi", charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3657");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(50, 48, (-32));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 48");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3658");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3659");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi", charArray10);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "!", charArray10);
        java.lang.Class<?> wildcardClass20 = charArray10.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3660");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3661");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi", "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3662");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3663");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh", (java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3664");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi", "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3665");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(22, 41, (-39));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 41");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3666");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh", (java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3667");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih", "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihh", "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih" + "'", str3, "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih");
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3668");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj3 = null;
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, obj3, (int) '\n');
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray16 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray16);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray16);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray16, 100);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray16);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray16);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!", charArray16);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3669");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi", "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!" + "'", str3, "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!");
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3670");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 108 + "'", int1 == 108);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3671");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(25, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3672");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3673");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3674");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (short) 100, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3675");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "ii", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3676");
        char[] charArray12 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3677");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray8 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence1, charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3678");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhih", "i!", "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhih" + "'", str3, "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhih");
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3679");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh", "hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhih", "hh!hhhh!hhh!hhhh!h!hh!hhhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh" + "'", str3, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh");
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3680");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(51, 42, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3681");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3682");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3683");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi" + "'", str1, "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi");
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3684");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("!", "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3685");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3686");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-2), 11, (-999999999));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -999999999");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3687");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(19, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 29");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3688");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3689");
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3690");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi", "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3691");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3692");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(87, (-17), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3693");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-39), (-65), (-17));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3694");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3695");
        char[] charArray14 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray14);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray14);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray14);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray14);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray14);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray14);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3696");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3697");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3698");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) 1.0f, 3);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) strArray8, 0);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray8, (java.lang.Object) "!", (-9));
        java.lang.Class<?> wildcardClass14 = strArray8.getClass();
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray8, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3699");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3700");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(20, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3701");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
        java.lang.Object obj2 = null;
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj2, 80);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3702");
        char[] charArray7 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3703");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "", (java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3704");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3705");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh", "hi!", "hhihhi!hhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh" + "'", str3, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3706");
        int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-97), 6, (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3707");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3708");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3709");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!h" + "'", str1, "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!h");
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3710");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, 11);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3711");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-62), 109, 504);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 109");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3712");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hi!", (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3713");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3714");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh");
        char[] charArray15 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray15);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray15);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray15);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray15);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray15);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray15);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray15);
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray15, 109);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3715");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3716");
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhh", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3717");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("i!", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3718");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhih");
        char[] charArray13 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!", charArray13);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean19, (-87));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3719");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi");
        comp5111.assignment.cut.Subject.FilenameTasks filenameTasks2 = new comp5111.assignment.cut.Subject.FilenameTasks();
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) filenameTasks2, 2);
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.ArrayTasks.EMPTY_STRING_ARRAY;
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray5, (int) (short) -1);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray9, (java.lang.Object) 1.0f, 3);
        java.lang.String[] strArray14 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray9, (java.lang.Object) strArray14, 0);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) int16, 90);
        java.lang.Object[] objArray20 = new java.lang.Object[] { 0 };
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray20, (java.lang.Object) (byte) 10, (int) (byte) -1);
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray20, (java.lang.Object) 'a', 10);
        java.lang.Class<?> wildcardClass27 = objArray20.getClass();
        int int29 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) wildcardClass27, (int) (byte) 10);
        int int30 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray5);
        java.lang.CharSequence charSequence31 = null;
        char[] charArray39 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean40 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray39);
        boolean boolean41 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray39);
        boolean boolean42 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray39);
        boolean boolean43 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray39);
        boolean boolean44 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray39);
        int int45 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray39);
        boolean boolean46 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence31, charArray39);
        int int48 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) charSequence31, (-42));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5 + "'", int45 == 5);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3720");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhi" + "'", str1, "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhi");
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3721");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi" + "'", str1, "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi");
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3722");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3723");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hh", (java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3724");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi", charArray10);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3725");
        char[] charArray9 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3726");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3727");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi", (java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3728");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3729");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi", (java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3730");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh", "hhihhi!hhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhii!hhihhi!hhi" + "'", str3, "hhihhi!hhii!hhihhi!hhi");
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3731");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi", (java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3732");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3733");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh!", (java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3734");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3735");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3736");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhi is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3737");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hh" + "'", str1, "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hh");
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3738");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence5, charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhi", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi", charArray12);
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hhi", 54);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3739");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3740");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj2 = null;
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj2, (int) '\n');
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray15 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray15);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray15);
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray15, 100);
        java.lang.Object[] objArray21 = new java.lang.Object[] { 0 };
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray21, (java.lang.Object) (byte) 10, (int) (byte) -1);
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) objArray21, (int) (byte) 100);
        java.lang.String[] strArray28 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!");
        java.lang.String[] strArray30 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj31 = null;
        int int33 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray30, obj31, (int) '\n');
        int int36 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray30, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray44 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean45 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray44);
        boolean boolean46 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray44);
        int int48 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray30, (java.lang.Object) charArray44, 100);
        boolean boolean49 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray44);
        int int50 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray44);
        boolean boolean51 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray44);
        int int53 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray28, (java.lang.Object) charArray44, (-62));
        int int55 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray21, (java.lang.Object) int53, (-99));
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
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 5 + "'", int50 == 5);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3741");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhi!", (java.lang.CharSequence) "hh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3742");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (short) 1, 100, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3743");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!h", "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!" + "'", str2, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!");
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3744");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi", "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hh", "hhihhi!hhii!hhihhi!hhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi" + "'", str3, "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi");
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3745");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) '#', (int) (byte) -1, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3746");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi" + "'", str2, "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi");
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3747");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray7 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence0, charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3748");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 65, (-32));
        java.lang.Class<?> wildcardClass5 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3749");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhi!!", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3750");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) '\n', 410, (-87));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -87");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3751");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3752");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hh", charArray10);
        java.lang.Class<?> wildcardClass18 = charArray10.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3753");
        char[] charArray10 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        java.lang.Class<?> wildcardClass17 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3754");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3755");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhh" + "'", str1, "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhh");
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3756");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3757");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3758");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi", "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhih", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi" + "'", str3, "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi");
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3759");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(48, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3760");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!", charArray11);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3761");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3762");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!");
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h", charArray12);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray12, 13);
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
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3763");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3764");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3765");
        int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(410, (int) (byte) 1, (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3766");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!" + "'", str1, "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!");
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3767");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-3), (-2), 62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3768");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi!hhi!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3769");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3770");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3771");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh!hhhh!hhh!hhhh!h!hh!hhhhh", charArray10);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3772");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhii!hhihhi!hhi", (java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3773");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3774");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 502 + "'", int1 == 502);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3775");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (short) -1, (-13), 409);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 409");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3776");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) '\000', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3777");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhihhi!hhii!hhihhi!hhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhii!hhihhi!hhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3778");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3779");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi" + "'", str1, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi");
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3780");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh", "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3781");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hh", (java.lang.CharSequence) "hh!hhhh!hhh!hhhh!h!hh!hhhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3782");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3783");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(50, 47, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3784");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(4, (int) (byte) -1, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 49");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3785");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh!");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3786");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!", charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!", charArray11);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3787");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 43 + "'", int1 == 43);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3788");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3789");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj4 = null;
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, obj4, (int) '\n');
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray17 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray17);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray17);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray17, 100);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh", charArray17);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!", charArray17);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3790");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3791");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 1.0f, 3);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray6, 0);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) "!", (-9));
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) 100.0f, (-90));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3792");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray10);
        java.lang.Class<?> wildcardClass17 = charArray10.getClass();
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray10, (-62));
        java.lang.String[] strArray21 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray21, (java.lang.Object) "hi!", (int) (short) 1);
        char[] charArray34 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean35 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray34);
        boolean boolean36 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray34);
        boolean boolean37 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray34);
        boolean boolean38 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray34);
        boolean boolean39 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray34);
        int int41 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray21, (java.lang.Object) "hi!", (int) (byte) 10);
        java.lang.Object obj42 = null;
        int int44 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray21, obj42, 62);
        char[] charArray54 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean55 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray54);
        boolean boolean56 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray54);
        boolean boolean57 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray54);
        boolean boolean58 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray54);
        boolean boolean59 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray54);
        int int61 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray21, (java.lang.Object) charArray54, (-1));
        char[] charArray70 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean71 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray70);
        boolean boolean72 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray70);
        int int74 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray21, (java.lang.Object) boolean72, (int) '\000');
        int int76 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int74, 52);
        int int79 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (byte) 10, (-13));
        org.junit.Assert.assertNotNull(strArray1);
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
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(strArray21);
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray70), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray70), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray70), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3793");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhi!hh!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3794");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3795");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!", "hh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!" + "'", str2, "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!");
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3796");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray8 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence1, charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray8);
        java.lang.Class<?> wildcardClass15 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3797");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3798");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh" + "'", str1, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3799");
        char[] charArray7 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi", charArray7);
        java.lang.Class<?> wildcardClass10 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3800");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihhi!hhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3801");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3802");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3803");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3804");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h" + "'", str3, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h");
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3805");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhihhi!hh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3806");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhih");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3807");
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
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!", charArray13);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3808");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh", charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3809");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj4 = null;
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, obj4, (int) '\n');
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray17 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray17);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray17);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray17, 100);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray17);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!", charArray17);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih", charArray17);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3810");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3811");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3812");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj3 = null;
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, obj3, (int) '\n');
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray16 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray16);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray16);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray16, 100);
        java.lang.Object[] objArray22 = new java.lang.Object[] { 0 };
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray22, (java.lang.Object) (byte) 10, (int) (byte) -1);
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) objArray22, (int) (byte) 100);
        char[] charArray36 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean37 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray36);
        boolean boolean38 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray36);
        boolean boolean39 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray36);
        int int41 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray36, 101);
        boolean boolean42 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh", charArray36);
        java.lang.Class<?> wildcardClass43 = charArray36.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3813");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3814");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3815");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3816");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3817");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3818");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!h", (java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3819");
        char[] charArray9 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihh", charArray9);
        java.lang.Class<?> wildcardClass14 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3820");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3821");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh" + "'", str3, "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh");
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3822");
        char[] charArray8 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3823");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3824");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3825");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3826");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!!");
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj6 = null;
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, obj6, (int) '\n');
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray19 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray19);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray19);
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) charArray19, 100);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray19);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray19);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi", charArray19);
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi", (-35));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3827");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(31, (-35));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3828");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhi!hhii!hhihhi!hhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3829");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray11);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi", charArray11);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3830");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("", "hh!hhhh!hhh!hhhh!h!hh!hhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3831");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3832");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3833");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi", (java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3834");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(58, 7, (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: -11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3835");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(99, 149);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 149");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3836");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3837");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!h" + "'", str1, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!h");
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3838");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(90, 57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 57");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3839");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence0, charArray10);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charSequence0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3840");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3841");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh", "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh" + "'", str3, "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh");
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3842");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray13 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence1, charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhih", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[\n, 4, #,  , 4]");
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
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3843");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihih" + "'", str1, "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihih");
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3844");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(108, 1, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: 42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3845");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3846");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray7 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence0, charArray7);
        java.lang.Class<?> wildcardClass10 = charArray7.getClass();
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3847");
        char[] charArray13 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!!", charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray13);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi", charArray13);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3848");
        char[] charArray8 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhih", charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3849");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3850");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-42), 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3851");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hh", "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hh", "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hh" + "'", str3, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hh");
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3852");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi", "i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh" + "'", str2, "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh");
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3853");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("i!");
        char[] charArray12 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) "hi!", 65);
        char[] charArray26 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray26);
        boolean boolean28 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray26);
        boolean boolean29 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray26);
        boolean boolean30 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray26);
        boolean boolean31 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray26);
        boolean boolean32 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray26);
        boolean boolean33 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray26);
        int int35 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) boolean33, 80);
        java.lang.String[] strArray38 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj39 = null;
        int int41 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray38, obj39, (int) '\n');
        int int44 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray38, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray52 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean53 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray52);
        boolean boolean54 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray52);
        int int56 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray38, (java.lang.Object) charArray52, 100);
        boolean boolean57 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray52);
        boolean boolean58 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray52);
        boolean boolean59 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray52);
        int int61 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray52, 32);
        boolean boolean62 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhh", charArray52);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3854");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hh", (java.lang.CharSequence) "hhihhi!hhii!hhihhi!hhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3855");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3856");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3857");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhi", charArray10);
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
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3858");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hh!", (java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3859");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hh");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
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
        int int48 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) boolean46, (int) (short) 1);
        int int50 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, 13);
        java.lang.Class<?> wildcardClass51 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3860");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3861");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3862");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3863");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3864");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3865");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhh" + "'", str1, "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhh");
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3866");
        int[] intArray0 = new int[] {};
        boolean boolean1 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray0);
        boolean boolean2 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray0);
        java.lang.Class<?> wildcardClass3 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3867");
        char[] charArray9 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3868");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray13 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!", charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence0, charArray13);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3869");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3870");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0 };
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray3, (java.lang.Object) (byte) 10, (int) (byte) -1);
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray3, (java.lang.Object) 'a', 10);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray3, (java.lang.Object) "hi!", 5);
        char[] charArray16 = new char[] {};
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray16);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray16);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray3, (java.lang.Object) charArray16, (-42));
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hh", charArray16);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihh", charArray16);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3871");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3872");
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihh", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray12);
        java.lang.Class<?> wildcardClass21 = charArray12.getClass();
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3873");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3874");
        char[] charArray7 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray7);
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3875");
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj5 = null;
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, obj5, (int) '\n');
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray18 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray18);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray18);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) charArray18, 100);
        java.lang.Object[] objArray24 = new java.lang.Object[] { 0 };
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray24, (java.lang.Object) (byte) 10, (int) (byte) -1);
        int int29 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) objArray24, (int) (byte) 100);
        char[] charArray38 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean39 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray38);
        boolean boolean40 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray38);
        boolean boolean41 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray38);
        int int43 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) charArray38, 101);
        boolean boolean44 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray38);
        boolean boolean45 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray38);
        boolean boolean46 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray38);
        boolean boolean47 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray38);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3876");
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
        java.lang.String[] strArray32 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("i!");
        int int34 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray32, (-99));
        int int37 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 149, 6);
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
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3877");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3878");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3879");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hh is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3880");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3881");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhi", (java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3882");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3883");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3884");
        char[] charArray9 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
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
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3885");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3886");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-3), 51, 25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 51");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3887");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-2), 26, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 26");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3888");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhhh!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3889");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(80);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3890");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3891");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3892");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi!hhii!hhihhi!hhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3893");
        char[] charArray9 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3894");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3895");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3896");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3897");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3898");
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
        boolean boolean29 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh", charArray20);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3899");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence4, charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhi", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean16, 47);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3900");
        int[] intArray6 = new int[] { (-52), '4', 3, (-99), (-3), 87 };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-52, 52, 3, -99, -3, 87]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3901");
        int[] intArray3 = new int[] { '\000', 29, (short) 1 };
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 29, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3902");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3903");
        char[] charArray14 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray14);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray14);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray14);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray14);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!!", charArray14);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi", charArray14);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3904");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(0, 193, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 193");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3905");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh", "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh" + "'", str3, "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh");
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3906");
        java.lang.Object[] objArray1 = new java.lang.Object[] { 0 };
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray1, (java.lang.Object) (byte) 10, (int) (byte) -1);
        int[] intArray8 = new int[] { '\000', 29, (short) 1 };
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray1, (java.lang.Object) intArray8, (-65));
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 29, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3907");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-99), 52, 54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 54");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3908");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhh" + "'", str1, "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhh");
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3909");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals(charSequence0, (java.lang.CharSequence) "hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3910");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3911");
        char[] charArray8 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        java.lang.Object[] objArray15 = new java.lang.Object[] { charArray8, '\r' };
        char[] charArray25 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray25);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray25);
        boolean boolean28 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray25);
        boolean boolean29 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray25);
        boolean boolean30 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray25);
        int int32 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray15, (java.lang.Object) charArray25, 5);
        java.lang.String[] strArray34 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
        char[] charArray44 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean45 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray44);
        boolean boolean46 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray44);
        boolean boolean47 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray44);
        boolean boolean48 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray44);
        int int50 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray34, (java.lang.Object) boolean48, (int) (short) -1);
        int int52 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray15, (java.lang.Object) boolean48, 57);
        int int53 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) objArray15);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[[\n, 4, #,  , 4], \r]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3912");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihh" + "'", str1, "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihh");
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3913");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihih", (java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3914");
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi", charArray12);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3915");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) false, (-1));
        java.lang.Class<?> wildcardClass5 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3916");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi", (java.lang.CharSequence) "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3917");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3918");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh" + "'", str1, "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh");
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3919");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(53, 54, (-17));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 54");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3920");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(109, 83, (-39));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3921");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3922");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3923");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3924");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhih" + "'", str1, "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhih");
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3925");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence2, charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi", charArray12);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhh", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3926");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3927");
        char[] charArray13 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i!", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh", charArray13);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray13);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        java.lang.Class<?> wildcardClass24 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3928");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hh", "hhihhi!hhi", "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihhi!hh" + "'", str3, "hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihhi!hh");
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3929");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3930");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(7, 502, 87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 502");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3931");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3932");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3933");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!");
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj6 = null;
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, obj6, (int) '\n');
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray19 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray19);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray19);
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) charArray19, 100);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray19);
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray19);
        boolean boolean26 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray19);
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray19, (-62));
        boolean boolean29 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi", charArray19);
        boolean boolean30 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh!hhhh!hhh!hhhh!h!hh!hhh", charArray19);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3934");
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
        char[] charArray44 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean45 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray44);
        boolean boolean46 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray44);
        boolean boolean47 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray44);
        boolean boolean48 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray44);
        boolean boolean49 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray44);
        boolean boolean50 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!", charArray44);
        int int52 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray44, (-9));
        java.lang.String[] strArray54 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi");
        comp5111.assignment.cut.Subject.FilenameTasks filenameTasks55 = new comp5111.assignment.cut.Subject.FilenameTasks();
        int int57 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray54, (java.lang.Object) filenameTasks55, 2);
        java.lang.String[] strArray58 = comp5111.assignment.cut.Subject.ArrayTasks.EMPTY_STRING_ARRAY;
        int int60 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray54, (java.lang.Object) strArray58, (int) (short) -1);
        java.lang.String[] strArray62 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int65 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray62, (java.lang.Object) 1.0f, 3);
        java.lang.String[] strArray67 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int69 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray62, (java.lang.Object) strArray67, 0);
        int int71 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray58, (java.lang.Object) int69, 90);
        java.lang.Object[] objArray73 = new java.lang.Object[] { 0 };
        int int76 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray73, (java.lang.Object) (byte) 10, (int) (byte) -1);
        int int79 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray73, (java.lang.Object) 'a', 10);
        java.lang.Class<?> wildcardClass80 = objArray73.getClass();
        int int82 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray58, (java.lang.Object) wildcardClass80, (int) (byte) 10);
        int int84 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray58, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[0]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3935");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) '\n', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3936");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "ii", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3937");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3938");
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhh", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3939");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3940");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3941");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("", "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi", "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3942");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhi!!");
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi!", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray12, 149);
        java.lang.Class<?> wildcardClass23 = charArray12.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3943");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hh!hhhh!hhh!hhhh!h!hh!hh" + "'", str1, "hh!hhhh!hhh!hhhh!h!hh!hh");
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3944");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(65, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3945");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
        java.lang.Object[] objArray2 = null;
        comp5111.assignment.cut.Subject.StringTasks stringTasks3 = new comp5111.assignment.cut.Subject.StringTasks();
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray2, (java.lang.Object) stringTasks3, (int) '\n');
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) stringTasks3, 22);
        java.lang.Object obj8 = null;
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj8, (int) (short) 100);
        java.lang.Object[] objArray11 = null;
        comp5111.assignment.cut.Subject.CharTasks charTasks12 = new comp5111.assignment.cut.Subject.CharTasks();
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray11, (java.lang.Object) charTasks12, (int) ' ');
        java.lang.Class<?> wildcardClass15 = charTasks12.getClass();
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charTasks12, 53);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3946");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhih", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhih" + "'", str3, "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhih");
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3947");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihhi!hhii!hhihhi!hhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhii!hhihhi!hhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3948");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-17), 79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 79");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3949");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3950");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hh" + "'", str1, "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hh");
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3951");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hh!hhhh!hhh!hhhh!h!hh!hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hh!hhhh!hhh!hhhh!h!hh!hh" + "'", str1, "hh!hhhh!hhh!hhhh!h!hh!hh");
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3952");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhi!", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhi!" + "'", str3, "hhihhi!hhi!");
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3953");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhi!!");
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj6 = null;
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, obj6, (int) '\n');
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray19 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray19);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray19);
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) charArray19, 100);
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0 };
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray25, (java.lang.Object) (byte) 10, (int) (byte) -1);
        int int30 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) objArray25, (int) (byte) 100);
        char[] charArray39 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean40 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray39);
        boolean boolean41 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray39);
        boolean boolean42 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray39);
        int int44 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) charArray39, 101);
        boolean boolean45 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray39);
        boolean boolean46 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray39);
        int int48 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray39, 62);
        boolean boolean49 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!", charArray39);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3954");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!" + "'", str1, "hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3955");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean17, (-90));
        char[] charArray29 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean30 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray29);
        boolean boolean31 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray29);
        boolean boolean32 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray29);
        boolean boolean33 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray29);
        boolean boolean34 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray29);
        boolean boolean35 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray29);
        int int37 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean35, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int38 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3956");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi" + "'", str1, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3957");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi" + "'", str3, "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi");
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3958");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(20, 90, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3959");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3960");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hh!hhhh!hhh!hhhh!h!hh!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3961");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray10);
        java.lang.Class<?> wildcardClass18 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3962");
        comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (byte) 1, 3, 11);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3963");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3964");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3965");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3966");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj2 = null;
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj2, (int) '\n');
        char[] charArray14 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray14);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray14);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray14);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hi!", 2);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int20);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3967");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-999999999), 84, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 84");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3968");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi", "i!", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi" + "'", str3, "hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi");
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3969");
        char[] charArray11 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!", charArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3970");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(9, (-97));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3971");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!", "hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh" + "'", str3, "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh");
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3972");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("", "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!", "hh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3973");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(57, (-90), 51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3974");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals(charSequence0, (java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3975");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3976");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!" + "'", str1, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!");
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3977");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3978");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(99, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3979");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3980");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3981");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3982");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(65, 108, (-22));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 108");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3983");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(82, (-11), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3984");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-999999999), 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3985");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3986");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhih\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3987");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 1.0f, 3);
        int[] intArray9 = new int[] { '\n', 13, '4', 0 };
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray9);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) intArray9, 2);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray9);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray9);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray9);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray9);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray9);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 13, 52, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3988");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3989");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence0, charArray11);
        java.lang.Class<?> wildcardClass18 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3990");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("i!");
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
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray12);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray12);
        java.lang.Class<?> wildcardClass23 = intArray12.getClass();
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) wildcardClass23, 22);
        java.lang.Class<?> wildcardClass26 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3991");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3992");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhh" + "'", str1, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhh");
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3993");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!", "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!h", "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!" + "'", str3, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3994");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-45), 49, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 49");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3995");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3996");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhi!");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3997");
        char[] charArray8 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        java.lang.Class<?> wildcardClass11 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3998");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test3999");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-52), 62, 108);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 108");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest07.test4000");
        char[] charArray9 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray9);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi", charArray9);
        java.lang.Class<?> wildcardClass18 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }
}

