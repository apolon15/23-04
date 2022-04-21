
import java.util.*;

public class Main {


    public static void main(String[] args) {
        /*
	0 Напишите Java-программу для итерации объекта типа HashMap с использованием цикла while и улучшенного цикла for.
	 */
//        Map<String, String> myMap = new HashMap<String, String>();
//        myMap.put("Иванова", "222388");
//        myMap.put("Суривонич", "123458");
//        myMap.put("Левашин", "9877680");
//        myMap.put("Покровский", "11128");
//        myMap.put("Жданов", "75438");
//        myMap.put("Каршин", "9394864");
//        myMap.put("Иванова", "7788");
//        myMap.put("Сидорова", "774388");
//        Iterator<Map.Entry<String, String>> it = myMap.entrySet().iterator();
//        while (it.hasNext()) {
//            String text = it.next().getKey();
//            System.out.println("Длинна фамилии \"" + text + "\" равна " +
//                    text.length() + " букв");
//            System.out.println("**************");
//
//            for (String txt : myMap.keySet()) {
//                System.out.println(txt + " " + myMap.get(txt));
//            }
//        }
/*
1 Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Product).
 Перебрать и распечатать пары значений - entrySet().-----**perebor3();
Перебрать и распечатать набор из имен продуктов  - keySet().----**perebor2();
Перебрать и распечатать значения продуктов - values().----**perebor1();
Для каждого перебора создать свой метод.
 */

        HashMap<String, ProductToys> toysMap = new HashMap();
        ProductToys p1 = new ProductToys("самолет", 2012);
        ProductToys p2 = new ProductToys("паровоз", 2000);
        ProductToys p3 = new ProductToys("самосвал", 2004);
        ProductToys p4 = new ProductToys("кукла", 2018);
        ProductToys p5 = new ProductToys("пистолет", 2020);
        ProductToys p6 = new ProductToys("ракета", 2021);
        ProductToys p7 = new ProductToys("мяч", 2003);

        toysMap.put("Летчик ", p1);
        toysMap.put("Чух-чух ", p2);
        toysMap.put("Ррррр ", p3);
        toysMap.put("Маша ", p4);
        toysMap.put("Макаров ", p5);
        toysMap.put("Гагарин ", p6);
        toysMap.put("Круглик ", p7);

//        Collection<ProductToys> listProduct = new LinkedList<>();
//        listProduct = toysMap.values();
//        System.out.println(listProduct);
//        System.out.println("***********");
//        System.out.println("\nТовар,значение");
//        toysMap.entrySet().forEach(x -> System.out.println(x.getValue()));
//        System.out.println("***********");
//        System.out.println("\nИмена продуктов(игрушек)");
//        for (Map.Entry<String, ProductToys> name : toysMap.entrySet()) {
//            System.out.println(name.getKey());
//        }
//        System.out.println("***********");
//        Collection<String> collectionName = new LinkedList<>();
//        collectionName = toysMap.keySet();
//        System.out.println("Иммена игрушек через keySet ");
//        for (String name : collectionName) {
//            System.out.println(name);
//   }
        System.out.println("***********");

        perebor1(toysMap);
        //    perebor2(toysMap);
        //   perebor3(toysMap);

        /*
        2 Добавить студентов в коллекцию. Создать класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
         Создать коллекцию, содержащую объекты класса Student.
Написать метод, который удаляет студентов со средним баллом <3.
Если средний балл>=3, студент переводится на следующий курс.
Напишите метод printStudents(List<Student> students, int course), который получает список студентов и номер курса.
Напечатат на консоль имена тех студентов из списка, которые обучаются на данном курсе.

         */

        Map<String, Integer> marksS1 = new TreeMap<String, Integer>();
        marksS1.put("Математика", 10);
        marksS1.put("Дипломатия", 10);
        marksS1.put("Культура", 10);
        marksS1.put("IT", 10);
        marksS1.put("История", 10);
        marksS1.put("Маркетинг", 5);

        Map<String, Integer> marksS2 = new TreeMap<String, Integer>();
        marksS2.put("Математика", 1);
        marksS2.put("Дипломатия", 2);
        marksS2.put("Культура", 3);
        marksS2.put("IT", 2);
        marksS2.put("История", 1);
        marksS2.put("Маркетинг", 1);

        Map<String, Integer> marksS3 = new TreeMap<String, Integer>();
        marksS3.put("Математика", 2);
        marksS3.put("Дипломатия", 1);
        marksS3.put("Культура", 2);
        marksS3.put("IT", 1);
        marksS3.put("История", 2);
        marksS3.put("Маркетинг", 1);

        Map<String, Integer> marksS4 = new TreeMap<String, Integer>();
        marksS4.put("Математика", 2);
        marksS4.put("Дипломатия", 10);
        marksS4.put("Культура", 10);
        marksS4.put("IT", 2);
        marksS4.put("История", 3);
        marksS4.put("Маркетинг", 10);

        Map<String, Integer> marksS5 = new TreeMap<String, Integer>();
        marksS5.put("Математика", 9);
        marksS5.put("Дипломатия", 9);
        marksS5.put("Культура", 5);
        marksS5.put("IT", 4);
        marksS5.put("История", 5);
        marksS5.put("Маркетинг", 5);

        Student s1 = new Student("Фредди Меркьюри", marksS1, "Робототехника", 4);
        Student s2 = new Student("Фредди Крюгер", marksS2, "Маркетинг", 2);
        Student s3 = new Student("Билл Хофман", marksS3, "Логистика", 3);
        Student s4 = new Student("Ангела Меркель", marksS4, "Туризм", 3);
        Student s5 = new Student("Элтон Джон", marksS5, "Финансы и бизнес", 1);

        ArrayList<Student> listStudent = new ArrayList<Student>();
        listStudent.add(s1);
        listStudent.add(s2);
        listStudent.add(s3);
        listStudent.add(s4);
        listStudent.add(s5);
        System.out.println(listStudent);
        System.out.println("*/***********/////*****");
//        System.out.println(del(listStudent));
        System.out.println(upCurse(listStudent));
        //       printStudents(listStudent, 2);


    }

    /*
    ----------------------------------методы для работы -------------------------------
     */
    public static void printStudents(ArrayList<Student> listStudent, int course) {
        boolean chek = true;
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getCours() == course) {
                chek = false;
                System.out.println(listStudent.get(i).getName());
            }
        }
        if (chek) {
            System.out.println("Таких студентв нет ");
        }
    }


    public static List<Student> upCurse(ArrayList<Student> listStudent) {
        listStudent.stream().forEach(x -> {
            if (x.getAvg() >= 3) {
                x.setCours(x.getCours() + 1);
            }
        });
//        for (Student s : listStudent) {
//            if (s.getAvg() >= 3) {
//                s.setCours(s.getCours() + 1);
//            }
//        }
        return listStudent;
    }


    public static List<Student> del(ArrayList<Student> listStudent) {

        Iterator<Student> it = listStudent.iterator();
        while (it.hasNext()) {
            if (it.next().getAvg() < 3) {
                it.remove();
            }
        }
        return listStudent;
    }


    public static void perebor3(Map<String, ProductToys> map) {
        System.out.println("\nИмена продуктов(игрушек)");
        for (Map.Entry<String, ProductToys> name : map.entrySet()) {
            System.out.println(name.getKey() + " " + name.getValue());
        }
    }

    public static void perebor2(Map<String, ProductToys> map) {
        System.out.println("Иммена игрушек через keySet ");
        for (String name : map.keySet()) {
            System.out.println(name);
        }

    }

    public static void perebor1(Map<String, ProductToys> map) {
        System.out.println("\nТовар,значение(values)");
        map.values().stream().forEach(x -> System.out.println(x));
    }
}
