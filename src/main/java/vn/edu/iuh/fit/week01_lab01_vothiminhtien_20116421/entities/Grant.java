package vn.edu.iuh.fit.week01_lab01_vothiminhtien_20116421.entities;

public enum Grant {
    disable(0),
    enable(1);
    private final int value;

    private Grant(int value) {
        this.value = value;
    }

    public Integer getGrant_idValue() {
        return value;
    }
}