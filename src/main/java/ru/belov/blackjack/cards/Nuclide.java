/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.belov.blackjack.cards;

/**
 *
 * @author Xiaomi TH (""),
 *
 */
public enum Nuclide {
    NA("Na-22", 1274.54, 950.57),
    TI("Ti-44", 67.884, 21915),
    MN("Mn-54", 834.848, 312.29),
    CO("Co-57", 122.061, 271.80),
    CO_HEAVY("Co-60", 1332.50, 1925.23),
    ZN("Zn-65", 1115.55, 243.86),
    Y("Y-88", 1836.066, 106.625),
    CD("Cd-109", 88.034, 461.4),
    SN("Sn-113", 391.71, 115.09),
    BA("Ba-133", 356.014, 3848.7),
    CS("Cs-134", 604.7, 753.5),
    CS_HEAVY("Cs-137", 661.66, 10990),
    CE("Ce-139", 165.86, 137.642),
    EU("Eu-152", 1408.006, 4941),
    GD("Gd-153", 97.43, 240.4),
    BI("Bi-207", 569.7, 11800),
    PB("Pb-210", 46.54, 81083),
    TH("Th-228", 2614, 698.6),
    AM("Am-241", 59.537, 157850),
    AM_HEAVY("Am-243", 74.67, 2692000);

    private final String name;
    private final double emitting;
    private final double halfLife;

    public double getHalfLife() {
        return halfLife;
    }

    private Nuclide(String name, double emitting, double halfLife) {
        this.name = name;
        this.emitting = emitting;
        this.halfLife = halfLife;
    }

    public String getName() {
        return this.name;
    }

    public double getEmitting() {
        return emitting;
    }

}
