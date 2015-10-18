package edu.nju.expressMgmtSys.model.po;

public class CommodityPO {
    private int commodityId;
    private int nums;
    private int weight;
    private int volume;
    private String name;

    public CommodityPO(int nums, int weight, int volume, String name) {
        this.nums = nums;
        this.weight = weight;
        this.volume = volume;
        this.name = name;
    }

    public void setId(int id) {
        this.commodityId = id;
    }

    public int getNums() {
        return nums;
    }

    public int getWeight() {
        return weight;
    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof CommodityPO)) {
            return false;
        }

        CommodityPO another = (CommodityPO) o;
        return this.commodityId == another.commodityId;
    }

    @Override
    public int hashCode() {
        return new Integer(commodityId).hashCode();
    }
}