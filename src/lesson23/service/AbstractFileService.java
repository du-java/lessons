package lesson23.service;

import lesson23.model.Event;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class AbstractFileService<T extends Event> implements FileService<T> {

    private final String path;
    private final Function<String, T> parse;

    protected AbstractFileService(final String path, final Function<String, T> parse) {
        this.path = path;
        this.parse = parse;
    }

    @Override
    public List<T> load() {
        try {
            return Files.lines(Paths.get(path))
                    .map(parse)
                    .collect(Collectors.toList());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
            return Collections.emptyList();
        }
    }

    @Override
    public void store(final List<T> list) {
        try {
            Files.write(Paths.get(path), list.stream().map(Object::toString).collect(Collectors.toList()));
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
