package lesson25;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = Mouse.MouseBuilder.class)
public class Mouse {
    private final String name;
    private final int buttons;

    public String getName() {
        return name;
    }

    public int getButtons() {
        return buttons;
    }

//    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
//    public Mouse(@JsonProperty("name") String name, @JsonProperty("buttons") int buttons) {
//        this.name = name;
//        this.buttons = buttons;
//    }


    public static MouseBuilder builder() {
        return new MouseBuilder();
    }

    public Mouse(String name, int buttons) {
        this.name = name;
        this.buttons = buttons;
    }

    public static class MouseBuilder {
        private String builderName = "Noname";
        private int buildButtons = 2;

        public MouseBuilder withName(String name) {
            this.builderName = name;
            return this;
        }

        public MouseBuilder withButtons(int buttons) {
            this.buildButtons = buttons;
            return this;
        }

        public Mouse build() {
            return new Mouse(builderName, buildButtons);
        }
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "name='" + name + '\'' +
                ", buttons=" + buttons +
                '}';
    }
}
