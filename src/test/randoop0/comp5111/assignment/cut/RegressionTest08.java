package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest08 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4001");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(97, 410, 101);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 410");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4002");
        char[] charArray8 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h", charArray8);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4003");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh" + "'", str2, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4004");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4005");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4006");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4007");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray10 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence0, charArray10);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4008");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhi");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        java.lang.Object[] objArray20 = new java.lang.Object[] { boolean19 };
        char[] charArray29 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean30 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray29);
        boolean boolean31 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray29);
        boolean boolean32 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray29);
        boolean boolean33 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray29);
        boolean boolean34 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray29);
        java.lang.Class<?> wildcardClass35 = charArray29.getClass();
        int int37 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray20, (java.lang.Object) wildcardClass35, (-20));
        int int39 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) objArray20, 26);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[true]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4009");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hh", "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hh" + "'", str3, "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hh");
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4010");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhh" + "'", str1, "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhh");
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4011");
        comp5111.assignment.cut.Subject.GregorianTasks.checkDate(83, 5, 10);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4012");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!", "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4013");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4014");
        char[] charArray14 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray14);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray14);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray14);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray14);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi", charArray14);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi", charArray14);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i", charArray14);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi!", charArray14);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray14);
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray14);
        java.lang.Class<?> wildcardClass27 = charArray14.getClass();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4015");
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
        java.lang.String[] strArray36 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!");
        java.lang.String[] strArray38 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj39 = null;
        int int41 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray38, obj39, (int) '\n');
        int int44 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray38, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray52 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean53 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray52);
        boolean boolean54 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray52);
        int int56 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray38, (java.lang.Object) charArray52, 100);
        boolean boolean57 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray52);
        int int58 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray52);
        boolean boolean59 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray52);
        int int61 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray36, (java.lang.Object) charArray52, (-62));
        char[] charArray64 = new char[] {};
        boolean boolean65 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray64);
        boolean boolean66 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray64);
        int int67 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray64);
        boolean boolean68 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray64);
        int int70 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray36, (java.lang.Object) charArray64, 30);
        int int72 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray64, 90);
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
        org.junit.Assert.assertNotNull(strArray36);
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
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 5 + "'", int58 == 5);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray64), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray64), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray64), "[]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4016");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi!", (java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4017");
        char[] charArray11 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi!", charArray11);
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
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4018");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4019");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4020");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (byte) 10, 84, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 84");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4021");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(51, 109, 149);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 109");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4022");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4023");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhihhi!hhii!hhihhi!hhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi!hhii!hhihhi!hh" + "'", str1, "hhihhi!hhii!hhihhi!hh");
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4024");
        char[] charArray0 = new char[] {};
        boolean boolean1 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray0);
        boolean boolean2 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray0);
        boolean boolean3 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray0);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4025");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4026");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi", (java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4027");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(80, (int) (short) -1, 82);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4028");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(410, 109, (-97));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 109");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4029");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4030");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhih" + "'", str1, "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhih");
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4031");
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
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray13);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4032");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh!", "hh!hhhh!hhh!hhhh!h!hh!hhhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!" + "'", str3, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!");
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4033");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih" + "'", str1, "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih");
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4034");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhh" + "'", str1, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhh");
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4035");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(48, (-52), 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4036");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhih" + "'", str1, "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhih");
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4037");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray13 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i!", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh", charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence1, charArray13);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi", charArray13);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4038");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4039");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhihhi!hhii!hhihhi!hhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi!hhii!hhihhi!hhi" + "'", str1, "hhihhi!hhii!hhihhi!hhi");
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4040");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4041");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4042");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihh is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4043");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihh" + "'", str1, "hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihh");
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4044");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi", (java.lang.CharSequence) "hhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4045");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4046");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4047");
        java.lang.Object[] objArray0 = null;
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hh");
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) strArray4, (-99));
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray0, (java.lang.Object) strArray4, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4048");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihh", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4049");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4050");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4051");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihh" + "'", str3, "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihh");
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4052");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4053");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) 10, (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -101");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4054");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4055");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i", (java.lang.CharSequence) "hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4056");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean15);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4057");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(112, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4058");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!", (java.lang.CharSequence) "hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4059");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4060");
        char[] charArray9 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4061");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhi!!", "hh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!!" + "'", str2, "hhi!!");
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4062");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4063");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(41, (-25), 109);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 109");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4064");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4065");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4066");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!", charArray11);
        java.lang.Class<?> wildcardClass18 = charArray11.getClass();
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray11);
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
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4067");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4068");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 501 + "'", int1 == 501);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4069");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!" + "'", str1, "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!");
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4070");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) 1.0f, 3);
        java.lang.Object obj8 = null;
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, obj8, 2);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 2, 17);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4071");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h", "hhihhi!hhii!hhihhi!hhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4072");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("!");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4073");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4074");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhih" + "'", str1, "hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhih");
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4075");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("h");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hi!", (-25));
        java.lang.CharSequence charSequence20 = null;
        char[] charArray30 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean31 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray30);
        boolean boolean32 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray30);
        boolean boolean33 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray30);
        boolean boolean34 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray30);
        boolean boolean35 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence20, charArray30);
        boolean boolean36 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray30);
        boolean boolean37 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray30);
        boolean boolean38 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih", charArray30);
        int int40 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih", (-99));
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4076");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4077");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi", (java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4078");
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
        boolean boolean47 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray38);
        boolean boolean48 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi", charArray38);
        java.lang.Class<?> wildcardClass49 = charArray38.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4079");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(6, (-65));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -65");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4080");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4081");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhih");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4082");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4083");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "h");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4084");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!", charArray11);
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
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4085");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhi!hh");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray13 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence6, charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhi", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray13, 83);
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
        java.lang.String[] strArray50 = comp5111.assignment.cut.Subject.ArrayTasks.EMPTY_STRING_ARRAY;
        comp5111.assignment.cut.Subject.BooleanTasks booleanTasks51 = new comp5111.assignment.cut.Subject.BooleanTasks();
        int int53 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray50, (java.lang.Object) booleanTasks51, (int) (byte) -1);
        int int55 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray24, (java.lang.Object) (byte) -1, 65);
        java.lang.Class<?> wildcardClass56 = strArray24.getClass();
        int int58 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) wildcardClass56, 1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
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
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4086");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (short) 10, 65, 409);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 409");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4087");
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        java.lang.Class<?> wildcardClass20 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4088");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhii!hhihhi!hh", "i!", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhh" + "'", str3, "hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhh");
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4089");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4090");
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        java.lang.Class<?> wildcardClass23 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4091");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray7 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence0, charArray7);
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charSequence0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4092");
        java.lang.Object[] objArray0 = null;
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hi");
        comp5111.assignment.cut.Subject.FilenameTasks filenameTasks3 = new comp5111.assignment.cut.Subject.FilenameTasks();
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) filenameTasks3, 2);
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray0, (java.lang.Object) int5, (-99));
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4093");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihh is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4094");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) 1.0f, 3);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int10 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) strArray8, 0);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray8, (java.lang.Object) "!", (-9));
        java.lang.Object obj14 = null;
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray8, obj14, 39);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int16, (-25));
        java.lang.Class<?> wildcardClass19 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4095");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-25), 40, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 40");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4096");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) 1.0f, 3);
        int[] intArray11 = new int[] { (byte) -1, (short) 1, (short) 1 };
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray11);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) intArray11, 31);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 31, 101);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4097");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) boolean16, 20);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4098");
        int[] intArray1 = new int[] { (-25) };
        boolean boolean2 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-25]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4099");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!", "hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihh" + "'", str3, "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihh");
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4100");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!", charArray11);
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
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4101");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence0, charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4102");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("i", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhh", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i" + "'", str3, "i");
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4103");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4104");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi", charArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean18);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4105");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4106");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi", "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi" + "'", str3, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4107");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(44, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4108");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihh", (java.lang.CharSequence) "hhihhi!hhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4109");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!", charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence0, charArray12);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4110");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihih\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4111");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4112");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4113");
        int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(41, 8, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4114");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-87), 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 49");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4115");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4116");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4117");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4118");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4119");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-999999999), (int) (byte) -1, 110);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4120");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhih is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4121");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!", "hh!hhhh!hhh!hhhh!h!hh!hhhh", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!" + "'", str3, "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!");
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4122");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray12 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone(charSequence2, charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean21 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4123");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4124");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4125");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhi!hhii!hhihhi!hhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4126");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-52), (int) (short) 10, (-84));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -84");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4127");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh", (java.lang.CharSequence) "hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihhi!hh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4128");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhihhi!hhii!hhihhi!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4129");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4130");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi", "hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihhi!hh", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi" + "'", str3, "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi");
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4131");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(109, 504, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4132");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!", (java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4133");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4134");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4135");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhihhi!hhii!hhihhi!hh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4136");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h", "hhihhi!hhii!hhihhi!hh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4137");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 188 + "'", int1 == 188);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4138");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h", (java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4139");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4140");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4141");
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
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh", charArray12);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4142");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4143");
        char[] charArray8 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h", charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4144");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh", "hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i", "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh" + "'", str3, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh");
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4145");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4146");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-65), 0, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4147");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4148");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi");
        char[] charArray9 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) charArray9, (int) (short) 1);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhh", charArray9);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4149");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(30, (-10), 41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: -10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4150");
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
        boolean boolean45 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray38);
        boolean boolean46 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi", charArray38);
        boolean boolean47 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray38);
        java.lang.Class<?> wildcardClass48 = charArray38.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4151");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4152");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(48, 58, 65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 65");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4153");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4154");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence1, charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhi", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4155");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhihhi!hh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4156");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhhh", charArray10);
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
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4157");
        char[] charArray9 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        java.lang.Class<?> wildcardClass15 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4158");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh", "hh!hhhh!hhh!hhhh!h!hh!hh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hh!hhhh!hhh!hhhh!h!hh!hhih" + "'", str3, "hh!hhhh!hhh!hhhh!h!hh!hhih");
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4159");
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4160");
        int[] intArray3 = new int[] { (byte) -1, (short) 1, (short) 1 };
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        int int5 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) intArray3);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4161");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(26, 50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 50");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4162");
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
        char[] charArray47 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean48 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray47);
        boolean boolean49 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray47);
        boolean boolean50 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray47);
        boolean boolean51 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray47);
        boolean boolean52 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!", charArray47);
        boolean boolean53 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh", charArray47);
        boolean boolean54 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhi", charArray47);
        int int56 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray47, 41);
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
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4163");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi", "hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi", "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi" + "'", str3, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi");
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4164");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhi", "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4165");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihhi!hh", "hh!hhhh!hhh!hhhh!h!hh!hhih", "hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihhi!hh" + "'", str3, "hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihhi!hh");
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4166");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(56, 49, 65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 65");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4167");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4168");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i", (java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4169");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4170");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hh!hhhh!hhh!hhhh!h!hh!hh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4171");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4172");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4173");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4174");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4175");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(43, 4, (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -20");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4176");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 53, 100);
        char[] charArray14 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray14);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray14);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray14);
        java.lang.Class<?> wildcardClass20 = charArray14.getClass();
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray14, 109);
        java.lang.String[] strArray24 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!");
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!", 190);
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
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4177");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("i!", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh", "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!" + "'", str3, "i!");
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4178");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(0, (-45));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4179");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4180");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(189, (int) '\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4181");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4182");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4183");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-2), 189, (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 189");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4184");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhih", "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!" + "'", str2, "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!");
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4185");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(42, 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 48");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4186");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihhi!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4187");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4188");
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
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4189");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) (-99));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4190");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!", charArray11);
        java.lang.Class<?> wildcardClass20 = charArray11.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4191");
        char[] charArray10 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4192");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(17, (-17));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4193");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4194");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-35), 82, 47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 82");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4195");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhihhi!hhii!hhihhi!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4196");
        int[] intArray1 = new int[] { 25 };
        boolean boolean2 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray1);
        boolean boolean3 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray1);
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[25]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4197");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hh!hhhh!hhh!hhhh!h!hh!hhih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4198");
        comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-13), 11, 20);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4199");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4200");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!h", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh" + "'", str3, "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihh");
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4201");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh", "hhihhi", "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh" + "'", str3, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4202");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) 'a', 0);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj9 = null;
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray8, obj9, (int) '\n');
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray8, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray22 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray22);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray22);
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray8, (java.lang.Object) charArray22, 100);
        java.lang.Object[] objArray28 = new java.lang.Object[] { 0 };
        int int31 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray28, (java.lang.Object) (byte) 10, (int) (byte) -1);
        int int33 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray8, (java.lang.Object) objArray28, (int) (byte) 100);
        char[] charArray42 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean43 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray42);
        boolean boolean44 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray42);
        boolean boolean45 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray42);
        int int47 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray8, (java.lang.Object) charArray42, 101);
        int int49 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) strArray8, (int) (byte) 100);
        java.lang.String[] strArray51 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!");
        java.lang.String[] strArray53 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
        java.lang.Object[] objArray54 = null;
        comp5111.assignment.cut.Subject.StringTasks stringTasks55 = new comp5111.assignment.cut.Subject.StringTasks();
        int int57 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray54, (java.lang.Object) stringTasks55, (int) '\n');
        int int59 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray53, (java.lang.Object) stringTasks55, 22);
        int int61 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray51, (java.lang.Object) stringTasks55, 65);
        int int63 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray8, (java.lang.Object) 65, 90);
        java.lang.String[] strArray65 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi");
        int int67 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray8, (java.lang.Object) strArray65, 2);
        java.lang.String[] strArray70 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj71 = null;
        int int73 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray70, obj71, (int) '\n');
        int int76 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray70, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray84 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean85 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray84);
        boolean boolean86 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray84);
        int int88 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray70, (java.lang.Object) charArray84, 100);
        boolean boolean89 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray84);
        boolean boolean90 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray84);
        int int92 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray65, (java.lang.Object) charArray84, (-100));
        boolean boolean93 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi", charArray84);
        boolean boolean94 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi", charArray84);
        java.lang.Class<?> wildcardClass95 = charArray84.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
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
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(charArray84);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray84), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray84), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray84), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4203");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(112, 57, (int) '\r');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 57");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4204");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhii!hhihhi!hhi", "hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhii!hhihhi!hhi" + "'", str3, "hhihhi!hhii!hhihhi!hhi");
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4205");
        char[] charArray8 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray8);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4206");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh", "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4207");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("ii");
        char[] charArray13 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!!", charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh", charArray13);
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh", (int) (byte) -1);
        java.lang.Class<?> wildcardClass24 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4208");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4209");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4210");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4211");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(62, 108, 80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 80");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4212");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi" + "'", str1, "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi");
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4213");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhh");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhh");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4214");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4215");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4216");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!", charArray11);
        java.lang.Class<?> wildcardClass20 = charArray11.getClass();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4217");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(999999999, 32, 502);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 502");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4218");
        int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(20, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4219");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4220");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("", "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4221");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhihhi!hhii!hhihhi!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhii!hhihhi!hh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4222");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hh!hhhh!hhh!hhhh!h!hh!hhhh");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hh!hhhh!hhh!hhhh!h!hh!hhh", 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4223");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhih\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4224");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4225");
        comp5111.assignment.cut.Subject.GregorianTasks.checkDate(28, 2, 9);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4226");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh", "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihh", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh" + "'", str3, "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh");
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4227");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4228");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4229");
        char[] charArray13 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh", charArray13);
        int int22 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray13);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hh", charArray13);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4230");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhih");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4231");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 503 + "'", int1 == 503);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4232");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(90, 113, (-35));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 113");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4233");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi" + "'", str2, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi");
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4234");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4235");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4236");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(31, 80, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 80");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4237");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("!", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!" + "'", str3, "!");
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4238");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4239");
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
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh", charArray12);
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
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4240");
        char[] charArray8 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        java.lang.Class<?> wildcardClass12 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4241");
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
        // The following exception was thrown during execution in test generation
        try {
            int int34 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4242");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihhi!hhii!hhihhi!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhii!hhihhi!hh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4243");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(193, 39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 39");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4244");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihh", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihh" + "'", str3, "hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihh");
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4245");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhii!hhihhi!hhi", "i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhihhi!hhii!hhihhi!hh" + "'", str2, "hhihhi!hhii!hhihhi!hh");
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4246");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hh!hhhh!hhh!hhhh!h!hh!hhhh", (java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4247");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4248");
        char[] charArray10 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4249");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(87, 56, (-35));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 56");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4250");
        int[] intArray3 = new int[] { '\000', 29, (short) 1 };
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) intArray3);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 29, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4251");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi" + "'", str2, "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi");
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4252");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4253");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi!", "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi!" + "'", str3, "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi!");
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4254");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi" + "'", str1, "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi");
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4255");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(0, 65, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 51");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4256");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhi!", (java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4257");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(44, 54, 58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 54");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4258");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4259");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4260");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4261");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4262");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhh" + "'", str1, "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhh");
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4263");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4264");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4265");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhihhi");
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hi", (-99));
        java.lang.Class<?> wildcardClass20 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4266");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i", "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi", "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i" + "'", str3, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4267");
        int[] intArray3 = new int[] { (byte) -1, (short) 1, (short) 1 };
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4268");
        java.lang.Object[] objArray0 = null;
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray0, (java.lang.Object) boolean19, 8);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4269");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hh!hhhh!hhh!hhhh!h!hh!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4270");
        char[] charArray9 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        java.lang.Class<?> wildcardClass13 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4271");
        java.lang.Object[] objArray1 = new java.lang.Object[] { 0 };
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray1, (java.lang.Object) (byte) 10, (int) (byte) -1);
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray1, (java.lang.Object) 'a', 10);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray1, (java.lang.Object) "hi!", 5);
        char[] charArray22 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray22);
        boolean boolean24 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray22);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray22);
        boolean boolean26 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray22);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi", charArray22);
        int int29 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray1, (java.lang.Object) charArray22, 20);
        boolean boolean30 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray22);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4272");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 1.0f, 3);
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 10.0f, 22);
        java.lang.Class<?> wildcardClass8 = strArray1.getClass();
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4273");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4274");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4275");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-84), (-97));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4276");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4277");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h", (java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4278");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh", (java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4279");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray8 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence1, charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4280");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihh");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4281");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhh");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray3);
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int4, 189);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 13 + "'", int4 == 13);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4282");
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
        boolean boolean46 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray39);
        boolean boolean47 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi", charArray39);
        boolean boolean48 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray39);
        boolean boolean49 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhi", charArray39);
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4283");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihh", "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhh", "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihh" + "'", str3, "hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihh");
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4284");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4285");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4286");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4287");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(504, 110);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 110");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4288");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((-32), 999999999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 999999999");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4289");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihh" + "'", str1, "hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihh");
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4290");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(83, 29, 109);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 29");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4291");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-39), (-65), 53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 53");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4292");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4293");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4294");
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
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh", charArray13);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4295");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4296");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray13 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray13);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray13);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray13);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence0, charArray13);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4297");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4298");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!" + "'", str1, "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!");
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4299");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4300");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(65, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4301");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4302");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhh" + "'", str1, "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhh");
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4303");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hh!hhhh!hhh!hhhh!h!hh!hhih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4304");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4305");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi", charArray11);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4306");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4307");
        char[] charArray9 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!hhhh!hhh!hhhh!h!hh!hhhh", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4308");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhihhi!hhii!hhihhi!hhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4309");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4310");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh", (java.lang.CharSequence) "hhi!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4311");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(0, 426);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 426");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4312");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi", charArray10);
        java.lang.Class<?> wildcardClass19 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4313");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hi", (java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4314");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!" + "'", str1, "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!");
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4315");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhi!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4316");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4317");
        int[] intArray3 = new int[] { '\000', 29, (short) 1 };
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) intArray3);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 29, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4318");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4319");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate((-17), 57, 502);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 57");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4320");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4321");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4322");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4323");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4324");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!");
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
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray17);
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray17, (-62));
        char[] charArray29 = new char[] {};
        boolean boolean30 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray29);
        boolean boolean31 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray29);
        int int32 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray29);
        boolean boolean33 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray29);
        int int35 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray29, 30);
        java.lang.String[] strArray37 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("ii");
        char[] charArray49 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean50 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray49);
        boolean boolean51 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray49);
        boolean boolean52 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray49);
        boolean boolean53 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray49);
        boolean boolean54 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray49);
        boolean boolean55 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray49);
        boolean boolean56 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray49);
        int int58 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray37, (java.lang.Object) boolean56, (int) (byte) 100);
        int int60 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) int58, 409);
        org.junit.Assert.assertNotNull(strArray1);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4325");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4326");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h", "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4327");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hhh", charArray10);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4328");
        java.lang.Object[] objArray0 = null;
        comp5111.assignment.cut.Subject.CharTasks charTasks1 = new comp5111.assignment.cut.Subject.CharTasks();
        int int3 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray0, (java.lang.Object) charTasks1, (int) ' ');
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) objArray0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4329");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hh!hhhh!hhh!hhhh!h!hh!hhhh", "hhihhi!hh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4330");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4331");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hh", charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh", charArray11);
        java.lang.Class<?> wildcardClass21 = charArray11.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4332");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!h is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4333");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!hhhh!hhh!hhhh!h!hh!hhhh", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4334");
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
        java.lang.String[] strArray54 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi!");
        int int56 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi!", 10);
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
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4335");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi", charArray10);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4336");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(50, 188, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4337");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4338");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4339");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhh is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4340");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4341");
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhi", charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi", charArray12);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4342");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4343");
        int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(410, (int) '\n', 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4344");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hh!hhhh!hhh!hhhh!h!hh!hhhhh", "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!h", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hh!hhhh!hhh!hhhh!h!hh!hhhhh" + "'", str3, "hh!hhhh!hhh!hhhh!h!hh!hhhhh");
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4345");
        char[] charArray12 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhih", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4346");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi", "hh!hhhh!hhh!hhhh!h!hh!hhhhh", "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi" + "'", str3, "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi");
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4347");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi", "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi" + "'", str3, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4348");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh" + "'", str3, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4349");
        java.lang.Object[] objArray0 = null;
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhi!hhi");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray0, (java.lang.Object) "hhihhi!hhi", (-32));
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4350");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4351");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4352");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(0, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4353");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = comp5111.assignment.cut.Subject.NumberTasks.createDouble("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4354");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4355");
        char[] charArray9 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h", charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh", charArray9);
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
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4356");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 408 + "'", int1 == 408);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4357");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4358");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4359");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4360");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4361");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25 + "'", int1 == 25);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4362");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhih", "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhih", "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhih" + "'", str3, "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhih");
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4363");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh" + "'", str1, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh");
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4364");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth((int) (byte) 100, (-90));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: -90");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4365");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-32), (-99), 84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 84");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4366");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isRFC3986HostName("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4367");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4368");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv4Address("hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihhi!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4369");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhi");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4370");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i", (java.lang.CharSequence) "hh!hhhh!hhh!hhhh!h!hh!hhhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4371");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hhihhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4372");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hh", (java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4373");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4374");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: ! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4375");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h", charArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean18);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4376");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4377");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4378");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi", "hhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh" + "'", str3, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh");
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4379");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(8, 189, 26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 189");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4380");
        char[] charArray9 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray9);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4381");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4382");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hh!hhhh!hhh!hhhh!h!hh!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4383");
        char[] charArray4 = new char[] {};
        boolean boolean5 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray4);
        int int7 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray4);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray4);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4384");
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
        java.lang.String[] strArray36 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj37 = null;
        int int39 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray36, obj37, (int) '\n');
        int int42 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray36, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray50 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean51 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray50);
        boolean boolean52 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray50);
        int int54 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray36, (java.lang.Object) charArray50, 100);
        java.lang.Object[] objArray56 = new java.lang.Object[] { 0 };
        int int59 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray56, (java.lang.Object) (byte) 10, (int) (byte) -1);
        int int61 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray36, (java.lang.Object) objArray56, (int) (byte) 100);
        int int63 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (byte) 100, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int64 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) int63);
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
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[0]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4385");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(5, 41, 43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 41");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4386");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 226 + "'", int1 == 226);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4387");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4388");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihhi!hhi");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray13 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray13);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray13);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence4, charArray13);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) boolean19, (-22));
        int int23 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) (-22), (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4389");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4390");
        java.lang.Object[] objArray0 = null;
        char[] charArray14 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray14);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray14);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray14);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray14);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray14);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray14);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "i", charArray14);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray14);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!", charArray14);
        int int25 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray0, (java.lang.Object) charArray14, (-39));
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4391");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4392");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4393");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhi", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi", charArray10);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4394");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4395");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4396");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.Subject.GregorianTasks.getLengthOfMonth(409, 84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid month: 84");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4397");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("ii");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4398");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!", (java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4399");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhihhi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4400");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4401");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray8 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence1, charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi", charArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4402");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray10);
        java.lang.Class<?> wildcardClass17 = charArray10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4403");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4404");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear((-99));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4405");
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi");
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) 1.0f, 3);
        int[] intArray13 = new int[] { (byte) -1, (short) 1, (short) 1 };
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray13);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray13);
        int int17 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray6, (java.lang.Object) intArray13, 31);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray13);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray13);
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) intArray13, (int) (short) 10);
        java.lang.CharSequence charSequence22 = null;
        char[] charArray29 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean30 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray29);
        boolean boolean31 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence22, charArray29);
        int int33 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray4, (java.lang.Object) charArray29, 42);
        boolean boolean34 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi", charArray29);
        boolean boolean35 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi", charArray29);
        boolean boolean36 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi", charArray29);
        java.lang.Class<?> wildcardClass37 = charArray29.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4406");
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
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!", charArray12);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hh", charArray12);
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4407");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isDigits("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4408");
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
        boolean boolean47 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!h", charArray38);
        int int48 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray38);
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 6 + "'", int48 == 6);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4409");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4410");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) (-999999999));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4411");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4412");
        boolean boolean1 = comp5111.assignment.cut.Subject.NumberTasks.isParsable("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4413");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihih");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4414");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hh!hhhh!hhh!hhhh!h!hh!hhhhh", "hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hh!hhhh!hhh!hhhh!h!hh!" + "'", str2, "hh!hhhh!hhh!hhhh!h!hh!");
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4415");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 81 + "'", int1 == 81);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4416");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hh!hhhh!hhh!hhhh!h!hh!hhhhh", "hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4417");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!" + "'", str1, "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!");
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4418");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!", "hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4419");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isNumeric((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4420");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4421");
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
        java.lang.String[] strArray32 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("i!");
        char[] charArray42 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean43 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray42);
        boolean boolean44 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray42);
        boolean boolean45 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray42);
        int int47 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray32, (java.lang.Object) "hi!", 65);
        char[] charArray56 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean57 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray56);
        boolean boolean58 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray56);
        boolean boolean59 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray56);
        boolean boolean60 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray56);
        boolean boolean61 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray56);
        boolean boolean62 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray56);
        boolean boolean63 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray56);
        int int65 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray32, (java.lang.Object) boolean63, 80);
        java.lang.String[] strArray68 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj69 = null;
        int int71 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray68, obj69, (int) '\n');
        int int74 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray68, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray82 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean83 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray82);
        boolean boolean84 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray82);
        int int86 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray68, (java.lang.Object) charArray82, 100);
        boolean boolean87 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray82);
        boolean boolean88 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray82);
        boolean boolean89 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray82);
        int int91 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray32, (java.lang.Object) charArray82, 32);
        int int93 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 32, 41);
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
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(charArray82);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray82), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray82), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray82), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4422");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4423");
        int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(188, 5, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4424");
        java.lang.String str1 = comp5111.assignment.cut.Subject.FilenameTasks.getName("hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihh" + "'", str1, "hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihh");
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4425");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4426");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4427");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = comp5111.assignment.cut.Subject.NumberTasks.createLong("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhihh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4428");
        boolean boolean1 = comp5111.assignment.cut.Subject.FilenameTasks.isIPv6Address("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4429");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhihhi!hhii!hhihhi!hhi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4430");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isEmpty((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4431");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihh", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhi" + "'", str2, "hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhi");
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4432");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhh" + "'", str1, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhh");
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4433");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi", "hhihhi!hhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4434");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = comp5111.assignment.cut.Subject.NumberTasks.createBigInteger("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4435");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isBlank((java.lang.CharSequence) "hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4436");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((int) (short) 1, (int) (byte) 1, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 56");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4437");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4438");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4439");
        char[] charArray9 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray9);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!!", charArray9);
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
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4440");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihhi!hh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4441");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hh", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4442");
        comp5111.assignment.cut.Subject.GregorianTasks.checkDate((int) (short) -1, 8, 21);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4443");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "ii", charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
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
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4444");
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "i", charArray12);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray12);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!!", charArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4445");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhhihhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4446");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(501, 188, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 188");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4447");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hh", "hhi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4448");
        boolean boolean1 = comp5111.assignment.cut.Subject.GregorianTasks.isLeapYear(41);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4449");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "h", charArray11);
        java.lang.Class<?> wildcardClass19 = charArray11.getClass();
        int int21 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) wildcardClass19, (-84));
        java.lang.Object obj22 = null;
        int int24 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj22, (-2));
        java.lang.String[] strArray26 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int29 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray26, (java.lang.Object) 'a', 0);
        java.lang.String[] strArray31 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj32 = null;
        int int34 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray31, obj32, (int) '\n');
        int int37 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray31, (java.lang.Object) (-1L), (int) (byte) 0);
        char[] charArray45 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean46 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray45);
        boolean boolean47 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray45);
        int int49 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray31, (java.lang.Object) charArray45, 100);
        java.lang.Object[] objArray51 = new java.lang.Object[] { 0 };
        int int54 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray51, (java.lang.Object) (byte) 10, (int) (byte) -1);
        int int56 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray31, (java.lang.Object) objArray51, (int) (byte) 100);
        char[] charArray65 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean66 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray65);
        boolean boolean67 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray65);
        boolean boolean68 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray65);
        int int70 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray31, (java.lang.Object) charArray65, 101);
        int int72 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray26, (java.lang.Object) strArray31, (int) (byte) 100);
        java.lang.String[] strArray74 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hi!");
        java.lang.String[] strArray76 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("h");
        java.lang.Object[] objArray77 = null;
        comp5111.assignment.cut.Subject.StringTasks stringTasks78 = new comp5111.assignment.cut.Subject.StringTasks();
        int int80 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray77, (java.lang.Object) stringTasks78, (int) '\n');
        int int82 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray76, (java.lang.Object) stringTasks78, 22);
        int int84 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray74, (java.lang.Object) stringTasks78, 65);
        int int86 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray31, (java.lang.Object) 65, 90);
        java.lang.String[] strArray88 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhi");
        int int90 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray31, (java.lang.Object) strArray88, 2);
        int int93 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray88, (java.lang.Object) 161, 15);
        int int95 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) strArray88, (-19));
        org.junit.Assert.assertNotNull(strArray1);
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
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[0]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray65), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray65), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray65), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4450");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4451");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!ihhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!i!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!!!hhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4452");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4453");
        char[] charArray11 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi!", charArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) boolean18);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4454");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4455");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hh");
        int int2 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4456");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hh!hhhh!hhh!hhhh!h!hh!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4457");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi", "hhi!!", "hhihhi!hhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi" + "'", str3, "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhi");
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4458");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chomp("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh" + "'", str1, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh");
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4459");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhi\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4460");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("h");
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) false, 101);
        char[] charArray7 = new char[] {};
        boolean boolean8 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        int int12 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray7, 101);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4461");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhi!!");
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
        int int47 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray38, 62);
        java.lang.Object[] objArray49 = new java.lang.Object[] { 0 };
        int int52 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray49, (java.lang.Object) (byte) 10, (int) (byte) -1);
        int int55 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray49, (java.lang.Object) 'a', 10);
        int int57 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 10, 62);
        int int60 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) 189, 22);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4462");
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
        boolean boolean25 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!", charArray14);
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
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4463");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.NumberTasks.createNumber("hh!hhhh!hhh!hhhh!h!hh!hhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hh!hhhh!hhh!hhhh!h!hh!hhh is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4464");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0 };
        int int6 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray3, (java.lang.Object) (byte) 10, (int) (byte) -1);
        int int9 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray3, (java.lang.Object) 'a', 10);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hi!");
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf(objArray3, (java.lang.Object) "hi!", 5);
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) objArray3, 408);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4465");
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
        boolean boolean23 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4466");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4467");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hh!hhhh!hhh!hhhh!h!hh!hh", "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi", "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hh!hhhh!hhh!hhhh!h!hh!hh" + "'", str3, "hh!hhhh!hhh!hhhh!h!hh!hh");
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4468");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4469");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhihhi!hhii!hhihhi!hhi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4470");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek(999999999, (int) '#', 44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 44");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4471");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihh", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!", "hhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhhihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihh" + "'", str3, "hhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihhihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihihhhhihihhihhhhihihihhhhhhihihhihhhhihihihhhhihihh");
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4472");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringTasks.stripEnd("hh", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4473");
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhi!!");
        char[] charArray12 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray12);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray12);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray12);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray12);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray12);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray3, (java.lang.Object) charArray12, (-13));
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!", charArray12);
        boolean boolean22 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhhh", charArray12);
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
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4474");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny(charSequence3, charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhi!!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hh!hhhh!hhh!hhhh!h!hh!hhih", charArray10);
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
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4475");
        int[] intArray3 = new int[] { '\000', 29, (short) 1 };
        boolean boolean4 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean5 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        int int11 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) intArray3);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray3);
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 29, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4476");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hh", "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hh" + "'", str3, "hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hhi!hhhhihhi!hhihhhhihhi!hhi!hhhhhhihhi!hhihhhhihhi!hhi!hhhhihhi!hh");
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4477");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringTasks.isMixedCase((java.lang.CharSequence) "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4478");
        char[] charArray10 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        int int14 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4479");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = comp5111.assignment.cut.Subject.NumberTasks.createBigDecimal("hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihhhhhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhih!hhhhihhi!hh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character array is missing \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4480");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GregorianTasks.checkDate(52, 27, (-17));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MONTH out of range: 27");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4481");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hi", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i!", "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4482");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhi!!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihi!hhhhihi!hhihhihi!hhhhihi!hi!hhihi!hhhhihi!", charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "h", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4483");
        char[] charArray8 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean9 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean10 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray8);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray8);
        java.lang.Class<?> wildcardClass14 = charArray8.getClass();
        int int15 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4484");
        int int1 = comp5111.assignment.cut.Subject.StringTasks.length((java.lang.CharSequence) "hhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!ihhhhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 225 + "'", int1 == 225);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4485");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.GregorianTasks.getDayOfWeek((-99), 5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Day out of range: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4486");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!", "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!h", "hh!hhhh!hhh!hhhh!h!hh!hhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!" + "'", str3, "hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!");
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4487");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = comp5111.assignment.cut.Subject.NumberTasks.createInteger("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4488");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("hh!hhhh!hhh!hhhh!h!hh!hhhh");
        int[] intArray5 = new int[] { '\000', 29, (short) 1 };
        boolean boolean6 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        boolean boolean7 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        boolean boolean8 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        boolean boolean9 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        boolean boolean10 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        boolean boolean11 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        boolean boolean12 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(intArray5);
        int int13 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) intArray5);
        java.lang.Class<?> wildcardClass14 = intArray5.getClass();
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) intArray5, (int) 'a');
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhihhihhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhihhhhihh", 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 29, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4489");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4490");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhhi!ihhhhihhhihhhhihhhihhihhihhhihhhhihhhihhhihhihhhihhhhihhhhh", charArray10);
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
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4491");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterType("");
        java.lang.Object obj2 = null;
        int int4 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, obj2, (int) '\n');
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.FilenameTasks.splitOnTokens("hhi!!");
        int int8 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) "hhi!!", (-65));
        char[] charArray18 = new char[] { 'a', '4', '4', '#', '#', '\n' };
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray18);
        boolean boolean20 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray18);
        boolean boolean22 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        boolean boolean23 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray18);
        boolean boolean24 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        int int26 = comp5111.assignment.cut.Subject.ArrayTasks.lastIndexOf((java.lang.Object[]) strArray1, (java.lang.Object) charArray18, 52);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "a44##\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "a44##\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[a, 4, 4, #, #, \n]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4492");
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringTasks.splitByCharacterTypeCamelCase("hh!hhhh!hhh!hhhh!h!hh!hhhhh");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4493");
        char[] charArray11 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean13 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean15 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        boolean boolean16 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray11);
        int int18 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray11);
        boolean boolean19 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihh", charArray11);
        int int20 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray11);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4494");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringTasks.replace("hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhih", "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhiihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhii!hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhhihhih", "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i" + "'", str3, "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhihhi!i");
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4495");
        int int1 = comp5111.assignment.cut.Subject.FilenameTasks.indexOfLastSeparator("hhihhi!hhhhi!!hhihhi!hhhhi!!!hhihhi!hhhhihhi!hh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4496");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = comp5111.assignment.cut.Subject.NumberTasks.createFloat("hh!hhhh!hhh!hhhh!h!hh!hhih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hh!hhhh!hhh!hhhh!h!hh!hhih\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4497");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringTasks.chop("hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!" + "'", str1, "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhh!hhh!hhhh!h!hh!");
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4498");
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
        boolean boolean26 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray18);
        boolean boolean27 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh!hhhh!hhhhhh!hhhhhh!hhhhhh!hh!hhhh!hhhhhh", charArray18);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4499");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringTasks.equals((java.lang.CharSequence) "hhhihhhihihhhhhihhhihihhhihhhihhhihihhhhhihhhihihhhihihhhihhhihihhhhhihhhihihhh", (java.lang.CharSequence) "hhihhi!hhhhihhi!hhihhihhi!hhhhihhi!hhi!hhihhi!hhhhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest08.test4500");
        char[] charArray10 = new char[] { '\n', '4', '#', ' ', '4' };
        boolean boolean11 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean12 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        int int16 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray10);
        boolean boolean17 = comp5111.assignment.cut.Subject.StringTasks.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.Subject.ArrayTasks.isEmpty(charArray10);
        int int19 = comp5111.assignment.cut.Subject.ArrayTasks.getLength((java.lang.Object) charArray10);
        boolean boolean20 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "!", charArray10);
        boolean boolean21 = comp5111.assignment.cut.Subject.StringTasks.containsAny((java.lang.CharSequence) "hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhhh!hhhh!hhh!hhhh!h!hh!hhhh!!hhihhhh!hhhh!hhh!hhhh!h!hh!hhhhhhhhihhhh!hhhh!hhh!hhhh!h!hh!hhh", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n4# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, 4, #,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }
}

