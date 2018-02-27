package Day_0;

import java.util.HashMap;
import java.util.Map;

public class NameGenerator {

    private static String[] femaleNamesArray = {
        "Maria",
        "Lena",
        "Maja",
        "Hanna",
        "Zuzanna",
        "Julia",
        "Amelia",
        "Aleksandra",
        "Natalia",
        "Oliwia",
        "Maria",
        "Emilia",
        "Emma",
        "Laura",
        "Nadia",
        "Anna",
        "Pola",
        "Liliana",
        "Nikola",
        "Gabriela",
        "Iga",
        "Kornelia",
        "Martyna",
        "Marta",
        "Joanna",
        "Helena",
        "Jagoda",
        "Nina",
        "Agata",
        "Barbara",
        "Blanka",
        "Milena",
        "Michalina",
        "Marcelina",
        "Magdalena",
        "Weronika",
        "Kaja",
        "Kinga",
        "Paulina",
        "Klara",
        "Nela",
        "Sara",
        "Dominika",
        "Izabela",
        "Matylda",
        "Klaudia",
        "Ewa",
        "Eliza",
        "Kamila",
        "Rozalia",
        "Olga",
        "Malwina",
        "Daria",
        "Lidia",
        "Bianka",
        "Liwia",
        "Dorota",
        "Teresa",
        "Marianna",
        "Ada",
        "Mia",
        "Sandra",
        "Sabina",
        "Aurelia",
        "Roksana",
        "Marika",
        "Inga",
        "Justyna",
        "Melania",
        "Monika",
        "Ida",
        "Cecylia",
        "Tola",
        "Elena",
        "Diana",
        "Nel",
        "Adela",
        "Jadwiga",
        "Sonia",
        "Gaja",
        "Wanda",
        "Rita",
        "Celina",
        "Faustyna",
        "Lea",
        "Otylia",
        "Paula",
        "Estera",
        "Angelika",
        "Amanda",
        "Sylwia",
        "Ines",
        "Irena",
        "Lucyna",
        "Beata",
        "Klementyna",
        "Larysa",
        "Florentyna",
        "Ilona",
        "Iwona"
    };

    private static String[] maleNamesArray = {
        "Antoni",
        "Jan",
        "Filip",
        "Kacper",
        "Wojciech",
        "Adam",
        "Marcel",
        "Wiktor",
        "Igor",
        "Piotr",
        "Nikodem",
        "Mateusz",
        "Alan",
        "Ignacy",
        "Oliwier",
        "Tymon",
        "Leon",
        "Maks",
        "Oskar",
        "Dawid",
        "Dominik",
        "Karol",
        "Maciej",
        "Bruno",
        "Kamil",
        "Gabriel",
        "Natan",
        "Fabian",
        "Julian",
        "Hubert",
        "Patryk",
        "Sebastian",
        "Artur",
        "Eryk",
        "Adrian",
        "Kajetan",
        "Ksawery",
        "Cezary",
        "Daniel",
        "Damian",
        "Witold",
        "Robert",
        "Kornel",
        "Konrad",
        "Emil",
        "Henryk",
        "Marek",
        "Gustaw",
        "Iwo",
        "Teodor",
        "Dorian",
        "Jeremi",
        "Kordian",
        "Feliks",
        "Ludwik",
        "Florian",
        "Cyprian",
        "Maksym",
        "Samuel",
        "Hugo",
        "Tytus",
        "Roman",
        "Ernest",
        "Maurycy",
        "Edward",
        "Brajan",
        "Ksawier",
        "Roch",
        "Janusz",
        "Kaspian",
        "Leopold",
        "Gniewko",
        "Benedykt",
        "Kasper",
        "Klemens",
        "Marian",
        "Wincent",
        "Tomasz",
        "Cyryl",
        "Hektor",
        "Edgar",
        "Sylwester",
        "Lech",
        "Donald",
        "Zbigniew",
        "Hieronim",
        "Zenon",
        "Gustaw",
        "Logan",
        "Wilhelm",
        "Eugeniusz",
        "Dariusz",
        "Roland",
        "Alwin",
        "Lubomir",
        "Nataniel",
        "Walenty",
        "Tom",
        "Borys",
        "Alfred"
    };

    private static Map<String, String> surnameMap = new HashMap<String, String>() {
        {
            put("Nowak", "Nowak");
            put("Kowalska", "Kowalski");
            put("Kowalczyk", "Kowalczyk");
            put("Mazur", "Mazur");
            put("Michalska", "Michalski");
            put("Soszka", "Soszka");
            put("Gorol", "Gorol");
            put("Dudek", "Dudek");
            put("Malinowska", "Malinowski");
            put("Lis", "Lis");
            put("Krupa", "Krupa");
            put("Gajewska", "Gajewski");
            put("Kania", "Kania");
            put("Mrozek", "Mrozek");
            put("Hajda", "Hajda");
            put("Mucha", "Mucha");
            put("Konieczna", "Konieczny");
            put("Kozak", "Kozak");
            put("Polak", "Polak");
            put("Kurek", "Kurek");
            put("Wolska", "Wolski");
            put("Sowa", "Sowa");
            put("Klimek", "Klimek");
            put("Gajda", "Gajda");
            put("Nawrocka", "Nawrocki");
            put("Maj", "Maj");
            put("Socha", "Socha");
            put("Urban", "Urban");
            put("Kowal", "Kowal");
            put("Skiba", "Skiba");
            put("Romanowska", "Romanowski");
            put("Sobczyk", "Sobczyk");
            put("Olejnik", "Olejnik");
            put("Lisowska", "Lisowski");
            put("Czech", "Czech");
            put("Panek", "Panek");
            put("Cybulska", "Cybulski");
            put("Cichocka", "Cichocka");
            put("Pilipiak", "Pilipiak");
            put("Kaleta", "Kaleta");
            put("Witczak", "Witczak");
            put("Gawron", "Gawron");
            put("Trojanowska", "Trojanowski");
            put("Malec", "Malec");
            put("Hajduk", "Hajduk");
            put("Dobosz", "Dobsz");
            put("Bogucka", "Bogucki");
            put("Lach", "Lach");
            put("Kisiel", "Kisiel");
            put("Zaborowska", "Zaborowski");
            put("Lasota", "Lasota");
            put("Mroczek", "Mroczek");
            put("Wnuk", "Wnuk");
            put("Sobieraj", "Sobieraj");
            put("Pasternak", "Pasternak");
            put("Rosa", "Rosa");
            put("Florczak", "Florczak");
            put("Dubiel", "Dubiel");
            put("Gawenda", "Gawenda");
            put("Knapik", "Knapik");
            put("Puchalska", "Puchalski");
            put("Lipka", "Lipka");
            put("Kopacz", "Kopacz");
            put("Sojka", "Sojka");
            put("Piotrowicz", "Piotrowicz");
            put("Bogacz", "Bogacz");
            put("Miller", "Miller");
            put("Tkacz", "Tkacz");
            put("Potocka", "Potocki");
            put("Rokicka", "Rokicki");
            put("Olszak", "Olszak");
            put("Bugaj", "Bugaj");
            put("Bator", "Bator");
            put("Biela", "Biela");
            put("Nycz", "Nycz");
            put("Antkowiak", "Antkowiak");
            put("Machnik", "Machnik");
            put("Ziemba", "Ziemba");
            put("Zaleska", "Zaleski");
            put("Iwaniuk", "Iwaniuk");
            put("Kuta", "Kuta");
            put("Gajos", "Gajos");
            put("Stoch", "Stoch");
            put("Mateja", "Mateja");
            put("Widera", "Widera");
            put("Kulczycka", "Kulczycki");
            put("Bocian", "Bocian");
            put("Kobiela", "Kobiela");
            put("Klimkiewicz", "Klimkiewicz");
            put("Janecka", "Janecki");
            put("Zienkeiwicz", "Zienkiewicz");
            put("Lewandowska", "Lewandowski");
            put("Swoboda", "Swoboda");
            put("Winkler", "Winkler");
            put("Piwko", "Piwko");
            put("Chmielewska", "Chmielewski");
            put("Wawer", "Wawer");
            put("Kotecka", "Kotecki");
            put("Ulatowska", "Ulaowski");
            put("Rzepa", "Rzepa");
        }
    };

}
