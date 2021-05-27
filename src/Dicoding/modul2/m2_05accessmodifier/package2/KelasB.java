package dicoding.modul2.m2_05accessmodifier.package2;

import dicoding.modul2.m2_05accessmodifier.package1.KelasA;

/**
 *
 * @author GUMANOF
 */
public class KelasB extends KelasA{
    @Override
    protected void methodC() {
        super.methodC();
        System.out.println("Contoh pemanggilan protected dari package luar");
    }
}
