package pl.szymonswierzbin.Z3;

import java.io.File;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        filesNoExtension("E:\\Testowyu");
    }
    public static Object[] filesNoExtension(String xyz){
        return Stream.of(new File(xyz).list())
                .filter(file->file.contains(".")).toArray();
    }
}
