package org.example;

import java.time.LocalDate;

public class Medication {
    private String medicineName;
    private double dose;
    private LocalDate intakeDate;

    // Конструктор
    public Medication(String medicineName, double dose, LocalDate intakeDate) {
        this.medicineName = medicineName;
        this.dose = dose;
        this.intakeDate = intakeDate;
    }

    // Геттеры и сеттеры
    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public double getDose() {
        return dose;
    }

    public void setDose(double dose) {
        this.dose = dose;
    }

    public LocalDate getIntakeDate() {
        return intakeDate;
    }

    public void setIntakeDate(LocalDate intakeDate) {
        this.intakeDate = intakeDate;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "medicineName='" + medicineName + '\'' +
                ", dose=" + dose +
                ", intakeDate=" + intakeDate +
                '}';
    }
}
