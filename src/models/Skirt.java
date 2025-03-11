package models;

public class Skirt extends Garment {
    private String waistline, pattern;

    private Skirt(Builder builder) {
        super("Skirt", 40.0);
        this.size = builder.size;
        this.material = builder.material;
        this.color = builder.color;
        this.waistline = builder.waistline;
        this.pattern = builder.pattern;
    }

    public static class Builder {
        private String size, material, color, waistline, pattern;

        public Builder size(String size) { this.size = size; return this; }
        public Builder material(String material) { this.material = material; return this; }
        public Builder color(String color) { this.color = color; return this; }
        public Builder waistline(String waistline) { this.waistline = waistline; return this; }
        public Builder pattern(String pattern) { this.pattern = pattern; return this; }

        public Skirt build() { return new Skirt(this); }
    }
}
