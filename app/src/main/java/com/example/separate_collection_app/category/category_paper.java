package com.example.separate_collection_app.category;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.separate_collection_app.Activity.MainActivity;
import com.example.separate_collection_app.R;
import com.example.separate_collection_app.Select_paper.category_flyer;
import com.example.separate_collection_app.Select_paper.category_milk_pack;
import com.example.separate_collection_app.Select_paper.category_noodle_container;
import com.example.separate_collection_app.Select_paper.category_note;
import com.example.separate_collection_app.Select_paper.category_paper_bag;
import com.example.separate_collection_app.Select_paper.category_receipt;
import com.example.separate_collection_app.Select_paper.category_snack_box;
import com.example.separate_collection_app.Select_paper.category_wood_chopsticks;

public class category_paper extends Fragment {

    Button back_BT;
    Button snack_box_BT,wood_chopsticks_BT,note_BT,receipt_BT,milk_pack_BT,flyer_BT,paper_bag_BT,noodle_container_BT;

    public static category_paper newInstance(){
        return new category_paper();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_category_paper, null);

        back_BT = (Button)v.findViewById(R.id.bt_back);
        snack_box_BT = (Button)v.findViewById(R.id.snack_box_bt);
        wood_chopsticks_BT = (Button)v.findViewById(R.id.wood_chopsticks_bt);
        note_BT = (Button)v.findViewById(R.id.note_bt);
        receipt_BT = (Button)v.findViewById(R.id.receipt_bt);
        milk_pack_BT = (Button)v.findViewById(R.id.milk_pack_bt);
        flyer_BT = (Button)v.findViewById(R.id.flyer_bt);
        paper_bag_BT = (Button)v.findViewById(R.id.paper_bag_bt);
        noodle_container_BT = (Button)v.findViewById(R.id.noodle_container_bt);

        back_BT.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().remove(category_paper.this).commit();
                fragmentManager.popBackStack();

            }
        });

        snack_box_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_snack_box.newInstance());
            }
        });

        wood_chopsticks_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_wood_chopsticks.newInstance());
            }
        });

        note_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_note.newInstance());
            }
        });

        receipt_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_receipt.newInstance());
            }
        });

        milk_pack_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_milk_pack.newInstance());
            }
        });

        flyer_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_flyer.newInstance());
            }
        });

        paper_bag_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_paper_bag.newInstance());
            }
        });

        noodle_container_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_noodle_container.newInstance());
            }
        });

        return v;
    }

}
