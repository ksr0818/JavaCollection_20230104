package Enum;

enum Level { LOW, MEDIUM, HIGH}


public class Main {
    public static void main(String[] args) {
        Level level = Level.MEDIUM;

        switch (level){
            case LOW:
                System.out.println("낮은 레벨");
                break;
            case MEDIUM:
                System.out.println("중간 레벨");
                break;
            case HIGH:
                System.out.println("높은 레벨");
                break;

        }
    }
}