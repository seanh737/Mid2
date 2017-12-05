package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean c = false;
    public final static int FUNC3_BACK = 3 ;
    public final static int FUNC7_BACK = 7 ;
    public final static int FUNC8_BACK = 8 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == FUNC3_BACK){
            Toast.makeText(this , "特殊功能" , Toast.LENGTH_LONG).show();
        }else if(requestCode == FUNC7_BACK){
            Toast.makeText(this , "特殊功能" , Toast.LENGTH_LONG).show();
        }else if(requestCode == FUNC8_BACK){
            Toast.makeText(this , "特殊功能" , Toast.LENGTH_LONG).show();
        }else{
            finish();
        }
    }
    public void intent1 (View view){
        if(!c){
            Intent intent = new Intent(this,Func1Activity.class);
            startActivity(intent);
        }

    }
    public void intent2 (View view){
        if(!c){
            Intent intent = new Intent(this,Func2Activity.class);
            startActivity(intent);
        }


    }
    public void intent3 (View view){
        if(!c){
            Intent intent = new Intent(this,Func3Activity.class);
//            startActivity(intent);
            startActivityForResult(intent , FUNC3_BACK);

        }

    }
    public void intent4 (View view){
        if(!c){
            Intent intent = new Intent(this,Func4Activity.class);
            startActivity(intent);
        }

    }
    public void intent5 (View view){
        if(!c){
            Intent intent = new Intent(this,Func5Activity.class);
            startActivity(intent);
        }

    }
    public void intent6 (View view){
        if(!c){
            Intent intent = new Intent(this,Func6Activity.class);
            startActivity(intent);
        }

    }
    public void intent7 (View view){
        if(!c){
            Intent intent = new Intent(this,Func7Activity.class);
//            startActivity(intent);
            startActivityForResult(intent , FUNC7_BACK);
        }

    }
    public void intent8 (View view){
        if(!c){
            Intent intent = new Intent(this,Func8Activity.class);
//            startActivity(intent);
            startActivityForResult(intent , FUNC8_BACK);
        }

    }


}
