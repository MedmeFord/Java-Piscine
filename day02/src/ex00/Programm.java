package ex00;

public class Programm {
    public static void main(String[] args) {
        MyFileReader myFileReader = new MyFileReader("C:\\Users\\medme_lvuew0q\\OneDrive\\Рабочий стол\\"
            + "Tasks\\Java-Piscine\\day02\\src\\ex00\\signatyre.txt", "C:\\Users\\medme_lvuew0q\\OneDrive\\Рабочий стол\\"
                + "Tasks\\Java-Piscine\\day02\\src\\ex00\\tst – Main.java 20.12.2022 11_44_24.png");



        myFileReader.readFile();
    }
}
