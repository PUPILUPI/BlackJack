/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.belov.blackjack;

/**
 *
 * @author Xiaomi TH (""),
 *
 */
public enum Nuclide {
    NA("Na-22", 1274.54),
    TI("Ti-44", 67.884),
    MN("Mn-54", 834.848),
    CO("Co-57", 122.061),
    CO_HEAVY("Co-60", 1332.50),
    ZN("Zn-65", 1115.55),
    Y("Y-88", 1836.066),
    CD("Cd-109", 88.034),
    SN("Sn-113", 391.71),
    BA("Ba-133", 356.014),
    CS("Cs-134", 604.7),
    CS_HEAVY("Cs-137", 661.66),
    CE("Ce-139", 165.86),
    EU("Eu-152", 1408.006),
    GD("Gd-153", 97.43),
    BI("Bi-207", 569.7),
    PB("Pb-210", 46.54),
    TH("Th-228", 2614),
    AM("Am-241", 59.537),
    AM_HEAVY("Am-243", 74.67);

    private final String name;
    private final double emitting;

   private Nuclide(String name, double emitting) {
        this.name = name;
        this.emitting = emitting;
    }
    public String getName() {
        return this.name;
    }

}
