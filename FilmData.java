package a1407229.lundy.com.movie_lundy;

import java.util.ArrayList;

public class FilmData {
    public static String[][] data = new String[][]{
                {"Venom", "IDR 25000",
                        "https://m.media-amazon.com/images/M/MV5BNzAwNzUzNjY4MV5BMl5BanBnXkFtZTgwMTQ5MzM0NjM@._V1_UX182_CR0,0,182,268_AL_.jpg"},
                        {"Mission Impossible", "IDR 25000",
                                "https://m.media-amazon.com/images/M/MV5BMTk3NDY5MTU0NV5BMl5BanBnXkFtZTgwNDI3MDE1NTM@._V1_UY268_CR0,0,182,268_AL_.jpg"},
                                {"Bacharuddin Jusuf Habibie", "Presiden Ketiga RI",
                                        "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Bacharuddin_Jusuf_Habibie_official_portrait.jpg/520pxBacharuddin_Jusuf_Habibie_official_portrait.jpg"},
                                        {"Abdurrahman Wahid", "Presiden Keempat RI",
                                                "https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/President_Abdurrahman_Wahid_-_Indonesia.jpg/486px-President_Abdurrahman_Wahid_-_Indonesia.jpg"},
                                                {"Megawati Soekarnoputri", "Presiden Kelima RI",
                                                        "https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/President_Megawati_Sukarnoputri_-_Indonesia.jpg/540px-President_Megawati_Sukarnoputri_-_Indonesia.jpg"},
                                                        {"Susilo Bambang Yudhoyono", "Presiden Keenam RI",
                                                                "https://upload.wikimedia.org/wikipedia/commons/5/58/Presiden_Susilo_Bambang_Yudhoyono.png"},
                                                                {"Joko Widodo", "Presiden Ketujuh RI",
                                                                        "https://upload.wikimedia.org/wikipedia/commons/1/1c/Joko_Widodo_2014_official_portrait.jpg"}
                                                                };
        public static ArrayList<Film> getListData(){
            Film film = null;
            ArrayList<Film> list = new ArrayList<>();
            for (int i = 0; i <data.length; i++) {
                film = new Film();
                film.setName(data[i][0]);
                film.setRemarks(data[i][1]);
                film.setPhoto(data[i][2]);
                list.add(film);}
            return list;
        }
    }

