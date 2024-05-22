package hexlet.code;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import java.io.File;

@Command(name = "gendiff", mixinStandardHelpOptions = true, version = "gendiff 0.1",
        description = "Compares two configuration files and shows a difference.")

public class MainCommand implements Runnable{

    @Parameters(index = "0",paramLabel = "filepath1", description = "path to first file.")
    File filepath1;

    @Parameters(index = "1", paramLabel = "filepath2", description = "path to second file.")
    File filepath2;

    @Option(names = {"-f", "--format"}, paramLabel = "format", description = "output format [default: stylish]")
    String format;

    @Override
    public void run(){
    }
}
