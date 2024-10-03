package Buoi1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class AddUIConsoleInput {
    PrintWriter stdout = null;
    BufferedReader stdin = null;
    AddUseCaseControl addControl = null;

    public AddUIConsoleInput(AddUseCaseControl addControl) {
        stdout = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), true);
        stdin = new BufferedReader(new InputStreamReader(System.in));
        this.addControl = addControl;
    }

    // Phương thức này nhận dữ liệu đầu vào từ người dùng
    public void inputData() throws IOException {
        RequestData requestData = new RequestData(null, null);

        // Nhập số thứ nhất
        stdout.print("Input number 1: ");
        stdout.flush();
        requestData.number1 = stdin.readLine();

        // Nhập số thứ hai
        stdout.print("Input number 2: ");
        stdout.flush();
        requestData.number2 = stdin.readLine();

        // 2. Gọi phương thức execute để xử lý dữ liệu nhập
        addControl.execute(requestData);
    }
}


