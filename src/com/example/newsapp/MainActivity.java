package com.example.newsapp;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import android.R.xml;
import android.app.Activity;
import android.os.Bundle;
import android.util.Xml;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends Activity {
	ArrayList<NewsXML> newsitem = new ArrayList<NewsXML>();
	String path = "http://192.168.1.3:8080/news.xml";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ListView listview = (ListView) findViewById(R.id.listview);
		InitData();
	}

	private void InitData() {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					URL url = new URL(path);
					HttpURLConnection content = (HttpURLConnection) url.openConnection();
					content.setRequestMethod("GET");
					content.setConnectTimeout(1000*5);
					if(content.getResponseCode()==200) {
						InputStream inputStream = content.getInputStream();
						XmlPullParser newPullParser = Xml.newPullParser();
						newPullParser.setInput(inputStream, "utf-8");
						int eventType = newPullParser.getEventType();
						
					}
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (XmlPullParserException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
	}

}
