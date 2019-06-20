package com.genpro.safanalist.model;

import java.util.ArrayList;

public class SafanaData {

    //Offline text data

    public static String[][] data = {
            {"Yogurt Kecil", "Yogurt susu sehat dan enak dengan varian kecil ini lezat dan menyehatkan, dibuat oleh safana langsung yang InsyaAllah kandungan nya terjaga ", "https://user-images.githubusercontent.com/50002621/59831398-eab49e00-936b-11e9-9bcb-5b4a09a5254b.jpeg"},
            {"Yogurt Besar", "Yogurth enak Safana dalam varian yang lebih besar lezat, fresh, sehat dan masih banyak kebaikan yang kamu dapatkan dari Yogurt ini!", "https://user-images.githubusercontent.com/50002621/59831400-eb4d3480-936b-11e9-86fa-ed63019a3df7.jpeg"},
            {"Keju Mozarella", "Keju premium khas italia dari Safana, dapat disimpan dan bertahan lama di freezer, Premium dengan harga yang terjangkau", "https://user-images.githubusercontent.com/50002621/59831402-eb4d3480-936b-11e9-9648-ebf881fc6d3c.jpeg"},
            {"Yogurt aneka rasa", "Yogurt literan dengan rasa yang spesial dan enak, lebih murah, lezat, dapatkan segudang kebaikan yogurt disini!", "https://user-images.githubusercontent.com/50002621/59831403-ebe5cb00-936b-11e9-91e0-51d12a868466.jpeg"},
            {"Susu Kurma + Ekstrak daun katuk", "minuman super sehat, perpaduan susu, kurma dan daun katuk yang mempunyai khasiat masing masing", "https://user-images.githubusercontent.com/50002621/59831404-ebe5cb00-936b-11e9-9597-a39e4a3f1092.jpeg"},
            {"Fresh Lemon Madu", "Minuman lemon dengan madu cocok sekali untuk menjadi Mood Booster, insya Allah minumanan ini mempunyai beberapa khasiat..", "https://user-images.githubusercontent.com/50002621/59867840-7dc7f500-93b9-11e9-8ab3-9611531be31d.jpeg"},
            {"Fresh Lemon Aloevera", "Minuman segar dari lemon dicampur aloevera menyehatkan, minuman ini adalah Mood Booster!", "https://user-images.githubusercontent.com/50002621/59867842-7dc7f500-93b9-11e9-8d4b-8913b3f18358.jpeg"},
            {"Fresh Lemon Biji Selasih", "Yang satu ini segar sekali dimulut.. Campuran lemon dan selasih yang benar benar segar.. nikmati sekarang juga!", "https://user-images.githubusercontent.com/50002621/59867839-7d2f5e80-93b9-11e9-8fd9-700e42c88ab2.jpeg"},
            {"Susu botol aneka rasa", "Susu sapi segar yang kaya manfaat dengan rasa yang bermacam - macam, susu ini disukai semua kalangan usia!, pesan sekarang juga!", "https://user-images.githubusercontent.com/50002621/59867838-7d2f5e80-93b9-11e9-9e9f-e690e4b51689.jpeg"},
            {"Safana Susu Kurma", "Susu sapi segar tanpa campuranair yang nikmat dicampur dengan kurma tekstur karamel (Khalas Dates) rasa lezat dengan nutrisi yang sangat berlimpah, Insya Allah membuat kamu lebih bertenaga", "https://user-images.githubusercontent.com/50002621/59867837-7d2f5e80-93b9-11e9-8b81-28ee7fe6727c.jpeg"},
            {"Es mambo varian rasa pak", "Es mambo dari susu sapi segar tanpa campuran air.. segar rasanya, sehat didalam tubuh!", "https://user-images.githubusercontent.com/50002621/59867836-7c96c800-93b9-11e9-99bd-5859a805df9d.jpeg"},
            {"Varian rasa Lemon dari Safana", "Minuman segar dari lemon yang ditambah dengan beberapa kandungan pesan sekarang dan rasakan semua kesegarannya!", "https://user-images.githubusercontent.com/50002621/59867835-7c96c800-93b9-11e9-8f81-92de3e496ca7.jpeg"},
            {"Es mambo varian rasa", "Es seharga 2000 rupiah yang kaya akan nutrisi, segar, lezat dan murah, segara pesan dan nikmati!", "https://user-images.githubusercontent.com/50002621/59867834-7bfe3180-93b9-11e9-81ea-fec0d676819c.jpeg"},
            {"Yogurt buah", "varian terbaru Safana, yogurt segar dengan buah asli didalam dengan bermacam macam rasa dan buah.. yogurt nikmat dengan buah asli! pesan sekarang..", "https://user-images.githubusercontent.com/50002621/59868850-13fd1a80-93bc-11e9-9ae5-d8f800df2a82.jpeg"},
            {"Lemon drink original", "Minumal lemon original dari safana.. serbu sekarang jangan sampai ketinggalan.. minuman sehat dan menyegarkan", "https://user-images.githubusercontent.com/50002621/59869031-879f2780-93bc-11e9-919f-201876087295.jpeg"},

    };

    public static ArrayList<Safana> getSafanaListData(){
        Safana safana = null;
        ArrayList<Safana> list = new ArrayList<>();
        for (int i = 0; i <data.length; i++) {
            safana = new Safana();
            safana.setNama(data[i][0]);
            safana.setDetail(data[i][1]);
            safana.setPhoto(data[i][2]);
            list.add(safana);
        }

        return list;
    }
}
