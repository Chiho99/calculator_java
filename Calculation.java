import java.util.Scanner;
import java.text.NumberFormat;
class Calculation {
  private int num1;
  private int num2;
  private String operator;
  private int result;

  Color color = new Color();

  public void fourArithRule(String operator){
    if(operator.equals("+")){
      result = num1 + num2;
    } else if(operator.equals("-")) {
      result = num1 - num2;
    } else if(operator.equals("*")) {
      result = num1 * num2;
    } else if(operator.equals("/")) {
      result = num1 / num2;
    } else {
      result = 000000;
    }
  }

  public void inputFormula(){
    Scanner scanner = new Scanner(System.in);
    System.out.println(color.cyan + "~~ YOUR FORMULA ~~" + color.end);
    System.out.print("Input Number:");
    num1 = scanner.nextInt();
    System.out.print("Input Operator[ + - * / ]:");
    operator = scanner.next();
    System.out.print("Input Number:");
    num2 = scanner.nextInt();
  }

  public void calDef(){
    inputFormula();
    fourArithRule(operator);
    // comma
    NumberFormat comma = NumberFormat.getNumberInstance();  
    System.out.println(color.red + "Result: " + color.end + comma.format(result));
    System.out.println("\n");
  }
}