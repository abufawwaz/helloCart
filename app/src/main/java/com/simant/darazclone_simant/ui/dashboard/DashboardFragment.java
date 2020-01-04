package com.simant.darazclone_simant.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.simant.darazclone_simant.AdapterClass.FlashAdapter;
import com.simant.darazclone_simant.ModalClass.FlashModalClass;
import com.simant.darazclone_simant.R;

import java.util.ArrayList;
import java.util.List;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;
    RecyclerView recyclerView_flash;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);

        // rcyclerview code for flash sale
        recyclerView_flash = root.findViewById(R.id.flashRecycler);
        // Data listing through Arraylist
        List<FlashModalClass> contactsList = new ArrayList<>();
        contactsList.add(new FlashModalClass(R.drawable.sample_image_one_flash, "1,200", "12 Sold"));
        contactsList.add(new FlashModalClass(R.drawable.sample_image_two_flash, "300", "18 Sold"));
        contactsList.add(new FlashModalClass(R.drawable.sample_image_three_flash, "2,000", "20 Sold"));

        // Flash Sale Set Adapter
        FlashAdapter FlashAdapter = new FlashAdapter(getActivity(), contactsList);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView_flash.setLayoutManager(layoutManager);
        recyclerView_flash.setHasFixedSize(true);
        recyclerView_flash.setAdapter(FlashAdapter);

        // JSON PARSE


        return root;
    }
}