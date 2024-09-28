package Buoi1;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class AddUIConsoleOutput {
    PrintWriter stdout = null;

    public AddUIConsoleOutput() {
        stdout = new PrintWriter(new OutputStreamWriter(System.out), true);
    }

    // Hiển thị kết quả
    public void outputResult(ResponseData responseData) {
        stdout.println("Ket qua la: " + responseData.getResult());
        stdout.flush();
    }

    // Hiển thị thông báo yêu cầu nhập lại
    public void requestInputAgain() {
        stdout.println("Nhap sai, vui long nhap lai thong tin");
        stdout.flush();
    }
}
