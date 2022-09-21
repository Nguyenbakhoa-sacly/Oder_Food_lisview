package com.example.oder_food;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {
    ListView list_food;
    ArrayList<item_food> array_food;
    item_adapter_food adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Controls();
        adapter = new item_adapter_food(this,R.layout.dong_food,array_food);
        list_food.setAdapter(adapter);

        list_food.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(new Intent(MainActivity.this,detail_food.class));
            }
        });

        list_food.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this, android.R.style.Theme_DeviceDefault_Light_Dialog);
                builder.setTitle("Bạn có muốn xóa không");
                builder.setMessage("Hãy lựa chọn bên dưới để xác nhận");
                int vitri = i;
                builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        array_food.remove(vitri);
                        adapter.notifyDataSetChanged();
                    }
                });
                builder.setNegativeButton("không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                builder.show();
                return false;
            }
        });
    }


    private void Controls() {
        list_food = (ListView) findViewById(R.id.list_food);
        array_food = new ArrayList<>();
        array_food.add(new item_food("Nguyễn bá khoa","MSV 2050531200215", R.drawable.meme1));
        array_food.add(new item_food("Thịt bò với khoai","Imormation Of item1", R.drawable.meme2));
        array_food.add(new item_food("Thịt bò xào tỏi","Imormation Of item1", R.drawable.meme3));
        array_food.add(new item_food("Tôm chiên bơ","Imormation Of item1", R.drawable.meme4));
        array_food.add(new item_food("Thịt lớn sốt cà chua","Imormation Of item1", R.drawable.meme5));
        array_food.add(new item_food("Thịt lớn sốt cà chua","Imormation Of item1", R.drawable.meme5));
        array_food.add(new item_food("Thịt lớn sốt cà chua","Imormation Of item1", R.drawable.meme5));
        array_food.add(new item_food("Thịt lớn sốt cà chua","Imormation Of item1", R.drawable.meme5));
        array_food.add(new item_food("Thịt lớn sốt cà chua","Imormation Of item1", R.drawable.meme5));
        array_food.add(new item_food("Thịt lớn sốt cà chua","Imormation Of item1", R.drawable.meme5));
        array_food.add(new item_food("Thịt lớn sốt cà chua","Imormation Of item1", R.drawable.meme5));
        array_food.add(new item_food("Thịt lớn sốt cà chua","Imormation Of item1", R.drawable.meme5));
        array_food.add(new item_food("Thịt lớn sốt cà chua","Imormation Of item1", R.drawable.meme5));
        array_food.add(new item_food("Thịt lớn sốt cà chua","Imormation Of item1", R.drawable.meme5));
    }

}