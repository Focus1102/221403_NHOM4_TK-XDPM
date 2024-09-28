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
    
    AddUIConsoleInput() {
        stdout = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), true);
        stdin = new BufferedReader(new InputStreamReader(System.in));
    }

    public static RequestData inputData() throws IOException {

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), true);
        RequestData requestData = new RequestData("", ""); // Gán giá trị mặc định là chuỗi rỗng

        stdout.print("Nhap so thu nhat: ");
        stdout.flush();
        String input1 = stdin.readLine();
        requestData.setNumber1(input1);

        stdout.print("Nhap so thu hai: ");
        stdout.flush();
        String input2 = stdin.readLine();
        requestData.setNumber2(input2);

        return requestData;
    }
}
