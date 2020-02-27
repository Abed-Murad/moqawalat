package com.am.moqawalat;

import android.content.Context;
import android.os.Bundle;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.am.moqawalat.Aadapter.SpcAdvDetAdapter;
import com.am.moqawalat.model.SpcAdvDetail;
import com.am.moqawalat.utils.Tools;
import com.beloo.widget.chipslayoutmanager.SpacingItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class SpecialAdsActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<SpcAdvDetail> lstAds;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.special_ads_details_layout);
        recyclerView = findViewById(R.id.spc_adv_detail_rv);
        recyclerView.addItemDecoration(new SpacingItemDecoration(2, Tools.dpToPx(this, 3)));
        recyclerView.setHasFixedSize(true);
        lstAds = new ArrayList<>();
        lstAds.add(new SpcAdvDetail(1, "0599746197", "aa", "", "13.12.11", R.drawable.main_image));
        lstAds.add(new SpcAdvDetail(1, "0599746197", "aa", "", "13.12.11", R.drawable.main_image));
        lstAds.add(new SpcAdvDetail(1, "0599746197", "aa", "", "13.12.11", R.drawable.main_image));
        lstAds.add(new SpcAdvDetail(1, "0599746197", "aa", "", "13.12.11", R.drawable.main_image));
        lstAds.add(new SpcAdvDetail(1, "0599746197", "aa", "", "13.12.11", R.drawable.main_image));
        lstAds.add(new SpcAdvDetail(1, "0599746197", "aa", "", "13.12.11", R.drawable.main_image));
        lstAds.add(new SpcAdvDetail(1, "0599746197", "aaa", "", "13.12.11", R.drawable.main_image));

        SpcAdvDetAdapter spcAdvDetAdapter = new SpcAdvDetAdapter(this, lstAds);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(spcAdvDetAdapter);

    }


}
