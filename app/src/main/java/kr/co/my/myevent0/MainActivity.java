package kr.co.my.myevent0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener { // View.OnClickListener 구현을 선언
        EditText txtbirthdate;
        Button showbio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 개발자가 추가
        ShowComponet();
    }

    public void ShowComponet() {
        //layout에 있는 컴포넌트 객체 생성
        txtbirthdate = findViewById(R.id.thtbirthdate);
        showbio = findViewById(R.id.showbio); // 이벤트 소스, 버튼  컴포넌트 객체 생성
        //OnClickListener를 구현한 이벤트 핸들러 객체 - this
        showbio.setOnClickListener(this); //이벤트 핸들러 객체 등록
    }

    @Override           //이벤트 핸들러 메서드 구현
    public void onClick(View v) {
        if(v==showbio){
            String st = String.format("오늘은 %s다.",new Date()); //showbio 클릭시 오늘날짜를 txtbirthdate에 표시
            txtbirthdate.setText(st);
            //this.txtbirthdate.setText(st); 사용가능
            Toast.makeText(getBaseContext(),st,Toast.LENGTH_LONG).show();
        }

    }
}