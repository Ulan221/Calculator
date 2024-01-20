public class Model {
  private Viewer viewer;
  private RPN rpn;
  private String inputExpression;

  public Model(Viewer viewer) {
    this.viewer = viewer;
    rpn = new RPN(this);
    inputExpression = "";
  }

  public void doAction(String command) {
    String textButton = "";
    int clickCount = 0;

    if(command.equals("One")) {
        inputExpression = inputExpression + "1";
        textButton = "1";
        viewer.appendToResultTextField(textButton);
        viewer.appendToHistoryTextField(textButton);
    } else if(command.equals("Two")) {
        inputExpression = inputExpression + "2";
        textButton = "2";
        viewer.appendToResultTextField(textButton);
        viewer.appendToHistoryTextField(textButton);
    } else if(command.equals("Three")) {
        inputExpression = inputExpression + "3";
        textButton = "3";
        viewer.appendToResultTextField(textButton);
        viewer.appendToHistoryTextField(textButton);
    } else if(command.equals("Four")) {
        inputExpression = inputExpression + "4";
        textButton = "4";
        viewer.appendToResultTextField(textButton);
        viewer.appendToHistoryTextField(textButton);
    } else if(command.equals("Five")) {
        inputExpression = inputExpression + "5";
        textButton = "5";
        viewer.appendToResultTextField(textButton);
        viewer.appendToHistoryTextField(textButton);
    } else if(command.equals("Six")) {
        inputExpression = inputExpression + "6";
        textButton = "6";
        viewer.appendToResultTextField(textButton);
        viewer.appendToHistoryTextField(textButton);
    } else if(command.equals("Seven")) {
        inputExpression = inputExpression + "7";
        textButton = "7";
        viewer.appendToResultTextField(textButton);
        viewer.appendToHistoryTextField(textButton);
    } else if(command.equals("Eight")) {
        inputExpression = inputExpression + "8";
        textButton = "8";
        viewer.appendToResultTextField(textButton);
        viewer.appendToHistoryTextField(textButton);
    } else if(command.equals("Nine")) {
        inputExpression = inputExpression + "9";
        textButton = "9";
        viewer.appendToResultTextField(textButton);
        viewer.appendToHistoryTextField(textButton);

    } else if(command.equals("Add")) {
         if (!viewer.textField.getText().isEmpty() || !viewer.textFieldHistory.getText().isEmpty()) {
             if (inputExpression.endsWith(" ")) {
                 textButton = "";
             } else {
                 inputExpression = inputExpression + " " + "+" + " ";
                 textButton = "+";
                 viewer.textField.setText("");
                 viewer.appendToHistoryTextField(textButton);
            }
        }
    } else if(command.equals("Sub")) {
      if (!viewer.textField.getText().isEmpty() || !viewer.textFieldHistory.getText().isEmpty()) {
          if (inputExpression.endsWith(" ")) {
              textButton = "";
          } else {
              inputExpression = inputExpression + " " + "-" + " ";
              textButton = "-";
              viewer.textField.setText("");
              viewer.appendToHistoryTextField(textButton);
          }
       }
    } else if(command.equals("Mult")) {
      if (!viewer.textField.getText().isEmpty() || !viewer.textFieldHistory.getText().isEmpty()) {
          if (inputExpression.endsWith(" ")) {
              textButton = "";
          } else {
              inputExpression = inputExpression + " " + "*" + " ";
              textButton = "*";
              viewer.textField.setText("");
              viewer.appendToHistoryTextField(textButton);
          }
       }
    } else if(command.equals("Div")) {
      if (!viewer.textField.getText().isEmpty() || !viewer.textFieldHistory.getText().isEmpty()) {
          if (inputExpression.endsWith(" ")) {
              textButton = "";
          } else {
              inputExpression = inputExpression + " " + "\u00F7" + " ";
              textButton = "/";
              viewer.textField.setText("");
              viewer.appendToHistoryTextField(textButton);
          }
       }
    } else if(command.equals("Dot")) {
      if (viewer.textField.getText().isEmpty() && viewer.textFieldHistory.getText().isEmpty()) {
              textButton = "";
          } else {
              inputExpression = inputExpression + ".";
              textButton = ".";
              viewer.appendToResultTextField(textButton);
              viewer.appendToHistoryTextField(textButton);
          }
    } else if(command.equals("Zero")) {
        inputExpression = inputExpression + "0";
        textButton = "0";
        viewer.appendToResultTextField(textButton);
        viewer.appendToHistoryTextField(textButton);
    } else if (command.equals("Clear")) {
        viewer.textField.setText("");
        viewer.textFieldHistory.setText("");
        inputExpression = "";

      } else if (command.equals("Answer")) {
      viewer.textField.setText("");
      viewer.textFieldHistory.setText("");
      double answer = rpn.infixToPostfix(inputExpression);
      String result;
      int dotIndex = String.valueOf(answer).indexOf(".");
      if (dotIndex != -1 && dotIndex < String.valueOf(answer).length() - 1) {
          char nextChar = String.valueOf(answer).charAt(dotIndex + 1);
          if (nextChar == '0') {
              result = String.valueOf(Math.round(answer));
          } else {
              result = String.valueOf(answer);
          }
      } else {
          result = String.valueOf(answer);
      }
      viewer.appendToResultTextField(result);
      inputExpression = result;
    }
  }
}
