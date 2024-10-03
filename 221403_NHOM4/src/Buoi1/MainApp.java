package Buoi1;

import java.io.IOException;

public class MainApp {
    public static void main(String[] args) throws IOException {
        // Khởi tạo các thành phần cần thiết
        AddEntity addEntity = new AddEntity(); // Đối tượng thực hiện phép tính
        AddUIConsoleOutput uiOutput = new AddUIConsoleOutput(); // Đối tượng xuất kết quả
        AddUseCaseControl addControl = new AddUseCaseControl(addEntity, uiOutput); // Đối tượng điều khiển

        // Tạo đối tượng AddUIConsoleInput và thiết lập liên kết với AddUseCaseControl
        AddUIConsoleInput uiInput = new AddUIConsoleInput(addControl); 
        addControl.setUiInput(uiInput); // Đặt uiInput trong AddUseCaseControl

        // Bắt đầu nhập dữ liệu
        uiInput.inputData();
    }
}
