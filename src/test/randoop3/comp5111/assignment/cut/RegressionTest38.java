package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest38 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4001");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hihi!!hhii!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi!!hhii!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4002");
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray7);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray7);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i", charArray7);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!!hi!!!h", charArray7);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4003");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!" + "'", str1, "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!");
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4004");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(42, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4005");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!iih");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4006");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii", "hii!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4007");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (short) 100, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 29");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4008");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("!!i!!!i!!!!hii!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4009");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear((-97));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4010");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("!!i");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4011");
        char[] charArray9 = new char[] { '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!!hi!!!hi", charArray9);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi!!!", charArray9);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!!hi!!!hi", charArray9);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        java.lang.Class<?> wildcardClass21 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4012");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!i!!!i!!!!hii!!!i", charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!i", charArray6);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4013");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!", charArray5);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4014");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4015");
        char[] charArray8 = new char[] { '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray8);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray8);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!h", charArray8);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "!!i!!!i", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4016");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4017");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) ' ', (int) '#');
        java.lang.CharSequence charSequence8 = null;
        char[] charArray18 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray18);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray18);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray18);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray18);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence8, charArray18);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray18);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii", charArray18);
        boolean boolean27 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        int int29 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray18, (-84));
        boolean boolean30 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!", charArray18);
        java.lang.Class<?> wildcardClass31 = charArray18.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4018");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("!!i!!!i!!!!hii!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4019");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(13, 84, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4020");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(99, (-97));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4021");
        char[] charArray9 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray9);
        java.lang.Class<?> wildcardClass16 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4022");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4023");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray11 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence1, charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4024");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "!!i!!!i!!!!hii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4025");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4026");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-39), 227, (-39));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4027");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4028");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hii", (java.lang.CharSequence) "hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4029");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4030");
        char[] charArray14 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "!", charArray14);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi!!", charArray14);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi", charArray14);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4031");
        char[] charArray9 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4032");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4033");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence0, charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4034");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-20), 859, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 859");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4035");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!iih", "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4036");
        char[] charArray10 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!h", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!h", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4037");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray6);
        java.lang.Class<?> wildcardClass14 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4038");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-11), 84, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4039");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-97), 213, 39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 213");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4040");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hihi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4041");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(32, 25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4042");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!iih");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4043");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("!!i!!!i!!!!hii!!!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: !!i!!!i!!!!hii!!!i! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4044");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4045");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!", "hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!" + "'", str3, "hihii!!hii!");
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4046");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h", "!!i!!!i!!!!hii!!!", "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h" + "'", str3, "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h");
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4047");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!ii");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4048");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence3, charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray5);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4049");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii" + "'", str1, "hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii");
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4050");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray12 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence1, charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!i!!!i!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4051");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!" + "'", str1, "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!");
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4052");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4053");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!h", 222);
        char[] charArray9 = new char[] { '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii!!", charArray9);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray9, 214);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4054");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-90), 13, 213);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 213");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4055");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) ' ', (int) '#');
        int[] intArray10 = new int[] { 2, (byte) 0, (short) 10 };
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray10);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) boolean13, 100);
        char[] charArray17 = new char[] { '4' };
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray17, (int) (short) -1);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i", charArray17);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        boolean boolean25 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii", charArray17);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[2, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4056");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(222, 0, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4057");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii", "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4058");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihi", "hihi!!hhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4059");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(229, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4060");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(31, (-999999999), 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 99");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4061");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-2), (-25));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4062");
        char[] charArray8 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray8);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray8);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4063");
        char[] charArray5 = new char[] { '#', '4', '\r', 'a' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#4\ra");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#4\ra");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, 4, \r, a]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4064");
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii!", charArray7);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!i!!!i", charArray7);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4065");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "!!i!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4066");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-13), 860, (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -20");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4067");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(4, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4068");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) ' ', (int) '#');
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "", (int) (short) 10);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-19), (-20));
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 10.0d, (-20));
        java.lang.String[] strArray16 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.String[] strArray18 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.Object obj19 = null;
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray18, obj19, (int) ' ');
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray16, (java.lang.Object) int21, 13);
        java.lang.String[] strArray25 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("h");
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray16, (java.lang.Object) "h", 62);
        int[] intArray31 = new int[] { 2, (byte) 0, (short) 10 };
        boolean boolean32 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray31);
        boolean boolean33 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray31);
        boolean boolean34 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray31);
        int int36 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray16, (java.lang.Object) intArray31, (int) (byte) -1);
        int int37 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray16);
        int int39 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray16, (-10));
        java.lang.Class<?> wildcardClass40 = strArray16.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[2, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4069");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) ' ', (int) '#');
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "", (int) (short) 10);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-19), (-20));
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 10.0d, (-20));
        java.lang.String[] strArray16 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.String[] strArray18 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.Object obj19 = null;
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray18, obj19, (int) ' ');
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray16, (java.lang.Object) int21, 13);
        java.lang.String[] strArray25 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("h");
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray16, (java.lang.Object) "h", 62);
        int[] intArray31 = new int[] { 2, (byte) 0, (short) 10 };
        boolean boolean32 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray31);
        boolean boolean33 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray31);
        boolean boolean34 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray31);
        int int36 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray16, (java.lang.Object) intArray31, (int) (byte) -1);
        int int37 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray16);
        int int39 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray16, (-10));
        int int40 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[2, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4070");
        comp5111.assignment.cut.Subject.ArrayTasks arrayTasks0 = new comp5111.assignment.cut.Subject.ArrayTasks();
        char[] charArray7 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray7);
        java.lang.Object[] objArray10 = new java.lang.Object[] { arrayTasks0, "hi!", 31 };
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, (java.lang.Object) 20, 9);
        java.lang.String[] strArray15 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        char[] charArray18 = new char[] { '4' };
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray18);
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray15, (java.lang.Object) charArray18, 20);
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, (java.lang.Object) strArray15, 2);
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, (java.lang.Object) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i", 29);
        java.lang.String[] strArray30 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!!");
        int int32 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, (java.lang.Object) strArray30, 709);
        int int35 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray30, (java.lang.Object) 68, 6);
        int int38 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray30, (java.lang.Object) 100.0d, (-90));
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4071");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!", "hihi!!hhii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4072");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!", "!!i!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h" + "'", str2, "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h");
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4073");
        java.lang.Object[] objArray2 = null;
        java.lang.CharSequence charSequence8 = null;
        char[] charArray10 = new char[] { '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence8, charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!", charArray10);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray2, (java.lang.Object) charArray10, 710);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i", charArray10);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4074");
        comp5111.assignment.cut.Subject.GregorianTasks.checkDate(71, 8, 20);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4075");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(0, (-87), (-13));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -87");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4076");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii", "!!i!!!i!!", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii" + "'", str3, "hihii!!hii");
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4077");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4078");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(474, 232, 68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 68");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4079");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihi!!hhii!", "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4080");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("!!i!!!i!!!!hii!!!i!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i", 42);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4081");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray3 = new char[] { '4' };
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence1, charArray3);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray3);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4082");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("!!i!!!i!!!!hii!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i!!!i!!!!hii!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4083");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!");
        char[] charArray5 = new char[] { '4', 'a' };
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray5);
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray5, 231);
        char[] charArray17 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray17);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray17);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean20, (int) '\n');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, a]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4084");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii", "!!i!!!i!!!!h", "hihi!!!hi!!!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii" + "'", str3, "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii");
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4085");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(851, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4086");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(219);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4087");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("!!i!!!i!!!!hii!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!i!!!i!!!!hii!" + "'", str1, "!!i!!!i!!!!hii!");
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4088");
        char[] charArray9 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4089");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4090");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray8 = new char[] { '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence6, charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray8);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray8);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!hh", charArray8);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!i!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4091");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) ' ', (int) '#');
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "", (int) (short) 10);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-19), (-20));
        java.lang.Class<?> wildcardClass12 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4092");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(97, (-11), 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4093");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(701, 0, 233);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4094");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("!!i!!!i!!!!hii!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4095");
        char[] charArray12 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!", charArray12);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4096");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!", "!!i!!!i!!", "!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!" + "'", str3, "hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!");
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4097");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4098");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-22), 42, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4099");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihi!!hhii");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihi!!hhii is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4100");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iihi", "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h" + "'", str3, "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h");
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4101");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("!!i!!!i!!!!hii!!!i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4102");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4103");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii", (java.lang.CharSequence) "hihii!!hii!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4104");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i" + "'", str1, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i");
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4105");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!" + "'", str1, "hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!");
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4106");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4107");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(217, 859, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4108");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("!!i!!!i!!!!hii!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i!!!i!!!!hii!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4109");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4110");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(999999999, 227, 260);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 260");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4111");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4112");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4113");
        char[] charArray13 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!", charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!hh", charArray13);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4114");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hihi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hih" + "'", str1, "hih");
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4115");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!!!");
        int[] intArray5 = new int[] { (-19), 62, (-10) };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) intArray5, (int) (byte) 1);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-19, 62, -10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4116");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!", charArray5);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4117");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) ' ', (int) '#');
        int[] intArray8 = new int[] { 2, (byte) 0, (short) 10 };
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean11, 100);
        char[] charArray15 = new char[] { '4' };
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray15, (int) (short) -1);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray15);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[2, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4118");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(87, (-35), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4119");
        comp5111.assignment.cut.Subject.GregorianTasks.checkDate(4, 11, 4);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4120");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-101), (-87), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -87");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4121");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4122");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iih", "hihii!!hii!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4123");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!");
        int[] intArray6 = new int[] { ' ', '#' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray6);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) boolean10, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = strArray3.getClass();
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) wildcardClass13, (-2));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 35]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4124");
        char[] charArray11 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!", charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4125");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4126");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!" + "'", str1, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!");
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4127");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4128");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4129");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4130");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hii", "hi", "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!i" + "'", str3, "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!i");
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4131");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!" + "'", str1, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!");
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4132");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4133");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray10 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence2, charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4134");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray6);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4135");
        char[] charArray11 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4136");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) -1, 709);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 709");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4137");
        char[] charArray9 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "!!i!!!i!!", charArray9);
        java.lang.Class<?> wildcardClass14 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4138");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("!!i!!!i!!!!hii!!!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i!!!i!!!!hii!!!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4139");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii!", (java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4140");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4141");
        char[] charArray9 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray9);
        java.lang.Class<?> wildcardClass16 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4142");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4143");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4144");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(70, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4145");
        char[] charArray12 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i", charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!h", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4146");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hii!!");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence4, charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence2, charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean13, 5);
        java.lang.Class<?> wildcardClass16 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4147");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4148");
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!i!!!i", charArray7);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!", charArray7);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4149");
        int[] intArray5 = new int[] { 71, (byte) 0, (-17), 19, 224 };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[71, 0, -17, 19, 224]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4150");
        char[] charArray9 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        java.lang.Class<?> wildcardClass16 = charArray9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) wildcardClass16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4151");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "!!i!!!i!!!!hii!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4152");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ii" + "'", str1, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ii");
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4153");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4154");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4155");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4156");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi" + "'", str1, "hi");
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4157");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi");
        java.lang.Object obj2 = null;
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj2, 10);
        java.lang.CharSequence charSequence7 = null;
        char[] charArray17 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray17);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray17);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence7, charArray17);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray17);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray17);
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean25, (-2));
        char[] charArray31 = new char[] { '4' };
        boolean boolean32 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray31);
        boolean boolean33 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray31);
        boolean boolean34 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray31);
        boolean boolean35 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray31);
        int int37 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray31, 22);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[4]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4158");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4159");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!");
        char[] charArray12 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray12, 71);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!", charArray12);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4160");
        char[] charArray9 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4161");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!!", "hihii!!hi", "hihii!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!i!!" + "'", str3, "hihii!i!!");
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4162");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihii!i!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4163");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(231);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4164");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "!!i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4165");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!" + "'", str1, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!");
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4166");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4167");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4168");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(217, 45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4169");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(12, 217);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 217");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4170");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4171");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(222, 852, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 99");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4172");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4173");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hih", "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!" + "'", str3, "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!");
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4174");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(65, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4175");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("!!i!!!i!!!!hii!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4176");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!");
        char[] charArray13 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i", charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean21, 708);
        java.lang.String[] strArray25 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.String[] strArray27 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.Object obj28 = null;
        int int30 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray27, obj28, (int) ' ');
        int int32 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray25, (java.lang.Object) int30, 13);
        java.lang.String[] strArray34 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("h");
        int int36 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray25, (java.lang.Object) "h", 62);
        int[] intArray40 = new int[] { 2, (byte) 0, (short) 10 };
        boolean boolean41 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray40);
        boolean boolean42 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray40);
        boolean boolean43 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray40);
        int int45 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray25, (java.lang.Object) intArray40, (int) (byte) -1);
        int int46 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) intArray40);
        boolean boolean47 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray40);
        int int49 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) intArray40, 219);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[2, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4177");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-39), 17, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4178");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "!!i!!!i!!!!hii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4179");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("!!i!!!i!!!!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character ! is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4180");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray12 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence2, charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!hh", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4181");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!!!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hi", (-32));
        // The following exception was thrown during execution in test generation
        try {
            int int5 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) (-32));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4182");
        char[] charArray10 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4183");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4184");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!", "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!" + "'", str3, "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!");
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4185");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("!", "hihi!!!hi!!!hi!!", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!" + "'", str3, "!");
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4186");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("!!", "hihi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!" + "'", str2, "!!");
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4187");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) ' ', (int) '#');
        int[] intArray8 = new int[] { 2, (byte) 0, (short) 10 };
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray8);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean11, 100);
        char[] charArray15 = new char[] { '4' };
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray15, (int) (short) -1);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[2, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4188");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hih", (java.lang.CharSequence) "hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4189");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) ' ', (int) '#');
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) "", (int) (short) 10);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) (-19), (-20));
        char[] charArray20 = new char[] { '4' };
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray20);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray20);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray20);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray20);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray20);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray20);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray20);
        int int29 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray20, 710);
        boolean boolean30 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray20);
        boolean boolean31 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!", charArray20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4190");
        char[] charArray9 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray9);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4191");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("!!i!!!i!!!!hii!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i!!!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4192");
        char[] charArray10 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!i!!!i", charArray10);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4193");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hii");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4194");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4195");
        char[] charArray10 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hi", charArray10);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4196");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4197");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(11, 227, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 227");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4198");
        char[] charArray4 = new char[] { '4' };
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray4);
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray4);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        java.lang.Class<?> wildcardClass12 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4199");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray16 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray16);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray16);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray16);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi!!!", charArray16);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!", charArray16);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h", charArray16);
        boolean boolean27 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray16);
        boolean boolean28 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!", charArray16);
        boolean boolean29 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence0, charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4200");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("!!i!!!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) strArray5, (-84));
        int[] intArray9 = new int[] { (-39) };
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray9);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) boolean10, (int) ' ');
        java.lang.String[] strArray14 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi");
        java.lang.Object obj15 = null;
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray14, obj15, 10);
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) 10, 97);
        comp5111.assignment.cut.Subject.StringTasks stringTasks20 = new comp5111.assignment.cut.Subject.StringTasks();
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) stringTasks20, (-100));
        comp5111.assignment.cut.Subject.ArrayTasks arrayTasks23 = new comp5111.assignment.cut.Subject.ArrayTasks();
        char[] charArray30 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean31 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray30);
        java.lang.Object[] objArray33 = new java.lang.Object[] { arrayTasks23, "hi!", 31 };
        int int36 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray33, (java.lang.Object) 20, 9);
        java.lang.String[] strArray38 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        int int40 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray33, (java.lang.Object) strArray38, 10);
        char[] charArray49 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean50 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray49);
        boolean boolean51 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray49);
        boolean boolean52 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray49);
        boolean boolean53 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray49);
        int int55 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray33, (java.lang.Object) charArray49, 31);
        int int57 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) objArray33, 9);
        int int59 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray5, 708);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-39]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4201");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (short) 100, 31, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 31");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4202");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4203");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4204");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4205");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4206");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(232, 84, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4207");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4208");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4209");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hi", charArray5);
        java.lang.Class<?> wildcardClass12 = charArray5.getClass();
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4210");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4211");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-62), 474);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 474");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4212");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(15, 231, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4213");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!" + "'", str1, "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!");
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4214");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hii!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("!!i!!!");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, 17);
        java.lang.Object obj6 = null;
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj6, (-2));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4215");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("", "hihi!!hh", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iihi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4216");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!i" + "'", str1, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!i");
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4217");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!", 15);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4218");
        int[] intArray0 = new int[] {};
        boolean boolean1 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray0);
        boolean boolean2 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray0);
        boolean boolean3 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray0);
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray0);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray0);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray0);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray0);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray0);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4219");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("!!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!i" + "'", str1, "!!i");
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4220");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray8 = new char[] { '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence6, charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "!!i!!!i!", charArray8);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ii", charArray8);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ii", 39);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4221");
        char[] charArray10 = new char[] { '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!!hi!!!hi", charArray10);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi!!!", charArray10);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!!hi!!!hi", charArray10);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4222");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hihii!i!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4223");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!ii");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!ii\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4224");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-32), 62, 217);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 217");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4225");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4226");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("!!i!!!i!!!!hii!!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character ! is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4227");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ii", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4228");
        char[] charArray12 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "!", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi!!", charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4229");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4230");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii" + "'", str1, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii");
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4231");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hihi!!hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihi!!h" + "'", str1, "hihi!!h");
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4232");
        comp5111.assignment.cut.Subject.GregorianTasks.checkDate(11, 12, 25);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4233");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!h" + "'", str1, "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!h");
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4234");
        char[] charArray10 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4235");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4236");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "!!i!!!i!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4237");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("!!i!!!i!!!!hii!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i!!!i!!!!hii!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4238");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii", "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4239");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!!", "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!", "hihii!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!!" + "'", str3, "hihii!!hii!!");
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4240");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!", "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4241");
        int[] intArray6 = new int[] { 30, 7, (-11), (short) -1, 'a', (short) -1 };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray6);
        java.lang.Class<?> wildcardClass10 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[30, 7, -11, -1, 97, -1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4242");
        char[] charArray11 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihi", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4243");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(227);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4244");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4245");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(214, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4246");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(999999999, 0, (-39));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4247");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, (-13));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4248");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihi!!!hi!!!hi", "hihii!!hii", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihi!!!hi!!!hi" + "'", str3, "hihi!!!hi!!!hi");
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4249");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hihii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4250");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!", "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4251");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("!!i!!!i!!!!hii!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4252");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!", (java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4253");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii", (java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4254");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihi!!hhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4255");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!", "hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!" + "'", str2, "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!");
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4256");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hi!!", (java.lang.CharSequence) "!!i!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4257");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i", charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4258");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!i!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4259");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("!!i!!!i!!!!h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4260");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence4, charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence1, charArray6);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray6);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4261");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hii!", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4262");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4263");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi");
        int[] intArray6 = new int[] { (-35), 0, 'a', ' ' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray6);
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean7, 31);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 39, 97);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-35, 0, 97, 32]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4264");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("!!i!!!i!!!!hii!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!i!!!i!!!!hii!" + "'", str1, "!!i!!!i!!!!hii!");
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4265");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("!!i!!!", "hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4266");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("!!i!!!i!", "!", "!!i!!!i!!!!hii!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!" + "'", str3, "!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!");
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4267");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4268");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4269");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(99, (-99), 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -99");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4270");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h", (java.lang.CharSequence) "hi!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4271");
        char[] charArray11 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!", charArray11);
        java.lang.Class<?> wildcardClass19 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4272");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4273");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4274");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4275");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("!!i!!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4276");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-9), 708, (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -101");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4277");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, (int) (byte) 1);
        int[] intArray6 = new int[] {};
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray6);
        java.lang.Class<?> wildcardClass8 = intArray6.getClass();
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) wildcardClass8, 35);
        java.lang.CharSequence charSequence11 = null;
        char[] charArray19 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray19);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray19);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence11, charArray19);
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) boolean22, (-42));
        java.lang.Class<?> wildcardClass25 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4278");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(860, (int) (byte) 1, 860);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 860");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4279");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.Object obj2 = null;
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj2, (int) ' ');
        char[] charArray14 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray14);
        java.lang.Class<?> wildcardClass20 = charArray14.getClass();
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray14, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4280");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4281");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(260, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4282");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4283");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!" + "'", str1, "hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!");
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4284");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(232, 5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4285");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4286");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(851);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4287");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!", "!!i!!!i", "hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!" + "'", str3, "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!");
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4288");
        char[] charArray8 = new char[] { '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!i!!!i", charArray8);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i", charArray8);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!hhii!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4289");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!", "hihi!!!hi!!!h", "hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!" + "'", str3, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!");
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4290");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!", "hihi!!hh", "hihi!!!hi!!!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!" + "'", str3, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!");
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4291");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!ii");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 712 + "'", int1 == 712);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4292");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!");
        java.lang.Object obj2 = null;
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj2, 0);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.Object obj7 = null;
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, obj7, (int) ' ');
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("");
        comp5111.assignment.cut.Subject.FilenameTasks filenameTasks12 = new comp5111.assignment.cut.Subject.FilenameTasks();
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray11, (java.lang.Object) filenameTasks12, (int) (short) 1);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) int14, (-84));
        java.lang.String[] strArray18 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) "hi", (-10));
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int20, 0);
        int[] intArray26 = new int[] { (-19), 62, (-10) };
        boolean boolean27 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray26);
        int int29 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean27, (-25));
        char[] charArray39 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean40 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray39);
        boolean boolean41 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray39);
        boolean boolean42 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray39);
        boolean boolean43 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray39);
        boolean boolean44 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray39);
        boolean boolean45 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray39);
        int int46 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray39);
        boolean boolean47 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!", charArray39);
        int int49 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean47, (-35));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-19, 62, -10]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4293");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!", "!!i!!!i!!!!hii!!!i", "hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!" + "'", str3, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!");
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4294");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 699 + "'", int1 == 699);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4295");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihi!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4296");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii" + "'", str1, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii");
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4297");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-97), 708, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 708");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4298");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4299");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4300");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!iih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4301");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4302");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4303");
        char[] charArray2 = new char[] { '4' };
        boolean boolean3 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!i!!!i", charArray2);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4304");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi", "hii", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi" + "'", str3, "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi");
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4305");
        char[] charArray10 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!h", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!", charArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4306");
        comp5111.assignment.cut.Subject.ArrayTasks arrayTasks0 = new comp5111.assignment.cut.Subject.ArrayTasks();
        char[] charArray7 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray7);
        java.lang.Object[] objArray10 = new java.lang.Object[] { arrayTasks0, "hi!", 31 };
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, (java.lang.Object) 20, 9);
        java.lang.String[] strArray15 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        java.lang.String[] strArray17 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi");
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray15, (java.lang.Object) strArray17, (int) (byte) 1);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, (java.lang.Object) (byte) 1, (int) ' ');
        java.lang.String[] strArray23 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.String[] strArray25 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.Object obj26 = null;
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray25, obj26, (int) ' ');
        int int30 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray23, (java.lang.Object) int28, 13);
        java.lang.String[] strArray32 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("h");
        int int34 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray23, (java.lang.Object) "h", 62);
        int[] intArray38 = new int[] { 2, (byte) 0, (short) 10 };
        boolean boolean39 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray38);
        boolean boolean40 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray38);
        boolean boolean41 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray38);
        int int43 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray23, (java.lang.Object) intArray38, (int) (byte) -1);
        int int45 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, (java.lang.Object) (byte) -1, 45);
        java.lang.Object obj46 = null;
        int int48 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, obj46, (-99));
        java.lang.String[] strArray50 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.String[] strArray52 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.Object obj53 = null;
        int int55 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray52, obj53, (int) ' ');
        int int57 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray50, (java.lang.Object) int55, 13);
        java.lang.String[] strArray59 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("h");
        int int61 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray50, (java.lang.Object) "h", 62);
        int[] intArray65 = new int[] { 2, (byte) 0, (short) 10 };
        boolean boolean66 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray65);
        boolean boolean67 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray65);
        boolean boolean68 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray65);
        int int70 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray50, (java.lang.Object) intArray65, (int) (byte) -1);
        java.lang.String[] strArray72 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!!!");
        int int74 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray50, (java.lang.Object) "hi!!!", (-32));
        char[] charArray81 = new char[] { '4' };
        boolean boolean82 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray81);
        boolean boolean83 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray81);
        boolean boolean84 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray81);
        boolean boolean85 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray81);
        boolean boolean86 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray81);
        int int87 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray81);
        boolean boolean88 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray81);
        boolean boolean89 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!", charArray81);
        int int91 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray50, (java.lang.Object) charArray81, (int) '\r');
        int int93 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, (java.lang.Object) int91, 101);
        // The following exception was thrown during execution in test generation
        try {
            int int94 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int91);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[2, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[2, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray81), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray81), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray81), "[4]");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4307");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) ' ', (int) '#');
        int[] intArray12 = new int[] { 2, (byte) 0, (short) 10 };
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray12);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) boolean15, 100);
        char[] charArray19 = new char[] { '4' };
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray19);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) charArray19, (int) (short) -1);
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray19);
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray19, 15);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii", charArray19);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!", charArray19);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[2, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4308");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(708);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4309");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihi!!hhii", "hihi!!hhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4310");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!ii");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!ii is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4311");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4312");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!ii", "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4313");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hihii!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4314");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(100, 707, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 707");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4315");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) ' ', (int) '#');
        java.lang.CharSequence charSequence7 = null;
        char[] charArray17 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray17);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray17);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence7, charArray17);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray17);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii", charArray17);
        boolean boolean26 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray17, (-84));
        char[] charArray33 = new char[] { '4' };
        boolean boolean34 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray33);
        boolean boolean35 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray33);
        boolean boolean36 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray33);
        boolean boolean37 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray33);
        boolean boolean38 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray33);
        int int40 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean38, 22);
        char[] charArray48 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean49 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray48);
        boolean boolean50 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray48);
        boolean boolean51 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray48);
        int int53 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hi", 9);
        // The following exception was thrown during execution in test generation
        try {
            int int54 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[4]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4316");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihi!!hhii", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4317");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(0, 217, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4318");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hih");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4319");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4320");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("!!i!!!i!!!!hii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4321");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(699);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4322");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(712, (int) '\r', 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4323");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4324");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "!!i!!!", (java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4325");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!!hi!!!hi!!!", charArray5);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        java.lang.Class<?> wildcardClass13 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4326");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(101);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4327");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("!!i!!!i");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4328");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-9), 215, (-13));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 215");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4329");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(29, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4330");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4331");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4332");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii" + "'", str1, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii");
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4333");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence3, charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray5);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!", charArray5);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4334");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!h");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!", charArray6);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!", 709);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4335");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4336");
        char[] charArray4 = new char[] { '4' };
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray4);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4337");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4338");
        char[] charArray10 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "!!i!!!i!!!!hii!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4339");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "!!i!!!i!!!!hii!!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4340");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4341");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4342");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(710, 233);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 233");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4343");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4344");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray5);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray5);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4345");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4346");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4347");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(859, 260);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 260");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4348");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4349");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hihi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4350");
        char[] charArray12 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi!!!", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4351");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("!!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4352");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!", (java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4353");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!", "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4354");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("!!i!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!i!!" + "'", str1, "!!i!!");
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4355");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "!!i!!!i!!!!h", (java.lang.CharSequence) "!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4356");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, (-84));
        int[] intArray7 = new int[] { (-39) };
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray7);
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) boolean8, (int) ' ');
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi");
        java.lang.Object obj13 = null;
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray12, obj13, 10);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) 10, 97);
        comp5111.assignment.cut.Subject.StringTasks stringTasks18 = new comp5111.assignment.cut.Subject.StringTasks();
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) stringTasks18, (-100));
        java.lang.Class<?> wildcardClass21 = stringTasks18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) wildcardClass21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-39]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4357");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4358");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "!!i!!!i!!!!hii!", (java.lang.CharSequence) "hihi!!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4359");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihi!!hhii!", "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4360");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-25), (-35), 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4361");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "h", (java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4362");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihii!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihii!! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4363");
        int[] intArray4 = new int[] { (-1), ' ', 10, (short) 10 };
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 32, 10, 10]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4364");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("!!i!!!i!!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.Object obj6 = null;
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, obj6, (int) ' ');
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) int8, 13);
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("h");
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) "h", 62);
        int[] intArray18 = new int[] { 2, (byte) 0, (short) 10 };
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray18);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray18);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray18);
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) intArray18, (int) (byte) -1);
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray3);
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int24, 999999999);
        java.lang.String[] strArray28 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!");
        int int30 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray28, 13);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[2, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4365");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(213);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4366");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!iih");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 713 + "'", int1 == 713);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4367");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4368");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(224);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4369");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-20), 860);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 860");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4370");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-1), (-10));
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hihi!!!hi!!!hi!!", (int) '\r');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4371");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!h", (java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4372");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!", "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4373");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hihi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4374");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 209 + "'", int1 == 209);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4375");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(12, 12, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4376");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!ii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!i" + "'", str1, "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!i");
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4377");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hi!!h", "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!h", "hii!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!!h" + "'", str3, "hi!!h");
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4378");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4379");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(209);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4380");
        char[] charArray11 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4381");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihii!i!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihii!i!! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4382");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("", "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!iih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4383");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4384");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(707, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4385");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihi!!hhi", (java.lang.CharSequence) "hihi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4386");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihi!!!hi!!!hi!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) ' ', (int) '#');
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) "", (int) (short) 10);
        java.lang.Class<?> wildcardClass11 = strArray3.getClass();
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4387");
        char[] charArray13 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii!", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!i!!!", charArray13);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!", charArray13);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4388");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!", "hihi!!hhii!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4389");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) '\000', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4390");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4391");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4392");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihi");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!");
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) wildcardClass4, 999999999);
        java.lang.Class<?> wildcardClass7 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4393");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihi!!h", (java.lang.CharSequence) "hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4394");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(42, 39, 68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4395");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4396");
        comp5111.assignment.cut.Subject.ArrayTasks arrayTasks0 = new comp5111.assignment.cut.Subject.ArrayTasks();
        char[] charArray7 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray7);
        java.lang.Object[] objArray10 = new java.lang.Object[] { arrayTasks0, "hi!", 31 };
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, (java.lang.Object) 20, 9);
        java.lang.String[] strArray15 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        char[] charArray18 = new char[] { '4' };
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray18);
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray15, (java.lang.Object) charArray18, 20);
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, (java.lang.Object) strArray15, 2);
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, (java.lang.Object) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i", 29);
        java.lang.String[] strArray30 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!!");
        int int32 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, (java.lang.Object) strArray30, 709);
        int int35 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray30, (java.lang.Object) 68, 6);
        java.lang.String[] strArray37 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hii!!");
        int int39 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray30, (java.lang.Object) strArray37, (int) '4');
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4397");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!");
        char[] charArray12 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hi", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!", charArray12);
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray12, 860);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4398");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("!!i!!!i!!!!hii!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i!!!i!!!!hii!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4399");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals(charSequence0, (java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4400");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!!");
        java.lang.Object obj2 = null;
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj2, 65);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4401");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("!!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4402");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(701, 14, 710);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 710");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4403");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(215, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4404");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("!!i!!!i!!!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!i!!!i!!!!" + "'", str1, "!!i!!!i!!!!");
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4405");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("!!i!!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4406");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("!!i!!!i!!!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4407");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("!!i!!!i!");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "!!i!!!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4408");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4409");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = new char[] { '4' };
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence2, charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4]");
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
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4410");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4411");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihi!!!hi!!!h", "!!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihi!!!hi!!!h" + "'", str2, "hihi!!!hi!!!h");
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4412");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4413");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4414");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(0, 214, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 214");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4415");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        char[] charArray4 = new char[] { '4' };
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray4);
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray4, 20);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray4);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4416");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4417");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(229, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4418");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!h" + "'", str1, "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!h");
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4419");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihii!!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4420");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hih");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4421");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!", charArray6);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!h", charArray6);
        java.lang.Class<?> wildcardClass15 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4422");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!ihihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!i!!!hihi!!!hi!!!hhihi!!!hi!!!h!!!hihi!!!hi!!!h!!!hihi!!!hi!!!h!!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4423");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!", (java.lang.CharSequence) "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4424");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("!!i!!!i!!!!hii!!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: !!i!!!i!!!!hii!!!i is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4425");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iih" + "'", str1, "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iih");
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4426");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4427");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("!!i!!!i!!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray6);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray6, 20);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean12, (-52));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4428");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals(charSequence0, (java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4429");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.Object obj4 = null;
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, obj4, (int) ' ');
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int6, 13);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hii!!");
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray10, 11);
        java.lang.String[] strArray14 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!");
        java.lang.Class<?> wildcardClass15 = strArray14.getClass();
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) wildcardClass15, (int) (short) 1);
        java.lang.CharSequence charSequence20 = null;
        char[] charArray22 = new char[] { '4' };
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray22);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray22);
        boolean boolean25 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray22);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence20, charArray22);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray22);
        boolean boolean28 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray22);
        boolean boolean29 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray22);
        int int31 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean29, (int) (byte) 10);
        int[] intArray38 = new int[] { 30, 7, (-11), (short) -1, 'a', (short) -1 };
        boolean boolean39 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray38);
        int int41 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) intArray38, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[30, 7, -11, -1, 97, -1]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4430");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4431");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!");
        char[] charArray11 = new char[] { '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!", charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi!!!", charArray11);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!h", charArray11);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!i!!!i!!!!hii!!!i!", charArray11);
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray11, 42);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4432");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hihi!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4433");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4434");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = null;
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence2, charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i", charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence0, charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4435");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hihi!!!hi!!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4436");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence4, charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence2, charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!hh", charArray6);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!i!!!!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4437");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 711 + "'", int1 == 711);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4438");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4439");
        char[] charArray11 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i", charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4440");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hihi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4441");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!!h");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!");
        int[] intArray5 = new int[] { (-39) };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) boolean9, 7);
        java.lang.String[] strArray13 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!");
        char[] charArray23 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray23);
        boolean boolean25 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray23);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray23);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray23);
        boolean boolean28 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray23);
        boolean boolean29 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray23);
        int int31 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray13, (java.lang.Object) boolean29, 12);
        int int33 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) 12, 221);
        int int35 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 221, 214);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-39]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4442");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(20, (-42), 852);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -42");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4443");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("!!i!!!i!!!!hii!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4444");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) '4', 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4445");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!", "hihii!!hii!!", "hihi!!!hi!!!hi!ihihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi!i!!!hihi!!!hi!!!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!" + "'", str3, "!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!");
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4446");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4447");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hihii!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4448");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(260, 0, 18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4449");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        char[] charArray9 = new char[] { '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray9);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!", charArray9);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi!!!", charArray9);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hihi!!!hi!!!hi!!!", 0);
        java.lang.Class<?> wildcardClass21 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4450");
        char[] charArray11 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!", charArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hihii!!hii!!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4451");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray6);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!", charArray6);
        java.lang.Class<?> wildcardClass15 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4452");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = new char[] { '4' };
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence2, charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray4);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4453");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.Object obj4 = null;
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, obj4, (int) ' ');
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int6, 13);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("h");
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "h", 62);
        int[] intArray16 = new int[] { 2, (byte) 0, (short) 10 };
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray16);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray16);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray16);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) intArray16, (int) (byte) -1);
        java.lang.String[] strArray23 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!!!");
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hi!!!", (-32));
        java.lang.String[] strArray27 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        char[] charArray30 = new char[] { '4' };
        boolean boolean31 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray30);
        boolean boolean32 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray30);
        boolean boolean33 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray30);
        int int35 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray27, (java.lang.Object) charArray30, 20);
        java.lang.Object obj36 = new java.lang.Object();
        int int38 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray27, obj36, 11);
        int int40 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj36, (-101));
        int int43 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 100.0d, 227);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[2, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[4]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4454");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("!!i!!!i!!!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4455");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(7, 700);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 700");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4456");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-39), (int) (short) 100, 233);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 233");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4457");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4458");
        char[] charArray8 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4459");
        char[] charArray10 = new char[] { '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray10);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii", charArray10);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!", charArray10);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!hhii", charArray10);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4460");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("!!i");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4461");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(712, 0, 707);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4462");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!", "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4463");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hihi!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4464");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii!!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!", charArray5);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4465");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!ihihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!i!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!!!!!hihi!!hhii!ii!ihihi!!hhii!ii!ii!!hihi!!hhii!ii!ii!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4466");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4467");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4468");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4469");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(999999999, 39, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4470");
        char[] charArray4 = new char[] { '4' };
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!ihi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!i!!!hi!!!hi!!!!!!hi!!!!!!hi!!!!!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4471");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4472");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iih");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hii!!");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, (-10));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4473");
        int[] intArray3 = new int[] { 2, (byte) 0, (short) 10 };
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        java.lang.Class<?> wildcardClass5 = intArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[2, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4474");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hihi!!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi!!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4475");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4476");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!!!i!!!i!!!!hii!!!i!!!i!!!!hii!i!!i!!!i!!!!hii!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4477");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4478");
        java.lang.String[] strArray0 = comp5111.assignment.cut.Subject.ArrayTasks.EMPTY_STRING_ARRAY;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 'a', (-1.0d), 100L, (-1.0d), 1.0d, 10.0d };
        java.lang.Object obj8 = null;
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray7, obj8, 1);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray7, (java.lang.Object) (short) 10, 13);
        java.lang.String[] strArray15 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        java.lang.String[] strArray17 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        char[] charArray19 = new char[] { '4' };
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray19);
        char[] charArray25 = new char[] { '4' };
        boolean boolean26 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray25);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray25);
        boolean boolean28 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray25);
        boolean boolean29 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray25);
        boolean boolean30 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray25);
        java.lang.Object[] objArray31 = new java.lang.Object[] { strArray0, int13, strArray15, "", boolean20, boolean30 };
        int int34 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray31, (java.lang.Object) (byte) 0, (int) (short) 10);
        char[] charArray44 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean45 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray44);
        boolean boolean46 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray44);
        boolean boolean47 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray44);
        boolean boolean48 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray44);
        boolean boolean49 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray44);
        boolean boolean50 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray44);
        boolean boolean51 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray44);
        int int53 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray31, (java.lang.Object) charArray44, 10);
        java.lang.String[] strArray55 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("!");
        int[] intArray58 = new int[] { ' ', '#' };
        boolean boolean59 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray58);
        boolean boolean60 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray58);
        boolean boolean61 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray58);
        boolean boolean62 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray58);
        int int64 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray55, (java.lang.Object) intArray58, 12);
        int int66 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray31, (java.lang.Object) int64, 859);
        java.lang.Class<?> wildcardClass67 = objArray31.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[a, -1.0, 100, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[a, -1.0, 100, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[[], -1, [], , false, true]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[32, 35]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4479");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("!", "!!i!", "hi!!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!" + "'", str3, "!");
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4480");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4481");
        char[] charArray11 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii!!", charArray11);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!", charArray11);
        java.lang.Class<?> wildcardClass22 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4482");
        char[] charArray8 = new char[] { '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!i!!!i", charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!!hi!!!hi!!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!", charArray8);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!!!hi!!!hi!", charArray8);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!hihi!!!hi!!!hi!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4483");
        char[] charArray10 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4484");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) ' ', (int) '#');
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "", (int) (short) 10);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-19), (-20));
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 10.0d, (-20));
        char[] charArray25 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray25);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray25);
        boolean boolean28 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray25);
        boolean boolean29 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray25);
        boolean boolean30 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray25);
        boolean boolean31 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!h", charArray25);
        int int33 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean31, 14);
        java.lang.String[] strArray35 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi");
        java.lang.Object obj36 = null;
        int int38 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray35, obj36, 10);
        java.lang.CharSequence charSequence41 = null;
        char[] charArray51 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean52 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray51);
        boolean boolean53 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray51);
        boolean boolean54 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray51);
        boolean boolean55 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray51);
        boolean boolean56 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray51);
        boolean boolean57 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence41, charArray51);
        boolean boolean58 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray51);
        boolean boolean59 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray51);
        int int61 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray35, (java.lang.Object) boolean59, (-2));
        char[] charArray65 = new char[] { '4' };
        boolean boolean66 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray65);
        boolean boolean67 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray65);
        boolean boolean68 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray65);
        boolean boolean69 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray65);
        int int71 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray35, (java.lang.Object) charArray65, 22);
        java.lang.String[] strArray73 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!!!");
        int int76 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray73, (java.lang.Object) "hi", (-32));
        int int78 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray35, (java.lang.Object) strArray73, (-22));
        int int80 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-22), 7);
        int int83 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 25, (-100));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray65), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray65), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray65), "[4]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4485");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hihi!!!hi!!!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4486");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(4, 18, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 18");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4487");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihi!!hhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihi!!hhi is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4488");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("!!i!!!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4489");
        char[] charArray2 = new char[] { '4' };
        boolean boolean3 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray2);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!!!hi!!!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4490");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihi!!hhi", (java.lang.CharSequence) "!!i!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4491");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!i" + "'", str1, "hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!ihihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!i!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!ii!!!!!hihii!!hii!ihihii!!hii!ii!!hihii!!hii!i");
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4492");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = null;
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.ArrayTasks.EMPTY_STRING_ARRAY;
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', (-1.0d), 100L, (-1.0d), 1.0d, 10.0d };
        java.lang.Object obj11 = null;
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, obj11, 1);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray10, (java.lang.Object) (short) 10, 13);
        java.lang.String[] strArray18 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        java.lang.String[] strArray20 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        char[] charArray22 = new char[] { '4' };
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray22);
        char[] charArray28 = new char[] { '4' };
        boolean boolean29 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray28);
        boolean boolean30 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray28);
        boolean boolean31 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray28);
        boolean boolean32 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray28);
        boolean boolean33 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray28);
        java.lang.Object[] objArray34 = new java.lang.Object[] { strArray3, int16, strArray18, "", boolean23, boolean33 };
        int int37 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray34, (java.lang.Object) (byte) 0, (int) (short) 10);
        char[] charArray47 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean48 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray47);
        boolean boolean49 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray47);
        boolean boolean50 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray47);
        boolean boolean51 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray47);
        boolean boolean52 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray47);
        boolean boolean53 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray47);
        boolean boolean54 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray47);
        int int56 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray34, (java.lang.Object) charArray47, 10);
        boolean boolean57 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray47);
        boolean boolean58 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence2, charArray47);
        boolean boolean59 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence1, charArray47);
        boolean boolean60 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!ihihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!i!!!hihii!!hii!!hihii!!hii!!!!!hihii!!hii!!!!!hihii!!hii!!!iih", charArray47);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[a, -1.0, 100, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[a, -1.0, 100, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[4]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[[], -1, [], , false, true]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4493");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hihi!!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4494");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(859, 851);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 851");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4495");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihii", "hi!!", "!!i!!!i!!!!hii!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihii" + "'", str3, "hihii");
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4496");
        char[] charArray11 = new char[] { '4', '#', 'a', '4', ' ' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!ihihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!i!!!hihii!!hii!hihii!!hii!!!!hihii!!hii!!!!hihii!!hii!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4497");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, (-84));
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.Object obj10 = null;
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray9, obj10, (int) ' ');
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, (java.lang.Object) int12, 13);
        java.lang.String[] strArray16 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("h");
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, (java.lang.Object) "h", 62);
        int[] intArray22 = new int[] { 2, (byte) 0, (short) 10 };
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray22);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray22);
        boolean boolean25 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray22);
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, (java.lang.Object) intArray22, (int) (byte) -1);
        int int29 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) intArray22, (int) '#');
        boolean boolean30 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray22);
        boolean boolean31 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray22);
        boolean boolean32 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray22);
        boolean boolean33 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray22);
        boolean boolean34 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray22);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[2, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4498");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("!!i!!!i");
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray7);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!", charArray7);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean14, 9);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4499");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("!!i!!!i!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!i!!!i!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test4500");
        java.lang.Object[] objArray0 = null;
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h");
        java.lang.Object obj5 = null;
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, obj5, (int) ' ');
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) int7, 13);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray0, (java.lang.Object) strArray2, 213);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }
}

