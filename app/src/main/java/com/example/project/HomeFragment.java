package com.example.project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;
    private BookAdapter adapter;
    private ArrayList<Book> bookList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new BookAdapter(bookList, getContext());
        recyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bookList.add(new Book("Reinas de leyenda", "Cristina Morató", "https://imagessl0.casadellibro.com/a/l/t7/40/9788401032140.jpg"));
        bookList.add(new Book("Hábitos atómicos", "James Clear", "https://imagessl7.casadellibro.com/a/l/t7/87/9788418118887.jpg"));
        bookList.add(new Book("La armadura de la luz", "Ken Follet", "https://imagessl5.casadellibro.com/a/l/t7/35/9788401032135.jpg"));
        bookList.add(new Book("Maldita Roma", "Santiago Posteguillo", "https://imagessl7.casadellibro.com/a/l/t7/27/9788466676527.jpg"));
        bookList.add(new Book("Cómo hacer que te pasen cosas buenas", "Marian Rojas Estapé", "https://imagessl2.casadellibro.com/a/l/t7/42/9788467053422.jpg"));
        adapter.notifyDataSetChanged();
    }
}
