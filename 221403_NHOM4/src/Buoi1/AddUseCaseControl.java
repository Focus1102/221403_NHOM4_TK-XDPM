package Buoi1;

import java.io.IOException;

public class AddUseCaseControl {
    AddEntity addEntity = null;
    AddUIConsoleOutput uiOutput = null;
    AddUIConsoleInput uiInput = null;

    public AddUseCaseControl(AddEntity addEntity, AddUIConsoleOutput uiOutput) {
        this.addEntity = addEntity;
        this.uiOutput = uiOutput;
    }

    // Đặt UIInput để có thể sử dụng lại nếu cần nhập lại
    public void setUiInput(AddUIConsoleInput uiInput) {
        this.uiInput = uiInput;
        uiOutput.setUiInput(uiInput); // Gán luôn cho uiOutput
    }

    public void execute(RequestData reqData) throws IOException {
        while (true) { // Vòng lặp sẽ tiếp tục cho đến khi người dùng nhập đúng
            try {
                // 3. Kiểm tra dữ liệu nhập
                Integer number1 = Integer.parseInt(reqData.getNumber1());
                Integer number2 = Integer.parseInt(reqData.getNumber2());

                // Thực hiện phép tính
                String result = addEntity.add(number1, number2);

                ResponseData responseData = new ResponseData(result);

                // 4. Gửi kết quả đến UIConsoleOutput để hiển thị
                uiOutput.outputResult(responseData);

                // Khi nhập đúng, thoát khỏi vòng lặp
                break;

            } catch (NumberFormatException e) {
             
                uiOutput.requestInputAgain();
                break;
            }
        }
    }
}
