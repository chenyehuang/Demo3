package com.jnu.demo3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder> {
    private ArrayList<Book> BookList;

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;
        private final ImageView imageViewImage;

        public ViewHolder(View view) {
            super(view);
            imageViewImage = view.findViewById(R.id.image_view_book_cover);
            textView = view.findViewById(R.id.text_view_book_title);
        }
        public TextView getTextView() {
            return this.textView;
        }

        public ImageView getImageViewImage() {
            return imageViewImage;
        }
    }
    //析构函数
    public BookAdapter(ArrayList<Book> dataSet) {
        BookList = dataSet;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_main, viewGroup, false);

        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        viewHolder.getTextView().setText(BookList.get(position).getTitle());
        viewHolder.getImageViewImage().setImageResource(BookList.get(position).getCoverResourceId());
//        Book book = BookList.get(position);
//        viewHolder.imageViewImage.setImageResource(book.getCoverResourceId());
//        viewHolder.textView.setText(book.getTitle());
    }
    @Override
    public int getItemCount() {
        return BookList.size();
    }
}
