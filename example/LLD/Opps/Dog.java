package com.example.LLD.Opps;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Dog implements Animal{
    @Override
    public void Eat() {
        System.out.println("Eating");
    }

    @Override
    public void Bath() {
        System.out.println("Bathing");
    }
}
