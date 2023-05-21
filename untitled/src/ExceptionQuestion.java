public class ExceptionQuestion {
    public int number = 0;
    public void start() throws Exception {
        try {
            number++;
            try {
                number++;
                try {
                    number++;
                    throw new Exception();
                } catch (Exception ex) {
                    number++;
                    throw new Exception();
                }
            } catch (Exception ex) {
                number++;
            }
        } catch (Exception ex) {
            number++;
        }
    }
public void display() {
    System.out.println(number);
}
public static void main(String[] args) throws Exception {
        ExceptionQuestion eq = new ExceptionQuestion();
        eq.start();
        eq.display();
    }
}