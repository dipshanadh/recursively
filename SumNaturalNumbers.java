public class SumNaturalNumbers {
  public static void main(String[] args) {
    int input = 10;

    System.out.println("The sum of natural numbers upto " + 10 + " is: ");
    System.out.println(recursiveSummation(input));
  }

  public static int recursiveSummation (int inputNumber) {
    if (inputNumber <= 1) {
      return inputNumber;
    }

    return inputNumber + recursiveSummation(inputNumber - 1);
  }
}
