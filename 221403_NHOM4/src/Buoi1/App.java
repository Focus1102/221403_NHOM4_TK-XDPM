package Buoi1;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("App Addition");

        // Tạo đối tượng AddEntity và UIConsoleOutput
        AddEntity addEntity = new AddEntity();
        AddUIConsoleOutput uiOutput = new AddUIConsoleOutput();

        // Tạo đối tượng AddUseCaseControl và truyền vào addEntity và uiOutput
        AddUseCaseControl addControl = new AddUseCaseControl(addEntity, uiOutput);

        addControl.execute(null);
    }
}
