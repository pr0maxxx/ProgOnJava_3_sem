package ru.maksim.ikbo2021.new_pracs.prac_6.ex_10;

enum ComputerNames {
    TOP("SuperComputerHighPrice"),
    MIDDLE("GoodComputerNormalPrice"),
    LOW("SlowComputerCheap");

    private String stTitle;

    ComputerNames(String title) {
        this.stTitle = title;
    }

    public String getStTitle() {
        return stTitle;
    }

    public void setStTitle(String stTitle) {
        this.stTitle = stTitle;
    }

    @Override
    public String toString() {
        return "ComputerNames{" +
                "stTitle='" + stTitle + '\'' +
                '}';
    }
}