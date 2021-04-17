public class Main {
    public static void main(String[] args) {
        System.out.println(WordNests.validWordNest("novel", "nonnonovnovnovelelelvelovelvel"));
        System.out.println(WordNests.validWordNest("novel", "nonnonovnovnovelelelvelovelvelnovel"));
        System.out.println(WordNests.validWordNest("novel", "novel"));
        System.out.println(WordNests.validWordNest("shape", "sssshapeshapehahapehpeape"));
    }
}
