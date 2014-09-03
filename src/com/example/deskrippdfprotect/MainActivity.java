package com.example.deskrippdfprotect;

import java.io.FileOutputStream;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Build;

public class MainActivity extends Activity {
	String pdfenc = "/sdcard/data/hasilenc.pdf";
    String pdfdesk = "/sdcard/data/hasildesk.pdf";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button desk = (Button)findViewById(R.id.button1);
		desk.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try{
       
			        PdfReader bukapdf = new PdfReader(pdfenc,"12345".getBytes());
			        PdfStamper stam = new PdfStamper(bukapdf, new FileOutputStream(pdfdesk));
			        stam.close();
			        bukapdf.close();
			        
			        } catch (Exception e) {
			            
			        }
			}
		});
		
		
	}

	
}
