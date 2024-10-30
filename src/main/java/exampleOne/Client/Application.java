package exampleOne.Client;

import exampleOne.command.OpenTextFileOperation;
import exampleOne.command.SaveTextFileOperation;
import exampleOne.invoker.TextFileOperationExecutor;
import exampleOne.receiver.TextFile;

public class Application {
    public static void main(String[] args) {
        TextFileOperationExecutor textFileOperationExecutor
                = new TextFileOperationExecutor();
        textFileOperationExecutor.executeOperation(
                new OpenTextFileOperation(new TextFile("file1.txt")));
        textFileOperationExecutor.executeOperation(
                new SaveTextFileOperation(new TextFile("file2.txt")));
    }
}
