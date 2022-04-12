package day32_Constructors.utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifier_Test2 {


    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
       // System.out.println(AccessModifiers.defaultData);// Default is not Accessable outside the package
       // System.out.println(AccessModifiers.privateData);// Private is not Accessable outside the package

        AccessModifiers.method1();
       // AccessModifiers.method2();
       // AccessModifiers.method3();



    }
}
