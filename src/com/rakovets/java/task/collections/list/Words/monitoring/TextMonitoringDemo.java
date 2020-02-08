package com.rakovets.java.task.collections.list.Words.monitoring;

public class TextMonitoringDemo {
    public static void main(String[] args) {
        TextMonitoring textMonitoring = new TextMonitoring("I have many hobbies because there are many interesting things to do. Unfortunately I don't have much spare time as I'm going to be a student. That's why I have to study a lot. I like doing different things: Such as reading detective stories, listening to the music, playing tennis with my classmates. But my favorite hobby is solving crossword puzzles. It's not only interesting, but also very useful. When you try to solve the puzzle you find out and learn a lot of different facts. Because in puzzles there are questions about famous people, geographical places, countries, scientific achievements and so on. You also train your brain. The crosswords are published in newspapers and magazines and there are special newspapers that contain only crosswords. I sometimes try to make up my own puzzle and I can say that it is not less interesting. All the members of our family like to take part in solving the puzzles and this unites us very much.");
        textMonitoring.researchText();
    }
}
