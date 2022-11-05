package Enum;

public enum Apple {
    Jonhatan(10), GoldenDel(9), RedDel('t'), Winsap(15), Cortland(8);

    private int price;
    private char ch;

    Apple(int p) {
        price = p;
    }

    Apple(char c) {
        ch = c;
    }
    Apple(){

    }

    int getPrice() {
        return price;
    }

}
