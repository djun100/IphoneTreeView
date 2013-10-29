package com.way.iphonetreeview;

import java.util.HashMap;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.way.iphonetreeview.IphoneTreeView.IphoneTreeHeaderAdapter;

@SuppressLint("UseSparseArrays")
public class MainActivity extends Activity {
	private LayoutInflater mInflater;
	private IphoneTreeView iphoneTreeView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
	}

	private void initView() {
		// TODO Auto-generated method stub
		mInflater = LayoutInflater.from(this);
		iphoneTreeView = (IphoneTreeView) findViewById(R.id.iphone_tree_view);
		iphoneTreeView.setHeaderView(getLayoutInflater().inflate(R.layout.iphonetreeview_list_head_view, iphoneTreeView, false));
		iphoneTreeView.setGroupIndicator(null);
		iphoneTreeView.setAdapter(new IphoneTreeViewAdapter(this,iphoneTreeView));
	}
}
