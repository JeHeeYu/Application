// 패키지 이름
package com.example.baseapp;

// 관려 클래스와 인터페이스 import
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

// AppCompactActivity 클래스의 상속을 받은 main class문 
public class MainActivity extends AppCompatActivity {
    // 버튼 전역변수 선언
    Button button1;

    // 다음 메소드가 오버라이딩 되었다는 의미
    @Override
    // 오버라이딩한 onCreate 메소드 (main 함수 개념)
    protected void onCreate(Bundle savedInstanceState) {
        // Activity 클래스의 onCreate 메소드
        super.onCreate(savedInstanceState);
        // 레이아웃을 화면에 표시해 줌
        setContentView(R.layout.activity_main);

        // button1 변수에 버튼 객체 대입
        button1 = (Button) findViewById(R.id.button1);
        // 버튼 클릭 시 작동하는 클래스를 익명 내부 클래스로 정의
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // 버튼을 클릭했을 때 실제 작동하는 오버라이딩된 메소드
                Toast.makeText(getApplicationContext(), "버튼을 눌렀어요", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
