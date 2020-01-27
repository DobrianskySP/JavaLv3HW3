package ru.dobrianskysp;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        String[] originword = {"День", "аптека", "фонарь", "дождь", "зима", "Дом", "брюхо", "полю", "денежку","Мухе", "Тараканы", "самовар", "имбирь", "чаем", "букашки", "три", "четыре", "крендельком", "сапожки", "уголок", "Чуковский", "Мухе", "Именинница"};

        LinkedList<String> words = new LinkedList<>();
        for (int i = 0; i < originword.length; i++) {
            words.add(originword[i]);
        }

        HashMap<Integer, String> hm = new HashMap<>();
        for (int i = 0; i < originword.length; i++) {
            hm.put(i, originword[i]);
        }

        String stih = "Муха Муха Цокотуха\n" +
                "Позолоченное брюхо\n" +
                "Муха по полю пошла\n" +
                "Муха денежку нашла\n" +
                "Пошла Муха на базар\n" +
                "И купила самовар\n" +
                "Приходите тараканы\n" +
                "Я вас чаем угощу\n" +
                "Тараканы прибегали\n" +
                "Все стаканы выпивали\n" +
                "А букашки\n" +
                "По три чашки\n" +
                "С молоком\n" +
                "И крендельком\n" +
                "Нынче Муха Цокотуха\n" +
                "Именинница\n" +
                "Приходили к Мухе блошки\n" +
                "Приносили ей сапожки\n" +
                "А сапожки не простые\n" +
                "В них застежки золотые\n" +
                "Приходила к Мухе\n" +
                "Бабушка пчела\n" +
                "Мухе Цокотухе\n" +
                "Меду принесла\n" +
                "Бабочка красавица\n" +
                "Кушайте варенье\n" +
                "Или вам не нравится\n" +
                "Наше угощенье\"\n" +
                "Вдруг какой то старичок\n" +
                "Паучок\n" +
                "Нашу Муху в уголок\n" +
                "Поволок\n" +
                "Хочет бедную убить\n" +
                "Цокотуху погубить\n" +
                "Дорогие гости помогите\n" +
                "Пауказлодея зарубите\n" +
                "И кормила я вас\n" +
                "И поила я вас\n" +
                "Не покиньте меня\n" +
                "В мой последний час\n" +
                "Но жуки червяки\n" +
                "Испугалися\n" +
                "По углам по щелям\n" +
                "Разбежалися\n" +
                "Тараканы\n" +
                "Под диваны\n" +
                "А козявочки\n" +
                "Под лавочки\n" +
                "А букашки под кровать\n" +
                "Не желают воевать\n" +
                "И никто даже с места\n" +
                "Не сдвинется\n" +
                "Пропадай погибай\n" +
                "Именинница\n" +
                "А кузнечик а кузнечик\n" +
                "Ну совсем как человечек\n" +
                "Скок скок скок скок\n" +
                "За кусток\n" +
                "Под мосток\n" +
                "И молчок\n" +
                "А злодей то не шутит\n" +
                "Руки ноги он Мухе верёвками крутит\n" +
                "Зубы острые в самое сердце вонзает\n" +
                "И кровь у неё выпивает\n" +
                "Муха криком кричит\n" +
                "Надрывается\n" +
                "А злодей молчит\n" +
                "Ухмыляется\n" +
                "Вдруг откуда то летит\n" +
                "Маленький Комарик\n" +
                "И в руке его горит\n" +
                "Маленький фонарик\n" +
                "Где убийца где злодей\n" +
                "Не боюсь его когтей\n" +
                "Подлетает к Пауку\n" +
                "Саблю вынимает\n" +
                "И ему на всём скаку\n" +
                "Голову срубает\n" +
                "Муху за руку берёт\n" +
                "И к окошечку ведёт\n" +
                "Я злодея зарубил\n" +
                "Я тебя освободил\n" +
                "И теперь душа-девица\n" +
                "На тебе хочу жениться\n" +
                "Тут букашки и козявки\n" +
                "Выползают из-под лавки\n" +
                "Слава слава Комару\n" +
                "Победителю\n" +
                "Прибегали светляки\n" +
                "Зажигали огоньки\n" +
                "То то стало весело\n" +
                "То то хорошо\n" +
                "Эй сороконожки\n" +
                "Бегите по дорожке\n" +
                "Зовите музыкантов\n" +
                "Будем танцевать\n" +
                "Музыканты прибежали\n" +
                "В барабаны застучали\n" +
                "Бом бом бом бом\n" +
                "Пляшет Муха с Комаром\n" +
                "А за нею Клоп Клоп\n" +
                "Сапогами топ топ\n" +
                "Козявочки с червяками\n" +
                "Букашечки с мотыльками\n" +
                "А жуки рогатые\n" +
                "Мужики богатые\n" +
                "Шапочками машут\n" +
                "С бабочками пляшут\n" +
                "Тара ра тара ра\n" +
                "Заплясала мошкара\n" +
                "Веселится народ\n" +
                "Муха замуж идёт\n" +
                "За лихого удалого\n" +
                "Молодого Комара\n" +
                "Муравей Муравей\n" +
                "Не жалеет лаптей\n" +
                "С Муравьихою попрыгивает\n" +
                "И букашечкам подмигивает\n" +
                "Вы букашечки\n" +
                "Вы милашечки\n" +
                "Тара тара тара тара таракашечки\n" +
                "Сапоги скрипят\n" +
                "Каблуки стучат\n" +
                "Будет будет мошкара\n" +
                "Веселиться до утра\n" +
                "Нынче Муха Цокотуха\n" +
                "Именинница";


        StringToArray arr = new StringToArray();
        arr.comparison(arr.linetoarray(stih), words); //LinkedList использую т.к. у него можно удалять элементы, так проще считать без повторений.
        System.out.println("------------------------------");
        arr.howmanytimeshashmap(arr.linetoarray(stih), hm); // количество совпадений слов реализовано с помощью HashMap(по сути реализация метода ничем не отличается от реализации с помощью LinkedList)
        System.out.println("------------------------------");


    }
}
