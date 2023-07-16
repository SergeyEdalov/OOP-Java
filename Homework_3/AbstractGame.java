package Homeworks.Homework_3;

import java.util.*;

public abstract class AbstractGame implements Game {
    Integer sizeWord;
    Integer maxTry;
    int currentTry;
    String computerWord;
    GameStatus gameStatus = GameStatus.INIT;
    Integer typeGame;

    @Override
    public void start(Integer sizeWord, Integer maxTry) {
        this.sizeWord = sizeWord;
        this.maxTry = maxTry;
        computerWord = generateWord();
        System.out.println("comp:  " + computerWord);
        this.gameStatus = GameStatus.START;
        this.currentTry = 0;
    }

    @Override
    public Answer inputValue(String value) {
        if (currentTry >= maxTry) {
            gameStatus = GameStatus.FINISH;
            System.out.println("вы проиграли по количеству попыток");
            return null;
        }
        int bull = 0;
        int cow = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == computerWord.charAt(i)) {
                bull++;
                cow++;
            } else if (computerWord.contains(String.valueOf(value.charAt(i)))) {
                cow++;
            }
        }
        currentTry++;
        if (sizeWord.equals(bull)) {
            gameStatus = GameStatus.FINISH;
            System.out.println("вы Победили!!");
            return null;
        }
        return new Answer(bull, cow, currentTry);
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    abstract List<String> generateCharList();

    private String generateWord() {
        List<String> charList = generateCharList();
        String result = "";
        Random random = new Random();
        for (int i = 0; i < sizeWord; i++) {
            int randomIndex = random.nextInt(charList.size());
            result += charList.get(randomIndex);
            charList.remove(randomIndex);
        }
        return result;
    }

    /**
     * @param gameStatus - статус игры
     * @return - тип игры
     * @apiNote Выбор игры. Получение вводных данных от пользователя
     */
    public Integer getTypeGame(GameStatus gameStatus) {
        Map<Integer, String> variableGame = new HashMap<>();
        variableGame.put(1, "Игра с числами");
        variableGame.put(2, "Игра с русским алфавитом");
        variableGame.put(3, "Игра с английским алфавитом");
        if (gameStatus == GameStatus.INIT) {
            System.out.println("Выберите игру");
            for (Map.Entry<Integer, String> entry : variableGame.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
        Scanner scanner = new Scanner(System.in);
        typeGame = scanner.nextInt();
        return typeGame;
    }

    /**
     * @param typeGame - тип игры
     * @return - экземпляр игры (числа, русский, английский)
     * @apiNote Выбор игры. Определение экземпляра игры
     */
    public AbstractGame setTypeGame(Integer typeGame) {
        AbstractGame game = new NumberGame();
        switch (typeGame) {
            case (1):
                game = new NumberGame();
                break;
            case (2):
                game = new RussianGame();
                break;
            case (3):
                game = new EnglishGame();
                break;
        }
        return game;
    }

    /**
     * @apiNote Перезапуск игры в конце
     */
    @Override
    public void restart() {
        if (gameStatus == GameStatus.FINISH) {
            System.out.println("Хотите начать новую игру?");
            System.out.println("1 - Да   2 - Нет");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number == 1) {
                System.out.println("Введите максимально количество символов и количество попыток");
                start(scanner.nextInt(), scanner.nextInt());
            }
        }
    }
}
