public class Runner {
    public static void main(String[] args) {

        Task_1_ExtraSpacesRemover.remove("text.txt");
        Task_2_VowelAndConsonantCounter.count("text.txt");
        Task_3_PalindromesFinder.findAllPalindromes("text.txt");
        Task_4_ReverseOrderWords.print("text.txt");
        Task_5_DeleterWordsByN.delete(4, "text.txt");
        Task_6_CounterOfWordsWithSameFirstAndLastLetter.count('е', "text.txt");
        Task_7_FinderOfWordsByMinAndMaxLength.find("text.txt");
        Task_8_WordSwapperTheFirstWithTheLast.swap("text.txt");
        Task_9_DeleterDoubleSymbols.delete("text.txt");
        Task_10_SymbolChanger.change(2, '1', "text.txt");
        Task_11_DeleterEverythingBetweenParentheses.delete("text.txt");
        Task_12_TextFormatter.format("text.txt");
        Task_13_NumberOfRepetitions.count("text.txt");
    }
}