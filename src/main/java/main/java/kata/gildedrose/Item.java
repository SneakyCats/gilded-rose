package main.java.kata.gildedrose;

public final class Item {

    public int quality;
    public int sellIn;
    public final String name;

    public Item(String name, int sellIn, int quality) {
        this.quality = quality;
        this.sellIn = sellIn;
        this.name = name;
    }

}