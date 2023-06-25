package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest09 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4501");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(0, 189, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4502");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4503");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4504");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh", "hh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hh!!!hh!!!ihh!!!hh!!!i!hh!!!hhi" + "'", str3, "hh!!!hh!!!ihh!!!hh!!!i!hh!!!hhi");
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4505");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4506");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i!", charArray11);
        java.lang.Class<?> wildcardClass19 = charArray11.getClass();
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray11, 6);
        char[] charArray31 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean32 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray31);
        boolean boolean33 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray31);
        boolean boolean34 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray31);
        boolean boolean35 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray31);
        int int36 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray31);
        int int38 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray31, 99);
        org.junit.Assert.assertNotNull(strArray1);
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
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4507");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4508");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhih\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4509");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4510");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(113, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4511");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-62), 48, 111);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 111");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4512");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("", "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4513");
        char[] charArray12 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi!", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!hhhh!hhh!hhhh!h!hh!hh", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4514");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(161, 46, (-999999999));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -999999999");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4515");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi", "hhihhi!hhii!hhihhi!hh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4516");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(502);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4517");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhih is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4518");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4519");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 42 + "'", int1 == 42);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4520");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4521");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(43, (int) '4', 108);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 108");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4522");
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
        boolean boolean47 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray39);
        boolean boolean48 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray39);
        boolean boolean49 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh", charArray39);
        boolean boolean50 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray39);
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4523");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hh!hhhh!hhh!hhhh!h!hh!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4524");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!", (java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4525");
        char[] charArray8 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh", charArray8);
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
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4526");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 62, (-25));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4527");
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj5 = null;
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, obj5, (int) '\n');
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray18 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray18);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray18);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) charArray18, 100);
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray18);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "!", charArray18);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi", charArray18);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4528");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihhi!hh", "hh!hhhh!hhh!hhhh!h!hh!hhih", "hh!hhhh!hhh!hhhh!h!hh!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihhi!hh" + "'", str3, "hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihhi!hh");
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4529");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4530");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhih");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 42 + "'", int1 == 42);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4531");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(51);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4532");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(13, 52, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4533");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4534");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4535");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!" + "'", str2, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!");
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4536");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hh!!!hh!!!ihh!!!hh!!!i!hh!!!hhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hh!!!hh!!!ihh!!!hh!!!i!hh!!!hhi is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4537");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4538");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!");
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi", charArray12);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean18, (int) 'a');
        org.junit.Assert.assertNotNull(strArray1);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4539");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi");
        char[] charArray5 = new char[] {};
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray5);
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh!hhhh!hhh!hhhh!h!hh!hhh", charArray5);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray5, 65);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4540");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) "hi!", (int) (short) 1);
        char[] charArray15 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray15);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray15);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray15);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray15);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray15);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) "hi!", (int) (byte) 10);
        java.lang.Object obj23 = null;
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, obj23, 62);
        char[] charArray35 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean36 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray35);
        boolean boolean37 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray35);
        boolean boolean38 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray35);
        boolean boolean39 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray35);
        boolean boolean40 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray35);
        int int42 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray35, (-1));
        int int43 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray35);
        boolean boolean44 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence0, charArray35);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 5 + "'", int43 == 5);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4541");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhhh" + "'", str1, "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhhh");
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4542");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) '4', (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4543");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 121 + "'", int1 == 121);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4544");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhihhi!hh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hh!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4545");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(10, 189, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4546");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhihhi!hhii!hhihhi!hhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4547");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi", "hh!hhhh!hhh!hhhh!h!hh!hhih", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi" + "'", str3, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi");
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4548");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4549");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 187 + "'", int1 == 187);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4550");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4551");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hh!hhhh!hhh!hhhh!h!hh!hhhhh", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhh", "hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hh!hhhh!hhh!hhhh!h!hh!hhhhh" + "'", str3, "hh!hhhh!hhh!hhhh!h!hh!hhhhh");
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4552");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4553");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4554");
        char[] charArray12 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!!", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh", charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h", charArray12);
        java.lang.Class<?> wildcardClass22 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4555");
        char[] charArray9 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4556");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(110, 54, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 54");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4557");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4558");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi", "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4559");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihh" + "'", str1, "hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihh");
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4560");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hh!hhhh!hhh!hhhh!h!hh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4561");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(13, 504, 109);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 109");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4562");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hh", "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4563");
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4564");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4565");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray13 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!!", charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh", charArray13);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h", charArray13);
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence0, charArray13);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4566");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hi!", "i!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4567");
        char[] charArray11 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!!", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray11);
        java.lang.Class<?> wildcardClass20 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4568");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hh!hhhh!hhh!hhhh!h!hh!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4569");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi");
        comp5111.assignment.cut.Subject.FilenameTasks filenameTasks2 = new comp5111.assignment.cut.Subject.FilenameTasks();
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) filenameTasks2, 2);
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.ArrayTasks.EMPTY_STRING_ARRAY;
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray5, (int) (short) -1);
        java.lang.Object obj8 = null;
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj8, (-19));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4570");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhh");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4571");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4572");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4573");
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
        boolean boolean25 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh!", charArray18);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!", charArray18);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4574");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) 'a', 65, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 65");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4575");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihh" + "'", str1, "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihh");
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4576");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj3 = null;
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, obj3, (int) '\n');
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray16 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray16);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray16);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray16, 100);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray16);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray16);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!", charArray16);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray16);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4577");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray8 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence1, charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4578");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4579");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4580");
        char[] charArray7 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray7);
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray7);
        java.lang.Class<?> wildcardClass10 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4581");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhih" + "'", str1, "hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhih");
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4582");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhi", "hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4583");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhh" + "'", str1, "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhh");
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4584");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4585");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(20, (-25), 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4586");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4587");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4588");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh" + "'", str1, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4589");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4590");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi", "hhi!!", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi" + "'", str3, "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi");
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4591");
        char[] charArray8 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi", charArray8);
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
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4592");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4593");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4594");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(189, (-19));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -19");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4595");
        char[] charArray11 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihh", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4596");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4597");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi", (java.lang.CharSequence) "hhihhi!hhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4598");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4599");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4600");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hh!hhhh!hhh!hhhh!h!hh!hhh");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray11);
        java.lang.Class<?> wildcardClass18 = charArray11.getClass();
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray11, 35);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray11);
        org.junit.Assert.assertNotNull(strArray1);
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
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4601");
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh", charArray12);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4602");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4603");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4604");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4605");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4606");
        char[] charArray11 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4607");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi");
        char[] charArray9 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray9, (int) (short) 1);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hh", charArray9);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4608");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihh", "ii", "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihh" + "'", str3, "hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihh");
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4609");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4610");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4611");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 106 + "'", int1 == 106);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4612");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4613");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals(charSequence0, (java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4614");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4615");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(81, 110);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 110");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4616");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4617");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4618");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("", "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh", "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4619");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4620");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4621");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4622");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 45 + "'", int1 == 45);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4623");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4624");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4625");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh", (java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4626");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4627");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean15, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4628");
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
        boolean boolean48 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray38);
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4629");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4630");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4631");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        java.lang.Class<?> wildcardClass17 = charArray10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4632");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi", "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4633");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4634");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihhi!hh", "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh", "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihhi!hh" + "'", str3, "hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihhi!hh");
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4635");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hh!!!hh!!!ihh!!!hh!!!i!hh!!!hhi", "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4636");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("ii");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4637");
        char[] charArray8 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4638");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4639");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4640");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi", "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4641");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(49, (-25), (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4642");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hhh");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray16 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray16);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray16);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray16);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray16);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence4, charArray16);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray16);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi", charArray16);
        int int27 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray16, (int) (short) 1);
        boolean boolean28 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhh", charArray16);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4643");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(99, 502, 43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 502");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4644");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hh!hhhh!hhh!hhhh!h!hh!hhih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4645");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4646");
        char[] charArray13 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i!", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh", charArray13);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi", charArray13);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4647");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hh!hhhh!hhh!hhhh!h!hh!hhih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hh!hhhh!hhh!hhhh!h!hh!hhih" + "'", str1, "hh!hhhh!hhh!hhhh!h!hh!hhih");
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4648");
        char[] charArray11 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4649");
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhi!!");
        char[] charArray14 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray14);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray14);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray14);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray5, (java.lang.Object) charArray14, (-13));
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh", charArray14);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hh!", charArray14);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh", charArray14);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh", charArray14);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4650");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(97, (-65));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -65");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4651");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi", "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi" + "'", str3, "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi");
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4652");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihh is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4653");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4654");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(58, 84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 84");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4655");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4656");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhi!!");
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray12);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray12, (-13));
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh", charArray12);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!!", charArray12);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4657");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhii!hhihhi!hh", "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhii!hhihhi!hh" + "'", str3, "hhihhi!hhii!hhihhi!hh");
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4658");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4659");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4660");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4661");
        int[] intArray6 = new int[] { 3, (short) 10, '\n', (-65), 39, 29 };
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray6);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray6);
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[3, 10, 10, -65, 39, 29]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4662");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhii!hhihhi!hh", (java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4663");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4664");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h", charArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4665");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4666");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh" + "'", str1, "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh");
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4667");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hh!!!hh!!!ihh!!!hh!!!i!hh!!!hhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4668");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4669");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray10);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4670");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
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
        int int46 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean44, (int) (short) 1);
        java.lang.String[] strArray49 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj50 = null;
        int int52 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray49, obj50, (int) '\n');
        int int55 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray49, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray63 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean64 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray63);
        boolean boolean65 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray63);
        int int67 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray49, (java.lang.Object) charArray63, 100);
        boolean boolean68 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray63);
        int int69 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray63);
        boolean boolean70 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!", charArray63);
        int int72 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray63, 4);
        char[] charArray84 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean85 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray84);
        boolean boolean86 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray84);
        boolean boolean87 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray84);
        boolean boolean88 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray84);
        boolean boolean89 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray84);
        boolean boolean90 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "!", charArray84);
        boolean boolean91 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi", charArray84);
        boolean boolean92 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray84);
        boolean boolean93 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray84);
        int int94 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray84);
        boolean boolean95 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!hhhh!hhh!hhhh!h!hh!hhhhh", charArray84);
        int int97 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean95, 0);
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray63), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray63), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray63), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 5 + "'", int69 == 5);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(charArray84);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray84), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray84), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray84), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 5 + "'", int94 == 5);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4671");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-39), 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4672");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4673");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray4, (-20));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4674");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4675");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(87, 106, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4676");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhih");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4677");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhih\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4678");
        int[] intArray1 = new int[] { 3 };
        boolean boolean2 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray1);
        boolean boolean3 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray1);
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray1);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray1);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray1);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray1);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[3]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4679");
        char[] charArray9 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        java.lang.Class<?> wildcardClass14 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4680");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4681");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("i", "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhh", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i" + "'", str3, "i");
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4682");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4683");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh");
        char[] charArray10 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray10, 47);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4684");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!", "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!" + "'", str2, "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!");
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4685");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4686");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-90), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4687");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihhi!hh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4688");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!h" + "'", str1, "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!h");
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4689");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(8, 109, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 109");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4690");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) boolean16, (int) (short) -1);
        comp5111.assignment.cut.Subject.GregorianTasks gregorianTasks19 = new comp5111.assignment.cut.Subject.GregorianTasks();
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) gregorianTasks19, (-97));
        char[] charArray34 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean35 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray34);
        boolean boolean36 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray34);
        boolean boolean37 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray34);
        boolean boolean38 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray34);
        boolean boolean39 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!", charArray34);
        boolean boolean40 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray34);
        boolean boolean41 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!", charArray34);
        int int43 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray34, (-9));
        boolean boolean44 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh", charArray34);
        boolean boolean45 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray34);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4691");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("!");
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray12, 4);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        org.junit.Assert.assertNotNull(strArray1);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4692");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4693");
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!", charArray12);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4694");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4695");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhihhi!hhii!hhihhi!hhi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4696");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (short) 1, 46, (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4697");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhi!!", (java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4698");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(87, 503, 999999999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 999999999");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4699");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray12 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence2, charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hh", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4700");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hh!hhhh!hhh!hhhh!h!hh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4701");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(11, 0, (-39));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4702");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray14 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray14);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray14);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence4, charArray14);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray14);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi", charArray14);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi", charArray14);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi", charArray14);
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray14);
        boolean boolean25 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean26 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4703");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4704");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 1.0f, 3);
        int[] intArray9 = new int[] { '\n', 13, '4', 0 };
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray9);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) intArray9, 2);
        char[] charArray24 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray24);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray24);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray24);
        boolean boolean28 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray24);
        boolean boolean29 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhi", charArray24);
        int int31 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhi", 109);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 13, 52, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4705");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hh!hhhh!hhh!hhhh!h!hh!hh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4706");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi", "hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i", "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi" + "'", str3, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi");
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4707");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4708");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(0, (-87), 84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -87");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4709");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4710");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(47, (-22), (-999999999));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4711");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(188, 46, 25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 46");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4712");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh" + "'", str1, "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh");
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4713");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-2), 39, 43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 43");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4714");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(78, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4715");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(188, 110, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 110");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4716");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4717");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) 'a', 0);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj8 = null;
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, obj8, (int) '\n');
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray21 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray21);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray21);
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, (java.lang.Object) charArray21, 100);
        java.lang.Object[] objArray27 = new java.lang.Object[] { 0 };
        int int30 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray27, (java.lang.Object) (byte) 10, (int) (byte) -1);
        int int32 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, (java.lang.Object) objArray27, (int) (byte) 100);
        char[] charArray41 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean42 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray41);
        boolean boolean43 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray41);
        boolean boolean44 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray41);
        int int46 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, (java.lang.Object) charArray41, 101);
        int int48 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) strArray7, (int) (byte) 100);
        java.lang.String[] strArray50 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!");
        java.lang.String[] strArray52 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
        java.lang.Object[] objArray53 = null;
        comp5111.assignment.cut.Subject.StringTasks stringTasks54 = new comp5111.assignment.cut.Subject.StringTasks();
        int int56 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray53, (java.lang.Object) stringTasks54, (int) '\n');
        int int58 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray52, (java.lang.Object) stringTasks54, 22);
        int int60 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray50, (java.lang.Object) stringTasks54, 65);
        int int62 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, (java.lang.Object) 65, 90);
        java.lang.String[] strArray64 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi");
        int int66 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray7, (java.lang.Object) strArray64, 2);
        java.lang.String[] strArray69 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj70 = null;
        int int72 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray69, obj70, (int) '\n');
        int int75 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray69, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray83 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean84 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray83);
        boolean boolean85 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray83);
        int int87 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray69, (java.lang.Object) charArray83, 100);
        boolean boolean88 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray83);
        boolean boolean89 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray83);
        int int91 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray64, (java.lang.Object) charArray83, (-100));
        boolean boolean92 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray83);
        boolean boolean93 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi", charArray83);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(charArray83);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray83), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray83), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray83), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4718");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4719");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4720");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4721");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "ii", (java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4722");
        char[] charArray8 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        java.lang.Class<?> wildcardClass12 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4723");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(100, (-10), 51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 51");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4724");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hh" + "'", str1, "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hh");
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4725");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(410, 190);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 190");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4726");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-22), (-10), 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4727");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhihhi!hhii!hhihhi!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4728");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhi" + "'", str1, "hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhi");
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4729");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4730");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4731");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi", (java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4732");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4733");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4734");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest09.test4735");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhh" + "'", str1, "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhh");
    }
}

