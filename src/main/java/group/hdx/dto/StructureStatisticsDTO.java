package group.hdx.dto;

import group.hdx.po.StructureStatisticsPO;

public class StructureStatisticsDTO {
    private double basicallyIntactSquare;
    private double damagedSquare;
    private String note;
    private double destroySquare;

    public StructureStatisticsDTO(StructureStatisticsPO structureStatisticsPO) {
        this.basicallyIntactSquare = structureStatisticsPO.getBasicallyIntactSquare();
        this.damagedSquare = structureStatisticsPO.getDamagedSquare();
        this.note = structureStatisticsPO.getNote();
        this.destroySquare = structureStatisticsPO.getDestroySquare();
    }

    public double getBasicallyIntactSquare() {
        return basicallyIntactSquare;
    }

    public void setBasicallyIntactSquare(double basicallyIntactSquare) {
        this.basicallyIntactSquare = basicallyIntactSquare;
    }

    public double getDamagedSquare() {
        return damagedSquare;
    }

    public void setDamagedSquare(double damagedSquare) {
        this.damagedSquare = damagedSquare;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public double getDestroySquare() {
        return destroySquare;
    }

    public void setDestroySquare(double destroySquare) {
        this.destroySquare = destroySquare;
    }
}
