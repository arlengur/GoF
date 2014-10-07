package creational.builder.builder1;

public class Water {
    private String name;
    private boolean sugar;
    private boolean sodium;

    public Water(WaterBuilder waterBuilder) {
        this.name = waterBuilder.name;
        this.sugar = waterBuilder.sugar;
        this.sodium = waterBuilder.sodium;
    }

    public String getName() {
        return name;
    }

    public boolean isSugar() {
        return sugar;
    }

    public boolean isSodium() {
        return sodium;
    }

    public static class WaterBuilder {
        private String name;
        private boolean sugar;
        private boolean sodium;

        public WaterBuilder name(String name) {
            this.name = name;
            return this;
        }

        public WaterBuilder sugar(boolean sugar) {
            this.sugar = sugar;
            return this;
        }

        public WaterBuilder sodium(boolean sodium) {
            this.sodium = sodium;
            return this;
        }

        public Water build() {
            return new Water(this);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name + " [");
        sb.append("сахар = " + sugar + ", ");
        sb.append("натрий = " + sodium + "]");

        return sb.toString();
    }

}
