package models;

public class TShirt extends Garment {
    private String sleeves, neck;

    private TShirt(Builder builder) {
        super("TShirt", 30.0);
        this.size = builder.size;
        this.material = builder.material;
        this.color = builder.color;
        this.sleeves = builder.sleeves;
        this.neck = builder.neck;
    }

    public static class Builder {
        private String size, material, color, sleeves, neck;

        public Builder size(String size) { this.size = size; return this; }
        public Builder material(String material) { this.material = material; return this; }
        public Builder color(String color) { this.color = color; return this; }
        public Builder sleeves(String sleeves) { this.sleeves = sleeves; return this; }
        public Builder neck(String neck) { this.neck = neck; return this; }

        public TShirt build() { return new TShirt(this); }
    }
}

