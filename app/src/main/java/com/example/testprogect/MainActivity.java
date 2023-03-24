package com.example.testprogect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView plList;
//hello
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plList = findViewById(R.id.tv_pl_names);
        //String[] names = {"БИЛЕТЫ.","", "", "Экскурсионная группа на автобус.", "Маршрут:" , " Из Горно-Алтайска в Артыбаш.","","В группе будет:", "9 взрослых,", "5 пенсионеров,", "11 детей.", "", "Взрослый билет-", "cтоит: 70 руб.","", "Детский билет-","cтоит: 35 руб.", "", "Пенсионный билет-","cтоит: 49 руб.", "" ,"Общая цена на группу: 1260 руб.", "", "Время пути - 4 часа 30 минут."};

        float price = 70;
        float salePens = 30;
        float saleChild = 50;
        float CenaPens = price - (price * salePens / 100);
        float CenaChild = price - (price * saleChild / 100);
        int men = 9;
        int child = 11;
        int pens = 5;
        float SummaGr = price * men + CenaPens * pens + CenaChild * child;


        String[] names = {"БИЛЕТ ГРУППОВОЙ ЭКСКУРСИОННЫЙ\n", "\n", "Маршрут:\n", " Горно-Алтайск -> Артыбаш\n", "\n", "Состав группы:\n", "", "Взрослых - ", String.valueOf((men)), " билетов без скидки по цене - ", String.valueOf((price)), " рублей\n\n", "Детей - ", String.valueOf((child)), " билетов со скидкой ", String.valueOf((saleChild)), "%  по цене - ", String.valueOf((CenaChild)), " рублей\n\n", "Пенсионеров - ", String.valueOf((pens)), " билетов со скидкой ", String.valueOf((salePens)), "% по цене - ", String.valueOf((CenaPens)), " рублей\n\n", "Общая стоимость билетов на группу - ", String.valueOf((SummaGr)), " рублей \n\n", "Время пути - 4 часа 30 минут."};


        plList.setText("");
        for (String name : names) {
            plList.append(name);
        }
    }
}