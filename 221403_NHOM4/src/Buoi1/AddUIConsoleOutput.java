package Buoi1;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class AddUIConsoleOutput {
    PrintWriter stdout = null;
    AddUIConsoleInput uiInput = null; // Thêm liên kết đến AddUIConsoleInput

    public AddUIConsoleOutput() {
        stdout = new PrintWriter(new OutputStreamWriter(System.out), true);
    }

    // Thiết lập UIInput để gọi lại khi cần nhập lại
    public void setUiInput(AddUIConsoleInput uiInput) {
        this.uiInput = uiInput;
    }

    // 4. Hiển thị kết quả
    public void outputResult(ResponseData responseData) {
        stdout.println("ket qua la: " + responseData.getResult());
        stdout.flush();
    }

    // 4.1. Hiển thị thông báo lỗi yêu cầu nhập lại
    public void requestInputAgain() {
        stdout.println("Nhap sai. Vui long nhap lai so nguyen");
        stdout.flush();
        getInput(); // Gọi hàm để yêu cầu nhập lại
    }

    // 4.2. Yêu cầu người dùng nhập lại từ AddUIConsoleInput
    public void getInput() {
        try {
            if (uiInput != null) {
                uiInput.inputData(); 
                
            }
        } catch (IOException e) {
            
        }
    }
}

