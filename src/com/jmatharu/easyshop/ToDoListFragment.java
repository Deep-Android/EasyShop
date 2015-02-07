package com.jmatharu.easyshop;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ToDoListFragment extends Fragment {

	public ToDoListFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_to_do_list,
				container, false);
		return rootView;
	}

	public void onCreate(Bundle savedInstanceState, View view) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onViewCreated(view, savedInstanceState);
		final TextView tvTodo1 = (TextView) view.findViewById(R.id.tVToDo1);
		final TextView tvTodo2 = (TextView) view.findViewById(R.id.tVToDo2);
		final EditText eTToDo = (EditText) view.findViewById(R.id.eTToDo);
		Button btToDo = (Button) view.findViewById(R.id.button1);

		btToDo.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String eTString = eTToDo.getText().toString();
				if (tvTodo1.getText().toString().equals("")) {
					tvTodo1.setText(eTString);	
				} else if (tvTodo2.getText().toString().equals("")) {
					tvTodo2.setText(eTString);
				} 				
			}
		});
	}

}
