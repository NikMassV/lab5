public class Runner {
    public static void main(String[] args) {
        WordSwapperTheFirstWithTheLast.swap("text.txt");
        DeleterWordsByN.delete(5, "text.txt");
        VowelAndConsonantCounter.count("text.txt");
        SymbolChanger.change(2, '1', "text.txt");
    }
}