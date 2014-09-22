package com.jayway.lab.gradle_lab;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.jayway.lab.gradle_lab.lib.LibActivity;
import com.jayway.labs.gradle.supermath.Adder;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		showAddition();
	}

	private void showAddition() {
		Adder adder = new Adder();
		Random random = new Random();
		int i1 = random.nextInt(100);
		int i2 = random.nextInt(100);
		int i3 = random.nextInt(100);
		int sum = adder.add(i1, i2, i3);
		TextView textView = (TextView) findViewById(R.id.addition);
		textView.setText(i1 + " + " + i2 + " + " + i3 + " = " + sum);
	}

	public void onStartLibActivity(View view) {
		startActivity(new Intent(this, LibActivity.class));
	}
}
