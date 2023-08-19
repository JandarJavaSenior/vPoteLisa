package Insata;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String redColorCode = "\u001B[31m";
        String resetColorCode = "\u001B[0m";




        Comment comment = new Comment("Огонь!", LocalDate.of(2023,7,3));
        Comment comment1 = new Comment("Красавчик!", LocalDate.of(2023,7,3));
        Comment comment2 = new Comment("Я люблю вас Жандар байкеее!", LocalDate.of(2023,7,3));
        Comment comment3 = new Comment("Огонь!", LocalDate.of(2023,7,3));
        Comment[] comments = {comment,comment1,comment2,comment3};

        Comment comment4 = new Comment("Вкусно выглядит!", LocalDate.of(2023,7,3));
        Comment comment5 = new Comment("Я люблю вас Жандар байкеее!", LocalDate.of(2023,7,3));
        Comment comment6 = new Comment("Таш Братан!!!", LocalDate.of(2023,7,3));
        Comment[] comments1 = {comment4,comment5,comment6};

        Comment comment7 = new Comment("Хахахахаха!", LocalDate.of(2023,7,3));
        Comment comment8 = new Comment("Жаным го!", LocalDate.of(2023,7,3));
        Comment comment9 = new Comment("Поздравляю Жан!", LocalDate.of(2023,7,3));
        Comment[] comments2 = {comment7,comment8,comment9};

        Post post = new Post("            \"************\",\n" +
                "            \"*          *\",\n" +
                "            \"*   O      *\",\n" +
                "            \"*  /|\\     *\",\n" +
                "            \"*  / \\     *\",\n" +
                "            \"*          *\",\n" +
                "            \"************\"" +
                "\nЖандар гордо стоит у подноьжя горы",
                "ТОЛЬКО ТЕ, КТО РИСКУЮТ ДАЛЕКО ЗАЙТИ, МОГУТ УЗНАТЬ, НАСКОЛЬКО ДАЛЕКО МОЖНО ЗАЙТИ",
                LocalDate.of(2023,7,2),comments);
        Post post1 = new Post("Жандар фотает манты который выглядит очень аппетитно",
                "Едят только те, кто ест!  (с) Стэтхэм.",
                LocalDate.of(2023,7,2),comments1);
        Post post2 = new Post("Жандар выйграл чемпионат по программированию",
                "Делай как надо, как не надо не делай. (с) Стэтхэм.",
                LocalDate.of(2023,7,2),comments2);




        Comment comment10 = new Comment("Огонь!", LocalDate.of(2023,7,3));
        Comment comment11 = new Comment("Красавчик!", LocalDate.of(2023,7,3));
        Comment comment12 = new Comment("Пушка!", LocalDate.of(2023,7,3));
        Comment comment13 = new Comment("вашшее Огонь!", LocalDate.of(2023,7,3));
        Comment[] comments3 = {comment10,comment11,comment12,comment13};

        Comment comment14 = new Comment("Прекрасно выглядит!", LocalDate.of(2023,7,3));
        Comment comment15 = new Comment("байкеее!", LocalDate.of(2023,7,3));
        Comment comment16 = new Comment("Братан!!!", LocalDate.of(2023,7,3));
        Comment[] comments4 = {comment14,comment15,comment16};

        Comment comment17 = new Comment("Хахахахаха!", LocalDate.of(2023,7,3));
        Comment comment18 = new Comment("Лол!", LocalDate.of(2023,7,3));
        Comment comment19 = new Comment("Честно говоря, по моему скромному" +"\n"+
                " мнению и, не желая обидеть никого в комментах," +"\n"+
                " чьё мнение отличается от моего, но все-же, " +"\n"+
                "рассматривая этот вопрос с другой точки зрения," +"\n"+
                " в то же время, не опротестовывая ничью позицию и," +"\n"+
                " стараясь быть объективным, а также принимая во внимание все без исключения аргументы," +"\n"+
                " других участников обсуждения, искренне пологаю, " +"\n"+
                "что я целиком и полностью забыл нахер что сказать!"+"\n", LocalDate.of(2023,7,3));
        Comment[] comments5 = {comment17,comment18,comment19};


        Post post3 = new Post("Какое нибуть достижение Жандара",
                "смог!",
                LocalDate.of(2023,7,2),comments3);
        Post post4 = new Post("Жандар прыгает на огромной тарзанки",
                "Аааааааааа!  (с) Стэтхэм.",
                LocalDate.of(2023,7,2),comments4);
        Post post5 = new Post("Жандар показал очень смешной мем!",
                "Я в своем познании настолько преисполнился, что я как будто бы уже\n" +
                        "сто триллионов миллиардов лет проживаю на триллионах и\n" +
                        "триллионах таких же планет, как эта Земля, мне этот мир абсолютно\n" +
                        "понятен, и я здесь ищу только одного - покоя, умиротворения и\n" +
                        "вот этой гармонии, от слияния с бесконечно вечным, от созерцания\n" +
                        "великого фрактального подобия и от вот этого замечательного всеединства\n" +
                        "существа, бесконечно вечного, куда ни посмотри, хоть вглубь - бесконечно\n" +
                        "малое, хоть ввысь - бесконечное большое, понимаешь? А ты мне опять со\n" +
                        "своим вот этим, иди суетись дальше, это твоё распределение, это\n" +
                        "твой путь и твой горизонт познания и ощущения твоей природы, он\n" +
                        "несоизмеримо мелок по сравнению с моим, понимаешь? Я как будто бы уже\n" +
                        "давно глубокий старец, бессмертный, ну или там уже почти бессмертный,\n" +
                        "который на этой планете от её самого зарождения, ещё когда только Солнце\n" +
                        "только-только сформировалось как звезда, и вот это газопылевое облако,\n" +
                        "вот, после взрыва, Солнца, когда оно вспыхнуло, как звезда, начало\n" +
                        "формировать вот эти коацерваты, планеты, понимаешь, я на этой Земле уже\n" +
                        "как будто почти пять миллиардов лет живу и знаю её вдоль и поперёк\n" +
                        "этот весь мир, а ты мне какие-то... мне не важно на твои тачки, на твои\n" +
                        "яхты, на твои квартиры, там, на твоё благо. ",
                LocalDate.of(2023,7,2),comments5);
        Post[] posts = {post,post1,post2,post3,post4,post5};



        Profile profile = new Profile("Жандар Таалайбеков Таалайбекович",
                LocalDate.of(2001,8,17),"Men",posts);
        Profile profile1 = new Profile("Almazbek Atanbaev",
                LocalDate.of(1996,8,17),"Female",posts);
        Profile profile2 = new Profile("Amantur",
                LocalDate.of(1996,8,17),"Female",posts);


        UserName userName1 = new UserName("Jandar.io","xp3335@gmail.com","jandar1",profile);
        UserName userName = new UserName("Almazbek Atanbaev","almake@gmail.com","Alma",profile1);
        UserName userNam = new UserName("Sooronbay Jeenbekov","soke@gmail.com","soke",profile2);
        UserName userNa = new UserName("Sadur Japarov","chopa@gmail.com","sake",profile);

        UserName[] userNames = {userName1,userName};
        Profile[] profiles = {profile,profile1};




        DataBase dataBase = new DataBase(userNames,profiles);


        System.out.println(redColorCode +"Этот шедевр в единственном экземпляре, не судить строго"+ resetColorCode);
        System.out.println(redColorCode +"Строго запускать! через RAN RAN"+ resetColorCode);
        System.out.println(redColorCode +"Советую посмотреть все коментарии есть пасхалки,и мемы;)"+ resetColorCode);
        System.out.println(redColorCode +"Надеюсь многочсовой труд оправдает свои ожидания, Кстати Айназик я сделал кастомер)"+ resetColorCode);

        while (true) {
            System.out.println();
            System.out.println();
            System.out.println("Меню:");
            System.out.println("1. Сохранить новый Акк");
            System.out.println("2. Поиск Пользователя по ID");
            System.out.println("3. Обновление Профиля по ID Пользователя");
            System.out.println("4. Удаление Пользователя по ID");
            System.out.println("5. Сохранить новый Профиль по ID");
            System.out.println("6. Поиск Профиля по ID");
            System.out.println("7. Удаление Профиля по ID");
            System.out.println("8. Сохранить пост Профилю и по ID");
            System.out.println("9. Поиск фото по ID");
            System.out.println("10.Поиск фото по Описанию");
            System.out.println("11.Удалить пост по ID");
            System.out.println("12.Поиск фото по Описанию");
            System.out.println("13.Поиск Коментария по ID поста!");
            System.out.println("14.Обнавление Коментария по ID!");
            System.out.println("15.Удалить Коментарий!");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Вы выбрали Сохранить новый Акк");
                    System.out.println(redColorCode +"До сохранение: " + resetColorCode);
                    System.out.println(Arrays.toString(userNames));
                    System.out.println(redColorCode + "После сохранения: " + resetColorCode);
                    System.out.println(Arrays.toString(dataBase.saveUser(userNam)));
                    break;
                case 2:
                    System.out.println("Вы выбрали Поиск Пользователя по ID");
                    System.out.println("Введите ID Пользователя: ");
                    dataBase.poiskUser(scanner.nextInt());
                    break;
                case 3:
                    System.out.println("Вы выбрали Обновление Профиля по ID ПользователяD");
                    System.out.println("Введите ID Пользователя: ");
                    dataBase.updeitPfofil(1,profile2);
                    System.out.println(redColorCode +"Обнавлено с этого: "+ resetColorCode);
                    System.out.println(profile);
                    System.out.println(redColorCode +"На это: "+ resetColorCode);
                    System.out.println(profile2);
                    break;
                case 4:
                    System.out.println("Вы выбрали Удаление Пользователя по ID");
                    System.out.println("Введите ID Пользователя: ");
                    int i = (scanner.nextInt());
                    System.out.println(redColorCode +"До Удаления: " + resetColorCode);
                    System.out.println(Arrays.toString(dataBase.getUserName()));
                    System.out.println(redColorCode + "После Удаления: " + resetColorCode);
                    dataBase.deleteUzer(i);
                    System.out.println(Arrays.toString(dataBase.getUserName()));

                    break;
                case 5:
                    System.out.println("Вы выбрали Сохранить новый Профиль по ID");
                    System.out.println(redColorCode +"До сохранение: " + resetColorCode);
                    System.out.println(Arrays.toString(dataBase.getProfile()));
                    System.out.println(redColorCode + "После сохранения: " + resetColorCode);
                    System.out.println(Arrays.toString(dataBase.saveProfilllll(4, profile2)));
                    break;
                case 6:
                    System.out.println("Вы выбрали Поиск Профиля по ID");
                    System.out.println(Arrays.toString(dataBase.getProfile()));
                    System.out.println("Введите ID Профиля: ");
                    System.out.println(dataBase.poiskProfile(scanner.nextInt()));
                    break;
                case 7:
                    System.out.println("Вы выбрали Удаление Профиля по ID");
                    System.out.println(redColorCode +"Пожалуста обратите внимание на ID !!!"+ resetColorCode);
                    System.out.println("Введите ID Профиля: ");
                    int o = scanner.nextInt();
                    System.out.println(redColorCode +"До Удаления: " + resetColorCode);
                    System.out.println(Arrays.toString(dataBase.getProfile()));
                    System.out.println(redColorCode + "После Удаления: " + resetColorCode);
                    System.out.println(Arrays.toString(dataBase.deleteProffle(o)));
                    break;
                case 8:
                    System.out.println("Вы выбрали Сохранить пост по ID Профилю и по ID Поста");
                    System.out.println("Введите ID Профиля: ");
                    int q = scanner.nextInt();
                    System.out.println(dataBase.savePost(q, post5));
                    break;
                case 9:
                    System.out.println("Вы выбрали Поиск фото по ID");
                    System.out.println("Введите ID: ");
                    dataBase.poiskPost(scanner.nextInt());
                    break;
                case 10:
                    System.out.println("Вы выбрали Поиск фото по Описанию");
                    System.out.println("Введите слово: ");
                    userName.seachPost(scanner.next());
                    break;
                case 11:
                    System.out.println("Вы выбрали Удалить пост по ID");
                    System.out.println("Введите ID: ");
                    userName.deletePostById(scanner.nextInt());
                    break;
                case 12:
                    System.out.println("Вы выбрали Сохранить Коментарии по ID");
                    System.out.println("Введите ID Поста!: ");
                    int e = scanner.nextInt();
                    System.out.println("Введите ID Поста!: ");
                    int w = scanner.nextInt();
                    dataBase.saveComment(e,w,comment5);
                    break;
                case 13:
                    System.out.println("Вы выбрали Поиск Коментария по ID поста!");
                    System.out.println("Введите ID Поста!: ");
                    System.out.println("Рекомендую посмотреть все 6 постов!");
                    profile.commentsssss(scanner.nextInt());
                    break;
                case 14:
                    System.out.println("Вы выбрали Обнавление Коментария по ID !");
                    System.out.println("Введите ID!: ");
                    int n = scanner.nextInt();
                    System.out.println("Введите Коментарий: ");
                    String m = scanner.next();
                    profile.updateComment(n,m);
                    break;
                case 15:
                    System.out.println("Вы выбрали Удалить Коментарий!");
                    profile.deleteComment(comment);
                    break;
                case 0:
                    System.out.println("Заверщение прекрасной программы Жандара!");

                    return;
                default:
                    System.out.println("Неправильный выбор. Пожалуйста, выберите снова.");
            }
        }

    }
}