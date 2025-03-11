package models;

public class Pants extends Garment {
    private String fit, length;

    private Pants(Builder builder) {
        super("Pants", 50.0);
        this.size = builder.size;
        this.material = builder.material;
        this.color = builder.color;
        this.fit = builder.fit;
        this.length = builder.length;
    }

    public static class Builder {
        private String size, material, color, fit, length;

        public Builder size(String size) { this.size = size; return this; }
        public Builder material(String material) { this.material = material; return this; }
        public Builder color(String color) { this.color = color; return this; }
        public Builder fit(String fit) { this.fit = fit; return this; }
        public Builder length(String length) { this.length = length; return this; }

        public Pants build() { return new Pants(this); }
    }
}
