public class ExampleClassWithLongLine {
    public void methodWithLongLine() {
        String aVeryLongString = "This is a very long string that exceeds the maximum line length specified by Checkstyle. This line should trigger a violation.";
        System.out.println(aVeryLongString);
    }
}
