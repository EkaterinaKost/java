package lesson_2;

/*
Дана строка (получение через обычный текстовый файл!!!)
"фамилия":"Иванов","оценка":"5","предмет":"Математика"
"фамилия":"Петрова","оценка":"4","предмет":"Информатика"
Написать метод(ы), который распарсит строку и, используя StringBuilder, 
создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет].
Пример вывода в консоль:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class task_2 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("database.txt"))) {
            transformationText(br);
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }

    }

    private static void transformationText(BufferedReader br) throws IOException {
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split("[,:]");
            String surname = data[1].replace("\"", "");
            String mark = data[3].replace("\"", "");
            String subject = data[5].replace("\"", "");
            StringBuilder sb = new StringBuilder();
            sb.append("Студент " + surname + " получил " + mark + " по предмету " + subject + ".");
            System.out.println(sb);
        }
    }
}
