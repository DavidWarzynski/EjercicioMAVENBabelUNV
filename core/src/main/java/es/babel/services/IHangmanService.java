package es.babel.services;

public interface IHangmanService {
    void startNewGame(String targetWord);
    void guessLetter(char letter);
    void guessWord(String word);
    String getMaskedWord();
    boolean isGameWon();
    boolean isGameOver();
    String getTargetWord();
    int getRemainingAttempts();
}
