package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvItemListView;
    CustomeItemListViewAdapter adapter;
    ArrayList<ItemListView> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItemListView = findViewById(R.id.lvItemListView);

        arrayList = new ArrayList<>();
        arrayList.add(
                new ItemListView("Ca nấu mì, nấu mì mini...",
                        "Shop Devang", R.drawable.canaulau));
        arrayList.add(
                new ItemListView("1KG KHÔ GÀ BƠ TỎI...",
                        "Shop LTD Food", R.drawable.gabotoi));
        arrayList.add(
                new ItemListView("Xe cần cẩu đa năng",
                        "Shop Thế giới đồ chơi", R.drawable.xecancau));
        arrayList.add(
                new ItemListView("Đồ chơi dạng mô hình",
                        "Shop Thế giới đồ chơi", R.drawable.dochoidangmohinh));
        arrayList.add(
                new ItemListView("Lãnh đạo đơn giản",
                        "Shop Minh Long Book", R.drawable.lanhdaodongian));
        arrayList.add(
                new ItemListView("Hiểu lòng con trẻ",
                        "Shop Minh Long Book", R.drawable.hieulongcontre));
        arrayList.add(
                new ItemListView("Donal Trump thiên tài lãnh đạo",
                        "Shop Minh Long Book", R.drawable.trump));
        adapter = new CustomeItemListViewAdapter(this, R.layout.item_listview, arrayList);

        lvItemListView.setAdapter(adapter);
    }
}