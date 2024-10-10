package org.example;

import java.time.LocalDate;

public class VetVisit {
    private String clinicName;
    private LocalDate visitDate;
    private String vetName;

    // Конструктор
    public VetVisit(String clinicName, LocalDate visitDate, String vetName) {
        this.clinicName = clinicName;
        this.visitDate = visitDate;
        this.vetName = vetName;
    }

    // Геттеры и сеттеры
    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDate visitDate) {
        this.visitDate = visitDate;
    }

    public String getVetName() {
        return vetName;
    }

    public void setVetName(String vetName) {
        this.vetName = vetName;
    }

    @Override
    public String toString() {
        return "VetVisit{" +
                "clinicName='" + clinicName + '\'' +
                ", visitDate=" + visitDate +
                ", vetName='" + vetName + '\'' +
                '}';
    }
}

