package com.se.weapp.thetimecondo;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class AnnounFragment extends Fragment {
//    @Nullable
//    ProgressDialog progress;
//    private RecyclerView mListViewmrecycle;
//    private List<ItemAnnoun> listdata;
//    private DatabaseReference myRef;
//    private FirebaseDatabase fdatabase;
//    //    private TextView title_item_announ, detail_item_announ;
////    private TextView firebase_idroom;    //รับค่า เลขห้องจากดาต้าเบส
////    private MyAdapter mAdapter;
//    private ListView mListView;
//    private CustomAdapter mAdapter;

    //แปลง activity เป็น fragment
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_announ, container, false);
//        progress = new ProgressDialog(getActivity());
//        progress.setMessage("Loading....");
//        progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
//        progress.setIndeterminate(true);
//        progress.setProgress(0);
//        progress.show();
//        mListView = (ListView) v.findViewById(R.id.listview); // new list view var.
//        fdatabase = FirebaseDatabase.getInstance();
//        showData(); // get data from firebase , make an adapter and set it up. ///
//


//ทำรูปโปรไฟล์ให้คลิกได้
        CircleImageView ccimage = (CircleImageView) v.findViewById(R.id.profile_image);
        ccimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ProfileFragment fragmentpro = new ProfileFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment, fragmentpro);
                transaction.commit();

            }

        });
        return v;
    }
//    private void showData() {
//        myRef = fdatabase.getReference("Announcement");
//        myRef.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                List<ItemAnnoun> posts = new ArrayList<>();
//                for (DataSnapshot postSnapshot: dataSnapshot.getChildren()) { // loop out all of child value and put it in list//
//                    ItemAnnoun item = new ItemAnnoun();
//                    item = postSnapshot.getValue(ItemAnnoun.class);
//                    posts.add(item);
//                }
//                mAdapter = new CustomAdapter(getActivity(), posts);
//                mListView.setAdapter(mAdapter);
//                progress.dismiss();
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });
//    }
}


