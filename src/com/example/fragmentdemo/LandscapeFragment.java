package com.example.fragmentdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class LandscapeFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater layoutInflater,
			ViewGroup container, Bundle savedInstanceState) {
	
		View view = layoutInflater.inflate(R.layout.landscape_fragment,
				container, false);
		return view;
		
	}
}
