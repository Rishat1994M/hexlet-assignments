package exercise;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
public class App {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static void save(Path path, Car car) {
        try {
            // Сериализация объекта Car в JSON и запись в файл
            objectMapper.writeValue(path.toFile(), car);
        } catch (IOException e) {
            e.printStackTrace(); // Обработка исключений
        }
    }

    public static Car extract(Path path) {
        try {
            // Чтение JSON из файла и десериализация в объект Car
            return objectMapper.readValue(path.toFile(), Car.class);
        } catch (IOException e) {
            e.printStackTrace(); // Обработка исключений
            return null; // В случае ошибки вернуть null
        }
    }
}

// END
