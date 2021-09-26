package com.example.infogram.View.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.infogram.R;
import com.example.infogram.adapter.CardViewAdapter;
import com.example.infogram.model.Image;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        //toolbar
        showToolBar(getString(R.string.title_home_fragment),false,view);

        //recycleview
        RecyclerView recyclerView = view.findViewById(R.id.recycle_view);

        //layoud manager
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        //el adapter
        CardViewAdapter cardViewAdapter = new CardViewAdapter(buidImages(),R.layout.cardview_image,getActivity());
        recyclerView.setAdapter(cardViewAdapter);

        return view;
    }

    public void showToolBar(String titulo, boolean botonSubir , View view){

        Toolbar toolbar = view.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(titulo);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(botonSubir);
    }

    //creamos la lista de imagenes
    public ArrayList<Image> buidImages(){
        ArrayList<Image> images = new ArrayList<>();

        images.add(new Image("https://wallpapercave.com/wp/wp2532627.jpg","Daniel Rojas","2 dias","1 me gusta"));
        images.add(new Image("https://www.pruebaderuta.com/wp-content/uploads/2015/08/NISSAN-Skyline-GTR-620x264.jpg","Wiber Luis","3 dias","5 me gusta"));
        images.add(new Image("https://images1.autocasion.com/unsafe/900x600/actualidad/wp-content/uploads/2016/12/f-1.jpg","David Quevedo","6 dias","4 me gusta"));
        images.add(new Image("https://www.toyota.com/imgix/content/dam/toyota/jellies/max/2022/grsupra/a91cfedition/2378/a99/2.png","Jose Maria","5 dias","6 me gusta"));
        images.add(new Image("https://www.diariomotor.com/imagenes/picscache/1440x655c/porsche-911-turbo-s-vs-nissan-gt-r-mapdm56_1440x655c.jpg","Wilson Angel","3 dias","2 me gusta"));
        images.add(new Image("https://img.autocosmos.com/noticias/fotosprinc/NAZ_c858d867b0f0466389c942beb514a81e.jpg","Alexa Mora","4 dias","5 me gusta"));
        images.add(new Image("https://es.nissanusa.com/content/dam/Nissan/us/vehicles/gtr/2021/overview/2021-nissan-gtr-supercar.jpg","Maria Rojas","2 dias","3 me gusta"));
        images.add(new Image("https://img.freepik.com/free-vector/colorful-palm-silhouettes-background_23-2148541792.jpg","Noelia Tapia","2 dias","8 me gusta"));
        images.add(new Image("https://www.androidguys.com/wp-content/uploads/2016/01/Wave-Wallpapers-1.jpg","Andres Laura","6 dias","3 me gusta"));
        images.add(new Image("https://areajugones.sport.es/wp-content/uploads/2020/04/the-last-of-part-2-wallpaper-desktop-1.jpg","Luisa Garcia","9 dias","1 me gusta"));
        return images;
    }
}