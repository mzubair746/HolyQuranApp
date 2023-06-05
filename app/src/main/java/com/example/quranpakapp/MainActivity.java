package com.example.quranpakapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list;
        String[] urduSurahNames = {
                "Al-Fatihah",
                "Al-Baqara ",
                "Al-i'Imran ",
                "An-Nisaa ",
                "Al-Maidah ",
                "Al-An'am ",
                "Al-A'raf ",
                "Al-Anfal ",
                "At-Tauba ",
                "Yunus ",
                "Hud ",
                "Yusuf ",
                "Ar-Ra'd ",
                "Ibrahim ",
                "Al-Hijr ",
                "An-Nahl ",
                "Al-Israa ",
                "Al-Kahf ",
                "Maryam ",
                "Ta-ha ",
                "Al-Anbiyaa ",
                "Al-Hajj ",
                "Al-Muminun ",
                "An-Nur ",
                "Al-Furqan ",
                "Ash-Shu'araa ",
                "An-Naml ",
                "Al-Qasas ",
                "Al-Ankabut ",
                "Ar-Rum ",
                "Luqman ",
                "As-Sajda ",
                "Al-Ahzab ",
                "Saba ",
                "Fatir ",
                "Ya-Sin ",
                "As-Saffat ",
                "Sad ",
                "Az-Zumar ",
                "Al-Mu'min ",
                "Ha-Mim ",
                "Ash-Shura ",
                "Az-Zukhruf ",
                "Ad-Dukhan ",
                "Al-Jathiya ",
                "Al-Ahqaf ",
                "Muhammad ",
                "Al-Fat-h ",
                "Al-Hujurat ",
                "Qaf ",
                "Az-Zariyat ",
                "At-Tur ",
                "An-Najm ",
                "Al-Qamar ",
                "Ar-Rahman ",
                "Al-Waqi'a ",
                "Al-Hadid ",
                "Al-Mujadila ",
                "Al-Hashr ",
                "Al-Mumtahana ",
                "As-Saff ",
                "Al-Jumu'a ",
                "Al-Munafiqun ",
                "At-Tagabun ",
                "At-Talaq ",
                "At-Tahrim ",
                "Al-Mulk ",
                "Al-Qalam ",
                "Al-Haqqa ",
                "Al-Ma'arij ",
                "Nuh ",
                "Al-Jinn ",
                "Al-Muzzammil ",
                "Al-Muddathth ",
                "Al-Qiyamat ",
                "Ad-Dahr ",
                "Al-Mursalat ",
                "An-Nabaa ",
                "An-Nazi'at ",
                "Abasa ",
                "At-Takwir ",
                "Al-Infitar ",
                "Al-Mutaffife ",
                "Al-Inshiqaq ",
                "Al-Buruj ",
                "At-Tariq ",
                "Al-A'la ",
                "Al-Gashiya ",
                "Al-Fajr ",
                "Al-Balad ",
                "Ash-Shams ",
                "Al-Lail ",
                "Adh-Dhuha ",
                "Al-Sharh ",
                "At-Tin ",
                "Al-Alaq ",
                "Al-Qadr ",
                "Al-Baiyina ",
                "Al-Zalzalah ",
                "Al-Adiyat ",
                "Al-Qari'a ",
                "At-Takathur ",
                "Al-Asr ",
                "Al-Humaza ",
                "Al-Fil ",
                "Quraish ",
                "Al-Ma'un ",
                "Al-Kauthar ",
                "Al-Kafirun ",
                "An-Nasr ",
                "Al-Lahab ",
                "Al-Ikhlas ",
                "Al-Falaq ",
                "Al-Nas ",
        };
        list = findViewById(R.id.listV);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,urduSurahNames);
        list.setAdapter(adapter);

        Intent intent = new Intent(this,MainActivity2.class);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int start_ayat = getSurahStart(i);
                int end_ayat =  getSurahStart(i+1);

                intent.putExtra("Start", start_ayat);
                intent.putExtra("End", end_ayat);

                startActivity(intent);
            }
        });
    }
    public int getSurahStart(int surahNumber) {
        int[] SSP = {
                1,
                8,
                295,
                496,
                673,
                794,
                960,
                1167,
                1243,
                1372,
                1482,
                1606,
                1718,
                1762,
                1815,
                1915,
                2044,
                2156,
                2267,
                2366,
                2502,
                2615,
                2694,
                2813,
                2878,
                2956,
                3184,
                3278,
                3367,
                3437,
                3498,
                3533,
                3564,
                3638,
                3693,
                3739,
                3823,
                4006,
                4095,
                4171,
                4257,
                4312,
                4366,
                4456,
                4516,
                4554,
                4590,
                4629,
                4659,
                4678,
                4724,
                4785,
                4835,
                4898,
                4954,
                5033,
                5130,
                5160,
                5183,
                5208,
                5222,
                5237,
                5249,
                5261,
                5280,
                5293,
                5306,
                5337,
                5390,
                5443,
                5488,
                5517,
                5546,
                5567,
                5624,
                5665,
                5697,
                5748,
                5789,
                5836,
                5879,
                5909,
                5929,
                5966,
                5992,
                6015,
                6033,
                6053,
                6080,
                6111,
                6132,
                6148,
                6170,
                6182,
                6191,
                6200,
                6220,
                6226,
                6235,
                6244,
                6256,
                6268,
                6277,
                6281,
                6291,
                6297,
                6302,
                6310,
                6314,
                6321,
                6325,
                6331,
                6336,
                6342,
        };
        if(surahNumber == 114)
        {
            return 6349;
        }
        return SSP[surahNumber];
    }

}