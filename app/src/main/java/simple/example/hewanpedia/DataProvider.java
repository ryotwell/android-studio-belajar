package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Anjing;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();

        kucings.add(new Kucing(
                "Angora",
                "Argentina",
                "Pemecah Rekor: Messi telah memecahkan banyak rekor sepak bola, termasuk sebagai pencetak gol terbanyak sepanjang masa di Barcelona.\n",
                R.drawable.messi_1));

        kucings.add(new Kucing(
                "Angora",
                "Argentina",
                "Kreativitas yang Luar Biasa: Keahlian Messi dalam menciptakan peluang gol dari situasi yang sulit adalah sesuatu yang luar biasa.",
                R.drawable.messi_2));

        kucings.add(new Kucing(
                "Angora",
                "Argentina",
                "Kecepatan dan Kelincahan: Meski tidak memiliki postur besar, Messi memiliki kecepatan dan kelincahan yang luar biasa di lapangan.",
                R.drawable.messi_3));

        kucings.add(new Kucing(
                "Angora",
                "Argentina",
                "Teknik Tinggi: Kemampuan dribbling, kontrol bola, dan tendangan Messi adalah yang terbaik di dunia.",
                R.drawable.messi_4));

        kucings.add(new Kucing(
                "Angora",
                "Argentina",
                "Kepemimpinan yang Tenang: Messi terkenal dengan kepemimpinan yang tenang dan pengaruh positifnya di dalam dan di luar lapangan.",
                R.drawable.messi_5));

        kucings.add(new Kucing(
                "Angora",
                "Argentina",
                "Komitmen terhadap Olahraga: Selain bakatnya yang luar biasa, Messi juga dikenal karena dedikasinya yang tinggi terhadap latihan dan permainan sepak bola.",
                R.drawable.messi_6));

        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing(
                "Bulldog",
                "Portugal",
                "Atletik yang Luar Biasa: Ronaldo dikenal karena kekuatan fisiknya yang luar biasa, ditambah dengan kecepatan dan kelincahan yang memukau.",
                R.drawable.ronaldo_1));

        anjings.add(new Anjing(
                "Bulldog",
                "Portugal",
                "Kemampuan Lompatan: Kemampuan Ronaldo dalam bermain di udara membuatnya menjadi ancaman besar dalam set-piece dan serangan udara.",
                R.drawable.ronaldo_2));

        anjings.add(new Anjing(
                "Bulldog",
                "Portugal",
                "Pencetak Gol Ulung: Ronaldo memiliki insting gol yang luar biasa, dengan catatan pencetak gol yang mengesankan di berbagai klub dan timnasnya.",
                R.drawable.ronaldo_3));

        anjings.add(new Anjing(
                "Bulldog",
                "Portugal",
                "Karakter Kompotitif: Ronaldo adalah pesaing yang tangguh dan selalu memberikan yang terbaik di setiap pertandingan, mencerminkan ambisinya untuk menjadi yang terbaik.",
                R.drawable.ronaldo_4));

        anjings.add(new Anjing(
                "Bulldog",
                "Portugal",
                "Kemampuan Teknis yang Hebat: Dribbling, tendangan bebas, dan kemampuan mengoper Ronaldo sangat mengesankan, menunjukkan kualitas teknisnya yang tinggi.",
                R.drawable.ronaldo_5));

        anjings.add(new Anjing(
                "Bulldog",
                "Portugal",
                "Kepemimpinan di Lapangan: Ronaldo tidak hanya menjadi inspirasi bagi rekan-rekannya, tetapi juga memiliki kemampuan memimpin tim dalam momen-momen penting.",
                R.drawable.ronaldo_6));


        return anjings;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
