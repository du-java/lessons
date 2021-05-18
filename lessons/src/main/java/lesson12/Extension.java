package lesson12;

public enum Extension {
    XML("xmlxsd"),
    JSON("jsonjs"),
    CSV("csvtxt");

    private final String extension;

    Extension(String ext) {
        this.extension = ext;
    }

    public String getExtension() {
        return extension;
    }

    public static Extension parse(String ext) {
        for (Extension extension : Extension.values()) {
            if (extension.getExtension().contains(ext)) {
                return extension;
            }
        }
        throw new IllegalArgumentException("wrong ext");
    }

}
