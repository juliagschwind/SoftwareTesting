package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4001");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(56, (-20), 101);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -20");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4002");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhhi!!!!!!ihhi!!!!!!!!!i!i!!ih!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4003");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hii!!!!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hii!!!!!!! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4004");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(2, 54, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 54");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4005");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray8 = new char[] { '4', 'a', '\000' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence2, charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!!!!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        java.lang.Class<?> wildcardClass15 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4006");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hii!!i", "hh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hii!!i" + "'", str2, "hii!!i");
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4007");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4008");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("h!!!", "hih!h!h!h!h!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4009");
        char[] charArray9 = new char[] { '4', 'a', '\000' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray9);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii!!i!i!!i!", charArray9);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4010");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihihii!!!hii!!!hii!!!hii!!!hii!!!hii!!!i!!!!!!hihii!!!hii!!!hii!!!hii!!!hii!!!hii!!!i!!!!!!hihii!!!hii!!!hii!!!hii!!!hii!!!hii!!!i!!!!!!hihii!!!hii!!!hii!!!hii!!!hii!!!hii!!!i!!!!!!hihii!!!hii!!!hii!!!hii!!!hii!!!hii!!!i!!!!!!hihii!!!hii!!!hii!!!hii!!!hii!!!hii!!!i!!!!!");
        char[] charArray10 = new char[] { '4', 'a', '\000' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!!!!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hi!", 9);
        java.lang.Class<?> wildcardClass20 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4011");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hihi!hi!hi!hi!hi!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi!hi!hi!hi!hi!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4012");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhihihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhh" + "'", str1, "hhihihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhh");
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4013");
        char[] charArray9 = new char[] { '4', 'a', '\000' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhh", charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhih!!!!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4014");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4015");
        char[] charArray7 = new char[] { '\n', 'a', ' ', 'a', '#' };
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!!!!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihii!!!hii!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\na a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\na a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\n, a,  , a, #]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4016");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4017");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(2, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4018");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4019");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(87, 8, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4020");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-84), 90, 28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4021");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hii!!!!");
        char[] charArray10 = new char[] { '4', 'a', '\000' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray10);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray10);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray10, 13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!!!!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hih", charArray10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4022");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray11 = new char[] { '4', 'a', '\000' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence5, charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hiii", charArray11);
        java.lang.Class<?> wildcardClass21 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4023");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hihii!!!hii!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihii!!!hii!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4024");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hii!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4025");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!", (java.lang.CharSequence) "hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4026");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4027");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(7, 89);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 89");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4028");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(27, 39, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4029");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hii!!i!i!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4030");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhihi!!!hi!!!hi!!!hi!!!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihi!!!hi!!!hi!!!hi!!!hi!" + "'", str1, "hhihi!!!hi!!!hi!!!hi!!!hi!");
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4031");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray9 = new char[] { '4', 'a', '\000' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence3, charArray9);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray9);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4032");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhih!!!!!", (java.lang.CharSequence) "hii!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4033");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (byte) 0, (-90), 24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4034");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hihii!!!hii!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4035");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("h!!!", "hihhi!!!!!!!!!!!!hhi!!!!!!!!!!!!hhi!!!!!!!!!!!!hhi!!!!!!!!!!!!hhi!!!!!!!!!!!!hhi!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4036");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray11 = new char[] { '4', 'a', '\000' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence5, charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray11);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!hi!hi!hi!hi!hhi!!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4037");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!!! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4038");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hh");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        java.lang.Object obj3 = null;
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj3, 52);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4039");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("", "h!!!!", "h!!!!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4040");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhi!!!!!!ihhi!!!!!!!!!i!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhi!!!!!!ihhi!!!!!!!!!i!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4041");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hihi!hi!hi!hi!hi!hhi!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4042");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (byte) 100, (-20), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -20");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4043");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhh!hh!hh!hh!hh!hhh!!", (java.lang.CharSequence) "hihhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4044");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hihi!hi!hi!hi!hi!hhi!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4045");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(17, (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -101");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4046");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hi!!", (java.lang.CharSequence) "hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4047");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhi!!!!!!ihhi!!!!!!!!!i!i!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4048");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hih!h!h!h!", (java.lang.CharSequence) "hhi!!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4049");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhihi!!!hi!!!hi!!!hi!!!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihi!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4050");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hihi!hi!hi!hi!hi!hhi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi!hi!hi!hi!hi!hhi!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4051");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhih!!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4052");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4053");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4054");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihi!hi!hi!hi!hi!hhi!!", (java.lang.CharSequence) "hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4055");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihi!hi!hi!hi!hi!hh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4056");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(13, 89, 379);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 89");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4057");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihihhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!hihhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!hihhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!hihhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!hihhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4058");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4059");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hihi!hi!hi!hi!hi!hhi!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4060");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhh" + "'", str1, "hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhh");
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4061");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhhi!!!!!!ihhi!!!!!!!!!i!i!!ih!!!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhi!!!!!!ihhi!!!!!!!!!i!i!!ih!!!!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4062");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) '\000', (-19));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -19");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4063");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray10 = new char[] { '4', 'a', '\000' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence3, charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!!!!!!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii!!i!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4064");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhih!!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhih!!!!! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4065");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hihhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!" + "'", str1, "hihhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!");
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4066");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.ArrayTasks.EMPTY_STRING_ARRAY;
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) "hii!!!", 17);
        java.lang.CharSequence charSequence8 = null;
        java.lang.CharSequence charSequence11 = null;
        char[] charArray17 = new char[] { '4', 'a', '\000' };
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray17);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence11, charArray17);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray17);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray17);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence8, charArray17);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii!", charArray17);
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray17, 55);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hih!!!i!i!!i", charArray17);
        boolean boolean28 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hiii", charArray17);
        boolean boolean29 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h!!!", charArray17);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4067");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(30, 89);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 89");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4068");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhihihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhh" + "'", str1, "hhihihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhh");
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4069");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhh!hh!hh!hh!hh!hhh!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4070");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray12 = new char[] { '4', 'a', '\000' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence6, charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray12);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hih!h!h!h!h!h", charArray12);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhh!", charArray12);
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4071");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hihhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4072");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray9 = new char[] { '4', 'a', '\000' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence2, charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4073");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray9 = new char[] { '4', 'a', '\000' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence3, charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhih!!!!!", charArray9);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4074");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("", "hih!h!h!h!h!", "hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4075");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hihhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4076");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!!" + "'", str1, "hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!!");
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4077");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhi!!!!!!ihhi!!!!!!!!!i!i!!ih!!!!!!", "hhihihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4078");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(12, (-90), 91);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 91");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4079");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!!hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4080");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih!!", "hhhh!hh!hh!hh!hh!hhh!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i" + "'", str2, "hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i");
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4081");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray3);
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, 99);
        java.lang.CharSequence charSequence12 = null;
        char[] charArray18 = new char[] { '4', 'a', '\000' };
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray18);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray18);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence12, charArray18);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray18);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray18);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray18);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray18);
        boolean boolean27 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        boolean boolean28 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!", charArray18);
        boolean boolean29 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        int int31 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean29, (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4082");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4083");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4084");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-10), 91);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 91");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4085");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hihi!hi!hi!hi!hi!hhi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4086");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!!hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4087");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4088");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4089");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray11 = new char[] { '4', 'a', '\000' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence5, charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hih!", charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhh!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4090");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4091");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-9), 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 19");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4092");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihii!!!hii!!!", (java.lang.CharSequence) "hhih!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4093");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh" + "'", str1, "hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh");
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4094");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhhh!hh!hh!hh!hh!hhh!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hh!hh!hh!hh!hhh!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4095");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(8, 263);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 263");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4096");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray10 = new char[] { '4', 'a', '\000' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence4, charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence1, charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        java.lang.Class<?> wildcardClass19 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4097");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hih", "hhihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4098");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hii!!!!!!!", (java.lang.CharSequence) "hih!!!i!i!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4099");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhh!hh!hh!hh!hh!hhh!!!", (java.lang.CharSequence) "h!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4100");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "h!!!ih!!!!!!i!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4101");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray9 = new char[] { '4', 'a', '\000' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence3, charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii!!i!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hih!!!i!i!!i!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4102");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihihhi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4103");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!!", "hii!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4104");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhi!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4105");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h!!!ih!!!!!!i!i!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4106");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhihihhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!hihhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!hihhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!hihhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!hihhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhihihhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!hihhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!hihhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!hihhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!hihhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4107");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih!!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4108");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hii!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4109");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence6 = null;
        char[] charArray12 = new char[] { '4', 'a', '\000' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence6, charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence1, charArray12);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih", charArray12);
        boolean boolean26 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4110");
        int[] intArray4 = new int[] { 52, 101, 25, (-100) };
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        java.lang.Class<?> wildcardClass7 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 101, 25, -100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4111");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hi!!", "hhihihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhh", "h!!!!!h!h!h!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!!" + "'", str3, "hi!!");
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4112");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhihi!!!hi!!!hi!!!hi!!!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihi!!!hi!!!hi!!!hi!!!hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4113");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4114");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hih!!!i!i!!i", "h!!!ih!!!!!!i!i!", "hhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hih!!!i!i!!i" + "'", str3, "hih!!!i!i!!i");
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4115");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih!!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4116");
        java.lang.CharSequence charSequence7 = null;
        char[] charArray13 = new char[] { '4', 'a', '\000' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence7, charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray13);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hih!h!h!h!h!h", charArray13);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h!!!", charArray13);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii!!i!i!!i!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4117");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4118");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hihi!hi!hi!hi!hi!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4119");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihi!hi!hi!hi!hi!hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihi!hi!hi!hi!hi!hh" + "'", str1, "hihi!hi!hi!hi!hi!hh");
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4120");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hii!!");
        char[] charArray10 = new char[] { '4', 'a', '\000' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!!", charArray10);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray10, (-1));
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!!!!!hi!!!!!!!!!hi!!!!!!!!!hi!!!!!!!!!hi!!!!!!!!!hi!!!!!!!!!", charArray10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4121");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (short) 1, 0, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4122");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-97), 999999999, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4123");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(39, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4124");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhi!!!!!!ihhi!!!!!!!!!i!i!!ih!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4125");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhih!!!!!!");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray11 = new char[] { '4', 'a', '\000' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence5, charArray11);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray11);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean18, 19);
        java.lang.Class<?> wildcardClass21 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4126");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4127");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4128");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hih!h!h!h!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hih!h!h!h!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4129");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 314 + "'", int1 == 314);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4130");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray9 = new char[] { '4', 'a', '\000' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence2, charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii", charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4131");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhh!hh!hh!hh!hh!hhh!!!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4132");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhihihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhh!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4133");
        char[] charArray12 = new char[] { '4', 'a', '\000' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray12);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii!!", charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h!!!", charArray12);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4134");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!!hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhi");
        char[] charArray13 = new char[] { '4', 'a', '\000' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray13);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii!!", charArray13);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h!!!", charArray13);
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean22, 204);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4135");
        char[] charArray7 = new char[] { '4', 'a', '\000' };
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!", charArray7);
        java.lang.Class<?> wildcardClass14 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4136");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hihi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4137");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4138");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4139");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("h!!!ih!!!!!!i!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4140");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) 'a', 54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 54");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4141");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!", (java.lang.CharSequence) "hihhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4142");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hii!!i!", "hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hii!!i!" + "'", str2, "hii!!i!");
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4143");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhih!!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhih!!!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4144");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (short) 10, (-87), 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -87");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4145");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!!hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4146");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals(charSequence0, (java.lang.CharSequence) "hhhh!hh!hh!hh!hh!hhh!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4147");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-2), 55, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 55");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4148");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihi!hi!hi!hi!hi!hhi!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4149");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(22);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4150");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hii!!!!!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4151");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihi!hi!hi!hi!hi!hhi!!!!!", "hii!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4152");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4153");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("h!!!ih!!!!!!i!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"h!!!ih!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4154");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hihhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4155");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4156");
        char[] charArray10 = new char[] { '4', 'a', '\000' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray10);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhh!hh!hh!hh!hh!hhh!!!", charArray10);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4157");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hii!!i", "hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih", "hhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!!hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hii!!i" + "'", str3, "hii!!i");
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4158");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4159");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray11 = new char[] { '4', 'a', '\000' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence5, charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence0, charArray11);
        java.lang.Class<?> wildcardClass24 = charArray11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) wildcardClass24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4160");
        char[] charArray6 = new char[] { '4', 'a', '\000' };
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray6);
        java.lang.Class<?> wildcardClass10 = charArray6.getClass();
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4161");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4162");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
        char[] charArray10 = new char[] { '4', 'a', '\000' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray10, (-10));
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h!!!!!h!h!h!h", charArray10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4163");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hii!!i!i!!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4164");
        char[] charArray9 = new char[] { '4', 'a', '\000' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!!!!!!", charArray9);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihihii!!!hii!!!hii!!!hii!!!hii!!!hii!!!i!!!!!!hihii!!!hii!!!hii!!!hii!!!hii!!!hii!!!i!!!!!!hihii!!!hii!!!hii!!!hii!!!hii!!!hii!!!i!!!!!!hihii!!!hii!!!hii!!!hii!!!hii!!!hii!!!i!!!!!!hihii!!!hii!!!hii!!!hii!!!hii!!!hii!!!i!!!!!!hihii!!!hii!!!hii!!!hii!!!hii!!!hii!!!i!!!!!", charArray9);
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4165");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hii");
        int[] intArray7 = new int[] { 'a', (byte) 100, 100, '#', (byte) 0 };
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray7);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean9, (-25));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 100, 100, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4166");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhihihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4167");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhihihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4168");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-9), 91, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4169");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihhi!!!!!!!!!!!!hhi!!!!!!!!!!!!hhi!!!!!!!!!!!!hhi!!!!!!!!!!!!hhi!!!!!!!!!!!!hhi!!!!!!!!!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4170");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) -1, (-39));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4171");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhh!hh!hh!hh!hh!hhh!!!", (java.lang.CharSequence) "hhih!!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4172");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("", "hii!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4173");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(9, (-52), 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4174");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-87), 9, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: 90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4175");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhihihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4176");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(19, (-52));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4177");
        comp5111.assignment.cut.Subject.GregorianTasks.checkDate(10, (int) (short) 10, 17);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4178");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhh");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray11 = new char[] { '4', 'a', '\000' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence5, charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray11);
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int22, (-13));
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hih", 56);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4179");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhi", "hi!!!!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhi" + "'", str3, "hhi");
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4180");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4181");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhi!!!!!!ihhi!!!!!!!!!i!i!!", "hii!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4182");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhh!hh!hh!hh!hh!hhh!!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 23 + "'", int1 == 23);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4183");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhih!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhih!!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4184");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(0, 58, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 58");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4185");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!" + "'", str1, "hihhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!");
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4186");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!!hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhi", (java.lang.CharSequence) "hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4187");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihihhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!hihhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!hihhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!hihhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!hihhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4188");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.ArrayTasks.EMPTY_STRING_ARRAY;
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) "hii!!!", 17);
        java.lang.CharSequence charSequence8 = null;
        java.lang.CharSequence charSequence11 = null;
        char[] charArray17 = new char[] { '4', 'a', '\000' };
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray17);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence11, charArray17);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray17);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray17);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence8, charArray17);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii!", charArray17);
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray17, 55);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hih!!!i!i!!i", charArray17);
        boolean boolean28 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hiii", charArray17);
        boolean boolean29 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhh!hh!hh!hh!hh!hhh!!", charArray17);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4189");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("i", "hhhh!hh!hh!hh!hh!hhh!!", "hhihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i" + "'", str3, "i");
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4190");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!!hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4191");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihi!hi!hi!hi!hi!hh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 19 + "'", int1 == 19);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4192");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!!hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!!hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhh" + "'", str1, "hhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!!hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhh");
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4193");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!!hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!!hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhh" + "'", str1, "hhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!!hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhh");
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4194");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4195");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray10 = new char[] { '4', 'a', '\000' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence4, charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi", charArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhi");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4196");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-13), 97, (-52));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4197");
        char[] charArray7 = new char[] { '4', 'a', '\000' };
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!!!!!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4198");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4199");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4200");
        comp5111.assignment.cut.Subject.GregorianTasks.checkDate(90, 7, 5);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4201");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        comp5111.assignment.cut.Subject subject3 = new comp5111.assignment.cut.Subject();
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) subject3, 30);
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray0, (java.lang.Object) int5, (-100));
        char[] charArray17 = new char[] { '4', 'a', '\000' };
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray17);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray17);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray17);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!!!!!", charArray17);
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray0, (java.lang.Object) "hhi!!!!!!", 4);
        java.lang.CharSequence charSequence30 = null;
        char[] charArray36 = new char[] { '4', 'a', '\000' };
        boolean boolean37 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray36);
        boolean boolean38 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray36);
        boolean boolean39 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence30, charArray36);
        boolean boolean40 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray36);
        int int41 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray36);
        boolean boolean42 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray36);
        boolean boolean43 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hiii", charArray36);
        int int45 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray0, (java.lang.Object) boolean43, 0);
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4202");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhih!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4203");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hihii!!!hii!!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4204");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hii", "hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!!!!", "hi!!!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hii" + "'", str3, "hii");
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4205");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!!hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhh", (java.lang.CharSequence) "h!!!!!h!h!h!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4206");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihhi!!!!!!!!!!!!hhi!!!!!!!!!!!!hhi!!!!!!!!!!!!hhi!!!!!!!!!!!!hhi!!!!!!!!!!!!hhi!!!!!!!!!!", (java.lang.CharSequence) "hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4207");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhh", "hii!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4208");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) '#', (-99));
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("");
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) 1, 999999999);
        java.lang.Object obj10 = null;
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, obj10, (-84));
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int12, (int) (short) 100);
        char[] charArray20 = new char[] { '4', 'a', '\000' };
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray20);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray20);
        java.lang.Class<?> wildcardClass23 = charArray20.getClass();
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray20, (-20));
        char[] charArray34 = new char[] { '4', 'a', '\000' };
        boolean boolean35 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray34);
        boolean boolean36 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray34);
        boolean boolean37 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray34);
        int int38 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray34);
        boolean boolean39 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray34);
        boolean boolean40 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray34);
        boolean boolean41 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray34);
        int int43 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean41, (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4209");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhh!hh!hh!hh!hh!hhh!!!", "hi!!", "hihi!hi!hi!hi!hi!hhi!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhh!hh!hh!hh!hh!hhh!!!" + "'", str3, "hhhh!hh!hh!hh!hh!hhh!!!");
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4210");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(22, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4211");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih!!", (java.lang.CharSequence) "hihi!hi!hi!hi!hi!hh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4212");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4213");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4214");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hih!!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4215");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(0, 32, (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4216");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (short) 0, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4217");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) subject2, 30);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("i");
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) 'a', 84);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 84, 2);
        java.lang.String[] strArray13 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        java.lang.String[] strArray15 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray15);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray13, (java.lang.Object) strArray15, 99);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 99, (int) ' ');
        java.lang.String[] strArray22 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "", (int) '\r');
        java.lang.Class<?> wildcardClass25 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4218");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(271, 0, (-65));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4219");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("!");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray11 = new char[] { '4', 'a', '\000' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence5, charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii!!", charArray11);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hii!!", 91);
        java.lang.CharSequence charSequence28 = null;
        char[] charArray34 = new char[] { '4', 'a', '\000' };
        boolean boolean35 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray34);
        boolean boolean36 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray34);
        boolean boolean37 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence28, charArray34);
        boolean boolean38 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray34);
        boolean boolean39 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray34);
        boolean boolean40 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray34);
        boolean boolean41 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!!", charArray34);
        boolean boolean42 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray34);
        boolean boolean43 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i!", charArray34);
        boolean boolean44 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "!!", charArray34);
        boolean boolean45 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!!!!!!", charArray34);
        boolean boolean46 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray34);
        java.lang.Class<?> wildcardClass47 = charArray34.getClass();
        int int49 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) wildcardClass47, 45);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4220");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hi!!!!!", "hii!!!!!!", "hhhh!hh!hh!hh!hh!hhh!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!!!!!" + "'", str3, "hi!!!!!");
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4221");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hih!!!i!i!!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hih!!!i!i!!i" + "'", str1, "hih!!!i!i!!i");
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4222");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhhh!hh!hh!hh!hh!hhh!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhh!hh!hh!hh!hh!hhh!!" + "'", str1, "hhhh!hh!hh!hh!hh!hhh!!");
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4223");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih!!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4224");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray11 = new char[] { '4', 'a', '\000' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence5, charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihi!!!hi!!!hi!!!hi!!!hi!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4225");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-22), 59, 380);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 59");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4226");
        int[] intArray5 = new int[] { (-3), (byte) 100, (byte) 0, (-13), 84 };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-3, 100, 0, -13, 84]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4227");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hihhi!!!!!!!!!!!!hhi!!!!!!!!!!!!hhi!!!!!!!!!!!!hhi!!!!!!!!!!!!hhi!!!!!!!!!!!!hhi!!!!!!!!!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4228");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhih!!!!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4229");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hh", "hhhh!hh!hh!hh!hh!hhh!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4230");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hii!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray3);
        java.lang.CharSequence charSequence6 = null;
        char[] charArray12 = new char[] { '4', 'a', '\000' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence6, charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray12, (-13));
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int19, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4231");
        char[] charArray10 = new char[] { '4', 'a', '\000' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!hi!hi!hi!hi!hhi!!!!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihi!!!hi!!!hi!!!hi!!!hi!!!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, \000]");
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
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4232");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!!");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, 101);
        char[] charArray17 = new char[] { '4', 'a', '\000' };
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray17);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray17);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray17);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray17);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray17);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray17);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hih", charArray17);
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray17, 53);
        java.lang.Class<?> wildcardClass28 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4233");
        char[] charArray12 = new char[] { '4', 'a', '\000' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii!!!!", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!", charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4234");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(57, (-17), 101);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 101");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4235");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhi!!!!!!hi!!!!!!!!!hi!!!!!!!!!hi!!!!!!!!!hi!!!!!!!!!hi!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4236");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(39, 65, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 65");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4237");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-65), (-99), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4238");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhi!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhi!!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4239");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!!hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!!hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4240");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhih!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4241");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4242");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4243");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hi!", (int) (byte) -1);
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-100), (int) (short) 10);
        java.lang.Object obj8 = null;
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj8, (int) (byte) -1);
        char[] charArray20 = new char[] { '4', 'a', '\000' };
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray20);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray20);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray20);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray20);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray20);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray20);
        java.lang.Class<?> wildcardClass27 = charArray20.getClass();
        int int29 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) wildcardClass27, (-35));
        // The following exception was thrown during execution in test generation
        try {
            int int30 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) (-35));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4244");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4245");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4246");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhhi!!!!!!ihhi!!!!!!!!!i!i!!ih!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4247");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-25), 99, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 99");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4248");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4249");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hih!!!i!i!!i", (java.lang.CharSequence) "hihi!hi!hi!hi!hi!hhi!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4250");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hihhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 315 + "'", int1 == 315);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4251");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("h!!!!!!", "hih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h!!!!!!" + "'", str2, "h!!!!!!");
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4252");
        char[] charArray6 = new char[] { '4', 'a', '\000' };
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        java.lang.Class<?> wildcardClass11 = charArray6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4253");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(7, (-90), (-42));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4254");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hih");
        char[] charArray8 = new char[] { '4', 'a', '\000' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray8, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4255");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hihi!hi!hi!hi!hi!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihi!hi!hi!hi!hi!hhi!" + "'", str1, "hihi!hi!hi!hi!hi!hhi!");
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4256");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4257");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hii!!!!!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4258");
        char[] charArray7 = new char[] { '4', 'a', '\000' };
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray7);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!!!!", charArray7);
        java.lang.Class<?> wildcardClass14 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4259");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray10 = new char[] { '4', 'a', '\000' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence4, charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence1, charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii!!", charArray10);
        java.lang.Class<?> wildcardClass18 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4260");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hihii!!!hii!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4261");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("h!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h!!" + "'", str1, "h!!");
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4262");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4263");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hii!!i!i!!i!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4264");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4265");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hihi!hi!hi!hi!hi!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4266");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hihhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4267");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(24);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4268");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhhh!hh!hh!hh!hh!hhh!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4269");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray11 = new char[] { '4', 'a', '\000' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence5, charArray11);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihihii!!!hii!!!hii!!!hii!!!hii!!!hii!!!i!!!!!!hihii!!!hii!!!hii!!!hii!!!hii!!!hii!!!i!!!!!!hihii!!!hii!!!hii!!!hii!!!hii!!!hii!!!i!!!!!!hihii!!!hii!!!hii!!!hii!!!hii!!!hii!!!i!!!!!!hihii!!!hii!!!hii!!!hii!!!hii!!!hii!!!i!!!!!!hihii!!!hii!!!hii!!!hii!!!hii!!!hii!!!i!!!!!", charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4270");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hih!!!i!i!!i!", "hh", "hii!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hih!!!i!i!!i!" + "'", str3, "hih!!!i!i!!i!");
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4271");
        char[] charArray9 = new char[] { '4', 'a', '\000' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h!!!", charArray9);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhh", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4272");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hi!!!!", (java.lang.CharSequence) "hihhi!!!!!!!!!!!!hhi!!!!!!!!!!!!hhi!!!!!!!!!!!!hhi!!!!!!!!!!!!hhi!!!!!!!!!!!!hhi!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4273");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-19), 57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 57");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4274");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4275");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!", "hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih", "hih!!!i!i!!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!" + "'", str3, "hihhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!");
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4276");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hihi!hi!hi!hi!hi!hhi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4277");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhh");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4278");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hih!!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (byte) 100, (-100));
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hihi!hi!hi!hi!hi!hhi!!!!!", (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4279");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4280");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh", "hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!", "h!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh" + "'", str3, "hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh");
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4281");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhihihhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!hihhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!hihhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!hihhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!hihhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 739 + "'", int1 == 739);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4282");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4283");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-1), (-35), 65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4284");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhi!!!!!!hi!!!!!!!!!hi!!!!!!!!!hi!!!!!!!!!hi!!!!!!!!!hi!!!!!!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhi!!!!!!hi!!!!!!!!!hi!!!!!!!!!hi!!!!!!!!!hi!!!!!!!!!hi!!!!!!!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4285");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4286");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("", "hhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!!hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhh", "h!!!ih!!!!!!i!i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4287");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!!hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4288");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hihhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4289");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihii!!!hii!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihii!!!hii!!!" + "'", str1, "hihii!!!hii!!!");
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4290");
        java.lang.Object[] objArray0 = null;
        char[] charArray9 = new char[] { '\r', '\000', '\n', 'a', '\000', '\n' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray0, (java.lang.Object) charArray9, 11);
        java.lang.Class<?> wildcardClass14 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r\000\na\000\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r\000\na\000\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r, \000, \n, a, \000, \n]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4291");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hih!h!h!h!h!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4292");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhhi!!!!!!ihhi!!!!!!!!!i!i!!ih!!!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4293");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihi!!!hi!!!hi!!!hi!!!hi!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4294");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        int[] intArray5 = new int[] { (short) 0, '\000' };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean7, (-90));
        java.lang.Class<?> wildcardClass10 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4295");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-9), (-100), 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4296");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence3 = null;
        char[] charArray9 = new char[] { '4', 'a', '\000' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence3, charArray9);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!!!!!ihhi!!!!!!!!!i!i!!i", charArray9);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence0, charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4297");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4298");
        java.lang.Object[] objArray0 = null;
        char[] charArray9 = new char[] { '4', 'a', '\000' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray9);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!!!", charArray9);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray0, (java.lang.Object) charArray9, (-35));
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4299");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(10, 22, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4300");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!" + "'", str1, "hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!");
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4301");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4302");
        char[] charArray9 = new char[] { '4', 'a', '\000' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!!!!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h!!!!!", charArray9);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhih!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4303");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 1L, 84);
        java.lang.CharSequence charSequence6 = null;
        char[] charArray12 = new char[] { '4', 'a', '\000' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence6, charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "", 7);
        char[] charArray27 = new char[] { '4', 'a', '\000' };
        boolean boolean28 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray27);
        boolean boolean29 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray27);
        boolean boolean30 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray27);
        boolean boolean31 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!", charArray27);
        boolean boolean32 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hih!h!h!h!h", charArray27);
        int int34 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean32, 88);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4304");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-62), 53, (-13));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4305");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihi!!!hi!!!hi!!!hi!!!hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4306");
        char[] charArray7 = new char[] { '4', 'a', '\000' };
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hih!!!i!i!!", charArray7);
        java.lang.Class<?> wildcardClass14 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4307");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4308");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!!hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 261 + "'", int1 == 261);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4309");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray11 = new char[] { '4', 'a', '\000' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence5, charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray11);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hih!!!i!i!!", charArray11);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray11);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii!!i!i!!i!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4310");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhi!!!!!!hi!!!!!!!!!hi!!!!!!!!!hi!!!!!!!!!hi!!!!!!!!!hi!!!!!!!!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4311");
        int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(5, 5, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4312");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhihihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4313");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(0, 263, (-84));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 263");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4314");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhhh!hh!hh!hh!hh!hhh!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4315");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i" + "'", str1, "hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i");
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4316");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("h!!!ih!!!!!!i!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"h!!!ih!!!!!!i!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4317");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(10, 13, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4318");
        char[] charArray8 = new char[] { '4', 'a', '\000' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray8);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray8);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4319");
        char[] charArray7 = new char[] { '4', 'a', '\000' };
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a, \000]");
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
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4320");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4321");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(0, (-84), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -84");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4322");
        char[] charArray10 = new char[] { '4', 'a', '\000' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h!!!!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii!", charArray10);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!!!!!!ihhi!!!!!!!!!i!i!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4323");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hii!", "hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4324");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) '\r', (int) '\n');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4325");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!!!");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4326");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhi!!!!!!ihhi!!!!!!!!!i!i!!ih!!!!!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4327");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(0, 20, 88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 20");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4328");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhih!!!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhih!!!!!! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4329");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-22), 32, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4330");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!!hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4331");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hihi!hi!hi!hi!hi!hhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi!hi!hi!hi!hi!hhi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4332");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hihhi!!!!!!!!!!!!hhi!!!!!!!!!!!!hhi!!!!!!!!!!!!hhi!!!!!!!!!!!!hhi!!!!!!!!!!!!hhi!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4333");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hihi!hi!hi!hi!hi!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi!hi!hi!hi!hi!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4334");
        char[] charArray8 = new char[] { '4', 'a', '\000' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii!!!!!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4335");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhi!!!!!", (java.lang.CharSequence) "hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4336");
        char[] charArray13 = new char[] { '4', 'a', '\000' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!!!!!", charArray13);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!", charArray13);
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhh!", charArray13);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhih!!!!!", charArray13);
        java.lang.Class<?> wildcardClass26 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4337");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hihi!hi!hi!hi!hi!hhi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi!hi!hi!hi!hi!hhi!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4338");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!", (java.lang.CharSequence) "hh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4339");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("i", "hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4340");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) '#', (-99));
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.ArrayTasks.EMPTY_STRING_ARRAY;
        java.lang.Object[] objArray7 = new java.lang.Object[] { strArray5, (byte) 0 };
        java.lang.Object obj8 = null;
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, obj8, (-100));
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray5, 101);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[[], 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4341");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray9 = new char[] { '4', 'a', '\000' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence2, charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4342");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!!!!");
        char[] charArray8 = new char[] { '4', 'a', '\000' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray8);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean11, (int) '4');
        java.lang.CharSequence charSequence16 = null;
        char[] charArray22 = new char[] { '4', 'a', '\000' };
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray22);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray22);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence16, charArray22);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray22);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray22);
        int int29 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean27, 57);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4343");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhi!!!!!");
        char[] charArray9 = new char[] { '4', 'a', '\000' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean18, (int) (byte) 0);
        char[] charArray27 = new char[] { '4', 'a', '\000' };
        boolean boolean28 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray27);
        boolean boolean29 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray27);
        boolean boolean30 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray27);
        boolean boolean31 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray27);
        int int33 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray27, (-62));
        int int36 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hhihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi", 89);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4344");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray11 = new char[] { '4', 'a', '\000' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence5, charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray11);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!!", charArray11);
        java.lang.Class<?> wildcardClass23 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4345");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("h!!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4346");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4347");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(22, 17, (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4348");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(97, 31, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 31");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4349");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("");
        char[] charArray11 = new char[] { '4', 'a', '\000' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray11);
        java.lang.Class<?> wildcardClass18 = charArray11.getClass();
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) wildcardClass18, 42);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4350");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4351");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhh!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4352");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hii", "hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!", "hihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hii" + "'", str3, "hii");
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4353");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hihi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4354");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhh!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4355");
        char[] charArray11 = new char[] { '4', 'a', '\000' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhh", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hiii", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhih!!!!!!", charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4356");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(315);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4357");
        char[] charArray10 = new char[] { '4', 'a', '\000' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii!!!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii!!i!i!!i", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4358");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hih!!");
        char[] charArray15 = new char[] { '4', 'a', '\000' };
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray15);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray15);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!!!!!", charArray15);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!", charArray15);
        boolean boolean25 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhh!", charArray15);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhih!!!!!", charArray15);
        int int29 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean27, 5);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, a, \000]");
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4359");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi", "hii!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4360");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hih!h!h!h!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hih!h!h!h! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4361");
        char[] charArray8 = new char[] { '4', 'a', '\000' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray8);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!hi!hi!hi!hi!hhi!!!!!", charArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hihi!hi!hi!hi!hi!hhi!!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4362");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "h!!!!", (java.lang.CharSequence) "hhihihhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!hihhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!hihhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!hihhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!hihhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!h!!!h!!!h!!!h!!!h!!!hhih!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4363");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(39, 263, 84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 84");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4364");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hii!!!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hii!!!!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4365");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hihi!hi!hi!hi!hi!hhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4366");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhi!!!!!", "hhih!!!!!!", "hii!!!!!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhi!!!!!" + "'", str3, "hhi!!!!!");
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4367");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(0, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4368");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hii!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hii!!!");
        char[] charArray13 = new char[] { '4', 'a', '\000' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihi!hi!hi!hi!hi!hhi!!!", charArray13);
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray13, (-17));
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-17), 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4369");
        char[] charArray6 = new char[] { '4', 'a', '\000' };
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!!!!!!", charArray6);
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4370");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hihi!hi!hi!hi!hi!hhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4371");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) '4', (int) (byte) 1, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: DAY_OF_MONTH out of range: 99");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4372");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhihi!!!hi!!!hi!!!hi!!!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4373");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hii!!!!!!", "hhihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!", "hhihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hii!!!!!!" + "'", str3, "hii!!!!!!");
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4374");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray12 = new char[] { '4', 'a', '\000' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence6, charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!", charArray12);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hih", charArray12);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4375");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence7 = null;
        char[] charArray13 = new char[] { '4', 'a', '\000' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence7, charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray13);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h!!!!", charArray13);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!", charArray13);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence0, charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4376");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hihhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4377");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!!hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4378");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hii!!i!i!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hii!!i!i!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4379");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4380");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!!hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!!hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhi" + "'", str1, "hhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!!hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhi");
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4381");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihihii!!!hii!!!hii!!!hii!!!hii!!!hii!!!i!!!!!!hihii!!!hii!!!hii!!!hii!!!hii!!!hii!!!i!!!!!!hihii!!!hii!!!hii!!!hii!!!hii!!!hii!!!i!!!!!!hihii!!!hii!!!hii!!!hii!!!hii!!!hii!!!i!!!!!!hihii!!!hii!!!hii!!!hii!!!hii!!!hii!!!i!!!!!!hihii!!!hii!!!hii!!!hii!!!hii!!!hii!!!i!!!!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4382");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hii!!i!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi");
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, (-52));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4383");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "h!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4384");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (byte) -1, (-35), (-19));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -19");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4385");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(739, (-17), 55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 55");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4386");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihhi!!!!!!!!!!!!hhi!!!!!!!!!!!!hhi!!!!!!!!!!!!hhi!!!!!!!!!!!!hhi!!!!!!!!!!!!hhi!!!!!!!!!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4387");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhihihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4388");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("h!!!ih!!!!!!i!i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"h!!!ih!!!!!!i!i!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4389");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!!hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4390");
        char[] charArray6 = new char[] { '4', 'a', '\000' };
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray6);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4391");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihi!!!hi!!!hi!!!hi!!!hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4392");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(5, (-9), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4393");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("h!!!ih!!!!!!i!i!", "hihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h!!!ih!!!!!!i!i!" + "'", str3, "h!!!ih!!!!!!i!i!");
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4394");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("h!!!ih!!!!!!i!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4395");
        int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-999999999), 8, 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4396");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4397");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hii!!i!i!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4398");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4399");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hihihii!!!hii!!!hii!!!hii!!!hii!!!hii!!!i!!!!!!hihii!!!hii!!!hii!!!hii!!!hii!!!hii!!!i!!!!!!hihii!!!hii!!!hii!!!hii!!!hii!!!hii!!!i!!!!!!hihii!!!hii!!!hii!!!hii!!!hii!!!hii!!!i!!!!!!hihii!!!hii!!!hii!!!hii!!!hii!!!hii!!!i!!!!!!hihii!!!hii!!!hii!!!hii!!!hii!!!hii!!!i!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4400");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hih!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4401");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!");
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) "hi!", (int) (byte) -1);
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, 17);
        java.lang.Object obj9 = null;
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, obj9, 99);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) 4, 88);
        java.lang.CharSequence charSequence17 = null;
        char[] charArray27 = new char[] { '4', 'a', '\000' };
        boolean boolean28 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray27);
        boolean boolean29 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray27);
        boolean boolean30 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray27);
        boolean boolean31 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray27);
        boolean boolean32 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray27);
        boolean boolean33 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray27);
        boolean boolean34 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii!!!!", charArray27);
        boolean boolean35 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray27);
        boolean boolean36 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence17, charArray27);
        boolean boolean37 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhih!!!!!", charArray27);
        boolean boolean38 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihi!hi!hi!hi!hi!hhi!!!", charArray27);
        int int40 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) boolean38, 379);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4402");
        char[] charArray7 = new char[] { '4', 'a', '\000' };
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4403");
        int[] intArray4 = new int[] { 52, 101, 25, (-100) };
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) intArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 101, 25, -100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4404");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4405");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h!!!!");
        char[] charArray10 = new char[] { '4', 'a', '\000' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray10);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hih!", charArray10);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean19, 6);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4406");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray11 = new char[] { '4', 'a', '\000' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence5, charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!!hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhh", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4407");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(314, 55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 55");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4408");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4409");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("h!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4410");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hihi!hi!hi!hi!hi!h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4411");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray7 = new char[] { '4', 'a', '\000' };
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence0, charArray7);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4412");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray8 = new char[] { '4', 'a', '\000' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence2, charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi", charArray8);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4413");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!" + "'", str1, "hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!");
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4414");
        int[] intArray4 = new int[] { '\000', 0, (short) 10, (short) -1 };
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
        java.lang.Class<?> wildcardClass15 = intArray4.getClass();
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 10, -1]");
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
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4415");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(58);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4416");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
        char[] charArray8 = new char[] { '4', 'a', '\000' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray8);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray8, (-10));
        char[] charArray20 = new char[] { '4', 'a', '\000' };
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray20);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray20);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray20);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray20);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!!", charArray20);
        boolean boolean26 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray20);
        int int28 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean26, 30);
        java.lang.String[] strArray30 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int32 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hi!", (-20));
        int[] intArray37 = new int[] { (short) 100, '#', (byte) 1, (short) -1 };
        boolean boolean38 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray37);
        int int40 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) intArray37, 23);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[100, 35, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4417");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray10 = new char[] { '4', 'a', '\000' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence2, charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h!!!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4418");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihi!!!hi!!!hi!!!hi!!!hi!!!");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhi!!!!!!ihhi!!!!!!!!!i!i!!i");
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) 1.0f, 19);
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, 91);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4419");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hii!!i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4420");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hihi!hi!hi!hi!hi!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihi!hi!hi!hi!hi!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4421");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(7, (-22), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4422");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4423");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("h", "hiii", "h!!!!!h!h!h!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4424");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhh!", "hhi!!!!!!ihhi!!!!!!!!!i!i!!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4425");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhihihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhihihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhh is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4426");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray10 = new char[] { '4', 'a', '\000' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence4, charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii!!", charArray10);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h!!", charArray10);
        java.lang.Class<?> wildcardClass21 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4427");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4428");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(0, (-62), 263);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 263");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4429");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(13, 89, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 89");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4430");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(29, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4431");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4432");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhh!hh!hh!hh!hh!hhh!!!!", (java.lang.CharSequence) "hii!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4433");
        char[] charArray8 = new char[] { '4', 'a', '\000' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray8);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray8);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4434");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!!!!");
        int[] intArray4 = new int[] { (short) 0, '\000' };
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray4);
        java.lang.Class<?> wildcardClass8 = intArray4.getClass();
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) intArray4, 99);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4435");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(379, 99, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 99");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4436");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-100), (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4437");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4438");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray9 = new char[] { '4', 'a', '\000' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence3, charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray9);
        java.lang.Class<?> wildcardClass17 = charArray9.getClass();
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4439");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!!!!" + "'", str1, "hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!!!!");
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4440");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray9 = new char[] { '4', 'a', '\000' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence3, charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii!!i!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4441");
        char[] charArray8 = new char[] { '4', 'a', '\000' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hih!!!i!i!!i!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4442");
        int[] intArray2 = new int[] { 13, '\000' };
        boolean boolean3 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray2);
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray2);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray2);
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) intArray2);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[13, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4443");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!" + "'", str1, "hihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!");
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4444");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray8 = new char[] { '4', 'a', '\000' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence2, charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4445");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4446");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!!hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!!hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4447");
        char[] charArray10 = new char[] { '4', 'a', '\000' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!!!!!", charArray10);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hii!!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4448");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4449");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) '#', (-99));
        java.lang.Class<?> wildcardClass5 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4450");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(22, (int) (short) 1, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4451");
        char[] charArray8 = new char[] { '4', 'a', '\000' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!!!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4452");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "h!!!!!h!h!h!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4453");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih!", "!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih" + "'", str2, "hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih");
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4454");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4455");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(0, 380, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4456");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hii!!");
        char[] charArray10 = new char[] { '4', 'a', '\000' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!!", charArray10);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray10, (-1));
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!", charArray10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4457");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhi!!!!!!ihhi!!!!!!!!!i!i!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhi!!!!!!ihhi!!!!!!!!!i!i!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4458");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray8 = new char[] { '4', 'a', '\000' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence2, charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4459");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray11 = new char[] { '4', 'a', '\000' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence5, charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!!!!!!hi!!!!!!!!!hi!!!!!!!!!hi!!!!!!!!!hi!!!!!!!!!hi!!!!!!!!!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4460");
        char[] charArray9 = new char[] { '4', 'a', '\000' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!", charArray9);
        java.lang.Class<?> wildcardClass17 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4461");
        char[] charArray7 = new char[] { '4', 'a', '\000' };
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray7);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray7);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray7);
        java.lang.Class<?> wildcardClass13 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4462");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4463");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hihii!!!hii!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4464");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "h!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4465");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!!!!" + "'", str1, "hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!!!!");
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4466");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih!!!", "h!!!ih!!!!!!i!i!", "h!!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih!!!" + "'", str3, "hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih!!!");
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4467");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("h");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hi!!!!", 12);
        java.lang.Object obj5 = null;
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj5, 100);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4468");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
        char[] charArray9 = new char[] { '4', 'a', '\000' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray9);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray9, 1);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        java.lang.String[] strArray18 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!");
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray18, (java.lang.Object) '#', (-99));
        char[] charArray30 = new char[] { '4', 'a', '\000' };
        boolean boolean31 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray30);
        boolean boolean32 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray30);
        boolean boolean33 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray30);
        int int34 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray30);
        boolean boolean35 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray30);
        boolean boolean36 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray30);
        boolean boolean37 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray30);
        int int39 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray18, (java.lang.Object) boolean37, (int) (byte) -1);
        java.lang.String[] strArray41 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hih!!");
        int int43 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray18, (java.lang.Object) strArray41, 9);
        int int45 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int43, 4);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4469");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4470");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals(charSequence0, (java.lang.CharSequence) "hhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!!hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4471");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-101), (-39), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4472");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4473");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!");
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) "hi!", (int) (byte) -1);
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) (-100), (int) (short) 10);
        java.lang.Object obj10 = null;
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, obj10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = strArray3.getClass();
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray3, (-45));
        java.lang.Class<?> wildcardClass16 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4474");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhi!!!!!!ihhi!!!!!!!!!i!i!!ihhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!i!hhi!!!!!!ihhi!!!!!!!!!i!i!!ih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4475");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hih!");
        int[] intArray2 = new int[] {};
        boolean boolean3 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray2);
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray2);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray2);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray2);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray2);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray2);
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) intArray2, 62);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4476");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (short) 10, (-62), (-25));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4477");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(10, (int) '\r', (-42));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4478");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hihhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hihhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhihhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!!hhi!!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4479");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 262 + "'", int1 == 262);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4480");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "h!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4481");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4482");
        char[] charArray8 = new char[] { '4', 'a', '\000' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray8);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4483");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!!hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4484");
        comp5111.assignment.cut.Subject.GregorianTasks.checkDate(999999999, 9, 5);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4485");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!!");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hi!!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4486");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(42, 261, (-32));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4487");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi!!");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray11 = new char[] { '4', 'a', '\000' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence5, charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!!!", charArray11);
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray11, (-11));
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h!!!!", charArray11);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4488");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhh!!hihhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhhihhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4489");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hih!h!h!h!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4490");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hih!!", (java.lang.CharSequence) "!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4491");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4492");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(204, 29, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 29");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4493");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhhh!hh!hh!hh!hh!hhh!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hh!hh!hh!hh!hhh!!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4494");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hihihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!!!!!hihhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!hhi!!!!!!i!!! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4495");
        char[] charArray8 = new char[] { '4', 'a', '\000' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!!", charArray8);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4496");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("h!!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"h!!!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4497");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.ArrayTasks.EMPTY_STRING_ARRAY;
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) "hii!!!", 17);
        java.lang.CharSequence charSequence7 = null;
        java.lang.CharSequence charSequence10 = null;
        char[] charArray16 = new char[] { '4', 'a', '\000' };
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray16);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence10, charArray16);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray16);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray16);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence7, charArray16);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii!", charArray16);
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray16, 55);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hih!!!i!i!!i", charArray16);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hiii", charArray16);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hiii");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4498");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "i!", (java.lang.CharSequence) "hih!!!i!i!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4499");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray11 = new char[] { '4', 'a', '\000' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence5, charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hiii", charArray11);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        java.lang.Class<?> wildcardClass22 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test4500");
        char[] charArray8 = new char[] { '4', 'a', '\000' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!!!!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hii", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, \000]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }
}

