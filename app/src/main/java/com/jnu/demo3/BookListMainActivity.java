package com.jnu.demo3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class BookListMainActivity extends AppCompatActivity {

    private final ArrayList<Book> BookList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list_main);
        BookList.add(new Book("软件项目管理案例教程（第4版）", R.drawable.book_2));
        BookList.add(new Book("创新工程实践", R.drawable.book_no_name));
        BookList.add(new Book("信息安全数学基础（第2版）", R.drawable.book_1));

        RecyclerView recyclerViewMain=findViewById(R.id.recycle_view_books);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewMain.setLayoutManager(linearLayoutManager);

        BookAdapter bookAdapter=new BookAdapter(BookList);
        recyclerViewMain.setAdapter(bookAdapter);
    }
}